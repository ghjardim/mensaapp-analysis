package p313p2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.m */
/* loaded from: classes.dex */
public class C6118m extends AbstractC7065a {
    public static final Parcelable.Creator<C6118m> CREATOR = new C6105G();

    /* renamed from: a */
    public final String f21878a;

    /* renamed from: b */
    public final String f21879b;

    public C6118m(String str, String str2) {
        this.f21878a = AbstractC3802r.m15124f(((String) AbstractC3802r.m15130l(str, "Account identifier cannot be null")).trim(), "Account identifier cannot be empty");
        this.f21879b = AbstractC3802r.m15123e(str2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6118m)) {
            return false;
        }
        C6118m c6118m = (C6118m) obj;
        return AbstractC3798p.m15099b(this.f21878a, c6118m.f21878a) && AbstractC3798p.m15099b(this.f21879b, c6118m.f21879b);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21878a, this.f21879b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m25522x0(), false);
        AbstractC7067c.m29108E(parcel, 2, m25523y0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m25522x0() {
        return this.f21878a;
    }

    /* renamed from: y0 */
    public String m25523y0() {
        return this.f21879b;
    }
}
