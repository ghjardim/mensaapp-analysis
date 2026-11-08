package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import p161X.AbstractActivityC2791u;
import p345t2.C6431A;
import p345t2.C6449r;

@KeepName
/* loaded from: classes.dex */
public class SignInHubActivity extends AbstractActivityC2791u {

    /* renamed from: N */
    public static boolean f12237N = false;

    /* renamed from: I */
    public boolean f12238I = false;

    /* renamed from: J */
    public SignInConfiguration f12239J;

    /* renamed from: K */
    public boolean f12240K;

    /* renamed from: L */
    public int f12241L;

    /* renamed from: M */
    public Intent f12242M;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* renamed from: l0 */
    public final void m14790l0() {
        m9928Z().mo17193c(0, null, new C6431A(this, null));
        f12237N = false;
    }

    /* renamed from: m0 */
    public final void m14791m0(int i7) {
        Status status = new Status(i7);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f12237N = false;
    }

    /* renamed from: n0 */
    public final void m14792n0(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f12239J);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f12238I = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            m14791m0(17);
        }
    }

    @Override // p161X.AbstractActivityC2791u, p191b.AbstractActivityC3486j, android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f12238I) {
            return;
        }
        setResult(0);
        if (i7 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.m14780x0() != null) {
                GoogleSignInAccount m14780x0 = signInAccount.m14780x0();
                C6449r m26940c = C6449r.m26940c(this);
                GoogleSignInOptions m14787x0 = this.f12239J.m14787x0();
                m14780x0.getClass();
                m26940c.m26945e(m14787x0, m14780x0);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", m14780x0);
                this.f12240K = true;
                this.f12241L = i8;
                this.f12242M = intent;
                m14790l0();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                m14791m0(intExtra);
                return;
            }
        }
        m14791m0(8);
    }

    @Override // p161X.AbstractActivityC2791u, p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            m14791m0(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f12239J = signInConfiguration;
        if (bundle == null) {
            if (f12237N) {
                setResult(0);
                m14791m0(12502);
                return;
            } else {
                f12237N = true;
                m14792n0(action);
                return;
            }
        }
        boolean z6 = bundle.getBoolean("signingInGoogleApiClients");
        this.f12240K = z6;
        if (z6) {
            this.f12241L = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f12242M = intent2;
            m14790l0();
        }
    }

    @Override // p161X.AbstractActivityC2791u, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f12237N = false;
    }

    @Override // p191b.AbstractActivityC3486j, p365w.AbstractActivityC6789e, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f12240K);
        if (this.f12240K) {
            bundle.putInt("signInResultCode", this.f12241L);
            bundle.putParcelable("signInResultData", this.f12242M);
        }
    }
}
