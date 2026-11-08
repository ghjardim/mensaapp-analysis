package p345t2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: t2.d */
/* loaded from: classes.dex */
public final class C6435d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Bundle bundle = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6432a(i7, i8, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6432a[i7];
    }
}
