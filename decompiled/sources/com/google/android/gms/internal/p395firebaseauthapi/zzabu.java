package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6510i;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzabu extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabu(String str, String str2, String str3, String str4) {
        super(2);
        AbstractC3802r.m15124f(str, "email cannot be null or empty");
        AbstractC3802r.m15124f(str2, "password cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
        this.zzw = str3;
        this.zzx = str4;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "createUserWithEmailAndPassword";
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
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
