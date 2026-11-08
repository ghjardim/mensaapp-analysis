package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.AbstractC5469l;

/* loaded from: classes.dex */
public final class zzgj implements zzgx {
    public static final zzgj zza = new zzgj();

    private zzgj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length != 3) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzce(4, 5, null);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            throw new zzce(4, 6, null);
        }
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzce(4, 5, null);
        }
        Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
        if (true != (zza4 instanceof Object)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzce(4, 5, null);
        }
        if (AbstractC5469l.m23024a(zza3, zza4)) {
            zzgdVar.zzg(zzgdVar.zza() + intValue);
        }
    }
}
