package p171Y2;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: Y2.y */
/* loaded from: classes.dex */
public abstract class AbstractC2942y {

    /* renamed from: a */
    public static final Object f9049a;

    /* renamed from: b */
    public static final Method f9050b;

    /* renamed from: c */
    public static final Method f9051c;

    static {
        Object m10616b = m10616b();
        f9049a = m10616b;
        f9050b = m10616b == null ? null : m10615a();
        f9051c = m10616b != null ? m10618d(m10616b) : null;
    }

    /* renamed from: a */
    public static Method m10615a() {
        return m10617c("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    /* renamed from: b */
    public static Object m10616b() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static Method m10617c(String str, Class... clsArr) {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e7) {
            throw e7;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static Method m10618d(Object obj) {
        try {
            Method m10617c = m10617c("getStackTraceDepth", Throwable.class);
            if (m10617c == null) {
                return null;
            }
            m10617c.invoke(obj, new Throwable());
            return m10617c;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static String m10619e(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: f */
    public static void m10620f(Throwable th) {
        AbstractC2932o.m10572o(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        }
        if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
