package p187a4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.messaging.C3968d;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: a4.S */
/* loaded from: classes.dex */
public class C3125S implements Parcelable.Creator {
    /* renamed from: c */
    public static void m11402c(C3968d c3968d, Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29126j(parcel, 2, c3968d.f13005a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3968d createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            if (AbstractC7066b.m29100w(m29066D) != 2) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bundle = AbstractC7066b.m29083f(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C3968d(bundle);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C3968d[] newArray(int i7) {
        return new C3968d[i7];
    }
}
