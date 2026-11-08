package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzabn implements zzaew<zzagw> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzadp zzb;
    private final /* synthetic */ zzzv zzc;

    public zzabn(zzzv zzzvVar, String str, zzadp zzadpVar) {
        this.zza = str;
        this.zzb = zzadpVar;
        this.zzc = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zzb.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzagw zzagwVar) {
        zzagw zzagwVar2 = zzagwVar;
        zzahm zzahmVar = new zzahm();
        zzahmVar.zzd(zzagwVar2.zzc()).zzc(this.zza);
        zzzv.zza(this.zzc, this.zzb, zzagwVar2, zzahmVar, this);
    }
}
