package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzgy extends zzmd implements zzni {
    private static final zzgy zzb;
    private int zzd;
    private int zzh;
    private String zze = StringUtils.EMPTY;
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;
    private String zzi = StringUtils.EMPTY;

    static {
        zzgy zzgyVar = new zzgy();
        zzb = zzgyVar;
        zzmd.zzct(zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public static zzgy zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzh;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zzi;
    }

    public final String zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzgy();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgx(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
