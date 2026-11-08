package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import p313p2.C6107b;
import p382y2.AbstractC7066b;

/* renamed from: p2.x */
/* loaded from: classes.dex */
public final class C6129x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        boolean z6 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                z6 = AbstractC7066b.m29101x(parcel, m29066D);
            } else if (m29100w != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6107b.c(z6, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6107b.c[i7];
    }
}
