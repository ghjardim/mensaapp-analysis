package p286m2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

/* renamed from: m2.f */
/* loaded from: classes.dex */
public abstract class AbstractBinderC5572f extends zzb implements InterfaceC5573g {
    /* renamed from: a */
    public static InterfaceC5573g m23339a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof InterfaceC5573g ? (InterfaceC5573g) queryLocalInterface : new C5571e(iBinder);
    }
}
