package p143U2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: U2.i */
/* loaded from: classes.dex */
public final class C2523i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        String str = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                arrayList = AbstractC7066b.m29096s(parcel, m29066D);
            } else if (m29100w != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2522h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2522h[i7];
    }
}
