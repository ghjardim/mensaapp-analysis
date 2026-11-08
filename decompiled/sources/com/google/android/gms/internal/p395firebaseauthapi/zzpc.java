package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzpc {
    private final Map<zzpe, zzoy<?, ?>> zza;
    private final Map<Class<?>, zzpk<?, ?>> zzb;

    public static zzpf zza() {
        return new zzpf();
    }

    private zzpc(zzpf zzpfVar) {
        this.zza = new HashMap(zzpfVar.zza);
        this.zzb = new HashMap(zzpfVar.zzb);
    }

    public static zzpf zza(zzpc zzpcVar) {
        return new zzpf(zzpcVar);
    }

    public final Class<?> zza(Class<?> cls) {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + String.valueOf(cls) + " available");
    }

    public final <KeyT extends zzbo, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        zzpe zzpeVar = new zzpe(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpeVar)) {
            return (PrimitiveT) this.zza.get(zzpeVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzpeVar) + " available");
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzpg<InputPrimitiveT> zzpgVar, Class<WrapperPrimitiveT> cls) {
        if (this.zzb.containsKey(cls)) {
            zzpk<?, ?> zzpkVar = this.zzb.get(cls);
            if (zzpgVar.zzc().equals(zzpkVar.zza()) && zzpkVar.zza().equals(zzpgVar.zzc())) {
                return (WrapperPrimitiveT) zzpkVar.zza(zzpgVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
    }
}
