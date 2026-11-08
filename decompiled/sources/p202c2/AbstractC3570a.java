package p202c2;

import android.os.Build;
import android.util.Log;

/* renamed from: c2.a */
/* loaded from: classes.dex */
public abstract class AbstractC3570a {
    /* renamed from: a */
    public static String m14399a(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    /* renamed from: b */
    public static void m14400b(String str, String str2, Object obj) {
        String m14403e = m14403e(str);
        if (Log.isLoggable(m14403e, 3)) {
            Log.d(m14403e, String.format(str2, obj));
        }
    }

    /* renamed from: c */
    public static void m14401c(String str, String str2, Object... objArr) {
        String m14403e = m14403e(str);
        if (Log.isLoggable(m14403e, 3)) {
            Log.d(m14403e, String.format(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m14402d(String str, String str2, Throwable th) {
        String m14403e = m14403e(str);
        if (Log.isLoggable(m14403e, 6)) {
            Log.e(m14403e, str2, th);
        }
    }

    /* renamed from: e */
    public static String m14403e(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return m14399a("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    /* renamed from: f */
    public static void m14404f(String str, String str2, Object obj) {
        String m14403e = m14403e(str);
        if (Log.isLoggable(m14403e, 4)) {
            Log.i(m14403e, String.format(str2, obj));
        }
    }

    /* renamed from: g */
    public static void m14405g(String str, String str2, Object obj) {
        String m14403e = m14403e(str);
        if (Log.isLoggable(m14403e, 5)) {
            Log.w(m14403e, String.format(str2, obj));
        }
    }
}
