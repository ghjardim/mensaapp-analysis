package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzbp {
    private final zzcg zza;

    private zzbp(zzcg zzcgVar) {
        this.zza = zzcgVar;
    }

    public static zzbp zza(zzcg zzcgVar) {
        return new zzbp(zzcgVar);
    }

    private final zzwf zzb() {
        try {
            zzcg zzcgVar = this.zza;
            return zzcgVar instanceof zznp ? ((zznp) zzcgVar).zzb().zza() : ((zzpm) zzom.zza().zza((zzom) this.zza, zzpm.class)).zza();
        } catch (GeneralSecurityException e7) {
            throw new zzpw("Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + String.valueOf(this.zza), e7);
        }
    }

    public final zzcg zza() {
        zzcg zzcgVar = this.zza;
        return zzcgVar != null ? zzcgVar : zzco.zza(zzb().zzk());
    }
}
