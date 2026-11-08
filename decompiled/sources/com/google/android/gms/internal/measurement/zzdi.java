package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* loaded from: classes.dex */
public final class zzdi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        boolean z6 = false;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 2:
                    j8 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 3:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 4:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    bundle = AbstractC7066b.m29083f(parcel, m29066D);
                    break;
                case 8:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new zzdh(j7, j8, z6, str, str2, str3, bundle, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new zzdh[i7];
    }
}
