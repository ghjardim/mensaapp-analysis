package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzfl extends zzmd implements zzni {
    private static final zzfl zzb;
    private int zzd;
    private zzfv zze;
    private zzfp zzf;
    private boolean zzg;
    private String zzh = StringUtils.EMPTY;

    static {
        zzfl zzflVar = new zzfl();
        zzb = zzflVar;
        zzmd.zzct(zzfl.class, zzflVar);
    }

    private zzfl() {
    }

    public static zzfl zzb() {
        return zzb;
    }

    public static /* synthetic */ void zzf(zzfl zzflVar, String str) {
        zzflVar.zzd |= 8;
        zzflVar.zzh = str;
    }

    public final zzfp zzc() {
        zzfp zzfpVar = this.zzf;
        return zzfpVar == null ? zzfp.zzb() : zzfpVar;
    }

    public final zzfv zzd() {
        zzfv zzfvVar = this.zze;
        return zzfvVar == null ? zzfv.zzc() : zzfvVar;
    }

    public final String zze() {
        return this.zzh;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzi() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzk() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new zzfl();
        }
        zzfw zzfwVar = null;
        if (i8 == 4) {
            return new zzfk(zzfwVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
