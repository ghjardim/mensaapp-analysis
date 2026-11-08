package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: C2.i */
/* loaded from: classes.dex */
public final class C0084i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        int i7 = 0;
        String str = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                arrayList = AbstractC7066b.m29098u(parcel, m29066D, C0081f.CREATOR);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0083h(i7, arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0083h[i7];
    }
}
