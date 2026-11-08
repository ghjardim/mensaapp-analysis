package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public final class zzpm implements zzpq {
    private final zzzn zza;
    private final zzwf zzb;

    private zzpm(zzwf zzwfVar, zzzn zzznVar) {
        this.zzb = zzwfVar;
        this.zza = zzznVar;
    }

    public static zzpm zza(zzwf zzwfVar) {
        return new zzpm(zzwfVar, zzpy.zza(zzwfVar.zzf()));
    }

    public static zzpm zzb(zzwf zzwfVar) {
        return new zzpm(zzwfVar, zzpy.zzb(zzwfVar.zzf()));
    }

    public final zzwf zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpq
    public final zzzn zzb() {
        return this.zza;
    }
}
