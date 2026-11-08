package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzakg;

/* loaded from: classes.dex */
final class zzakh implements zzalk {
    private static final zzakh zza = new zzakh();

    private zzakh() {
    }

    public static zzakh zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzalk
    public final boolean zzb(Class<?> cls) {
        return zzakg.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzalk
    public final zzall zza(Class<?> cls) {
        if (!zzakg.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzall) zzakg.zza(cls.asSubclass(zzakg.class)).zza(zzakg.zze.zzc, (Object) null, (Object) null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e7);
        }
    }
}
