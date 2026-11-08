package com.google.android.gms.internal.measurement;

import java.util.List;
import p256j$.util.DesugarCollections;

/* loaded from: classes.dex */
public final class zzgn extends zzlz implements zzni {
    private zzgn() {
        throw null;
    }

    public final int zza() {
        return ((zzgo) this.zza).zzb();
    }

    public final zzgm zzb(int i7) {
        return ((zzgo) this.zza).zze(i7);
    }

    public final zzgn zzc() {
        zzbe();
        ((zzgo) this.zza).zzj = zzmd.zzcn();
        return this;
    }

    public final zzgn zzd() {
        zzbe();
        ((zzgo) this.zza).zzm = zzmd.zzcn();
        return this;
    }

    public final zzgn zze(int i7, zzgl zzglVar) {
        zzbe();
        zzgo.zzs((zzgo) this.zza, i7, (zzgm) zzglVar.zzba());
        return this;
    }

    public final String zzf() {
        return ((zzgo) this.zza).zzk();
    }

    public final List zzg() {
        return DesugarCollections.unmodifiableList(((zzgo) this.zza).zzm());
    }

    public final List zzh() {
        return DesugarCollections.unmodifiableList(((zzgo) this.zza).zzn());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zzgn(com.google.android.gms.internal.measurement.zzgz r1) {
        /*
            r0 = this;
            com.google.android.gms.internal.measurement.zzgo r1 = com.google.android.gms.internal.measurement.zzgo.zzg()
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzgn.<init>(com.google.android.gms.internal.measurement.zzgz):void");
    }
}
