package p195b3;

import p171Y2.AbstractC2932o;

/* renamed from: b3.c */
/* loaded from: classes.dex */
public abstract class AbstractC3523c {
    /* renamed from: a */
    public static long m14156a(double d7) {
        AbstractC2932o.m10562e(m14157b(d7), "not a normal value");
        int exponent = Math.getExponent(d7);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d7) & 4503599627370495L;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | 4503599627370496L;
    }

    /* renamed from: b */
    public static boolean m14157b(double d7) {
        return Math.getExponent(d7) <= 1023;
    }
}
