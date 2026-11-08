package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzjk implements zzbk {
    private final zzbk zza;
    private final zzxd zzb;
    private final byte[] zzc;

    private zzjk(zzbk zzbkVar, zzxd zzxdVar, byte[] bArr) {
        this.zza = zzbkVar;
        this.zzb = zzxdVar;
        this.zzc = bArr;
    }

    public static zzbk zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzwb zzwbVar = (zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpr.zza();
        zzbk zzbkVar = (zzbk) zzpr.zza(zzwbVar, zzbk.class);
        zzxd zzc = zza.zzc();
        int i7 = zzjj.zza[zzc.ordinal()];
        if (i7 == 1) {
            zzb = zzor.zza.zzb();
        } else if (i7 == 2 || i7 == 3) {
            zzb = zzor.zza(zznnVar.zza().intValue()).zzb();
        } else {
            if (i7 != 4) {
                throw new GeneralSecurityException("unknown output prefix type " + zzc.zza());
            }
            zzb = zzor.zzb(zznnVar.zza().intValue()).zzb();
        }
        return new zzjk(zzbkVar, zzc, zzb);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (this.zzb == zzxd.RAW) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpy.zza(this.zzc, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
