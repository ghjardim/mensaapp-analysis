package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzabv extends zzaeg<Void, InterfaceC6679u0> {
    private final zzahd zzu;

    public zzabv(String str, String str2, String str3) {
        super(4);
        AbstractC3802r.m15124f(str, "code cannot be null or empty");
        AbstractC3802r.m15124f(str2, "new password cannot be null or empty");
        this.zzu = new zzahd(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "confirmPasswordReset";
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
