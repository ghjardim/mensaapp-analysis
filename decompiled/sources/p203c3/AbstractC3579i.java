package p203c3;

import java.util.Arrays;
import p171Y2.AbstractC2932o;

/* renamed from: c3.i */
/* loaded from: classes.dex */
public abstract class AbstractC3579i {

    /* renamed from: c3.i$a */
    public static final class a {

        /* renamed from: a */
        public static final byte[] f12037a;

        static {
            byte[] bArr = new byte[128];
            Arrays.fill(bArr, (byte) -1);
            for (int i7 = 0; i7 < 10; i7++) {
                bArr[i7 + 48] = (byte) i7;
            }
            for (int i8 = 0; i8 < 26; i8++) {
                byte b7 = (byte) (i8 + 10);
                bArr[i8 + 65] = b7;
                bArr[i8 + 97] = b7;
            }
            f12037a = bArr;
        }

        /* renamed from: a */
        public static int m14441a(char c7) {
            if (c7 < 128) {
                return f12037a[c7];
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static int m14437a(long j7, long j8) {
        if (j7 < j8) {
            return -1;
        }
        return j7 > j8 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m14438b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }

    /* renamed from: c */
    public static long m14439c(long... jArr) {
        AbstractC2932o.m10561d(jArr.length > 0);
        long j7 = jArr[0];
        for (int i7 = 1; i7 < jArr.length; i7++) {
            long j8 = jArr[i7];
            if (j8 > j7) {
                j7 = j8;
            }
        }
        return j7;
    }

    /* renamed from: d */
    public static Long m14440d(String str, int i7) {
        if (((String) AbstractC2932o.m10572o(str)).isEmpty()) {
            return null;
        }
        if (i7 < 2 || i7 > 36) {
            throw new IllegalArgumentException("radix must be between MIN_RADIX and MAX_RADIX but was " + i7);
        }
        int i8 = str.charAt(0) == '-' ? 1 : 0;
        if (i8 == str.length()) {
            return null;
        }
        int i9 = i8 + 1;
        int m14441a = a.m14441a(str.charAt(i8));
        if (m14441a < 0 || m14441a >= i7) {
            return null;
        }
        long j7 = -m14441a;
        long j8 = i7;
        long j9 = Long.MIN_VALUE / j8;
        while (i9 < str.length()) {
            int i10 = i9 + 1;
            int m14441a2 = a.m14441a(str.charAt(i9));
            if (m14441a2 < 0 || m14441a2 >= i7 || j7 < j9) {
                return null;
            }
            long j10 = j7 * j8;
            long j11 = m14441a2;
            if (j10 < j11 - Long.MIN_VALUE) {
                return null;
            }
            j7 = j10 - j11;
            i9 = i10;
        }
        if (i8 != 0) {
            return Long.valueOf(j7);
        }
        if (j7 == Long.MIN_VALUE) {
            return null;
        }
        return Long.valueOf(-j7);
    }
}
