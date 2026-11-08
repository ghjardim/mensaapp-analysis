package p087M2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: M2.k */
/* loaded from: classes.dex */
public final class C1156k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Integer num = null;
        Double d7 = null;
        Uri uri = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        C1146a c1146a = null;
        String str = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 2:
                    num = AbstractC7066b.m29069G(parcel, m29066D);
                    break;
                case 3:
                    d7 = AbstractC7066b.m29063A(parcel, m29066D);
                    break;
                case 4:
                    uri = (Uri) AbstractC7066b.m29093p(parcel, m29066D, Uri.CREATOR);
                    break;
                case 5:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, C1149d.CREATOR);
                    break;
                case 6:
                    arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C1150e.CREATOR);
                    break;
                case 7:
                    c1146a = (C1146a) AbstractC7066b.m29093p(parcel, m29066D, C1146a.CREATOR);
                    break;
                case 8:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new RegisterRequestParams(num, d7, uri, arrayList, arrayList2, c1146a, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new RegisterRequestParams[i7];
    }
}
