package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzly implements zznf {
    private static final zzly zza = new zzly();

    private zzly() {
    }

    public static zzly zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final zzne zzb(Class cls) {
        if (!zzmd.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzne) zzmd.zzci(cls.asSubclass(zzmd.class)).zzl(3, null, null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznf
    public final boolean zzc(Class cls) {
        return zzmd.class.isAssignableFrom(cls);
    }
}
