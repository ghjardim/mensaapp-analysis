package p362v3;

/* renamed from: v3.E */
/* loaded from: classes.dex */
public abstract class AbstractC6750E {
    /* renamed from: a */
    public static void m27701a(boolean z6, String str) {
        if (!z6) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: b */
    public static Object m27702b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m27703c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: d */
    public static void m27704d(boolean z6, String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }
}
