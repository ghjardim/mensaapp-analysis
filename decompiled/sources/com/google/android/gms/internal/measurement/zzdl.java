package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.AbstractC3802r;
import p052H2.BinderC0553b;

/* loaded from: classes.dex */
final class zzdl extends zzeu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzff zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzff zzffVar, String str, String str2, Object obj, boolean z6) {
        super(zzffVar, true);
        this.zza = str;
        this.zzb = str2;
        this.zzc = obj;
        this.zzd = z6;
        this.zze = zzffVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzeu
    public final void zza() {
        zzcv zzcvVar;
        zzcvVar = this.zze.zzj;
        ((zzcv) AbstractC3802r.m15129k(zzcvVar)).setUserProperty(this.zza, this.zzb, BinderC0553b.m2138f(this.zzc), this.zzd, this.zzh);
    }
}
