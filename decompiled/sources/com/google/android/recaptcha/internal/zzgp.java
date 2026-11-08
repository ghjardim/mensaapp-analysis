package com.google.android.recaptcha.internal;

import java.util.Collection;
import p125R5.C2277c;
import p378x5.AbstractC7020k;
import p378x5.AbstractC7032w;

/* loaded from: classes.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i7, zzgd zzgdVar, zzue... zzueVarArr) {
        String m28878D;
        String str;
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
        if (zza2 instanceof int[]) {
            m28878D = AbstractC7020k.m28819O((int[]) zza2, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (zza2 instanceof byte[]) {
                str = new String((byte[]) zza2, C2277c.f6921b);
            } else if (zza2 instanceof long[]) {
                m28878D = AbstractC7020k.m28820P((long[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof short[]) {
                m28878D = AbstractC7020k.m28822R((short[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof float[]) {
                m28878D = AbstractC7020k.m28818N((float[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof double[]) {
                m28878D = AbstractC7020k.m28817M((double[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else if (zza2 instanceof char[]) {
                str = new String((char[]) zza2);
            } else if (zza2 instanceof Object[]) {
                m28878D = AbstractC7020k.m28821Q((Object[]) zza2, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(zza2 instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                m28878D = AbstractC7032w.m28878D((Iterable) zza2, ",", "[", "]", 0, null, null, 56, null);
            }
            m28878D = str;
        }
        zzgdVar.zzc().zze(i7, m28878D);
    }
}
