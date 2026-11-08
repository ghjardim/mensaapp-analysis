package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: p2.q */
/* loaded from: classes.dex */
public final class C6122q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 2:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) AbstractC7066b.m29093p(parcel, m29066D, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6106a(str, str2, str3, arrayList, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6106a[i7];
    }
}
