package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class zzku implements zzll {
    private final int zza;

    public zzku(int i7) {
        if (i7 == 16 || i7 == 32) {
            this.zza = i7;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i7);
        }
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzll
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzll
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzll
    public final byte[] zzc() {
        int i7 = this.zza;
        if (i7 == 16) {
            return zzlu.zzi;
        }
        if (i7 == 32) {
            return zzlu.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, byte[] bArr4) {
        if (bArr.length == this.zza) {
            return new zzhk(bArr).zza(bArr2, bArr3, i7, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }
}
