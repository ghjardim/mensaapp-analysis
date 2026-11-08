package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzfh extends zzmd implements zzni {
    private static final zzfh zzb;
    private int zzd;
    private int zze;
    private zzmj zzf = zzmd.zzcn();
    private zzmj zzg = zzmd.zzcn();
    private boolean zzh;
    private boolean zzi;

    static {
        zzfh zzfhVar = new zzfh();
        zzb = zzfhVar;
        zzmd.zzct(zzfh.class, zzfhVar);
    }

    private zzfh() {
    }

    public static /* synthetic */ void zzi(zzfh zzfhVar, int i7, zzfj zzfjVar) {
        zzfjVar.getClass();
        zzmj zzmjVar = zzfhVar.zzg;
        if (!zzmjVar.zzc()) {
            zzfhVar.zzg = zzmd.zzco(zzmjVar);
        }
        zzfhVar.zzg.set(i7, zzfjVar);
    }

    public static /* synthetic */ void zzj(zzfh zzfhVar, int i7, zzfr zzfrVar) {
        zzfrVar.getClass();
        zzmj zzmjVar = zzfhVar.zzf;
        if (!zzmjVar.zzc()) {
            zzfhVar.zzf = zzmd.zzco(zzmjVar);
        }
        zzfhVar.zzf.set(i7, zzfrVar);
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzg.size();
    }

    public final int zzc() {
        return this.zzf.size();
    }

    public final zzfj zze(int i7) {
        return (zzfj) this.zzg.get(i7);
    }

    public final zzfr zzf(int i7) {
        return (zzfr) this.zzf.get(i7);
    }

    public final List zzg() {
        return this.zzg;
    }

    public final List zzh() {
        return this.zzf;
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
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", zzfr.class, "zzg", zzfj.class, "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new zzfh();
        }
        zzfw zzfwVar = null;
        if (i8 == 4) {
            return new zzfg(zzfwVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
