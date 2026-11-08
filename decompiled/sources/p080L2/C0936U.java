package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p272k4.C5410A;
import p382y2.AbstractC7066b;

/* renamed from: L2.U */
/* loaded from: classes.dex */
public final class C0936U implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C0990y c0990y = null;
        C0908A c0908a = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d7 = null;
        ArrayList arrayList2 = null;
        C0962k c0962k = null;
        Integer num = null;
        C0916E c0916e = null;
        String str = null;
        C0948d c0948d = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    c0990y = (C0990y) AbstractC7066b.m29093p(parcel, m29066D, C0990y.CREATOR);
                    break;
                case 3:
                    c0908a = (C0908A) AbstractC7066b.m29093p(parcel, m29066D, C0908A.CREATOR);
                    break;
                case 4:
                    bArr = AbstractC7066b.m29084g(parcel, m29066D);
                    break;
                case 5:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, C0986w.CREATOR);
                    break;
                case 6:
                    d7 = AbstractC7066b.m29063A(parcel, m29066D);
                    break;
                case 7:
                    arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C0984v.CREATOR);
                    break;
                case 8:
                    c0962k = (C0962k) AbstractC7066b.m29093p(parcel, m29066D, C0962k.CREATOR);
                    break;
                case 9:
                    num = AbstractC7066b.m29069G(parcel, m29066D);
                    break;
                case 10:
                    c0916e = (C0916E) AbstractC7066b.m29093p(parcel, m29066D, C0916E.CREATOR);
                    break;
                case 11:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    c0948d = (C0948d) AbstractC7066b.m29093p(parcel, m29066D, C0948d.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0982u(c0990y, c0908a, bArr, arrayList, d7, arrayList2, c0962k, num, c0916e, str, c0948d);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0982u[i7];
    }
}
