package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.common.internal.AbstractC3802r;
import java.io.UnsupportedEncodingException;
import java.util.List;
import p031E2.AbstractC0267c;

/* loaded from: classes.dex */
public final class zzagy {
    public static long zza(String str) {
        zzagx zzb = zzb(str);
        return zzb.zza().longValue() - zzb.zzb().longValue();
    }

    private static zzagx zzb(String str) {
        AbstractC3802r.m15123e(str);
        List<String> zza = zzv.zza('.').zza((CharSequence) str);
        if (zza.size() >= 2) {
            try {
                return zzagx.zza(new String(AbstractC0267c.m1106b(zza.get(1)), "UTF-8"));
            } catch (UnsupportedEncodingException e7) {
                throw new RuntimeException("Unable to decode token", e7);
            }
        }
        throw new RuntimeException("Invalid idToken " + str);
    }
}
