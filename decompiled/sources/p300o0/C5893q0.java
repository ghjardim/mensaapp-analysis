package p300o0;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p022D0.C0116B;
import p022D0.C0179y;
import p022D0.InterfaceC0120F;
import p171Y2.AbstractC2928k;
import p178Z2.AbstractC2987A;
import p178Z2.AbstractC3033v;
import p178Z2.AbstractC3035x;
import p232g0.AbstractC4296B;
import p232g0.AbstractC4303I;
import p232g0.C4297C;
import p232g0.C4306L;
import p232g0.C4310P;
import p232g0.C4312b;
import p232g0.C4322l;
import p232g0.C4326p;
import p232g0.C4327q;
import p232g0.C4331u;
import p232g0.C4333w;
import p232g0.C4334x;
import p232g0.InterfaceC4298D;
import p248i0.C4504b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5345n;
import p259j0.InterfaceC5334c;
import p259j0.InterfaceC5342k;
import p292n0.C5747o;
import p292n0.C5749p;
import p292n0.C5759u;
import p300o0.InterfaceC5850c;
import p311p0.InterfaceC6097z;
import p335s0.AbstractC6355o;

/* renamed from: o0.q0 */
/* loaded from: classes.dex */
public class C5893q0 implements InterfaceC5844a {

    /* renamed from: a */
    public final InterfaceC5334c f21235a;

    /* renamed from: b */
    public final AbstractC4303I.b f21236b;

    /* renamed from: c */
    public final AbstractC4303I.c f21237c;

    /* renamed from: d */
    public final a f21238d;

    /* renamed from: e */
    public final SparseArray f21239e;

    /* renamed from: f */
    public C5345n f21240f;

    /* renamed from: g */
    public InterfaceC4298D f21241g;

    /* renamed from: h */
    public InterfaceC5342k f21242h;

    /* renamed from: i */
    public boolean f21243i;

    /* renamed from: o0.q0$a */
    public static final class a {

        /* renamed from: a */
        public final AbstractC4303I.b f21244a;

        /* renamed from: b */
        public AbstractC3033v f21245b = AbstractC3033v.m11050t();

        /* renamed from: c */
        public AbstractC3035x f21246c = AbstractC3035x.m11072j();

        /* renamed from: d */
        public InterfaceC0120F.b f21247d;

        /* renamed from: e */
        public InterfaceC0120F.b f21248e;

        /* renamed from: f */
        public InterfaceC0120F.b f21249f;

        public a(AbstractC4303I.b bVar) {
            this.f21244a = bVar;
        }

        /* renamed from: c */
        public static InterfaceC0120F.b m24797c(InterfaceC4298D interfaceC4298D, AbstractC3033v abstractC3033v, InterfaceC0120F.b bVar, AbstractC4303I.b bVar2) {
            AbstractC4303I mo17961L = interfaceC4298D.mo17961L();
            int mo17975m = interfaceC4298D.mo17975m();
            Object mo304m = mo17961L.m18032q() ? null : mo17961L.mo304m(mo17975m);
            int m18037d = (interfaceC4298D.mo17972j() || mo17961L.m18032q()) ? -1 : mo17961L.m18027f(mo17975m, bVar2).m18037d(AbstractC5330M.m21692K0(interfaceC4298D.mo17964O()) - bVar2.m18047n());
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                InterfaceC0120F.b bVar3 = (InterfaceC0120F.b) abstractC3033v.get(i7);
                if (m24798i(bVar3, mo304m, interfaceC4298D.mo17972j(), interfaceC4298D.mo17954E(), interfaceC4298D.mo17980r(), m18037d)) {
                    return bVar3;
                }
            }
            if (abstractC3033v.isEmpty() && bVar != null) {
                if (m24798i(bVar, mo304m, interfaceC4298D.mo17972j(), interfaceC4298D.mo17954E(), interfaceC4298D.mo17980r(), m18037d)) {
                    return bVar;
                }
            }
            return null;
        }

        /* renamed from: i */
        public static boolean m24798i(InterfaceC0120F.b bVar, Object obj, boolean z6, int i7, int i8, int i9) {
            if (bVar.f367a.equals(obj)) {
                return (z6 && bVar.f368b == i7 && bVar.f369c == i8) || (!z6 && bVar.f368b == -1 && bVar.f371e == i9);
            }
            return false;
        }

