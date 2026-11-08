package p164X2;

/* renamed from: X2.a */
/* loaded from: classes.dex */
public abstract class AbstractC2815a {
    /* renamed from: a */
    public static int m10069a(long j7, long j8) {
        return Long.compare(j7, j8);
    }

    /* renamed from: b */
    public static int m10070b(double d7, long j7) {
        if (Double.isNaN(d7) || d7 < -9.223372036854776E18d) {
            return -1;
        }
        if (d7 >= 9.223372036854776E18d) {
            return 1;
        }
        int m10069a = m10069a((long) d7, j7);
        return m10069a != 0 ? m10069a : m10071c(d7, j7);
    }

    /* renamed from: c */
    public static int m10071c(double d7, double d8) {
        if (d7 < d8) {
            return -1;
        }
        if (d7 > d8) {
            return 1;
        }
        if (d7 == d8) {
            return 0;
        }
        if (Double.isNaN(d8)) {
            return !Double.isNaN(d7) ? 1 : 0;
        }
        return -1;
    }
}
