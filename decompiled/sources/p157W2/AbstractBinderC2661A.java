package p157W2;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: W2.A */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2661A extends AbstractBinderC2690p implements InterfaceC2662B {
    /* renamed from: b */
    public static InterfaceC2662B m9134b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof InterfaceC2662B ? (InterfaceC2662B) queryLocalInterface : new C2700z(iBinder);
    }
}
