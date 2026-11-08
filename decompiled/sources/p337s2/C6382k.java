package p337s2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import org.apache.tika.utils.StringUtils;
import p382y2.AbstractC7066b;

/* renamed from: s2.k */
/* loaded from: classes.dex */
public final class C6382k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = StringUtils.EMPTY;
        GoogleSignInAccount googleSignInAccount = null;
        String str2 = StringUtils.EMPTY;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 4) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 7) {
                googleSignInAccount = (GoogleSignInAccount) AbstractC7066b.m29093p(parcel, m29066D, GoogleSignInAccount.CREATOR);
            } else if (m29100w != 8) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                str2 = AbstractC7066b.m29094q(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new SignInAccount(str, googleSignInAccount, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SignInAccount[i7];
    }
}
