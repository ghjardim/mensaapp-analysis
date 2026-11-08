package p337s2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p345t2.C6432a;
import p382y2.AbstractC7066b;

/* renamed from: s2.h */
/* loaded from: classes.dex */
public final class C6379h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i7 = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    arrayList = AbstractC7066b.m29098u(parcel, m29066D, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) AbstractC7066b.m29093p(parcel, m29066D, Account.CREATOR);
                    break;
                case 4:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 5:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 6:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 7:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 8:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    arrayList2 = AbstractC7066b.m29098u(parcel, m29066D, C6432a.CREATOR);
                    break;
                case 10:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new GoogleSignInOptions(i7, arrayList, account, z6, z7, z8, str, str2, arrayList2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new GoogleSignInOptions[i7];
    }
}
