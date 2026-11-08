package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6502e;

/* loaded from: classes.dex */
final class zzadl extends zzaeg<Void, Void> {
    private final zzagn zzu;

    public zzadl(String str, String str2, C6502e c6502e) {
        super(6);
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        AbstractC3802r.m15129k(c6502e);
        this.zzu = zzagn.zza(c6502e, str, str2);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzc(this.zzu, this.zzb);
    }
}
