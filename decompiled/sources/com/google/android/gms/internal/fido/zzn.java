package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p080L2.C0964l;
import p080L2.C0966m;

/* loaded from: classes.dex */
public final class zzn extends zza implements IInterface {
    public zzn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzg zzgVar, String str) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzgVar);
        zza.writeString(str);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzm zzmVar, C0964l c0964l) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, c0964l);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zzm zzmVar, C0966m c0966m) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzmVar);
        zzc.zzd(zza, c0966m);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzf(zze zzeVar) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
