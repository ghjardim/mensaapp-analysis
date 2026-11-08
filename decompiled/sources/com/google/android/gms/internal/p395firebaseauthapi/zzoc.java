package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzoc {
    private static final zzoe<zznp> zza = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzof
        @Override // com.google.android.gms.internal.p395firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzoc.zza((zznp) zzcgVar, num);
        }
    };
    private static final zzoc zzb = zzb();
    private final Map<Class<? extends zzcg>, zzoe<? extends zzcg>> zzc = new HashMap();

    private final synchronized <ParametersT extends zzcg> zzbo zzb(ParametersT parameterst, Integer num) {
        zzoe<? extends zzcg> zzoeVar;
        zzoeVar = this.zzc.get(parameterst.getClass());
        if (zzoeVar == null) {
            throw new GeneralSecurityException("Cannot create a new key for parameters " + String.valueOf(parameterst) + ": no key creator for this class was registered.");
        }
        return zzoeVar.zza(parameterst, num);
    }

    public final zzbo zza(zzcg zzcgVar, Integer num) {
        return zzb(zzcgVar, num);
    }

    public static /* synthetic */ zznn zza(zznp zznpVar, Integer num) {
        zzwf zza2 = zznpVar.zzb().zza();
        zzbn<?> zza3 = zzna.zza().zza(zza2.zzf());
        if (!zzna.zza().zzb(zza2.zzf())) {
            throw new GeneralSecurityException("Creating new keys is not allowed.");
        }
        zzwb zza4 = zza3.zza(zza2.zze());
        return new zznn(zzpn.zza(zza4.zzf(), zza4.zze(), zza4.zzb(), zza2.zzd(), num), zzbl.zza());
    }

    private static zzoc zzb() {
        zzoc zzocVar = new zzoc();
        try {
            zzocVar.zza(zza, zznp.class);
            return zzocVar;
        } catch (GeneralSecurityException e7) {
            throw new IllegalStateException("unexpected error.", e7);
        }
    }

    public static zzoc zza() {
        return zzb;
    }

    public final synchronized <ParametersT extends zzcg> void zza(zzoe<ParametersT> zzoeVar, Class<ParametersT> cls) {
        try {
            zzoe<? extends zzcg> zzoeVar2 = this.zzc.get(cls);
            if (zzoeVar2 != null && !zzoeVar2.equals(zzoeVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class " + String.valueOf(cls) + " already inserted");
            }
            this.zzc.put(cls, zzoeVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
