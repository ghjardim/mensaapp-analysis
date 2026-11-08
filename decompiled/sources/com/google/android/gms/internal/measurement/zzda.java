package com.google.android.gms.internal.measurement;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzda extends zzbn implements zzdb {
    public zzda() {
        super("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbn
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        zze();
        return true;
    }
}
