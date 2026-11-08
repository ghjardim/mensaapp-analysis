package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import p256j$.util.Objects;

/* loaded from: classes.dex */
public final class zzew extends zzcr {
    private final zzc zza;
    private final String zzb;
    private final zza zzc;
    private final zzcr zzd;

    public static final class zza {
        public static final zza zza = new zza("ASSUME_AES_GCM");
        public static final zza zzb = new zza("ASSUME_XCHACHA20POLY1305");
        public static final zza zzc = new zza("ASSUME_CHACHA20POLY1305");
        public static final zza zzd = new zza("ASSUME_AES_CTR_HMAC");
        public static final zza zze = new zza("ASSUME_AES_EAX");
        public static final zza zzf = new zza("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zza(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    public static class zzb {
        private zzc zza;
        private String zzb;
        private zza zzc;
        private zzcr zzd;

        private zzb() {
        }

        public final zzb zza(zzcr zzcrVar) {
            this.zzd = zzcrVar;
            return this;
        }

        public final zzb zza(zza zzaVar) {
            this.zzc = zzaVar;
            return this;
        }

        public final zzb zza(String str) {
            this.zzb = str;
            return this;
        }

        public final zzb zza(zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        public final zzew zza() {
            if (this.zza == null) {
                this.zza = zzc.zzb;
            }
            if (this.zzb != null) {
                if (this.zzc != null) {
                    zzcr zzcrVar = this.zzd;
                    if (zzcrVar != null) {
                        if (!zzcrVar.zza()) {
                            zza zzaVar = this.zzc;
                            zzcr zzcrVar2 = this.zzd;
                            if ((zzaVar.equals(zza.zza) && (zzcrVar2 instanceof zzdr)) || ((zzaVar.equals(zza.zzc) && (zzcrVar2 instanceof zzeg)) || ((zzaVar.equals(zza.zzb) && (zzcrVar2 instanceof zzfy)) || ((zzaVar.equals(zza.zzd) && (zzcrVar2 instanceof zzdc)) || ((zzaVar.equals(zza.zze) && (zzcrVar2 instanceof zzdk)) || (zzaVar.equals(zza.zzf) && (zzcrVar2 instanceof zzea))))))) {
                                return new zzew(this.zza, this.zzb, this.zzc, this.zzd);
                            }
                            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + String.valueOf(this.zzd) + ".");
                        }
                        throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                    }
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                }
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            throw new GeneralSecurityException("kekUri must be set");
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("TINK");
        public static final zzc zzb = new zzc("NO_PREFIX");
        private final String zzc;

        private zzc(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzew)) {
            return false;
        }
        zzew zzewVar = (zzew) obj;
        return zzewVar.zzc.equals(this.zzc) && zzewVar.zzd.equals(this.zzd) && zzewVar.zzb.equals(this.zzb) && zzewVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzew.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(this.zzd) + ", variant: " + String.valueOf(this.zza) + ")";
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza != zzc.zzb;
    }

    public final zzcr zzb() {
        return this.zzd;
    }

    public final zzc zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }

    private zzew(zzc zzcVar, String str, zza zzaVar, zzcr zzcrVar) {
        this.zza = zzcVar;
        this.zzb = str;
        this.zzc = zzaVar;
        this.zzd = zzcrVar;
    }
}
