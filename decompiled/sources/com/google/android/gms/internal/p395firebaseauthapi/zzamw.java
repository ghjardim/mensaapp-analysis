package com.google.android.gms.internal.p395firebaseauthapi;

/* loaded from: classes.dex */
public final class zzamw extends RuntimeException {
    public zzamw(zzaln zzalnVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzakm zza() {
        return new zzakm(getMessage());
    }
}
