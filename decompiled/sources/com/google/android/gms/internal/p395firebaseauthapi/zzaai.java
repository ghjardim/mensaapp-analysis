package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaai implements zzaew<zzaik> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzaai(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaik zzaikVar) {
        zzaik zzaikVar2 = zzaikVar;
        this.zzb.zza(new zzagw(zzaikVar2.zzd(), zzaikVar2.zzb(), Long.valueOf(zzaikVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzaikVar2.zzf()), null, this.zza, this);
    }
}
