package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
final class zzaja extends zzajh {
    private final int zzc;
    private final int zzd;

    public zzaja(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzaiw.zza(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzajh, com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final byte zza(int i7) {
        int zzb = zzb();
        if (((zzb - (i7 + 1)) | i7) >= 0) {
            return this.zzb[this.zzc + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + zzb);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzajh, com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final byte zzb(int i7) {
        return this.zzb[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzajh
    public final int zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzajh, com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzajh, com.google.android.gms.internal.p395firebaseauthapi.zzaiw
    public final void zza(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zzb, zze(), bArr, 0, i9);
    }
}
