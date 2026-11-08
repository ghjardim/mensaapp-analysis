package com.google.android.recaptcha.internal;

import p256j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzbk {
    public static final /* synthetic */ int zza = 0;
    private static final ConcurrentHashMap zzb = new ConcurrentHashMap();

    public static final void zza(int i7, long j7) {
        ConcurrentHashMap concurrentHashMap = zzb;
        Integer valueOf = Integer.valueOf(i7);
        Object obj = concurrentHashMap.get(valueOf);
        if (obj == null) {
            obj = new zzbj();
        }
        zzbj zzbjVar = (zzbj) obj;
        zzbjVar.zzg(zzbjVar.zzb() + 1);
        zzbjVar.zzf(zzbjVar.zzd() + j7);
        zzbjVar.zze(Math.max(j7, zzbjVar.zzc()));
        concurrentHashMap.put(valueOf, zzbjVar);
    }
}
