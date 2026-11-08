package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: t3.x0 */
/* loaded from: classes.dex */
public final class C6541x0 implements Parcelable.Creator {
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
        String str8 = null;
        boolean z6 = false;
        boolean z7 = false;
        int i7 = 0;
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
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 6:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 8:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 10:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 11:
                    str8 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6502e(str, str2, str3, str4, z6, str5, z7, str6, i7, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6502e[i7];
    }
}
