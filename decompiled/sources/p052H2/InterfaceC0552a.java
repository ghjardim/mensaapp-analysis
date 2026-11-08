package p052H2;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: H2.a */
/* loaded from: classes.dex */
public interface InterfaceC0552a extends IInterface {

    /* renamed from: H2.a$a */
    public static abstract class a extends zzb implements InterfaceC0552a {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        /* renamed from: a */
        public static InterfaceC0552a m2136a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof InterfaceC0552a ? (InterfaceC0552a) queryLocalInterface : new C0554c(iBinder);
        }
    }
}
