package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.h */
/* loaded from: classes.dex */
public final class C1721h extends AbstractC7065a {
    public static final Parcelable.Creator<C1721h> CREATOR = new C1730i();

    /* renamed from: a */
    public final long f5142a;

    /* renamed from: b */
    public final int f5143b;

    /* renamed from: c */
    public final long f5144c;

    public C1721h(long j7, int i7, long j8) {
        this.f5142a = j7;
        this.f5143b = i7;
        this.f5144c = j8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f5142a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, j7);
        AbstractC7067c.m29136t(parcel, 2, this.f5143b);
        AbstractC7067c.m29140x(parcel, 3, this.f5144c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
