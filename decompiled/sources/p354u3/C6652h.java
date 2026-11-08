package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p395firebaseauthapi.zzagw;
import java.util.ArrayList;
import p272k4.C5410A;
import p346t3.C6521n0;
import p346t3.C6543y0;
import p382y2.AbstractC7066b;

/* renamed from: u3.h */
/* loaded from: classes.dex */
public final class C6652h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        zzagw zzagwVar = null;
        C6646e c6646e = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        Boolean bool = null;
        C6658k c6658k = null;
        C6543y0 c6543y0 = null;
        C6626N c6626n = null;
        ArrayList arrayList3 = null;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    zzagwVar = (zzagw) AbstractC7066b.m29093p(parcel, m29066D, zzagw.CREATOR);
                    break;
                case 2:
                    c6646e = (C6646e) AbstractC7066b.m29093p(parcel, m29066D, C6646e.CREATOR);
                    break;
                case 3:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, C6646e.CREATOR);
                    break;
                case 6:
                    arrayList2 = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 7:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    bool = AbstractC7066b.m29102y(parcel, m29066D);
                    break;
                case 9:
                    c6658k = (C6658k) AbstractC7066b.m29093p(parcel, m29066D, C6658k.CREATOR);
                    break;
                case 10:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 11:
                    c6543y0 = (C6543y0) AbstractC7066b.m29093p(parcel, m29066D, C6543y0.CREATOR);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    c6626n = (C6626N) AbstractC7066b.m29093p(parcel, m29066D, C6626N.CREATOR);
                    break;
                case 13:
                    arrayList3 = AbstractC7066b.m29098u(parcel, m29066D, C6521n0.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6654i(zzagwVar, c6646e, str, str2, arrayList, arrayList2, str3, bool, c6658k, z6, c6543y0, c6626n, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6654i[i7];
    }
}
