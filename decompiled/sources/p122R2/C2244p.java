package p122R2;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import p382y2.AbstractC7066b;
import p382y2.AbstractC7067c;

/* renamed from: R2.p */
/* loaded from: classes.dex */
public final class C2244p implements Parcelable.Creator {
    /* renamed from: a */
    public static void m7661a(C2230b c2230b, Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, c2230b.m7651A0(), false);
        AbstractC7067c.m29106C(parcel, 3, c2230b.m7655z0(), i7, false);
        AbstractC7067c.m29106C(parcel, 4, c2230b.m7653x0(), i7, false);
        AbstractC7067c.m29140x(parcel, 5, c2230b.m7654y0());
        AbstractC7067c.m29127k(parcel, 6, c2230b.m7652B0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int m29075M = AbstractC7066b.m29075M(parcel);
        String str = null;
        DataHolder dataHolder = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        byte[] bArr = null;
        long j7 = 0;
        while (parcel.dataPosition() < m29075M) {
            int m29066D = AbstractC7066b.m29066D(parcel);
            int m29100w = AbstractC7066b.m29100w(m29066D);
            if (m29100w == 2) {
                str = AbstractC7066b.m29094q(parcel, m29066D);
            } else if (m29100w == 3) {
                dataHolder = (DataHolder) AbstractC7066b.m29093p(parcel, m29066D, DataHolder.CREATOR);
            } else if (m29100w == 4) {
                parcelFileDescriptor = (ParcelFileDescriptor) AbstractC7066b.m29093p(parcel, m29066D, ParcelFileDescriptor.CREATOR);
            } else if (m29100w == 5) {
                j7 = AbstractC7066b.m29070H(parcel, m29066D);
            } else if (m29100w != 6) {
                AbstractC7066b.m29074L(parcel, m29066D);
            } else {
                bArr = AbstractC7066b.m29084g(parcel, m29066D);
            }
        }
        AbstractC7066b.m29099v(parcel, m29075M);
        return new C2230b(str, dataHolder, parcelFileDescriptor, j7, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i7) {
        return new C2230b[i7];
    }
}
