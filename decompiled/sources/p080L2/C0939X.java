package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.X */
/* loaded from: classes.dex */
public final class C0939X implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        Integer num = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 3) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                num = AbstractC7066b.m29069G(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0986w(str, num.intValue());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0986w[i7];
    }
}
