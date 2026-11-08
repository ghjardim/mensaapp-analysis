package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: C2.k */
/* loaded from: classes.dex */
public final class C0086k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Parcel parcel2 = null;
        int i7 = 0;
        C0083h c0083h = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                parcel2 = AbstractC7066b.m29091n(parcel, m29066D);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c0083h = (C0083h) AbstractC7066b.m29093p(parcel, m29066D, C0083h.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0078c(i7, parcel2, c0083h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0078c[i7];
    }
}
