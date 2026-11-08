package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzwl;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbi {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwl.zza zzaVar) {
        int i7 = zzbh.zza[zzaVar.zzf().ordinal()];
        if (i7 == 1 || i7 == 2) {
            return zzor.zza(zzaVar.zza()).zzb();
        }
        if (i7 == 3) {
            return zzor.zzb(zzaVar.zza()).zzb();
        }
        if (i7 == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
