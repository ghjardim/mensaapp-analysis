package com.google.android.gms.internal.measurement;

import java.util.List;
import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzhm extends zzmd implements zzni {
    private static final zzhm zzb;
    private int zzd;
    private zzmj zze = zzmd.zzcn();
    private String zzf = StringUtils.EMPTY;
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        zzhm zzhmVar = new zzhm();
        zzb = zzhmVar;
        zzmd.zzct(zzhm.class, zzhmVar);
    }

    private zzhm() {
    }

    public static zzhl zze() {
        return (zzhl) zzb.zzcg();
    }

    public static /* synthetic */ void zzj(zzhm zzhmVar, Iterable iterable) {
        zzhmVar.zzv();
        zzko.zzcc(iterable, zzhmVar.zze);
    }

    public static /* synthetic */ void zzk(zzhm zzhmVar, zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.zze.add(zzhqVar);
    }

    public static /* synthetic */ void zzn(zzhm zzhmVar, int i7) {
        zzhmVar.zzv();
        zzhmVar.zze.remove(i7);
    }

    public static /* synthetic */ void zzo(zzhm zzhmVar, String str) {
        str.getClass();
        zzhmVar.zzd |= 1;
        zzhmVar.zzf = str;
    }

    public static /* synthetic */ void zzp(zzhm zzhmVar, int i7, zzhq zzhqVar) {
        zzhqVar.getClass();
        zzhmVar.zzv();
        zzhmVar.zze.set(i7, zzhqVar);
    }

    public static /* synthetic */ void zzq(zzhm zzhmVar, long j7) {
        zzhmVar.zzd |= 4;
        zzhmVar.zzh = j7;
    }

    public static /* synthetic */ void zzr(zzhm zzhmVar, long j7) {
        zzhmVar.zzd |= 2;
        zzhmVar.zzg = j7;
    }

    private final void zzv() {
        zzmj zzmjVar = this.zze;
        if (zzmjVar.zzc()) {
            return;
        }
        this.zze = zzmd.zzco(zzmjVar);
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zze.size();
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzg;
    }

    public final zzhq zzg(int i7) {
        return (zzhq) this.zze.get(i7);
    }

    public final String zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", zzhq.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzhm();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhl(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean zzs() {
        return (this.zzd & 8) != 0;
    }

    public final boolean zzt() {
        return (this.zzd & 4) != 0;
    }

    public final boolean zzu() {
        return (this.zzd & 2) != 0;
    }
}
