package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.n0 */
/* loaded from: classes.dex */
public final class C2098n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2115w c2115w = null;
        int i7 = 0;
        C2100o0 c2100o0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                c2115w = (C2115w) AbstractC7066b.m29093p(parcel, m29066D, C2115w.CREATOR);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2100o0 = (C2100o0) AbstractC7066b.m29093p(parcel, m29066D, C2100o0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2096m0(i7, c2115w, c2100o0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2096m0[i7];
    }
}
