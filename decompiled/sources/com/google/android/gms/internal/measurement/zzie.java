package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzie extends zzmd implements zzni {
    private static final zzie zzb;
    private int zzd;
    private int zze;
    private zzmi zzf = zzmd.zzcl();

    static {
        zzie zzieVar = new zzie();
        zzb = zzieVar;
        zzmd.zzct(zzie.class, zzieVar);
    }

    private zzie() {
    }

    public static zzid zzd() {
        return (zzid) zzb.zzcg();
    }

    public static /* synthetic */ void zzg(zzie zzieVar, Iterable iterable) {
        zzmi zzmiVar = zzieVar.zzf;
        if (!zzmiVar.zzc()) {
            zzieVar.zzf = zzmd.zzcm(zzmiVar);
        }
        zzko.zzcc(iterable, zzieVar.zzf);
    }

    public static /* synthetic */ void zzh(zzie zzieVar, int i7) {
        zzieVar.zzd |= 1;
        zzieVar.zze = i7;
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final long zzc(int i7) {
        return this.zzf.zza(i7);
    }

    public final List zzf() {
        return this.zzf;
    }

    public final boolean zzi() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzie();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzid(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
