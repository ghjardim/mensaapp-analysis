package p295n3;

import android.util.Log;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public class C5782b {

    /* renamed from: c */
    public static final C5782b f21077c = new C5782b("FirebaseAppCheck");

    /* renamed from: a */
    public final String f21078a;

    /* renamed from: b */
    public int f21079b = 4;

    public C5782b(String str) {
        this.f21078a = str;
    }

    /* renamed from: f */
    public static C5782b m24429f() {
        return f21077c;
    }

    /* renamed from: a */
    public final boolean m24430a(int i7) {
        return this.f21079b <= i7 || Log.isLoggable(this.f21078a, i7);
    }

    /* renamed from: b */
    public void m24431b(String str) {
        m24432c(str, null);
    }

    /* renamed from: c */
    public void m24432c(String str, Throwable th) {
        if (m24430a(3)) {
            Log.d(this.f21078a, str, th);
        }
    }

    /* renamed from: d */
    public void m24433d(String str) {
        m24434e(str, null);
    }

    /* renamed from: e */
    public void m24434e(String str, Throwable th) {
        if (m24430a(6)) {
            Log.e(this.f21078a, str, th);
        }
    }
}
