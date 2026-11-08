package p108P2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3772c;
import p368w2.AbstractC6874o;

/* renamed from: P2.G2 */
/* loaded from: classes.dex */
public final class C1495G2 extends AbstractC3772c {
    public C1495G2(Context context, Looper looper, AbstractC3772c.a aVar, AbstractC3772c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC1832t2 ? (InterfaceC1832t2) queryLocalInterface : new C1814r2(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final int getMinApkVersion() {
        return AbstractC6874o.f24694a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3772c
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
