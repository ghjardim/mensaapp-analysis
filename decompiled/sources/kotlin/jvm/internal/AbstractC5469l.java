package kotlin.jvm.internal;

import java.util.Arrays;
import p371w5.C6933p;

/* renamed from: kotlin.jvm.internal.l */
/* loaded from: classes2.dex */
public abstract class AbstractC5469l {
    /* renamed from: a */
    public static boolean m23024a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: b */
    public static void m23025b(Object obj) {
        if (obj == null) {
            m23033j();
        }
    }

    /* renamed from: c */
    public static void m23026c(Object obj, String str) {
        if (obj == null) {
            m23034k(str);
        }
    }

    /* renamed from: d */
    public static void m23027d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) m23031h(new NullPointerException(str + " must not be null")));
    }

    /* renamed from: e */
    public static void m23028e(Object obj, String str) {
        if (obj == null) {
            m23035l(str);
        }
    }

    /* renamed from: f */
    public static int m23029f(int i7, int i8) {
        if (i7 < i8) {
            return -1;
        }
        return i7 == i8 ? 0 : 1;
    }

    /* renamed from: g */
    public static String m23030g(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = AbstractC5469l.class.getName();
        int i7 = 0;
        while (!stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        while (stackTrace[i7].getClassName().equals(name)) {
            i7++;
        }
        StackTraceElement stackTraceElement = stackTrace[i7];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    /* renamed from: h */
    public static Throwable m23031h(Throwable th) {
        return m23032i(th, AbstractC5469l.class.getName());
    }

    /* renamed from: i */
    public static Throwable m23032i(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i7 = -1;
        for (int i8 = 0; i8 < length; i8++) {
            if (str.equals(stackTrace[i8].getClassName())) {
                i7 = i8;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i7 + 1, length));
        return th;
    }

    /* renamed from: j */
    public static void m23033j() {
        throw ((NullPointerException) m23031h(new NullPointerException()));
    }

    /* renamed from: k */
    public static void m23034k(String str) {
        throw ((NullPointerException) m23031h(new NullPointerException(str)));
    }

    /* renamed from: l */
    public static void m23035l(String str) {
        throw ((NullPointerException) m23031h(new NullPointerException(m23030g(str))));
    }

    /* renamed from: m */
    public static void m23036m(String str) {
        throw ((C6933p) m23031h(new C6933p(str)));
    }

    /* renamed from: n */
    public static void m23037n(String str) {
        m23036m("lateinit property " + str + " has not been initialized");
    }
}
