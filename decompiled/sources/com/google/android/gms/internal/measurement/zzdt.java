package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzdt extends zzeu {
    final /* synthetic */ zzff zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdt(zzff zzffVar) {
        super(zzffVar, true);
        this.zza = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zza.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).resetAnalyticsData(this.zzh);
    }
}
