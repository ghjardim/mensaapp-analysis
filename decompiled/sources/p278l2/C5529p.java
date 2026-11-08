package p278l2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.TokenData;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: l2.p */
/* loaded from: classes.dex */
public final class C5529p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        Long l7 = null;
        ArrayList arrayList = null;
        String str2 = null;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
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
                    l7 = AbstractC7066b.m29071I(parcel, m29066D);
                    break;
                case 4:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 5:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 6:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 7:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new TokenData(i7, str, l7, z6, z7, arrayList, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new TokenData[i7];
    }
}
