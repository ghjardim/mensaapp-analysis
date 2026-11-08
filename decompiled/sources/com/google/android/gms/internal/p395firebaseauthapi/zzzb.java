package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class zzzb implements zzys<Signature> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ Signature zza(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
