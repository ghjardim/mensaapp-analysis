package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import p382y2.AbstractC7066b;

/* renamed from: o2.c */
/* loaded from: classes.dex */
public final class C5929c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        HashSet hashSet = new HashSet();
        int i7 = 0;
        ArrayList arrayList = null;
        C5931e c5931e = null;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
                hashSet.add(1);
            } else if (m29100w == 2) {
                arrayList = AbstractC7066b.m29098u(parcel, m29066D, C5933g.CREATOR);
                hashSet.add(2);
            } else if (m29100w == 3) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
                hashSet.add(3);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c5931e = (C5931e) AbstractC7066b.m29093p(parcel, m29066D, C5931e.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == m29075M) {
            return new C5928b(hashSet, i7, arrayList, i8, c5931e);
        }
        throw new AbstractC7066b.a("Overread allowed size end=" + m29075M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5928b[i7];
    }
}
