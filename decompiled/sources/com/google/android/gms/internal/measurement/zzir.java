package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes.dex */
public final class zzir extends zzmd implements zzni {
    private static final zzir zzb;
    private zzmj zzd = zzmd.zzcn();

    static {
        zzir zzirVar = new zzir();
        zzb = zzirVar;
        zzmd.zzct(zzir.class, zzirVar);
    }

    private zzir() {
    }

    public static zzir zzc() {
        return zzb;
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final List zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzit.class});
        }
        if (i8 == 3) {
            return new zzir();
        }
        zzja zzjaVar = null;
        if (i8 == 4) {
            return new zziq(zzjaVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
