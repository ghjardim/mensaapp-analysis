package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.e */
/* loaded from: classes.dex */
public class C0950e extends AbstractC7065a {
    public static final Parcelable.Creator<C0950e> CREATOR = new C0967m0();

    /* renamed from: a */
    public final C0920G f3221a;

    /* renamed from: b */
    public final C0973p0 f3222b;

    /* renamed from: c */
    public final C0952f f3223c;

    /* renamed from: d */
    public final C0977r0 f3224d;

    public C0950e(C0920G c0920g, C0973p0 c0973p0, C0952f c0952f, C0977r0 c0977r0) {
        this.f3221a = c0920g;
        this.f3222b = c0973p0;
        this.f3223c = c0952f;
        this.f3224d = c0977r0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0950e)) {
            return false;
        }
        C0950e c0950e = (C0950e) obj;
        return AbstractC3798p.m15099b(this.f3221a, c0950e.f3221a) && AbstractC3798p.m15099b(this.f3222b, c0950e.f3222b) && AbstractC3798p.m15099b(this.f3223c, c0950e.f3223c) && AbstractC3798p.m15099b(this.f3224d, c0950e.f3224d);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3221a, this.f3222b, this.f3223c, this.f3224d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, m3795y0(), i7, false);
        AbstractC7067c.m29106C(parcel, 2, this.f3222b, i7, false);
        AbstractC7067c.m29106C(parcel, 3, m3794x0(), i7, false);
        AbstractC7067c.m29106C(parcel, 4, this.f3224d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public C0952f m3794x0() {
        return this.f3223c;
    }

    /* renamed from: y0 */
    public C0920G m3795y0() {
        return this.f3221a;
    }
}
