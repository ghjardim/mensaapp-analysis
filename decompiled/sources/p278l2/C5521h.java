package p278l2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: l2.h */
/* loaded from: classes.dex */
public final class C5521h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        int i7 = 0;
        int i8 = 0;
        Account account = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 1) {
                i7 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 2) {
                i8 = AbstractC7066b.m29068F(parcel, m29066D);
            } else if (m29100w == 3) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w != 4) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                account = (Account) AbstractC7066b.m29093p(parcel, m29066D, Account.CREATOR);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C5515b(i7, i8, str, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5515b[i7];
    }
}
