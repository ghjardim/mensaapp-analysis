package p329r2;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: r2.d */
/* loaded from: classes.dex */
public final class C6291d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        byte[] bArr = null;
        Bundle bundle = null;
        long j7 = 0;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 3) {
                j7 = AbstractC7066b.m29070H(parcel, m29066D);
            } else if (m29100w == 4) {
                bArr = AbstractC7066b.m29084g(parcel, m29066D);
            } else if (m29100w == 5) {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            } else if (m29100w != 1000) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6289b(i7, str, i8, j7, bArr, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6289b[i7];
    }
}
