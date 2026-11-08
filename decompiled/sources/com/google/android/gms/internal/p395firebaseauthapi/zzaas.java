package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaas implements zzaew<zzagw> {
    final /* synthetic */ zzzv zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ String zzc;
    private final /* synthetic */ zzadp zzd;

    public zzaas(zzzv zzzvVar, String str, String str2, zzadp zzadpVar) {
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzadpVar;
        this.zza = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzd.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzaeu zzaeuVar;
        zzaij zzaijVar = new zzaij(zzagwVar.zzc(), this.zzb, this.zzc);
        zzaeuVar = this.zza.zza;
        zzaeuVar.zza(zzaijVar, new zzaav(this, this.zzd));
    }
}
