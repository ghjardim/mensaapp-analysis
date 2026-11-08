package p313p2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p080L2.C0980t;
import p382y2.AbstractC7066b;

/* renamed from: p2.E */
/* loaded from: classes.dex */
public final class C6103E implements Parcelable.Creator {
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
        String str7 = null;
        C0980t c0980t = null;
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
                    uri = (Uri) AbstractC7066b.m29093p(parcel, m29066D, Uri.CREATOR);
                    break;
                case 6:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    str7 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    c0980t = (C0980t) AbstractC7066b.m29093p(parcel, m29066D, C0980t.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6117l(str, str2, str3, str4, uri, str5, str6, str7, c0980t);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6117l[i7];
    }
}
