package com.google.android.gms.internal.p395firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzco {
    public static zzcg zza(byte[] bArr) {
        try {
            zzwf zza = zzwf.zza(bArr, zzajv.zza());
            zzom zza2 = zzom.zza();
            zzpm zza3 = zzpm.zza(zza);
            return !zza2.zzc(zza3) ? new zznp(zza3) : zza2.zza((zzom) zza3);
        } catch (IOException e7) {
            throw new GeneralSecurityException("Failed to parse proto", e7);
        }
    }

    public static byte[] zza(zzcg zzcgVar) {
        if (zzcgVar instanceof zznp) {
            return ((zznp) zzcgVar).zzb().zza().zzk();
        }
        return ((zzpm) zzom.zza().zza((zzom) zzcgVar, zzpm.class)).zza().zzk();
    }
}
