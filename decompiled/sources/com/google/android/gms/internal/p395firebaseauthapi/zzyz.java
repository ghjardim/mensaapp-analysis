package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzyz implements zzys<Mac> {
    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzys
    public final /* synthetic */ Mac zza(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
