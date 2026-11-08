package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
final class zznv extends zzoa {
    public zznv() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzoa
    public final void zza() {
        if (!zzj()) {
            for (int i7 = 0; i7 < zzc(); i7++) {
                Map.Entry zzg = zzg(i7);
                if (((zzlt) ((zznw) zzg).zza()).zze()) {
                    zzg.setValue(DesugarCollections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzlt) entry.getKey()).zze()) {
                    entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
