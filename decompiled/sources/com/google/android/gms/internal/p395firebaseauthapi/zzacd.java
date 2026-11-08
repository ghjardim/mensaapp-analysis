package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
final class zzacd extends zzaeg<zzagt, Void> {
    private final zzagu zzu;

    public zzacd(String str, String str2) {
        super(10);
        AbstractC3802r.m15123e(str2);
        this.zzu = zzagu.zza(str, str2);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "getRecaptchaConfig";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(this.zzr);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
