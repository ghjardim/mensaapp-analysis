package p157W2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: W2.x */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2698x extends AbstractBinderC2690p implements InterfaceC2699y {
    public AbstractBinderC2698x() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // p157W2.AbstractBinderC2690p
    /* renamed from: a */
    public final boolean mo9137a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 2) {
            Bundle bundle = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
            AbstractC2691q.m9186b(parcel);
            mo9200e(bundle);
            return true;
        }
        if (i7 == 3) {
            Bundle bundle2 = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
            AbstractC2691q.m9186b(parcel);
            mo9198c(bundle2);
            return true;
        }
        if (i7 == 4) {
            Bundle bundle3 = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
            AbstractC2691q.m9186b(parcel);
            mo9199d(bundle3);
            return true;
        }
        if (i7 != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
        AbstractC2691q.m9186b(parcel);
        mo9197b(bundle4);
        return true;
    }
}
