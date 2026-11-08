package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.h1 */
/* loaded from: classes.dex */
public final class C2085h1 extends AbstractC7065a {
    public static final Parcelable.Creator<C2085h1> CREATOR = new C2088i1();

    /* renamed from: a */
    public int f6405a;

    public C2085h1(int i7) {
        this.f6405a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2085h1) {
            return AbstractC3798p.m15099b(Integer.valueOf(this.f6405a), Integer.valueOf(((C2085h1) obj).f6405a));
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6405a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6405a);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public /* synthetic */ C2085h1(AbstractC2082g1 abstractC2082g1) {
    }
}
