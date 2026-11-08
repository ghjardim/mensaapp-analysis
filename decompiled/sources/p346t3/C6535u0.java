package p346t3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p395firebaseauthapi.zzaia;
import p382y2.AbstractC7066b;

/* renamed from: t3.u0 */
/* loaded from: classes.dex */
public final class C6535u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        zzaia zzaiaVar = null;
        long j7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                j7 = AbstractC7066b.m29070H(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                zzaiaVar = (zzaia) AbstractC7066b.m29093p(parcel, m29066D, zzaia.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6492Y(str, str2, j7, zzaiaVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6492Y[i7];
    }
}
