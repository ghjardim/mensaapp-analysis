package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.j */
/* loaded from: classes.dex */
public class C6115j extends AbstractC7065a {
    public static final Parcelable.Creator<C6115j> CREATOR = new C6102D();

    /* renamed from: a */
    public final PendingIntent f21868a;

    public C6115j(PendingIntent pendingIntent) {
        this.f21868a = (PendingIntent) AbstractC3802r.m15129k(pendingIntent);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6115j) {
            return AbstractC3798p.m15099b(this.f21868a, ((C6115j) obj).f21868a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21868a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m25512x0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public PendingIntent m25512x0() {
        return this.f21868a;
    }
}
