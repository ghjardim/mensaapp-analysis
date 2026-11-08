package p113Q0;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.AbstractC0890y;
import p078L0.AbstractC0891z;
import p078L0.C0843A;
import p078L0.C0844B;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p232g0.C4334x;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5357z;

/* renamed from: Q0.d */
/* loaded from: classes.dex */
public final class C2009d implements InterfaceC0883r {

    /* renamed from: o */
    public static final InterfaceC0889x f6203o = new InterfaceC0889x() { // from class: Q0.c
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m7135l;
            m7135l = C2009d.m7135l();
            return m7135l;
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: c */
        public /* synthetic */ InterfaceC0889x mo649c(boolean z6) {
            return AbstractC0888w.m3695b(this, z6);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: d */
        public /* synthetic */ InterfaceC0883r[] mo650d(Uri uri, Map map) {
            return AbstractC0888w.m3694a(this, uri, map);
        }
    };

    /* renamed from: a */
    public final byte[] f6204a;

    /* renamed from: b */
    public final C5357z f6205b;

    /* renamed from: c */
    public final boolean f6206c;

    /* renamed from: d */
    public final AbstractC0890y.a f6207d;

    /* renamed from: e */
    public InterfaceC0885t f6208e;

    /* renamed from: f */
    public InterfaceC0861T f6209f;

    /* renamed from: g */
    public int f6210g;

    /* renamed from: h */
    public C4334x f6211h;

    /* renamed from: i */
    public C0844B f6212i;

    /* renamed from: j */
    public int f6213j;

    /* renamed from: k */
    public int f6214k;

    /* renamed from: l */
    public C2007b f6215l;

    /* renamed from: m */
    public int f6216m;

    /* renamed from: n */
    public long f6217n;

    public C2009d() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ InterfaceC0883r[] m7135l() {
        return new InterfaceC0883r[]{new C2009d()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        if (j7 == 0) {
            this.f6210g = 0;
        } else {
            C2007b c2007b = this.f6215l;
            if (c2007b != null) {
                c2007b.m3614h(j8);
            }
        }
        this.f6217n = j8 != 0 ? -1L : 0L;
        this.f6216m = 0;
        this.f6205b.m21935P(0);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f6208e = interfaceC0885t;
        this.f6209f = interfaceC0885t.mo455b(0, 1);
        interfaceC0885t.mo472q();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final long m7136e(C5357z c5357z, boolean z6) {
        boolean z7;
        AbstractC5332a.m21800e(this.f6212i);
        int m21947f = c5357z.m21947f();
        while (m21947f <= c5357z.m21948g() - 16) {
            c5357z.m21939T(m21947f);
            if (AbstractC0890y.m3701d(c5357z, this.f6212i, this.f6214k, this.f6207d)) {
                c5357z.m21939T(m21947f);
                return this.f6207d.f3106a;
            }
            m21947f++;
        }
        if (!z6) {
            c5357z.m21939T(m21947f);
            return -1L;
        }
        while (m21947f <= c5357z.m21948g() - this.f6213j) {
            c5357z.m21939T(m21947f);
            try {
                z7 = AbstractC0890y.m3701d(c5357z, this.f6212i, this.f6214k, this.f6207d);
            } catch (IndexOutOfBoundsException unused) {
                z7 = false;
            }
            if (c5357z.m21947f() <= c5357z.m21948g() ? z7 : false) {
                c5357z.m21939T(m21947f);
                return this.f6207d.f3106a;
            }
            m21947f++;
        }
        c5357z.m21939T(c5357z.m21948g());
        return -1L;
    }

    /* renamed from: f */
    public final void m7137f(InterfaceC0884s interfaceC0884s) {
        this.f6214k = AbstractC0891z.m3709b(interfaceC0884s);
        ((InterfaceC0885t) AbstractC5330M.m21747i(this.f6208e)).mo466j(m7138j(interfaceC0884s.mo3522u(), interfaceC0884s.mo3511a()));
        this.f6210g = 5;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        int i7 = this.f6210g;
        if (i7 == 0) {
            m7142o(interfaceC0884s);
            return 0;
        }
        if (i7 == 1) {
            m7139k(interfaceC0884s);
            return 0;
        }
        if (i7 == 2) {
            m7144q(interfaceC0884s);
            return 0;
        }
        if (i7 == 3) {
            m7143p(interfaceC0884s);
            return 0;
        }
        if (i7 == 4) {
            m7137f(interfaceC0884s);
            return 0;
        }
        if (i7 == 5) {
            return m7141n(interfaceC0884s, c0854l);
        }
        throw new IllegalStateException();
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        AbstractC0891z.m3710c(interfaceC0884s, false);
        return AbstractC0891z.m3708a(interfaceC0884s);
    }

    /* renamed from: j */
    public final InterfaceC0855M m7138j(long j7, long j8) {
        AbstractC5332a.m21800e(this.f6212i);
        C0844B c0844b = this.f6212i;
        if (c0844b.f2895k != null) {
            return new C0843A(c0844b, j7);
        }
        if (j8 == -1 || c0844b.f2894j <= 0) {
            return new InterfaceC0855M.b(c0844b.m3507f());
        }
        C2007b c2007b = new C2007b(c0844b, this.f6214k, j7, j8);
        this.f6215l = c2007b;
        return c2007b.m3608b();
    }

    /* renamed from: k */
    public final void m7139k(InterfaceC0884s interfaceC0884s) {
        byte[] bArr = this.f6204a;
        interfaceC0884s.mo3521t(bArr, 0, bArr.length);
        interfaceC0884s.mo3518p();
        this.f6210g = 2;
    }

    /* renamed from: m */
    public final void m7140m() {
        ((InterfaceC0861T) AbstractC5330M.m21747i(this.f6209f)).mo562c((this.f6217n * 1000000) / ((C0844B) AbstractC5330M.m21747i(this.f6212i)).f2889e, 1, this.f6216m, 0, null);
    }

    /* renamed from: n */
    public final int m7141n(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        boolean z6;
        AbstractC5332a.m21800e(this.f6209f);
        AbstractC5332a.m21800e(this.f6212i);
        C2007b c2007b = this.f6215l;
        if (c2007b != null && c2007b.m3610d()) {
            return this.f6215l.m3609c(interfaceC0884s, c0854l);
        }
        if (this.f6217n == -1) {
            this.f6217n = AbstractC0890y.m3706i(interfaceC0884s, this.f6212i);
            return 0;
        }
        int m21948g = this.f6205b.m21948g();
        if (m21948g < 32768) {
            int read = interfaceC0884s.read(this.f6205b.m21946e(), m21948g, 32768 - m21948g);
            z6 = read == -1;
            if (!z6) {
                this.f6205b.m21938S(m21948g + read);
            } else if (this.f6205b.m21942a() == 0) {
                m7140m();
                return -1;
            }
        } else {
            z6 = false;
        }
        int m21947f = this.f6205b.m21947f();
        int i7 = this.f6216m;
        int i8 = this.f6213j;
        if (i7 < i8) {
            C5357z c5357z = this.f6205b;
            c5357z.m21940U(Math.min(i8 - i7, c5357z.m21942a()));
        }
        long m7136e = m7136e(this.f6205b, z6);
        int m21947f2 = this.f6205b.m21947f() - m21947f;
        this.f6205b.m21939T(m21947f);
        this.f6209f.mo564d(this.f6205b, m21947f2);
        this.f6216m += m21947f2;
        if (m7136e != -1) {
            m7140m();
            this.f6216m = 0;
            this.f6217n = m7136e;
        }
        if (this.f6205b.m21942a() < 16) {
            int m21942a = this.f6205b.m21942a();
            System.arraycopy(this.f6205b.m21946e(), this.f6205b.m21947f(), this.f6205b.m21946e(), 0, m21942a);
            this.f6205b.m21939T(0);
            this.f6205b.m21938S(m21942a);
        }
        return 0;
    }

    /* renamed from: o */
    public final void m7142o(InterfaceC0884s interfaceC0884s) {
        this.f6211h = AbstractC0891z.m3711d(interfaceC0884s, !this.f6206c);
        this.f6210g = 1;
    }

    /* renamed from: p */
    public final void m7143p(InterfaceC0884s interfaceC0884s) {
        AbstractC0891z.a aVar = new AbstractC0891z.a(this.f6212i);
        boolean z6 = false;
        while (!z6) {
            z6 = AbstractC0891z.m3712e(interfaceC0884s, aVar);
            this.f6212i = (C0844B) AbstractC5330M.m21747i(aVar.f3107a);
        }
        AbstractC5332a.m21800e(this.f6212i);
        this.f6213j = Math.max(this.f6212i.f2887c, 6);
        ((InterfaceC0861T) AbstractC5330M.m21747i(this.f6209f)).mo566e(this.f6212i.m3508g(this.f6204a, this.f6211h));
        this.f6210g = 4;
    }

    /* renamed from: q */
    public final void m7144q(InterfaceC0884s interfaceC0884s) {
        AbstractC0891z.m3716i(interfaceC0884s);
        this.f6210g = 3;
    }

    public C2009d(int i7) {
        this.f6204a = new byte[42];
        this.f6205b = new C5357z(new byte[32768], 0);
        this.f6206c = (i7 & 1) != 0;
        this.f6207d = new AbstractC0890y.a();
        this.f6210g = 0;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
