package p023D1;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0181a {

    /* renamed from: a */
    public static long f754a;

    /* renamed from: b */
    public static Method f755b;

    /* renamed from: c */
    public static Method f756c;

    /* renamed from: d */
    public static Method f757d;

    /* renamed from: a */
    public static void m727a(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0183c.m739a(m736j(str), i7);
        } else {
            m728b(m736j(str), i7);
        }
    }

    /* renamed from: b */
    public static void m728b(String str, int i7) {
        try {
            if (f756c == null) {
                f756c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f756c.invoke(null, Long.valueOf(f754a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            m733g("asyncTraceBegin", e7);
        }
    }

    /* renamed from: c */
    public static void m729c(String str) {
        AbstractC0182b.m737a(m736j(str));
    }

    /* renamed from: d */
    public static void m730d(String str, int i7) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0183c.m740b(m736j(str), i7);
        } else {
            m731e(m736j(str), i7);
        }
    }

    /* renamed from: e */
    public static void m731e(String str, int i7) {
        try {
            if (f757d == null) {
                f757d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f757d.invoke(null, Long.valueOf(f754a), str, Integer.valueOf(i7));
        } catch (Exception e7) {
            m733g("asyncTraceEnd", e7);
        }
    }

    /* renamed from: f */
    public static void m732f() {
        AbstractC0182b.m738b();
    }

    /* renamed from: g */
    public static void m733g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    /* renamed from: h */
    public static boolean m734h() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC0183c.m741c() : m735i();
    }

    /* renamed from: i */
    public static boolean m735i() {
        try {
            if (f755b == null) {
                f754a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f755b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f755b.invoke(null, Long.valueOf(f754a))).booleanValue();
        } catch (Exception e7) {
            m733g("isTagEnabled", e7);
            return false;
        }
    }

    /* renamed from: j */
    public static String m736j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
