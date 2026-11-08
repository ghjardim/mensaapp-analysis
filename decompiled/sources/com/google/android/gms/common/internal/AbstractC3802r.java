package com.google.android.gms.common.internal;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import p031E2.AbstractC0288x;
import p256j$.util.Objects;

/* renamed from: com.google.android.gms.common.internal.r */
/* loaded from: classes.dex */
public abstract class AbstractC3802r {
    /* renamed from: a */
    public static void m15119a(boolean z6) {
        if (!z6) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static void m15120b(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* renamed from: c */
    public static void m15121c(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m15122d(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            String name = myLooper != null ? myLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    /* renamed from: e */
    public static String m15123e(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    /* renamed from: f */
    public static String m15124f(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    /* renamed from: g */
    public static void m15125g() {
        m15126h("Must not be called on GoogleApiHandler thread.");
    }

    /* renamed from: h */
    public static void m15126h(String str) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: i */
    public static void m15127i() {
        m15128j("Must not be called on the main application thread");
    }

    /* renamed from: j */
    public static void m15128j(String str) {
        if (AbstractC0288x.m1155a()) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: k */
    public static Object m15129k(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    /* renamed from: l */
    public static Object m15130l(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: m */
    public static int m15131m(int i7) {
        if (i7 != 0) {
            return i7;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    /* renamed from: n */
    public static void m15132n(boolean z6) {
        if (!z6) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: o */
    public static void m15133o(boolean z6, Object obj) {
        if (!z6) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* renamed from: p */
    public static void m15134p(boolean z6, String str, Object... objArr) {
        if (!z6) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }
}
