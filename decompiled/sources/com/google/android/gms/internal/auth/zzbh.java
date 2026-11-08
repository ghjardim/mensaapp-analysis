package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p329r2.C6289b;

/* loaded from: classes.dex */
public final class zzbh extends zza implements IInterface {
    public zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc(3, zza);
    }

    public final void zze(zzbg zzbgVar, C6289b c6289b) {
        Parcel zza = zza();
        zzc.zzd(zza, zzbgVar);
        zzc.zzc(zza, c6289b);
        zzc(1, zza);
    }
}
