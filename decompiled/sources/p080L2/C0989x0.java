package p080L2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.x0 */
/* loaded from: classes.dex */
public final class C0989x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C0982u c0982u = null;
        Uri uri = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                c0982u = (C0982u) AbstractC7066b.m29093p(parcel, m29066D, C0982u.CREATOR);
            } else if (m29100w == 3) {
                uri = (Uri) AbstractC7066b.m29093p(parcel, m29066D, Uri.CREATOR);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bArr = AbstractC7066b.m29084g(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0964l(c0982u, uri, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0964l[i7];
    }
}
