package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzaco extends zzaeg<Void, InterfaceC6679u0> {
    public zzaco() {
        super(2);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "reload";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzc(this.zzd.zze(), this.zzb);
    }
}
