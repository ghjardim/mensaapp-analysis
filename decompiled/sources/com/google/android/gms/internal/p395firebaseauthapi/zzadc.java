package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzadc extends zzaeg<Void, InterfaceC6679u0> {
    private final String zzu;
    private final String zzv;
    private final String zzw;

    public zzadc(String str, String str2, String str3) {
        super(2);
        this.zzu = AbstractC3802r.m15123e(str);
        this.zzv = AbstractC3802r.m15123e(str2);
        this.zzw = str3;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "unenrollMfa";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, zzabq.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzv, this.zzw, this.zzb);
    }
}
