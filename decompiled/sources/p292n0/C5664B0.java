package p292n0;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p178Z2.AbstractC3033v;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5332a;
import p259j0.InterfaceC5342k;
import p292n0.C5768y0;
import p292n0.InterfaceC5763w;
import p300o0.InterfaceC5844a;

/* renamed from: n0.B0 */
/* loaded from: classes.dex */
public final class C5664B0 {

    /* renamed from: c */
    public final InterfaceC5844a f20496c;

    /* renamed from: d */
    public final InterfaceC5342k f20497d;

    /* renamed from: e */
    public final C5768y0.a f20498e;

    /* renamed from: f */
    public long f20499f;

    /* renamed from: g */
    public int f20500g;

    /* renamed from: h */
    public boolean f20501h;

    /* renamed from: i */
    public C5768y0 f20502i;

    /* renamed from: j */
    public C5768y0 f20503j;

    /* renamed from: k */
    public C5768y0 f20504k;

    /* renamed from: l */
    public int f20505l;

    /* renamed from: m */
    public Object f20506m;

    /* renamed from: n */
    public long f20507n;

    /* renamed from: o */
    public InterfaceC5763w.c f20508o;

    /* renamed from: a */
    public final AbstractC4303I.b f20494a = new AbstractC4303I.b();

    /* renamed from: b */
    public final AbstractC4303I.c f20495b = new AbstractC4303I.c();

    /* renamed from: p */
    public List f20509p = new ArrayList();

    public C5664B0(InterfaceC5844a interfaceC5844a, InterfaceC5342k interfaceC5342k, C5768y0.a aVar, InterfaceC5763w.c cVar) {
        this.f20496c = interfaceC5844a;
        this.f20497d = interfaceC5342k;
        this.f20498e = aVar;
        this.f20508o = cVar;
    }

    /* renamed from: C */
    public static boolean m23748C(AbstractC4303I.b bVar) {
        int m18036c = bVar.m18036c();
        if (m18036c == 0) {
            return false;
        }
        if ((m18036c == 1 && bVar.m18050q(0)) || !bVar.m18051r(bVar.m18048o())) {
            return false;
        }
        long j7 = 0;
        if (bVar.m18038e(0L) != -1) {
            return false;
        }
        if (bVar.f14812d == 0) {
            return true;
        }
        int i7 = m18036c - (bVar.m18050q(m18036c + (-1)) ? 2 : 1);
        for (int i8 = 0; i8 <= i7; i8++) {
            j7 += bVar.m18042i(i8);
        }
        return bVar.f14812d <= j7;
    }

    /* renamed from: K */
    public static InterfaceC0120F.b m23749K(AbstractC4303I abstractC4303I, Object obj, long j7, long j8, AbstractC4303I.c cVar, AbstractC4303I.b bVar) {
        abstractC4303I.mo18028h(obj, bVar);
        abstractC4303I.m18031n(bVar.f14811c, cVar);
        Object obj2 = obj;
        for (int mo302b = abstractC4303I.mo302b(obj); m23748C(bVar) && mo302b <= cVar.f14846o; mo302b++) {
            abstractC4303I.mo303g(mo302b, bVar, true);
            obj2 = AbstractC5332a.m21800e(bVar.f14810b);
        }
        abstractC4303I.mo18028h(obj2, bVar);
        int m18038e = bVar.m18038e(j7);
        return m18038e == -1 ? new InterfaceC0120F.b(obj2, j8, bVar.m18037d(j7)) : new InterfaceC0120F.b(obj2, m18038e, bVar.m18044k(m18038e), j8);
    }

    /* renamed from: d */
    public static boolean m23751d(long j7, long j8) {
        return j7 == -9223372036854775807L || j7 == j8;
    }

    /* renamed from: A */
    public final boolean m23752A(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar) {
        if (m23792y(bVar)) {
            return abstractC4303I.m18031n(abstractC4303I.mo18028h(bVar.f367a, this.f20494a).f14811c, this.f20495b).f14846o == abstractC4303I.mo302b(bVar.f367a);
        }
        return false;
    }

