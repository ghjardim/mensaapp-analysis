package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: com.google.android.gms.common.internal.o */
/* loaded from: classes.dex */
public class C3796o extends AbstractC7065a {
    public static final Parcelable.Creator<C3796o> CREATOR = new C3752J();

    /* renamed from: a */
    public final int f12530a;

    /* renamed from: b */
    public final int f12531b;

    /* renamed from: c */
    public final int f12532c;

    /* renamed from: d */
    public final long f12533d;

    /* renamed from: e */
    public final long f12534e;

    /* renamed from: f */
    public final String f12535f;

    /* renamed from: n */
    public final String f12536n;

    /* renamed from: o */
    public final int f12537o;

    /* renamed from: p */
    public final int f12538p;

    public C3796o(int i7, int i8, int i9, long j7, long j8, String str, String str2, int i10, int i11) {
        this.f12530a = i7;
        this.f12531b = i8;
        this.f12532c = i9;
        this.f12533d = j7;
        this.f12534e = j8;
        this.f12535f = str;
        this.f12536n = str2;
        this.f12537o = i10;
        this.f12538p = i11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f12530a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29136t(parcel, 2, this.f12531b);
        AbstractC7067c.m29136t(parcel, 3, this.f12532c);
        AbstractC7067c.m29140x(parcel, 4, this.f12533d);
        AbstractC7067c.m29140x(parcel, 5, this.f12534e);
        AbstractC7067c.m29108E(parcel, 6, this.f12535f, false);
        AbstractC7067c.m29108E(parcel, 7, this.f12536n, false);
        AbstractC7067c.m29136t(parcel, 8, this.f12537o);
        AbstractC7067c.m29136t(parcel, 9, this.f12538p);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
