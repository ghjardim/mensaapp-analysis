package p171Y2;

/* renamed from: Y2.o */
/* loaded from: classes.dex */
public abstract class AbstractC2932o {
    /* renamed from: a */
    public static String m10558a(int i7, int i8, String str) {
        if (i7 < 0) {
            return AbstractC2938u.m10608b("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return AbstractC2938u.m10608b("%s (%s) must be less than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    /* renamed from: b */
    public static String m10559b(int i7, int i8, String str) {
        if (i7 < 0) {
            return AbstractC2938u.m10608b("%s (%s) must not be negative", str, Integer.valueOf(i7));
        }
        if (i8 >= 0) {
            return AbstractC2938u.m10608b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i7), Integer.valueOf(i8));
        }
        throw new IllegalArgumentException("negative size: " + i8);
    }

    /* renamed from: c */
    public static String m10560c(int i7, int i8, int i9) {
        return (i7 < 0 || i7 > i9) ? m10559b(i7, i9, "start index") : (i8 < 0 || i8 > i9) ? m10559b(i8, i9, "end index") : AbstractC2938u.m10608b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i8), Integer.valueOf(i7));
    }

    /* renamed from: d */
    public static void m10561d(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    public static void m10562e(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: f */
    public static void m10563f(boolean z6, String str, char c7) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, Character.valueOf(c7)));
        }
    }

    /* renamed from: g */
    public static void m10564g(boolean z6, String str, char c7, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, Character.valueOf(c7), obj));
        }
    }

    /* renamed from: h */
    public static void m10565h(boolean z6, String str, int i7) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, Integer.valueOf(i7)));
        }
    }

    /* renamed from: i */
    public static void m10566i(boolean z6, String str, int i7, int i8) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, Integer.valueOf(i7), Integer.valueOf(i8)));
        }
    }

    /* renamed from: j */
    public static void m10567j(boolean z6, String str, long j7) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, Long.valueOf(j7)));
        }
    }

    /* renamed from: k */
    public static void m10568k(boolean z6, String str, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, obj));
        }
    }

    /* renamed from: l */
    public static void m10569l(boolean z6, String str, Object obj, Object obj2) {
        if (!z6) {
            throw new IllegalArgumentException(AbstractC2938u.m10608b(str, obj, obj2));
        }
    }

    /* renamed from: m */
    public static int m10570m(int i7, int i8) {
        return m10571n(i7, i8, "index");
    }

    /* renamed from: n */
    public static int m10571n(int i7, int i8, String str) {
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(m10558a(i7, i8, str));
        }
        return i7;
    }

    /* renamed from: o */
    public static Object m10572o(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: p */
    public static Object m10573p(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: q */
    public static Object m10574q(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(AbstractC2938u.m10608b(str, obj2));
    }

    /* renamed from: r */
    public static int m10575r(int i7, int i8) {
        return m10576s(i7, i8, "index");
    }

    /* renamed from: s */
    public static int m10576s(int i7, int i8, String str) {
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(m10559b(i7, i8, str));
        }
        return i7;
    }

    /* renamed from: t */
    public static void m10577t(int i7, int i8, int i9) {
        if (i7 < 0 || i8 < i7 || i8 > i9) {
            throw new IndexOutOfBoundsException(m10560c(i7, i8, i9));
        }
    }

    /* renamed from: u */
    public static void m10578u(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: v */
    public static void m10579v(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: w */
    public static void m10580w(boolean z6, String str, int i7) {
        if (!z6) {
            throw new IllegalStateException(AbstractC2938u.m10608b(str, Integer.valueOf(i7)));
        }
    }

    /* renamed from: x */
    public static void m10581x(boolean z6, String str, Object obj) {
        if (!z6) {
            throw new IllegalStateException(AbstractC2938u.m10608b(str, obj));
        }
    }
}
