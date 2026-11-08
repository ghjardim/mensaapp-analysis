package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.L0 */
/* loaded from: classes.dex */
public final class C2034L0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2034L0> CREATOR = new C2036M0();

    /* renamed from: a */
    public int f6263a;

    /* renamed from: b */
    public boolean f6264b;

    /* renamed from: c */
    public String f6265c;

    /* renamed from: d */
    public String f6266d;

    /* renamed from: e */
    public C2016C0 f6267e;

    /* renamed from: f */
    public C2029J f6268f;

    public C2034L0(int i7, boolean z6, String str, String str2, C2016C0 c2016c0, C2029J c2029j) {
        this.f6263a = i7;
        this.f6264b = z6;
        this.f6265c = str;
        this.f6266d = str2;
        this.f6267e = c2016c0;
        this.f6268f = c2029j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2034L0) {
            C2034L0 c2034l0 = (C2034L0) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6263a), Integer.valueOf(c2034l0.f6263a)) && AbstractC3798p.m15099b(Boolean.valueOf(this.f6264b), Boolean.valueOf(c2034l0.f6264b)) && AbstractC3798p.m15099b(this.f6265c, c2034l0.f6265c) && AbstractC3798p.m15099b(this.f6266d, c2034l0.f6266d) && AbstractC3798p.m15099b(this.f6267e, c2034l0.f6267e) && AbstractC3798p.m15099b(this.f6268f, c2034l0.f6268f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6263a), Boolean.valueOf(this.f6264b), this.f6265c, this.f6266d, this.f6267e, this.f6268f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6263a);
        AbstractC7067c.m29123g(parcel, 2, this.f6264b);
        AbstractC7067c.m29108E(parcel, 3, this.f6265c, false);
        AbstractC7067c.m29108E(parcel, 4, this.f6266d, false);
        AbstractC7067c.m29106C(parcel, 5, this.f6267e, i7, false);
        AbstractC7067c.m29106C(parcel, 6, this.f6268f, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
