package p368w2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3811v0;
import p031E2.AbstractC0272h;
import p045G2.C0385f;
import p365w.AbstractC6799o;

/* renamed from: w2.k */
/* loaded from: classes.dex */
public class C6870k {

    /* renamed from: a */
    public static final int f24689a = AbstractC6874o.f24694a;

    /* renamed from: b */
    public static final C6870k f24690b = new C6870k();

    /* renamed from: f */
    public static C6870k m28272f() {
        return f24690b;
    }

    /* renamed from: a */
    public int m28273a(Context context) {
        return AbstractC6874o.m28280b(context);
    }

    /* renamed from: b */
    public Intent mo28254b(Context context, int i7, String str) {
        if (i7 != 1 && i7 != 2) {
            if (i7 != 3) {
                return null;
            }
            Uri uri = AbstractC3811v0.f12576a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(fromParts);
            return intent;
        }
        if (context != null && AbstractC0272h.m1120d(context)) {
            Uri uri2 = AbstractC3811v0.f12576a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f24689a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C0385f.m1578a(context).m1575e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String sb2 = sb.toString();
        Uri uri3 = AbstractC3811v0.f12576a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(sb2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", sb2);
        }
        intent3.setData(appendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* renamed from: c */
    public PendingIntent mo28255c(Context context, int i7, int i8) {
        return m28274d(context, i7, i8, null);
    }

    /* renamed from: d */
    public PendingIntent m28274d(Context context, int i7, int i8, String str) {
        Intent mo28254b = mo28254b(context, i7, str);
        if (mo28254b == null) {
            return null;
        }
        return AbstractC6799o.m27952b(context, i8, mo28254b, 134217728, false);
    }

    /* renamed from: e */
    public String mo28256e(int i7) {
        return AbstractC6874o.m28281c(i7);
    }

    /* renamed from: g */
    public int mo28257g(Context context) {
        return mo28258h(context, f24689a);
    }

    /* renamed from: h */
    public int mo28258h(Context context, int i7) {
        int m28285g = AbstractC6874o.m28285g(context, i7);
        if (AbstractC6874o.m28286h(context, m28285g)) {
            return 18;
        }
        return m28285g;
    }

    /* renamed from: i */
    public boolean m28275i(Context context, String str) {
        return AbstractC6874o.m28290l(context, str);
    }

    /* renamed from: j */
    public boolean mo28259j(int i7) {
        return AbstractC6874o.m28288j(i7);
    }

    /* renamed from: k */
    public void m28276k(Context context, int i7) {
        AbstractC6874o.m28279a(context, i7);
    }
}
