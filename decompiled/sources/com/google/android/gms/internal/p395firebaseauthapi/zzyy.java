package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzyy implements zzys<MessageDigest> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ MessageDigest zza(String str, Provider provider) {
        return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
    }
}
