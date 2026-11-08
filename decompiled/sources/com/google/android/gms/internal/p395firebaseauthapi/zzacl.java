package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6512j;
import p346t3.InterfaceC6510i;
import p354u3.C6621I0;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacl extends zzaeg<InterfaceC6510i, InterfaceC6679u0> {
    private final zzafy zzu;

    public zzacl(C6512j c6512j, String str) {
        super(2);
        AbstractC3802r.m15130l(c6512j, "credential cannot be null or empty");
        this.zzu = new zzafy(c6512j, null, str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
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
