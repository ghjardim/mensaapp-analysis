package p187a4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import org.apache.tika.metadata.TikaCoreProperties;
import p031E2.AbstractC0277m;
import p219e3.C4176f;

/* renamed from: a4.J */
/* loaded from: classes.dex */
public class C3117J {

    /* renamed from: a */
    public final Context f9627a;

    /* renamed from: b */
    public String f9628b;

    /* renamed from: c */
    public String f9629c;

    /* renamed from: d */
    public int f9630d;

    /* renamed from: e */
    public int f9631e = 0;

    public C3117J(Context context) {
        this.f9627a = context;
    }

    /* renamed from: c */
    public static String m11376c(C4176f c4176f) {
        String m17551f = c4176f.m17534r().m17551f();
        if (m17551f != null) {
            return m17551f;
        }
        String m17548c = c4176f.m17534r().m17548c();
        if (!m17548c.startsWith("1:")) {
            return m17548c;
        }
        String[] split = m17548c.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: a */
    public synchronized String m11377a() {
        try {
            if (this.f9628b == null) {
                m11383h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9628b;
    }

    /* renamed from: b */
    public synchronized String m11378b() {
        try {
            if (this.f9629c == null) {
                m11383h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9629c;
    }

    /* renamed from: d */
    public synchronized int m11379d() {
        PackageInfo m11381f;
        try {
            if (this.f9630d == 0 && (m11381f = m11381f("com.google.android.gms")) != null) {
                this.f9630d = m11381f.versionCode;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f9630d;
    }

    /* renamed from: e */
    public synchronized int m11380e() {
        int i7 = this.f9631e;
        if (i7 != 0) {
            return i7;
        }
        PackageManager packageManager = this.f9627a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!AbstractC0277m.m1134e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f9631e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f9631e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (AbstractC0277m.m1134e()) {
            this.f9631e = 2;
        } else {
            this.f9631e = 1;
        }
        return this.f9631e;
    }

    /* renamed from: f */
    public final PackageInfo m11381f(String str) {
        try {
            return this.f9627a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e7) {
            Log.w("FirebaseMessaging", "Failed to find package " + e7);
            return null;
        }
    }

    /* renamed from: g */
    public boolean m11382g() {
        return m11380e() != 0;
    }

    /* renamed from: h */
    public final synchronized void m11383h() {
        PackageInfo m11381f = m11381f(this.f9627a.getPackageName());
        if (m11381f != null) {
            this.f9628b = Integer.toString(m11381f.versionCode);
            this.f9629c = m11381f.versionName;
        }
    }
}
