package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes.dex */
public final class zzyu implements zzys<KeyAgreement> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ KeyAgreement zza(String str, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
    }
}
