package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p368w2.C6863d;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.l0 */
/* loaded from: classes.dex */
public final class C3791l0 extends AbstractC7065a {
    public static final Parcelable.Creator<C3791l0> CREATOR = new C3793m0();

    /* renamed from: a */
    public Bundle f12523a;

    /* renamed from: b */
    public C6863d[] f12524b;

    /* renamed from: c */
    public int f12525c;

    /* renamed from: d */
    public C3776e f12526d;

    public C3791l0(Bundle bundle, C6863d[] c6863dArr, int i7, C3776e c3776e) {
        this.f12523a = bundle;
        this.f12524b = c6863dArr;
        this.f12525c = i7;
        this.f12526d = c3776e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29126j(parcel, 1, this.f12523a, false);
        AbstractC7067c.m29111H(parcel, 2, this.f12524b, i7, false);
        AbstractC7067c.m29136t(parcel, 3, this.f12525c);
        AbstractC7067c.m29106C(parcel, 4, this.f12526d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
