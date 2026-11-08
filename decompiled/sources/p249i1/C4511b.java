package p249i1;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import p171Y2.InterfaceC2924g;
import p248i0.C4503a;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5333b;

/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C4511b {
    /* renamed from: a */
    public C4514e m19216a(long j7, byte[] bArr, int i7, int i8) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, i7, i8);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return new C4514e(AbstractC5333b.m21806a(new InterfaceC2924g() { // from class: i1.a
            @Override // p171Y2.InterfaceC2924g
            public final Object apply(Object obj) {
                return C4503a.m19183b((Bundle) obj);
            }
        }, (ArrayList) AbstractC5332a.m21800e(readBundle.getParcelableArrayList("c"))), j7, readBundle.getLong("d"));
    }
}
