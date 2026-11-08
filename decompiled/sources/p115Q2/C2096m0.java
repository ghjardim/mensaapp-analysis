package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.m0 */
/* loaded from: classes.dex */
public final class C2096m0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2096m0> CREATOR = new C2098n0();

    /* renamed from: a */
    public int f6415a;

    /* renamed from: b */
    public C2115w f6416b;

    /* renamed from: c */
    public C2100o0 f6417c;

    public C2096m0(int i7, C2115w c2115w, C2100o0 c2100o0) {
        this.f6415a = i7;
        this.f6416b = c2115w;
        this.f6417c = c2100o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2096m0) {
            C2096m0 c2096m0 = (C2096m0) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6415a), Integer.valueOf(c2096m0.f6415a)) && AbstractC3798p.m15099b(this.f6416b, c2096m0.f6416b) && AbstractC3798p.m15099b(this.f6417c, c2096m0.f6417c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6415a), this.f6416b, this.f6417c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6415a);
        AbstractC7067c.m29106C(parcel, 2, this.f6416b, i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f6417c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
