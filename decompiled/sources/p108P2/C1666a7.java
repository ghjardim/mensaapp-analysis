package p108P2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: P2.a7 */
/* loaded from: classes.dex */
public final class C1666a7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 1) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                arrayList = AbstractC7066b.m29089l(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C1657Z6(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C1657Z6[i7];
    }
}
