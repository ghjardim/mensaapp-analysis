package com.google.android.gms.common.internal;

import android.util.Log;

/* renamed from: com.google.android.gms.common.internal.i */
/* loaded from: classes.dex */
public final class C3784i {

    /* renamed from: a */
    public final String f12516a;

    /* renamed from: b */
    public final String f12517b;

    public C3784i(String str) {
        this(str, null);
    }

    /* renamed from: a */
    public boolean m15088a(int i7) {
        return Log.isLoggable(this.f12516a, i7);
    }

    /* renamed from: b */
    public void m15089b(String str, String str2) {
        if (m15088a(3)) {
            Log.d(str, m15093f(str2));
        }
    }

    /* renamed from: c */
    public void m15090c(String str, String str2, Throwable th) {
        if (m15088a(6)) {
            Log.e(str, m15093f(str2), th);
        }
    }

    /* renamed from: d */
    public void m15091d(String str, String str2) {
        if (m15088a(2)) {
            Log.v(str, m15093f(str2));
        }
    }

    /* renamed from: e */
    public void m15092e(String str, String str2) {
        if (m15088a(5)) {
            Log.w(str, m15093f(str2));
        }
    }

    /* renamed from: f */
    public final String m15093f(String str) {
        String str2 = this.f12517b;
        return str2 == null ? str : str2.concat(str);
    }

    public C3784i(String str, String str2) {
        AbstractC3802r.m15130l(str, "log tag cannot be null");
        AbstractC3802r.m15121c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f12516a = str;
        this.f12517b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
