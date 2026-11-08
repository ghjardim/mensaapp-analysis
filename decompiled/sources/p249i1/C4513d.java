package p249i1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p171Y2.InterfaceC2924g;
import p248i0.C4503a;
import p259j0.AbstractC5333b;

/* renamed from: i1.d */
/* loaded from: classes.dex */
public final class C4513d {
    /* renamed from: a */
    public byte[] m19217a(List list, long j7) {
        ArrayList<? extends Parcelable> m21807b = AbstractC5333b.m21807b(list, new InterfaceC2924g() { // from class: i1.c
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                return ((C4503a) obj).m19186d();
            }
        });
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", m21807b);
        bundle.putLong("d", j7);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
