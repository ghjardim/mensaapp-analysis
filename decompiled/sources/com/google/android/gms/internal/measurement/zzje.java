package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zzje {
    private static zzjd zza;

    public static synchronized zzjd zza() {
        zzjd zzjdVar;
        synchronized (zzje.class) {
            try {
                if (zza == null) {
                    zzb(new zzjh());
                }
                zzjdVar = zza;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjdVar;
    }

    public static synchronized void zzb(zzjd zzjdVar) {
        synchronized (zzje.class) {
            if (zza != null) {
                throw new IllegalStateException("init() already called");
            }
            zza = zzjdVar;
        }
    }
}
