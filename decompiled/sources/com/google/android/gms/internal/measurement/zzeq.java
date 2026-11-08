package com.google.android.gms.internal.measurement;

import android.content.Intent;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzeq extends zzeu {
    final /* synthetic */ Intent zza;
    final /* synthetic */ zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeq(zzff zzffVar, Intent intent) {
        super(zzffVar, true);
        this.zza = intent;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).setSgtmDebugInfo(this.zza);
    }
}
