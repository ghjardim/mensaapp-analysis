package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Map;
import p346t3.InterfaceC6506g;
import p382y2.AbstractC7067c;

/* renamed from: u3.G0 */
/* loaded from: classes.dex */
public final class C6617G0 implements InterfaceC6506g {
    public static final Parcelable.Creator<C6617G0> CREATOR = new C6615F0();

    /* renamed from: a */
    public final String f23947a;

    /* renamed from: b */
    public final String f23948b;

    /* renamed from: c */
    public Map f23949c;

    /* renamed from: d */
    public boolean f23950d;

    public C6617G0(boolean z6) {
        this.f23950d = z6;
        this.f23948b = null;
        this.f23947a = null;
        this.f23949c = null;
    }

    @Override // p346t3.InterfaceC6506g
    /* renamed from: G */
    public final String mo27107G() {
        if ("github.com".equals(this.f23947a)) {
            return (String) this.f23949c.get("login");
        }
        if ("twitter.com".equals(this.f23947a)) {
            return (String) this.f23949c.get("screen_name");
        }
        return null;
    }

    @Override // p346t3.InterfaceC6506g
    /* renamed from: T */
    public final Map mo27108T() {
        return this.f23949c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p346t3.InterfaceC6506g
    /* renamed from: g */
    public final String mo27109g() {
        return this.f23947a;
    }

    @Override // p346t3.InterfaceC6506g
    /* renamed from: k0 */
    public final boolean mo27110k0() {
        return this.f23950d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, mo27109g(), false);
        AbstractC7067c.m29108E(parcel, 2, this.f23948b, false);
        AbstractC7067c.m29123g(parcel, 3, mo27110k0());
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C6617G0(String str, String str2, boolean z6) {
        AbstractC3802r.m15123e(str);
        AbstractC3802r.m15123e(str2);
        this.f23947a = str;
        this.f23948b = str2;
        this.f23949c = AbstractC6624L.m27501d(str2);
        this.f23950d = z6;
    }
}
