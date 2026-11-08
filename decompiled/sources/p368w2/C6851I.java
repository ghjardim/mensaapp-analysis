package p368w2;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: w2.I */
/* loaded from: classes.dex */
public final class C6851I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        String str = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 2:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 3:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 4:
                    iBinder = AbstractC7066b.m29067E(parcel, m29066D);
                    break;
                case 5:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 6:
                    z9 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6850H(str, z6, z7, iBinder, z8, z9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6850H[i7];
    }
}
