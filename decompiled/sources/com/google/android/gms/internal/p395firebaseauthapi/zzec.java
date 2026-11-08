package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzeg;
import com.google.android.gms.internal.p395firebaseauthapi.zzij;
import com.google.android.gms.internal.p395firebaseauthapi.zzwb;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzec {
    private static final zzoy<zzed, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzef
        @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzec.zza((zzed) zzboVar);
        }
    }, zzed.class, zzbe.class);
    private static final zzoe<zzeg> zzb = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzee
        @Override // com.google.android.gms.internal.p395firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzec.zza((zzeg) zzcgVar, num);
        }
    };
    private static final zzbn<zzbe> zzc = zznl.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key", zzbe.class, zzwb.zza.SYMMETRIC, zztz.zze());

    public static /* synthetic */ zzbe zza(zzed zzedVar) {
        return zzgz.zzb() ? zzgz.zza(zzedVar) : zzyf.zza(zzedVar);
    }

    public static zzed zza(zzeg zzegVar, Integer num) {
        return zzed.zza(zzegVar.zzb(), zzzo.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public static void zza(boolean z6) {
        if (zzij.zza.zza.zza()) {
            zzhb.zza();
            zzon.zza().zza(zza);
            zzoc.zza().zza(zzb, zzeg.class);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", zzeg.zza(zzeg.zza.zza));
            hashMap.put("CHACHA20_POLY1305_RAW", zzeg.zza(zzeg.zza.zzc));
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzna.zza().zza((zzbn) zzc, true);
            return;
        }
        throw new GeneralSecurityException("Registering ChaCha20Poly1305 is not supported in FIPS mode");
    }
}
