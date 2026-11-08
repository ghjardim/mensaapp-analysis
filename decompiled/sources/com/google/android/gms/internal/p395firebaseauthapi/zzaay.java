package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaay implements zzaew<zzagb> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzaay(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagb zzagbVar) {
        zzagb zzagbVar2 = zzagbVar;
        this.zzb.zza(new zzagw(zzagbVar2.zzb(), zzagbVar2.zza(), Long.valueOf(zzagy.zza(zzagbVar2.zza())), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
    }
}
