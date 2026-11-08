package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6474I;
import p346t3.InterfaceC6510i;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzaby extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final AbstractC6474I zzu;
    private final String zzv;
    private final String zzw;

    public zzaby(AbstractC6474I abstractC6474I, String str, String str2) {
        super(2);
        this.zzu = (AbstractC6474I) AbstractC3802r.m15129k(abstractC6474I);
        this.zzv = AbstractC3802r.m15123e(str);
        this.zzw = str2;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        C6654i zza = zzabq.zza(this.zzc, this.zzk);
        AbstractC6458A abstractC6458A = this.zzd;
        if (abstractC6458A != null && !abstractC6458A.mo26979a().equalsIgnoreCase(zza.mo26979a())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zza);
            zzb(new C6621I0(zza));
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzv, this.zzu, this.zzw, this.zzb);
    }
}
