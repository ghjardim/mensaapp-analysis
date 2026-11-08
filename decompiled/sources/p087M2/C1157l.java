package p087M2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: M2.l */
/* loaded from: classes.dex */
public final class C1157l implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C1147b c1147b = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                c1147b = (C1147b) AbstractC7066b.m29093p(parcel, m29066D, C1147b.CREATOR);
            } else if (m29100w == 3) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1150e(c1147b, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1150e[i7];
    }
}
