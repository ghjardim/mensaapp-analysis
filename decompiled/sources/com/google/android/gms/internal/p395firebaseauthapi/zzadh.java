package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzadh extends zzaeg<Void, InterfaceC6679u0> {
    private final String zzu;

    public zzadh(String str) {
        super(2);
        this.zzu = AbstractC3802r.m15124f(str, "email cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "updateEmail";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzd.zze(), this.zzu, this.zzb);
    }
}
