package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.R0 */
/* loaded from: classes.dex */
public final class C2045R0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2045R0> CREATOR = new C2047S0();

    /* renamed from: a */
    public C2049T0 f6273a;

    /* renamed from: b */
    public C2108s0 f6274b;

    /* renamed from: c */
    public C2096m0 f6275c;

    public C2045R0(C2049T0 c2049t0, C2108s0 c2108s0, C2096m0 c2096m0) {
        this.f6273a = c2049t0;
        this.f6274b = c2108s0;
        this.f6275c = c2096m0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2045R0) {
            C2045R0 c2045r0 = (C2045R0) obj;
            if (AbstractC3798p.m15099b(this.f6273a, c2045r0.f6273a) && AbstractC3798p.m15099b(this.f6274b, c2045r0.f6274b) && AbstractC3798p.m15099b(this.f6275c, c2045r0.f6275c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6273a, this.f6274b, this.f6275c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6273a, i7, false);
        AbstractC7067c.m29106C(parcel, 2, this.f6274b, i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f6275c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
