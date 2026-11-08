package com.google.android.recaptcha.internal;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC5469l;
import p378x5.AbstractC7020k;

/* loaded from: classes.dex */
public final class zzhc implements zzgx {
    public static final zzhc zza = new zzhc();

    private zzhc() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length < 2) {
            throw new zzce(4, 3, null);
        }
        Class<?> zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzce(4, 5, null);
        }
        Class<?> cls = zza2 instanceof Class ? zza2 : zza2.getClass();
        Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (zza3 instanceof String)) {
            zza3 = null;
        }
        String str = (String) zza3;
        if (str == null) {
            throw new zzce(4, 5, null);
        }
        String zza4 = zzgdVar.zzh().zza(str);
        if (AbstractC5469l.m23024a(zza4, "forName")) {
            throw new zzce(6, 48, null);
        }
        Class[] zzf = zzgdVar.zzc().zzf(AbstractC7020k.m28832b0(zzueVarArr).subList(2, length));
        try {
            zzgdVar.zzc().zze(i7, cls.getMethod(zza4, (Class[]) Arrays.copyOf(zzf, zzf.length)));
        } catch (Exception e7) {
            throw new zzce(6, 13, e7);
        }
    }
}
