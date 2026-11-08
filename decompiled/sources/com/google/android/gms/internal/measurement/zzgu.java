package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzgu extends zzmd implements zzni {
    private static final zzgu zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;

    static {
        zzgu zzguVar = new zzgu();
        zzb = zzguVar;
        zzmd.zzct(zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzgu();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgt(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
