package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.C6654i;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzack extends zzaeg<Void, InterfaceC6679u0> {
    private final String zzu;
    private final String zzv;
    private final String zzw;
    private final String zzx;

    public zzack(String str, String str2, String str3, String str4) {
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
        return "reauthenticateWithEmailPassword";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        C6654i zza = zzabq.zza(this.zzc, this.zzk);
        if (!this.zzd.mo26979a().equalsIgnoreCase(zza.mo26979a())) {
            zza(new Status(17024));
        } else {
            ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzv, this.zzw, this.zzx, this.zzb);
    }
}
