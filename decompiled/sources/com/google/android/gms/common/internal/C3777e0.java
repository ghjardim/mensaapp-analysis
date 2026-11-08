package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: com.google.android.gms.common.internal.e0 */
/* loaded from: classes.dex */
public final class C3777e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w == 3) {
                z7 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w == 4) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                i9 = AbstractC7066b.m29068F(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3806t(i7, z6, z7, i8, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3806t[i7];
    }
}
