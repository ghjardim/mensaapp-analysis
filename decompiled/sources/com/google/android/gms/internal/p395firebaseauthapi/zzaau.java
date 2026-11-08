package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzaau implements zzaew<zzaie> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzaau(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaie zzaieVar) {
        zzaie zzaieVar2 = zzaieVar;
        if (!zzaieVar2.zzl()) {
            zzzv.zza(this.zzb, zzaieVar2, this.zza, this);
        } else {
            this.zza.zza(new zzzs(zzaieVar2.zzf(), zzaieVar2.zzk(), zzaieVar2.zzb()));
        }
    }
}
