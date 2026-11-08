package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzij;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrp implements zzqh {
    private static final zzij.zza zza = zzij.zza.zzb;

    public zzrp(zzql zzqlVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
