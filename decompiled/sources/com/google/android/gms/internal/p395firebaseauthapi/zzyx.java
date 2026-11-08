package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzyx implements zzys<KeyFactory> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ KeyFactory zza(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
