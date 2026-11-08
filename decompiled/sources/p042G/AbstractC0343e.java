package p042G;

/* renamed from: G.e */
/* loaded from: classes.dex */
public abstract class AbstractC0343e {
    /* renamed from: a */
    public static float m1351a(float f7, String str) {
        if (Float.isNaN(f7)) {
            throw new IllegalArgumentException(str + " must not be NaN");
        }
        if (!Float.isInfinite(f7)) {
            return f7;
        }
        throw new IllegalArgumentException(str + " must not be infinite");
    }

    /* renamed from: b */
    public static int m1352b(int i7) {
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public static Object m1353c(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: d */
    public static Object m1354d(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }
}
