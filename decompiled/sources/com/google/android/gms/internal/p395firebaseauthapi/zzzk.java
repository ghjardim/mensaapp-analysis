package com.google.android.gms.internal.p395firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzzk implements zzbe {
    private final zzhp zza;
    private final byte[] zzb;

    private zzzk(byte[] bArr, byte[] bArr2) {
        this.zza = new zzhp(bArr);
        this.zzb = bArr2;
    }

    public static zzbe zza(zzfv zzfvVar) {
        return new zzzk(zzfvVar.zzd().zza(zzbl.zza()), zzfvVar.zzc().zzb());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.zza.zza(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbe
    public final byte[] zzb(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] zza = zzpp.zza(24);
        allocate.put(zza);
        this.zza.zza(allocate, zza, bArr, bArr2);
        byte[] array = allocate.array();
        byte[] bArr3 = this.zzb;
        return bArr3.length == 0 ? array : zzyc.zza(bArr3, array);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbe
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpy.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzb.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
