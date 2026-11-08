package p368w2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: w2.M */
/* loaded from: classes.dex */
public final class C6855M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        String str = null;
        IBinder iBinder = null;
        boolean z7 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 2) {
                iBinder = AbstractC7066b.m29067E(parcel, m29066D);
            } else if (m29100w == 3) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                z7 = AbstractC7066b.m29101x(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6854L(str, iBinder, z6, z7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6854L[i7];
    }
}
