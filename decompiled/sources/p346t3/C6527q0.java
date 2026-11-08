package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: t3.q0 */
/* loaded from: classes.dex */
public final class C6527q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 4) {
                str3 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 5) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w != 6) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str4 = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6483O(str, str2, str3, z6, str4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6483O[i7];
    }
}
