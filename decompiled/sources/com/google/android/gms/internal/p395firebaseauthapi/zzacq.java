package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6502e;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacq extends zzaeg<Void, InterfaceC6679u0> {
    private final zzagn zzu;

    public zzacq(String str, C6502e c6502e) {
        super(6);
        AbstractC3802r.m15124f(str, "token cannot be null or empty");
        zzagn zzagnVar = new zzagn(4);
        this.zzu = zzagnVar;
        zzagnVar.zzd(str);
        if (c6502e != null) {
            zzagnVar.zza(c6502e);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
