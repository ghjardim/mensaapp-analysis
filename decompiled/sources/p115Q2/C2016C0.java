package p115Q2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.C0 */
/* loaded from: classes.dex */
public final class C2016C0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2016C0> CREATOR = new C2018D0();

    /* renamed from: a */
    public C2071d f6223a;

    /* renamed from: b */
    public String f6224b;

    /* renamed from: c */
    public String f6225c;

    /* renamed from: d */
    public C2071d f6226d;

    /* renamed from: e */
    public PendingIntent f6227e;

    public C2016C0(C2071d c2071d, String str, String str2, C2071d c2071d2, PendingIntent pendingIntent) {
        this.f6223a = c2071d;
        this.f6224b = str;
        this.f6225c = str2;
        this.f6226d = c2071d2;
        this.f6227e = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2016C0) {
            C2016C0 c2016c0 = (C2016C0) obj;
            if (AbstractC3798p.m15099b(this.f6223a, c2016c0.f6223a) && AbstractC3798p.m15099b(this.f6224b, c2016c0.f6224b) && AbstractC3798p.m15099b(this.f6225c, c2016c0.f6225c) && AbstractC3798p.m15099b(this.f6226d, c2016c0.f6226d) && AbstractC3798p.m15099b(this.f6227e, c2016c0.f6227e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6223a, this.f6224b, this.f6225c, this.f6226d, this.f6227e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, this.f6223a, i7, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6224b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6225c, false);
        AbstractC7067c.m29106C(parcel, 4, this.f6226d, i7, false);
        AbstractC7067c.m29106C(parcel, 5, this.f6227e, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
