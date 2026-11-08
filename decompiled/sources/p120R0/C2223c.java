package p120R0;

import android.net.Uri;
import java.util.List;
import java.util.Map;
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
import p259j0.C5357z;

/* renamed from: R0.c */
/* loaded from: classes.dex */
public final class C2223c implements InterfaceC0883r {

    /* renamed from: q */
    public static final InterfaceC0889x f6799q = new InterfaceC0889x() { // from class: R0.b
        @Override // p078L0.InterfaceC0889x
        /* renamed from: a */
        public /* synthetic */ InterfaceC0889x mo647a(InterfaceC4529t.a aVar) {
            return AbstractC0888w.m3696c(this, aVar);
        }

        @Override // p078L0.InterfaceC0889x
        /* renamed from: b */
        public final InterfaceC0883r[] mo648b() {
            InterfaceC0883r[] m7627j;
            m7627j = C2223c.m7627j();
            return m7627j;
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

    /* renamed from: f */
    public InterfaceC0885t f6805f;

    /* renamed from: h */
    public boolean f6807h;

    /* renamed from: i */
    public long f6808i;

    /* renamed from: j */
    public int f6809j;

    /* renamed from: k */
    public int f6810k;

    /* renamed from: l */
    public int f6811l;

    /* renamed from: m */
    public long f6812m;

    /* renamed from: n */
    public boolean f6813n;

    /* renamed from: o */
    public C2221a f6814o;

    /* renamed from: p */
    public C2226f f6815p;

    /* renamed from: a */
    public final C5357z f6800a = new C5357z(4);

    /* renamed from: b */
    public final C5357z f6801b = new C5357z(9);

    /* renamed from: c */
    public final C5357z f6802c = new C5357z(11);

    /* renamed from: d */
    public final C5357z f6803d = new C5357z();

    /* renamed from: e */
    public final C2224d f6804e = new C2224d();

    /* renamed from: g */
    public int f6806g = 1;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ InterfaceC0883r[] m7627j() {
        return new InterfaceC0883r[]{new C2223c()};
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: a */
    public void mo695a(long j7, long j8) {
        if (j7 == 0) {
            this.f6806g = 1;
            this.f6807h = false;
        } else {
            this.f6806g = 3;
        }
        this.f6809j = 0;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: b */
    public void mo696b(InterfaceC0885t interfaceC0885t) {
        this.f6805f = interfaceC0885t;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: d */
    public /* synthetic */ InterfaceC0883r mo697d() {
        return AbstractC0882q.m3688b(this);
    }

    /* renamed from: e */
    public final void m7628e() {
        if (this.f6813n) {
            return;
        }
        this.f6805f.mo466j(new InterfaceC0855M.b(-9223372036854775807L));
        this.f6813n = true;
    }

    /* renamed from: f */
    public final long m7629f() {
        if (this.f6807h) {
            return this.f6808i + this.f6812m;
        }
        if (this.f6804e.m7644d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f6812m;
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: g */
    public /* synthetic */ List mo698g() {
        return AbstractC0882q.m3687a(this);
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: h */
    public int mo699h(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        AbstractC5332a.m21804i(this.f6805f);
        while (true) {
            int i7 = this.f6806g;
            if (i7 != 1) {
                if (i7 == 2) {
                    m7634o(interfaceC0884s);
                } else if (i7 != 3) {
                    if (i7 != 4) {
                        throw new IllegalStateException();
                    }
                    if (m7632m(interfaceC0884s)) {
                        return 0;
                    }
                } else if (!m7633n(interfaceC0884s)) {
                    return -1;
                }
            } else if (!m7631l(interfaceC0884s)) {
                return -1;
            }
        }
    }

    @Override // p078L0.InterfaceC0883r
    /* renamed from: i */
    public boolean mo700i(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3521t(this.f6800a.m21946e(), 0, 3);
        this.f6800a.m21939T(0);
        if (this.f6800a.m21929J() != 4607062) {
            return false;
        }
        interfaceC0884s.mo3521t(this.f6800a.m21946e(), 0, 2);
        this.f6800a.m21939T(0);
        if ((this.f6800a.m21932M() & 250) != 0) {
            return false;
        }
        interfaceC0884s.mo3521t(this.f6800a.m21946e(), 0, 4);
        this.f6800a.m21939T(0);
        int m21957p = this.f6800a.m21957p();
        interfaceC0884s.mo3518p();
        interfaceC0884s.mo3515k(m21957p);
        interfaceC0884s.mo3521t(this.f6800a.m21946e(), 0, 4);
        this.f6800a.m21939T(0);
        return this.f6800a.m21957p() == 0;
    }

    /* renamed from: k */
    public final C5357z m7630k(InterfaceC0884s interfaceC0884s) {
        if (this.f6811l > this.f6803d.m21943b()) {
            C5357z c5357z = this.f6803d;
            c5357z.m21937R(new byte[Math.max(c5357z.m21943b() * 2, this.f6811l)], 0);
        } else {
            this.f6803d.m21939T(0);
        }
        this.f6803d.m21938S(this.f6811l);
        interfaceC0884s.readFully(this.f6803d.m21946e(), 0, this.f6811l);
        return this.f6803d;
    }

    /* renamed from: l */
    public final boolean m7631l(InterfaceC0884s interfaceC0884s) {
        if (!interfaceC0884s.mo3512d(this.f6801b.m21946e(), 0, 9, true)) {
            return false;
        }
        this.f6801b.m21939T(0);
        this.f6801b.m21940U(4);
        int m21926G = this.f6801b.m21926G();
        boolean z6 = (m21926G & 4) != 0;
        boolean z7 = (m21926G & 1) != 0;
        if (z6 && this.f6814o == null) {
            this.f6814o = new C2221a(this.f6805f.mo455b(8, 1));
        }
        if (z7 && this.f6815p == null) {
            this.f6815p = new C2226f(this.f6805f.mo455b(9, 2));
        }
        this.f6805f.mo472q();
        this.f6809j = this.f6801b.m21957p() - 5;
        this.f6806g = 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m7632m(p078L0.InterfaceC0884s r10) {
        /*
            r9 = this;
            long r0 = r9.m7629f()
            int r2 = r9.f6810k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            R0.a r3 = r9.f6814o
            if (r3 == 0) goto L23
            r9.m7628e()
            R0.a r2 = r9.f6814o
            j0.z r10 = r9.m7630k(r10)
            boolean r10 = r2.m7647a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            R0.f r3 = r9.f6815p
            if (r3 == 0) goto L39
            r9.m7628e()
            R0.f r2 = r9.f6815p
            j0.z r10 = r9.m7630k(r10)
            boolean r10 = r2.m7647a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f6813n
            if (r2 != 0) goto L6e
            R0.d r2 = r9.f6804e
            j0.z r10 = r9.m7630k(r10)
            boolean r10 = r2.m7647a(r10, r0)
            R0.d r0 = r9.f6804e
            long r0 = r0.m7644d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            L0.t r2 = r9.f6805f
            L0.H r3 = new L0.H
            R0.d r7 = r9.f6804e
            long[] r7 = r7.m7645e()
            R0.d r8 = r9.f6804e
            long[] r8 = r8.m7646f()
            r3.<init>(r7, r8, r0)
            r2.mo466j(r3)
            r9.f6813n = r6
            goto L21
        L6e:
            int r0 = r9.f6811l
            r10.mo3519q(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f6807h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f6807h = r6
            R0.d r10 = r9.f6804e
            long r1 = r10.m7644d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f6812m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f6808i = r1
        L8f:
            r10 = 4
            r9.f6809j = r10
            r10 = 2
            r9.f6806g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p120R0.C2223c.m7632m(L0.s):boolean");
    }

    /* renamed from: n */
    public final boolean m7633n(InterfaceC0884s interfaceC0884s) {
        if (!interfaceC0884s.mo3512d(this.f6802c.m21946e(), 0, 11, true)) {
            return false;
        }
        this.f6802c.m21939T(0);
        this.f6810k = this.f6802c.m21926G();
        this.f6811l = this.f6802c.m21929J();
        this.f6812m = this.f6802c.m21929J();
        this.f6812m = ((this.f6802c.m21926G() << 24) | this.f6812m) * 1000;
        this.f6802c.m21940U(3);
        this.f6806g = 4;
        return true;
    }

    /* renamed from: o */
    public final void m7634o(InterfaceC0884s interfaceC0884s) {
        interfaceC0884s.mo3519q(this.f6809j);
        this.f6809j = 0;
        this.f6806g = 3;
    }

    @Override // p078L0.InterfaceC0883r
    public void release() {
    }
}
