package com.google.android.gms.internal.p395firebaseauthapi;

import p256j$.util.Objects;

/* loaded from: classes.dex */
public final class zznp extends zzcg {
    private final zzpm zza;

    public zznp(zzpm zzpmVar) {
        this.zza = zzpmVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zzpm zzpmVar = ((zznp) obj).zza;
        return this.zza.zza().zzd().equals(zzpmVar.zza().zzd()) && this.zza.zza().zzf().equals(zzpmVar.zza().zzf()) && this.zza.zza().zze().equals(zzpmVar.zza().zze());
    }

    public final int hashCode() {
        return Objects.hash(this.zza.zza(), this.zza.zzb());
    }

    public final String toString() {
        String zzf = this.zza.zza().zzf();
        int i7 = zzno.zza[this.zza.zza().zzd().ordinal()];
        return String.format("(typeUrl=%s, outputPrefixType=%s)", zzf, i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzcg
    public final boolean zza() {
        return this.zza.zza().zzd() != zzxd.RAW;
    }

    public final zzpm zzb() {
        return this.zza;
    }
}
