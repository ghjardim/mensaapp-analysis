package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import p382y2.AbstractC7065a;
import p382y2.AbstractC7067c;

/* renamed from: L2.t */
/* loaded from: classes.dex */
public class C0980t extends AbstractC7065a {
    public static final Parcelable.Creator<C0980t> CREATOR = new C0937V();

    /* renamed from: a */
    public final String f3283a;

    /* renamed from: b */
    public final String f3284b;

    /* renamed from: c */
    public final byte[] f3285c;

    /* renamed from: d */
    public final C0956h f3286d;

    /* renamed from: e */
    public final C0954g f3287e;

    /* renamed from: f */
    public final C0958i f3288f;

    /* renamed from: n */
    public final C0950e f3289n;

    /* renamed from: o */
    public final String f3290o;

    public C0980t(String str, String str2, byte[] bArr, C0956h c0956h, C0954g c0954g, C0958i c0958i, C0950e c0950e, String str3) {
        boolean z6 = true;
        if ((c0956h == null || c0954g != null || c0958i != null) && ((c0956h != null || c0954g == null || c0958i != null) && (c0956h != null || c0954g != null || c0958i == null))) {
            z6 = false;
        }
        AbstractC3802r.m15119a(z6);
        this.f3283a = str;
        this.f3284b = str2;
        this.f3285c = bArr;
        this.f3286d = c0956h;
        this.f3287e = c0954g;
        this.f3288f = c0958i;
        this.f3289n = c0950e;
        this.f3290o = str3;
    }

    /* renamed from: A0 */
    public byte[] m3829A0() {
        return this.f3285c;
    }

    /* renamed from: B0 */
    public String m3830B0() {
        return this.f3284b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0980t)) {
            return false;
        }
        C0980t c0980t = (C0980t) obj;
        return AbstractC3798p.m15099b(this.f3283a, c0980t.f3283a) && AbstractC3798p.m15099b(this.f3284b, c0980t.f3284b) && Arrays.equals(this.f3285c, c0980t.f3285c) && AbstractC3798p.m15099b(this.f3286d, c0980t.f3286d) && AbstractC3798p.m15099b(this.f3287e, c0980t.f3287e) && AbstractC3798p.m15099b(this.f3288f, c0980t.f3288f) && AbstractC3798p.m15099b(this.f3289n, c0980t.f3289n) && AbstractC3798p.m15099b(this.f3290o, c0980t.f3290o);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3283a, this.f3284b, this.f3285c, this.f3287e, this.f3286d, this.f3288f, this.f3289n, this.f3290o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29108E(parcel, 1, m3833z0(), false);
        AbstractC7067c.m29108E(parcel, 2, m3830B0(), false);
        AbstractC7067c.m29127k(parcel, 3, m3829A0(), false);
        AbstractC7067c.m29106C(parcel, 4, this.f3286d, i7, false);
        AbstractC7067c.m29106C(parcel, 5, this.f3287e, i7, false);
        AbstractC7067c.m29106C(parcel, 6, this.f3288f, i7, false);
        AbstractC7067c.m29106C(parcel, 7, m3832y0(), i7, false);
        AbstractC7067c.m29108E(parcel, 8, m3831x0(), false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3831x0() {
        return this.f3290o;
    }

    /* renamed from: y0 */
    public C0950e m3832y0() {
        return this.f3289n;
    }

    /* renamed from: z0 */
    public String m3833z0() {
        return this.f3283a;
    }
}
