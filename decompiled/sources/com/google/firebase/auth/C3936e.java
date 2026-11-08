package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.AbstractC3933b;
import p382y2.AbstractC7066b;

/* renamed from: com.google.firebase.auth.e */
/* loaded from: classes.dex */
public final class C3936e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            AbstractC7066b.m29100w(m29066D);
            AbstractC7066b.m29074L(parcel, m29066D);
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new AbstractC3933b.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AbstractC3933b.a[i7];
    }
}
