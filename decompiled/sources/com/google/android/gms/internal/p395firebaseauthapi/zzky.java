package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzdr;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* loaded from: classes.dex */
final class zzky implements zzla {
    private final int zza;

    public zzky(zzdr zzdrVar) {
        if (zzdrVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdrVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdrVar.zzf() != zzdr.zza.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdrVar.zzc();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzla
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        if (bArr2.length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey zzb = zzgl.zzb(bArr);
        int i8 = i7 + 12;
        if (bArr2.length < i7 + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza = zzgl.zza(bArr2, i7, 12);
        Cipher zza2 = zzgl.zza();
        zza2.init(2, zzb, zza);
        return zza2.doFinal(bArr2, i8, (bArr2.length - i7) - 12);
    }
}
