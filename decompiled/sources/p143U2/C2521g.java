package p143U2;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

/* renamed from: U2.g */
/* loaded from: classes.dex */
public final class C2521g extends zaa implements IInterface {
    public C2521g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* renamed from: a */
    public final void m8472a(C2524j c2524j, InterfaceC2520f interfaceC2520f) {
        Parcel zaa = zaa();
        zac.zac(zaa, c2524j);
        zac.zad(zaa, interfaceC2520f);
        zac(12, zaa);
    }
}
