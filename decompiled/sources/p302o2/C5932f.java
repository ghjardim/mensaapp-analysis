package p302o2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: o2.f */
/* loaded from: classes.dex */
public final class C5932f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 3:
                    arrayList2 = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 4:
                    arrayList3 = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 5:
                    arrayList4 = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 6:
                    arrayList5 = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C5931e(i7, arrayList, arrayList2, arrayList3, arrayList4, arrayList5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5931e[i7];
    }
}
