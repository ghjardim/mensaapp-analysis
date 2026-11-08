package p157W2;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: W2.E */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2665E extends AbstractBinderC2690p implements InterfaceC2666F {
    public AbstractBinderC2665E() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // p157W2.AbstractBinderC2690p
    /* renamed from: a */
    public final boolean mo9137a(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 2) {
            return false;
        }
        Bundle bundle = (Bundle) AbstractC2691q.m9185a(parcel, Bundle.CREATOR);
        AbstractC2691q.m9186b(parcel);
        mo9139b(bundle);
        return true;
    }
}
