package p375x2;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import p382y2.AbstractC7066b;

/* renamed from: x2.b */
/* loaded from: classes.dex */
public final class C6945b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String[] strArr = null;
        CursorWindow[] cursorWindowArr = null;
        Bundle bundle = null;
        int i7 = 0;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                strArr = AbstractC7066b.m29095r(parcel, m29066D);
            } else if (m29100w == 2) {
                cursorWindowArr = (CursorWindow[]) AbstractC7066b.m29097t(parcel, m29066D, CursorWindow.CREATOR);
            } else if (m29100w == 3) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 4) {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            } else if (m29100w != 1000) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        DataHolder dataHolder = new DataHolder(i7, strArr, cursorWindowArr, i8, bundle);
        dataHolder.m15014A0();
        return dataHolder;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new DataHolder[i7];
    }
}
