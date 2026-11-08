package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.g0 */
/* loaded from: classes.dex */
public final class C2081g0 extends AbstractC7065a {
    public static final Parcelable.Creator<C2081g0> CREATOR = new C2026H0();

    /* renamed from: a */
    public int f6401a;

    /* renamed from: b */
    public String f6402b;

    /* renamed from: c */
    public boolean f6403c;

    /* renamed from: d */
    public String f6404d;

    public C2081g0(int i7, String str, boolean z6, String str2) {
        this.f6401a = i7;
        this.f6402b = str;
        this.f6403c = z6;
        this.f6404d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2081g0) {
            C2081g0 c2081g0 = (C2081g0) obj;
            if (AbstractC3798p.m15099b(Integer.valueOf(this.f6401a), Integer.valueOf(c2081g0.f6401a)) && AbstractC3798p.m15099b(this.f6402b, c2081g0.f6402b) && AbstractC3798p.m15099b(Boolean.valueOf(this.f6403c), Boolean.valueOf(c2081g0.f6403c)) && AbstractC3798p.m15099b(this.f6404d, c2081g0.f6404d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(this.f6401a), this.f6402b, Boolean.valueOf(this.f6403c), this.f6404d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29136t(parcel, 1, this.f6401a);
        AbstractC7067c.m29108E(parcel, 2, this.f6402b, false);
        AbstractC7067c.m29123g(parcel, 3, this.f6403c);
        AbstractC7067c.m29108E(parcel, 4, this.f6404d, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
