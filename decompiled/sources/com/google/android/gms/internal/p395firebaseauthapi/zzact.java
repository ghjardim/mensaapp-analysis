package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6502e;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzact extends zzaeg<Void, InterfaceC6679u0> {
    private final zzagn zzu;
    private final String zzv;

    public zzact(String str, C6502e c6502e, String str2, String str3, String str4) {
        super(4);
        AbstractC3802r.m15124f(str, "email cannot be null or empty");
        zzagn zzagnVar = new zzagn(c6502e.m27081F0());
        this.zzu = zzagnVar;
        zzagnVar.zzb(str);
        zzagnVar.zza(c6502e);
        zzagnVar.zzc(str2);
        zzagnVar.zza(str3);
        this.zzv = str4;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzb);
    }
}
