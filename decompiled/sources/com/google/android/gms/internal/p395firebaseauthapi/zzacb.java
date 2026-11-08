package com.google.android.gms.internal.p395firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import com.google.android.gms.tasks.TaskCompletionSource;
import p346t3.C6462C;
import p354u3.AbstractC6625M;
import p354u3.InterfaceC6679u0;

/* loaded from: classes.dex */
final class zzacb extends zzaeg<C6462C, InterfaceC6679u0> {
    private final String zzu;

    public zzacb(String str) {
        super(1);
        AbstractC3802r.m15124f(str, "refresh token cannot be null");
        this.zzu = str;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final String zza() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaeg
    public final void zzb() {
        if (TextUtils.isEmpty(this.zzj.zzd())) {
            this.zzj.zzc(this.zzu);
        }
        ((InterfaceC6679u0) this.zze).mo15386a(this.zzj, this.zzd);
        zzb(AbstractC6625M.m27502a(this.zzj.zzc()));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaer
    public final void zza(TaskCompletionSource taskCompletionSource, zzado zzadoVar) {
        this.zzg = new zzaeq(this, taskCompletionSource);
        zzadoVar.zzb(this.zzu, this.zzb);
    }
}
