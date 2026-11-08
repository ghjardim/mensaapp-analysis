package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import java.util.HashSet;
import java.util.List;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.G */
/* loaded from: classes.dex */
public class C0920G extends AbstractC7065a {
    public static final Parcelable.Creator<C0920G> CREATOR = new C0961j0();

    /* renamed from: a */
    public final List f3193a;

    public C0920G(List list) {
        this.f3193a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof C0920G)) {
            return false;
        }
        C0920G c0920g = (C0920G) obj;
        List list2 = this.f3193a;
        return (list2 == null && c0920g.f3193a == null) || (list2 != null && (list = c0920g.f3193a) != null && list2.containsAll(list) && c0920g.f3193a.containsAll(this.f3193a));
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(new HashSet(this.f3193a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29112I(parcel, 1, m3786x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public List m3786x0() {
        return this.f3193a;
    }
}
