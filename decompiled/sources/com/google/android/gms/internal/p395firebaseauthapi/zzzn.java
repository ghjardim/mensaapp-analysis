package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzzn {
    private final byte[] zza;

    private zzzn(byte[] bArr, int i7, int i8) {
        byte[] bArr2 = new byte[i8];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i8);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzzn) {
            return Arrays.equals(((zzzn) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "Bytes(" + zzza.zza(this.zza) + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static zzzn zza(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzzn(bArr, 0, length);
    }
}
