package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzgk extends zzmd implements zzni {
    private static final zzgk zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private zzmj zzf = zzmd.zzcn();
    private boolean zzg;

    static {
        zzgk zzgkVar = new zzgk();
        zzb = zzgkVar;
        zzmd.zzct(zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    public final String zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", zzgu.class, "zzg"});
        }
        if (i8 == 3) {
            return new zzgk();
        }
        zzgz zzgzVar = null;
        if (i8 == 4) {
            return new zzgj(zzgzVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
