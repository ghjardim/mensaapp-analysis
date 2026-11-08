package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.C2230b;

/* loaded from: classes.dex */
final class zzy extends zzd {
    final /* synthetic */ zzz zza;

    public zzy(zzz zzzVar) {
        this.zza = zzzVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzj(Status status, C2230b c2230b) {
        this.zza.setResult((zzz) new zzac(status, c2230b));
    }
}
