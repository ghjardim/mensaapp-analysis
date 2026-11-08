package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.y0 */
/* loaded from: classes.dex */
public final class C2120y0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2120y0> CREATOR = new C2122z0();

    /* renamed from: a */
    public boolean f6439a;

    public C2120y0(boolean z6) {
        this.f6439a = z6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2120y0) {
            return AbstractC3798p.m15099b(Boolean.valueOf(this.f6439a), Boolean.valueOf(((C2120y0) obj).f6439a));
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f6439a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, this.f6439a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
