package p108P2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.X6 */
/* loaded from: classes.dex */
public final class C1641X6 extends AbstractC7065a {
    public static final Parcelable.Creator<C1641X6> CREATOR = new C1649Y6();

    /* renamed from: a */
    public final long f4992a;

    /* renamed from: b */
    public byte[] f4993b;

    /* renamed from: c */
    public final String f4994c;

    /* renamed from: d */
    public final Bundle f4995d;

    /* renamed from: e */
    public final int f4996e;

    /* renamed from: f */
    public final long f4997f;

    /* renamed from: n */
    public String f4998n;

    public C1641X6(long j7, byte[] bArr, String str, Bundle bundle, int i7, long j8, String str2) {
        this.f4992a = j7;
        this.f4993b = bArr;
        this.f4994c = str;
        this.f4995d = bundle;
        this.f4996e = i7;
        this.f4997f = j8;
        this.f4998n = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        long j7 = this.f4992a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, j7);
        AbstractC7067c.m29127k(parcel, 2, this.f4993b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f4994c, false);
        AbstractC7067c.m29126j(parcel, 4, this.f4995d, false);
        AbstractC7067c.m29136t(parcel, 5, this.f4996e);
        AbstractC7067c.m29140x(parcel, 6, this.f4997f);
        AbstractC7067c.m29108E(parcel, 7, this.f4998n, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