    /* renamed from: B */
    public boolean m23753B(InterfaceC0117C interfaceC0117C) {
        C5768y0 c5768y0 = this.f20504k;
        return c5768y0 != null && c5768y0.f21025a == interfaceC0117C;
    }

    /* renamed from: D */
    public final /* synthetic */ void m23754D(AbstractC3033v.a aVar, InterfaceC0120F.b bVar) {
        this.f20496c.mo24497i0(aVar.m11063k(), bVar);
    }

    /* renamed from: E */
    public final void m23755E() {
        final AbstractC3033v.a m11045m = AbstractC3033v.m11045m();
        for (C5768y0 c5768y0 = this.f20502i; c5768y0 != null; c5768y0 = c5768y0.m24400k()) {
            m11045m.mo11040a(c5768y0.f21030f.f21041a);
        }
        C5768y0 c5768y02 = this.f20503j;
        final InterfaceC0120F.b bVar = c5768y02 == null ? null : c5768y02.f21030f.f21041a;
        this.f20497d.mo21622b(new Runnable() { // from class: n0.A0
            @Override // java.lang.Runnable
            public final void run() {
                C5664B0.this.m23754D(m11045m, bVar);
            }
        });
    }

    /* renamed from: F */
    public void m23756F(long j7) {
        C5768y0 c5768y0 = this.f20504k;
        if (c5768y0 != null) {
            c5768y0.m24410u(j7);
        }
    }

    /* renamed from: G */
    public final void m23757G(List list) {
        for (int i7 = 0; i7 < this.f20509p.size(); i7++) {
            ((C5768y0) this.f20509p.get(i7)).m24411v();
        }
        this.f20509p = list;
    }

    /* renamed from: H */
    public void m23758H() {
        if (this.f20509p.isEmpty()) {
            return;
        }
        m23757G(new ArrayList());
    }

    /* renamed from: I */
    public boolean m23759I(C5768y0 c5768y0) {
        AbstractC5332a.m21804i(c5768y0);
        boolean z6 = false;
        if (c5768y0.equals(this.f20504k)) {
            return false;
        }
        this.f20504k = c5768y0;
        while (c5768y0.m24400k() != null) {
            c5768y0 = (C5768y0) AbstractC5332a.m21800e(c5768y0.m24400k());
            if (c5768y0 == this.f20503j) {
                this.f20503j = this.f20502i;
                z6 = true;
            }
            c5768y0.m24411v();
            this.f20505l--;
        }
        ((C5768y0) AbstractC5332a.m21800e(this.f20504k)).m24413y(null);
        m23755E();
        return z6;
    }

    /* renamed from: J */
    public final C5768y0 m23760J(C5770z0 c5770z0) {
        for (int i7 = 0; i7 < this.f20509p.size(); i7++) {
            if (((C5768y0) this.f20509p.get(i7)).m24394d(c5770z0)) {
                return (C5768y0) this.f20509p.remove(i7);
            }
        }
        return null;
    }

    /* renamed from: L */
    public InterfaceC0120F.b m23761L(AbstractC4303I abstractC4303I, Object obj, long j7) {
        long m23762M = m23762M(abstractC4303I, obj);
        abstractC4303I.mo18028h(obj, this.f20494a);
        abstractC4303I.m18031n(this.f20494a.f14811c, this.f20495b);
        boolean z6 = false;
        for (int mo302b = abstractC4303I.mo302b(obj); mo302b >= this.f20495b.f14845n; mo302b--) {
            abstractC4303I.mo303g(mo302b, this.f20494a, true);
            boolean z7 = this.f20494a.m18036c() > 0;
            z6 |= z7;
            AbstractC4303I.b bVar = this.f20494a;
            if (bVar.m18038e(bVar.f14812d) != -1) {
                obj = AbstractC5332a.m21800e(this.f20494a.f14810b);
            }
            if (z6 && (!z7 || this.f20494a.f14812d != 0)) {
                break;
            }
        }
        return m23749K(abstractC4303I, obj, j7, m23762M, this.f20495b, this.f20494a);
    }

