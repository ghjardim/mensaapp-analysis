package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p368w2.C6861b;
import p382y2.AbstractC7066b;

/* renamed from: com.google.android.gms.common.internal.T */
/* loaded from: classes.dex */
public final class C3761T implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        IBinder iBinder = null;
        C6861b c6861b = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                iBinder = AbstractC7066b.m29067E(parcel, m29066D);
            } else if (m29100w == 3) {
                c6861b = (C6861b) AbstractC7066b.m29093p(parcel, m29066D, C6861b.CREATOR);
            } else if (m29100w == 4) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                z7 = AbstractC7066b.m29101x(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3760S(i7, iBinder, c6861b, z6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C3760S[i7];
    }
}
