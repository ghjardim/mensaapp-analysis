package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import org.apache.tika.utils.StringUtils;
import org.apache.tika.utils.XMLReaderUtils;
import p272k4.C5410A;
import p272k4.C5413D;
import p382y2.AbstractC7066b;

/* renamed from: P2.F7 */
/* loaded from: classes.dex */
public final class C1491F7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = false;
        int i8 = 0;
        int i9 = 0;
        long j7 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        String str = StringUtils.EMPTY;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        Boolean bool = null;
        ArrayList arrayList = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        int i10 = 100;
        boolean z9 = true;
        boolean z10 = true;
        long j14 = -2147483648L;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    str8 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 7:
                    j8 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 8:
                    str9 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    z9 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 10:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 11:
                    j14 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    str10 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 13:
                case 17:
                case XMLReaderUtils.DEFAULT_MAX_ENTITY_EXPANSIONS /* 20 */:
                case 33:
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
                case 14:
                    j9 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 15:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 16:
                    z10 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case C5413D.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 19:
                    str11 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 21:
                    bool = AbstractC7066b.m29102y(parcel, m29066D);
                    break;
                case 22:
                    j10 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 23:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 24:
                    str12 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 25:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 26:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 27:
                    str13 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 28:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 29:
                    j11 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 30:
                    i10 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 31:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 32:
                    i8 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 34:
                    j12 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 35:
                    str14 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 36:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 37:
                    j13 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 38:
                    i9 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1482E7(str5, str6, str7, str8, j7, j8, str9, z9, z6, j14, str10, j9, i7, z10, z7, str11, bool, j10, arrayList, str12, str, str2, str13, z8, j11, i10, str3, i8, j12, str14, str4, j13, i9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1482E7[i7];
    }
}
