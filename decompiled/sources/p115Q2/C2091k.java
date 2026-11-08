package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.k */
/* loaded from: classes.dex */
public final class C2091k extends AbstractC7065a {
    public static final Parcelable.Creator<C2091k> CREATOR = new C2093l();

    /* renamed from: a */
    public String f6408a;

    /* renamed from: b */
    public int f6409b;

    public /* synthetic */ C2091k(AbstractC2089j abstractC2089j) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2091k) {
            C2091k c2091k = (C2091k) obj;
            if (AbstractC3798p.m15099b(this.f6408a, c2091k.f6408a) && AbstractC3798p.m15099b(Integer.valueOf(this.f6409b), Integer.valueOf(c2091k.f6409b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6408a, Integer.valueOf(this.f6409b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, this.f6408a, false);
        AbstractC7067c.m29136t(parcel, 3, this.f6409b);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2091k(String str, int i7) {
        this.f6408a = str;
        this.f6409b = i7;
    }
}
