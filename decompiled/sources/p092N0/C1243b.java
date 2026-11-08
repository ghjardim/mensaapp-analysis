package p092N0;

import java.util.ArrayList;
import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0852J;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p178Z2.AbstractC3010Y;
import p232g0.AbstractC4336z;
import p232g0.C4295A;
import p232g0.C4327q;
import p249i1.C4531v;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;

/* renamed from: N0.b */
/* loaded from: classes.dex */
public final class C1243b implements InterfaceC0883r {

    /* renamed from: a */
    public final C5357z f3918a;

    /* renamed from: b */
    public final c f3919b;

    /* renamed from: c */
    public final boolean f3920c;

    /* renamed from: d */
    public final InterfaceC4529t.a f3921d;

    /* renamed from: e */
    public int f3922e;

    /* renamed from: f */
    public InterfaceC0885t f3923f;

    /* renamed from: g */
    public C1244c f3924g;

    /* renamed from: h */
    public long f3925h;

    /* renamed from: i */
    public C1246e[] f3926i;

    /* renamed from: j */
    public long f3927j;

    /* renamed from: k */
    public C1246e f3928k;

    /* renamed from: l */
    public int f3929l;

    /* renamed from: m */
    public long f3930m;

    /* renamed from: n */
    public long f3931n;

    /* renamed from: o */
    public int f3932o;

    /* renamed from: p */
    public boolean f3933p;

    /* renamed from: N0.b$b */
    public class b implements InterfaceC0855M {

        /* renamed from: a */
        public final long f3934a;

