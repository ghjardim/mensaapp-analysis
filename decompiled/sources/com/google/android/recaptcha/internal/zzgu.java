package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class zzgu implements zzgx {
    public static final zzgu zza = new zzgu();

    private zzgu() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 2) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        try {
            if (zza2 instanceof String) {
                zza2 = zzgdVar.zzh().zza((String) zza2);
            }
            zzgdVar.zzc().zze(i7, Array.newInstance((Class<?>) zzgc.zza(zza2), intValue));
        } catch (Exception e7) {
            throw new zzce(6, 21, e7);
        }
    }
}
