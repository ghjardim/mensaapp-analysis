package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.AbstractC3802r;

/* loaded from: classes.dex */
final class zzds extends zzeu {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzff zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzds(zzff zzffVar, Bundle bundle) {
        super(zzffVar, true);
        this.zza = bundle;
        this.zzb = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzb.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).setConsentThirdParty(this.zza, this.zzh);
    }
}
