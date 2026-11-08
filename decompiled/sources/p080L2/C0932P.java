package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.P */
/* loaded from: classes.dex */
public final class C0932P extends AbstractC7065a {
    public static final Parcelable.Creator<C0932P> CREATOR = new C0933Q();

    /* renamed from: a */
    public final String f3200a;

    public C0932P(String str) {
        this.f3200a = (String) AbstractC3802r.m15129k(str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0932P) {
            return this.f3200a.equals(((C0932P) obj).f3200a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f3200a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f3200a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
