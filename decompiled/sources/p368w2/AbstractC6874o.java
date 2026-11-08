package p368w2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.internal.AbstractC3771b0;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p031E2.AbstractC0272h;
import p031E2.AbstractC0282r;
import p031E2.AbstractC0284t;
import p045G2.C0385f;

/* renamed from: w2.o */
/* loaded from: classes.dex */
public abstract class AbstractC6874o {

    /* renamed from: a */
    public static final int f24694a = 12451000;

    /* renamed from: c */
    public static boolean f24696c = false;

    /* renamed from: d */
    public static boolean f24697d = false;

    /* renamed from: b */
    public static final AtomicBoolean f24695b = new AtomicBoolean();

    /* renamed from: e */
    public static final AtomicBoolean f24698e = new AtomicBoolean();

    /* renamed from: a */
    public static void m28279a(Context context, int i7) {
        int mo28258h = C6870k.m28272f().mo28258h(context, i7);
        if (mo28258h != 0) {
            Intent mo28254b = C6870k.m28272f().mo28254b(context, mo28258h, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + mo28258h);
            if (mo28254b != null) {
                throw new C6872m(mo28258h, "Google Play Services not available", mo28254b);
            }
            throw new C6871l(mo28258h);
        }
    }

    /* renamed from: b */
    public static int m28280b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* renamed from: c */
    public static String m28281c(int i7) {
        return C6861b.m28239C0(i7);
    }

    /* renamed from: d */
    public static Context m28282d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static Resources m28283e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static boolean m28284f(Context context) {
        try {
            if (!f24697d) {
                try {
                    PackageInfo m1575e = C0385f.m1578a(context).m1575e("com.google.android.gms", 64);
                    C6875p.m28291a(context);
                    if (m1575e == null || C6875p.m28293e(m1575e, false) || !C6875p.m28293e(m1575e, true)) {
                        f24696c = false;
                    } else {
                        f24696c = true;
                    }
                    f24697d = true;
                } catch (PackageManager.NameNotFoundException e7) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e7);
                    f24697d = true;
                }
            }
            return f24696c || !AbstractC0272h.m1118b();
        } catch (Throwable th) {
            f24697d = true;
            throw th;
        }
    }

    /* renamed from: g */
    public static int m28285g(Context context, int i7) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(AbstractC6876q.f24702a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f24698e.get()) {
            int m15046a = AbstractC3771b0.m15046a(context);
            if (m15046a == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (m15046a != f24694a) {
                throw new GooglePlayServicesIncorrectManifestValueException(m15046a);
            }
        }
        boolean z6 = (AbstractC0272h.m1120d(context) || AbstractC0272h.m1122f(context)) ? false : true;
        AbstractC3802r.m15119a(i7 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z6) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C6875p.m28291a(context);
            if (C6875p.m28293e(packageInfo2, true)) {
                if (z6) {
                    AbstractC3802r.m15129k(packageInfo);
                    if (!C6875p.m28293e(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (!z6 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (AbstractC0284t.m1151a(packageInfo2.versionCode) >= AbstractC0284t.m1151a(i7)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e7) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e7);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i7 + " but found " + packageInfo2.versionCode);
                    return 2;
                }
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
            } else {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    /* renamed from: h */
    public static boolean m28286h(Context context, int i7) {
        if (i7 == 18) {
            return true;
        }
        if (i7 == 1) {
            return m28290l(context, "com.google.android.gms");
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m28287i(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC3802r.m15129k(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    /* renamed from: j */
    public static boolean m28288j(int i7) {
        return i7 == 1 || i7 == 2 || i7 == 3 || i7 == 9;
    }

    /* renamed from: k */
    public static boolean m28289k(Context context, int i7, String str) {
        return AbstractC0282r.m1147b(context, i7, str);
    }

    /* renamed from: l */
    public static boolean m28290l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !m28287i(context);
    }
}
