package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import p256j$.util.Objects;

/* loaded from: classes.dex */
public final class zzit extends zzix {
    private final int zza;
    private final zza zzb;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzb {
        private Integer zza;
        private zza zzb;

        public final zzb zza(int i7) {
            if (i7 != 32 && i7 != 48 && i7 != 64) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 32-byte, 48-byte and 64-byte AES-SIV keys are supported", Integer.valueOf(i7)));
            }
            this.zza = Integer.valueOf(i7);
            return this;
        }

        private zzb() {
            this.zza = null;
            this.zzb = zza.zzc;
        }

        public final zzb zza(zza zzaVar) {
            this.zzb = zzaVar;
            return this;
        }

        public final zzit zza() {
            Integer num = this.zza;
            if (num != null) {
                if (this.zzb != null) {
                    return new zzit(num.intValue(), this.zzb);
                }
                throw new GeneralSecurityException("Variant is not set");
            }
            throw new GeneralSecurityException("Key size is not set");
        }
    }

    public static zzb zzc() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzit)) {
            return false;
        }
        zzit zzitVar = (zzit) obj;
        return zzitVar.zza == this.zza && zzitVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzit.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return "AesSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zzb != zza.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zza zzd() {
        return this.zzb;
    }

    private zzit(int i7, zza zzaVar) {
        this.zza = i7;
        this.zzb = zzaVar;
    }
}
