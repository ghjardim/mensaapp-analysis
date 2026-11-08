package p031E2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import p368w2.AbstractC6874o;

/* renamed from: E2.h */
/* loaded from: classes.dex */
public abstract class AbstractC0272h {

    /* renamed from: a */
    public static Boolean f1092a;

    /* renamed from: b */
    public static Boolean f1093b;

    /* renamed from: c */
    public static Boolean f1094c;

    /* renamed from: d */
    public static Boolean f1095d;

    /* renamed from: a */
    public static boolean m1117a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f1095d == null) {
            boolean z6 = false;
            if (AbstractC0277m.m1134e() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z6 = true;
            }
            f1095d = Boolean.valueOf(z6);
        }
        return f1095d.booleanValue();
    }

    /* renamed from: b */
    public static boolean m1118b() {
        int i7 = AbstractC6874o.f24694a;
        return "user".equals(Build.TYPE);
    }

    /* renamed from: c */
    public static boolean m1119c(Context context) {
        return m1123g(context.getPackageManager());
    }

    /* renamed from: d */
    public static boolean m1120d(Context context) {
        if (m1119c(context) && !AbstractC0277m.m1133d()) {
            return true;
        }
        if (m1121e(context)) {
            return !AbstractC0277m.m1134e() || AbstractC0277m.m1137h();
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m1121e(Context context) {
        if (f1093b == null) {
            f1093b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f1093b.booleanValue();
    }

    /* renamed from: f */
    public static boolean m1122f(Context context) {
        if (f1094c == null) {
            boolean z6 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z6 = false;
            }
            f1094c = Boolean.valueOf(z6);
        }
        return f1094c.booleanValue();
    }

    /* renamed from: g */
    public static boolean m1123g(PackageManager packageManager) {
        if (f1092a == null) {
            f1092a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f1092a.booleanValue();
    }
}
