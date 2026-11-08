package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import p346t3.InterfaceC6489V;
import p354u3.C6678u;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzabw extends zzaeg<InterfaceC6489V, InterfaceC6679u0> {
    private final String zzu;
    private final String zzv;

    public zzabw(String str, String str2) {
        super(3);
        AbstractC3802r.m15124f(str, "email cannot be null or empty");
        this.zzu = str;
        this.zzv = str2;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        zzb(new C6678u(this.zzl.zza() == null ? zzaj.zzh() : (List) AbstractC3802r.m15129k(this.zzl.zza())));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zze(this.zzu, this.zzv, this.zzb);
    }
}
