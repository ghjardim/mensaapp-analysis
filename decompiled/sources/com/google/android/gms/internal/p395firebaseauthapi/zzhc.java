package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzhc extends ThreadLocal<Cipher> {
    private static Cipher zza() {
        boolean zzb;
        try {
            Cipher zza = zzym.zza.zza("ChaCha20-Poly1305");
            zzb = zzgz.zzb(zza);
            if (zzb) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
