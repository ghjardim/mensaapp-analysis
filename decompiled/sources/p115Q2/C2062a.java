package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.a */
/* loaded from: classes.dex */
public class C2062a extends AbstractC7065a {
    public static final Parcelable.Creator<C2062a> CREATOR = new C2053V0();

    /* renamed from: a */
    public final int f6379a;

    public C2062a(int i7) {
        this.f6379a = i7;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2062a) {
            return AbstractC3798p.m15099b(Integer.valueOf(this.f6379a), Integer.valueOf(((C2062a) obj).f6379a));
        }
        return false;
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6379a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, m7161x0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public int m7161x0() {
        return this.f6379a;
    }
}
