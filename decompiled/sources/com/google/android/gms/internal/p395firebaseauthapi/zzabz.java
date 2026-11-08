package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.AbstractC6474I;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzabz extends zzaeg<Void, InterfaceC6679u0> {
    private final AbstractC6474I zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzabz(AbstractC6474I abstractC6474I, String str, String str2, String str3) {
        super(2);
        this.zzu = (AbstractC6474I) AbstractC3802r.m15129k(abstractC6474I);
        this.zzv = AbstractC3802r.m15123e(str);
        this.zzw = str2;
        this.zzx = str3;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
