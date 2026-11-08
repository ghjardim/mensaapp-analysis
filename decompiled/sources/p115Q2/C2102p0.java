package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.p0 */
/* loaded from: classes.dex */
public final class C2102p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2104q0 c2104q0 = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c2104q0 = (C2104q0) AbstractC7066b.m29093p(parcel, m29066D, C2104q0.CREATOR);
            } else if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2100o0(c2104q0, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2100o0[i7];
    }
}
