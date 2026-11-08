package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6510i;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacv extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final String zzu;

    public zzacv(String str) {
        super(2);
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "signInAnonymously";
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
        zzadoVar.zzd(this.zzu, this.zzb);
    }
}
