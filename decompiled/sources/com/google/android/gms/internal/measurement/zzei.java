package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzei extends zzeu {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzcs zzb;
    final /* synthetic */ zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzei(zzff zzffVar, Bundle bundle, zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = bundle;
        this.zzb = zzcsVar;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).performAction(this.zza, this.zzb, this.zzh);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zzb.zze(null);
    }
}
