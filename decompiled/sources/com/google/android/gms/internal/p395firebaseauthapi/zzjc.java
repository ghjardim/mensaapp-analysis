package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzjc implements zzbk {
    private final zzpg<zzbk> zza;
    private final zznv zzb;

    public zzjc(zzpg<zzbk> zzpgVar) {
        this.zza = zzpgVar;
        if (!zzpgVar.zzf()) {
            this.zzb = zzny.zza;
            return;
        }
        zzns zza = zzoj.zzb().zza();
        zznu zza2 = zzny.zza(zzpgVar);
        zza.zza(zza2, "daead", "encrypt");
        this.zzb = zza.zza(zza2, "daead", "decrypt");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            for (zzpi<zzbk> zzpiVar : this.zza.zza(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] zza = zzpiVar.zzd().zza(bArr, bArr2);
                    this.zzb.zza(zzpiVar.zza(), bArr.length);
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzpi<zzbk> zzpiVar2 : this.zza.zza(zzbi.zza)) {
            try {
                byte[] zza2 = zzpiVar2.zzd().zza(bArr, bArr2);
                this.zzb.zza(zzpiVar2.zza(), bArr.length);
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        this.zzb.zza();
        throw new GeneralSecurityException("decryption failed");
    }
}
