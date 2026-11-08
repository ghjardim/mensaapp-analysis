package p368w2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: w2.K */
/* loaded from: classes.dex */
public final class C6853K implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        int i7 = 0;
        String str = null;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6852J(z6, str, i8, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6852J[i7];
    }
}
