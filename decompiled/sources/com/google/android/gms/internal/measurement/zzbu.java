package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
final class zzbu extends zzcb {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzcb zza(String str) {
        this.zza = StringUtils.EMPTY;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zzb(boolean z6) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcc zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzbw(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zzd(int i7) {
        this.zzc = i7;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final zzcb zze(int i7) {
        this.zzd = 1;
        return this;
    }
}
