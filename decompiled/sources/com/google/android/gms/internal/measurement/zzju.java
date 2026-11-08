package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import p171Y2.AbstractC2932o;
import p372x.AbstractC6939e;

/* loaded from: classes.dex */
final class zzju implements zzjr {
    private static zzju zza;
    private final Context zzb;
    private final ContentObserver zzc;
    private boolean zzd;

    private zzju() {
        this.zzd = false;
        this.zzb = null;
        this.zzc = null;
    }

    public static zzju zza(Context context) {
        zzju zzjuVar;
        synchronized (zzju.class) {
            try {
                if (zza == null) {
                    zza = AbstractC6939e.m28418b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new zzju(context) : new zzju();
                }
                zzju zzjuVar2 = zza;
                if (zzjuVar2 != null && zzjuVar2.zzc != null && !zzjuVar2.zzd) {
                    try {
                        context.getContentResolver().registerContentObserver(zzjc.zza, true, zza.zzc);
                        ((zzju) AbstractC2932o.m10572o(zza)).zzd = true;
                    } catch (SecurityException e7) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e7);
                    }
                }
                zzjuVar = (zzju) AbstractC2932o.m10572o(zza);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzjuVar;
    }

    public static synchronized void zze() {
        Context context;
        synchronized (zzju.class) {
            try {
                zzju zzjuVar = zza;
                if (zzjuVar != null && (context = zzjuVar.zzb) != null && zzjuVar.zzc != null && zzjuVar.zzd) {
                    context.getContentResolver().unregisterContentObserver(zza.zzc);
                }
                zza = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzjr
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final String zzb(final String str) {
        Context context = this.zzb;
        if (context != null && !zzji.zza(context)) {
            try {
                return (String) zzjp.zza(new zzjq() { // from class: com.google.android.gms.internal.measurement.zzjs
                    @Override // com.google.android.gms.internal.measurement.zzjq
                    public final Object zza() {
                        String zza2;
                        zza2 = zzjb.zza(((Context) AbstractC2932o.m10572o(zzju.this.zzb)).getContentResolver(), str, null);
                        return zza2;
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e7) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e7);
            }
        }
        return null;
    }

    private zzju(Context context) {
        this.zzd = false;
        this.zzb = context;
        this.zzc = new zzjt(this, null);
    }
}
