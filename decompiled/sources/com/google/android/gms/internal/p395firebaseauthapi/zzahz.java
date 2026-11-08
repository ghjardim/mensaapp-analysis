package com.google.android.gms.internal.p395firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* loaded from: classes.dex */
public final class zzahz implements Parcelable.Creator<zzaia> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            AbstractC7066b.m29100w(m29066D);
            AbstractC7066b.m29074L(parcel, m29066D);
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new zzaia();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaia[] newArray(int i7) {
        return new zzaia[i7];
    }
}
