package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class zzpq extends zzpr {
    public zzpq(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final double zza(Object obj, long j7) {
        return Double.longBitsToDouble(this.zza.getLong(obj, j7));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final float zzb(Object obj, long j7) {
        return Float.intBitsToFloat(this.zza.getInt(obj, j7));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzc(Object obj, long j7, boolean z6) {
        if (zzps.zzb) {
            zzps.zzD(obj, j7, r3 ? (byte) 1 : (byte) 0);
        } else {
            zzps.zzE(obj, j7, r3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzd(Object obj, long j7, byte b7) {
        if (zzps.zzb) {
            zzps.zzD(obj, j7, b7);
        } else {
            zzps.zzE(obj, j7, b7);
        }
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zze(Object obj, long j7, double d7) {
        this.zza.putLong(obj, j7, Double.doubleToLongBits(d7));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final void zzf(Object obj, long j7, float f7) {
        this.zza.putInt(obj, j7, Float.floatToIntBits(f7));
    }

    @Override // com.google.android.recaptcha.internal.zzpr
    public final boolean zzg(Object obj, long j7) {
        return zzps.zzb ? zzps.zzt(obj, j7) : zzps.zzu(obj, j7);
    }
}
