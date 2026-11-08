package p253i5;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2932o;
import p186a3.AbstractC3107b;
import p237g5.AbstractC4402C;
import p237g5.C4424Z;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4462t;
import p237g5.C4464v;
import p237g5.InterfaceC4451n;
import p253i5.AbstractC4598c;
import p253i5.C4621n0;
import p253i5.InterfaceC4630s;

/* renamed from: i5.a */
/* loaded from: classes2.dex */
public abstract class AbstractC4594a extends AbstractC4598c implements InterfaceC4628r, C4621n0.d {

    /* renamed from: g */
    public static final Logger f16735g = Logger.getLogger(AbstractC4594a.class.getName());

    /* renamed from: a */
    public final C4587V0 f16736a;

    /* renamed from: b */
    public final InterfaceC4575P f16737b;

    /* renamed from: c */
    public boolean f16738c;

    /* renamed from: d */
    public boolean f16739d;

    /* renamed from: e */
    public C4424Z f16740e;

    /* renamed from: f */
    public volatile boolean f16741f;

    /* renamed from: i5.a$b */
    public interface b {
        /* renamed from: a */
        void mo19772a(C4448l0 c4448l0);

        /* renamed from: b */
        void mo19773b(InterfaceC4589W0 interfaceC4589W0, boolean z6, boolean z7, int i7);

        /* renamed from: c */
        void mo19774c(C4424Z c4424z, byte[] bArr);
    }

    /* renamed from: i5.a$c */
    public static abstract class c extends AbstractC4598c.a {

        /* renamed from: i */
        public final C4576P0 f16747i;

        /* renamed from: j */
        public boolean f16748j;

        /* renamed from: k */
        public InterfaceC4630s f16749k;

        /* renamed from: l */
        public boolean f16750l;

        /* renamed from: m */
        public C4464v f16751m;

        /* renamed from: n */
        public boolean f16752n;

        /* renamed from: o */
        public Runnable f16753o;

        /* renamed from: p */
        public volatile boolean f16754p;

        /* renamed from: q */
        public boolean f16755q;

        /* renamed from: r */
        public boolean f16756r;

        /* renamed from: i5.a$c$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4448l0 f16757a;

            /* renamed from: b */
            public final /* synthetic */ InterfaceC4630s.a f16758b;

            /* renamed from: c */
            public final /* synthetic */ C4424Z f16759c;

            public a(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
                this.f16757a = c4448l0;
                this.f16758b = aVar;
                this.f16759c = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.m19779C(this.f16757a, this.f16758b, this.f16759c);
            }
        }

        public c(int i7, C4576P0 c4576p0, C4587V0 c4587v0) {
            super(i7, c4576p0, c4587v0);
            this.f16751m = C4464v.m19028c();
            this.f16752n = false;
            this.f16747i = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
        }

        /* renamed from: C */
        public final void m19779C(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            if (this.f16748j) {
                return;
            }
            this.f16748j = true;
            this.f16747i.m19594m(c4448l0);
            if (m19810m() != null) {
                m19810m().m19682f(c4448l0.m18961o());
            }
            mo19791o().mo19387b(c4448l0, aVar, c4424z);
        }

