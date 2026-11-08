package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* loaded from: classes.dex */
public final class zzaz extends AbstractC7065a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i7, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) AbstractC3802r.m15129k(str);
        this.zzc = (byte[]) AbstractC3802r.m15129k(bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.zza);
        AbstractC7067c.m29108E(parcel, 2, this.zzb, false);
        AbstractC7067c.m29127k(parcel, 3, this.zzc, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
