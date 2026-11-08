package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.d */
/* loaded from: classes.dex */
public class C0948d extends AbstractC7065a {
    public static final Parcelable.Creator<C0948d> CREATOR = new C0969n0();

    /* renamed from: a */
    public final C0976r f3211a;

    /* renamed from: b */
    public final C0913C0 f3212b;

    /* renamed from: c */
    public final C0918F f3213c;

    /* renamed from: d */
    public final C0925I0 f3214d;

    /* renamed from: e */
    public final C0927K f3215e;

    /* renamed from: f */
    public final C0929M f3216f;

    /* renamed from: n */
    public final C0917E0 f3217n;

    /* renamed from: o */
    public final C0932P f3218o;

    /* renamed from: p */
    public final C0978s f3219p;

    /* renamed from: q */
    public final C0934S f3220q;

    public C0948d(C0976r c0976r, C0913C0 c0913c0, C0918F c0918f, C0925I0 c0925i0, C0927K c0927k, C0929M c0929m, C0917E0 c0917e0, C0932P c0932p, C0978s c0978s, C0934S c0934s) {
        this.f3211a = c0976r;
        this.f3213c = c0918f;
        this.f3212b = c0913c0;
        this.f3214d = c0925i0;
        this.f3215e = c0927k;
        this.f3216f = c0929m;
        this.f3217n = c0917e0;
        this.f3218o = c0932p;
        this.f3219p = c0978s;
        this.f3220q = c0934s;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0948d)) {
            return false;
        }
        C0948d c0948d = (C0948d) obj;
        return AbstractC3798p.m15099b(this.f3211a, c0948d.f3211a) && AbstractC3798p.m15099b(this.f3212b, c0948d.f3212b) && AbstractC3798p.m15099b(this.f3213c, c0948d.f3213c) && AbstractC3798p.m15099b(this.f3214d, c0948d.f3214d) && AbstractC3798p.m15099b(this.f3215e, c0948d.f3215e) && AbstractC3798p.m15099b(this.f3216f, c0948d.f3216f) && AbstractC3798p.m15099b(this.f3217n, c0948d.f3217n) && AbstractC3798p.m15099b(this.f3218o, c0948d.f3218o) && AbstractC3798p.m15099b(this.f3219p, c0948d.f3219p) && AbstractC3798p.m15099b(this.f3220q, c0948d.f3220q);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3211a, this.f3212b, this.f3213c, this.f3214d, this.f3215e, this.f3216f, this.f3217n, this.f3218o, this.f3219p, this.f3220q);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 2, m3792x0(), i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f3212b, i7, false);
        AbstractC7067c.m29106C(parcel, 4, m3793y0(), i7, false);
        AbstractC7067c.m29106C(parcel, 5, this.f3214d, i7, false);
        AbstractC7067c.m29106C(parcel, 6, this.f3215e, i7, false);
        AbstractC7067c.m29106C(parcel, 7, this.f3216f, i7, false);
        AbstractC7067c.m29106C(parcel, 8, this.f3217n, i7, false);
        AbstractC7067c.m29106C(parcel, 9, this.f3218o, i7, false);
        AbstractC7067c.m29106C(parcel, 10, this.f3219p, i7, false);
        AbstractC7067c.m29106C(parcel, 11, this.f3220q, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public C0976r m3792x0() {
        return this.f3211a;
    }

    /* renamed from: y0 */
    public C0918F m3793y0() {
        return this.f3213c;
    }
}
