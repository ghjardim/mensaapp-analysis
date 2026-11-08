package p080L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3798p;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.Arrays;
import java.util.List;
import p382y2.AbstractC7067c;

/* renamed from: L2.x */
/* loaded from: classes.dex */
public class C0988x extends AbstractC0912C {
    public static final Parcelable.Creator<C0988x> CREATOR = new C0940Y();

    /* renamed from: a */
    public final byte[] f3308a;

    /* renamed from: b */
    public final Double f3309b;

    /* renamed from: c */
    public final String f3310c;

    /* renamed from: d */
    public final List f3311d;

    /* renamed from: e */
    public final Integer f3312e;

    /* renamed from: f */
    public final C0916E f3313f;

    /* renamed from: n */
    public final EnumC0959i0 f3314n;

    /* renamed from: o */
    public final C0948d f3315o;

    /* renamed from: p */
    public final Long f3316p;

    public C0988x(byte[] bArr, Double d7, String str, List list, Integer num, C0916E c0916e, String str2, C0948d c0948d, Long l7) {
        this.f3308a = (byte[]) AbstractC3802r.m15129k(bArr);
        this.f3309b = d7;
        this.f3310c = (String) AbstractC3802r.m15129k(str);
        this.f3311d = list;
        this.f3312e = num;
        this.f3313f = c0916e;
        this.f3316p = l7;
        if (str2 != null) {
            try {
                this.f3314n = EnumC0959i0.m3808b(str2);
            } catch (C0957h0 e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f3314n = null;
        }
        this.f3315o = c0948d;
    }

    /* renamed from: A0 */
    public Integer m3850A0() {
        return this.f3312e;
    }

    /* renamed from: B0 */
    public String m3851B0() {
        return this.f3310c;
    }

    /* renamed from: C0 */
    public Double m3852C0() {
        return this.f3309b;
    }

    /* renamed from: D0 */
    public C0916E m3853D0() {
        return this.f3313f;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof C0988x)) {
            return false;
        }
        C0988x c0988x = (C0988x) obj;
        return Arrays.equals(this.f3308a, c0988x.f3308a) && AbstractC3798p.m15099b(this.f3309b, c0988x.f3309b) && AbstractC3798p.m15099b(this.f3310c, c0988x.f3310c) && (((list = this.f3311d) == null && c0988x.f3311d == null) || (list != null && (list2 = c0988x.f3311d) != null && list.containsAll(list2) && c0988x.f3311d.containsAll(this.f3311d))) && AbstractC3798p.m15099b(this.f3312e, c0988x.f3312e) && AbstractC3798p.m15099b(this.f3313f, c0988x.f3313f) && AbstractC3798p.m15099b(this.f3314n, c0988x.f3314n) && AbstractC3798p.m15099b(this.f3315o, c0988x.f3315o) && AbstractC3798p.m15099b(this.f3316p, c0988x.f3316p);
    }

    public int hashCode() {
        return AbstractC3798p.m15100c(Integer.valueOf(Arrays.hashCode(this.f3308a)), this.f3309b, this.f3310c, this.f3311d, this.f3312e, this.f3313f, this.f3314n, this.f3315o, this.f3316p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29127k(parcel, 2, m3856z0(), false);
        AbstractC7067c.m29131o(parcel, 3, m3852C0(), false);
        AbstractC7067c.m29108E(parcel, 4, m3851B0(), false);
        AbstractC7067c.m29112I(parcel, 5, m3854x0(), false);
        AbstractC7067c.m29139w(parcel, 6, m3850A0(), false);
        AbstractC7067c.m29106C(parcel, 7, m3853D0(), i7, false);
        EnumC0959i0 enumC0959i0 = this.f3314n;
        AbstractC7067c.m29108E(parcel, 8, enumC0959i0 == null ? null : enumC0959i0.toString(), false);
        AbstractC7067c.m29106C(parcel, 9, m3855y0(), i7, false);
        AbstractC7067c.m29142z(parcel, 10, this.f3316p, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    /* renamed from: x0 */
    public List m3854x0() {
        return this.f3311d;
    }

    /* renamed from: y0 */
    public C0948d m3855y0() {
        return this.f3315o;
    }

    /* renamed from: z0 */
    public byte[] m3856z0() {
        return this.f3308a;
    }
}
