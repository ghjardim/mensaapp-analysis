package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import p272k4.C5410A;
import p382y2.AbstractC7066b;

/* renamed from: P2.k */
/* loaded from: classes.dex */
public final class C1748k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        C1891z7 c1891z7 = null;
        String str3 = null;
        C1519J c1519j = null;
        C1519J c1519j2 = null;
        C1519J c1519j3 = null;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    c1891z7 = (C1891z7) AbstractC7066b.m29093p(parcel, m29066D, C1891z7.CREATOR);
                    break;
                case 5:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 6:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 7:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    c1519j = (C1519J) AbstractC7066b.m29093p(parcel, m29066D, C1519J.CREATOR);
                    break;
                case 9:
                    j8 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 10:
                    c1519j2 = (C1519J) AbstractC7066b.m29093p(parcel, m29066D, C1519J.CREATOR);
                    break;
                case 11:
                    j9 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    c1519j3 = (C1519J) AbstractC7066b.m29093p(parcel, m29066D, C1519J.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1739j(str, str2, c1891z7, j7, z6, str3, c1519j, j8, c1519j2, j9, c1519j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1739j[i7];
    }
}
