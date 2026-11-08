package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p278l2.C5515b;
import p278l2.C5516c;

/* loaded from: classes.dex */
public final class zzd extends zza implements zzf {
    public zzd(IBinder iBinder) {
        super(iBinder, "com.google.android.auth.IAuthManagerService");
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzd(String str, Bundle bundle) {
        Parcel zza = zza();
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(2, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zze(Account account, String str, Bundle bundle) {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        zza.writeString(str);
        zzc.zzc(zza, bundle);
        Parcel zzb = zzb(5, zza);
        Bundle bundle2 = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzf(Account account) {
        Parcel zza = zza();
        zzc.zzc(zza, account);
        Parcel zzb = zzb(7, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final Bundle zzg(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzb = zzb(8, zza);
        Bundle bundle = (Bundle) zzc.zza(zzb, Bundle.CREATOR);
        zzb.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final C5516c zzh(C5515b c5515b) {
        Parcel zza = zza();
        zzc.zzc(zza, c5515b);
        Parcel zzb = zzb(3, zza);
        C5516c c5516c = (C5516c) zzc.zza(zzb, C5516c.CREATOR);
        zzb.recycle();
        return c5516c;
    }
}
