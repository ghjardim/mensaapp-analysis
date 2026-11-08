package p354u3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3802r;
import java.util.List;
import p346t3.AbstractC6458A;
import p346t3.AbstractC6508h;
import p346t3.C6543y0;
import p346t3.InterfaceC6506g;
import p346t3.InterfaceC6510i;
import p382y2.AbstractC7067c;

/* renamed from: u3.I0 */
/* loaded from: classes.dex */
public final class C6621I0 implements InterfaceC6510i {
    public static final Parcelable.Creator<C6621I0> CREATOR = new C6619H0();

    /* renamed from: a */
    public C6654i f23956a;

    /* renamed from: b */
    public C6617G0 f23957b;

    /* renamed from: c */
    public C6543y0 f23958c;

    public C6621I0(C6654i c6654i) {
        C6654i c6654i2 = (C6654i) AbstractC3802r.m15129k(c6654i);
        this.f23956a = c6654i2;
        List m27554g1 = c6654i2.m27554g1();
        this.f23957b = null;
        for (int i7 = 0; i7 < m27554g1.size(); i7++) {
            if (!TextUtils.isEmpty(((C6646e) m27554g1.get(i7)).zza())) {
                this.f23957b = new C6617G0(((C6646e) m27554g1.get(i7)).mo27065g(), ((C6646e) m27554g1.get(i7)).zza(), c6654i.m27555h1());
            }
        }
        if (this.f23957b == null) {
            this.f23957b = new C6617G0(c6654i.m27555h1());
        }
        this.f23958c = c6654i.m27552e1();
    }

    @Override // p346t3.InterfaceC6510i
    /* renamed from: R */
    public final InterfaceC6506g mo27111R() {
        return this.f23957b;
    }

    @Override // p346t3.InterfaceC6510i
    /* renamed from: S */
    public final AbstractC6508h mo27112S() {
        return this.f23958c;
    }

    @Override // p346t3.InterfaceC6510i
    /* renamed from: d0 */
    public final AbstractC6458A mo27113d0() {
        return this.f23956a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int m29117a = AbstractC7067c.m29117a(parcel);
        AbstractC7067c.m29106C(parcel, 1, mo27113d0(), i7, false);
        AbstractC7067c.m29106C(parcel, 2, mo27111R(), i7, false);
        AbstractC7067c.m29106C(parcel, 3, this.f23958c, i7, false);
        AbstractC7067c.m29118b(parcel, m29117a);
    }

    public C6621I0(C6654i c6654i, C6617G0 c6617g0, C6543y0 c6543y0) {
        this.f23956a = c6654i;
        this.f23957b = c6617g0;
        this.f23958c = c6543y0;
    }
}
