package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzdo extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcs zzc;
    final /* synthetic */ zzff zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdo(zzff zzffVar, String str, String str2, zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzcsVar;
        this.zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzd.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).getConditionalUserProperties(this.zza, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zzc.zze(null);
    }
}
