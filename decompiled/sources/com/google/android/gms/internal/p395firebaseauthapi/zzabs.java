package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.InterfaceC6500d;
import p354u3.C6611D0;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzabs extends zzaeg<InterfaceC6500d, InterfaceC6679u0> {
    private final String zzu;
    private final String zzv;

    public zzabs(String str, String str2) {
        super(4);
        AbstractC3802r.m15124f(str, "code cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(new C6611D0(this.zzm));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzd(this.zzu, this.zzv, this.zzb);
    }
}
