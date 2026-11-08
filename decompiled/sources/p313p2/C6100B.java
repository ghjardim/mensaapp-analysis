package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: p2.B */
/* loaded from: classes.dex */
public final class C6100B implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 1) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6113h(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6113h[i7];
    }
}
