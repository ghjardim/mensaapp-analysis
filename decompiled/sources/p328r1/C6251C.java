package p328r1;

import android.net.Uri;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import p078L0.AbstractC0882q;
import p078L0.AbstractC0888w;
import p078L0.C0854L;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0883r;
import p078L0.InterfaceC0884s;
import p078L0.InterfaceC0885t;
import p078L0.InterfaceC0889x;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5332a;
import p259j0.C5322E;
import p259j0.C5356y;
import p259j0.C5357z;
import p328r1.InterfaceC6259K;

/* renamed from: r1.C */
/* loaded from: classes.dex */
public final class C6251C implements InterfaceC0883r {

    /* renamed from: l */
    public static final InterfaceC0889x f22387l = new InterfaceC0889x() { // from class: r1.B
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m26125e;
            m26125e = C6251C.m26125e();
            return m26125e;
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
    public final C5322E f22388a;

    /* renamed from: b */
    public final SparseArray f22389b;

    /* renamed from: c */
    public final C5357z f22390c;

    /* renamed from: d */
    public final C6249A f22391d;

    /* renamed from: e */
    public boolean f22392e;

    /* renamed from: f */
    public boolean f22393f;

    /* renamed from: g */
    public boolean f22394g;

    /* renamed from: h */
    public long f22395h;

    /* renamed from: i */
    public C6287z f22396i;

    /* renamed from: j */
    public InterfaceC0885t f22397j;

    /* renamed from: k */
    public boolean f22398k;

    /* renamed from: r1.C$a */
    public static final class a {

        /* renamed from: a */
        public final InterfaceC6274m f22399a;

        /* renamed from: b */
        public final C5322E f22400b;

        /* renamed from: c */
        public final C5356y f22401c = new C5356y(new byte[64]);

        /* renamed from: d */
        public boolean f22402d;

        /* renamed from: e */
        public boolean f22403e;

        /* renamed from: f */
        public boolean f22404f;

        /* renamed from: g */
        public int f22405g;

        /* renamed from: h */
        public long f22406h;

        public a(InterfaceC6274m interfaceC6274m, C5322E c5322e) {
            this.f22399a = interfaceC6274m;
            this.f22400b = c5322e;
        }

        /* renamed from: a */
        public void m26127a(C5357z c5357z) {
            c5357z.m21953l(this.f22401c.f18880a, 0, 3);
            this.f22401c.m21916p(0);
            m26128b();
            c5357z.m21953l(this.f22401c.f18880a, 0, this.f22405g);
            this.f22401c.m21916p(0);
            m26129c();
            this.f22399a.mo26190e(this.f22406h, 4);
            this.f22399a.mo26186a(c5357z);
            this.f22399a.mo26189d(false);
        }

        /* renamed from: b */
        public final void m26128b() {
            this.f22401c.m21918r(8);
            this.f22402d = this.f22401c.m21907g();
            this.f22403e = this.f22401c.m21907g();
            this.f22401c.m21918r(6);
            this.f22405g = this.f22401c.m21908h(8);
        }

        /* renamed from: c */
        public final void m26129c() {
            this.f22406h = 0L;
            if (this.f22402d) {
                this.f22401c.m21918r(4);
                this.f22401c.m21918r(1);
                this.f22401c.m21918r(1);
                long m21908h = (this.f22401c.m21908h(3) << 30) | (this.f22401c.m21908h(15) << 15) | this.f22401c.m21908h(15);
                this.f22401c.m21918r(1);
                if (!this.f22404f && this.f22403e) {
                    this.f22401c.m21918r(4);
                    this.f22401c.m21918r(1);
                    this.f22401c.m21918r(1);
                    this.f22401c.m21918r(1);
                    this.f22400b.m21651b((this.f22401c.m21908h(3) << 30) | (this.f22401c.m21908h(15) << 15) | this.f22401c.m21908h(15));
                    this.f22404f = true;
                }
                this.f22406h = this.f22400b.m21651b(m21908h);
            }
        }

        /* renamed from: d */
        public void m26130d() {
            this.f22404f = false;
            this.f22399a.mo26187b();
        }
    }

    public C6251C() {
        this(new C5322E(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ InterfaceC0883r[] m26125e() {
        return new InterfaceC0883r[]{new C6251C()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        boolean z6 = this.f22388a.m21655f() == -9223372036854775807L;
        if (!z6) {
            long m21653d = this.f22388a.m21653d();
            z6 = (m21653d == -9223372036854775807L || m21653d == 0 || m21653d == j8) ? false : true;
        }
        if (z6) {
            this.f22388a.m21657i(j8);
        }
        C6287z c6287z = this.f22396i;
        if (c6287z != null) {
            c6287z.m3614h(j8);
        }
        for (int i7 = 0; i7 < this.f22389b.size(); i7++) {
            ((a) this.f22389b.valueAt(i7)).m26130d();
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f22397j = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: f */
    public final void m26126f(long j7) {
        if (this.f22398k) {
            return;
        }
        this.f22398k = true;
        if (this.f22391d.m26115c() == -9223372036854775807L) {
            this.f22397j.mo466j(new InterfaceC0855M.b(this.f22391d.m26115c()));
            return;
        }
        C6287z c6287z = new C6287z(this.f22391d.m26116d(), this.f22391d.m26115c(), j7);
        this.f22396i = c6287z;
        this.f22397j.mo466j(c6287z.m3608b());
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        InterfaceC6274m interfaceC6274m;
        AbstractC5332a.m21804i(this.f22397j);
        long mo3511a = interfaceC0884s.mo3511a();
        if (mo3511a != -1 && !this.f22391d.m26117e()) {
            return this.f22391d.m26119g(interfaceC0884s, c0854l);
        }
        m26126f(mo3511a);
        C6287z c6287z = this.f22396i;
        if (c6287z != null && c6287z.m3610d()) {
            return this.f22396i.m3609c(interfaceC0884s, c0854l);
        }
        interfaceC0884s.mo3518p();
        long mo3514i = mo3511a != -1 ? mo3511a - interfaceC0884s.mo3514i() : -1L;
        if ((mo3514i != -1 && mo3514i < 4) || !interfaceC0884s.mo3513h(this.f22390c.m21946e(), 0, 4, true)) {
            return -1;
        }
        this.f22390c.m21939T(0);
        int m21957p = this.f22390c.m21957p();
        if (m21957p == 441) {
            return -1;
        }
        if (m21957p == 442) {
            interfaceC0884s.mo3521t(this.f22390c.m21946e(), 0, 10);
            this.f22390c.m21939T(9);
            interfaceC0884s.mo3519q((this.f22390c.m21926G() & 7) + 14);
            return 0;
        }
        if (m21957p == 443) {
            interfaceC0884s.mo3521t(this.f22390c.m21946e(), 0, 2);
            this.f22390c.m21939T(0);
            interfaceC0884s.mo3519q(this.f22390c.m21932M() + 6);
            return 0;
        }
        if (((m21957p & (-256)) >> 8) != 1) {
            interfaceC0884s.mo3519q(1);
            return 0;
        }
        int i7 = m21957p & 255;
        a aVar = (a) this.f22389b.get(i7);
        if (!this.f22392e) {
            if (aVar == null) {
                if (i7 == 189) {
                    interfaceC6274m = new C6264c();
                    this.f22393f = true;
                    this.f22395h = interfaceC0884s.mo3522u();
                } else if ((m21957p & 224) == 192) {
                    interfaceC6274m = new C6281t();
                    this.f22393f = true;
                    this.f22395h = interfaceC0884s.mo3522u();
                } else if ((m21957p & 240) == 224) {
                    interfaceC6274m = new C6275n();
                    this.f22394g = true;
                    this.f22395h = interfaceC0884s.mo3522u();
                } else {
                    interfaceC6274m = null;
                }
                if (interfaceC6274m != null) {
                    interfaceC6274m.mo26188c(this.f22397j, new InterfaceC6259K.d(i7, 256));
                    aVar = new a(interfaceC6274m, this.f22388a);
                    this.f22389b.put(i7, aVar);
                }
            }
            if (interfaceC0884s.mo3522u() > ((this.f22393f && this.f22394g) ? this.f22395h + 8192 : 1048576L)) {
                this.f22392e = true;
                this.f22397j.mo472q();
            }
        }
        interfaceC0884s.mo3521t(this.f22390c.m21946e(), 0, 2);
        this.f22390c.m21939T(0);
        int m21932M = this.f22390c.m21932M() + 6;
        if (aVar == null) {
            interfaceC0884s.mo3519q(m21932M);
        } else {
            this.f22390c.m21935P(m21932M);
            interfaceC0884s.readFully(this.f22390c.m21946e(), 0, m21932M);
            this.f22390c.m21939T(6);
            aVar.m26127a(this.f22390c);
            C5357z c5357z = this.f22390c;
            c5357z.m21938S(c5357z.m21943b());
        }
        return 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        byte[] bArr = new byte[14];
        interfaceC0884s.mo3521t(bArr, 0, 14);
        if (442 != (((bArr[0] & ForkServer.ERROR) << 24) | ((bArr[1] & ForkServer.ERROR) << 16) | ((bArr[2] & ForkServer.ERROR) << 8) | (bArr[3] & ForkServer.ERROR)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC0884s.mo3515k(bArr[13] & 7);
        interfaceC0884s.mo3521t(bArr, 0, 3);
        return 1 == ((((bArr[0] & ForkServer.ERROR) << 16) | ((bArr[1] & ForkServer.ERROR) << 8)) | (bArr[2] & ForkServer.ERROR));
    }

    public C6251C(C5322E c5322e) {
        this.f22388a = c5322e;
        this.f22390c = new C5357z(4096);
        this.f22389b = new SparseArray();
        this.f22391d = new C6249A();
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
