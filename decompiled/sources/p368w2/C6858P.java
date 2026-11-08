package p368w2;

import android.util.Log;

/* renamed from: w2.P */
/* loaded from: classes.dex */
public class C6858P {

    /* renamed from: e */
    public static final C6858P f24667e = new C6858P(true, 3, 1, null, null);

    /* renamed from: a */
    public final boolean f24668a;

    /* renamed from: b */
    public final String f24669b;

    /* renamed from: c */
    public final Throwable f24670c;

    /* renamed from: d */
    public final int f24671d;

    public C6858P(boolean z6, int i7, int i8, String str, Throwable th) {
        this.f24668a = z6;
        this.f24671d = i7;
        this.f24669b = str;
        this.f24670c = th;
    }

    /* renamed from: b */
    public static C6858P m28230b() {
        return f24667e;
    }

    /* renamed from: c */
    public static C6858P m28231c(String str) {
        return new C6858P(false, 1, 5, str, null);
    }

    /* renamed from: d */
    public static C6858P m28232d(String str, Throwable th) {
        return new C6858P(false, 1, 5, str, th);
    }

    /* renamed from: f */
    public static C6858P m28233f(int i7) {
        return new C6858P(true, i7, 1, null, null);
    }

    /* renamed from: g */
    public static C6858P m28234g(int i7, int i8, String str, Throwable th) {
        return new C6858P(false, i7, i8, str, th);
    }

    /* renamed from: a */
    public String mo28229a() {
        return this.f24669b;
    }

    /* renamed from: e */
    public final void m28235e() {
        if (this.f24668a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f24670c != null) {
            Log.d("GoogleCertificatesRslt", mo28229a(), this.f24670c);
        } else {
            Log.d("GoogleCertificatesRslt", mo28229a());
        }
    }
}
