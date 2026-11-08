package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
final class zzpo extends ThreadLocal<SecureRandom> {
    @Override // java.lang.ThreadLocal
    public final /* synthetic */ SecureRandom initialValue() {
        return zzpp.zza();
    }
}
