package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: P2.A7 */
/* loaded from: classes.dex */
public final class C1446A7 implements Parcelable.Creator {
    /* renamed from: a */
    public static void m5577a(C1891z7 c1891z7, Parcel parcel, int i7) {
        int i8 = c1891z7.f5638a;
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, i8);
        AbstractC7067c.m29108E(parcel, 2, c1891z7.f5639b, false);
        AbstractC7067c.m29140x(parcel, 3, c1891z7.f5640c);
        AbstractC7067c.m29142z(parcel, 4, c1891z7.f5641d, false);
        AbstractC7067c.m29134r(parcel, 5, null, false);
        AbstractC7067c.m29108E(parcel, 6, c1891z7.f5642e, false);
        AbstractC7067c.m29108E(parcel, 7, c1891z7.f5643f, false);
        AbstractC7067c.m29131o(parcel, 8, c1891z7.f5644n, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        Long l7 = null;
        Float f7 = null;
        String str2 = null;
        String str3 = null;
        Double d7 = null;
        long j7 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 4:
                    l7 = AbstractC7066b.m29071I(parcel, m29066D);
                    break;
                case 5:
                    f7 = AbstractC7066b.m29065C(parcel, m29066D);
                    break;
                case 6:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    d7 = AbstractC7066b.m29063A(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1891z7(i7, str, j7, l7, f7, str2, str3, d7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1891z7[i7];
    }
}
