package com.google.android.gms.internal.measurement;

import java.util.List;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzhl extends zzlz implements zzni {
    private zzhl() {
        throw null;
    }

    public final int zza() {
        return ((zzhm) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzhm) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzhm) this.zza).zzd();
    }

    public final zzhl zzd(Iterable iterable) {
        zzbe();
        zzhm.zzj((zzhm) this.zza, iterable);
        return this;
    }

    public final zzhl zze(zzhp zzhpVar) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzf(zzhq zzhqVar) {
        zzbe();
        zzhm.zzk((zzhm) this.zza, zzhqVar);
        return this;
    }

    public final zzhl zzg() {
        zzbe();
        ((zzhm) this.zza).zze = zzmd.zzcn();
        return this;
    }

    public final zzhl zzh(int i7) {
        zzbe();
        zzhm.zzn((zzhm) this.zza, i7);
        return this;
    }

    public final zzhl zzi(String str) {
        zzbe();
        zzhm.zzo((zzhm) this.zza, str);
        return this;
    }

    public final zzhl zzj(int i7, zzhp zzhpVar) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i7, (zzhq) zzhpVar.zzba());
        return this;
    }

    public final zzhl zzk(int i7, zzhq zzhqVar) {
        zzbe();
        zzhm.zzp((zzhm) this.zza, i7, zzhqVar);
        return this;
    }

    public final zzhl zzl(long j7) {
        zzbe();
        zzhm.zzq((zzhm) this.zza, j7);
        return this;
    }

    public final zzhl zzm(long j7) {
        zzbe();
        zzhm.zzr((zzhm) this.zza, j7);
        return this;
    }

    public final zzhq zzn(int i7) {
        return ((zzhm) this.zza).zzg(i7);
    }

    public final String zzo() {
        return ((zzhm) this.zza).zzh();
    }

    public final List zzp() {
        return DesugarCollections.unmodifiableList(((zzhm) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzhm) this.zza).zzu();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zzhl(com.google.android.gms.internal.measurement.zzip r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.zzhm r1 = com.google.android.gms.internal.measurement.zzhm.zzf()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzhl.<init>(com.google.android.gms.internal.measurement.zzip):void");
    }
}