        /* renamed from: D */
        public void m19780D(InterfaceC4645z0 interfaceC4645z0) {
            AbstractC2932o.m10573p(interfaceC4645z0, "frame");
            boolean z6 = true;
            try {
                if (this.f16755q) {
                    AbstractC4594a.f16735g.log(Level.INFO, "Received data on closed stream");
                    interfaceC4645z0.close();
                    return;
                }
                try {
                    m19809l(interfaceC4645z0);
                } catch (Throwable th) {
                    th = th;
                    z6 = false;
                    if (z6) {
                        interfaceC4645z0.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
        /* renamed from: E */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void m19781E(p237g5.C4424Z r6) {
            /*
                r5 = this;
                r0 = 0
                r1 = 1
                boolean r2 = r5.f16755q
                r2 = r2 ^ r1
                java.lang.String r3 = "Received headers on closed stream"
                p171Y2.AbstractC2932o.m10579v(r2, r3)
                i5.P0 r2 = r5.f16747i
                r2.m19583a()
                g5.Z$g r2 = p253i5.AbstractC4580S.f16575g
                java.lang.Object r2 = r6.m18779g(r2)
                java.lang.String r2 = (java.lang.String) r2
                boolean r3 = r5.f16750l
                if (r3 == 0) goto L4f
                if (r2 == 0) goto L4f
                java.lang.String r3 = "gzip"
                boolean r3 = r2.equalsIgnoreCase(r3)
                if (r3 == 0) goto L2f
                i5.T r2 = new i5.T
                r2.<init>()
                r5.m19819w(r2)
                r2 = r1
                goto L50
            L2f:
                java.lang.String r3 = "identity"
                boolean r3 = r2.equalsIgnoreCase(r3)
                if (r3 != 0) goto L4f
                g5.l0 r6 = p237g5.C4448l0.f15809s
                java.lang.String r3 = "Can't find full stream decompressor for %s"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r2
                java.lang.String r0 = java.lang.String.format(r3, r1)
                g5.l0 r6 = r6.m18963q(r0)
                g5.n0 r6 = r6.m18956d()
                r5.mo19533e(r6)
                return
            L4f:
                r2 = r0
            L50:
                g5.Z$g r3 = p253i5.AbstractC4580S.f16573e
                java.lang.Object r3 = r6.m18779g(r3)
                java.lang.String r3 = (java.lang.String) r3
                if (r3 == 0) goto L93
                g5.v r4 = r5.f16751m
                g5.u r4 = r4.m19031e(r3)
                if (r4 != 0) goto L7a
                g5.l0 r6 = p237g5.C4448l0.f15809s
                java.lang.String r2 = "Can't find decompressor for %s"
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r0] = r3
                java.lang.String r0 = java.lang.String.format(r2, r1)
                g5.l0 r6 = r6.m18963q(r0)
                g5.n0 r6 = r6.m18956d()
                r5.mo19533e(r6)
                return
            L7a:
                g5.l r0 = p237g5.InterfaceC4447l.b.f15793a
                if (r4 == r0) goto L93
                if (r2 == 0) goto L90
                g5.l0 r6 = p237g5.C4448l0.f15809s
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                g5.l0 r6 = r6.m18963q(r0)
                g5.n0 r6 = r6.m18956d()
                r5.mo19533e(r6)
                return
            L90:
                r5.m19818v(r4)
            L93:
                i5.s r0 = r5.mo19791o()
                r0.mo19388c(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p253i5.AbstractC4594a.c.m19781E(g5.Z):void");
        }

        /* renamed from: F */
        public void m19782F(C4424Z c4424z, C4448l0 c4448l0) {
            AbstractC2932o.m10573p(c4448l0, "status");
            AbstractC2932o.m10573p(c4424z, "trailers");
            if (this.f16755q) {
                AbstractC4594a.f16735g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{c4448l0, c4424z});
            } else {
                this.f16747i.m19584b(c4424z);
                m19790N(c4448l0, false, c4424z);
            }
        }

        /* renamed from: G */
        public final boolean m19783G() {
            return this.f16754p;
        }

        @Override // p253i5.AbstractC4598c.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4630s mo19791o() {
            return this.f16749k;
        }

        /* renamed from: I */
        public final void m19785I(C4464v c4464v) {
            AbstractC2932o.m10579v(this.f16749k == null, "Already called start");
            this.f16751m = (C4464v) AbstractC2932o.m10573p(c4464v, "decompressorRegistry");
        }

        /* renamed from: J */
        public final void m19786J(boolean z6) {
            this.f16750l = z6;
        }

        /* renamed from: K */
        public final void m19787K(InterfaceC4630s interfaceC4630s) {
            AbstractC2932o.m10579v(this.f16749k == null, "Already called setListener");
            this.f16749k = (InterfaceC4630s) AbstractC2932o.m10573p(interfaceC4630s, "listener");
        }

        /* renamed from: L */
        public final void m19788L() {
            this.f16754p = true;
        }

        /* renamed from: M */
        public final void m19789M(C4448l0 c4448l0, InterfaceC4630s.a aVar, boolean z6, C4424Z c4424z) {
            AbstractC2932o.m10573p(c4448l0, "status");
            AbstractC2932o.m10573p(c4424z, "trailers");
            if (!this.f16755q || z6) {
                this.f16755q = true;
                this.f16756r = c4448l0.m18961o();
                m19815s();
                if (this.f16752n) {
                    this.f16753o = null;
                    m19779C(c4448l0, aVar, c4424z);
                } else {
                    this.f16753o = new a(c4448l0, aVar, c4424z);
                    m19808k(z6);
                }
            }
        }

        /* renamed from: N */
        public final void m19790N(C4448l0 c4448l0, boolean z6, C4424Z c4424z) {
            m19789M(c4448l0, InterfaceC4630s.a.PROCESSED, z6, c4424z);
        }

        /* renamed from: c */
        public void mo19531c(boolean z6) {
            AbstractC2932o.m10579v(this.f16755q, "status should have been reported on deframer closed");
            this.f16752n = true;
            if (this.f16756r && z6) {
                m19790N(C4448l0.f15809s.m18963q("Encountered end-of-stream mid-frame"), true, new C4424Z());
            }
            Runnable runnable = this.f16753o;
            if (runnable != null) {
                runnable.run();
                this.f16753o = null;
            }
        }
    }

    public AbstractC4594a(InterfaceC4591X0 interfaceC4591X0, C4576P0 c4576p0, C4587V0 c4587v0, C4424Z c4424z, C4429c c4429c, boolean z6) {
        AbstractC2932o.m10573p(c4424z, "headers");
        this.f16736a = (C4587V0) AbstractC2932o.m10573p(c4587v0, "transportTracer");
        this.f16738c = AbstractC4580S.m19610p(c4429c);
        this.f16739d = z6;
        if (z6) {
            this.f16737b = new a(c4424z, c4576p0);
        } else {
            this.f16737b = new C4621n0(this, interfaceC4591X0, c4576p0);
            this.f16740e = c4424z;
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: a */
    public final void mo19360a(C4448l0 c4448l0) {
        AbstractC2932o.m10562e(!c4448l0.m18961o(), "Should not cancel with OK status");
        this.f16741f = true;
        mo19768v().mo19772a(c4448l0);
    }

    @Override // p253i5.AbstractC4598c, p253i5.InterfaceC4578Q0
    /* renamed from: b */
    public final boolean mo19367b() {
        return super.mo19367b() && !this.f16741f;
    }

    @Override // p253i5.C4621n0.d
    /* renamed from: f */
    public final void mo19766f(InterfaceC4589W0 interfaceC4589W0, boolean z6, boolean z7, int i7) {
        AbstractC2932o.m10562e(interfaceC4589W0 != null || z6, "null frame before EOS");
        mo19768v().mo19773b(interfaceC4589W0, z6, z7, i7);
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: g */
    public void mo19370g(int i7) {
        mo19771z().m19820x(i7);
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: h */
    public void mo19371h(int i7) {
        this.f16737b.mo19581h(i7);
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: i */
    public final void mo19372i(InterfaceC4630s interfaceC4630s) {
        mo19771z().m19787K(interfaceC4630s);
        if (this.f16739d) {
            return;
        }
        mo19768v().mo19774c(this.f16740e, null);
        this.f16740e = null;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: j */
    public final void mo19361j(C4592Y c4592y) {
        c4592y.m19704b("remote_addr", mo20103c().m18819b(AbstractC4402C.f15589a));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: l */
    public final void mo19374l() {
        if (mo19771z().m19783G()) {
            return;
        }
        mo19771z().m19788L();
        m19800r();
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: m */
    public void mo19375m(C4462t c4462t) {
        C4424Z c4424z = this.f16740e;
        C4424Z.g gVar = AbstractC4580S.f16572d;
        c4424z.m18777e(gVar);
        this.f16740e.m18788p(gVar, Long.valueOf(Math.max(0L, c4462t.m19025n(TimeUnit.NANOSECONDS))));
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: n */
    public final void mo19376n(C4464v c4464v) {
        mo19771z().m19785I(c4464v);
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: q */
    public final void mo19379q(boolean z6) {
        mo19771z().m19786J(z6);
    }

    @Override // p253i5.AbstractC4598c
    /* renamed from: s */
    public final InterfaceC4575P mo19767s() {
        return this.f16737b;
    }

    /* renamed from: v */
    public abstract b mo19768v();

    /* renamed from: x */
    public C4587V0 m19769x() {
        return this.f16736a;
    }

    /* renamed from: y */
    public final boolean m19770y() {
        return this.f16738c;
    }

    /* renamed from: z */
    public abstract c mo19771z();

    /* renamed from: i5.a$a */
    public class a implements InterfaceC4575P {

        /* renamed from: a */
        public C4424Z f16742a;

        /* renamed from: b */
        public boolean f16743b;

        /* renamed from: c */
        public final C4576P0 f16744c;

        /* renamed from: d */
        public byte[] f16745d;

        public a(C4424Z c4424z, C4576P0 c4576p0) {
            this.f16742a = (C4424Z) AbstractC2932o.m10573p(c4424z, "headers");
            this.f16744c = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
        }

        @Override // p253i5.InterfaceC4575P
        public void close() {
            this.f16743b = true;
            AbstractC2932o.m10579v(this.f16745d != null, "Lack of request message. GET request is only supported for unary requests");
            AbstractC4594a.this.mo19768v().mo19774c(this.f16742a, this.f16745d);
            this.f16745d = null;
            this.f16742a = null;
        }

        @Override // p253i5.InterfaceC4575P
        /* renamed from: f */
        public boolean mo19579f() {
            return this.f16743b;
        }

        @Override // p253i5.InterfaceC4575P
        /* renamed from: g */
        public void mo19580g(InputStream inputStream) {
            AbstractC2932o.m10579v(this.f16745d == null, "writePayload should not be called multiple times");
            try {
                this.f16745d = AbstractC3107b.m11352d(inputStream);
                this.f16744c.m19590i(0);
                C4576P0 c4576p0 = this.f16744c;
                byte[] bArr = this.f16745d;
                c4576p0.m19591j(0, bArr.length, bArr.length);
                this.f16744c.m19592k(this.f16745d.length);
                this.f16744c.m19593l(this.f16745d.length);
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }

        @Override // p253i5.InterfaceC4575P
        public void flush() {
        }

        @Override // p253i5.InterfaceC4575P
        /* renamed from: e */
        public InterfaceC4575P mo19578e(InterfaceC4451n interfaceC4451n) {
            return this;
        }

        @Override // p253i5.InterfaceC4575P
        /* renamed from: h */
        public void mo19581h(int i7) {
        }
    }
}
