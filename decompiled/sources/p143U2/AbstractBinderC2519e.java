package p143U2;

import android.os.Parcel;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

/* renamed from: U2.e */
/* loaded from: classes.dex */
public abstract class AbstractBinderC2519e extends zab implements InterfaceC2520f {
    public AbstractBinderC2519e() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 3:
                zac.zab(parcel);
                break;
            case 4:
                zac.zab(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                zac.zab(parcel);
                break;
            case 7:
                zac.zab(parcel);
                break;
            case 8:
                C2526l c2526l = (C2526l) zac.zaa(parcel, C2526l.CREATOR);
                zac.zab(parcel);
                mo8471H(c2526l);
                break;
            case 9:
                zac.zab(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
