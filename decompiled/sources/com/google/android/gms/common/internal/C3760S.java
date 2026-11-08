package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.InterfaceC3786j;
import p368w2.C6861b;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.S */
/* loaded from: classes.dex */
public final class C3760S extends AbstractC7065a {
    public static final Parcelable.Creator<C3760S> CREATOR = new C3761T();

    /* renamed from: a */
    public final int f12452a;

    /* renamed from: b */
    public final IBinder f12453b;

    /* renamed from: c */
    public final C6861b f12454c;

    /* renamed from: d */
    public final boolean f12455d;

    /* renamed from: e */
    public final boolean f12456e;

    public C3760S(int i7, IBinder iBinder, C6861b c6861b, boolean z6, boolean z7) {
        this.f12452a = i7;
        this.f12453b = iBinder;
        this.f12454c = c6861b;
        this.f12455d = z6;
        this.f12456e = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3760S)) {
            return false;
        }
        C3760S c3760s = (C3760S) obj;
        return this.f12454c.equals(c3760s.f12454c) && AbstractC3798p.m15099b(m15034y0(), c3760s.m15034y0());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f12452a);
        AbstractC7067c.m29135s(parcel, 2, this.f12453b, false);
        AbstractC7067c.m29106C(parcel, 3, this.f12454c, i7, false);
        AbstractC7067c.m29123g(parcel, 4, this.f12455d);
        AbstractC7067c.m29123g(parcel, 5, this.f12456e);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final C6861b m15033x0() {
        return this.f12454c;
    }

    /* renamed from: y0 */
    public final InterfaceC3786j m15034y0() {
        IBinder iBinder = this.f12453b;
        if (iBinder == null) {
            return null;
        }
        return InterfaceC3786j.a.m15094a(iBinder);
    }
}
