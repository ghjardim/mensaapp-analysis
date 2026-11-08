package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.H */
/* loaded from: classes.dex */
public class C0922H extends AbstractC7065a {
    public static final Parcelable.Creator<C0922H> CREATOR = new C0965l0();

    /* renamed from: a */
    public final int f3194a;

    /* renamed from: b */
    public final short f3195b;

    /* renamed from: c */
    public final short f3196c;

    public C0922H(int i7, short s7, short s8) {
        this.f3194a = i7;
        this.f3195b = s7;
        this.f3196c = s8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0922H)) {
            return false;
        }
        C0922H c0922h = (C0922H) obj;
        return this.f3194a == c0922h.f3194a && this.f3195b == c0922h.f3195b && this.f3196c == c0922h.f3196c;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f3194a), Short.valueOf(this.f3195b), Short.valueOf(this.f3196c));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m3789z0());
        AbstractC7067c.m29107D(parcel, 2, m3787x0());
        AbstractC7067c.m29107D(parcel, 3, m3788y0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public short m3787x0() {
        return this.f3195b;
    }

    /* renamed from: y0 */
    public short m3788y0() {
        return this.f3196c;
    }

    /* renamed from: z0 */
    public int m3789z0() {
        return this.f3194a;
    }
}
