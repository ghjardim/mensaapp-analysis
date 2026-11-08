package p122R2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: R2.j */
/* loaded from: classes.dex */
public final class C2238j extends AbstractC7065a {
    public static final Parcelable.Creator<C2238j> CREATOR = new C2239k();

    /* renamed from: a */
    public final long f6850a;

    /* renamed from: b */
    public final C2229a[] f6851b;

    /* renamed from: c */
    public final int f6852c;

    /* renamed from: d */
    public final boolean f6853d;

    public C2238j(long j7, C2229a[] c2229aArr, int i7, boolean z6) {
        this.f6850a = j7;
        this.f6851b = c2229aArr;
        this.f6853d = z6;
        if (z6) {
            this.f6852c = i7;
        } else {
            this.f6852c = -1;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 2, this.f6850a);
        AbstractC7067c.m29111H(parcel, 3, this.f6851b, i7, false);
        AbstractC7067c.m29136t(parcel, 4, this.f6852c);
        AbstractC7067c.m29123g(parcel, 5, this.f6853d);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
