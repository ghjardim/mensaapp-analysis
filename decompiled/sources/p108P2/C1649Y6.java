package p108P2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: P2.Y6 */
/* loaded from: classes.dex */
public final class C1649Y6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        byte[] bArr = null;
        String str = null;
        Bundle bundle = null;
        String str2 = null;
        long j7 = 0;
        long j8 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 2:
                    bArr = AbstractC7066b.m29084g(parcel, m29066D);
                    break;
                case 3:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    bundle = AbstractC7066b.m29083f(parcel, m29066D);
                    break;
                case 5:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 6:
                    j8 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 7:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1641X6(j7, bArr, str, bundle, i7, j8, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1641X6[i7];
    }
}
