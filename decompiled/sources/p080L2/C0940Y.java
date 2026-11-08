package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: L2.Y */
/* loaded from: classes.dex */
public final class C0940Y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        byte[] bArr = null;
        Double d7 = null;
        String str = null;
        ArrayList arrayList = null;
        Integer num = null;
        C0916E c0916e = null;
        String str2 = null;
        C0948d c0948d = null;
        Long l7 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    bArr = AbstractC7066b.m29084g(parcel, m29066D);
                    break;
                case 3:
                    d7 = AbstractC7066b.m29063A(parcel, m29066D);
                    break;
                case 4:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, C0984v.CREATOR);
                    break;
                case 6:
                    num = AbstractC7066b.m29069G(parcel, m29066D);
                    break;
                case 7:
                    c0916e = (C0916E) AbstractC7066b.m29093p(parcel, m29066D, C0916E.CREATOR);
                    break;
                case 8:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    c0948d = (C0948d) AbstractC7066b.m29093p(parcel, m29066D, C0948d.CREATOR);
                    break;
                case 10:
                    l7 = AbstractC7066b.m29071I(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0988x(bArr, d7, str, arrayList, num, c0916e, str2, c0948d, l7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0988x[i7];
    }
}
