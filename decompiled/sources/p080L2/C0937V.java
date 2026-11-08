package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.V */
/* loaded from: classes.dex */
public final class C0937V implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        C0956h c0956h = null;
        C0954g c0954g = null;
        C0958i c0958i = null;
        C0950e c0950e = null;
        String str3 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 2:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    bArr = AbstractC7066b.m29084g(parcel, m29066D);
                    break;
                case 4:
                    c0956h = (C0956h) AbstractC7066b.m29093p(parcel, m29066D, C0956h.CREATOR);
                    break;
                case 5:
                    c0954g = (C0954g) AbstractC7066b.m29093p(parcel, m29066D, C0954g.CREATOR);
                    break;
                case 6:
                    c0958i = (C0958i) AbstractC7066b.m29093p(parcel, m29066D, C0958i.CREATOR);
                    break;
                case 7:
                    c0950e = (C0950e) AbstractC7066b.m29093p(parcel, m29066D, C0950e.CREATOR);
                    break;
                case 8:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0980t(str, str2, bArr, c0956h, c0954g, c0958i, c0950e, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0980t[i7];
    }
}
