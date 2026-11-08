package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zziv extends zzmd implements zzni {
    private static final zziv zzb;
    private int zzd;
    private zzmj zze = zzmd.zzcn();
    private zzir zzf;

    static {
        zziv zzivVar = new zziv();
        zzb = zzivVar;
        zzmd.zzct(zziv.class, zzivVar);
    }

    private zziv() {
    }

    public final zzir zza() {
        zzir zzirVar = this.zzf;
        return zzirVar == null ? zzir.zzc() : zzirVar;
    }

    public final List zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", zziz.class, "zzf"});
        }
        if (i8 == 3) {
            return new zziv();
        }
        zzja zzjaVar = null;
        if (i8 == 4) {
            return new zziu(zzjaVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
