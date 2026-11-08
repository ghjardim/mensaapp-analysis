package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzep;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class zzen extends zzcp {
    private final zzep zza;
    private final zzzn zzb;
    private final Integer zzc;

    private zzen(zzep zzepVar, zzzn zzznVar, Integer num) {
        this.zza = zzepVar;
        this.zzb = zzznVar;
        this.zzc = num;
    }

    public static zzen zza(zzep zzepVar, Integer num) {
        zzzn zza;
        if (zzepVar.zzb() == zzep.zza.zza) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            zza = zzzn.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (zzepVar.zzb() != zzep.zza.zzb) {
                throw new GeneralSecurityException("Unknown Variant: " + String.valueOf(zzepVar.zzb()));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            zza = zzzn.zza(new byte[0]);
        }
        return new zzen(zzepVar, zza, num);
    }

    public final zzep zzb() {
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
