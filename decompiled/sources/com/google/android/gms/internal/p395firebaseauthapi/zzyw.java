package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes.dex */
public final class zzyw implements zzys<KeyPairGenerator> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ KeyPairGenerator zza(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }
}
