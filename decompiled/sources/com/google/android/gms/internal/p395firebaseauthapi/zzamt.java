package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzakg;

/* loaded from: classes.dex */
public final class zzamt extends zzakg<zzamt, zza> implements zzalp {
    private static final zzamt zzc;
    private static volatile zzalw<zzamt> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzakg.zzb<zzamt, zza> implements zzalp {
        public final zza zza(int i7) {
            if (!this.zza.zzw()) {
                zzh();
            }
            ((zzamt) this.zza).zzf = i7;
            return this;
        }

        private zza() {
            super(zzamt.zzc);
        }

        public final zza zza(long j7) {
            if (!this.zza.zzw()) {
                zzh();
            }
            ((zzamt) this.zza).zze = j7;
            return this;
        }
    }

    static {
        zzamt zzamtVar = new zzamt();
        zzc = zzamtVar;
        zzakg.zza((Class<zzamt>) zzamt.class, zzamtVar);
    }

    private zzamt() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzakg
    public final Object zza(int i7, Object obj, Object obj2) {
        switch (zzams.zza[i7 - 1]) {
            case 1:
                return new zzamt();
            case 2:
                return new zza();
            case 3:
                return zzakg.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalw<zzamt> zzalwVar = zzd;
                if (zzalwVar == null) {
                    synchronized (zzamt.class) {
                        try {
                            zzalwVar = zzd;
                            if (zzalwVar == null) {
                                zzalwVar = new zzakg.zza<>(zzc);
                                zzd = zzalwVar;
                            }
                        } finally {
                        }
                    }
                }
                return zzalwVar;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }
}
