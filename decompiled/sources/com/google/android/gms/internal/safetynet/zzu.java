package com.google.android.gms.internal.safetynet;

import com.google.android.gms.common.api.Status;
import p122R2.C2238j;

/* loaded from: classes.dex */
final class zzu extends zzd {
    final /* synthetic */ zzv zza;

    public zzu(zzv zzvVar) {
        this.zza = zzvVar;
    }

    @Override // com.google.android.gms.internal.safetynet.zzd, com.google.android.gms.internal.safetynet.zzg
    public final void zzg(Status status, C2238j c2238j) {
        this.zza.setResult((zzv) new zzaa(status, c2238j));
    }
}
