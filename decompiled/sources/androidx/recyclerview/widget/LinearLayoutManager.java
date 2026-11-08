package androidx.recyclerview.widget;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.AbstractC3436n {

    /* renamed from: A */
    public boolean f11289A;

    /* renamed from: r */
    public C3420c f11295r;

    /* renamed from: s */
    public AbstractC3462h f11296s;

    /* renamed from: t */
    public boolean f11297t;

    /* renamed from: q */
    public int f11294q = 1;

    /* renamed from: u */
    public boolean f11298u = false;

    /* renamed from: v */
    public boolean f11299v = false;

    /* renamed from: w */
    public boolean f11300w = false;

    /* renamed from: x */
    public boolean f11301x = true;

    /* renamed from: y */
    public int f11302y = -1;

    /* renamed from: z */
    public int f11303z = Integer.MIN_VALUE;

    /* renamed from: B */
    public C3421d f11290B = null;

    /* renamed from: C */
    public final C3418a f11291C = new C3418a();

    /* renamed from: D */
    public final C3419b f11292D = new C3419b();

    /* renamed from: E */
    public int f11293E = 2;

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C3418a {

        /* renamed from: a */
        public AbstractC3462h f11304a;

        /* renamed from: b */
        public int f11305b;

        /* renamed from: c */
        public int f11306c;

        /* renamed from: d */
        public boolean f11307d;

        /* renamed from: e */
        public boolean f11308e;

        public C3418a() {
            m13566a();
        }

        /* renamed from: a */
        public void m13566a() {
            this.f11305b = -1;
            this.f11306c = Integer.MIN_VALUE;
            this.f11307d = false;
            this.f11308e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f11305b + ", mCoordinate=" + this.f11306c + ", mLayoutFromEnd=" + this.f11307d + ", mValid=" + this.f11308e + '}';
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C3419b {
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C3420c {

        /* renamed from: a */
        public boolean f11309a = true;

        /* renamed from: b */
        public int f11310b = 0;

        /* renamed from: c */
        public boolean f11311c = false;

        /* renamed from: d */
        public List f11312d = null;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d */
    public static class C3421d implements Parcelable {
        public static final Parcelable.Creator<C3421d> CREATOR = new a();

        /* renamed from: a */
        public int f11313a;

        /* renamed from: b */
        public int f11314b;

        /* renamed from: c */
        public boolean f11315c;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$d$a */
        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C3421d createFromParcel(Parcel parcel) {
                return new C3421d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C3421d[] newArray(int i7) {
                return new C3421d[i7];
            }
        }

        public C3421d() {
        }

        /* renamed from: a */
        public void m13567a() {
            this.f11313a = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f11313a);
            parcel.writeInt(this.f11314b);
            parcel.writeInt(this.f11315c ? 1 : 0);
        }

        public C3421d(Parcel parcel) {
            this.f11313a = parcel.readInt();
            this.f11314b = parcel.readInt();
            this.f11315c = parcel.readInt() == 1;
        }

        public C3421d(C3421d c3421d) {
            this.f11313a = c3421d.f11313a;
            this.f11314b = c3421d.f11314b;
            this.f11315c = c3421d.f11315c;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i7, int i8) {
        RecyclerView.AbstractC3436n.c m13679J = RecyclerView.AbstractC3436n.m13679J(context, attributeSet, i7, i8);
        m13551R0(m13679J.f11426a);
        m13552S0(m13679J.f11428c);
        mo13522T0(m13679J.f11429d);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: E0 */
    public boolean mo13520E0() {
        return this.f11290B == null && this.f11297t == this.f11300w;
    }

    /* renamed from: F0 */
    public final int m13538F0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        m13542J0();
        return AbstractC3464j.m13926a(c3446x, this.f11296s, m13544L0(!this.f11301x, true), m13543K0(!this.f11301x, true), this, this.f11301x);
    }

    /* renamed from: G0 */
    public final int m13539G0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        m13542J0();
        return AbstractC3464j.m13927b(c3446x, this.f11296s, m13544L0(!this.f11301x, true), m13543K0(!this.f11301x, true), this, this.f11301x, this.f11299v);
    }

    /* renamed from: H0 */
    public final int m13540H0(RecyclerView.C3446x c3446x) {
        if (m13723t() == 0) {
            return 0;
        }
        m13542J0();
        return AbstractC3464j.m13928c(c3446x, this.f11296s, m13544L0(!this.f11301x, true), m13543K0(!this.f11301x, true), this, this.f11301x);
    }

    /* renamed from: I0 */
    public C3420c m13541I0() {
        return new C3420c();
    }

    /* renamed from: J0 */
    public void m13542J0() {
        if (this.f11295r == null) {
            this.f11295r = m13541I0();
        }
    }

    /* renamed from: K0 */
    public final View m13543K0(boolean z6, boolean z7) {
        return this.f11299v ? m13547O0(0, m13723t(), z6, z7) : m13547O0(m13723t() - 1, -1, z6, z7);
    }

    /* renamed from: L0 */
    public final View m13544L0(boolean z6, boolean z7) {
        return this.f11299v ? m13547O0(m13723t() - 1, -1, z6, z7) : m13547O0(0, m13723t(), z6, z7);
    }

    /* renamed from: M0 */
    public int m13545M0() {
        View m13547O0 = m13547O0(0, m13723t(), false, true);
        if (m13547O0 == null) {
            return -1;
        }
        return m13693I(m13547O0);
    }

    /* renamed from: N0 */
    public int m13546N0() {
        View m13547O0 = m13547O0(m13723t() - 1, -1, false, true);
        if (m13547O0 == null) {
            return -1;
        }
        return m13693I(m13547O0);
    }

    /* renamed from: O0 */
    public View m13547O0(int i7, int i8, boolean z6, boolean z7) {
        m13542J0();
        int i9 = z6 ? 24579 : 320;
        int i10 = z7 ? 320 : 0;
        return this.f11294q == 0 ? this.f11412e.m13931a(i7, i8, i9, i10) : this.f11413f.m13931a(i7, i8, i9, i10);
    }

    /* renamed from: P0 */
    public final View m13548P0() {
        return m13721s(this.f11299v ? 0 : m13723t() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Q */
    public boolean mo13549Q() {
        return true;
    }

    /* renamed from: Q0 */
    public final View m13550Q0() {
        return m13721s(this.f11299v ? m13723t() - 1 : 0);
    }

    /* renamed from: R0 */
    public void m13551R0(int i7) {
        if (i7 != 0 && i7 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i7);
        }
        mo13555a(null);
        if (i7 != this.f11294q || this.f11296s == null) {
            AbstractC3462h m13918b = AbstractC3462h.m13918b(this, i7);
            this.f11296s = m13918b;
            this.f11291C.f11304a = m13918b;
            this.f11294q = i7;
            m13682A0();
        }
    }

    /* renamed from: S0 */
    public void m13552S0(boolean z6) {
        mo13555a(null);
        if (z6 == this.f11298u) {
            return;
        }
        this.f11298u = z6;
        m13682A0();
    }

    /* renamed from: T0 */
    public void mo13522T0(boolean z6) {
        mo13555a(null);
        if (this.f11300w == z6) {
            return;
        }
        this.f11300w = z6;
        m13682A0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Y */
    public void mo13553Y(RecyclerView recyclerView, RecyclerView.C3442t c3442t) {
        super.mo13553Y(recyclerView, c3442t);
        if (this.f11289A) {
            m13727v0(c3442t);
            c3442t.m13750b();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: Z */
    public void mo13554Z(AccessibilityEvent accessibilityEvent) {
        super.mo13554Z(accessibilityEvent);
        if (m13723t() > 0) {
            accessibilityEvent.setFromIndex(m13545M0());
            accessibilityEvent.setToIndex(m13546N0());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: a */
    public void mo13555a(String str) {
        if (this.f11290B == null) {
            super.mo13555a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: b */
    public boolean mo13556b() {
        return this.f11294q == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: c */
    public boolean mo13557c() {
        return this.f11294q == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: f */
    public int mo13558f(RecyclerView.C3446x c3446x) {
        return m13538F0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: g */
    public int mo13559g(RecyclerView.C3446x c3446x) {
        return m13539G0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: h */
    public int mo13560h(RecyclerView.C3446x c3446x) {
        return m13540H0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: i */
    public int mo13561i(RecyclerView.C3446x c3446x) {
        return m13538F0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: j */
    public int mo13562j(RecyclerView.C3446x c3446x) {
        return m13539G0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: k */
    public int mo13563k(RecyclerView.C3446x c3446x) {
        return m13540H0(c3446x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: n */
    public RecyclerView.C3437o mo13531n() {
        return new RecyclerView.C3437o(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: o0 */
    public void mo13564o0(Parcelable parcelable) {
        if (parcelable instanceof C3421d) {
            this.f11290B = (C3421d) parcelable;
            m13682A0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC3436n
    /* renamed from: p0 */
    public Parcelable mo13565p0() {
        if (this.f11290B != null) {
            return new C3421d(this.f11290B);
        }
        C3421d c3421d = new C3421d();
        if (m13723t() > 0) {
            m13542J0();
            boolean z6 = this.f11297t ^ this.f11299v;
            c3421d.f11315c = z6;
            if (z6) {
                View m13548P0 = m13548P0();
                c3421d.f11314b = this.f11296s.mo13922f() - this.f11296s.mo13920d(m13548P0);
                c3421d.f11313a = m13693I(m13548P0);
            } else {
                View m13550Q0 = m13550Q0();
                c3421d.f11313a = m13693I(m13550Q0);
                c3421d.f11314b = this.f11296s.mo13921e(m13550Q0) - this.f11296s.mo13923g();
            }
        } else {
            c3421d.m13567a();
        }
        return c3421d;
    }
}
