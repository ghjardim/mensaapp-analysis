package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.C */
/* loaded from: classes.dex */
public final class C2015C extends AbstractC7065a {
    public static final Parcelable.Creator<C2015C> CREATOR = new C2017D();

    /* renamed from: a */
    public String f6222a;

    public /* synthetic */ C2015C(AbstractC2013B abstractC2013B) {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2015C) {
            return AbstractC3798p.m15099b(this.f6222a, ((C2015C) obj).f6222a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6222a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6222a, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C2015C(String str) {
        this.f6222a = str;
    }
}
