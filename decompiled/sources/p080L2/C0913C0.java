package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.HashSet;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.C0 */
/* loaded from: classes.dex */
public final class C0913C0 extends AbstractC7065a {
    public static final Parcelable.Creator<C0913C0> CREATOR = new C0915D0();

    /* renamed from: a */
    public final List f3176a;

    public C0913C0(List list) {
        this.f3176a = (List) AbstractC3802r.m15129k(list);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0913C0)) {
            return false;
        }
        C0913C0 c0913c0 = (C0913C0) obj;
        return this.f3176a.containsAll(c0913c0.f3176a) && c0913c0.f3176a.containsAll(this.f3176a);
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(new HashSet(this.f3176a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, this.f3176a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
