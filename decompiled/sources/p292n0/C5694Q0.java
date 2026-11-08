package p292n0;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p022D0.C0115A;
import p022D0.C0116B;
import p022D0.C0179y;
import p022D0.C0180z;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0149e0;
import p050H0.InterfaceC0533b;
import p232g0.AbstractC4303I;
import p232g0.C4331u;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.InterfaceC5342k;
import p276l0.InterfaceC5511y;
import p292n0.C5694Q0;
import p300o0.C5912w1;
import p300o0.InterfaceC5844a;
import p335s0.AbstractC6355o;
import p335s0.InterfaceC6362v;

/* renamed from: n0.Q0 */
/* loaded from: classes.dex */
public final class C5694Q0 {

    /* renamed from: a */
    public final C5912w1 f20564a;

    /* renamed from: e */
    public final d f20568e;

    /* renamed from: h */
    public final InterfaceC5844a f20571h;

    /* renamed from: i */
    public final InterfaceC5342k f20572i;

    /* renamed from: k */
    public boolean f20574k;

    /* renamed from: l */
    public InterfaceC5511y f20575l;

    /* renamed from: j */
    public InterfaceC0149e0 f20573j = new InterfaceC0149e0.a(0);

    /* renamed from: c */
    public final IdentityHashMap f20566c = new IdentityHashMap();

    /* renamed from: d */
    public final Map f20567d = new HashMap();

    /* renamed from: b */
    public final List f20565b = new ArrayList();

    /* renamed from: f */
    public final HashMap f20569f = new HashMap();

    /* renamed from: g */
    public final Set f20570g = new HashSet();

    /* renamed from: n0.Q0$a */
    public final class a implements InterfaceC0127M, InterfaceC6362v {

        /* renamed from: a */
        public final c f20576a;