        public b(long j7) {
            this.f3934a = j7;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: f */
        public boolean mo3499f() {
            return true;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: j */
        public InterfaceC0855M.a mo3500j(long j7) {
            InterfaceC0855M.a m4781i = C1243b.this.f3926i[0].m4781i(j7);
            for (int i7 = 1; i7 < C1243b.this.f3926i.length; i7++) {
                InterfaceC0855M.a m4781i2 = C1243b.this.f3926i[i7].m4781i(j7);
                if (m4781i2.f2936a.f2942b < m4781i.f2936a.f2942b) {
                    m4781i = m4781i2;
                }
            }
            return m4781i;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: l */
        public long mo474l() {
            return this.f3934a;
        }
    }

    /* renamed from: N0.b$c */
    public static class c {

        /* renamed from: a */
        public int f3936a;

        /* renamed from: b */
        public int f3937b;

        /* renamed from: c */
        public int f3938c;

        public c() {
        }

        /* renamed from: a */
        public void m4766a(C5357z c5357z) {
            this.f3936a = c5357z.m21961t();
            this.f3937b = c5357z.m21961t();
            this.f3938c = 0;
        }

        /* renamed from: b */
        public void m4767b(C5357z c5357z) {
            m4766a(c5357z);
            if (this.f3936a == 1414744396) {
                this.f3938c = c5357z.m21961t();
                return;
            }
            throw C4295A.m17943a("LIST expected, found: " + this.f3936a, null);
        }
    }

    public C1243b(int i7, InterfaceC4529t.a aVar) {
        this.f3921d = aVar;
        this.f3920c = (i7 & 1) == 0;
        this.f3918a = new C5357z(12);
        this.f3919b = new c();
        this.f3923f = new C0852J();
        this.f3926i = new C1246e[0];
        this.f3930m = -1L;
        this.f3931n = -1L;
        this.f3929l = -1;
        this.f3925h = -9223372036854775807L;
    }

    /* renamed from: e */
    public static void m4758e(InterfaceC0884s interfaceC0884s) {
        if ((interfaceC0884s.mo3522u() & 1) == 1) {
            interfaceC0884s.mo3519q(1);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        this.f3927j = -1L;
        this.f3928k = null;
        for (C1246e c1246e : this.f3926i) {
            c1246e.m4787o(j7);
        }
        if (j7 != 0) {
            this.f3922e = 6;
        } else if (this.f3926i.length == 0) {
            this.f3922e = 0;
        } else {
            this.f3922e = 3;
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f3922e = 0;
        if (this.f3920c) {
            interfaceC0885t = new C4531v(interfaceC0885t, this.f3921d);
        }
        this.f3923f = interfaceC0885t;
        this.f3927j = -1L;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: f */
    public final C1246e m4759f(int i7) {
        for (C1246e c1246e : this.f3926i) {
            if (c1246e.m4782j(i7)) {
                return c1246e;
            }
        }
        return null;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        if (m4765o(interfaceC0884s, c0854l)) {
            return 1;
        }
        switch (this.f3922e) {
            case 0:
                if (!mo700i(interfaceC0884s)) {
                    throw C4295A.m17943a("AVI Header List not found", null);
                }
                interfaceC0884s.mo3519q(12);
                this.f3922e = 1;
                return 0;
            case 1:
                interfaceC0884s.readFully(this.f3918a.m21946e(), 0, 12);
                this.f3918a.m21939T(0);
                this.f3919b.m4767b(this.f3918a);
                c cVar = this.f3919b;
                if (cVar.f3938c == 1819436136) {
                    this.f3929l = cVar.f3937b;
                    this.f3922e = 2;
                    return 0;
                }
                throw C4295A.m17943a("hdrl expected, found: " + this.f3919b.f3938c, null);
            case 2:
                int i7 = this.f3929l - 4;
                C5357z c5357z = new C5357z(i7);
                interfaceC0884s.readFully(c5357z.m21946e(), 0, i7);
                m4760j(c5357z);
                this.f3922e = 3;
                return 0;
            case 3:
                if (this.f3930m != -1) {
                    long mo3522u = interfaceC0884s.mo3522u();
                    long j7 = this.f3930m;
                    if (mo3522u != j7) {
                        this.f3927j = j7;
                        return 0;
                    }
                }
                interfaceC0884s.mo3521t(this.f3918a.m21946e(), 0, 12);
                interfaceC0884s.mo3518p();
                this.f3918a.m21939T(0);
                this.f3919b.m4766a(this.f3918a);
                int m21961t = this.f3918a.m21961t();
                int i8 = this.f3919b.f3936a;
                if (i8 == 1179011410) {
                    interfaceC0884s.mo3519q(12);
                    return 0;
                }
                if (i8 != 1414744396 || m21961t != 1769369453) {
                    this.f3927j = interfaceC0884s.mo3522u() + this.f3919b.f3937b + 8;
                    return 0;
                }
                long mo3522u2 = interfaceC0884s.mo3522u();
                this.f3930m = mo3522u2;
                this.f3931n = mo3522u2 + this.f3919b.f3937b + 8;
                if (!this.f3933p) {
                    if (((C1244c) AbstractC5332a.m21800e(this.f3924g)).m4769b()) {
                        this.f3922e = 4;
                        this.f3927j = this.f3931n;
                        return 0;
                    }
                    this.f3923f.mo466j(new InterfaceC0855M.b(this.f3925h));
                    this.f3933p = true;
                }
                this.f3927j = interfaceC0884s.mo3522u() + 12;
                this.f3922e = 6;
                return 0;
            case 4:
                interfaceC0884s.readFully(this.f3918a.m21946e(), 0, 8);
                this.f3918a.m21939T(0);
                int m21961t2 = this.f3918a.m21961t();
                int m21961t3 = this.f3918a.m21961t();
                if (m21961t2 == 829973609) {
                    this.f3922e = 5;
                    this.f3932o = m21961t3;
                } else {
                    this.f3927j = interfaceC0884s.mo3522u() + m21961t3;
                }
                return 0;
            case 5:
                C5357z c5357z2 = new C5357z(this.f3932o);
                interfaceC0884s.readFully(c5357z2.m21946e(), 0, this.f3932o);
                m4761k(c5357z2);
                this.f3922e = 6;
                this.f3927j = this.f3930m;
                return 0;
            case 6:
                return m4764n(interfaceC0884s);
            default:
                throw new AssertionError();
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3521t(this.f3918a.m21946e(), 0, 12);
        this.f3918a.m21939T(0);
        if (this.f3918a.m21961t() != 1179011410) {
            return false;
        }
        this.f3918a.m21940U(4);
        return this.f3918a.m21961t() == 541677121;
    }

    /* renamed from: j */
    public final void m4760j(C5357z c5357z) {
        C1247f m4789d = C1247f.m4789d(1819436136, c5357z);
        if (m4789d.mo4756a() != 1819436136) {
            throw C4295A.m17943a("Unexpected header list type " + m4789d.mo4756a(), null);
        }
        C1244c c1244c = (C1244c) m4789d.m4790c(C1244c.class);
        if (c1244c == null) {
            throw C4295A.m17943a("AviHeader not found", null);
        }
        this.f3924g = c1244c;
        this.f3925h = c1244c.f3941c * c1244c.f3939a;
        ArrayList arrayList = new ArrayList();
        AbstractC3010Y it = m4789d.f3961a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            InterfaceC1242a interfaceC1242a = (InterfaceC1242a) it.next();
            if (interfaceC1242a.mo4756a() == 1819440243) {
                int i8 = i7 + 1;
                C1246e m4763m = m4763m((C1247f) interfaceC1242a, i7);
                if (m4763m != null) {
                    arrayList.add(m4763m);
                }
                i7 = i8;
            }
        }
        this.f3926i = (C1246e[]) arrayList.toArray(new C1246e[0]);
        this.f3923f.mo472q();
    }

    /* renamed from: k */
    public final void m4761k(C5357z c5357z) {
        long m4762l = m4762l(c5357z);
        while (c5357z.m21942a() >= 16) {
            int m21961t = c5357z.m21961t();
            int m21961t2 = c5357z.m21961t();
            long m21961t3 = c5357z.m21961t() + m4762l;
            c5357z.m21961t();
            C1246e m4759f = m4759f(m21961t);
            if (m4759f != null) {
                if ((m21961t2 & 16) == 16) {
                    m4759f.m4775b(m21961t3);
                }
                m4759f.m4783k();
            }
        }
        for (C1246e c1246e : this.f3926i) {
            c1246e.m4776c();
        }
        this.f3933p = true;
        this.f3923f.mo466j(new b(this.f3925h));
    }

    /* renamed from: l */
    public final long m4762l(C5357z c5357z) {
        if (c5357z.m21942a() < 16) {
            return 0L;
        }
        int m21947f = c5357z.m21947f();
        c5357z.m21940U(8);
        long m21961t = c5357z.m21961t();
        long j7 = this.f3930m;
        long j8 = m21961t <= j7 ? j7 + 8 : 0L;
        c5357z.m21939T(m21947f);
        return j8;
    }

    /* renamed from: m */
    public final C1246e m4763m(C1247f c1247f, int i7) {
        C1245d c1245d = (C1245d) c1247f.m4790c(C1245d.class);
        C1248g c1248g = (C1248g) c1247f.m4790c(C1248g.class);
        if (c1245d == null) {
            AbstractC5346o.m21867h("AviExtractor", "Missing Stream Header");
            return null;
        }
        if (c1248g == null) {
            AbstractC5346o.m21867h("AviExtractor", "Missing Stream Format");
            return null;
        }
        long m4771b = c1245d.m4771b();
        C4327q c4327q = c1248g.f3963a;
        C4327q.b m18193a = c4327q.m18193a();
        m18193a.m18249Z(i7);
        int i8 = c1245d.f3948f;
        if (i8 != 0) {
            m18193a.m18255f0(i8);
        }
        C1249h c1249h = (C1249h) c1247f.m4790c(C1249h.class);
        if (c1249h != null) {
            m18193a.m18252c0(c1249h.f3964a);
        }
        int m18418k = AbstractC4336z.m18418k(c4327q.f15138n);
        if (m18418k != 1 && m18418k != 2) {
            return null;
        }
        InterfaceC0861T mo455b = this.f3923f.mo455b(i7, m18418k);
        mo455b.mo566e(m18193a.m18234K());
        C1246e c1246e = new C1246e(i7, m18418k, m4771b, c1245d.f3947e, mo455b);
        this.f3925h = m4771b;
        return c1246e;
    }

    /* renamed from: n */
    public final int m4764n(InterfaceC0884s interfaceC0884s) {
        if (interfaceC0884s.mo3522u() >= this.f3931n) {
            return -1;
        }
        C1246e c1246e = this.f3928k;
        if (c1246e == null) {
            m4758e(interfaceC0884s);
            interfaceC0884s.mo3521t(this.f3918a.m21946e(), 0, 12);
            this.f3918a.m21939T(0);
            int m21961t = this.f3918a.m21961t();
            if (m21961t == 1414744396) {
                this.f3918a.m21939T(8);
                interfaceC0884s.mo3519q(this.f3918a.m21961t() != 1769369453 ? 8 : 12);
                interfaceC0884s.mo3518p();
                return 0;
            }
            int m21961t2 = this.f3918a.m21961t();
            if (m21961t == 1263424842) {
                this.f3927j = interfaceC0884s.mo3522u() + m21961t2 + 8;
                return 0;
            }
            interfaceC0884s.mo3519q(8);
            interfaceC0884s.mo3518p();
            C1246e m4759f = m4759f(m21961t);
            if (m4759f == null) {
                this.f3927j = interfaceC0884s.mo3522u() + m21961t2;
                return 0;
            }
            m4759f.m4786n(m21961t2);
            this.f3928k = m4759f;
        } else if (c1246e.m4785m(interfaceC0884s)) {
            this.f3928k = null;
        }
        return 0;
    }

    /* renamed from: o */
    public final boolean m4765o(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        boolean z6;
        if (this.f3927j != -1) {
            long mo3522u = interfaceC0884s.mo3522u();
            long j7 = this.f3927j;
            if (j7 < mo3522u || j7 > 262144 + mo3522u) {
                c0854l.f2935a = j7;
                z6 = true;
                this.f3927j = -1L;
                return z6;
            }
            interfaceC0884s.mo3519q((int) (j7 - mo3522u));
        }
        z6 = false;
        this.f3927j = -1L;
        return z6;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
