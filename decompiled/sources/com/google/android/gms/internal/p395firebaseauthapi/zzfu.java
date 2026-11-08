package com.google.android.gms.internal.p395firebaseauthapi;

import com.google.android.gms.internal.p395firebaseauthapi.zzfy;
import com.google.android.gms.internal.p395firebaseauthapi.zzij;
import com.google.android.gms.internal.p395firebaseauthapi.zzwb;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzfu {
    private static final zzoy<zzfv, zzbe> zza = zzoy.zza(new zzpa() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfx
        @Override // com.google.android.gms.internal.p395firebaseauthapi.zzpa
        public final Object zza(zzbo zzboVar) {
            return zzfu.zza((zzfv) zzboVar);
        }
    }, zzfv.class, zzbe.class);
    private static final zzbn<zzbe> zzb = zznl.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzbe.class, zzwb.zza.SYMMETRIC, zzxo.zze());
    private static final zzog<zzfy> zzc = new zzog() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfw
    };
    private static final zzoe<zzfy> zzd = new zzoe() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfz
        @Override // com.google.android.gms.internal.p395firebaseauthapi.zzoe
        public final zzbo zza(zzcg zzcgVar, Integer num) {
            return zzfu.zza((zzfy) zzcgVar, num);
        }
    };

    public static /* synthetic */ zzbe zza(zzfv zzfvVar) {
        return zzic.zza() ? zzic.zza(zzfvVar) : zzzk.zza(zzfvVar);
    }

    public static zzfv zza(zzfy zzfyVar, Integer num) {
        return zzfv.zza(zzfyVar.zzb(), zzzo.zza(32), num);
    }

    public static String zza() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public static void zza(boolean z6) {
        if (zzij.zza.zza.zza()) {
            zzib.zza();
            zzon.zza().zza(zza);
            zzok zza2 = zzok.zza();
            HashMap hashMap = new HashMap();
            hashMap.put("XCHACHA20_POLY1305", zzfy.zza(zzfy.zza.zza));
            hashMap.put("XCHACHA20_POLY1305_RAW", zzfy.zza(zzfy.zza.zzc));
            zza2.zza(DesugarCollections.unmodifiableMap(hashMap));
            zzoc.zza().zza(zzd, zzfy.class);
            zzoh.zza().zza(zzc, zzfy.class);
            zzna.zza().zza((zzbn) zzb, true);
            return;
        }
        throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
    }
}
