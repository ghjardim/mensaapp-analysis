package p346t3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.internal.p395firebaseauthapi.zzaed;
import com.google.android.gms.internal.p395firebaseauthapi.zzafm;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: t3.N */
/* loaded from: classes.dex */
public class C6482N extends AbstractC6520n {

    /* renamed from: a */
    public final Bundle f23379a;

    /* renamed from: t3.N$a */
    public static class a {

        /* renamed from: a */
        public final FirebaseAuth f23380a;

        /* renamed from: b */
        public final Bundle f23381b;

        /* renamed from: c */
        public final Bundle f23382c;

        /* renamed from: a */
        public a m27025a(Map map) {
            for (Map.Entry entry : map.entrySet()) {
                this.f23382c.putString((String) entry.getKey(), (String) entry.getValue());
            }
            return this;
        }

        /* renamed from: b */
        public C6482N m27026b() {
            return new C6482N(this.f23381b);
        }

        /* renamed from: c */
        public a m27027c(List list) {
            this.f23381b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList<>(list));
            return this;
        }

        public a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f23381b = bundle;
            Bundle bundle2 = new Bundle();
            this.f23382c = bundle2;
            this.f23380a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.m15359l().m17534r().m17547b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.m15369q());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.m15359l().m17533q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.m15363n());
        }
    }

    /* renamed from: t3.N$b */
    public static class b {

        /* renamed from: a */
        public final String f23383a;

        /* renamed from: b */
        public String f23384b;

        /* renamed from: c */
        public String f23385c;

        /* renamed from: d */
        public String f23386d;

        /* renamed from: a */
        public AbstractC6508h m27028a() {
            return C6543y0.m27137F0(this.f23383a, this.f23384b, this.f23385c, this.f23386d);
        }

        /* renamed from: b */
        public b m27029b(String str) {
            this.f23385c = str;
            return this;
        }

        /* renamed from: c */
        public b m27030c(String str) {
            this.f23384b = str;
            return this;
        }

        /* renamed from: d */
        public b m27031d(String str, String str2) {
            this.f23384b = str;
            this.f23386d = str2;
            return this;
        }

        public b(String str) {
            this.f23383a = str;
        }
    }

    /* renamed from: d */
    public static a m27019d(String str) {
        return m27020e(str, FirebaseAuth.getInstance());
    }

    /* renamed from: e */
    public static a m27020e(String str, FirebaseAuth firebaseAuth) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15129k(firebaseAuth);
        if (!"facebook.com".equals(str) || zzafm.zza(firebaseAuth.m15359l())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    /* renamed from: f */
    public static b m27021f(String str) {
        return new b(AbstractC3802r.m15123e(str));
    }

    @Override // p346t3.AbstractC6520n
    /* renamed from: a */
    public final void mo27022a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f23379a);
        activity.startActivity(intent);
    }

    @Override // p346t3.AbstractC6520n
    /* renamed from: b */
    public final void mo27023b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f23379a);
        activity.startActivity(intent);
    }

    @Override // p346t3.AbstractC6520n
    /* renamed from: c */
    public final void mo27024c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f23379a);
        activity.startActivity(intent);
    }

    public C6482N(Bundle bundle) {
        this.f23379a = bundle;
    }
}
