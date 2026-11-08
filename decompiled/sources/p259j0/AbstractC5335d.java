package p259j0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* renamed from: j0.d */
/* loaded from: classes.dex */
public abstract class AbstractC5335d {

    /* renamed from: a */
    public static final byte[] f18818a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final String[] f18819b = {StringUtils.EMPTY, "A", "B", "C"};

    /* renamed from: a */
    public static String m21808a(int i7, int i8, int i9) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9));
    }

    /* renamed from: b */
    public static List m21809b(boolean z6) {
        return Collections.singletonList(z6 ? new byte[]{1} : new byte[]{0});
    }

    /* renamed from: c */
    public static String m21810c(int i7, boolean z6, int i8, int i9, int[] iArr, int i10) {
        StringBuilder sb = new StringBuilder(AbstractC5330M.m21685H("hvc1.%s%d.%X.%c%d", f18819b[i7], Integer.valueOf(i8), Integer.valueOf(i9), Character.valueOf(z6 ? 'H' : 'L'), Integer.valueOf(i10)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i11 = 0; i11 < length; i11++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i11])));
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static byte[] m21811d(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = f18818a;
        byte[] bArr3 = new byte[bArr2.length + i8];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i7, bArr3, bArr2.length, i8);
        return bArr3;
    }

    /* renamed from: e */
    public static int m21812e(byte[] bArr, int i7) {
        int length = bArr.length - f18818a.length;
        while (i7 <= length) {
            if (m21814g(bArr, i7)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: f */
    public static Pair m21813f(byte[] bArr) {
        boolean z6;
        C5357z c5357z = new C5357z(bArr);
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int i9 = i8 + 3;
            if (i9 >= bArr.length) {
                z6 = false;
                break;
            }
            if (c5357z.m21929J() == 1 && (bArr[i9] & 240) == 32) {
                z6 = true;
                break;
            }
            c5357z.m21939T(c5357z.m21947f() - 2);
            i8++;
        }
        AbstractC5332a.m21797b(z6, "Invalid input: VOL not found.");
        C5356y c5356y = new C5356y(bArr);
        c5356y.m21918r((i8 + 4) * 8);
        c5356y.m21918r(1);
        c5356y.m21918r(8);
        if (c5356y.m21907g()) {
            c5356y.m21918r(4);
            c5356y.m21918r(3);
        }
        if (c5356y.m21908h(4) == 15) {
            c5356y.m21918r(8);
            c5356y.m21918r(8);
        }
        if (c5356y.m21907g()) {
            c5356y.m21918r(2);
            c5356y.m21918r(1);
            if (c5356y.m21907g()) {
                c5356y.m21918r(79);
            }
        }
        AbstractC5332a.m21797b(c5356y.m21908h(2) == 0, "Only supports rectangular video object layer shape.");
        AbstractC5332a.m21796a(c5356y.m21907g());
        int m21908h = c5356y.m21908h(16);
        AbstractC5332a.m21796a(c5356y.m21907g());
        if (c5356y.m21907g()) {
            AbstractC5332a.m21796a(m21908h > 0);
            for (int i10 = m21908h - 1; i10 > 0; i10 >>= 1) {
                i7++;
            }
            c5356y.m21918r(i7);
        }
        AbstractC5332a.m21796a(c5356y.m21907g());
        int m21908h2 = c5356y.m21908h(13);
        AbstractC5332a.m21796a(c5356y.m21907g());
        int m21908h3 = c5356y.m21908h(13);
        AbstractC5332a.m21796a(c5356y.m21907g());
        c5356y.m21918r(1);
        return Pair.create(Integer.valueOf(m21908h2), Integer.valueOf(m21908h3));
    }

    /* renamed from: g */
    public static boolean m21814g(byte[] bArr, int i7) {
        if (bArr.length - i7 <= f18818a.length) {
            return false;
        }
        int i8 = 0;
        while (true) {
            byte[] bArr2 = f18818a;
            if (i8 >= bArr2.length) {
                return true;
            }
            if (bArr[i7 + i8] != bArr2[i8]) {
                return false;
            }
            i8++;
        }
    }

    /* renamed from: h */
    public static Pair m21815h(byte[] bArr) {
        C5357z c5357z = new C5357z(bArr);
        c5357z.m21939T(9);
        int m21926G = c5357z.m21926G();
        c5357z.m21939T(20);
        return Pair.create(Integer.valueOf(c5357z.m21930K()), Integer.valueOf(m21926G));
    }

    /* renamed from: i */
    public static boolean m21816i(List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    /* renamed from: j */
    public static byte[][] m21817j(byte[] bArr) {
        if (!m21814g(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i7 = 0;
        do {
            arrayList.add(Integer.valueOf(i7));
            i7 = m21812e(bArr, i7 + f18818a.length);
        } while (i7 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i8 = 0;
        while (i8 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i8)).intValue();
            int intValue2 = (i8 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i8 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i8] = bArr3;
            i8++;
        }
        return bArr2;
    }
}
