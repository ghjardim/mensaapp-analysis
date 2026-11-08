package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzdn extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Bundle zzc;
    final /* synthetic */ zzff zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdn(zzff zzffVar, String str, String str2, Bundle bundle) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = bundle;
        this.zzd = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzd.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).clearConditionalUserProperty(this.zza, this.zzb, this.zzc);
    }
}
