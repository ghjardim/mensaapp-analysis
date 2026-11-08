package p045G2;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import p031E2.AbstractC0277m;

/* renamed from: G2.e */
/* loaded from: classes.dex */
public class C0384e {

    /* renamed from: a */
    public final Context f1487a;

    public C0384e(Context context) {
        this.f1487a = context;
    }

    /* renamed from: a */
    public int m1571a(String str) {
        return this.f1487a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: b */
    public int m1572b(String str, String str2) {
        return this.f1487a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: c */
    public ApplicationInfo m1573c(String str, int i7) {
        return this.f1487a.getPackageManager().getApplicationInfo(str, i7);
    }

    /* renamed from: d */
    public CharSequence m1574d(String str) {
        Context context = this.f1487a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    /* renamed from: e */
    public PackageInfo m1575e(String str, int i7) {
        return this.f1487a.getPackageManager().getPackageInfo(str, i7);
    }

    /* renamed from: f */
    public boolean m1576f() {
        String nameForUid;
        boolean isInstantApp;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC0382c.m1569a(this.f1487a);
        }
        if (!AbstractC0277m.m1134e() || (nameForUid = this.f1487a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = this.f1487a.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }

    /* renamed from: g */
    public final boolean m1577g(int i7, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f1487a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i7, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
