package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.w */
/* loaded from: classes.dex */
public final class C2115w extends AbstractC7065a {
    public static final Parcelable.Creator<C2115w> CREATOR = new C2117x();

    /* renamed from: a */
    public String f6434a;

    /* renamed from: b */
    public String f6435b;

    public C2115w(String str, String str2) {
        this.f6434a = str;
        this.f6435b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2115w) {
            C2115w c2115w = (C2115w) obj;
            if (AbstractC3798p.m15099b(this.f6434a, c2115w.f6434a) && AbstractC3798p.m15099b(this.f6435b, c2115w.f6435b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6434a, this.f6435b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6434a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6435b, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
