package p115Q2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.D0 */
/* loaded from: classes.dex */
public final class C2018D0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C2071d c2071d = null;
        String str = null;
        String str2 = null;
        C2071d c2071d2 = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                c2071d = (C2071d) AbstractC7066b.m29093p(parcel, m29066D, C2071d.CREATOR);
            } else if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 4) {
                c2071d2 = (C2071d) AbstractC7066b.m29093p(parcel, m29066D, C2071d.CREATOR);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2016C0(c2071d, str, str2, c2071d2, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2016C0[i7];
    }
}
