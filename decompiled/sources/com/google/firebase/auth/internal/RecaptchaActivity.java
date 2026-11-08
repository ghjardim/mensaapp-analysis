package com.google.firebase.auth.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p395firebaseauthapi.zza;
import com.google.android.gms.internal.p395firebaseauthapi.zzadq;
import com.google.android.gms.internal.p395firebaseauthapi.zzads;
import com.google.android.gms.internal.p395firebaseauthapi.zzadv;
import com.google.android.gms.internal.p395firebaseauthapi.zzaee;
import com.google.android.gms.internal.p395firebaseauthapi.zzafm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.apache.tika.utils.StringUtils;
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
import p354u3.C6628P;
import p354u3.C6659k0;
import p354u3.C6685x0;
import p354u3.C6689z0;

/* loaded from: classes.dex */
public class RecaptchaActivity extends AbstractActivityC2791u implements zzads {

    /* renamed from: J */
    public static final String f12863J = "RecaptchaActivity";

    /* renamed from: K */
    public static long f12864K;

    /* renamed from: L */
    public static final C6659k0 f12865L = C6659k0.m27559f();

    /* renamed from: I */
    public boolean f12866I = false;

    /* renamed from: j0 */
    private final Uri.Builder m15421j0(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String uuid = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        C4176f m17518p = C4176f.m17518p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m17518p);
        C6685x0.m27593b().m27596d(getApplicationContext(), str, uuid, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String m27600a = C6689z0.m27599c(getApplicationContext(), m17518p.m17535s()).m27600a();
        if (TextUtils.isEmpty(m27600a)) {
            Log.e(f12863J, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            m15423l0(AbstractC6672r.m27577a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.m15367p()) ? firebaseAuth.m15367p() : zzaee.zza()).appendQueryParameter("eventId", uuid).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", m27600a);
        return builder;
    }

    /* renamed from: k0 */
    public static /* synthetic */ Uri m15422k0(Uri uri, Task task) {
        Uri.Builder buildUpon = uri.buildUpon();
        if (task.isSuccessful()) {
            AbstractC5368d abstractC5368d = (AbstractC5368d) task.getResult();
            if (abstractC5368d.mo22073a() != null) {
                Log.w(f12863J, "Error getting App Check token; using placeholder token instead. Error: " + String.valueOf(abstractC5368d.mo22073a()));
            }
            buildUpon.fragment("fac=" + abstractC5368d.mo22074b());
        } else {
            Log.e(f12863J, "Unexpected error getting App Check token: " + task.getException().getMessage());
        }
        return buildUpon.build();
    }

    /* renamed from: l0 */
    private final void m15423l0(Status status) {
        f12864K = 0L;
        this.f12866I = false;
        Intent intent = new Intent();
        AbstractC6661l0.m27567c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m15425n0(intent);
        f12865L.m27560a(this);
        finish();
    }

    /* renamed from: m0 */
    public static /* synthetic */ void m15424m0(RecaptchaActivity recaptchaActivity, String str, Task task) {
        if (recaptchaActivity.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f12863J, "Device cannot resolve intent for: android.intent.action.VIEW");
            zzadv.zzb(recaptchaActivity, str);
            return;
        }
        List<ResolveInfo> queryIntentServices = recaptchaActivity.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            C6233c m26000a = new C6233c.d().m26000a();
            m26000a.f22266a.addFlags(1073741824);
            m26000a.f22266a.addFlags(268435456);
            m26000a.m25996a(recaptchaActivity, (Uri) task.getResult());
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", (Uri) task.getResult());
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        recaptchaActivity.startActivity(intent);
    }

    /* renamed from: n0 */
    private final boolean m15425n0(Intent intent) {
        return C4225a.m17659b(this).m17662d(intent);
    }

    /* renamed from: o0 */
    private final void m15426o0() {
        f12864K = 0L;
        this.f12866I = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        m15425n0(intent);
        f12865L.m27560a(this);
        finish();
    }

    @Override // p161X.AbstractActivityC2791u, p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f12863J, "Could not do operation - unknown action: " + action);
            m15426o0();
            return;
        }
        long mo1110a = C0271g.m1116d().mo1110a();
        if (mo1110a - f12864K < 30000) {
            Log.e(f12863J, "Could not start operation - already in progress");
            return;
        }
        f12864K = mo1110a;
        if (bundle != null) {
            this.f12866I = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
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
            if (this.f12866I) {
                m15426o0();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC0273i.m1125b(AbstractC0265a.m1094a(this, packageName)).toLowerCase(Locale.US);
                C4176f m17518p = C4176f.m17518p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(m17518p);
                if (zzafm.zza(m17518p)) {
                    zza(m15421j0(Uri.parse(zzafm.zza(m17518p.m17534r().m17547b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.m15376u0());
                } else {
                    new zzadq(packageName, lowerCase, intent, m17518p, this).executeOnExecutor(firebaseAuth.m15314C0(), new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e7) {
                Log.e(f12863J, "Could not get package signature: " + packageName + StringUtils.SPACE + String.valueOf(e7));
                zzadv.zzb(this, packageName);
            }
            this.f12866I = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            m15423l0(AbstractC6661l0.m27566b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            m15426o0();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String m27598g = C6685x0.m27593b().m27598g(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(m27598g)) {
            Log.e(f12863J, "Failed to find registration for this event - failing to prevent session injection.");
            m15423l0(AbstractC6672r.m27577a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = C6689z0.m27599c(getApplicationContext(), C4176f.m17518p(m27598g).m17535s()).m27601b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f12864K = 0L;
        this.f12866I = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (m15425n0(intent3)) {
            f12865L.m27560a(this);
        } else {
            C6628P.m27510f(getApplicationContext(), queryParameter, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        }
        finish();
    }

    @Override // p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f12866I);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final Context zza() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return m15421j0(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            zzads.zza.m61c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final void zza(String str, Status status) {
        if (status == null) {
            m15426o0();
        } else {
            m15423l0(status);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzads
    public final void zza(final Uri uri, final String str, InterfaceC2447b interfaceC2447b) {
        Task forResult;
        InterfaceC5939b interfaceC5939b = (InterfaceC5939b) interfaceC2447b.get();
        if (interfaceC5939b != null) {
            forResult = interfaceC5939b.mo23363b(false).continueWith(new Continuation() { // from class: u3.U
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    return RecaptchaActivity.m15422k0(uri, task);
                }
            });
        } else {
            forResult = Tasks.forResult(uri);
        }
        forResult.addOnCompleteListener(new OnCompleteListener() { // from class: u3.S
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                RecaptchaActivity.m15424m0(RecaptchaActivity.this, str, task);
            }
        });
    }
}
