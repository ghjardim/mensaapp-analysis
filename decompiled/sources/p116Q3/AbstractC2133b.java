package p116Q3;

/* renamed from: Q3.b */
/* loaded from: classes.dex */
public abstract class AbstractC2133b {
    /* renamed from: a */
    public static AssertionError m7214a(String str, Object... objArr) {
        throw new AssertionError(m7216c(str, objArr));
    }

    /* renamed from: b */
    public static AssertionError m7215b(Throwable th, String str, Object... objArr) {
        throw AbstractC2132a.m7213b(m7216c(str, objArr), th);
    }

    /* renamed from: c */
    public static String m7216c(String str, Object... objArr) {
        return "INTERNAL ASSERTION FAILED: " + String.format(str, objArr);
    }

    /* renamed from: d */
    public static void m7217d(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw m7214a(str, objArr);
        }
    }

    /* renamed from: e */
    public static Object m7218e(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return obj;
        }
        throw m7214a(str, objArr);
    }
}
