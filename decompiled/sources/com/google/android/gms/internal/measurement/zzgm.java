package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzgm extends zzmd implements zzni {
    private static final zzgm zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgm zzgmVar = new zzgm();
        zzb = zzgmVar;
        zzmd.zzct(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public static /* synthetic */ void zzd(zzgm zzgmVar, String str) {
        str.getClass();
        zzgmVar.zzd |= 1;
        zzgmVar.zze = str;
    }

    public final int zza() {
        return this.zzh;
    }

    public final String zzc() {
        return this.zze;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new zzgm();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgl(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