    /* renamed from: M */
    public final long m23762M(AbstractC4303I abstractC4303I, Object obj) {
        int mo302b;
        int i7 = abstractC4303I.mo18028h(obj, this.f20494a).f14811c;
        Object obj2 = this.f20506m;
        if (obj2 != null && (mo302b = abstractC4303I.mo302b(obj2)) != -1 && abstractC4303I.m18027f(mo302b, this.f20494a).f14811c == i7) {
            return this.f20507n;
        }
        for (C5768y0 c5768y0 = this.f20502i; c5768y0 != null; c5768y0 = c5768y0.m24400k()) {
            if (c5768y0.f21026b.equals(obj)) {
                return c5768y0.f21030f.f21041a.f370d;
            }
        }
        for (C5768y0 c5768y02 = this.f20502i; c5768y02 != null; c5768y02 = c5768y02.m24400k()) {
            int mo302b2 = abstractC4303I.mo302b(c5768y02.f21026b);
            if (mo302b2 != -1 && abstractC4303I.m18027f(mo302b2, this.f20494a).f14811c == i7) {
                return c5768y02.f21030f.f21041a.f370d;
            }
        }
        long m23763N = m23763N(obj);
        if (m23763N != -1) {
            return m23763N;
        }
        long j7 = this.f20499f;
        this.f20499f = 1 + j7;
        if (this.f20502i == null) {
            this.f20506m = obj;
            this.f20507n = j7;
        }
        return j7;
    }

    /* renamed from: N */
    public final long m23763N(Object obj) {
        for (int i7 = 0; i7 < this.f20509p.size(); i7++) {
            C5768y0 c5768y0 = (C5768y0) this.f20509p.get(i7);
            if (c5768y0.f21026b.equals(obj)) {
                return c5768y0.f21030f.f21041a.f370d;
            }
        }
        return -1L;
    }

    /* renamed from: O */
    public boolean m23764O() {
        C5768y0 c5768y0 = this.f20504k;
        return c5768y0 == null || (!c5768y0.f21030f.f21049i && c5768y0.m24408s() && this.f20504k.f21030f.f21045e != -9223372036854775807L && this.f20505l < 100);
    }

    /* renamed from: P */
    public final boolean m23765P(AbstractC4303I abstractC4303I) {
        C5768y0 c5768y0 = this.f20502i;
        if (c5768y0 == null) {
            return true;
        }
        int mo302b = abstractC4303I.mo302b(c5768y0.f21026b);
        while (true) {
            mo302b = abstractC4303I.m18026d(mo302b, this.f20494a, this.f20495b, this.f20500g, this.f20501h);
            while (((C5768y0) AbstractC5332a.m21800e(c5768y0)).m24400k() != null && !c5768y0.f21030f.f21047g) {
                c5768y0 = c5768y0.m24400k();
            }
            C5768y0 m24400k = c5768y0.m24400k();
            if (mo302b == -1 || m24400k == null || abstractC4303I.mo302b(m24400k.f21026b) != mo302b) {
                break;
            }
            c5768y0 = m24400k;
        }
        boolean m23759I = m23759I(c5768y0);
        c5768y0.f21030f = m23789v(abstractC4303I, c5768y0.f21030f);
        return !m23759I;
    }

    /* renamed from: Q */
    public void m23766Q(AbstractC4303I abstractC4303I, InterfaceC5763w.c cVar) {
        this.f20508o = cVar;
        m23791x(abstractC4303I);
    }

