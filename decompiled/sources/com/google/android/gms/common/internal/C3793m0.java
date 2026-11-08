package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p368w2.C6863d;
import p382y2.AbstractC7066b;

/* renamed from: com.google.android.gms.common.internal.m0 */
/* loaded from: classes.dex */
public final class C3793m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Bundle bundle = null;
        C3776e c3776e = null;
        int i7 = 0;
        C6863d[] c6863dArr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            } else if (m29100w == 2) {
                c6863dArr = (C6863d[]) AbstractC7066b.m29097t(parcel, m29066D, C6863d.CREATOR);
            } else if (m29100w == 3) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c3776e = (C3776e) AbstractC7066b.m29093p(parcel, m29066D, C3776e.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3791l0(bundle, c6863dArr, i7, c3776e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3791l0[i7];
    }
}
