package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.b1 */
/* loaded from: classes.dex */
public final class C2067b1 extends AbstractC7065a {
    public static final Parcelable.Creator<C2067b1> CREATOR = new C2070c1();

    /* renamed from: a */
    public long f6387a;

    public C2067b1(long j7) {
        this.f6387a = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2067b1) {
            return AbstractC3798p.m15099b(Long.valueOf(this.f6387a), Long.valueOf(((C2067b1) obj).f6387a));
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Long.valueOf(this.f6387a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, this.f6387a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
