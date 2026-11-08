package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.C2240l;

/* loaded from: classes.dex */
final class zzw extends zzd {
    final /* synthetic */ zzx zza;

    public zzw(zzx zzxVar) {
        this.zza = zzxVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzh(Status status, C2240l c2240l) {
        this.zza.setResult((zzx) new zzab(status, c2240l));
    }
}
