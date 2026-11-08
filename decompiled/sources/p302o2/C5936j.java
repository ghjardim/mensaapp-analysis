package p302o2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import p382y2.AbstractC7066b;

/* renamed from: o2.j */
/* loaded from: classes.dex */
public final class C5936j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        HashSet hashSet = new HashSet();
        int i7 = 0;
        String str = null;
        byte[] bArr = null;
        PendingIntent pendingIntent = null;
        C5927a c5927a = null;
        int i8 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    hashSet.add(1);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    hashSet.add(2);
                    break;
                case 3:
                    i8 = AbstractC7066b.m29068F(parcel, m29066D);
                    hashSet.add(3);
                    break;
                case 4:
                    bArr = AbstractC7066b.m29084g(parcel, m29066D);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) AbstractC7066b.m29093p(parcel, m29066D, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    c5927a = (C5927a) AbstractC7066b.m29093p(parcel, m29066D, C5927a.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        if (parcel.dataPosition() == m29075M) {
            return new C5935i(hashSet, i7, str, i8, bArr, pendingIntent, c5927a);
        }
        throw new AbstractC7066b.a("Overread allowed size end=" + m29075M, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C5935i[i7];
    }
}
