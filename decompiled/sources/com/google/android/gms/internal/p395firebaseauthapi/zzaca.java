package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzaca extends zzaeg<zzags, Void> {
    private final zzagp zzu;

    public zzaca() {
        super(11);
        this.zzu = zzagp.zzb();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "getRecaptchaParam";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(this.zzs);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource<zzags> taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
