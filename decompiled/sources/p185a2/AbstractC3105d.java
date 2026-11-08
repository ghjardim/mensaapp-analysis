package p185a2;

/* renamed from: a2.d */
/* loaded from: classes.dex */
public abstract class AbstractC3105d {
    /* renamed from: a */
    public static void m11326a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static Object m11327b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m11328c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
