package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.f0 */
/* loaded from: classes.dex */
public final class C2078f0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2078f0> CREATOR = new C2084h0();

    /* renamed from: a */
    public String f6397a;

    public /* synthetic */ C2078f0(AbstractC2075e0 abstractC2075e0) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2078f0) {
            return AbstractC3798p.m15099b(this.f6397a, ((C2078f0) obj).f6397a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6397a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6397a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2078f0(String str) {
        this.f6397a = str;
    }
}
