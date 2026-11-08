package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzcm {
    private static final zzcm zza = new zzcm();

    private zzcm() {
    }

    public static zzcm zza() {
        return zza;
    }

    public static zzcm zza(zzcm zzcmVar) {
        if (zzcmVar != null) {
            return zzcmVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }
}
