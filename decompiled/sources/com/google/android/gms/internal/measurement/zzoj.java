package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzoj extends zzok {
    public zzoj(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final double zza(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final float zzb(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzc(Object obj, long j7, boolean z6) {
        if (zzol.zzb) {
            zzol.zzD(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzol.zzE(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzd(Object obj, long j7, byte b7) {
        if (zzol.zzb) {
            zzol.zzD(obj, j7, b7);
        } else {
            zzol.zzE(obj, j7, b7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zze(Object obj, long j7, double d7) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final void zzf(Object obj, long j7, float f7) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.gms.internal.measurement.zzok
    public final boolean zzg(Object obj, long j7) {
        return zzol.zzb ? zzol.zzt(obj, j7) : zzol.zzu(obj, j7);
    }
}
