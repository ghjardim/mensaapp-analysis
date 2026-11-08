package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* renamed from: com.google.android.gms.common.internal.W */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3764W extends zzb implements InterfaceC3790l {
    public AbstractBinderC3764W() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo15085B(readInt, readStrongBinder, bundle);
        } else if (i7 == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) zzc.zza(parcel, Bundle.CREATOR);
            zzc.zzb(parcel);
            mo15087r(readInt2, bundle2);
        } else {
            if (i7 != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C3791l0 c3791l0 = (C3791l0) zzc.zza(parcel, C3791l0.CREATOR);
            zzc.zzb(parcel);
            mo15086P(readInt3, readStrongBinder2, c3791l0);
        }
        parcel2.writeNoException();
        return true;
    }
}
