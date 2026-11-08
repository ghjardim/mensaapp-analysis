package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzdv extends zzeu {
    final /* synthetic */ long zza;
    final /* synthetic */ zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzff zzffVar, long j7) {
        super(zzffVar, true);
        this.zza = j7;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).setSessionTimeoutDuration(this.zza);
    }
}
