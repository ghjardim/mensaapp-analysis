package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.concurrent.ConcurrentMap;
import p256j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzaly {
    private static final zzaly zza = new zzaly();
    private final ConcurrentMap<Class<?>, zzamc<?>> zzc = new ConcurrentHashMap();
    private final zzamf zzb = new zzalb();

    private zzaly() {
    }

    public static zzaly zza() {
        return zza;
    }

    public final <T> zzamc<T> zza(Class<T> cls) {
        zzaki.zza(cls, "messageType");
        zzamc<T> zzamcVar = (zzamc) this.zzc.get(cls);
        if (zzamcVar != null) {
            return zzamcVar;
        }
        zzamc<T> zza2 = this.zzb.zza(cls);
        zzaki.zza(cls, "messageType");
        zzaki.zza(zza2, "schema");
        zzamc<T> zzamcVar2 = (zzamc) this.zzc.putIfAbsent(cls, zza2);
        return zzamcVar2 != null ? zzamcVar2 : zza2;
    }

    public final <T> zzamc<T> zza(T t7) {
        return zza((Class) t7.getClass());
    }
}
