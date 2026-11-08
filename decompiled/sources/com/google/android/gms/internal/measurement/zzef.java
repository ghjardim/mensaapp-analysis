package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzef extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzcs zzd;
    final /* synthetic */ zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzef(zzff zzffVar, String str, String str2, boolean z6, zzcs zzcsVar) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = z6;
        this.zzd = zzcsVar;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zze.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zzb() {
        this.zzd.zze(null);
    }
}
