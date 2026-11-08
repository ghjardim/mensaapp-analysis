package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p122R2.C2230b;
import p122R2.C2235g;
import p122R2.C2238j;
import p122R2.C2240l;
import p122R2.C2242n;

/* loaded from: classes.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
    }

    @Override // com.google.android.gms.internal.safetynet.zzb
    public final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zzd((Status) zzc.zza(parcel, Status.CREATOR), (C2235g) zzc.zza(parcel, C2235g.CREATOR));
        } else if (i7 == 2) {
            zze(parcel.readString());
        } else if (i7 == 3) {
            zzj((Status) zzc.zza(parcel, Status.CREATOR), (C2230b) zzc.zza(parcel, C2230b.CREATOR));
        } else if (i7 == 4) {
            zzb((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i7 == 6) {
            zzh((Status) zzc.zza(parcel, Status.CREATOR), (C2240l) zzc.zza(parcel, C2240l.CREATOR));
        } else if (i7 == 8) {
            zzg((Status) zzc.zza(parcel, Status.CREATOR), (C2238j) zzc.zza(parcel, C2238j.CREATOR));
        } else if (i7 == 10) {
            zzf((Status) zzc.zza(parcel, Status.CREATOR), zzc.zzc(parcel));
        } else if (i7 == 11) {
            zzc((Status) zzc.zza(parcel, Status.CREATOR));
        } else if (i7 == 15) {
            zzi((Status) zzc.zza(parcel, Status.CREATOR), (C2242n) zzc.zza(parcel, C2242n.CREATOR));
        } else {
            if (i7 != 16) {
                return false;
            }
            zzk((Status) zzc.zza(parcel, Status.CREATOR), parcel.readString(), parcel.readInt());
        }
        return true;
    }
}
