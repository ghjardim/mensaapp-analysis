package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzgq extends zzmd implements zzni {
    private static final zzgq zzb;
    private zzmj zzd = zzmd.zzcn();

    static {
        zzgq zzgqVar = new zzgq();
        zzb = zzgqVar;
        zzmd.zzct(zzgq.class, zzgqVar);
    }

    private zzgq() {
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i8 == 3) {
            return new zzgq();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgp(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
