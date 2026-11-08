package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzec extends zzeu {
    final /* synthetic */ zzcs zza;
    final /* synthetic */ zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzec(zzff zzffVar, zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = zzcsVar;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).generateEventId(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zza.zze(null);
    }
}
