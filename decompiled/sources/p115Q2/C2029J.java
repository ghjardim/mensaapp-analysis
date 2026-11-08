package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.J */
/* loaded from: classes.dex */
public final class C2029J extends AbstractC7065a {
    public static final Parcelable.Creator<C2029J> CREATOR = new C2031K();

    /* renamed from: a */
    public String f6240a;

    /* renamed from: b */
    public String f6241b;

    /* renamed from: c */
    public String f6242c;

    /* renamed from: d */
    public C2081g0 f6243d;

    public C2029J(String str, String str2, String str3, C2081g0 c2081g0) {
        this.f6240a = str;
        this.f6241b = str2;
        this.f6242c = str3;
        this.f6243d = c2081g0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2029J) {
            C2029J c2029j = (C2029J) obj;
            if (AbstractC3798p.m15099b(this.f6240a, c2029j.f6240a) && AbstractC3798p.m15099b(this.f6241b, c2029j.f6241b) && AbstractC3798p.m15099b(this.f6242c, c2029j.f6242c) && AbstractC3798p.m15099b(this.f6243d, c2029j.f6243d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6240a, this.f6241b, this.f6242c, this.f6243d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6240a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6241b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6242c, false);
        AbstractC7067c.m29106C(parcel, 4, this.f6243d, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
