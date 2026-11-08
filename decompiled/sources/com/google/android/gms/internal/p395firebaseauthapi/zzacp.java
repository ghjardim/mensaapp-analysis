package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6483O;
import p346t3.InterfaceC6510i;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacp extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final zzzr zzu;

    public zzacp(C6483O c6483o, String str) {
        super(2);
        AbstractC3802r.m15130l(c6483o, "credential cannot be null");
        this.zzu = new zzzr(c6483o.m27035C0(false), str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithPhoneCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        C6654i zza = zzabq.zza(this.zzc, this.zzk);
        if (!this.zzd.mo26979a().equalsIgnoreCase(zza.mo26979a())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zza);
            zzb(new C6621I0(zza));
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
