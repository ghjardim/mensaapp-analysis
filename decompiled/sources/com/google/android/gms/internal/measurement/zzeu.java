package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
abstract class zzeu implements Runnable {
    final long zzh;
    final long zzi;
    final boolean zzj;
    final /* synthetic */ zzff zzk;

    public zzeu(zzff zzffVar, boolean z6) {
        this.zzk = zzffVar;
        this.zzh = zzffVar.zza.mo1110a();
        this.zzi = zzffVar.zza.mo1111b();
        this.zzj = z6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        z6 = this.zzk.zzh;
        if (z6) {
            zzb();
            return;
        }
        try {
            zza();
        } catch (Exception e7) {
            this.zzk.zzU(e7, false, this.zzj);
            zzb();
        }
    }

    public abstract void zza();

    public void zzb() {
    }
}
