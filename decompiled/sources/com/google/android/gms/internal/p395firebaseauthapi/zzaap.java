package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaap implements zzaew<zzagw> {
    final /* synthetic */ zzzv zza;
    private final /* synthetic */ zzaic zzb;
    private final /* synthetic */ zzadp zzc;

    public zzaap(zzzv zzzvVar, zzaic zzaicVar, zzadp zzadpVar) {
        this.zzb = zzaicVar;
        this.zzc = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzc.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        this.zzb.zzb(true);
        this.zzb.zza(zzagwVar.zzc());
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(this.zzb, new zzaao(this, this.zzc, this));
    }
}
