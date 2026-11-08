package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.HashMap;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zznq {
    private HashMap<String, String> zza = new HashMap<>();

    public final zznr zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zznr zznrVar = new zznr(DesugarCollections.unmodifiableMap(this.zza));
        this.zza = null;
        return zznrVar;
    }
}
