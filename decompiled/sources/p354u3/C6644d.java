package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: u3.d */
/* loaded from: classes.dex */
public final class C6644d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 2:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 8:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6646e(str, str2, str3, str4, str5, str6, z6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6646e[i7];
    }
}
