package p195b3;

import java.math.RoundingMode;

/* renamed from: b3.f */
/* loaded from: classes.dex */
public abstract class AbstractC3526f {
    /* renamed from: a */
    public static void m14169a(boolean z6, double d7, RoundingMode roundingMode) {
        if (z6) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + d7 + " and rounding mode " + roundingMode);
    }

    /* renamed from: b */
    public static void m14170b(boolean z6, String str, int i7, int i8) {
        if (z6) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + i7 + ", " + i8 + ")");
    }

    /* renamed from: c */
    public static void m14171c(boolean z6, String str, long j7, long j8) {
        if (z6) {
            return;
        }
        throw new ArithmeticException("overflow: " + str + "(" + j7 + ", " + j8 + ")");
    }

    /* renamed from: d */
    public static long m14172d(String str, long j7) {
        if (j7 >= 0) {
            return j7;
        }
        throw new IllegalArgumentException(str + " (" + j7 + ") must be >= 0");
    }

    /* renamed from: e */
    public static int m14173e(String str, int i7) {
        if (i7 > 0) {
            return i7;
        }
        throw new IllegalArgumentException(str + " (" + i7 + ") must be > 0");
    }

    /* renamed from: f */
    public static void m14174f(boolean z6) {
        if (!z6) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
