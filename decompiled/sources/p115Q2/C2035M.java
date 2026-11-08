package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.M */
/* loaded from: classes.dex */
public final class C2035M implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        int i7 = 14343392;
        C2037N c2037n = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        String str4 = null;
        PendingIntent pendingIntent = null;
        String str5 = null;
        Bitmap bitmap2 = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    c2037n = (C2037N) AbstractC7066b.m29093p(parcel, m29066D, C2037N.CREATOR);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 5:
                    bitmap = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 6:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                case 8:
                    str5 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 9:
                    bitmap2 = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 10:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2033L(c2037n, str, str2, str3, bitmap, str4, pendingIntent, str5, bitmap2, i7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2033L[i7];
    }
}
