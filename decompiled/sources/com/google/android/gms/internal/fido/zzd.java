package com.google.android.gms.internal.fido;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int i9 = zzc.zza;
            int readInt = parcel.readInt();
            zzc.zzc(parcel);
            zzb(readInt != 0);
        } else {
            if (i7 != 2) {
                return false;
            }
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            zzc.zzc(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }
}
