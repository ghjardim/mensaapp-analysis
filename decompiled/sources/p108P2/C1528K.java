package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: P2.K */
/* loaded from: classes.dex */
public final class C1528K implements Parcelable.Creator {
    /* renamed from: a */
    public static void m5891a(C1519J c1519j, Parcel parcel, int i7) {
        String str = c1519j.f4758a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, str, false);
        AbstractC7067c.m29106C(parcel, 3, c1519j.f4759b, i7, false);
        AbstractC7067c.m29108E(parcel, 4, c1519j.f4760c, false);
        AbstractC7067c.m29140x(parcel, 5, c1519j.f4761d);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        long j7 = 0;
        String str = null;
        C1501H c1501h = null;
        String str2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                c1501h = (C1501H) AbstractC7066b.m29093p(parcel, m29066D, C1501H.CREATOR);
            } else if (m29100w == 4) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                j7 = AbstractC7066b.m29070H(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1519J(str, c1501h, str2, j7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1519J[i7];
    }
}
