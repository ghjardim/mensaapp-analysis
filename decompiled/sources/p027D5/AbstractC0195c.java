package p027D5;

/* renamed from: D5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC0195c {
    /* renamed from: a */
    public static final int m793a(int i7, int i8, int i9) {
        return m795c(m795c(i7, i9) - m795c(i8, i9), i9);
    }

    /* renamed from: b */
    public static final int m794b(int i7, int i8, int i9) {
        if (i9 > 0) {
            return i7 >= i8 ? i8 : i8 - m793a(i8, i7, i9);
        }
        if (i9 < 0) {
            return i7 <= i8 ? i8 : i8 + m793a(i7, i8, -i9);
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    /* renamed from: c */
    public static final int m795c(int i7, int i8) {
        int i9 = i7 % i8;
        return i9 >= 0 ? i9 : i9 + i8;
    }
}
