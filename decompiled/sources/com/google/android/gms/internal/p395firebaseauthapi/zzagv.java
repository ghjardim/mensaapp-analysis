package com.google.android.gms.internal.p395firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* loaded from: classes.dex */
public final class zzagv implements Parcelable.Creator<zzagw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagw createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        Long l7 = null;
        String str3 = null;
        Long l8 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 4) {
                l7 = AbstractC7066b.m29071I(parcel, m29066D);
            } else if (m29100w == 5) {
                str3 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 6) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                l8 = AbstractC7066b.m29071I(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new zzagw(str, str2, l7, str3, l8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagw[] newArray(int i7) {
        return new zzagw[i7];
    }
}
