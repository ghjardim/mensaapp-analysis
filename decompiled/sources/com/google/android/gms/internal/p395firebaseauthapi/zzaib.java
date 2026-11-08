package com.google.android.gms.internal.p395firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import p272k4.C5410A;
import p382y2.AbstractC7066b;

/* loaded from: classes.dex */
public final class zzaib implements Parcelable.Creator<zzaic> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    str8 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 10:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 11:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    str9 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 13:
                    str10 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 14:
                    str11 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 15:
                    str12 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 16:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 17:
                    str13 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new zzaic(str, str2, str3, str4, str5, str6, str7, str8, z6, z7, str9, str10, str11, str12, z8, str13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaic[] newArray(int i7) {
        return new zzaic[i7];
    }
}
