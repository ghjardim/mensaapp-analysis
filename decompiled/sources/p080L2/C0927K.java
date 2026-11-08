package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.K */
/* loaded from: classes.dex */
public final class C0927K extends AbstractC7065a {
    public static final Parcelable.Creator<C0927K> CREATOR = new C0928L();

    /* renamed from: a */
    public final long f3198a;

    public C0927K(long j7) {
        this.f3198a = ((Long) AbstractC3802r.m15129k(Long.valueOf(j7))).longValue();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0927K) && this.f3198a == ((C0927K) obj).f3198a;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Long.valueOf(this.f3198a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29140x(parcel, 1, this.f3198a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
