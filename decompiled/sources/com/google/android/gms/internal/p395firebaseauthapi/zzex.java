package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzew;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class zzex extends zzcp {
    private final zzew zza;
    private final zzzn zzb;
    private final Integer zzc;

    private zzex(zzew zzewVar, zzzn zzznVar, Integer num) {
        this.zza = zzewVar;
        this.zzb = zzznVar;
        this.zzc = num;
    }

    public static zzex zza(zzew zzewVar, Integer num) {
        zzzn zzb;
        if (zzewVar.zzc() == zzew.zzc.zzb) {
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zzb = zzor.zza;
        } else {
            if (zzewVar.zzc() != zzew.zzc.zza) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzewVar.zzc()));
            }
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zzb = zzor.zzb(num.intValue());
        }
        return new zzex(zzewVar, zzb, num);
    }

    public final zzew zzb() {
        return this.zza;
    }

    public final zzzn zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzbo
    public final Integer zza() {
        return this.zzc;
    }
}
