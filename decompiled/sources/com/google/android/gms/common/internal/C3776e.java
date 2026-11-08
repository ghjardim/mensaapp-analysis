package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.e */
/* loaded from: classes.dex */
public class C3776e extends AbstractC7065a {
    public static final Parcelable.Creator<C3776e> CREATOR = new C3795n0();

    /* renamed from: a */
    public final C3806t f12482a;

    /* renamed from: b */
    public final boolean f12483b;

    /* renamed from: c */
    public final boolean f12484c;

    /* renamed from: d */
    public final int[] f12485d;

    /* renamed from: e */
    public final int f12486e;

    /* renamed from: f */
    public final int[] f12487f;

    public C3776e(C3806t c3806t, boolean z6, boolean z7, int[] iArr, int i7, int[] iArr2) {
        this.f12482a = c3806t;
        this.f12483b = z6;
        this.f12484c = z7;
        this.f12485d = iArr;
        this.f12486e = i7;
        this.f12487f = iArr2;
    }

    /* renamed from: A0 */
    public boolean m15065A0() {
        return this.f12483b;
    }

    /* renamed from: B0 */
    public boolean m15066B0() {
        return this.f12484c;
    }

    /* renamed from: C0 */
    public final C3806t m15067C0() {
        return this.f12482a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f12482a, i7, false);
        AbstractC7067c.m29123g(parcel, 2, m15065A0());
        AbstractC7067c.m29123g(parcel, 3, m15066B0());
        AbstractC7067c.m29137u(parcel, 4, m15069y0(), false);
        AbstractC7067c.m29136t(parcel, 5, m15068x0());
        AbstractC7067c.m29137u(parcel, 6, m15070z0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m15068x0() {
        return this.f12486e;
    }

    /* renamed from: y0 */
    public int[] m15069y0() {
        return this.f12485d;
    }

    /* renamed from: z0 */
    public int[] m15070z0() {
        return this.f12487f;
    }
}
