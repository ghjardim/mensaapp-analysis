package com.google.android.recaptcha.internal;

import org.apache.tika.utils.StringUtils;

/* loaded from: classes.dex */
public final class zzry extends zznd implements zzoj {
    private static final zzry zzb;
    private static volatile zzoq zzd;
    private int zze;
    private String zzf = StringUtils.EMPTY;

    static {
        zzry zzryVar = new zzry();
        zzb = zzryVar;
        zznd.zzI(zzry.class, zzryVar);
    }

    private zzry() {
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zze", "zzf"});
        }
        if (i8 == 3) {
            return new zzry();
        }
        zzsn zzsnVar = null;
        if (i8 == 4) {
            return new zzrx(zzsnVar);
        }
        if (i8 == 5) {
            return zzb;
        }
        if (i8 != 6) {
            return null;
        }
        zzoq zzoqVar = zzd;
        if (zzoqVar == null) {
            synchronized (zzry.class) {
                try {
                    zzoqVar = zzd;
                    if (zzoqVar == null) {
                        zzoqVar = new zzmy(zzb);
                        zzd = zzoqVar;
                    }
                } finally {
                }
            }
        }
        return zzoqVar;
    }
}
