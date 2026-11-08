package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zznr implements zzne {
    private final zznh zza;
    private final String zzb;
    private final Object[] zzc;
    private final int zzd;

    public zznr(zznh zznhVar, String str, Object[] objArr) {
        this.zza = zznhVar;
        this.zzb = str;
        this.zzc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zzd = charAt;
            return;
        }
        int i7 = charAt & 8191;
        int i8 = 1;
        int i9 = 13;
        while (true) {
            int i10 = i8 + 1;
            char charAt2 = str.charAt(i8);
            if (charAt2 < 55296) {
                this.zzd = i7 | (charAt2 << i9);
                return;
            } else {
                i7 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i8 = i10;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final zznh zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final boolean zzb() {
        return (this.zzd & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzne
    public final int zzc() {
        int i7 = this.zzd;
        if ((i7 & 1) != 0) {
            return 1;
        }
        return (i7 & 4) == 4 ? 3 : 2;
    }

    public final String zzd() {
        return this.zzb;
    }

    public final Object[] zze() {
        return this.zzc;
    }
}
