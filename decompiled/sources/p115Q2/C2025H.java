package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.H */
/* loaded from: classes.dex */
public final class C2025H extends AbstractC7065a {
    public static final Parcelable.Creator<C2025H> CREATOR = new C2027I();

    /* renamed from: a */
    public String f6239a;

    public /* synthetic */ C2025H(AbstractC2023G abstractC2023G) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2025H) {
            return AbstractC3798p.m15099b(this.f6239a, ((C2025H) obj).f6239a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6239a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6239a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2025H(String str) {
        this.f6239a = str;
    }
}