        /* renamed from: b */
        public final void m24799b(AbstractC3035x.a aVar, InterfaceC0120F.b bVar, AbstractC4303I abstractC4303I) {
            if (bVar == null) {
                return;
            }
            if (abstractC4303I.mo302b(bVar.f367a) != -1) {
                aVar.m11086f(bVar, abstractC4303I);
                return;
            }
            AbstractC4303I abstractC4303I2 = (AbstractC4303I) this.f21246c.get(bVar);
            if (abstractC4303I2 != null) {
                aVar.m11086f(bVar, abstractC4303I2);
            }
        }

        /* renamed from: d */
        public InterfaceC0120F.b m24800d() {
            return this.f21247d;
        }

        /* renamed from: e */
        public InterfaceC0120F.b m24801e() {
            if (this.f21245b.isEmpty()) {
                return null;
            }
            return (InterfaceC0120F.b) AbstractC2987A.m10751d(this.f21245b);
        }

        /* renamed from: f */
        public AbstractC4303I m24802f(InterfaceC0120F.b bVar) {
            return (AbstractC4303I) this.f21246c.get(bVar);
        }

        /* renamed from: g */
        public InterfaceC0120F.b m24803g() {
            return this.f21248e;
        }

        /* renamed from: h */
        public InterfaceC0120F.b m24804h() {
            return this.f21249f;
        }

        /* renamed from: j */
        public void m24805j(InterfaceC4298D interfaceC4298D) {
            this.f21247d = m24797c(interfaceC4298D, this.f21245b, this.f21248e, this.f21244a);
        }

        /* renamed from: k */
        public void m24806k(List list, InterfaceC0120F.b bVar, InterfaceC4298D interfaceC4298D) {
            this.f21245b = AbstractC3033v.m11048p(list);
            if (!list.isEmpty()) {
                this.f21248e = (InterfaceC0120F.b) list.get(0);
                this.f21249f = (InterfaceC0120F.b) AbstractC5332a.m21800e(bVar);
            }
            if (this.f21247d == null) {
                this.f21247d = m24797c(interfaceC4298D, this.f21245b, this.f21248e, this.f21244a);
            }
            m24808m(interfaceC4298D.mo17961L());
        }

        /* renamed from: l */
        public void m24807l(InterfaceC4298D interfaceC4298D) {
            this.f21247d = m24797c(interfaceC4298D, this.f21245b, this.f21248e, this.f21244a);
            m24808m(interfaceC4298D.mo17961L());
        }

