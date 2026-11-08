package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.F */
/* loaded from: classes.dex */
public class C0918F extends AbstractC7065a {
    public static final Parcelable.Creator<C0918F> CREATOR = new C0953f0();

    /* renamed from: a */
    public final boolean f3192a;

    public C0918F(boolean z6) {
        this.f3192a = z6;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0918F) && this.f3192a == ((C0918F) obj).f3192a;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f3192a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, m3785x0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public boolean m3785x0() {
        return this.f3192a;
    }
}
