package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzhi extends zzmd implements zzni {
    private static final zzhi zzb;
    private int zzd;
    private int zze;
    private zzic zzf;
    private zzic zzg;
    private boolean zzh;

    static {
        zzhi zzhiVar = new zzhi();
        zzb = zzhiVar;
        zzmd.zzct(zzhi.class, zzhiVar);
    }

    private zzhi() {
    }

    public static zzhh zzb() {
        return (zzhh) zzb.zzcg();
    }

    public static /* synthetic */ void zzf(zzhi zzhiVar, int i7) {
        zzhiVar.zzd |= 1;
        zzhiVar.zze = i7;
    }

    public static /* synthetic */ void zzg(zzhi zzhiVar, zzic zzicVar) {
        zzicVar.getClass();
        zzhiVar.zzf = zzicVar;
        zzhiVar.zzd |= 2;
    }

    public static /* synthetic */ void zzh(zzhi zzhiVar, boolean z6) {
        zzhiVar.zzd |= 8;
        zzhiVar.zzh = z6;
    }

    public static /* synthetic */ void zzi(zzhi zzhiVar, zzic zzicVar) {
        zzhiVar.zzg = zzicVar;
        zzhiVar.zzd |= 4;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzic zzd() {
        zzic zzicVar = this.zzf;
        return zzicVar == null ? zzic.zzg() : zzicVar;
    }

    public final zzic zze() {
        zzic zzicVar = this.zzg;
        return zzicVar == null ? zzic.zzg() : zzicVar;
    }

    public final boolean zzj() {
        return this.zzh;
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
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new zzhi();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhh(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzm() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zzd & 4) != 0;
    }
}