        /* renamed from: m */
        public final void m24808m(AbstractC4303I abstractC4303I) {
            AbstractC3035x.a m11069a = AbstractC3035x.m11069a();
            if (this.f21245b.isEmpty()) {
                m24799b(m11069a, this.f21248e, abstractC4303I);
                if (!AbstractC2928k.m10550a(this.f21249f, this.f21248e)) {
                    m24799b(m11069a, this.f21249f, abstractC4303I);
                }
                if (!AbstractC2928k.m10550a(this.f21247d, this.f21248e) && !AbstractC2928k.m10550a(this.f21247d, this.f21249f)) {
                    m24799b(m11069a, this.f21247d, abstractC4303I);
                }
            } else {
                for (int i7 = 0; i7 < this.f21245b.size(); i7++) {
                    m24799b(m11069a, (InterfaceC0120F.b) this.f21245b.get(i7), abstractC4303I);
                }
                if (!this.f21245b.contains(this.f21247d)) {
                    m24799b(m11069a, this.f21247d, abstractC4303I);
                }
            }
            this.f21246c = m11069a.m11083c();
        }
    }

    public C5893q0(InterfaceC5334c interfaceC5334c) {
        this.f21235a = (InterfaceC5334c) AbstractC5332a.m21800e(interfaceC5334c);
        this.f21240f = new C5345n(AbstractC5330M.m21715W(), interfaceC5334c, new C5345n.b() { // from class: o0.T
            @Override // p259j0.C5345n.b
            /* renamed from: a */
            public final void mo21856a(Object obj, C4326p c4326p) {
                C5893q0.m24682K1((InterfaceC5850c) obj, c4326p);
            }
        });
        AbstractC4303I.b bVar = new AbstractC4303I.b();
        this.f21236b = bVar;
        this.f21237c = new AbstractC4303I.c();
        this.f21238d = new a(bVar);
        this.f21239e = new SparseArray();
    }

    /* renamed from: C2 */
    public static /* synthetic */ void m24666C2(InterfaceC5850c.a aVar, int i7, InterfaceC4298D.e eVar, InterfaceC4298D.e eVar2, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24635u(aVar, i7);
        interfaceC5850c.mo24610g(aVar, eVar, eVar2, i7);
    }

    /* renamed from: L2 */
    public static /* synthetic */ void m24686L2(InterfaceC5850c.a aVar, String str, long j7, long j8, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24586N(aVar, str, j7);
        interfaceC5850c.mo24595W(aVar, str, j8, j7);
    }

    /* renamed from: O1 */
    public static /* synthetic */ void m24694O1(InterfaceC5850c.a aVar, String str, long j7, long j8, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24638x(aVar, str, j7);
        interfaceC5850c.mo24625o(aVar, str, j8, j7);
    }

    /* renamed from: R2 */
    public static /* synthetic */ void m24704R2(InterfaceC5850c.a aVar, C4310P c4310p, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24637w(aVar, c4310p);
        interfaceC5850c.mo24600a0(aVar, c4310p.f14972a, c4310p.f14973b, c4310p.f14974c, c4310p.f14975d);
    }

    /* renamed from: i2 */
    public static /* synthetic */ void m24740i2(InterfaceC5850c.a aVar, int i7, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24636v(aVar);
        interfaceC5850c.mo24604d(aVar, i7);
    }

    /* renamed from: m2 */
    public static /* synthetic */ void m24748m2(InterfaceC5850c.a aVar, boolean z6, InterfaceC5850c interfaceC5850c) {
        interfaceC5850c.mo24629q(aVar, z6);
        interfaceC5850c.mo24640z(aVar, z6);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: A */
    public final void mo14232A(final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 6, new C5345n.a() { // from class: o0.L
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24603c0(InterfaceC5850c.a.this, i7);
            }
        });
    }

    /* renamed from: C1 */
    public final InterfaceC5850c.a m24785C1() {
        return m24786D1(this.f21238d.m24800d());
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: D */
    public /* synthetic */ void mo623D(int i7, InterfaceC0120F.b bVar) {
        AbstractC6355o.m26631a(this, i7, bVar);
    }

    /* renamed from: D1 */
    public final InterfaceC5850c.a m24786D1(InterfaceC0120F.b bVar) {
        AbstractC5332a.m21800e(this.f21241g);
        AbstractC4303I m24802f = bVar == null ? null : this.f21238d.m24802f(bVar);
        if (bVar != null && m24802f != null) {
            return m24787E1(m24802f, m24802f.mo18028h(bVar.f367a, this.f21236b).f14811c, bVar);
        }
        int mo17955F = this.f21241g.mo17955F();
        AbstractC4303I mo17961L = this.f21241g.mo17961L();
        if (mo17955F >= mo17961L.mo308p()) {
            mo17961L = AbstractC4303I.f14800a;
        }
        return m24787E1(mo17961L, mo17955F, null);
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: E */
    public final void mo624E(int i7, InterfaceC0120F.b bVar) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1025, new C5345n.a() { // from class: o0.j
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24614i0(InterfaceC5850c.a.this);
            }
        });
    }

    /* renamed from: E1 */
    public final InterfaceC5850c.a m24787E1(AbstractC4303I abstractC4303I, int i7, InterfaceC0120F.b bVar) {
        InterfaceC0120F.b bVar2 = abstractC4303I.m18032q() ? null : bVar;
        long mo21613b = this.f21235a.mo21613b();
        boolean z6 = abstractC4303I.equals(this.f21241g.mo17961L()) && i7 == this.f21241g.mo17955F();
        long j7 = 0;
        if (bVar2 == null || !bVar2.m345b()) {
            if (z6) {
                j7 = this.f21241g.mo17986x();
            } else if (!abstractC4303I.m18032q()) {
                j7 = abstractC4303I.m18031n(i7, this.f21237c).m18055b();
            }
        } else if (z6 && this.f21241g.mo17954E() == bVar2.f368b && this.f21241g.mo17980r() == bVar2.f369c) {
            j7 = this.f21241g.mo17964O();
        }
        return new InterfaceC5850c.a(mo21613b, abstractC4303I, i7, bVar2, j7, this.f21241g.mo17961L(), this.f21241g.mo17955F(), this.f21238d.m24800d(), this.f21241g.mo17964O(), this.f21241g.mo17973k());
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: F */
    public final void mo14237F(final C4312b c4312b) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 20, new C5345n.a() { // from class: o0.F
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24620l0(InterfaceC5850c.a.this, c4312b);
            }
        });
    }

    /* renamed from: F1 */
    public final InterfaceC5850c.a m24788F1() {
        return m24786D1(this.f21238d.m24801e());
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: G */
    public final void mo14238G(final boolean z6) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 3, new C5345n.a() { // from class: o0.u
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24748m2(InterfaceC5850c.a.this, z6, (InterfaceC5850c) obj);
            }
        });
    }

    /* renamed from: G1 */
    public final InterfaceC5850c.a m24789G1(int i7, InterfaceC0120F.b bVar) {
        AbstractC5332a.m21800e(this.f21241g);
        if (bVar != null) {
            return this.f21238d.m24802f(bVar) != null ? m24786D1(bVar) : m24787E1(AbstractC4303I.f14800a, i7, bVar);
        }
        AbstractC4303I mo17961L = this.f21241g.mo17961L();
        if (i7 >= mo17961L.mo308p()) {
            mo17961L = AbstractC4303I.f14800a;
        }
        return m24787E1(mo17961L, i7, null);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: H */
    public final void mo14239H(final float f7) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 22, new C5345n.a() { // from class: o0.B
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24634t0(InterfaceC5850c.a.this, f7);
            }
        });
    }

    /* renamed from: H1 */
    public final InterfaceC5850c.a m24790H1() {
        return m24786D1(this.f21238d.m24803g());
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: I */
    public final void mo625I(int i7, InterfaceC0120F.b bVar) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1027, new C5345n.a() { // from class: o0.f
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24605d0(InterfaceC5850c.a.this);
            }
        });
    }

    /* renamed from: I1 */
    public final InterfaceC5850c.a m24791I1() {
        return m24786D1(this.f21238d.m24804h());
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: J */
    public final void mo14240J(final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 4, new C5345n.a() { // from class: o0.Y
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24580H(InterfaceC5850c.a.this, i7);
            }
        });
    }

    /* renamed from: J1 */
    public final InterfaceC5850c.a m24792J1(AbstractC4296B abstractC4296B) {
        InterfaceC0120F.b bVar;
        return (!(abstractC4296B instanceof C5759u) || (bVar = ((C5759u) abstractC4296B).f20970v) == null) ? m24785C1() : m24786D1(bVar);
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: K */
    public final void mo347K(int i7, InterfaceC0120F.b bVar, final C0116B c0116b) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1004, new C5345n.a() { // from class: o0.d
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24632s0(InterfaceC5850c.a.this, c0116b);
            }
        });
    }

    @Override // p050H0.InterfaceC0536e.a
    /* renamed from: L */
    public final void mo2050L(final int i7, final long j7, final long j8) {
        final InterfaceC5850c.a m24788F1 = m24788F1();
        m24795W2(m24788F1, 1006, new C5345n.a() { // from class: o0.g
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24613i(InterfaceC5850c.a.this, i7, j7, j8);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: M */
    public final void mo14241M(final AbstractC4296B abstractC4296B) {
        final InterfaceC5850c.a m24792J1 = m24792J1(abstractC4296B);
        m24795W2(m24792J1, 10, new C5345n.a() { // from class: o0.V
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24606e(InterfaceC5850c.a.this, abstractC4296B);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: N */
    public final void mo24487N() {
        if (this.f21243i) {
            return;
        }
        final InterfaceC5850c.a m24785C1 = m24785C1();
        this.f21243i = true;
        m24795W2(m24785C1, -1, new C5345n.a() { // from class: o0.b0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24597Y(InterfaceC5850c.a.this);
            }
        });
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: O */
    public final void mo626O(int i7, InterfaceC0120F.b bVar) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1023, new C5345n.a() { // from class: o0.m
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24589Q(InterfaceC5850c.a.this);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: P */
    public void mo14242P(final AbstractC4296B abstractC4296B) {
        final InterfaceC5850c.a m24792J1 = m24792J1(abstractC4296B);
        m24795W2(m24792J1, 10, new C5345n.a() { // from class: o0.O
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24615j(InterfaceC5850c.a.this, abstractC4296B);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: R */
    public final void mo14244R(AbstractC4303I abstractC4303I, final int i7) {
        this.f21238d.m24807l((InterfaceC4298D) AbstractC5332a.m21800e(this.f21241g));
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 0, new C5345n.a() { // from class: o0.y
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24630r(InterfaceC5850c.a.this, i7);
            }
        });
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: S */
    public final void mo348S(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1002, new C5345n.a() { // from class: o0.W
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24626o0(InterfaceC5850c.a.this, c0179y, c0116b);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: T */
    public void mo14245T(final int i7, final boolean z6) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 30, new C5345n.a() { // from class: o0.P
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24617k(InterfaceC5850c.a.this, i7, z6);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: U */
    public void mo24488U(InterfaceC5850c interfaceC5850c) {
        AbstractC5332a.m21800e(interfaceC5850c);
        this.f21240f.m21847c(interfaceC5850c);
    }

    /* renamed from: U2 */
    public final /* synthetic */ void m24793U2(InterfaceC4298D interfaceC4298D, InterfaceC5850c interfaceC5850c, C4326p c4326p) {
        interfaceC5850c.mo24596X(interfaceC4298D, new InterfaceC5850c.b(c4326p, this.f21239e));
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: V */
    public final void mo14246V(final boolean z6, final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, -1, new C5345n.a() { // from class: o0.E
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24573A(InterfaceC5850c.a.this, z6, i7);
            }
        });
    }

    /* renamed from: V2 */
    public final void m24794V2() {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 1028, new C5345n.a() { // from class: o0.o
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24594V(InterfaceC5850c.a.this);
            }
        });
        this.f21240f.m21853j();
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: W */
    public final void mo14247W(final C4331u c4331u, final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 1, new C5345n.a() { // from class: o0.A
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24598Z(InterfaceC5850c.a.this, c4331u, i7);
            }
        });
    }

    /* renamed from: W2 */
    public final void m24795W2(InterfaceC5850c.a aVar, int i7, C5345n.a aVar2) {
        this.f21239e.put(i7, aVar);
        this.f21240f.m21854k(i7, aVar2);
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: X */
    public final void mo14248X(final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 8, new C5345n.a() { // from class: o0.g0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24618k0(InterfaceC5850c.a.this, i7);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: Z */
    public void mo24489Z(final InterfaceC4298D interfaceC4298D, Looper looper) {
        AbstractC5332a.m21802g(this.f21241g == null || this.f21238d.f21245b.isEmpty());
        this.f21241g = (InterfaceC4298D) AbstractC5332a.m21800e(interfaceC4298D);
        this.f21242h = this.f21235a.mo21616e(looper, null);
        this.f21240f = this.f21240f.m21849e(looper, new C5345n.b() { // from class: o0.D
            @Override // p259j0.C5345n.b
            /* renamed from: a */
            public final void mo21856a(Object obj, C4326p c4326p) {
                C5893q0.this.m24793U2(interfaceC4298D, (InterfaceC5850c) obj, c4326p);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: a */
    public final void mo14250a(final C4310P c4310p) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 25, new C5345n.a() { // from class: o0.o0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24704R2(InterfaceC5850c.a.this, c4310p, (InterfaceC5850c) obj);
            }
        });
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: a0 */
    public final void mo628a0(int i7, InterfaceC0120F.b bVar, final Exception exc) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1024, new C5345n.a() { // from class: o0.m0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24601b(InterfaceC5850c.a.this, exc);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: b */
    public void mo24490b(final InterfaceC6097z.a aVar) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1031, new C5345n.a() { // from class: o0.i
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24577E(InterfaceC5850c.a.this, aVar);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: b0 */
    public final void mo14251b0(final boolean z6, final int i7) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 5, new C5345n.a() { // from class: o0.Q
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24591S(InterfaceC5850c.a.this, z6, i7);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: c */
    public final void mo14252c(final boolean z6) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 23, new C5345n.a() { // from class: o0.h
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24575C(InterfaceC5850c.a.this, z6);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: c0 */
    public void mo14253c0(final C4306L c4306l) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 2, new C5345n.a() { // from class: o0.p
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24585M(InterfaceC5850c.a.this, c4306l);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: d */
    public final void mo24491d(final Exception exc) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1014, new C5345n.a() { // from class: o0.k0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24624n0(InterfaceC5850c.a.this, exc);
            }
        });
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: d0 */
    public final void mo349d0(int i7, InterfaceC0120F.b bVar, final C0116B c0116b) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1005, new C5345n.a() { // from class: o0.e
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24578F(InterfaceC5850c.a.this, c0116b);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: e */
    public void mo24492e(final InterfaceC6097z.a aVar) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1032, new C5345n.a() { // from class: o0.k
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24633t(InterfaceC5850c.a.this, aVar);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: e0 */
    public void mo14254e0(final C4333w c4333w) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 14, new C5345n.a() { // from class: o0.s
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24587O(InterfaceC5850c.a.this, c4333w);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: f */
    public final void mo24493f(final String str) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1019, new C5345n.a() { // from class: o0.M
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24612h0(InterfaceC5850c.a.this, str);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: f0 */
    public void mo14255f0(final InterfaceC4298D.b bVar) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 13, new C5345n.a() { // from class: o0.x
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24602c(InterfaceC5850c.a.this, bVar);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: g */
    public final void mo24494g(final C5747o c5747o) {
        final InterfaceC5850c.a m24790H1 = m24790H1();
        m24795W2(m24790H1, 1020, new C5345n.a() { // from class: o0.q
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24609f0(InterfaceC5850c.a.this, c5747o);
            }
        });
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: g0 */
    public final void mo630g0(int i7, InterfaceC0120F.b bVar, final int i8) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1022, new C5345n.a() { // from class: o0.h0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24740i2(InterfaceC5850c.a.this, i8, (InterfaceC5850c) obj);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: h */
    public final void mo24495h(final String str, final long j7, final long j8) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1016, new C5345n.a() { // from class: o0.j0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24686L2(InterfaceC5850c.a.this, str, j8, j7, (InterfaceC5850c) obj);
            }
        });
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: h0 */
    public final void mo350h0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1001, new C5345n.a() { // from class: o0.n0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24584L(InterfaceC5850c.a.this, c0179y, c0116b);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: i */
    public final void mo24496i(final C5747o c5747o) {
        final InterfaceC5850c.a m24790H1 = m24790H1();
        m24795W2(m24790H1, 1013, new C5345n.a() { // from class: o0.X
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24622m0(InterfaceC5850c.a.this, c5747o);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: i0 */
    public final void mo24497i0(List list, InterfaceC0120F.b bVar) {
        this.f21238d.m24806k(list, bVar, (InterfaceC4298D) AbstractC5332a.m21800e(this.f21241g));
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: j */
    public final void mo24498j(final C5747o c5747o) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1007, new C5345n.a() { // from class: o0.t
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24574B(InterfaceC5850c.a.this, c5747o);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: j0 */
    public void mo14256j0(final C4322l c4322l) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 29, new C5345n.a() { // from class: o0.Z
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24590R(InterfaceC5850c.a.this, c4322l);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: k */
    public final void mo24499k(final String str) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1012, new C5345n.a() { // from class: o0.v
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24588P(InterfaceC5850c.a.this, str);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: k0 */
    public final void mo14257k0(final int i7, final int i8) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 24, new C5345n.a() { // from class: o0.l0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24631r0(InterfaceC5850c.a.this, i7, i8);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: l */
    public final void mo24500l(final String str, final long j7, final long j8) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1008, new C5345n.a() { // from class: o0.J
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24694O1(InterfaceC5850c.a.this, str, j8, j7, (InterfaceC5850c) obj);
            }
        });
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: l0 */
    public final void mo351l0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, PipesIterator.DEFAULT_QUEUE_SIZE, new C5345n.a() { // from class: o0.w
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24608f(InterfaceC5850c.a.this, c0179y, c0116b);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: m */
    public final void mo24501m(final int i7, final long j7) {
        final InterfaceC5850c.a m24790H1 = m24790H1();
        m24795W2(m24790H1, 1018, new C5345n.a() { // from class: o0.N
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24593U(InterfaceC5850c.a.this, i7, j7);
            }
        });
    }

    @Override // p335s0.InterfaceC6362v
    /* renamed from: m0 */
    public final void mo631m0(int i7, InterfaceC0120F.b bVar) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1026, new C5345n.a() { // from class: o0.l
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24576D(InterfaceC5850c.a.this);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: n */
    public final void mo24502n(final C5747o c5747o) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1015, new C5345n.a() { // from class: o0.e0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24619l(InterfaceC5850c.a.this, c5747o);
            }
        });
    }

    @Override // p022D0.InterfaceC0127M
    /* renamed from: n0 */
    public final void mo352n0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b, final IOException iOException, final boolean z6) {
        final InterfaceC5850c.a m24789G1 = m24789G1(i7, bVar);
        m24795W2(m24789G1, 1003, new C5345n.a() { // from class: o0.K
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24582J(InterfaceC5850c.a.this, c0179y, c0116b, iOException, z6);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: o */
    public final void mo14258o(final C4334x c4334x) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 28, new C5345n.a() { // from class: o0.G
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24621m(InterfaceC5850c.a.this, c4334x);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: o0 */
    public final void mo14259o0(final InterfaceC4298D.e eVar, final InterfaceC4298D.e eVar2, final int i7) {
        if (i7 == 1) {
            this.f21243i = false;
        }
        this.f21238d.m24805j((InterfaceC4298D) AbstractC5332a.m21800e(this.f21241g));
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 11, new C5345n.a() { // from class: o0.d0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                C5893q0.m24666C2(InterfaceC5850c.a.this, i7, eVar, eVar2, (InterfaceC5850c) obj);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: p */
    public final void mo14260p(final C4297C c4297c) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 12, new C5345n.a() { // from class: o0.n
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24627p(InterfaceC5850c.a.this, c4297c);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: p0 */
    public void mo14261p0(final boolean z6) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 7, new C5345n.a() { // from class: o0.I
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24592T(InterfaceC5850c.a.this, z6);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: q */
    public final void mo24503q(final C4327q c4327q, final C5749p c5749p) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1009, new C5345n.a() { // from class: o0.c0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24616j0(InterfaceC5850c.a.this, c4327q, c5749p);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: r */
    public final void mo24504r(final Object obj, final long j7) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 26, new C5345n.a() { // from class: o0.p0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj2) {
                ((InterfaceC5850c) obj2).mo24607e0(InterfaceC5850c.a.this, obj, j7);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    public void release() {
        ((InterfaceC5342k) AbstractC5332a.m21804i(this.f21242h)).mo21622b(new Runnable() { // from class: o0.f0
            @Override // java.lang.Runnable
            public final void run() {
                C5893q0.this.m24794V2();
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: s */
    public final void mo24505s(final C4327q c4327q, final C5749p c5749p) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1017, new C5345n.a() { // from class: o0.a0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24583K(InterfaceC5850c.a.this, c4327q, c5749p);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: t */
    public void mo14262t(final List list) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 27, new C5345n.a() { // from class: o0.S
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24639y(InterfaceC5850c.a.this, list);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: u */
    public final void mo24506u(final long j7) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1010, new C5345n.a() { // from class: o0.H
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24628p0(InterfaceC5850c.a.this, j7);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: v */
    public final void mo24507v(final Exception exc) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1029, new C5345n.a() { // from class: o0.i0
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24579G(InterfaceC5850c.a.this, exc);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: w */
    public final void mo24508w(final Exception exc) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1030, new C5345n.a() { // from class: o0.C
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24581I(InterfaceC5850c.a.this, exc);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: x */
    public final void mo24509x(final int i7, final long j7, final long j8) {
        final InterfaceC5850c.a m24791I1 = m24791I1();
        m24795W2(m24791I1, 1011, new C5345n.a() { // from class: o0.z
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24611h(InterfaceC5850c.a.this, i7, j7, j8);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: y */
    public void mo14263y(final C4504b c4504b) {
        final InterfaceC5850c.a m24785C1 = m24785C1();
        m24795W2(m24785C1, 27, new C5345n.a() { // from class: o0.r
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24623n(InterfaceC5850c.a.this, c4504b);
            }
        });
    }

    @Override // p300o0.InterfaceC5844a
    /* renamed from: z */
    public final void mo24510z(final long j7, final int i7) {
        final InterfaceC5850c.a m24790H1 = m24790H1();
        m24795W2(m24790H1, 1021, new C5345n.a() { // from class: o0.U
            @Override // p259j0.C5345n.a
            public final void invoke(Object obj) {
                ((InterfaceC5850c) obj).mo24599a(InterfaceC5850c.a.this, j7, i7);
            }
        });
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: Y */
    public void mo14249Y() {
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: B */
    public void mo14233B(boolean z6) {
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: C */
    public void mo14234C(int i7) {
    }

    /* renamed from: K1 */
    public static /* synthetic */ void m24682K1(InterfaceC5850c interfaceC5850c, C4326p c4326p) {
    }

    @Override // p232g0.InterfaceC4298D.d
    /* renamed from: Q */
    public void mo14243Q(InterfaceC4298D interfaceC4298D, InterfaceC4298D.c cVar) {
    }
}
