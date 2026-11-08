package p313p2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: p2.p */
/* loaded from: classes.dex */
public final class C6121p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        ArrayList arrayList = null;
        String str = null;
        Account account = null;
        String str2 = null;
        String str3 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, Scope.CREATOR);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 4:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 5:
                    account = (Account) AbstractC7066b.m29093p(parcel, m29066D, Account.CREATOR);
                    break;
                case 6:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new AuthorizationRequest(arrayList, str, z6, z7, account, str2, str3, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new AuthorizationRequest[i7];
    }
}
