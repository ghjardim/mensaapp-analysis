package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzft;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfq extends zzcp {
    private final zzft zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    private zzfq(zzft zzftVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzftVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }

    public static zzfq zza(zzft zzftVar, zzzo zzzoVar, Integer num) {
        zzzn zzb;
        zzft.zza zzc = zzftVar.zzc();
        zzft.zza zzaVar = zzft.zza.zzb;
        if (zzc != zzaVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzftVar.zzc()) + " the value of idRequirement must be non-null");
        }
        if (zzftVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzoVar.zza() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzzoVar.zza());
        }
        if (zzftVar.zzc() == zzaVar) {
            zzb = zzor.zza;
        } else {
            if (zzftVar.zzc() != zzft.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzftVar.zzc()));
            }
            zzb = zzor.zzb(num.intValue());
        }
        return new zzfq(zzftVar, zzzoVar, zzb, num);
    }

    public final zzft zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzc;
    }

    public final zzzo zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzd;
    }
}
