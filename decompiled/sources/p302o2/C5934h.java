package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p382y2.AbstractC7066b;

/* renamed from: o2.h */
/* loaded from: classes.dex */
public final class C5934h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        HashSet hashSet = new HashSet();
        int i7 = 0;
        C5935i c5935i = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
                hashSet.add(1);
            } else if (m29100w == 2) {
                c5935i = (C5935i) AbstractC7066b.m29093p(parcel, m29066D, C5935i.CREATOR);
                hashSet.add(2);
            } else if (m29100w == 3) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
                hashSet.add(3);
            } else if (m29100w == 4) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
                hashSet.add(4);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str3 = AbstractC7066b.m29094q(parcel, m29066D);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == m29075M) {
            return new C5933g(hashSet, i7, c5935i, str, str2, str3);
        }
        throw new AbstractC7066b.a("Overread allowed size end=" + m29075M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5933g[i7];
    }
}
