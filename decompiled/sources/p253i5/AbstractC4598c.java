package p253i5;

import java.io.InputStream;
import p171Y2.AbstractC2932o;
import p237g5.InterfaceC4447l;
import p237g5.InterfaceC4451n;
import p237g5.InterfaceC4463u;
import p253i5.C4602e;
import p253i5.C4619m0;
import p253i5.InterfaceC4579R0;
import p324q5.AbstractC6227c;
import p324q5.C6226b;
import p324q5.C6229e;

/* renamed from: i5.c */
/* loaded from: classes2.dex */
public abstract class AbstractC4598c implements InterfaceC4578Q0 {

    /* renamed from: i5.c$a */
    public static abstract class a implements C4602e.h, C4619m0.b {

        /* renamed from: a */
        public InterfaceC4644z f16764a;

        /* renamed from: b */
        public final Object f16765b = new Object();

        /* renamed from: c */
        public final C4576P0 f16766c;

        /* renamed from: d */
        public final C4587V0 f16767d;

        /* renamed from: e */
        public final C4619m0 f16768e;

        /* renamed from: f */
        public int f16769f;

        /* renamed from: g */
        public boolean f16770g;

        /* renamed from: h */
        public boolean f16771h;

        /* renamed from: i5.c$a$a, reason: collision with other inner class name */
        public class RunnableC7226a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C6226b f16772a;

            /* renamed from: b */
            public final /* synthetic */ int f16773b;

            public RunnableC7226a(C6226b c6226b, int i7) {
                this.f16772a = c6226b;
                this.f16773b = i7;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6229e m25990h = AbstractC6227c.m25990h("AbstractStream.request");
                    try {
                        AbstractC6227c.m25987e(this.f16772a);
                        a.this.f16764a.mo19861d(this.f16773b);
                        if (m25990h != null) {
                            m25990h.close();
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    a.this.mo19533e(th);
                }
            }
        }

        public a(int i7, C4576P0 c4576p0, C4587V0 c4587v0) {
            this.f16766c = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
            this.f16767d = (C4587V0) AbstractC2932o.m10573p(c4587v0, "transportTracer");
            C4619m0 c4619m0 = new C4619m0(this, InterfaceC4447l.b.f15793a, i7, c4576p0, c4587v0);
            this.f16768e = c4619m0;
            this.f16764a = c4619m0;
        }

        @Override // p253i5.C4619m0.b
        /* renamed from: a */
        public void mo19529a(InterfaceC4579R0.a aVar) {
            mo19791o().mo19386a(aVar);
        }

        /* renamed from: b */
        public final void m19807b(int i7) {
            boolean z6;
            synchronized (this.f16765b) {
                AbstractC2932o.m10579v(this.f16770g, "onStreamAllocated was not called, but it seems the stream is active");
                int i8 = this.f16769f;
                z6 = false;
                boolean z7 = i8 < 32768;
                int i9 = i8 - i7;
                this.f16769f = i9;
                boolean z8 = i9 < 32768;
                if (!z7 && z8) {
                    z6 = true;
                }
            }
            if (z6) {
                m19812p();
            }
        }

        /* renamed from: k */
        public final void m19808k(boolean z6) {
            if (z6) {
                this.f16764a.close();
            } else {
                this.f16764a.mo19863h();
            }
        }

        /* renamed from: l */
        public final void m19809l(InterfaceC4645z0 interfaceC4645z0) {
            try {
                this.f16764a.mo19865m(interfaceC4645z0);
            } catch (Throwable th) {
                mo19533e(th);
            }
        }

        /* renamed from: m */
        public C4587V0 m19810m() {
            return this.f16767d;
        }

        /* renamed from: n */
        public final boolean m19811n() {
            boolean z6;
            synchronized (this.f16765b) {
                try {
                    z6 = this.f16770g && this.f16769f < 32768 && !this.f16771h;
                } finally {
                }
            }
            return z6;
        }

        /* renamed from: o */
        public abstract InterfaceC4579R0 mo19791o();

        /* renamed from: p */
        public final void m19812p() {
            boolean m19811n;
            synchronized (this.f16765b) {
                m19811n = m19811n();
            }
            if (m19811n) {
                mo19791o().mo19389d();
            }
        }

        /* renamed from: q */
        public final void m19813q(int i7) {
            synchronized (this.f16765b) {
                this.f16769f += i7;
            }
        }

        /* renamed from: r */
        public void mo19814r() {
            AbstractC2932o.m10578u(mo19791o() != null);
            synchronized (this.f16765b) {
                AbstractC2932o.m10579v(!this.f16770g, "Already allocated");
                this.f16770g = true;
            }
            m19812p();
        }

        /* renamed from: s */
        public final void m19815s() {
            synchronized (this.f16765b) {
                this.f16771h = true;
            }
        }

        /* renamed from: t */
        public final void m19816t() {
            this.f16768e.m20022G(this);
            this.f16764a = this.f16768e;
        }

        /* renamed from: u */
        public final void m19817u(int i7) {
            mo19869f(new RunnableC7226a(AbstractC6227c.m25988f(), i7));
        }

        /* renamed from: v */
        public final void m19818v(InterfaceC4463u interfaceC4463u) {
            this.f16764a.mo19864j(interfaceC4463u);
        }

        /* renamed from: w */
        public void m19819w(C4582T c4582t) {
            this.f16768e.m20021F(c4582t);
            this.f16764a = new C4602e(this, this, this.f16768e);
        }

        /* renamed from: x */
        public final void m19820x(int i7) {
            this.f16764a.mo19862g(i7);
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: b */
    public boolean mo19367b() {
        return mo19802u().m19811n();
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: d */
    public final void mo19368d(int i7) {
        mo19802u().m19817u(i7);
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: e */
    public final void mo19369e(InterfaceC4451n interfaceC4451n) {
        mo19767s().mo19578e((InterfaceC4451n) AbstractC2932o.m10573p(interfaceC4451n, "compressor"));
    }

    @Override // p253i5.InterfaceC4578Q0
    public final void flush() {
        if (mo19767s().mo19579f()) {
            return;
        }
        mo19767s().flush();
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: o */
    public final void mo19377o(InputStream inputStream) {
        AbstractC2932o.m10573p(inputStream, "message");
        try {
            if (!mo19767s().mo19579f()) {
                mo19767s().mo19580g(inputStream);
            }
        } finally {
            AbstractC4580S.m19599e(inputStream);
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: p */
    public void mo19378p() {
        mo19802u().m19816t();
    }

    /* renamed from: r */
    public final void m19800r() {
        mo19767s().close();
    }

    /* renamed from: s */
    public abstract InterfaceC4575P mo19767s();

    /* renamed from: t */
    public final void m19801t(int i7) {
        mo19802u().m19813q(i7);
    }

    /* renamed from: u */
    public abstract a mo19802u();
}
