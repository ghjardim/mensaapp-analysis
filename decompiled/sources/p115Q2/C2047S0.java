package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.S0 */
/* loaded from: classes.dex */
public final class C2047S0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2049T0 c2049t0 = null;
        C2108s0 c2108s0 = null;
        C2096m0 c2096m0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c2049t0 = (C2049T0) AbstractC7066b.m29093p(parcel, m29066D, C2049T0.CREATOR);
            } else if (m29100w == 2) {
                c2108s0 = (C2108s0) AbstractC7066b.m29093p(parcel, m29066D, C2108s0.CREATOR);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2096m0 = (C2096m0) AbstractC7066b.m29093p(parcel, m29066D, C2096m0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2045R0(c2049t0, c2108s0, c2096m0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2045R0[i7];
    }
}
