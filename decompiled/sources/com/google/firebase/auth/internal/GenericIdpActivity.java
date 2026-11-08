package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p395firebaseauthapi.zza;
import com.google.android.gms.internal.p395firebaseauthapi.zzadq;
import com.google.android.gms.internal.p395firebaseauthapi.zzads;
import com.google.android.gms.internal.p395firebaseauthapi.zzadv;
import com.google.android.gms.internal.p395firebaseauthapi.zzafm;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p031E2.AbstractC0265a;
import p031E2.AbstractC0273i;
import p031E2.C0271g;
import p137T3.InterfaceC2447b;
import p161X.AbstractActivityC2791u;
import p219e3.C4176f;
import p224f0.C4225a;
import p262j3.AbstractC5368d;
import p303o3.InterfaceC5939b;
import p326r.C6233c;
import p354u3.AbstractC6661l0;
import p354u3.AbstractC6672r;
import p354u3.C6605A0;
import p354u3.C6628P;
import p354u3.C6659k0;
import p354u3.C6685x0;
import p354u3.C6689z0;
import p382y2.AbstractC7069e;

@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends AbstractActivityC2791u implements zzads {

    /* renamed from: J */
    public static long f12860J;

    /* renamed from: K */
    public static final C6659k0 f12861K = C6659k0.m27559f();

    /* renamed from: I */
    public boolean f12862I = false;

    /* renamed from: k0 */
    public static /* synthetic */ Uri m15414k0(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC5368d abstractC5368d = (AbstractC5368d) task.getResult();
            if (abstractC5368d.mo22073a() != null) {
                Log.w("GenericIdpActivity", "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC5368d.mo22073a()));
            }
            buildUpon.fragment("fac=" + abstractC5368d.mo22074b());
        } else {
            Log.e("GenericIdpActivity", "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    /* renamed from: l0 */
    public static String m15415l0(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    jSONObject.put(str, string);
                }
            }
        } catch (JSONException unused) {
            Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
        }
        return jSONObject.toString();
    }

    /* renamed from: n0 */
    public static /* synthetic */ void m15416n0(GenericIdpActivity genericIdpActivity, String str, Task task) {
        if (genericIdpActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
            zzadv.zzb(genericIdpActivity, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = genericIdpActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            C6233c m26000a = new C6233c.d().m26000a();
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a custom chrome tab.");
            m26000a.m25996a(genericIdpActivity, (Uri) task.getResult());
        } else {
            Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
            intent.putExtra("com.android.browser.application_id", str);
            Log.i("GenericIdpActivity", "Opening IDP Sign In link in a browser window.");
            intent.addFlags(1073741824);
            intent.addFlags(268435456);
            genericIdpActivity.startActivity(intent);
        }
    }

    /* renamed from: j0 */
    public final Uri.Builder m15417j0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        String m15415l0 = m15415l0(intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS"));
        String uuid = UUID.randomUUID().toString();
        String zza = zzadv.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str3 = join;
        C6685x0.m27593b().m27597e(getApplicationContext(), str, uuid, zza, action, stringExtra2, stringExtra3, stringExtra4);
        String m27600a = C6689z0.m27599c(getApplicationContext(), C4176f.m17518p(stringExtra4).m17535s()).m27600a();
        if (TextUtils.isEmpty(m27600a)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            m15418m0(AbstractC6672r.m27577a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (zza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", zza).appendQueryParameter("eventId", uuid).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m27600a);
        if (!TextUtils.isEmpty(str3)) {
            builder.appendQueryParameter("scopes", str3);
        }
        if (!TextUtils.isEmpty(m15415l0)) {
            builder.appendQueryParameter("customParameters", m15415l0);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    /* renamed from: m0 */
    public final void m15418m0(Status status) {
        f12860J = 0L;
        this.f12862I = false;
        Intent intent = new Intent();
        AbstractC6661l0.m27567c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m15419o0(intent)) {
            f12861K.m27560a(this);
        } else {
            C6628P.m27506b(getApplicationContext(), status);
        }
        finish();
    }

    /* renamed from: o0 */
    public final boolean m15419o0(Intent intent) {
        return C4225a.m17659b(this).m17662d(intent);
    }

    @Override // p161X.AbstractActivityC2791u, p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            m15420p0();
            return;
        }
        long mo1110a = C0271g.m1116d().mo1110a();
        if (mo1110a - f12860J < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f12860J = mo1110a;
        if (bundle != null) {
            this.f12862I = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // p191b.AbstractActivityC3486j, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // p161X.AbstractActivityC2791u, android.app.Activity
    public void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f12862I) {
                m15420p0();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC0273i.m1125b(AbstractC0265a.m1094a(this, packageName)).toLowerCase(Locale.US);
                C4176f m17518p = C4176f.m17518p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m17518p);
                if (zzafm.zza(m17518p)) {
                    zza(m15417j0(Uri.parse(zzafm.zza(m17518p.m17534r().m17547b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m15376u0());
                } else {
                    new zzadq(packageName, lowerCase, getIntent(), m17518p, this).executeOnExecutor(firebaseAuth.m15314C0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + StringUtils.SPACE + String.valueOf(e7));
                zzadv.zzb(this, packageName);
            }
            this.f12862I = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            m15418m0(AbstractC6661l0.m27566b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            m15420p0();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        C6605A0 m27595c = C6685x0.m27593b().m27595c(this, packageName2, stringExtra2);
        if (m27595c == null) {
            m15420p0();
        }
        if (booleanExtra) {
            stringExtra = C6689z0.m27599c(getApplicationContext(), C4176f.m17518p(m27595c.m27483a()).m17535s()).m27601b(stringExtra);
        }
        zzaic zzaicVar = new zzaic(m27595c, stringExtra);
        String m27487e = m27595c.m27487e();
        String m27484b = m27595c.m27484b();
        zzaicVar.zzb(m27487e);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(m27484b) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(m27484b) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(m27484b)) {
            Log.e("GenericIdpActivity", "unsupported operation: " + m27484b);
            m15420p0();
            return;
        }
        f12860J = 0L;
        this.f12862I = false;
        Intent intent2 = new Intent();
        AbstractC7069e.m29147e(zzaicVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", m27484b);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m15419o0(intent2)) {
            f12861K.m27560a(this);
        } else {
            C6628P.m27507c(getApplicationContext(), zzaicVar, m27484b, m27487e);
        }
        finish();
    }

    @Override // p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f12862I);
    }

    /* renamed from: p0 */
    public final void m15420p0() {
        f12860J = 0L;
        this.f12862I = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m15419o0(intent)) {
            f12861K.m27560a(this);
        } else {
            C6628P.m27506b(this, AbstractC6672r.m27577a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m15417j0(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final String zza(String str) {
        return zzafm.zzb(str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final void zza(String str, Status status) {
        if (status == null) {
            m15420p0();
        } else {
            m15418m0(status);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final void zza(final Uri uri, final String str, InterfaceC2447b interfaceC2447b) {
        Task forResult;
        InterfaceC5939b interfaceC5939b = (InterfaceC5939b) interfaceC2447b.get();
        if (interfaceC5939b != null) {
            forResult = interfaceC5939b.mo23363b(false).continueWith(new Continuation() { // from class: u3.J
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return GenericIdpActivity.m15414k0(uri, task);
                }
            });
        } else {
            forResult = Tasks.forResult(uri);
        }
        forResult.addOnCompleteListener(new OnCompleteListener() { // from class: u3.K
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                GenericIdpActivity.m15416n0(GenericIdpActivity.this, str, task);
            }
        });
    }
}
