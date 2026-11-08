package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.C2235g;

/* loaded from: classes.dex */
final class zzq extends zzd {
    final /* synthetic */ zzr zza;

    public zzq(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzd(Status status, C2235g c2235g) {
        this.zza.setResult((zzr) new zzp(status, c2235g));
    }
}
