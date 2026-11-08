package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6483O;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzadj extends zzaeg<Void, InterfaceC6679u0> {
    private final C6483O zzu;

    public zzadj(C6483O c6483o) {
        super(2);
        this.zzu = (C6483O) AbstractC3802r.m15129k(c6483o);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(new zzaha(this.zzd.zze(), zzaex.zza(this.zzu)), this.zzb);
    }
}
