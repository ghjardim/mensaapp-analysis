package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.t */
/* loaded from: classes.dex */
public final class C2109t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2024G0[] c2024g0Arr = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        C2034L0[] c2034l0Arr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c2024g0Arr = (C2024G0[]) AbstractC7066b.m29097t(parcel, m29066D, C2024G0.CREATOR);
            } else if (m29100w == 2) {
                bitmap = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
            } else if (m29100w == 3) {
                bitmap2 = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                c2034l0Arr = (C2034L0[]) AbstractC7066b.m29097t(parcel, m29066D, C2034L0.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2107s(c2024g0Arr, bitmap, bitmap2, c2034l0Arr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2107s[i7];
    }
}
