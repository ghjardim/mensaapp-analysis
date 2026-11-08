package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzhs extends zzmd implements zzni {
    private static final zzhs zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private zzhe zzg;

    static {
        zzhs zzhsVar = new zzhs();
        zzb = zzhsVar;
        zzmd.zzct(zzhs.class, zzhsVar);
    }

    private zzhs() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new zzhs();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhr(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
