package p031E2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import p045G2.C0385f;
import p368w2.C6875p;

/* renamed from: E2.r */
/* loaded from: classes.dex */
public abstract class AbstractC0282r {
    /* renamed from: a */
    public static boolean m1146a(Context context, int i7) {
        if (!m1147b(context, i7, "com.google.android.gms")) {
            return false;
        }
        try {
            return C6875p.m28291a(context).m28294b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m1147b(Context context, int i7, String str) {
        return C0385f.m1578a(context).m1577g(i7, str);
    }
}
