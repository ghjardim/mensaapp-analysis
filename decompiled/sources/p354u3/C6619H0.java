package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import p346t3.C6543y0;
import p382y2.AbstractC7066b;

/* renamed from: u3.H0 */
/* loaded from: classes.dex */
public final class C6619H0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C6654i c6654i = null;
        C6617G0 c6617g0 = null;
        C6543y0 c6543y0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c6654i = (C6654i) AbstractC7066b.m29093p(parcel, m29066D, C6654i.CREATOR);
            } else if (m29100w == 2) {
                c6617g0 = (C6617G0) AbstractC7066b.m29093p(parcel, m29066D, C6617G0.CREATOR);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c6543y0 = (C6543y0) AbstractC7066b.m29093p(parcel, m29066D, C6543y0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6621I0(c6654i, c6617g0, c6543y0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6621I0[i7];
    }
}