        public a(c cVar) {
            this.f20576a = cVar;
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: D */
        public /* synthetic */ void mo623D(int i7, InterfaceC0120F.b bVar) {
            AbstractC6355o.m26631a(this, i7, bVar);
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: E */
        public void mo624E(int i7, InterfaceC0120F.b bVar) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.P0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23844Q(m23840J);
                    }
                });
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: I */
        public void mo625I(int i7, InterfaceC0120F.b bVar) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.L0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23847V(m23840J);
                    }
                });
            }
        }

        /* renamed from: J */
        public final Pair m23840J(int i7, InterfaceC0120F.b bVar) {
            InterfaceC0120F.b bVar2 = null;
            if (bVar != null) {
                InterfaceC0120F.b m23803n = C5694Q0.m23803n(this.f20576a, bVar);
                if (m23803n == null) {
                    return null;
                }
                bVar2 = m23803n;
            }
            return Pair.create(Integer.valueOf(C5694Q0.m23806s(this.f20576a, i7)), bVar2);
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: K */
        public void mo347K(int i7, InterfaceC0120F.b bVar, final C0116B c0116b) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.K0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23841L(m23840J, c0116b);
                    }
                });
            }
        }

        /* renamed from: L */
        public final /* synthetic */ void m23841L(Pair pair, C0116B c0116b) {
            C5694Q0.this.f20571h.mo347K(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, c0116b);
        }

        /* renamed from: M */
        public final /* synthetic */ void m23842M(Pair pair) {
            C5694Q0.this.f20571h.mo626O(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second);
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: O */
        public void mo626O(int i7, InterfaceC0120F.b bVar) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.G0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23842M(m23840J);
                    }
                });
            }
        }

        /* renamed from: P */
        public final /* synthetic */ void m23843P(Pair pair) {
            C5694Q0.this.f20571h.mo631m0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second);
        }

        /* renamed from: Q */
        public final /* synthetic */ void m23844Q(Pair pair) {
            C5694Q0.this.f20571h.mo624E(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second);
        }

        /* renamed from: R */
        public final /* synthetic */ void m23845R(Pair pair, int i7) {
            C5694Q0.this.f20571h.mo630g0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, i7);
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: S */
        public void mo348S(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.H0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23848W(m23840J, c0179y, c0116b);
                    }
                });
            }
        }

        /* renamed from: T */
        public final /* synthetic */ void m23846T(Pair pair, Exception exc) {
            C5694Q0.this.f20571h.mo628a0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, exc);
        }

        /* renamed from: V */
        public final /* synthetic */ void m23847V(Pair pair) {
            C5694Q0.this.f20571h.mo625I(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second);
        }

        /* renamed from: W */
        public final /* synthetic */ void m23848W(Pair pair, C0179y c0179y, C0116B c0116b) {
            C5694Q0.this.f20571h.mo348S(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, c0179y, c0116b);
        }

        /* renamed from: X */
        public final /* synthetic */ void m23849X(Pair pair, C0179y c0179y, C0116B c0116b) {
            C5694Q0.this.f20571h.mo350h0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, c0179y, c0116b);
        }

        /* renamed from: Y */
        public final /* synthetic */ void m23850Y(Pair pair, C0179y c0179y, C0116B c0116b, IOException iOException, boolean z6) {
            C5694Q0.this.f20571h.mo352n0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, c0179y, c0116b, iOException, z6);
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: a0 */
        public void mo628a0(int i7, InterfaceC0120F.b bVar, final Exception exc) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.I0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23846T(m23840J, exc);
                    }
                });
            }
        }

        /* renamed from: b0 */
        public final /* synthetic */ void m23851b0(Pair pair, C0179y c0179y, C0116B c0116b) {
            C5694Q0.this.f20571h.mo351l0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) pair.second, c0179y, c0116b);
        }

        /* renamed from: c0 */
        public final /* synthetic */ void m23852c0(Pair pair, C0116B c0116b) {
            C5694Q0.this.f20571h.mo349d0(((Integer) pair.first).intValue(), (InterfaceC0120F.b) AbstractC5332a.m21800e((InterfaceC0120F.b) pair.second), c0116b);
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: d0 */
        public void mo349d0(int i7, InterfaceC0120F.b bVar, final C0116B c0116b) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.E0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23852c0(m23840J, c0116b);
                    }
                });
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: g0 */
        public void mo630g0(int i7, InterfaceC0120F.b bVar, final int i8) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.N0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23845R(m23840J, i8);
                    }
                });
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: h0 */
        public void mo350h0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.M0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23849X(m23840J, c0179y, c0116b);
                    }
                });
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: l0 */
        public void mo351l0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.J0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23851b0(m23840J, c0179y, c0116b);
                    }
                });
            }
        }

        @Override // p335s0.InterfaceC6362v
        /* renamed from: m0 */
        public void mo631m0(int i7, InterfaceC0120F.b bVar) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.F0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23843P(m23840J);
                    }
                });
            }
        }

        @Override // p022D0.InterfaceC0127M
        /* renamed from: n0 */
        public void mo352n0(int i7, InterfaceC0120F.b bVar, final C0179y c0179y, final C0116B c0116b, final IOException iOException, final boolean z6) {
            final Pair m23840J = m23840J(i7, bVar);
            if (m23840J != null) {
                C5694Q0.this.f20572i.mo21622b(new Runnable() { // from class: n0.O0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5694Q0.a.this.m23850Y(m23840J, c0179y, c0116b, iOException, z6);
                    }
                });
            }
        }
    }

    /* renamed from: n0.Q0$b */
    public static final class b {

        /* renamed from: a */
        public final InterfaceC0120F f20578a;

        /* renamed from: b */
        public final InterfaceC0120F.c f20579b;

        /* renamed from: c */
        public final a f20580c;

        public b(InterfaceC0120F interfaceC0120F, InterfaceC0120F.c cVar, a aVar) {
            this.f20578a = interfaceC0120F;
            this.f20579b = cVar;
            this.f20580c = aVar;
        }
    }

    /* renamed from: n0.Q0$c */
    public static final class c implements InterfaceC5666C0 {

        /* renamed from: a */
        public final C0115A f20581a;

        /* renamed from: d */
        public int f20584d;

        /* renamed from: e */
        public boolean f20585e;

        /* renamed from: c */
        public final List f20583c = new ArrayList();

        /* renamed from: b */
        public final Object f20582b = new Object();

        public c(InterfaceC0120F interfaceC0120F, boolean z6) {
            this.f20581a = new C0115A(interfaceC0120F, z6);
        }

        @Override // p292n0.InterfaceC5666C0
        /* renamed from: a */
        public Object mo23794a() {
            return this.f20582b;
        }

        @Override // p292n0.InterfaceC5666C0
        /* renamed from: b */
        public AbstractC4303I mo23795b() {
            return this.f20581a.m293Z();
        }

        /* renamed from: c */
        public void m23853c(int i7) {
            this.f20584d = i7;
            this.f20585e = false;
            this.f20583c.clear();
        }
    }

    /* renamed from: n0.Q0$d */
    public interface d {
        /* renamed from: e */
        void mo23854e();
    }

    public C5694Q0(d dVar, InterfaceC5844a interfaceC5844a, InterfaceC5342k interfaceC5342k, C5912w1 c5912w1) {
        this.f20564a = c5912w1;
        this.f20568e = dVar;
        this.f20571h = interfaceC5844a;
        this.f20572i = interfaceC5342k;
    }

    /* renamed from: m */
    public static Object m23802m(Object obj) {
        return AbstractC5712a.m23933v(obj);
    }

    /* renamed from: n */
    public static InterfaceC0120F.b m23803n(c cVar, InterfaceC0120F.b bVar) {
        for (int i7 = 0; i7 < cVar.f20583c.size(); i7++) {
            if (((InterfaceC0120F.b) cVar.f20583c.get(i7)).f370d == bVar.f370d) {
                return bVar.m344a(m23805p(cVar, bVar.f367a));
            }
        }
        return null;
    }

    /* renamed from: o */
    public static Object m23804o(Object obj) {
        return AbstractC5712a.m23934w(obj);
    }

    /* renamed from: p */
    public static Object m23805p(c cVar, Object obj) {
        return AbstractC5712a.m23935y(cVar.f20582b, obj);
    }

    /* renamed from: s */
    public static int m23806s(c cVar, int i7) {
        return i7 + cVar.f20584d;
    }

    /* renamed from: A */
    public AbstractC4303I m23807A(int i7, int i8, InterfaceC0149e0 interfaceC0149e0) {
        AbstractC5332a.m21796a(i7 >= 0 && i7 <= i8 && i8 <= m23820r());
        this.f20573j = interfaceC0149e0;
        m23808B(i7, i8);
        return m23815i();
    }

    /* renamed from: B */
    public final void m23808B(int i7, int i8) {
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            c cVar = (c) this.f20565b.remove(i9);
            this.f20567d.remove(cVar.f20582b);
            m23813g(i9, -cVar.f20581a.m293Z().mo308p());
            cVar.f20585e = true;
            if (this.f20574k) {
                m23823v(cVar);
            }
        }
    }

    /* renamed from: C */
    public AbstractC4303I m23809C(List list, InterfaceC0149e0 interfaceC0149e0) {
        m23808B(0, this.f20565b.size());
        return m23812f(this.f20565b.size(), list, interfaceC0149e0);
    }

    /* renamed from: D */
    public AbstractC4303I m23810D(InterfaceC0149e0 interfaceC0149e0) {
        int m23820r = m23820r();
        if (interfaceC0149e0.mo598a() != m23820r) {
            interfaceC0149e0 = interfaceC0149e0.mo605h().mo603f(0, m23820r);
        }
        this.f20573j = interfaceC0149e0;
        return m23815i();
    }

    /* renamed from: E */
    public AbstractC4303I m23811E(int i7, int i8, List list) {
        AbstractC5332a.m21796a(i7 >= 0 && i7 <= i8 && i8 <= m23820r());
        AbstractC5332a.m21796a(list.size() == i8 - i7);
        for (int i9 = i7; i9 < i8; i9++) {
            ((c) this.f20565b.get(i9)).f20581a.mo294a((C4331u) list.get(i9 - i7));
        }
        return m23815i();
    }

    /* renamed from: f */
    public AbstractC4303I m23812f(int i7, List list, InterfaceC0149e0 interfaceC0149e0) {
        if (!list.isEmpty()) {
            this.f20573j = interfaceC0149e0;
            for (int i8 = i7; i8 < list.size() + i7; i8++) {
                c cVar = (c) list.get(i8 - i7);
                if (i8 > 0) {
                    c cVar2 = (c) this.f20565b.get(i8 - 1);
                    cVar.m23853c(cVar2.f20584d + cVar2.f20581a.m293Z().mo308p());
                } else {
                    cVar.m23853c(0);
                }
                m23813g(i8, cVar.f20581a.m293Z().mo308p());
                this.f20565b.add(i8, cVar);
                this.f20567d.put(cVar.f20582b, cVar);
                if (this.f20574k) {
                    m23825x(cVar);
                    if (this.f20566c.isEmpty()) {
                        this.f20570g.add(cVar);
                    } else {
                        m23816j(cVar);
                    }
                }
            }
        }
        return m23815i();
    }

    /* renamed from: g */
    public final void m23813g(int i7, int i8) {
        while (i7 < this.f20565b.size()) {
            ((c) this.f20565b.get(i7)).f20584d += i8;
            i7++;
        }
    }

    /* renamed from: h */
    public InterfaceC0117C m23814h(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        Object m23804o = m23804o(bVar.f367a);
        InterfaceC0120F.b m344a = bVar.m344a(m23802m(bVar.f367a));
        c cVar = (c) AbstractC5332a.m21800e((c) this.f20567d.get(m23804o));
        m23818l(cVar);
        cVar.f20583c.add(m344a);
        C0180z mo296e = cVar.f20581a.mo296e(m344a, interfaceC0533b, j7);
        this.f20566c.put(mo296e, cVar);
        m23817k();
        return mo296e;
    }

    /* renamed from: i */
    public AbstractC4303I m23815i() {
        if (this.f20565b.isEmpty()) {
            return AbstractC4303I.f14800a;
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f20565b.size(); i8++) {
            c cVar = (c) this.f20565b.get(i8);
            cVar.f20584d = i7;
            i7 += cVar.f20581a.m293Z().mo308p();
        }
        return new C5699T0(this.f20565b, this.f20573j);
    }

    /* renamed from: j */
    public final void m23816j(c cVar) {
        b bVar = (b) this.f20569f.get(cVar);
        if (bVar != null) {
            bVar.f20578a.mo335p(bVar.f20579b);
        }
    }

    /* renamed from: k */
    public final void m23817k() {
        Iterator it = this.f20570g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f20583c.isEmpty()) {
                m23816j(cVar);
                it.remove();
            }
        }
    }

    /* renamed from: l */
    public final void m23818l(c cVar) {
        this.f20570g.add(cVar);
        b bVar = (b) this.f20569f.get(cVar);
        if (bVar != null) {
            bVar.f20578a.mo332j(bVar.f20579b);
        }
    }

    /* renamed from: q */
    public InterfaceC0149e0 m23819q() {
        return this.f20573j;
    }

    /* renamed from: r */
    public int m23820r() {
        return this.f20565b.size();
    }

    /* renamed from: t */
    public boolean m23821t() {
        return this.f20574k;
    }

    /* renamed from: u */
    public final /* synthetic */ void m23822u(InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I) {
        this.f20568e.mo23854e();
    }

    /* renamed from: v */
    public final void m23823v(c cVar) {
        if (cVar.f20585e && cVar.f20583c.isEmpty()) {
            b bVar = (b) AbstractC5332a.m21800e((b) this.f20569f.remove(cVar));
            bVar.f20578a.mo337s(bVar.f20579b);
            bVar.f20578a.mo333l(bVar.f20580c);
            bVar.f20578a.mo338t(bVar.f20580c);
            this.f20570g.remove(cVar);
        }
    }

    /* renamed from: w */
    public void m23824w(InterfaceC5511y interfaceC5511y) {
        AbstractC5332a.m21802g(!this.f20574k);
        this.f20575l = interfaceC5511y;
        for (int i7 = 0; i7 < this.f20565b.size(); i7++) {
            c cVar = (c) this.f20565b.get(i7);
            m23825x(cVar);
            this.f20570g.add(cVar);
        }
        this.f20574k = true;
    }

    /* renamed from: x */
    public final void m23825x(c cVar) {
        C0115A c0115a = cVar.f20581a;
        InterfaceC0120F.c cVar2 = new InterfaceC0120F.c() { // from class: n0.D0
            @Override // p022D0.InterfaceC0120F.c
            /* renamed from: a */
            public final void mo346a(InterfaceC0120F interfaceC0120F, AbstractC4303I abstractC4303I) {
                C5694Q0.this.m23822u(interfaceC0120F, abstractC4303I);
            }
        };
        a aVar = new a(cVar);
        this.f20569f.put(cVar, new b(c0115a, cVar2, aVar));
        c0115a.mo328c(AbstractC5330M.m21675C(), aVar);
        c0115a.mo329d(AbstractC5330M.m21675C(), aVar);
        c0115a.mo330g(cVar2, this.f20575l, this.f20564a);
    }

    /* renamed from: y */
    public void m23826y() {
        for (b bVar : this.f20569f.values()) {
            try {
                bVar.f20578a.mo337s(bVar.f20579b);
            } catch (RuntimeException e7) {
                AbstractC5346o.m21863d("MediaSourceList", "Failed to release child source.", e7);
            }
            bVar.f20578a.mo333l(bVar.f20580c);
            bVar.f20578a.mo338t(bVar.f20580c);
        }
        this.f20569f.clear();
        this.f20570g.clear();
        this.f20574k = false;
    }

    /* renamed from: z */
    public void m23827z(InterfaceC0117C interfaceC0117C) {
        c cVar = (c) AbstractC5332a.m21800e((c) this.f20566c.remove(interfaceC0117C));
        cVar.f20581a.mo297f(interfaceC0117C);
        cVar.f20583c.remove(((C0180z) interfaceC0117C).f745a);
        if (!this.f20566c.isEmpty()) {
            m23817k();
        }
        m23823v(cVar);
    }
}
