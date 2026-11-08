package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.K0 */
/* loaded from: classes.dex */
public final class C2032K0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        PendingIntent pendingIntent = null;
        String str4 = null;
        PendingIntent pendingIntent2 = null;
        Bitmap bitmap = null;
        Bitmap[] bitmapArr = null;
        C2081g0 c2081g0 = null;
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
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                case 5:
                    str4 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    pendingIntent2 = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                case 7:
                    bitmap = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 8:
                    bitmapArr = (Bitmap[]) AbstractC7066b.m29097t(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 9:
                    c2081g0 = (C2081g0) AbstractC7066b.m29093p(parcel, m29066D, C2081g0.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2030J0(str, str2, str3, pendingIntent, str4, pendingIntent2, bitmap, bitmapArr, c2081g0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2030J0[i7];
    }
}
