package com.google.android.gms.internal.pay;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p115Q2.C2015C;
import p115Q2.C2025H;
import p115Q2.C2042P0;
import p115Q2.C2078f0;
import p115Q2.C2085h1;
import p115Q2.C2091k;
import p115Q2.C2092k0;

/* loaded from: classes.dex */
public final class zzg extends zza implements IInterface {
    public zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pay.internal.IThirdPartyPayService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(C2042P0 c2042p0, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2042p0);
        zza.writeStrongBinder(zzfVar);
        zzb(8, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(C2085h1 c2085h1, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2085h1);
        zza.writeStrongBinder(zzfVar);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(C2091k c2091k, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2091k);
        zza.writeStrongBinder(zzfVar);
        zzb(5, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(C2015C c2015c, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2015c);
        zza.writeStrongBinder(zzfVar);
        zzb(7, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzg(C2025H c2025h, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2025h);
        zza.writeStrongBinder(zzfVar);
        zzb(10, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(C2078f0 c2078f0, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2078f0);
        zza.writeStrongBinder(zzfVar);
        zzb(9, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(C2092k0 c2092k0, zzf zzfVar) {
        Parcel zza = zza();
        zzc.zzc(zza, c2092k0);
        zza.writeStrongBinder(zzfVar);
        zzb(3, zza);
    }
}
