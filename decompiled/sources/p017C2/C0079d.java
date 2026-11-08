package p017C2;

import android.os.Parcel;
import android.os.Parcelable;
import p010B2.C0037b;
import p017C2.AbstractC0076a;
import p382y2.AbstractC7066b;

/* renamed from: C2.d */
/* loaded from: classes.dex */
public final class C0079d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        C0037b c0037b = null;
        int i7 = 0;
        int i8 = 0;
        boolean z6 = false;
        int i9 = 0;
        boolean z7 = false;
        int i10 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    i8 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 3:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 4:
                    i9 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 5:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 6:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    i10 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 8:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    c0037b = (C0037b) AbstractC7066b.m29093p(parcel, m29066D, C0037b.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new AbstractC0076a.a(i7, i8, z6, i9, z7, str, i10, str2, c0037b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AbstractC0076a.a[i7];
    }
}
