package com.google.android.gms.internal.measurement;

import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzhv extends zzmd implements zzni {
    private static final zzhv zzb;
    private int zzd;
    private zzmj zze = zzmd.zzcn();
    private String zzf = StringUtils.EMPTY;
    private String zzg = StringUtils.EMPTY;
    private int zzh;

    static {
        zzhv zzhvVar = new zzhv();
        zzb = zzhvVar;
        zzmd.zzct(zzhv.class, zzhvVar);
    }

    private zzhv() {
    }

    public static zzht zzb() {
        return (zzht) zzb.zzcg();
    }

    public static zzht zzc(zzhv zzhvVar) {
        zzlz zzcg = zzb.zzcg();
        zzcg.zzaY(zzhvVar);
        return (zzht) zzcg;
    }

    public static /* synthetic */ void zzi(zzhv zzhvVar, Iterable iterable) {
        zzhvVar.zzr();
        zzko.zzcc(iterable, zzhvVar.zze);
    }

    public static /* synthetic */ void zzj(zzhv zzhvVar, zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.zze.add(zzhxVar);
    }

    public static /* synthetic */ void zzm(zzhv zzhvVar, int i7, zzhx zzhxVar) {
        zzhxVar.getClass();
        zzhvVar.zzr();
        zzhvVar.zze.set(i7, zzhxVar);
    }

    public static /* synthetic */ void zzn(zzhv zzhvVar, String str) {
        str.getClass();
        zzhvVar.zzd |= 1;
        zzhvVar.zzf = str;
    }

    public static /* synthetic */ void zzo(zzhv zzhvVar, String str) {
        str.getClass();
        zzhvVar.zzd |= 2;
        zzhvVar.zzg = str;
    }

    private final void zzr() {
        zzmj zzmjVar = this.zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zze = zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.zze.size();
    }

    public final zzhx zze(int i7) {
        return (zzhx) this.zze.get(i7);
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", zzhx.class, "zzf", "zzg", "zzh", zzhu.zza});
        }
        if (i8 == 3) {
            return new zzhv();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzht(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzp() {
        return (this.zzd & 1) != 0;
    }

    public final boolean zzq() {
        return (this.zzd & 2) != 0;
    }
}
