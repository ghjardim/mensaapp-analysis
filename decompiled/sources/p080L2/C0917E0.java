package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.E0 */
/* loaded from: classes.dex */
public final class C0917E0 extends AbstractC7065a {
    public static final Parcelable.Creator<C0917E0> CREATOR = new C0919F0();

    /* renamed from: a */
    public final boolean f3191a;

    public C0917E0(boolean z6) {
        this.f3191a = ((Boolean) AbstractC3802r.m15129k(Boolean.valueOf(z6))).booleanValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0917E0) && this.f3191a == ((C0917E0) obj).f3191a;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f3191a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f3191a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
