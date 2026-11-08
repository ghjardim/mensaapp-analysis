package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.X */
/* loaded from: classes.dex */
public final class C2056X extends AbstractC7065a {
    public static final Parcelable.Creator<C2056X> CREATOR = new C2058Y();

    /* renamed from: a */
    public int f6366a;

    /* renamed from: b */
    public String f6367b;

    public C2056X(int i7, String str) {
        this.f6366a = i7;
        this.f6367b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2056X) {
            C2056X c2056x = (C2056X) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6366a), Integer.valueOf(c2056x.f6366a)) && AbstractC3798p.m15099b(this.f6367b, c2056x.f6367b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6366a), this.f6367b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6366a);
        AbstractC7067c.m29108E(parcel, 2, this.f6367b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
