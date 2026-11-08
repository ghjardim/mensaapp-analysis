package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.Map;

/* loaded from: classes.dex */
public final class zznr {
    public static final zznr zza = new zznq().zza();
    private final Map<String, String> zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zznr) {
            return this.zzb.equals(((zznr) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map<String, String> zza() {
        return this.zzb;
    }

    private zznr(Map<String, String> map) {
        this.zzb = map;
    }
}
