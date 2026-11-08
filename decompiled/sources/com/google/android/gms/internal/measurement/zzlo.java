package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlo {
    private final Object zza;
    private final int zzb;

    public zzlo(Object obj, int i7) {
        this.zza = obj;
        this.zzb = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlo)) {
            return false;
        }
        zzlo zzloVar = (zzlo) obj;
        return this.zza == zzloVar.zza && this.zzb == zzloVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
