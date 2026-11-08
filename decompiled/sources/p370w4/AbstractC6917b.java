package p370w4;

import android.util.Log;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public abstract class AbstractC6917b {
    /* renamed from: b */
    public static void m28354b(String str, String str2) {
        Log.e(str, str2);
    }

    /* renamed from: c */
    public static void m28355c(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    /* renamed from: d */
    public static String m28356d(Throwable th) {
        return Log.getStackTraceString(th);
    }

    /* renamed from: g */
    public static void m28359g(String str, String str2) {
        Log.w(str, str2);
    }

    /* renamed from: h */
    public static void m28360h(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    /* renamed from: i */
    public static void m28361i(String str, String str2) {
        Log.wtf(str, str2);
    }

    /* renamed from: a */
    public static void m28353a(String str, String str2) {
    }

    /* renamed from: e */
    public static void m28357e(String str, String str2) {
    }

    /* renamed from: f */
    public static void m28358f(String str, String str2) {
    }
}
