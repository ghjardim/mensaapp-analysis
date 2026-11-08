package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.f */
/* loaded from: classes.dex */
public final class C2077f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2052V[] c2052vArr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2052vArr = (C2052V[]) AbstractC7066b.m29097t(parcel, m29066D, C2052V.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2074e(c2052vArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2074e[i7];
    }
}
