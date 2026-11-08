package com.google.android.gms.internal.p395firebaseauthapi;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;

/* loaded from: classes.dex */
public final class zzafa {
    private final FirebaseAuth zza;
    private final Activity zzb;

    public zzafa(FirebaseAuth firebaseAuth, Activity activity) {
        this.zza = firebaseAuth;
        this.zzb = activity;
    }

    public final void zza() {
        Intent intent = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent.setClass(this.zzb, RecaptchaActivity.class);
        intent.setPackage(this.zzb.getPackageName());
        intent.putExtra("com.google.firebase.auth.KEY_API_KEY", this.zza.m15359l().m17534r().m17547b());
        if (!TextUtils.isEmpty(this.zza.m15369q())) {
            intent.putExtra("com.google.firebase.auth.KEY_TENANT_ID", this.zza.m15369q());
        }
        intent.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
        intent.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", this.zza.m15359l().m17533q());
        intent.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", this.zza.m15363n());
        this.zzb.startActivity(intent);
    }
}
