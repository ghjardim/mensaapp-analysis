package p253i5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import p171Y2.AbstractC2922e;
import p186a3.AbstractC3106a;
import p237g5.AbstractC4412M;
import p237g5.C4424Z;

/* renamed from: i5.T0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4583T0 {

    /* renamed from: a */
    public static final Logger f16641a = Logger.getLogger(AbstractC4583T0.class.getName());

    /* renamed from: b */
    public static final byte[] f16642b = "-bin".getBytes(AbstractC2922e.f9008a);

    /* renamed from: a */
    public static boolean m19661a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i7 = length; i7 < bArr.length; i7++) {
            if (bArr[i7] != bArr2[i7 - length]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m19662b(byte[] bArr) {
        for (byte b7 : bArr) {
            if (b7 < 32 || b7 > 126) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static byte[][] m19663c(byte[][] bArr, int i7) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i8 = 0; i8 < i7; i8++) {
            arrayList.add(bArr[i8]);
        }
        while (i7 < bArr.length) {
            byte[] bArr2 = bArr[i7];
            byte[] bArr3 = bArr[i7 + 1];
            if (m19661a(bArr2, f16642b)) {
                int i9 = 0;
                for (int i10 = 0; i10 <= bArr3.length; i10++) {
                    if (i10 == bArr3.length || bArr3[i10] == 44) {
                        byte[] m11331b = AbstractC3106a.m11329a().m11331b(new String(bArr3, i9, i10 - i9, AbstractC2922e.f9008a));
                        arrayList.add(bArr2);
                        arrayList.add(m11331b);
                        i9 = i10 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            i7 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    /* renamed from: d */
    public static byte[][] m19664d(C4424Z c4424z) {
        byte[][] m18674d = AbstractC4412M.m18674d(c4424z);
        if (m18674d == null) {
            return new byte[0][];
        }
        int i7 = 0;
        for (int i8 = 0; i8 < m18674d.length; i8 += 2) {
            byte[] bArr = m18674d[i8];
            byte[] bArr2 = m18674d[i8 + 1];
            if (m19661a(bArr, f16642b)) {
                m18674d[i7] = bArr;
                m18674d[i7 + 1] = AbstractC4412M.f15635b.m11334e(bArr2).getBytes(AbstractC2922e.f9008a);
            } else if (m19662b(bArr2)) {
                m18674d[i7] = bArr;
                m18674d[i7 + 1] = bArr2;
            } else {
                String str = new String(bArr, AbstractC2922e.f9008a);
                f16641a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i7 += 2;
        }
        return i7 == m18674d.length ? m18674d : (byte[][]) Arrays.copyOfRange(m18674d, 0, i7);
    }

    /* renamed from: e */
    public static byte[][] m19665e(byte[][] bArr) {
        for (int i7 = 0; i7 < bArr.length; i7 += 2) {
            byte[] bArr2 = bArr[i7];
            int i8 = i7 + 1;
            byte[] bArr3 = bArr[i8];
            if (m19661a(bArr2, f16642b)) {
                for (byte b7 : bArr3) {
                    if (b7 == 44) {
                        return m19663c(bArr, i7);
                    }
                }
                bArr[i8] = AbstractC3106a.m11329a().m11331b(new String(bArr3, AbstractC2922e.f9008a));
            }
        }
        return bArr;
    }
}
