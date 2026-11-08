package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj();
    private static final zzoi zzb = new zzoi();
    private final AtomicReference<zzns> zzc = new AtomicReference<>();

    public static zzoj zzb() {
        return zza;
    }

    public final zzns zza() {
        zzns zznsVar = this.zzc.get();
        return zznsVar == null ? zzb : zznsVar;
    }
}
