package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.N */
/* loaded from: classes.dex */
public final class C2037N extends AbstractC7065a {
    public static final Parcelable.Creator<C2037N> CREATOR = new C2039O();

    /* renamed from: a */
    public int f6269a;

    public C2037N(int i7) {
        this.f6269a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2037N) {
            return AbstractC3798p.m15099b(Integer.valueOf(this.f6269a), Integer.valueOf(((C2037N) obj).f6269a));
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6269a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6269a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
