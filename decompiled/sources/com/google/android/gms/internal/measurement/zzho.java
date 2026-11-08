package com.google.android.gms.internal.measurement;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzho extends zzmd implements zzni {
    private static final zzho zzb;
    private int zzd;
    private String zze = StringUtils.EMPTY;
    private long zzf;

    static {
        zzho zzhoVar = new zzho();
        zzb = zzhoVar;
        zzmd.zzct(zzho.class, zzhoVar);
    }

    private zzho() {
    }

    public static zzhn zza() {
        return (zzhn) zzb.zzcg();
    }

    public static /* synthetic */ void zzc(zzho zzhoVar, long j7) {
        zzhoVar.zzd |= 2;
        zzhoVar.zzf = j7;
    }

    public static /* synthetic */ void zzd(zzho zzhoVar, String str) {
        str.getClass();
        zzhoVar.zzd |= 1;
        zzhoVar.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzmd
    public final Object zzl(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zzmd.zzcq(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzho();
        }
        zzip zzipVar = null;
        if (i8 == 4) {
            return new zzhn(zzipVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
