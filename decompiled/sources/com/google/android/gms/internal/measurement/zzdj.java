package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p256j$.util.Objects;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class zzdj extends AbstractC7065a {
    public static final Parcelable.Creator<zzdj> CREATOR = new zzdk();
    public final int zza;
    public final String zzb;
    public final Intent zzc;

    public zzdj(int i7, String str, Intent intent) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdj zza(Activity activity) {
        return new zzdj(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdj)) {
            return false;
        }
        zzdj zzdjVar = (zzdj) obj;
        return this.zza == zzdjVar.zza && Objects.equals(this.zzb, zzdjVar.zzb) && Objects.equals(this.zzc, zzdjVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, this.zzb, false);
        AbstractC7067c.m29106C(parcel, 3, this.zzc, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
