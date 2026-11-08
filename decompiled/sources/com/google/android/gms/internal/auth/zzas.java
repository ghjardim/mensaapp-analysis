package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p302o2.C5927a;
import p302o2.C5928b;
import p302o2.C5935i;

/* loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                C5935i c5935i = (C5935i) zzc.zza(parcel, C5935i.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, c5935i);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                C5928b c5928b = (C5928b) zzc.zza(parcel, C5928b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, c5928b);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                C5927a c5927a = (C5927a) zzc.zza(parcel, C5927a.CREATOR);
                zzc.zzb(parcel);
                zzc(c5927a);
                return true;
            default:
                return false;
        }
    }
}
