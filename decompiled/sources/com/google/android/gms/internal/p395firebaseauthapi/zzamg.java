package com.google.android.gms.internal.p395firebaseauthapi;

import java.util.List;
import java.util.Map;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
final class zzamg extends zzamh {
    public zzamg() {
        super();
    }

    @Override // com.google.android.gms.internal.p395firebaseauthapi.zzamh
    public final void zza() {
        if (!zze()) {
            for (int i7 = 0; i7 < zzb(); i7++) {
                Map.Entry zza = zza(i7);
                if (((zzaka) zza.getKey()).zze()) {
                    zza.setValue(DesugarCollections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzaka) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
