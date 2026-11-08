package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
public final class zzyv implements zzys<Cipher> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ Cipher zza(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }
}
