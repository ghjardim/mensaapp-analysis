package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.v */
/* loaded from: classes.dex */
public class C3810v extends AbstractC7065a {
    public static final Parcelable.Creator<C3810v> CREATOR = new C3818z();

    /* renamed from: a */
    public final int f12574a;

    /* renamed from: b */
    public List f12575b;

    public C3810v(int i7, List list) {
        this.f12574a = i7;
        this.f12575b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f12574a);
        AbstractC7067c.m29112I(parcel, 2, this.f12575b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public final int m15149x0() {
        return this.f12574a;
    }

    /* renamed from: y0 */
    public final List m15150y0() {
        return this.f12575b;
    }

    /* renamed from: z0 */
    public final void m15151z0(C3796o c3796o) {
        if (this.f12575b == null) {
            this.f12575b = new ArrayList();
        }
        this.f12575b.add(c3796o);
    }
}
