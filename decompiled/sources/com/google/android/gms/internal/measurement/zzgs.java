package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgs extends zzmd implements zzni {
    private static final zzgs zzb;
    private int zzd;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;

    static {
        zzgs zzgsVar = new zzgs();
        zzb = zzgsVar;
        zzmd.zzct(zzgs.class, zzgsVar);
    }

    private zzgs() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new zzgs();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgr(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
