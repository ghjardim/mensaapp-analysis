package p172Y3;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import p039F3.C0333a;
import p039F3.InterfaceC0335c;
import p219e3.C4172b;
import p372x.AbstractC6935a;

/* renamed from: Y3.a */
/* loaded from: classes.dex */
public class C2944a {

    /* renamed from: a */
    public final Context f9053a;

    /* renamed from: b */
    public final SharedPreferences f9054b;

    /* renamed from: c */
    public final InterfaceC0335c f9055c;

    /* renamed from: d */
    public boolean f9056d;

    public C2944a(Context context, String str, InterfaceC0335c interfaceC0335c) {
        Context m10623a = m10623a(context);
        this.f9053a = m10623a;
        this.f9054b = m10623a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f9055c = interfaceC0335c;
        this.f9056d = m10625c();
    }

    /* renamed from: a */
    public static Context m10623a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : AbstractC6935a.createDeviceProtectedStorageContext(context);
    }

    /* renamed from: b */
    public synchronized boolean m10624b() {
        return this.f9056d;
    }

    /* renamed from: c */
    public final boolean m10625c() {
        return this.f9054b.contains("firebase_data_collection_default_enabled") ? this.f9054b.getBoolean("firebase_data_collection_default_enabled", true) : m10626d();
    }

    /* renamed from: d */
    public final boolean m10626d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f9053a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f9053a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: e */
    public synchronized void m10627e(Boolean bool) {
        try {
            if (bool == null) {
                this.f9054b.edit().remove("firebase_data_collection_default_enabled").apply();
                m10628f(m10626d());
            } else {
                boolean equals = Boolean.TRUE.equals(bool);
                this.f9054b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
                m10628f(equals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: f */
    public final synchronized void m10628f(boolean z6) {
        if (this.f9056d != z6) {
            this.f9056d = z6;
            this.f9055c.mo1338a(new C0333a(C4172b.class, new C4172b(z6)));
        }
    }
}
