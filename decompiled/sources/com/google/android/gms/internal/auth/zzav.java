package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class zzav extends AbstractC7065a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i7, String str, int i8) {
        this.zza = 1;
        this.zzb = (String) AbstractC3802r.m15129k(str);
        this.zzc = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.zza);
        AbstractC7067c.m29108E(parcel, 2, this.zzb, false);
        AbstractC7067c.m29136t(parcel, 3, this.zzc);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public zzav(String str, int i7) {
        this(1, str, i7);
    }
}
