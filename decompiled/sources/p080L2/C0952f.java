package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.f */
/* loaded from: classes.dex */
public class C0952f extends AbstractC7065a {
    public static final Parcelable.Creator<C0952f> CREATOR = new C0971o0();

    /* renamed from: a */
    public final boolean f3225a;

    public C0952f(boolean z6) {
        this.f3225a = z6;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0952f) && this.f3225a == ((C0952f) obj).f3225a;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f3225a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, m3796x0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public boolean m3796x0() {
        return this.f3225a;
    }
}
