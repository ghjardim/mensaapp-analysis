package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import java.util.List;
import p080L2.EnumC0946c;
import p382y2.AbstractC7067c;

/* renamed from: L2.u */
/* loaded from: classes.dex */
public class C0982u extends AbstractC0912C {
    public static final Parcelable.Creator<C0982u> CREATOR = new C0936U();

    /* renamed from: a */
    public final C0990y f3291a;

    /* renamed from: b */
    public final C0908A f3292b;

    /* renamed from: c */
    public final byte[] f3293c;

    /* renamed from: d */
    public final List f3294d;

    /* renamed from: e */
    public final Double f3295e;

    /* renamed from: f */
    public final List f3296f;

    /* renamed from: n */
    public final C0962k f3297n;

    /* renamed from: o */
    public final Integer f3298o;

    /* renamed from: p */
    public final C0916E f3299p;

    /* renamed from: q */
    public final EnumC0946c f3300q;

    /* renamed from: r */
    public final C0948d f3301r;

    public C0982u(C0990y c0990y, C0908A c0908a, byte[] bArr, List list, Double d7, List list2, C0962k c0962k, Integer num, C0916E c0916e, String str, C0948d c0948d) {
        this.f3291a = (C0990y) AbstractC3802r.m15129k(c0990y);
        this.f3292b = (C0908A) AbstractC3802r.m15129k(c0908a);
        this.f3293c = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3294d = (List) AbstractC3802r.m15129k(list);
        this.f3295e = d7;
        this.f3296f = list2;
        this.f3297n = c0962k;
        this.f3298o = num;
        this.f3299p = c0916e;
        if (str != null) {
            try {
                this.f3300q = EnumC0946c.m3791b(str);
            } catch (EnumC0946c.a e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f3300q = null;
        }
        this.f3301r = c0948d;
    }

    /* renamed from: A0 */
    public byte[] m3834A0() {
        return this.f3293c;
    }

    /* renamed from: B0 */
    public List m3835B0() {
        return this.f3296f;
    }

    /* renamed from: C0 */
    public List m3836C0() {
        return this.f3294d;
    }

    /* renamed from: D0 */
    public Integer m3837D0() {
        return this.f3298o;
    }

    /* renamed from: E0 */
    public C0990y m3838E0() {
        return this.f3291a;
    }

    /* renamed from: F0 */
    public Double m3839F0() {
        return this.f3295e;
    }

    /* renamed from: G0 */
    public C0916E m3840G0() {
        return this.f3299p;
    }

    /* renamed from: H0 */
    public C0908A m3841H0() {
        return this.f3292b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C0982u)) {
            return false;
        }
        C0982u c0982u = (C0982u) obj;
        return AbstractC3798p.m15099b(this.f3291a, c0982u.f3291a) && AbstractC3798p.m15099b(this.f3292b, c0982u.f3292b) && Arrays.equals(this.f3293c, c0982u.f3293c) && AbstractC3798p.m15099b(this.f3295e, c0982u.f3295e) && this.f3294d.containsAll(c0982u.f3294d) && c0982u.f3294d.containsAll(this.f3294d) && (((list = this.f3296f) == null && c0982u.f3296f == null) || (list != null && (list2 = c0982u.f3296f) != null && list.containsAll(list2) && c0982u.f3296f.containsAll(this.f3296f))) && AbstractC3798p.m15099b(this.f3297n, c0982u.f3297n) && AbstractC3798p.m15099b(this.f3298o, c0982u.f3298o) && AbstractC3798p.m15099b(this.f3299p, c0982u.f3299p) && AbstractC3798p.m15099b(this.f3300q, c0982u.f3300q) && AbstractC3798p.m15099b(this.f3301r, c0982u.f3301r);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(this.f3291a, this.f3292b, Integer.valueOf(Arrays.hashCode(this.f3293c)), this.f3294d, this.f3295e, this.f3296f, this.f3297n, this.f3298o, this.f3299p, this.f3300q, this.f3301r);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 2, m3838E0(), i7, false);
        AbstractC7067c.m29106C(parcel, 3, m3841H0(), i7, false);
        AbstractC7067c.m29127k(parcel, 4, m3834A0(), false);
        AbstractC7067c.m29112I(parcel, 5, m3836C0(), false);
        AbstractC7067c.m29131o(parcel, 6, m3839F0(), false);
        AbstractC7067c.m29112I(parcel, 7, m3835B0(), false);
        AbstractC7067c.m29106C(parcel, 8, m3844z0(), i7, false);
        AbstractC7067c.m29139w(parcel, 9, m3837D0(), false);
        AbstractC7067c.m29106C(parcel, 10, m3840G0(), i7, false);
        AbstractC7067c.m29108E(parcel, 11, m3842x0(), false);
        AbstractC7067c.m29106C(parcel, 12, m3843y0(), i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public String m3842x0() {
        EnumC0946c enumC0946c = this.f3300q;
        if (enumC0946c == null) {
            return null;
        }
        return enumC0946c.toString();
    }

    /* renamed from: y0 */
    public C0948d m3843y0() {
        return this.f3301r;
    }

    /* renamed from: z0 */
    public C0962k m3844z0() {
        return this.f3297n;
    }
}
