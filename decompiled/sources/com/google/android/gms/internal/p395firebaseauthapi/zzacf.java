package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.AbstractC6508h;
import p346t3.InterfaceC6510i;
import p354u3.AbstractC6677t0;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacf extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final zzaic zzu;

    public zzacf(AbstractC6508h abstractC6508h) {
        super(2);
        AbstractC3802r.m15130l(abstractC6508h, "credential cannot be null");
        this.zzu = AbstractC6677t0.m27591a(abstractC6508h, null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "linkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        C6654i zza = zzabq.zza(this.zzc, this.zzk);
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zza);
        zzb(new C6621I0(zza));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzd.zze(), this.zzu, this.zzb);
    }
}
