package p233g1;

import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: g1.i */
/* loaded from: classes.dex */
public abstract class AbstractC4345i {

    /* renamed from: b */
    public InterfaceC0861T f15481b;

    /* renamed from: c */
    public InterfaceC0885t f15482c;

    /* renamed from: d */
    public InterfaceC4343g f15483d;

    /* renamed from: e */
    public long f15484e;

    /* renamed from: f */
    public long f15485f;

    /* renamed from: g */
    public long f15486g;

    /* renamed from: h */
    public int f15487h;

    /* renamed from: i */
    public int f15488i;

    /* renamed from: k */
    public long f15490k;

    /* renamed from: l */
    public boolean f15491l;

    /* renamed from: m */
    public boolean f15492m;

    /* renamed from: a */
    public final C4341e f15480a = new C4341e();

    /* renamed from: j */
    public b f15489j = new b();

    /* renamed from: g1.i$b */
    public static class b {

        /* renamed from: a */
        public C4327q f15493a;

        /* renamed from: b */
        public InterfaceC4343g f15494b;
    }

    /* renamed from: a */
    public final void m18463a() {
        AbstractC5332a.m21804i(this.f15481b);
        AbstractC5330M.m21747i(this.f15482c);
    }

    /* renamed from: b */
    public long m18464b(long j7) {
        return (j7 * 1000000) / this.f15488i;
    }

    /* renamed from: c */
    public long m18465c(long j7) {
        return (this.f15488i * j7) / 1000000;
    }

    /* renamed from: d */
    public void m18466d(InterfaceC0885t interfaceC0885t, InterfaceC0861T interfaceC0861T) {
        this.f15482c = interfaceC0885t;
        this.f15481b = interfaceC0861T;
        mo18444l(true);
    }

    /* renamed from: e */
    public void mo18467e(long j7) {
        this.f15486g = j7;
    }

    /* renamed from: f */
    public abstract long mo18442f(C5357z c5357z);

    /* renamed from: g */
    public final int m18468g(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        m18463a();
        int i7 = this.f15487h;
        if (i7 == 0) {
            return m18470j(interfaceC0884s);
        }
        if (i7 == 1) {
            interfaceC0884s.mo3519q((int) this.f15485f);
            this.f15487h = 2;
            return 0;
        }
        if (i7 == 2) {
            AbstractC5330M.m21747i(this.f15483d);
            return m18471k(interfaceC0884s, c0854l);
        }
        if (i7 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final boolean m18469h(InterfaceC0884s interfaceC0884s) {
        while (this.f15480a.m18454d(interfaceC0884s)) {
            this.f15490k = interfaceC0884s.mo3522u() - this.f15485f;
            if (!mo18443i(this.f15480a.m18453c(), this.f15485f, this.f15489j)) {
                return true;
            }
            this.f15485f = interfaceC0884s.mo3522u();
        }
        this.f15487h = 3;
        return false;
    }

    /* renamed from: i */
    public abstract boolean mo18443i(C5357z c5357z, long j7, b bVar);

    /* renamed from: j */
    public final int m18470j(InterfaceC0884s interfaceC0884s) {
        if (!m18469h(interfaceC0884s)) {
            return -1;
        }
        C4327q c4327q = this.f15489j.f15493a;
        this.f15488i = c4327q.f15115C;
        if (!this.f15492m) {
            this.f15481b.mo566e(c4327q);
            this.f15492m = true;
        }
        InterfaceC4343g interfaceC4343g = this.f15489j.f15494b;
        if (interfaceC4343g != null) {
            this.f15483d = interfaceC4343g;
        } else if (interfaceC0884s.mo3511a() == -1) {
            this.f15483d = new c();
        } else {
            C4342f m18452b = this.f15480a.m18452b();
            this.f15483d = new C4337a(this, this.f15485f, interfaceC0884s.mo3511a(), m18452b.f15473h + m18452b.f15474i, m18452b.f15468c, (m18452b.f15467b & 4) != 0);
        }
        this.f15487h = 2;
        this.f15480a.m18456f();
        return 0;
    }

    /* renamed from: k */
    public final int m18471k(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        long mo18433a = this.f15483d.mo18433a(interfaceC0884s);
        if (mo18433a >= 0) {
            c0854l.f2935a = mo18433a;
            return 1;
        }
        if (mo18433a < -1) {
            mo18467e(-(mo18433a + 2));
        }
        if (!this.f15491l) {
            this.f15482c.mo466j((InterfaceC0855M) AbstractC5332a.m21804i(this.f15483d.mo18434b()));
            this.f15491l = true;
        }
        if (this.f15490k <= 0 && !this.f15480a.m18454d(interfaceC0884s)) {
            this.f15487h = 3;
            return -1;
        }
        this.f15490k = 0L;
        C5357z m18453c = this.f15480a.m18453c();
        long mo18442f = mo18442f(m18453c);
        if (mo18442f >= 0) {
            long j7 = this.f15486g;
            if (j7 + mo18442f >= this.f15484e) {
                long m18464b = m18464b(j7);
                this.f15481b.mo564d(m18453c, m18453c.m21948g());
                this.f15481b.mo562c(m18464b, 1, m18453c.m21948g(), 0, null);
                this.f15484e = -1L;
            }
        }
        this.f15486g += mo18442f;
        return 0;
    }

    /* renamed from: l */
    public void mo18444l(boolean z6) {
        if (z6) {
            this.f15489j = new b();
            this.f15485f = 0L;
            this.f15487h = 0;
        } else {
            this.f15487h = 1;
        }
        this.f15484e = -1L;
        this.f15486g = 0L;
    }

    /* renamed from: m */
    public final void m18472m(long j7, long j8) {
        this.f15480a.m18455e();
        if (j7 == 0) {
            mo18444l(!this.f15491l);
        } else if (this.f15487h != 0) {
            this.f15484e = m18465c(j8);
            ((InterfaceC4343g) AbstractC5330M.m21747i(this.f15483d)).mo18435c(this.f15484e);
            this.f15487h = 2;
        }
    }

    /* renamed from: g1.i$c */
    public static final class c implements InterfaceC4343g {
        public c() {
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: a */
        public long mo18433a(InterfaceC0884s interfaceC0884s) {
            return -1L;
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: b */
        public InterfaceC0855M mo18434b() {
            return new InterfaceC0855M.b(-9223372036854775807L);
        }

        @Override // p233g1.InterfaceC4343g
        /* renamed from: c */
        public void mo18435c(long j7) {
        }
    }
}
