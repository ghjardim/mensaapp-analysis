package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p313p2.C6107b;
import p382y2.AbstractC7066b;

/* renamed from: p2.w */
/* loaded from: classes.dex */
public final class C6128w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 2:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 3:
                    str2 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    z7 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 5:
                    str3 = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 6:
                    arrayList = AbstractC7066b.m29096s(parcel, m29066D);
                    break;
                case 7:
                    z8 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6107b.b(z6, str, str2, z7, str3, arrayList, z8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6107b.b[i7];
    }
}
