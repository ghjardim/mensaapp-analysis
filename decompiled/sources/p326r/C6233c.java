package p326r;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.LocaleList;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import p326r.C6231a;
import p372x.AbstractC6935a;

/* renamed from: r.c */
/* loaded from: classes.dex */
public final class C6233c {

    /* renamed from: a */
    public final Intent f22266a;

    /* renamed from: b */
    public final Bundle f22267b;

    /* renamed from: r.c$a */
    public static class a {
        /* renamed from: a */
        public static ActivityOptions m25997a() {
            return ActivityOptions.makeBasic();
        }
    }

    /* renamed from: r.c$b */
    public static class b {
        /* renamed from: a */
        public static String m25998a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    /* renamed from: r.c$c */
    public static class c {
        /* renamed from: a */
        public static void m25999a(ActivityOptions activityOptions, boolean z6) {
            activityOptions.setShareIdentityEnabled(z6);
        }
    }

    /* renamed from: r.c$d */
    public static final class d {

        /* renamed from: c */
        public ArrayList f22270c;

        /* renamed from: d */
        public ActivityOptions f22271d;

        /* renamed from: e */
        public ArrayList f22272e;

        /* renamed from: f */
        public SparseArray f22273f;

        /* renamed from: g */
        public Bundle f22274g;

        /* renamed from: j */
        public boolean f22277j;

        /* renamed from: a */
        public final Intent f22268a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C6231a.a f22269b = new C6231a.a();

        /* renamed from: h */
        public int f22275h = 0;

        /* renamed from: i */
        public boolean f22276i = true;

        /* renamed from: a */
        public C6233c m26000a() {
            if (!this.f22268a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m26002c(null, null);
            }
            ArrayList<? extends Parcelable> arrayList = this.f22270c;
            if (arrayList != null) {
                this.f22268a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<? extends Parcelable> arrayList2 = this.f22272e;
            if (arrayList2 != null) {
                this.f22268a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f22268a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f22276i);
            this.f22268a.putExtras(this.f22269b.m25993a().m25992a());
            Bundle bundle = this.f22274g;
            if (bundle != null) {
                this.f22268a.putExtras(bundle);
            }
            if (this.f22273f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f22273f);
                this.f22268a.putExtras(bundle2);
            }
            this.f22268a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f22275h);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 24) {
                m26001b();
            }
            if (i7 >= 34) {
                m26003d();
            }
            ActivityOptions activityOptions = this.f22271d;
            return new C6233c(this.f22268a, activityOptions != null ? activityOptions.toBundle() : null);
        }

        /* renamed from: b */
        public final void m26001b() {
            String m25998a = b.m25998a();
            if (TextUtils.isEmpty(m25998a)) {
                return;
            }
            Bundle bundleExtra = this.f22268a.hasExtra("com.android.browser.headers") ? this.f22268a.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (bundleExtra.containsKey("Accept-Language")) {
                return;
            }
            bundleExtra.putString("Accept-Language", m25998a);
            this.f22268a.putExtra("com.android.browser.headers", bundleExtra);
        }

        /* renamed from: c */
        public final void m26002c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f22268a.putExtras(bundle);
        }

        /* renamed from: d */
        public final void m26003d() {
            if (this.f22271d == null) {
                this.f22271d = a.m25997a();
            }
            c.m25999a(this.f22271d, this.f22277j);
        }

        /* renamed from: e */
        public d m26004e(boolean z6) {
            this.f22268a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z6 ? 1 : 0);
            return this;
        }
    }

    public C6233c(Intent intent, Bundle bundle) {
        this.f22266a = intent;
        this.f22267b = bundle;
    }

    /* renamed from: a */
    public void m25996a(Context context, Uri uri) {
        this.f22266a.setData(uri);
        AbstractC6935a.startActivity(context, this.f22266a, this.f22267b);
    }
}
