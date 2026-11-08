package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: P2.R6 */
/* loaded from: classes.dex */
public final class C1593R6 extends AbstractC7065a {
    public static final Parcelable.Creator<C1593R6> CREATOR = new C1601S6();

    /* renamed from: a */
    public final String f4920a;

    /* renamed from: b */
    public final long f4921b;

    /* renamed from: c */
    public final int f4922c;

    public C1593R6(String str, long j7, int i7) {
        this.f4920a = str;
        this.f4921b = j7;
        this.f4922c = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f4920a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, str, false);
        AbstractC7067c.m29140x(parcel, 2, this.f4921b);
        AbstractC7067c.m29136t(parcel, 3, this.f4922c);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
