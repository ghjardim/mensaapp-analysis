package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        boolean z6 = true;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzgdVar.zzh().zza((String) zza2);
                }
                zzge zzc = zzgdVar.zzc();
                try {
                    zzgc.zza(zza2);
                } catch (zzce e7) {
                    if (e7.zzb() == 8 || e7.zzb() == 6) {
                        z6 = false;
                    } else if (e7.zzb() != 47) {
                        throw e7;
                    }
                }
                zzc.zze(i7, Boolean.valueOf(z6));
            } catch (zzce e8) {
                throw e8;
            }
        } catch (Exception e9) {
            throw new zzce(6, 8, e9);
        }
    }
}
