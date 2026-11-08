package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class zzbw extends AbstractC7065a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.zza);
        AbstractC7067c.m29108E(parcel, 2, this.zzb, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i7, String str) {
        this.zza = i7;
        this.zzb = str;
    }
}
