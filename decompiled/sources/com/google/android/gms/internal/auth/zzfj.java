package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzfj extends zzfl {
    public /* synthetic */ zzfj(zzfi zzfiVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zza(Object obj, long j7) {
        ((zzez) zzhj.zzf(obj, j7)).zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzfl
    public final void zzb(Object obj, Object obj2, long j7) {
        zzez zzezVar = (zzez) zzhj.zzf(obj, j7);
        zzez zzezVar2 = (zzez) zzhj.zzf(obj2, j7);
        int size = zzezVar.size();
        int size2 = zzezVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzezVar.zzc()) {
                zzezVar = zzezVar.zzd(size2 + size);
            }
            zzezVar.addAll(zzezVar2);
        }
        if (size > 0) {
            zzezVar2 = zzezVar;
        }
        zzhj.zzp(obj, j7, zzezVar2);
    }

    private zzfj() {
        super(null);
    }
}
