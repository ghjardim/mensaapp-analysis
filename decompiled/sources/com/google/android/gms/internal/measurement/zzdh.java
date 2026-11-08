package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class zzdh extends AbstractC7065a {
    public static final Parcelable.Creator<zzdh> CREATOR = new zzdi();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdh(long j7, long j8, boolean z6, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j7;
        this.zzb = j8;
        this.zzc = z6;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.zza;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, j7);
        AbstractC7067c.m29140x(parcel, 2, this.zzb);
        AbstractC7067c.m29123g(parcel, 3, this.zzc);
        AbstractC7067c.m29108E(parcel, 4, this.zzd, false);
        AbstractC7067c.m29108E(parcel, 5, this.zze, false);
        AbstractC7067c.m29108E(parcel, 6, this.zzf, false);
        AbstractC7067c.m29126j(parcel, 7, this.zzg, false);
        AbstractC7067c.m29108E(parcel, 8, this.zzh, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
