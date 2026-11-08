package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p346t3.C6486S;
import p346t3.C6492Y;
import p382y2.AbstractC7066b;

/* renamed from: u3.s */
/* loaded from: classes.dex */
public final class C6674s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C6654i c6654i = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                arrayList = AbstractC7066b.m29098u(parcel, m29066D, C6486S.CREATOR);
            } else if (m29100w == 4) {
                arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C6492Y.CREATOR);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c6654i = (C6654i) AbstractC7066b.m29093p(parcel, m29066D, C6654i.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6668p(str, str2, arrayList, arrayList2, c6654i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6668p[i7];
    }
}
