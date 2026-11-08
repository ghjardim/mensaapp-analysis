package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.m0 */
/* loaded from: classes.dex */
public final class C0967m0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C0920G c0920g = null;
        C0973p0 c0973p0 = null;
        C0952f c0952f = null;
        C0977r0 c0977r0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c0920g = (C0920G) AbstractC7066b.m29093p(parcel, m29066D, C0920G.CREATOR);
            } else if (m29100w == 2) {
                c0973p0 = (C0973p0) AbstractC7066b.m29093p(parcel, m29066D, C0973p0.CREATOR);
            } else if (m29100w == 3) {
                c0952f = (C0952f) AbstractC7066b.m29093p(parcel, m29066D, C0952f.CREATOR);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c0977r0 = (C0977r0) AbstractC7066b.m29093p(parcel, m29066D, C0977r0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0950e(c0920g, c0973p0, c0952f, c0977r0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0950e[i7];
    }
}
