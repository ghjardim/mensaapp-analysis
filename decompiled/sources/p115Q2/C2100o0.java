package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.o0 */
/* loaded from: classes.dex */
public final class C2100o0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2100o0> CREATOR = new C2102p0();

    /* renamed from: a */
    public C2104q0 f6419a;

    /* renamed from: b */
    public String f6420b;

    /* renamed from: c */
    public String f6421c;

    public C2100o0(C2104q0 c2104q0, String str, String str2) {
        this.f6419a = c2104q0;
        this.f6420b = str;
        this.f6421c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2100o0) {
            C2100o0 c2100o0 = (C2100o0) obj;
            if (AbstractC3798p.m15099b(this.f6419a, c2100o0.f6419a) && AbstractC3798p.m15099b(this.f6420b, c2100o0.f6420b) && AbstractC3798p.m15099b(this.f6421c, c2100o0.f6421c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6419a, this.f6420b, this.f6421c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6419a, i7, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6420b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6421c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
