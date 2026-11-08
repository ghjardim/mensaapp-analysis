package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzqk implements zzpk<zzqh, zzqh> {
    private static final zzqk zza = new zzqk();

    private zzqk() {
    }

    public static void zzc() {
        zzon.zza().zza(zza);
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpk
    public final Class<zzqh> zza() {
        return zzqh.class;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpk
    public final Class<zzqh> zzb() {
        return zzqh.class;
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpk
    public final /* synthetic */ zzqh zza(zzpg<zzqh> zzpgVar) {
        if (zzpgVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (zzpgVar.zzb() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<zzpi<zzqh>>> it = zzpgVar.zzd().iterator();
        while (it.hasNext()) {
            Iterator<zzpi<zzqh>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().zzd();
            }
        }
        return new zzqj(zzpgVar);
    }
}
