package p116Q3;

import java.util.Locale;

/* renamed from: Q3.z */
/* loaded from: classes.dex */
public abstract class AbstractC2157z {
    /* renamed from: a */
    public static void m7328a(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: b */
    public static Object m7329b(Object obj) {
        obj.getClass();
        return obj;
    }

    /* renamed from: c */
    public static Object m7330c(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: d */
    public static Object m7331d(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.format(Locale.US, str, objArr));
    }

    /* renamed from: e */
    public static void m7332e(boolean z6, String str) {
        if (!z6) {
            throw new IllegalStateException(str);
        }
    }
}
