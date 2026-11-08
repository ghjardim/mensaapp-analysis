package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.o */
/* loaded from: classes.dex */
public final class C2099o extends AbstractC7065a {
    public static final Parcelable.Creator<C2099o> CREATOR = new C2101p();

    /* renamed from: a */
    public C2116w0 f6418a;

    public C2099o(C2116w0 c2116w0) {
        this.f6418a = c2116w0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2099o) {
            return AbstractC3798p.m15099b(this.f6418a, ((C2099o) obj).f6418a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6418a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6418a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
