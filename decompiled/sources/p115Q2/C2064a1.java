package p115Q2;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.a1 */
/* loaded from: classes.dex */
public final class C2064a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Bitmap[] bitmapArr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bitmapArr = (Bitmap[]) AbstractC7066b.m29097t(parcel, m29066D, Bitmap.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2061Z0(bitmapArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2061Z0[i7];
    }
}
