package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AbstractC3933b;

/* loaded from: classes.dex */
final class zzadn extends zzaeg<Void, AbstractC3933b.b> {
    private final zzahk zzu;

    public zzadn(zzahk zzahkVar) {
        super(8);
        AbstractC3802r.m15129k(zzahkVar);
        this.zzu = zzahkVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