    /* renamed from: R */
    public boolean m23767R(AbstractC4303I abstractC4303I, long j7, long j8) {
        C5770z0 c5770z0;
        C5768y0 c5768y0 = this.f20502i;
        C5768y0 c5768y02 = null;
        while (c5768y0 != null) {
            C5770z0 c5770z02 = c5768y0.f21030f;
            if (c5768y02 == null) {
                c5770z0 = m23789v(abstractC4303I, c5770z02);
            } else {
                C5770z0 m23778k = m23778k(abstractC4303I, c5768y02, j7);
                if (m23778k == null) {
                    return !m23759I(c5768y02);
                }
                if (!m23772e(c5770z02, m23778k)) {
                    return !m23759I(c5768y02);
                }
                c5770z0 = m23778k;
            }
            c5768y0.f21030f = c5770z0.m24415a(c5770z02.f21043c);
            if (!m23751d(c5770z02.f21045e, c5770z0.f21045e)) {
                c5768y0.m24390C();
                long j9 = c5770z0.f21045e;
                return (m23759I(c5768y0) || (c5768y0 == this.f20503j && !c5768y0.f21030f.f21046f && ((j8 > Long.MIN_VALUE ? 1 : (j8 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j8 > ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5768y0.m24389B(j9)) ? 1 : (j8 == ((j9 > (-9223372036854775807L) ? 1 : (j9 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c5768y0.m24389B(j9)) ? 0 : -1)) >= 0))) ? false : true;
            }
            c5768y02 = c5768y0;
            c5768y0 = c5768y0.m24400k();
        }
        return true;
    }

    /* renamed from: S */
    public boolean m23768S(AbstractC4303I abstractC4303I, int i7) {
        this.f20500g = i7;
        return m23765P(abstractC4303I);
    }

    /* renamed from: T */
    public boolean m23769T(AbstractC4303I abstractC4303I, boolean z6) {
        this.f20501h = z6;
        return m23765P(abstractC4303I);
    }

    /* renamed from: b */
    public C5768y0 m23770b() {
        C5768y0 c5768y0 = this.f20502i;
        if (c5768y0 == null) {
            return null;
        }
        if (c5768y0 == this.f20503j) {
            this.f20503j = c5768y0.m24400k();
        }
        this.f20502i.m24411v();
        int i7 = this.f20505l - 1;
        this.f20505l = i7;
        if (i7 == 0) {
            this.f20504k = null;
            C5768y0 c5768y02 = this.f20502i;
            this.f20506m = c5768y02.f21026b;
            this.f20507n = c5768y02.f21030f.f21041a.f370d;
        }
        this.f20502i = this.f20502i.m24400k();
        m23755E();
        return this.f20502i;
    }

    /* renamed from: c */
    public C5768y0 m23771c() {
        this.f20503j = ((C5768y0) AbstractC5332a.m21804i(this.f20503j)).m24400k();
        m23755E();
        return (C5768y0) AbstractC5332a.m21804i(this.f20503j);
    }

    /* renamed from: e */
    public final boolean m23772e(C5770z0 c5770z0, C5770z0 c5770z02) {
        return c5770z0.f21042b == c5770z02.f21042b && c5770z0.f21041a.equals(c5770z02.f21041a);
    }

    /* renamed from: f */
    public void m23773f() {
        if (this.f20505l == 0) {
            return;
        }
        C5768y0 c5768y0 = (C5768y0) AbstractC5332a.m21804i(this.f20502i);
        this.f20506m = c5768y0.f21026b;
        this.f20507n = c5768y0.f21030f.f21041a.f370d;
        while (c5768y0 != null) {
            c5768y0.m24411v();
            c5768y0 = c5768y0.m24400k();
        }
        this.f20502i = null;
        this.f20504k = null;
        this.f20503j = null;
        this.f20505l = 0;
        m23755E();
    }

    /* renamed from: g */
    public C5768y0 m23774g(C5770z0 c5770z0) {
        C5768y0 c5768y0 = this.f20504k;
        long m24402m = c5768y0 == null ? 1000000000000L : (c5768y0.m24402m() + this.f20504k.f21030f.f21045e) - c5770z0.f21042b;
        C5768y0 m23760J = m23760J(c5770z0);
        if (m23760J == null) {
            m23760J = this.f20498e.mo24178a(c5770z0, m24402m);
        } else {
            m23760J.f21030f = c5770z0;
            m23760J.m24414z(m24402m);
        }
        C5768y0 c5768y02 = this.f20504k;
        if (c5768y02 != null) {
            c5768y02.m24413y(m23760J);
        } else {
            this.f20502i = m23760J;
            this.f20503j = m23760J;
        }
        this.f20506m = null;
        this.f20504k = m23760J;
        this.f20505l++;
        m23755E();
        return m23760J;
    }

    /* renamed from: h */
    public final Pair m23775h(AbstractC4303I abstractC4303I, Object obj, long j7) {
        int mo709e = abstractC4303I.mo709e(abstractC4303I.mo18028h(obj, this.f20494a).f14811c, this.f20500g, this.f20501h);
        if (mo709e != -1) {
            return abstractC4303I.m18030k(this.f20495b, this.f20494a, mo709e, -9223372036854775807L, j7);
        }
        return null;
    }

    /* renamed from: i */
    public final C5770z0 m23776i(C5695R0 c5695r0) {
        return m23781n(c5695r0.f20587a, c5695r0.f20588b, c5695r0.f20589c, c5695r0.f20605s);
    }

    /* renamed from: j */
    public final C5770z0 m23777j(AbstractC4303I abstractC4303I, C5768y0 c5768y0, long j7) {
        C5770z0 c5770z0;
        long j8;
        long j9;
        Object obj;
        long j10;
        long j11;
        long m23763N;
        C5770z0 c5770z02 = c5768y0.f21030f;
        int m18026d = abstractC4303I.m18026d(abstractC4303I.mo302b(c5770z02.f21041a.f367a), this.f20494a, this.f20495b, this.f20500g, this.f20501h);
        if (m18026d == -1) {
            return null;
        }
        int i7 = abstractC4303I.mo303g(m18026d, this.f20494a, true).f14811c;
        Object m21800e = AbstractC5332a.m21800e(this.f20494a.f14810b);
        long j12 = c5770z02.f21041a.f370d;
        if (abstractC4303I.m18031n(i7, this.f20495b).f14845n == m18026d) {
            c5770z0 = c5770z02;
            Pair m18030k = abstractC4303I.m18030k(this.f20495b, this.f20494a, i7, -9223372036854775807L, Math.max(0L, j7));
            if (m18030k == null) {
                return null;
            }
            Object obj2 = m18030k.first;
            long longValue = ((Long) m18030k.second).longValue();
            C5768y0 m24400k = c5768y0.m24400k();
            if (m24400k == null || !m24400k.f21026b.equals(obj2)) {
                m23763N = m23763N(obj2);
                if (m23763N == -1) {
                    m23763N = this.f20499f;
                    this.f20499f = 1 + m23763N;
                }
            } else {
                m23763N = m24400k.f21030f.f21041a.f370d;
            }
            j8 = m23763N;
            j9 = -9223372036854775807L;
            obj = obj2;
            j10 = longValue;
        } else {
            c5770z0 = c5770z02;
            j8 = j12;
            j9 = 0;
            obj = m21800e;
            j10 = 0;
        }
        InterfaceC0120F.b m23749K = m23749K(abstractC4303I, obj, j10, j8, this.f20495b, this.f20494a);
        if (j9 != -9223372036854775807L && c5770z0.f21043c != -9223372036854775807L) {
            boolean m23790w = m23790w(c5770z0.f21041a.f367a, abstractC4303I);
            if (m23749K.m345b() && m23790w) {
                j9 = c5770z0.f21043c;
            } else if (m23790w) {
                j11 = c5770z0.f21043c;
                return m23781n(abstractC4303I, m23749K, j9, j11);
            }
        }
        j11 = j10;
        return m23781n(abstractC4303I, m23749K, j9, j11);
    }

    /* renamed from: k */
    public final C5770z0 m23778k(AbstractC4303I abstractC4303I, C5768y0 c5768y0, long j7) {
        C5770z0 c5770z0 = c5768y0.f21030f;
        long m24402m = (c5768y0.m24402m() + c5770z0.f21045e) - j7;
        return c5770z0.f21047g ? m23777j(abstractC4303I, c5768y0, m24402m) : m23779l(abstractC4303I, c5768y0, m24402m);
    }

    /* renamed from: l */
    public final C5770z0 m23779l(AbstractC4303I abstractC4303I, C5768y0 c5768y0, long j7) {
        C5770z0 c5770z0 = c5768y0.f21030f;
        InterfaceC0120F.b bVar = c5770z0.f21041a;
        abstractC4303I.mo18028h(bVar.f367a, this.f20494a);
        if (!bVar.m345b()) {
            int i7 = bVar.f371e;
            if (i7 != -1 && this.f20494a.m18050q(i7)) {
                return m23777j(abstractC4303I, c5768y0, j7);
            }
            int m18044k = this.f20494a.m18044k(bVar.f371e);
            boolean z6 = this.f20494a.m18051r(bVar.f371e) && this.f20494a.m18041h(bVar.f371e, m18044k) == 3;
            if (m18044k == this.f20494a.m18034a(bVar.f371e) || z6) {
                return m23783p(abstractC4303I, bVar.f367a, m23785r(abstractC4303I, bVar.f367a, bVar.f371e), c5770z0.f21045e, bVar.f370d);
            }
            return m23782o(abstractC4303I, bVar.f367a, bVar.f371e, m18044k, c5770z0.f21045e, bVar.f370d);
        }
        int i8 = bVar.f368b;
        int m18034a = this.f20494a.m18034a(i8);
        if (m18034a == -1) {
            return null;
        }
        int m18045l = this.f20494a.m18045l(i8, bVar.f369c);
        if (m18045l < m18034a) {
            return m23782o(abstractC4303I, bVar.f367a, i8, m18045l, c5770z0.f21043c, bVar.f370d);
        }
        long j8 = c5770z0.f21043c;
        if (j8 == -9223372036854775807L) {
            AbstractC4303I.c cVar = this.f20495b;
            AbstractC4303I.b bVar2 = this.f20494a;
            Pair m18030k = abstractC4303I.m18030k(cVar, bVar2, bVar2.f14811c, -9223372036854775807L, Math.max(0L, j7));
            if (m18030k == null) {
                return null;
            }
            j8 = ((Long) m18030k.second).longValue();
        }
        return m23783p(abstractC4303I, bVar.f367a, Math.max(m23785r(abstractC4303I, bVar.f367a, bVar.f368b), j8), c5770z0.f21043c, bVar.f370d);
    }

    /* renamed from: m */
    public C5768y0 m23780m() {
        return this.f20504k;
    }

    /* renamed from: n */
    public final C5770z0 m23781n(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar, long j7, long j8) {
        abstractC4303I.mo18028h(bVar.f367a, this.f20494a);
        return bVar.m345b() ? m23782o(abstractC4303I, bVar.f367a, bVar.f368b, bVar.f369c, j7, bVar.f370d) : m23783p(abstractC4303I, bVar.f367a, j8, j7, bVar.f370d);
    }

    /* renamed from: o */
    public final C5770z0 m23782o(AbstractC4303I abstractC4303I, Object obj, int i7, int i8, long j7, long j8) {
        InterfaceC0120F.b bVar = new InterfaceC0120F.b(obj, i7, i8, j8);
        long m18035b = abstractC4303I.mo18028h(bVar.f367a, this.f20494a).m18035b(bVar.f368b, bVar.f369c);
        long m18040g = i8 == this.f20494a.m18044k(i7) ? this.f20494a.m18040g() : 0L;
        return new C5770z0(bVar, (m18035b == -9223372036854775807L || m18040g < m18035b) ? m18040g : Math.max(0L, m18035b - 1), j7, -9223372036854775807L, m18035b, this.f20494a.m18051r(bVar.f368b), false, false, false);
    }

    /* renamed from: p */
    public final C5770z0 m23783p(AbstractC4303I abstractC4303I, Object obj, long j7, long j8, long j9) {
        boolean z6;
        long j10;
        long j11;
        long j12;
        long j13 = j7;
        abstractC4303I.mo18028h(obj, this.f20494a);
        int m18037d = this.f20494a.m18037d(j13);
        boolean z7 = m18037d != -1 && this.f20494a.m18050q(m18037d);
        if (m18037d == -1) {
            if (this.f20494a.m18036c() > 0) {
                AbstractC4303I.b bVar = this.f20494a;
                if (bVar.m18051r(bVar.m18048o())) {
                    z6 = true;
                }
            }
            z6 = false;
        } else {
            if (this.f20494a.m18051r(m18037d)) {
                long m18039f = this.f20494a.m18039f(m18037d);
                AbstractC4303I.b bVar2 = this.f20494a;
                if (m18039f == bVar2.f14812d && bVar2.m18049p(m18037d)) {
                    z6 = true;
                    m18037d = -1;
                }
            }
            z6 = false;
        }
        InterfaceC0120F.b bVar3 = new InterfaceC0120F.b(obj, j9, m18037d);
        boolean m23792y = m23792y(bVar3);
        boolean m23752A = m23752A(abstractC4303I, bVar3);
        boolean m23793z = m23793z(abstractC4303I, bVar3, m23792y);
        boolean z8 = (m18037d == -1 || !this.f20494a.m18051r(m18037d) || z7) ? false : true;
        if (m18037d != -1 && !z7) {
            j11 = this.f20494a.m18039f(m18037d);
        } else {
            if (!z6) {
                j10 = -9223372036854775807L;
                j12 = (j10 != -9223372036854775807L || j10 == Long.MIN_VALUE) ? this.f20494a.f14812d : j10;
                if (j12 != -9223372036854775807L && j13 >= j12) {
                    j13 = Math.max(0L, j12 - ((m23793z && z6) ? 0 : 1));
                }
                return new C5770z0(bVar3, j13, j8, j10, j12, z8, m23792y, m23752A, m23793z);
            }
            j11 = this.f20494a.f14812d;
        }
        j10 = j11;
        if (j10 != -9223372036854775807L) {
        }
        if (j12 != -9223372036854775807L) {
            j13 = Math.max(0L, j12 - ((m23793z && z6) ? 0 : 1));
        }
        return new C5770z0(bVar3, j13, j8, j10, j12, z8, m23792y, m23752A, m23793z);
    }

    /* renamed from: q */
    public final C5770z0 m23784q(AbstractC4303I abstractC4303I, Object obj, long j7, long j8) {
        InterfaceC0120F.b m23749K = m23749K(abstractC4303I, obj, j7, j8, this.f20495b, this.f20494a);
        return m23749K.m345b() ? m23782o(abstractC4303I, m23749K.f367a, m23749K.f368b, m23749K.f369c, j7, m23749K.f370d) : m23783p(abstractC4303I, m23749K.f367a, j7, -9223372036854775807L, m23749K.f370d);
    }

    /* renamed from: r */
    public final long m23785r(AbstractC4303I abstractC4303I, Object obj, int i7) {
        abstractC4303I.mo18028h(obj, this.f20494a);
        long m18039f = this.f20494a.m18039f(i7);
        return m18039f == Long.MIN_VALUE ? this.f20494a.f14812d : m18039f + this.f20494a.m18042i(i7);
    }

    /* renamed from: s */
    public C5770z0 m23786s(long j7, C5695R0 c5695r0) {
        C5768y0 c5768y0 = this.f20504k;
        return c5768y0 == null ? m23776i(c5695r0) : m23778k(c5695r0.f20587a, c5768y0, j7);
    }

    /* renamed from: t */
    public C5768y0 m23787t() {
        return this.f20502i;
    }

    /* renamed from: u */
    public C5768y0 m23788u() {
        return this.f20503j;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p292n0.C5770z0 m23789v(p232g0.AbstractC4303I r19, p292n0.C5770z0 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            D0.F$b r3 = r2.f21041a
            boolean r12 = r0.m23792y(r3)
            boolean r13 = r0.m23752A(r1, r3)
            boolean r14 = r0.m23793z(r1, r3, r12)
            D0.F$b r4 = r2.f21041a
            java.lang.Object r4 = r4.f367a
            g0.I$b r5 = r0.f20494a
            r1.mo18028h(r4, r5)
            boolean r1 = r3.m345b()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = -1
            if (r1 != 0) goto L35
            int r1 = r3.f371e
            if (r1 != r6) goto L2e
            goto L35
        L2e:
            g0.I$b r7 = r0.f20494a
            long r7 = r7.m18039f(r1)
            goto L36
        L35:
            r7 = r4
        L36:
            boolean r1 = r3.m345b()
            if (r1 == 0) goto L48
            g0.I$b r1 = r0.f20494a
            int r4 = r3.f368b
            int r5 = r3.f369c
            long r4 = r1.m18035b(r4, r5)
        L46:
            r9 = r4
            goto L5c
        L48:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 == 0) goto L55
            r4 = -9223372036854775808
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            g0.I$b r1 = r0.f20494a
            long r4 = r1.m18043j()
            goto L46
        L5c:
            boolean r1 = r3.m345b()
            if (r1 == 0) goto L6c
            g0.I$b r1 = r0.f20494a
            int r4 = r3.f368b
            boolean r1 = r1.m18051r(r4)
        L6a:
            r11 = r1
            goto L7c
        L6c:
            int r1 = r3.f371e
            if (r1 == r6) goto L7a
            g0.I$b r4 = r0.f20494a
            boolean r1 = r4.m18051r(r1)
            if (r1 == 0) goto L7a
            r1 = 1
            goto L6a
        L7a:
            r1 = 0
            goto L6a
        L7c:
            n0.z0 r15 = new n0.z0
            long r4 = r2.f21042b
            long r1 = r2.f21043c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p292n0.C5664B0.m23789v(g0.I, n0.z0):n0.z0");
    }

    /* renamed from: w */
    public final boolean m23790w(Object obj, AbstractC4303I abstractC4303I) {
        int m18036c = abstractC4303I.mo18028h(obj, this.f20494a).m18036c();
        int m18048o = this.f20494a.m18048o();
        return m18036c > 0 && this.f20494a.m18051r(m18048o) && (m18036c > 1 || this.f20494a.m18039f(m18048o) != Long.MIN_VALUE);
    }

    /* renamed from: x */
    public void m23791x(AbstractC4303I abstractC4303I) {
        C5768y0 c5768y0;
        if (this.f20508o.f21022a == -9223372036854775807L || (c5768y0 = this.f20504k) == null) {
            m23758H();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Pair m23775h = m23775h(abstractC4303I, c5768y0.f21030f.f21041a.f367a, 0L);
        if (m23775h != null && !abstractC4303I.m18031n(abstractC4303I.mo18028h(m23775h.first, this.f20494a).f14811c, this.f20495b).m18059f()) {
            long m23763N = m23763N(m23775h.first);
            if (m23763N == -1) {
                m23763N = this.f20499f;
                this.f20499f = 1 + m23763N;
            }
            C5770z0 m23784q = m23784q(abstractC4303I, m23775h.first, ((Long) m23775h.second).longValue(), m23763N);
            C5768y0 m23760J = m23760J(m23784q);
            if (m23760J == null) {
                m23760J = this.f20498e.mo24178a(m23784q, (c5768y0.m24402m() + c5768y0.f21030f.f21045e) - m23784q.f21042b);
            }
            arrayList.add(m23760J);
        }
        m23757G(arrayList);
    }

    /* renamed from: y */
    public final boolean m23792y(InterfaceC0120F.b bVar) {
        return !bVar.m345b() && bVar.f371e == -1;
    }

    /* renamed from: z */
    public final boolean m23793z(AbstractC4303I abstractC4303I, InterfaceC0120F.b bVar, boolean z6) {
        int mo302b = abstractC4303I.mo302b(bVar.f367a);
        return !abstractC4303I.m18031n(abstractC4303I.m18027f(mo302b, this.f20494a).f14811c, this.f20495b).f14840i && abstractC4303I.m18033r(mo302b, this.f20494a, this.f20495b, this.f20500g, this.f20501h) && z6;
    }
}
