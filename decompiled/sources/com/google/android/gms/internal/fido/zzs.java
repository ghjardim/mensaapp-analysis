package com.google.android.gms.internal.fido;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p080L2.C0982u;
import p080L2.C0988x;

/* loaded from: classes.dex */
public final class zzs extends zza implements IInterface {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(zzr zzrVar, C0982u c0982u) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c0982u);
        zzb(1, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzd(zzr zzrVar, C0988x c0988x) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzrVar);
        zzc.zzd(zza, c0988x);
        zzb(2, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zze(zze zzeVar) {
        Parcel zza = zza();
        int i7 = zzc.zza;
        zza.writeStrongBinder(zzeVar);
        zzb(3, zza);
    }
}
