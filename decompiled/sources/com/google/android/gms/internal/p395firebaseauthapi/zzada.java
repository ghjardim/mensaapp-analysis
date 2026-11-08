package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p354u3.C6668p;

/* loaded from: classes.dex */
final class zzada extends zzaeg<zzahs, Void> {
    private final zzahv zzu;

    public zzada(C6668p c6668p, String str) {
        super(12);
        AbstractC3802r.m15129k(c6668p);
        this.zzu = zzahv.zza(AbstractC3802r.m15123e(c6668p.m27574A0()), str);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "startMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(this.zzt);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zza(this.zzu, this.zzb);
    }
}
