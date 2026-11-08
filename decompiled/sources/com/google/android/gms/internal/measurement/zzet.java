package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzet extends zzeu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzff zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzet(zzff zzffVar, Long l7, String str, String str2, Bundle bundle, boolean z6, boolean z7) {
        super(zzffVar, true);
        this.zza = l7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z6;
        this.zzf = z7;
        this.zzg = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        Long l7 = this.zza;
        long longValue = l7 == null ? this.zzh : l7.longValue();
        zzcvVar = this.zzg.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
