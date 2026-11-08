package p157W2;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: W2.p */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2690p extends Binder implements IInterface {
    public AbstractBinderC2690p(String str) {
        attachInterface(this, str);
    }

    /* renamed from: a */
    public abstract boolean mo9137a(int i7, Parcel parcel, Parcel parcel2, int i8);

    @Override // android.os.Binder
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i7, parcel, parcel2, i8)) {
            return true;
        }
        return mo9137a(i7, parcel, parcel2, i8);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
