package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.s */
/* loaded from: classes.dex */
public class C0978s extends AbstractC7065a {
    public static final Parcelable.Creator<C0978s> CREATOR = new C0931O();

    /* renamed from: a */
    public final boolean f3282a;

    public C0978s(boolean z6) {
        this.f3282a = z6;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0978s) && this.f3282a == ((C0978s) obj).m3828x0();
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Boolean.valueOf(this.f3282a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29123g(parcel, 1, m3828x0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public boolean m3828x0() {
        return this.f3282a;
    }
}
