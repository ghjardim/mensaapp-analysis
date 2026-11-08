package p361v2;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: v2.d */
/* loaded from: classes.dex */
public final class C6723d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 1) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                intent = (Intent) AbstractC7066b.m29093p(parcel, m29066D, Intent.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6720a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6720a[i7];
    }
}
