package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.n0 */
/* loaded from: classes.dex */
public final class C0969n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C0976r c0976r = null;
        C0913C0 c0913c0 = null;
        C0918F c0918f = null;
        C0925I0 c0925i0 = null;
        C0927K c0927k = null;
        C0929M c0929m = null;
        C0917E0 c0917e0 = null;
        C0932P c0932p = null;
        C0978s c0978s = null;
        C0934S c0934s = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    c0976r = (C0976r) AbstractC7066b.m29093p(parcel, m29066D, C0976r.CREATOR);
                    break;
                case 3:
                    c0913c0 = (C0913C0) AbstractC7066b.m29093p(parcel, m29066D, C0913C0.CREATOR);
                    break;
                case 4:
                    c0918f = (C0918F) AbstractC7066b.m29093p(parcel, m29066D, C0918F.CREATOR);
                    break;
                case 5:
                    c0925i0 = (C0925I0) AbstractC7066b.m29093p(parcel, m29066D, C0925I0.CREATOR);
                    break;
                case 6:
                    c0927k = (C0927K) AbstractC7066b.m29093p(parcel, m29066D, C0927K.CREATOR);
                    break;
                case 7:
                    c0929m = (C0929M) AbstractC7066b.m29093p(parcel, m29066D, C0929M.CREATOR);
                    break;
                case 8:
                    c0917e0 = (C0917E0) AbstractC7066b.m29093p(parcel, m29066D, C0917E0.CREATOR);
                    break;
                case 9:
                    c0932p = (C0932P) AbstractC7066b.m29093p(parcel, m29066D, C0932P.CREATOR);
                    break;
                case 10:
                    c0978s = (C0978s) AbstractC7066b.m29093p(parcel, m29066D, C0978s.CREATOR);
                    break;
                case 11:
                    c0934s = (C0934S) AbstractC7066b.m29093p(parcel, m29066D, C0934S.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0948d(c0976r, c0913c0, c0918f, c0925i0, c0927k, c0929m, c0917e0, c0932p, c0978s, c0934s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0948d[i7];
    }
}
