package p345t2;

import android.os.Parcel;
import com.google.android.gms.internal.p393authapi.zbb;

/* renamed from: t2.s */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6450s extends zbb implements InterfaceC6451t {
    public AbstractBinderC6450s() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            mo26947o();
        } else {
            if (i7 != 2) {
                return false;
            }
            mo26946h();
        }
        return true;
    }
}
