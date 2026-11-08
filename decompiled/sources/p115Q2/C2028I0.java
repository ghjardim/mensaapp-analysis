package p115Q2;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import p382y2.AbstractC7066b;

/* renamed from: Q2.I0 */
/* loaded from: classes.dex */
public final class C2028I0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        Bitmap bitmap = null;
        Bitmap bitmap2 = null;
        String str2 = null;
        String str3 = null;
        PendingIntent pendingIntent = null;
        C2030J0 c2030j0 = null;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    bitmap = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 4:
                    bitmap2 = (Bitmap) AbstractC7066b.m29093p(parcel, m29066D, Bitmap.CREATOR);
                    break;
                case 5:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 7:
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    break;
                case 8:
                    c2030j0 = (C2030J0) AbstractC7066b.m29093p(parcel, m29066D, C2030J0.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2024G0(i7, str, bitmap, bitmap2, str2, str3, pendingIntent, c2030j0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C2024G0[i7];
    }
}
