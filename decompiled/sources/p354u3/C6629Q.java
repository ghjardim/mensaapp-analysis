package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p346t3.C6486S;
import p346t3.C6492Y;
import p382y2.AbstractC7066b;

/* renamed from: u3.Q */
/* loaded from: classes.dex */
public final class C6629Q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                arrayList = AbstractC7066b.m29098u(parcel, m29066D, C6486S.CREATOR);
            } else if (m29100w != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C6492Y.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6626N(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6626N[i7];
    }
}
