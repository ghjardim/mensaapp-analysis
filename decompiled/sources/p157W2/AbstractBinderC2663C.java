package p157W2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: W2.C */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2663C extends AbstractBinderC2690p implements InterfaceC2664D {
    public AbstractBinderC2663C() {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
    }

    @Override // p157W2.AbstractBinderC2690p
    /* renamed from: a */
    public final boolean mo9137a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
        AbstractC2691q.m9186b(parcel);
        mo9138b(bundle);
        return true;
    }
}
