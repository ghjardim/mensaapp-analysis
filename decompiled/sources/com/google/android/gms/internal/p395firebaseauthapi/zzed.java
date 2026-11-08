package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzeg;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzed extends zzcp {
    private final zzeg zza;
    private final zzzo zzb;
    private final zzzn zzc;
    private final Integer zzd;

    private zzed(zzeg zzegVar, zzzo zzzoVar, zzzn zzznVar, Integer num) {
        this.zza = zzegVar;
        this.zzb = zzzoVar;
        this.zzc = zzznVar;
        this.zzd = num;
    }

    public static zzed zza(zzeg.zza zzaVar, zzzo zzzoVar, Integer num) {
        zzzn zzb;
        zzeg.zza zzaVar2 = zzeg.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzoVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzoVar.zza());
        }
        zzeg zza = zzeg.zza(zzaVar);
        if (zza.zzb() == zzaVar2) {
            zzb = zzor.zza;
        } else if (zza.zzb() == zzeg.zza.zzb) {
            zzb = zzor.zza(num.intValue());
        } else {
            if (zza.zzb() != zzeg.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zza.zzb()));
            }
            zzb = zzor.zzb(num.intValue());
        }
        return new zzed(zza, zzzoVar, zzb, num);
    }

    public final zzeg zzb() {
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
