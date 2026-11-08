package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p395firebaseauthapi.zzaic;
import p382y2.AbstractC7066b;

/* renamed from: t3.z0 */
/* loaded from: classes.dex */
public final class C6545z0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        zzaic zzaicVar = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
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
                    zzaicVar = (zzaic) AbstractC7066b.m29093p(parcel, m29066D, zzaic.CREATOR);
                    break;
                case 5:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str6 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6543y0(str, str2, str3, zzaicVar, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6543y0[i7];
    }
}
