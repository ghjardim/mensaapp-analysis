package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzwf;

/* loaded from: classes.dex */
public final class zzcs {
    public static final zzwf zza = zza(16);
    public static final zzwf zzb;

    static {
        zza(32);
        zza(16, 16);
        zza(32, 16);
        zzvc zzvcVar = zzvc.SHA256;
        zzb = zza(16, 16, 32, 16, zzvcVar);
        zza(32, 16, 32, 32, zzvcVar);
        zzwf.zza zza2 = zzwf.zza().zza(zzec.zza());
        zzxd zzxdVar = zzxd.TINK;
    }

    private static zzwf zza(int i7, int i8, int i9, int i10, zzvc zzvcVar) {
        zzss zzssVar = (zzss) ((zzakg) zzss.zzb().zza((zzsv) ((zzakg) zzsv.zzb().zza(16).zze())).zza(i7).zze());
        return (zzwf) ((zzakg) zzwf.zza().zza(((zzsm) ((zzakg) zzsm.zza().zza(zzssVar).zza((zzve) ((zzakg) zzve.zzc().zza((zzvh) ((zzakg) zzvh.zzc().zza(zzvcVar).zza(i10).zze())).zza(32).zze())).zze())).zzj()).zza(zzcy.zza()).zza(zzxd.TINK).zze());
    }

    private static zzwf zza(int i7, int i8) {
        return (zzwf) ((zzakg) zzwf.zza().zza(((zztb) ((zzakg) zztb.zzb().zza(i7).zza((zzte) ((zzakg) zzte.zzb().zza(16).zze())).zze())).zzj()).zza(zzdg.zza()).zza(zzxd.TINK).zze());
    }

    private static zzwf zza(int i7) {
        return (zzwf) ((zzakg) zzwf.zza().zza(((zztk) ((zzakg) zztk.zzc().zza(i7).zze())).zzj()).zza(zzdn.zza()).zza(zzxd.TINK).zze());
    }
}
