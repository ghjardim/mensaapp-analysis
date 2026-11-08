package p328r1;

import p259j0.C5357z;

/* renamed from: r1.L */
/* loaded from: classes.dex */
public abstract class AbstractC6260L {
    /* renamed from: a */
    public static int m26178a(byte[] bArr, int i7, int i8) {
        while (i7 < i8 && bArr[i7] != 71) {
            i7++;
        }
        return i7;
    }

    /* renamed from: b */
    public static boolean m26179b(byte[] bArr, int i7, int i8, int i9) {
        int i10 = 0;
        for (int i11 = -4; i11 <= 4; i11++) {
            int i12 = (i11 * 188) + i9;
            if (i12 < i7 || i12 >= i8 || bArr[i12] != 71) {
                i10 = 0;
            } else {
                i10++;
                if (i10 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m26180c(C5357z c5357z, int i7, int i8) {
        c5357z.m21939T(i7);
        if (c5357z.m21942a() < 5) {
            return -9223372036854775807L;
        }
        int m21957p = c5357z.m21957p();
        if ((8388608 & m21957p) != 0 || ((2096896 & m21957p) >> 8) != i8 || (m21957p & 32) == 0 || c5357z.m21926G() < 7 || c5357z.m21942a() < 7 || (c5357z.m21926G() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c5357z.m21953l(bArr, 0, 6);
        return m26181d(bArr);
    }

    /* renamed from: d */
    public static long m26181d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
