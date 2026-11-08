package com.google.android.gms.internal.auth;

import android.os.Parcel;
import p329r2.C6290c;

/* loaded from: classes.dex */
public abstract class zzbf extends zzb implements zzbg {
    public zzbf() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C6290c c6290c = (C6290c) zzc.zza(parcel, C6290c.CREATOR);
            zzc.zzb(parcel);
            zzb(c6290c);
        } else {
            if (i7 != 2) {
                return false;
            }
            String readString = parcel.readString();
            zzc.zzb(parcel);
            zzc(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
