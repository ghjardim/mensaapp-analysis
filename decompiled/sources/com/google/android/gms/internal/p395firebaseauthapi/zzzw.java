package com.google.android.gms.internal.p395firebaseauthapi;

import p354u3.AbstractC6672r;

/* loaded from: classes.dex */
final class zzzw implements zzaew<zzaii> {
    private final /* synthetic */ zzadp zza;
    private final /* synthetic */ zzzv zzb;

    public zzzw(zzzv zzzvVar, zzadp zzadpVar) {
        this.zza = zzadpVar;
        this.zzb = zzzvVar;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaet
    public final void zza(String str) {
        this.zza.zza(AbstractC6672r.m27577a(str));
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzaew
    public final /* synthetic */ void zza(zzaii zzaiiVar) {
        zzaii zzaiiVar2 = zzaiiVar;
        if (zzaiiVar2.zzf()) {
            this.zza.zza(new zzzs(zzaiiVar2.zzc(), zzaiiVar2.zze(), null));
        } else {
            this.zzb.zza(new zzagw(zzaiiVar2.zzd(), zzaiiVar2.zzb(), Long.valueOf(zzaiiVar2.zza()), "Bearer"), null, null, Boolean.FALSE, null, this.zza, this);
        }
    }
}
