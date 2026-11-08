package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.t */
/* loaded from: classes.dex */
public class C3806t extends AbstractC7065a {
    public static final Parcelable.Creator<C3806t> CREATOR = new C3777e0();

    /* renamed from: a */
    public final int f12559a;

    /* renamed from: b */
    public final boolean f12560b;

    /* renamed from: c */
    public final boolean f12561c;

    /* renamed from: d */
    public final int f12562d;

    /* renamed from: e */
    public final int f12563e;

    public C3806t(int i7, boolean z6, boolean z7, int i8, int i9) {
        this.f12559a = i7;
        this.f12560b = z6;
        this.f12561c = z7;
        this.f12562d = i8;
        this.f12563e = i9;
    }

    /* renamed from: A0 */
    public boolean m15138A0() {
        return this.f12561c;
    }

    /* renamed from: B0 */
    public int m15139B0() {
        return this.f12559a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m15139B0());
        AbstractC7067c.m29123g(parcel, 2, m15142z0());
        AbstractC7067c.m29123g(parcel, 3, m15138A0());
        AbstractC7067c.m29136t(parcel, 4, m15140x0());
        AbstractC7067c.m29136t(parcel, 5, m15141y0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m15140x0() {
        return this.f12562d;
    }

    /* renamed from: y0 */
    public int m15141y0() {
        return this.f12563e;
    }

    /* renamed from: z0 */
    public boolean m15142z0() {
        return this.f12560b;
    }
}
