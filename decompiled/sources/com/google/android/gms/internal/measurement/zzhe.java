package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzhe extends zzmd implements zzni {
    private static final zzhe zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;
    private String zzh = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;
    private String zzj = StringUtils.EMPTY;
    private String zzk = StringUtils.EMPTY;

    static {
        zzhe zzheVar = new zzhe();
        zzb = zzheVar;
        zzmd.zzct(zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new zzhe();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhd(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
