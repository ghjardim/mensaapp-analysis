package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzcg;
import com.google.android.gms.internal.p395firebaseauthapi.zzpq;

/* loaded from: classes.dex */
public abstract class zzou<ParametersT extends zzcg, SerializationT extends zzpq> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    public static <ParametersT extends zzcg, SerializationT extends zzpq> zzou<ParametersT, SerializationT> zza(zzow<ParametersT, SerializationT> zzowVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzox(cls, cls2, zzowVar);
    }

    public abstract SerializationT zza(ParametersT parameterst);

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzou(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final Class<ParametersT> zza() {
        return this.zza;
    }
}
