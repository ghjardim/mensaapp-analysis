package p115Q2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.y */
/* loaded from: classes.dex */
public final class C2119y extends AbstractC7065a {
    public static final Parcelable.Creator<C2119y> CREATOR = new C2121z();

    /* renamed from: a */
    public Account f6438a;

    public C2119y(Account account) {
        this.f6438a = account;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2119y) {
            return AbstractC3798p.m15099b(this.f6438a, ((C2119y) obj).f6438a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6438a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6438a, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
