package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzij;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzrq implements zzqh {
    private static final zzij.zza zza = zzij.zza.zza;

    public zzrq(zzqa zzqaVar) {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
    }
}
