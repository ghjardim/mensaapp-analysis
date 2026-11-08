package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzdq extends zzeu {
    final /* synthetic */ zzdj zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzff zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdq(zzff zzffVar, zzdj zzdjVar, String str, String str2) {
        super(zzffVar, true);
        this.zza = zzdjVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzd.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).setCurrentScreenByScionActivityInfo(this.zza, this.zzb, this.zzc, this.zzh);
    }
}
