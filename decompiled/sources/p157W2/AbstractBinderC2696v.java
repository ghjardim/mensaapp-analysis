package p157W2;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: W2.v */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2696v extends AbstractBinderC2690p implements InterfaceC2697w {
    /* renamed from: b */
    public static InterfaceC2697w m9196b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof InterfaceC2697w ? (InterfaceC2697w) queryLocalInterface : new C2695u(iBinder);
    }
}
