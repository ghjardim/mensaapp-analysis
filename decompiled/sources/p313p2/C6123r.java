package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import p313p2.C6107b;
import p382y2.AbstractC7066b;

/* renamed from: p2.r */
/* loaded from: classes.dex */
public final class C6123r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        C6107b.e eVar = null;
        C6107b.b bVar = null;
        String str = null;
        C6107b.d dVar = null;
        C6107b.c cVar = null;
        boolean z6 = false;
        int i7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            switch (AbstractC7066b.m29100w(m29066D)) {
                case 1:
                    eVar = (C6107b.e) AbstractC7066b.m29093p(parcel, m29066D, C6107b.e.CREATOR);
                    break;
                case 2:
                    bVar = (C6107b.b) AbstractC7066b.m29093p(parcel, m29066D, C6107b.b.CREATOR);
                    break;
                case 3:
                    str = AbstractC7066b.m29094q(parcel, m29066D);
                    break;
                case 4:
                    z6 = AbstractC7066b.m29101x(parcel, m29066D);
                    break;
                case 5:
                    i7 = AbstractC7066b.m29068F(parcel, m29066D);
                    break;
                case 6:
                    dVar = (C6107b.d) AbstractC7066b.m29093p(parcel, m29066D, C6107b.d.CREATOR);
                    break;
                case 7:
                    cVar = (C6107b.c) AbstractC7066b.m29093p(parcel, m29066D, C6107b.c.CREATOR);
                    break;
                default:
                    AbstractC7066b.m29074L(parcel, m29066D);
                    break;
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C6107b(eVar, bVar, str, z6, i7, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i7) {
        return new C6107b[i7];
    }
}
