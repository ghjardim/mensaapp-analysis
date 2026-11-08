package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzlz implements zzbm {
    private zzlz(zzbm zzbmVar, byte[] bArr) {
    }

    public static zzbm zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzbm zzbmVar = (zzbm) zzcj.zza((zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze()), zzbm.class);
        zzxd zzc = zza.zzc();
        int i7 = zzly.zza[zzc.ordinal()];
        if (i7 == 1) {
            zzb = zzor.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzor.zza(zznnVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + String.valueOf(zzc));
            }
            zzb = zzor.zzb(zznnVar.zza().intValue()).zzb();
        }
        return new zzlz(zzbmVar, zzb);
    }
}
