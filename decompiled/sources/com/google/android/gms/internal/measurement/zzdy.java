package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzdy extends zzda {
    final /* synthetic */ Runnable zza;

    public zzdy(zzdz zzdzVar, Runnable runnable) {
        this.zza = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzdb
    public final void zze() {
        this.zza.run();
    }
}
