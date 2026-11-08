package p313p2;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: p2.h */
/* loaded from: classes.dex */
public class C6113h extends AbstractC7065a {
    public static final Parcelable.Creator<C6113h> CREATOR = new C6100B();

    /* renamed from: a */
    public final PendingIntent f21861a;

    public C6113h(PendingIntent pendingIntent) {
        this.f21861a = pendingIntent;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6113h) {
            return AbstractC3798p.m15099b(this.f21861a, ((C6113h) obj).f21861a);
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f21861a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m25504x0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public PendingIntent m25504x0() {
        return this.f21861a;
    }
}
