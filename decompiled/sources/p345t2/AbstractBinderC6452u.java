package p345t2;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p393authapi.zbb;
import com.google.android.gms.internal.p393authapi.zbc;

/* renamed from: t2.u */
/* loaded from: classes.dex */
public abstract class AbstractBinderC6452u extends zbb implements InterfaceC6453v {
    public AbstractBinderC6452u() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p393authapi.zbb
    public final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo26927A(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo26928F(status2);
                break;
            case 103:
                Status status3 = (Status) zbc.zba(parcel, Status.CREATOR);
                zbc.zbb(parcel);
                mo26929x(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
