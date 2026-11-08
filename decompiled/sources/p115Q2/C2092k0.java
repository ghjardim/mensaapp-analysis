package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.k0 */
/* loaded from: classes.dex */
public final class C2092k0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2092k0> CREATOR = new C2094l0();

    /* renamed from: a */
    public String f6410a;

    /* renamed from: b */
    public String f6411b;

    public /* synthetic */ C2092k0(AbstractC2090j0 abstractC2090j0) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2092k0) {
            C2092k0 c2092k0 = (C2092k0) obj;
            if (AbstractC3798p.m15099b(this.f6410a, c2092k0.f6410a) && AbstractC3798p.m15099b(this.f6411b, c2092k0.f6411b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6410a, this.f6411b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6410a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6411b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2092k0(String str, String str2) {
        this.f6410a = str;
        this.f6411b = str2;
    }
}
