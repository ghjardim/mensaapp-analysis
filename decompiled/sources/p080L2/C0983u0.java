package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: L2.u0 */
/* loaded from: classes.dex */
public final class C0983u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        byte[] bArr = null;
        byte[] bArr2 = null;
        byte[] bArr3 = null;
        String[] strArr = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                bArr = AbstractC7066b.m29084g(parcel, m29066D);
            } else if (m29100w == 3) {
                bArr2 = AbstractC7066b.m29084g(parcel, m29066D);
            } else if (m29100w == 4) {
                bArr3 = AbstractC7066b.m29084g(parcel, m29066D);
            } else if (m29100w != 5) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                strArr = AbstractC7066b.m29095r(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C0956h(bArr, bArr2, bArr3, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C0956h[i7];
    }
}
