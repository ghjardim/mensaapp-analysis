package p157W2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: W2.a */
/* loaded from: classes.dex */
public abstract class AbstractC2675a implements IInterface {

    /* renamed from: a */
    public final IBinder f7912a;

    /* renamed from: b */
    public final String f7913b;

    public AbstractC2675a(IBinder iBinder, String str) {
        this.f7912a = iBinder;
        this.f7913b = str;
    }

    /* renamed from: a */
    public final Parcel m9150a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f7913b);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f7912a;
    }

    /* renamed from: b */
    public final void m9151b(int i7, Parcel parcel) {
        try {
            this.f7912a.transact(i7, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
