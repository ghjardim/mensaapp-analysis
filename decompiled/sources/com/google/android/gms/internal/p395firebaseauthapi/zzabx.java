package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.InterfaceC6686y;

/* loaded from: classes.dex */
final class zzabx extends zzaeg<Void, InterfaceC6686y> {
    public zzabx() {
        super(5);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "delete";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6686y) this.zze).zza();
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzd.zze(), this.zzb);
    }
}
