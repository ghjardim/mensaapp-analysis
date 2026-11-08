package com.google.android.gms.internal.measurement;

import android.app.Activity;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzfd extends zzeu {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzfe zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfd(zzfe zzfeVar, Activity activity) {
        super(zzfeVar.zza, true);
        this.zza = activity;
        this.zzb = zzfeVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zza.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).onActivityDestroyedByScionActivityInfo(zzdj.zza(this.zza), this.zzi);
    }
}
