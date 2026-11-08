package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.W */
/* loaded from: classes.dex */
public final class C2054W implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2056X c2056x = null;
        Bitmap bitmap = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c2056x = (C2056X) AbstractC7066b.m29093p(parcel, m29066D, C2056X.CREATOR);
            } else if (m29100w != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bitmap = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2052V(c2056x, bitmap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2052V[i7];
    }
}
