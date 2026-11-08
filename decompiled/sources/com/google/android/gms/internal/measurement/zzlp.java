package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzlp {
    static final zzlp zza = new zzlp(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private static volatile zzlp zzd;
    private final Map zze;

    public zzlp() {
        this.zze = new HashMap();
    }

    public static zzlp zza() {
        zzlp zzlpVar = zzd;
        if (zzlpVar != null) {
            return zzlpVar;
        }
        synchronized (zzlp.class) {
            try {
                zzlp zzlpVar2 = zzd;
                if (zzlpVar2 != null) {
                    return zzlpVar2;
                }
                int i7 = zznp.zza;
                zzlp zzb2 = zzlx.zzb(zzlp.class);
                zzd = zzb2;
                return zzb2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzmc zzb(zznh zznhVar, int i7) {
        return (zzmc) this.zze.get(new zzlo(zznhVar, i7));
    }

    public zzlp(boolean z6) {
        this.zze = Collections.emptyMap();
    }
}
