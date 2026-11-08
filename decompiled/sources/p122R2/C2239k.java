package p122R2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: R2.k */
/* loaded from: classes.dex */
public final class C2239k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        long j7 = 0;
        C2229a[] c2229aArr = null;
        int i7 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                j7 = AbstractC7066b.m29070H(parcel, m29066D);
            } else if (m29100w == 3) {
                c2229aArr = (C2229a[]) AbstractC7066b.m29097t(parcel, m29066D, C2229a.CREATOR);
            } else if (m29100w == 4) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2238j(j7, c2229aArr, i7, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C2238j[i7];
    }
}
