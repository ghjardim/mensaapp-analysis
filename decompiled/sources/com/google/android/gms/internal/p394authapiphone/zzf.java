package com.google.android.gms.internal.p394authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.auth.api.phone.internal.IOngoingSmsRequestCallback");
    }

    @Override // com.google.android.gms.internal.p394authapiphone.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        boolean z6 = parcel.readInt() != 0;
        zzc.zzb(parcel);
        zzb(status, z6);
        return true;
    }
}
