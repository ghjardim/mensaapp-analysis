package p178Z2;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2928k;

/* renamed from: Z2.l */
/* loaded from: classes.dex */
public abstract class AbstractC3023l {
    /* renamed from: a */
    public static Object m11004a(int i7) {
        if (i7 >= 2 && i7 <= 1073741824 && Integer.highestOneBit(i7) == i7) {
            return i7 <= 256 ? new byte[i7] : i7 <= 65536 ? new short[i7] : new int[i7];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i7);
    }

    /* renamed from: b */
    public static int m11005b(int i7, int i8) {
        return i7 & (~i8);
    }

    /* renamed from: c */
    public static int m11006c(int i7, int i8) {
        return i7 & i8;
    }

    /* renamed from: d */
    public static int m11007d(int i7, int i8, int i9) {
        return (i7 & (~i9)) | (i8 & i9);
    }

    /* renamed from: e */
    public static int m11008e(int i7) {
        return (i7 < 32 ? 4 : 2) * (i7 + 1);
    }

    /* renamed from: f */
    public static int m11009f(Object obj, Object obj2, int i7, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i8;
        int i9;
        int m11033c = AbstractC3030s.m11033c(obj);
        int i10 = m11033c & i7;
        int m11011h = m11011h(obj3, i10);
        if (m11011h == 0) {
            return -1;
        }
        int m11005b = m11005b(m11033c, i7);
        int i11 = -1;
        while (true) {
            i8 = m11011h - 1;
            i9 = iArr[i8];
            if (m11005b(i9, i7) != m11005b || !AbstractC2928k.m10550a(obj, objArr[i8]) || (objArr2 != null && !AbstractC2928k.m10550a(obj2, objArr2[i8]))) {
                int m11006c = m11006c(i9, i7);
                if (m11006c == 0) {
                    return -1;
                }
                i11 = i8;
                m11011h = m11006c;
            }
        }
        int m11006c2 = m11006c(i9, i7);
        if (i11 == -1) {
            m11012i(obj3, i10, m11006c2);
        } else {
            iArr[i11] = m11007d(iArr[i11], m11006c2, i7);
        }
        return i8;
    }

    /* renamed from: g */
    public static void m11010g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    /* renamed from: h */
    public static int m11011h(Object obj, int i7) {
        return obj instanceof byte[] ? ((byte[]) obj)[i7] & ForkServer.ERROR : obj instanceof short[] ? ((short[]) obj)[i7] & 65535 : ((int[]) obj)[i7];
    }

    /* renamed from: i */
    public static void m11012i(Object obj, int i7, int i8) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i7] = (byte) i8;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i7] = (short) i8;
        } else {
            ((int[]) obj)[i7] = i8;
        }
    }

    /* renamed from: j */
    public static int m11013j(int i7) {
        return Math.max(4, AbstractC3030s.m11031a(i7 + 1, 1.0d));
    }
}
