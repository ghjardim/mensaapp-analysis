package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzlb implements zzla {
    private final zzit zza;
    private final int zzb;

    public zzlb(zzit zzitVar) {
        this.zza = zzitVar;
        this.zzb = zzitVar.zzb();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzla
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzla
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i7) {
        byte[] bArr3;
        if (bArr2.length < i7) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i7, bArr2.length);
        zzbk zza = zzya.zza(zzio.zzb().zza(this.zza).zza(zzzo.zza(bArr, zzbl.zza())).zza());
        bArr3 = zzkw.zza;
        return zza.zza(copyOfRange, bArr3);
    }
}
