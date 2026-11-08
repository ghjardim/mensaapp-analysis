package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzgi extends zzmd implements zzni {
    private static final zzgi zzb;
    private int zzd;
    private boolean zzh;
    private zzmj zze = zzmd.zzcn();
    private zzmj zzf = zzmd.zzcn();
    private zzmj zzg = zzmd.zzcn();
    private zzmj zzi = zzmd.zzcn();

    static {
        zzgi zzgiVar = new zzgi();
        zzb = zzgiVar;
        zzmd.zzct(zzgi.class, zzgiVar);
    }

    private zzgi() {
    }

    public static zzgi zzb() {
        return zzb;
    }

    public final List zzc() {
        return this.zzg;
    }

    public final List zzd() {
        return this.zze;
    }

    public final List zze() {
        return this.zzf;
    }

    public final List zzf() {
        return this.zzi;
    }

    public final boolean zzg() {
        return this.zzh;
    }

    public final boolean zzh() {
        return (this.zzd & 1) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzd", "zze", zzfz.class, "zzf", zzgb.class, "zzg", zzgh.class, "zzh", "zzi", zzfz.class});
        }
        if (i8 == 3) {
            return new zzgi();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzfx(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
