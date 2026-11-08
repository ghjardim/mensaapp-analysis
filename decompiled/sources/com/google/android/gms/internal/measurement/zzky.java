package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzky extends zzlb {
    private final int zzc;

    public zzky(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzld.zzh(0, i8, bArr.length);
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zza(int i7) {
        int i8 = this.zzc;
        if (((i8 - (i7 + 1)) | i7) >= 0) {
            return ((zzlb) this).zza[i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i7);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i7 + ", " + i8);
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zzb(int i7) {
        return ((zzlb) this).zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final int zzd() {
        return this.zzc;
    }
}
