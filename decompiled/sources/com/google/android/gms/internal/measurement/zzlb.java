package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
class zzlb extends zzla {
    protected final byte[] zza;

    public zzlb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzld) || zzd() != ((zzld) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzlb)) {
            return obj.equals(this);
        }
        zzlb zzlbVar = (zzlb) obj;
        int zzi = zzi();
        int zzi2 = zzlbVar.zzi();
        if (zzi != 0 && zzi2 != 0 && zzi != zzi2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzlbVar.zzd()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzlbVar.zzd());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlbVar.zza;
        zzlbVar.zzc();
        int i7 = 0;
        int i8 = 0;
        while (i7 < zzd) {
            if (bArr[i7] != bArr2[i8]) {
                return false;
            }
            i7++;
            i8++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final int zze(int i7, int i8, int i9) {
        return zzmk.zzb(i7, this.zza, 0, i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final zzld zzf(int i7, int i8) {
        int zzh = zzld.zzh(0, i8, zzd());
        return zzh == 0 ? zzld.zzb : new zzky(this.zza, 0, zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzld
    public final void zzg(zzkv zzkvVar) {
        ((zzlh) zzkvVar).zzc(this.zza, 0, zzd());
    }
}
