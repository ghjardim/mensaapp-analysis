package com.google.android.gms.internal.p395firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzcb {
    private static final CopyOnWriteArrayList<zzcc> zza = new CopyOnWriteArrayList<>();

    public static zzcc zza(String str) {
        Iterator<zzcc> it = zza.iterator();
        while (it.hasNext()) {
            zzcc next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
