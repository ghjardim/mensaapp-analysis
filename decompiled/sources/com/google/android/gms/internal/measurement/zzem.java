package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzem extends zzeu {
    final /* synthetic */ zzcs zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzem(zzff zzffVar, zzcs zzcsVar, int i7) {
        super(zzffVar, true);
        this.zza = zzcsVar;
        this.zzb = i7;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).getTestFlag(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zza.zze(null);
    }
}
