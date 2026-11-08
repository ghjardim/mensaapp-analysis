package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6501d0;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzadi extends zzaeg<Void, InterfaceC6679u0> {
    private final C6501d0 zzu;

    public zzadi(C6501d0 c6501d0) {
        super(2);
        this.zzu = (C6501d0) AbstractC3802r.m15130l(c6501d0, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }
}
