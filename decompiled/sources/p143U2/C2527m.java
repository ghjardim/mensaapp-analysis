package p143U2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3760S;
import p368w2.C6861b;
import p382y2.AbstractC7066b;

/* renamed from: U2.m */
/* loaded from: classes.dex */
public final class C2527m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C6861b c6861b = null;
        int i7 = 0;
        C3760S c3760s = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                c6861b = (C6861b) AbstractC7066b.m29093p(parcel, m29066D, C6861b.CREATOR);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c3760s = (C3760S) AbstractC7066b.m29093p(parcel, m29066D, C3760S.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2526l(i7, c6861b, c3760s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2526l[i7];
    }
}
