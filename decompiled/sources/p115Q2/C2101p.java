package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.p */
/* loaded from: classes.dex */
public final class C2101p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2116w0 c2116w0 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 1) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2116w0 = (C2116w0) AbstractC7066b.m29093p(parcel, m29066D, C2116w0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2099o(c2116w0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2099o[i7];
    }
}
