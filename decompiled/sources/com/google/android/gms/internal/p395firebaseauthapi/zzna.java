package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzij;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p256j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class zzna {
    private static final Logger zza = Logger.getLogger(zzna.class.getName());
    private static final zzna zzb = new zzna();
    private ConcurrentMap<String, zzbn<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    private final synchronized zzbn<?> zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final <P> zzbn<P> zza(String str, Class<P> cls) {
        zzbn<P> zzbnVar = (zzbn<P>) zzc(str);
        if (zzbnVar.zza().equals(cls)) {
            return zzbnVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzbnVar.getClass()) + ", which only supports: " + String.valueOf(zzbnVar.zza()));
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }

    public final zzbn<?> zza(String str) {
        return zzc(str);
    }

    public static zzna zza() {
        return zzb;
    }

    private final synchronized void zza(zzbn<?> zzbnVar, boolean z6, boolean z7) {
        try {
            String zzb2 = zzbnVar.zzb();
            if (z7 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
            }
            zzbn<?> zzbnVar2 = this.zzc.get(zzb2);
            if (zzbnVar2 != null && !zzbnVar2.getClass().equals(zzbnVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzb2, zzbnVar2.getClass().getName(), zzbnVar.getClass().getName()));
            }
            this.zzc.putIfAbsent(zzb2, zzbnVar);
            this.zzd.put(zzb2, Boolean.valueOf(z7));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized <P> void zza(zzbn<P> zzbnVar, boolean z6) {
        zza(zzbnVar, zzij.zza.zza, z6);
    }

    public final synchronized <P> void zza(zzbn<P> zzbnVar, zzij.zza zzaVar, boolean z6) {
        if (zzaVar.zza()) {
            zza((zzbn<?>) zzbnVar, false, z6);
        } else {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
    }
}
