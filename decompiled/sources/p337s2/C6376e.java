package p337s2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p272k4.C5410A;
import p382y2.AbstractC7066b;

/* renamed from: s2.e */
/* loaded from: classes.dex */
public final class C6376e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
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
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    uri = (Uri) AbstractC7066b.m29093p(parcel, m29066D, Uri.CREATOR);
                    break;
                case 7:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    j7 = AbstractC7066b.m29070H(parcel, m29066D);
                    break;
                case 9:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 10:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, Scope.CREATOR);
                    break;
                case 11:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case C5410A.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    str8 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j7, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
