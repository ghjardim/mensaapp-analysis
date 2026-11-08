package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p346t3.C6486S;
import p346t3.C6492Y;
import p346t3.C6543y0;
import p382y2.AbstractC7066b;

/* renamed from: u3.q */
/* loaded from: classes.dex */
public final class C6670q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        C6668p c6668p = null;
        String str = null;
        C6543y0 c6543y0 = null;
        C6654i c6654i = null;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, C6486S.CREATOR);
                    break;
                case 2:
                    c6668p = (C6668p) AbstractC7066b.m29093p(parcel, m29066D, C6668p.CREATOR);
                    break;
                case 3:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    c6543y0 = (C6543y0) AbstractC7066b.m29093p(parcel, m29066D, C6543y0.CREATOR);
                    break;
                case 5:
                    c6654i = (C6654i) AbstractC7066b.m29093p(parcel, m29066D, C6654i.CREATOR);
                    break;
                case 6:
                    arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C6492Y.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6666o(arrayList, c6668p, str, c6543y0, c6654i, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6666o[i7];
    }
}
