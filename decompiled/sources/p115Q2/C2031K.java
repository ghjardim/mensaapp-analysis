package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.K */
/* loaded from: classes.dex */
public final class C2031K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        C2081g0 c2081g0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                str3 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2081g0 = (C2081g0) AbstractC7066b.m29093p(parcel, m29066D, C2081g0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2029J(str, str2, str3, c2081g0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2029J[i7];
    }
}
