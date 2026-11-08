package p021D;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: D.u */
/* loaded from: classes.dex */
public abstract class AbstractC0113u {

    /* renamed from: a */
    public static long f343a;

    /* renamed from: b */
    public static Method f344b;

    /* renamed from: c */
    public static Method f345c;

    /* renamed from: d */
    public static Method f346d;

    /* renamed from: e */
    public static Method f347e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f343a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f344b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f345c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f346d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f347e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e7) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e7);
            }
        }
    }

    /* renamed from: a */
    public static void m282a(String str) {
        Trace.beginSection(str);
    }

    /* renamed from: b */
    public static void m283b() {
        Trace.endSection();
    }
}
