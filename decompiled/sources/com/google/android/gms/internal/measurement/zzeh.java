package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;
import p052H2.BinderC0553b;

/* loaded from: classes.dex */
final class zzeh extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ Object zzb;
    final /* synthetic */ zzff zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeh(zzff zzffVar, boolean z6, int i7, String str, Object obj, Object obj2, Object obj3) {
        super(zzffVar, false);
        this.zza = str;
        this.zzb = obj;
        this.zzc = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zzc.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).logHealthData(5, this.zza, BinderC0553b.m2138f(this.zzb), BinderC0553b.m2138f(null), BinderC0553b.m2138f(null));
    }
}
