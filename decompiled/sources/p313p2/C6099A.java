package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;
import p382y2.AbstractC7066b;

/* renamed from: p2.A */
/* loaded from: classes.dex */
public final class C6099A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        int i7 = 0;
        PendingIntent pendingIntent = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        String str3 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 5:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new SaveAccountLinkingTokenRequest(pendingIntent, str, str2, arrayList, str3, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new SaveAccountLinkingTokenRequest[i7];
    }
}
