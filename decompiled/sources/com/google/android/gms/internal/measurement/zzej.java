package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzej extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzej(zzff zzffVar, String str, zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = zzcsVar;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).getMaxUserProperties(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zzb.zze(null);
    }
}
