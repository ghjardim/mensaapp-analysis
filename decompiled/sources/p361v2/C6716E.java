package p361v2;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import p031E2.AbstractC0277m;
import p045G2.C0385f;

/* renamed from: v2.E */
/* loaded from: classes.dex */
public final class C6716E {

    /* renamed from: a */
    public final Context f24243a;

    /* renamed from: b */
    public int f24244b;

    /* renamed from: c */
    public int f24245c = 0;

    public C6716E(Context context) {
        this.f24243a = context;
    }

    /* renamed from: a */
    public final synchronized int m27661a() {
        PackageInfo packageInfo;
        if (this.f24244b == 0) {
            try {
                packageInfo = C0385f.m1578a(this.f24243a).m1575e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e7) {
                Log.w("Metadata", "Failed to find package ".concat(e7.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f24244b = packageInfo.versionCode;
            }
        }
        return this.f24244b;
    }

    /* renamed from: b */
    public final synchronized int m27662b() {
        int i7 = this.f24245c;
        if (i7 != 0) {
            return i7;
        }
        Context context = this.f24243a;
        PackageManager packageManager = context.getPackageManager();
        if (C0385f.m1578a(context).m1572b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i8 = 1;
        if (!AbstractC0277m.m1134e()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f24245c = i8;
                return i8;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i8 = 2;
            this.f24245c = i8;
            return i8;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == AbstractC0277m.m1134e()) {
            i8 = 2;
        }
        this.f24245c = i8;
        return i8;
    }
}
