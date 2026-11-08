package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p278l2.C5516c;

/* loaded from: classes.dex */
public abstract class zzl extends zzb implements zzm {
    public zzl() {
        super("com.google.android.gms.auth.account.data.IGetAccountChangeEventsCallback");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Status status = (Status) zzc.zza(parcel, Status.CREATOR);
        C5516c c5516c = (C5516c) zzc.zza(parcel, C5516c.CREATOR);
        zzc.zzb(parcel);
        zzb(status, c5516c);
        return true;
    }
}
