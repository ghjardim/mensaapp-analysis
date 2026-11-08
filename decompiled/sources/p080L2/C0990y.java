package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.y */
/* loaded from: classes.dex */
public class C0990y extends AbstractC7065a {
    public static final Parcelable.Creator<C0990y> CREATOR = new C0941Z();

    /* renamed from: a */
    public final String f3317a;

    /* renamed from: b */
    public final String f3318b;

    /* renamed from: c */
    public final String f3319c;

    public C0990y(String str, String str2, String str3) {
        this.f3317a = (String) AbstractC3802r.m15129k(str);
        this.f3318b = (String) AbstractC3802r.m15129k(str2);
        this.f3319c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0990y)) {
            return false;
        }
        C0990y c0990y = (C0990y) obj;
        return AbstractC3798p.m15099b(this.f3317a, c0990y.f3317a) && AbstractC3798p.m15099b(this.f3318b, c0990y.f3318b) && AbstractC3798p.m15099b(this.f3319c, c0990y.f3319c);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3317a, this.f3318b, this.f3319c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 2, m3858y0(), false);
        AbstractC7067c.m29108E(parcel, 3, m3859z0(), false);
        AbstractC7067c.m29108E(parcel, 4, m3857x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3857x0() {
        return this.f3319c;
    }

    /* renamed from: y0 */
    public String m3858y0() {
        return this.f3317a;
    }

    /* renamed from: z0 */
    public String m3859z0() {
        return this.f3318b;
    }
}
