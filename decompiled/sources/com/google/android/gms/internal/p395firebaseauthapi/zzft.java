package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import p256j$.util.Objects;

/* loaded from: classes.dex */
public final class zzft extends zzcr {
    private final zza zza;
    private final int zzb;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzft(zza zzaVar, int i7) {
        this.zza = zzaVar;
        this.zzb = i7;
    }

    public static zzft zza(zza zzaVar, int i7) {
        if (i7 < 8 || i7 > 12) {
            throw new GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new zzft(zzaVar, i7);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzft)) {
            return false;
        }
        zzft zzftVar = (zzft) obj;
        return zzftVar.zza == this.zza && zzftVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzft.class, this.zza, Integer.valueOf(this.zzb));
    }

    public final String toString() {
        return "X-AES-GCM Parameters (variant: " + String.valueOf(this.zza) + "salt_size_bytes: " + this.zzb + ")";
    }

    public final int zzb() {
        return this.zzb;
    }

    public final zza zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zza.zzb;
    }
}
