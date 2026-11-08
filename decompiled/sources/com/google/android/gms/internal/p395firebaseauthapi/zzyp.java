package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.Provider;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzyp<JcePrimitiveT> implements zzyq<JcePrimitiveT> {
    private final zzys<JcePrimitiveT> zza;

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzyq
    public final JcePrimitiveT zza(String str) {
        Iterator<Provider> it = zzym.zza("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, it.next());
            } catch (Exception e7) {
                if (exc == null) {
                    exc = e7;
                }
            }
        }
        return this.zza.zza(str, null);
    }

    private zzyp(zzys<JcePrimitiveT> zzysVar) {
        this.zza = zzysVar;
    }
}
