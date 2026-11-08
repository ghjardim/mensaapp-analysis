package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.u0 */
/* loaded from: classes.dex */
public final class C2112u0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2112u0> CREATOR = new C2114v0();

    /* renamed from: a */
    public String f6431a;

    /* renamed from: b */
    public long f6432b;

    /* renamed from: c */
    public String f6433c;

    public C2112u0(String str, long j7, String str2) {
        this.f6431a = str;
        this.f6432b = j7;
        this.f6433c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2112u0) {
            C2112u0 c2112u0 = (C2112u0) obj;
            if (AbstractC3798p.m15099b(this.f6431a, c2112u0.f6431a) && AbstractC3798p.m15099b(Long.valueOf(this.f6432b), Long.valueOf(c2112u0.f6432b)) && AbstractC3798p.m15099b(this.f6433c, c2112u0.f6433c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6431a, Long.valueOf(this.f6432b), this.f6433c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6431a, false);
        AbstractC7067c.m29140x(parcel, 2, this.f6432b);
        AbstractC7067c.m29108E(parcel, 3, this.f6433c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
