package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzhs implements zzbe {
    private final zzbe zza;
    private final byte[] zzb;

    private zzhs(zzbe zzbeVar, byte[] bArr) {
        this.zza = zzbeVar;
        if (bArr.length != 0 && bArr.length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzbe zza(zznn zznnVar) {
        byte[] zzb;
        zzpn zza = zznnVar.zza(zzbl.zza());
        zzwb zzwbVar = (zzwb) ((zzakg) zzwb.zza().zza(zza.zzf()).zza(zza.zzd()).zza(zza.zza()).zze());
        zzpr.zza();
        zzbe zzbeVar = (zzbe) zzpr.zza(zzwbVar, zzbe.class);
        zzxd zzc = zza.zzc();
        int i7 = zzhr.zza[zzc.ordinal()];
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
        return new zzhs(zzbeVar, zzb);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? this.zza.zzb(bArr, bArr2) : zzyc.zza(bArr3, this.zza.zzb(bArr, bArr2));
    }

    public static zzbe zza(zzbe zzbeVar, zzzn zzznVar) {
        return new zzhs(zzbeVar, zzznVar.zzb());
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzpy.zza(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}
