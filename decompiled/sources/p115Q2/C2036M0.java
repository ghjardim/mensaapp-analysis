package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.M0 */
/* loaded from: classes.dex */
public final class C2036M0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        C2016C0 c2016c0 = null;
        C2029J c2029j = null;
        int i7 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 3:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    c2016c0 = (C2016C0) AbstractC7066b.m29093p(parcel, m29066D, C2016C0.CREATOR);
                    break;
                case 6:
                    c2029j = (C2029J) AbstractC7066b.m29093p(parcel, m29066D, C2029J.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2034L0(i7, z6, str, str2, c2016c0, c2029j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2034L0[i7];
    }
}
