package p115Q2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: Q2.d */
/* loaded from: classes.dex */
public final class C2071d extends AbstractC7065a {
    public static final Parcelable.Creator<C2071d> CREATOR = new C2019E();

    /* renamed from: a */
    public String f6391a;

    /* renamed from: b */
    public String f6392b;

    /* renamed from: c */
    public String f6393c;

    public C2071d(String str, String str2, String str3) {
        this.f6391a = str;
        this.f6392b = str2;
        this.f6393c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2071d) {
            C2071d c2071d = (C2071d) obj;
            if (AbstractC3798p.m15099b(this.f6391a, c2071d.f6391a) && AbstractC3798p.m15099b(this.f6392b, c2071d.f6392b) && AbstractC3798p.m15099b(this.f6393c, c2071d.f6393c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3798p.m15100c(this.f6391a, this.f6392b, this.f6393c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, this.f6391a, false);
        AbstractC7067c.m29108E(parcel, 2, this.f6392b, false);
        AbstractC7067c.m29108E(parcel, 3, this.f6393c, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }
}
