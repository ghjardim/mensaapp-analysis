package p157W2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* renamed from: W2.j */
/* loaded from: classes.dex */
public abstract class AbstractC2684j {

    /* renamed from: a */
    public static final C2667G f7933a = new C2667G("PhoneskyVerificationUtils");

    /* renamed from: a */
    public static int m9178a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && m9180c(packageInfo.signatures)) {
                return packageInfo.versionCode;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static boolean m9179b(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (m9180c(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m9180c(Signature[] signatureArr) {
        if (signatureArr == null || (signatureArr.length) == 0) {
            f7933a.m9145e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            return false;
        }
        for (Signature signature : signatureArr) {
            String m9177a = AbstractC2683i.m9177a(signature.toByteArray());
            if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(m9177a)) {
                return true;
            }
            String str = Build.TAGS;
            if ((str.contains("dev-keys") || str.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(m9177a)) {
                return true;
            }
        }
        return false;
    }
}
