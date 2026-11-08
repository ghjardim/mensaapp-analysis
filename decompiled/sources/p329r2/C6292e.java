package p329r2;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: r2.e */
/* loaded from: classes.dex */
public final class C6292e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        PendingIntent pendingIntent = null;
        Bundle bundle = null;
        byte[] bArr = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
            } else if (m29100w == 3) {
                i9 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 4) {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            } else if (m29100w == 5) {
                bArr = AbstractC7066b.m29084g(parcel, m29066D);
            } else if (m29100w != 1000) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6290c(i7, i8, pendingIntent, i9, bundle, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6290c[i7];
    }
}
