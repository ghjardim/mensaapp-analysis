package p134T0;

import java.util.List;
import p078L0.AbstractC0882q;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p184a1.C3098a;
import p225f1.C4238m;
import p232g0.C4327q;
import p232g0.C4334x;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: T0.b */
/* loaded from: classes.dex */
public final class C2429b implements InterfaceC0883r {

    /* renamed from: b */
    public InterfaceC0885t f7185b;

    /* renamed from: c */
    public int f7186c;

    /* renamed from: d */
    public int f7187d;

    /* renamed from: e */
    public int f7188e;

    /* renamed from: g */
    public C3098a f7190g;

    /* renamed from: h */
    public InterfaceC0884s f7191h;

    /* renamed from: i */
    public C2431d f7192i;

    /* renamed from: j */
    public C4238m f7193j;

    /* renamed from: a */
    public final C5357z f7184a = new C5357z(6);

    /* renamed from: f */
    public long f7189f = -1;

    /* renamed from: f */
    public static C3098a m8269f(String str, long j7) {
        C2430c m8281a;
        if (j7 == -1 || (m8281a = AbstractC2433f.m8281a(str)) == null) {
            return null;
        }
        return m8281a.m8279a(j7);
    }

    /* renamed from: m */
    private void m8270m(InterfaceC0884s interfaceC0884s) {
        String m21920A;
        if (this.f7187d == 65505) {
            C5357z c5357z = new C5357z(this.f7188e);
            interfaceC0884s.readFully(c5357z.m21946e(), 0, this.f7188e);
            if (this.f7190g == null && "http://ns.adobe.com/xap/1.0/".equals(c5357z.m21920A()) && (m21920A = c5357z.m21920A()) != null) {
                C3098a m8269f = m8269f(m21920A, interfaceC0884s.mo3511a());
                this.f7190g = m8269f;
                if (m8269f != null) {
                    this.f7189f = m8269f.f9576d;
                }
            }
        } else {
            interfaceC0884s.mo3519q(this.f7188e);
        }
        this.f7186c = 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        if (j7 == 0) {
            this.f7186c = 0;
            this.f7193j = null;
        } else if (this.f7186c == 5) {
            ((C4238m) AbstractC5332a.m21800e(this.f7193j)).mo695a(j7, j8);
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f7185b = interfaceC0885t;
    }

    /* renamed from: c */
    public final void m8271c(InterfaceC0884s interfaceC0884s) {
        this.f7184a.m21935P(2);
        interfaceC0884s.mo3521t(this.f7184a.m21946e(), 0, 2);
        interfaceC0884s.mo3515k(this.f7184a.m21932M() - 2);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m8272e() {
        ((InterfaceC0885t) AbstractC5332a.m21800e(this.f7185b)).mo472q();
        this.f7185b.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
        this.f7186c = 6;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int i7 = this.f7186c;
        if (i7 == 0) {
            m8275l(interfaceC0884s);
            return 0;
        }
        if (i7 == 1) {
            m8276n(interfaceC0884s);
            return 0;
        }
        if (i7 == 2) {
            m8270m(interfaceC0884s);
            return 0;
        }
        if (i7 == 4) {
            long mo3522u = interfaceC0884s.mo3522u();
            long j7 = this.f7189f;
            if (mo3522u != j7) {
                c0854l.f2935a = j7;
                return 1;
            }
            m8277o(interfaceC0884s);
            return 0;
        }
        if (i7 != 5) {
            if (i7 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f7192i == null || interfaceC0884s != this.f7191h) {
            this.f7191h = interfaceC0884s;
            this.f7192i = new C2431d(interfaceC0884s, this.f7189f);
        }
        int mo699h = ((C4238m) AbstractC5332a.m21800e(this.f7193j)).mo699h(this.f7192i, c0854l);
        if (mo699h == 1) {
            c0854l.f2935a += this.f7189f;
        }
        return mo699h;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        if (m8274k(interfaceC0884s) != 65496) {
            return false;
        }
        int m8274k = m8274k(interfaceC0884s);
        this.f7187d = m8274k;
        if (m8274k == 65504) {
            m8271c(interfaceC0884s);
            this.f7187d = m8274k(interfaceC0884s);
        }
        if (this.f7187d != 65505) {
            return false;
        }
        interfaceC0884s.mo3515k(2);
        this.f7184a.m21935P(6);
        interfaceC0884s.mo3521t(this.f7184a.m21946e(), 0, 6);
        return this.f7184a.m21928I() == 1165519206 && this.f7184a.m21932M() == 0;
    }

    /* renamed from: j */
    public final void m8273j(C3098a c3098a) {
        ((InterfaceC0885t) AbstractC5332a.m21800e(this.f7185b)).mo455b(1024, 4).mo566e(new C4327q.b().m18240Q("image/jpeg").m18257h0(new C4334x(c3098a)).m18234K());
    }

    /* renamed from: k */
    public final int m8274k(InterfaceC0884s interfaceC0884s) {
        this.f7184a.m21935P(2);
        interfaceC0884s.mo3521t(this.f7184a.m21946e(), 0, 2);
        return this.f7184a.m21932M();
    }

    /* renamed from: l */
    public final void m8275l(InterfaceC0884s interfaceC0884s) {
        this.f7184a.m21935P(2);
        interfaceC0884s.readFully(this.f7184a.m21946e(), 0, 2);
        int m21932M = this.f7184a.m21932M();
        this.f7187d = m21932M;
        if (m21932M == 65498) {
            if (this.f7189f != -1) {
                this.f7186c = 4;
                return;
            } else {
                m8272e();
                return;
            }
        }
        if ((m21932M < 65488 || m21932M > 65497) && m21932M != 65281) {
            this.f7186c = 1;
        }
    }

    /* renamed from: n */
    public final void m8276n(InterfaceC0884s interfaceC0884s) {
        this.f7184a.m21935P(2);
        interfaceC0884s.readFully(this.f7184a.m21946e(), 0, 2);
        this.f7188e = this.f7184a.m21932M() - 2;
        this.f7186c = 2;
    }

    /* renamed from: o */
    public final void m8277o(InterfaceC0884s interfaceC0884s) {
        if (!interfaceC0884s.mo3513h(this.f7184a.m21946e(), 0, 1, true)) {
            m8272e();
            return;
        }
        interfaceC0884s.mo3518p();
        if (this.f7193j == null) {
            this.f7193j = new C4238m(InterfaceC4529t.a.f16172a, 8);
        }
        C2431d c2431d = new C2431d(interfaceC0884s, this.f7189f);
        this.f7192i = c2431d;
        if (!this.f7193j.mo700i(c2431d)) {
            m8272e();
        } else {
            this.f7193j.mo696b(new C2432e(this.f7189f, (InterfaceC0885t) AbstractC5332a.m21800e(this.f7185b)));
            m8278p();
        }
    }

    /* renamed from: p */
    public final void m8278p() {
        m8273j((C3098a) AbstractC5332a.m21800e(this.f7190g));
        this.f7186c = 5;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
        C4238m c4238m = this.f7193j;
        if (c4238m != null) {
            c4238m.release();
        }
    }
}
