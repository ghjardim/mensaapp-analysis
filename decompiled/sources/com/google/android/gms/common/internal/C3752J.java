package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: com.google.android.gms.common.internal.J */
/* loaded from: classes.dex */
public final class C3752J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        String str = null;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i8 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    i9 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 3:
                    i10 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 4:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 5:
                    j8 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 6:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    i11 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 9:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3796o(i8, i9, i10, j7, j8, str, str2, i11, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3796o[i7];
    }
}
