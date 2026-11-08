package p104O5;

/* renamed from: O5.h */
/* loaded from: classes2.dex */
public abstract class AbstractC1421h extends AbstractC1420g {
    /* renamed from: a */
    public static int m5528a(int i7, int i8) {
        return i7 < i8 ? i8 : i7;
    }

    /* renamed from: b */
    public static long m5529b(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    /* renamed from: c */
    public static int m5530c(int i7, int i8) {
        return i7 > i8 ? i8 : i7;
    }

    /* renamed from: d */
    public static long m5531d(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    /* renamed from: e */
    public static int m5532e(int i7, int i8, int i9) {
        if (i8 <= i9) {
            return i7 < i8 ? i8 : i7 > i9 ? i9 : i7;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i9 + " is less than minimum " + i8 + '.');
    }

    /* renamed from: f */
    public static C1417d m5533f(int i7, int i8) {
        return C1417d.f4465d.m5522a(i7, i8, -1);
    }

    /* renamed from: g */
    public static C1419f m5534g(int i7, int i8) {
        return i8 <= Integer.MIN_VALUE ? C1419f.f4473e.m5527a() : new C1419f(i7, i8 - 1);
    }
}
