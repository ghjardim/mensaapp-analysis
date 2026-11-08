package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.P0 */
/* loaded from: classes.dex */
public final class C2042P0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2042P0> CREATOR = new C2044Q0();

    /* renamed from: a */
    public String f6271a;

    /* renamed from: b */
    public String f6272b;

    public /* synthetic */ C2042P0(AbstractC2040O0 abstractC2040O0) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2042P0) {
            C2042P0 c2042p0 = (C2042P0) obj;
            if (AbstractC3798p.m15099b(this.f6271a, c2042p0.f6271a) && AbstractC3798p.m15099b(this.f6272b, c2042p0.f6272b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6271a, this.f6272b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6271a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6272b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2042P0(String str, String str2) {
        this.f6271a = str;
        this.f6272b = str2;
    }
}
