package p264j5;

import java.util.List;
import p171Y2.AbstractC2932o;
import p186a3.AbstractC3106a;
import p206c6.C3616d;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p253i5.AbstractC4586V;
import p253i5.AbstractC4594a;
import p253i5.C4576P0;
import p253i5.C4587V0;
import p253i5.InterfaceC4589W0;
import p253i5.InterfaceC4630s;
import p264j5.C5389r;
import p281l5.EnumC5539a;
import p324q5.AbstractC6227c;
import p324q5.C6228d;
import p324q5.C6229e;

/* renamed from: j5.h */
/* loaded from: classes2.dex */
public class C5379h extends AbstractC4594a {

    /* renamed from: p */
    public static final C3616d f19086p = new C3616d();

    /* renamed from: h */
    public final C4426a0 f19087h;

    /* renamed from: i */
    public final String f19088i;

    /* renamed from: j */
    public final C4576P0 f19089j;

    /* renamed from: k */
    public String f19090k;

    /* renamed from: l */
    public final b f19091l;

    /* renamed from: m */
    public final a f19092m;

    /* renamed from: n */
    public final C4425a f19093n;

    /* renamed from: o */
    public boolean f19094o;

    /* renamed from: j5.h$a */
    public class a implements AbstractC4594a.b {
        public a() {
        }

        @Override // p253i5.AbstractC4594a.b
        /* renamed from: a */
        public void mo19772a(C4448l0 c4448l0) {
            C6229e m25990h = AbstractC6227c.m25990h("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (C5379h.this.f19091l.f19112z) {
                    C5379h.this.f19091l.m22157a0(c4448l0, true, null);
                }
                if (m25990h != null) {
                    m25990h.close();
                }
            } catch (Throwable th) {
                if (m25990h != null) {
                    try {
                        m25990h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p253i5.AbstractC4594a.b
        /* renamed from: b */
        public void mo19773b(InterfaceC4589W0 interfaceC4589W0, boolean z6, boolean z7, int i7) {
            C3616d m22267e;
            C6229e m25990h = AbstractC6227c.m25990h("OkHttpClientStream$Sink.writeFrame");
            try {
                if (interfaceC4589W0 == null) {
                    m22267e = C5379h.f19086p;
                } else {
                    m22267e = ((C5387p) interfaceC4589W0).m22267e();
                    int m14618c0 = (int) m22267e.m14618c0();
                    if (m14618c0 > 0) {
                        C5379h.this.m19801t(m14618c0);
                    }
                }
                synchronized (C5379h.this.f19091l.f19112z) {
                    C5379h.this.f19091l.m22161e0(m22267e, z6, z7);
                    C5379h.this.m19769x().m19681e(i7);
                }
                if (m25990h != null) {
                    m25990h.close();
                }
            } catch (Throwable th) {
                if (m25990h != null) {
                    try {
                        m25990h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        @Override // p253i5.AbstractC4594a.b
        /* renamed from: c */
        public void mo19774c(C4424Z c4424z, byte[] bArr) {
            C6229e m25990h = AbstractC6227c.m25990h("OkHttpClientStream$Sink.writeHeaders");
            try {
                String str = "/" + C5379h.this.f19087h.m18830c();
                if (bArr != null) {
                    C5379h.this.f19094o = true;
                    str = str + "?" + AbstractC3106a.m11329a().m11334e(bArr);
                }
                synchronized (C5379h.this.f19091l.f19112z) {
                    C5379h.this.f19091l.m22163g0(c4424z, str);
                }
                if (m25990h != null) {
                    m25990h.close();
                }
            } catch (Throwable th) {
                if (m25990h != null) {
                    try {
                        m25990h.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: j5.h$b */
    public class b extends AbstractC4586V implements C5389r.b {

        /* renamed from: A */
        public List f19096A;

        /* renamed from: B */
        public C3616d f19097B;

        /* renamed from: C */
        public boolean f19098C;

        /* renamed from: D */
        public boolean f19099D;

        /* renamed from: E */
        public boolean f19100E;

        /* renamed from: F */
        public int f19101F;

        /* renamed from: G */
        public int f19102G;

        /* renamed from: H */
        public final C5373b f19103H;

        /* renamed from: I */
        public final C5389r f19104I;

        /* renamed from: J */
        public final C5380i f19105J;

        /* renamed from: K */
        public boolean f19106K;

        /* renamed from: L */
        public final C6228d f19107L;

        /* renamed from: M */
        public C5389r.c f19108M;

        /* renamed from: N */
        public int f19109N;

        /* renamed from: y */
        public final int f19111y;

        /* renamed from: z */
        public final Object f19112z;

        public b(int i7, C4576P0 c4576p0, Object obj, C5373b c5373b, C5389r c5389r, C5380i c5380i, int i8, String str) {
            super(i7, c4576p0, C5379h.this.m19769x());
            this.f19097B = new C3616d();
            this.f19098C = false;
            this.f19099D = false;
            this.f19100E = false;
            this.f19106K = true;
            this.f19109N = -1;
            this.f19112z = AbstractC2932o.m10573p(obj, "lock");
            this.f19103H = c5373b;
            this.f19104I = c5389r;
            this.f19105J = c5380i;
            this.f19101F = i8;
            this.f19102G = i8;
            this.f19111y = i8;
            this.f19107L = AbstractC6227c.m25984b(str);
        }

        @Override // p253i5.AbstractC4586V
        /* renamed from: P */
        public void mo19669P(C4448l0 c4448l0, boolean z6, C4424Z c4424z) {
            m22157a0(c4448l0, z6, c4424z);
        }

        /* renamed from: a0 */
        public final void m22157a0(C4448l0 c4448l0, boolean z6, C4424Z c4424z) {
            if (this.f19100E) {
                return;
            }
            this.f19100E = true;
            if (!this.f19106K) {
                this.f19105J.m22207V(m22159c0(), c4448l0, InterfaceC4630s.a.PROCESSED, z6, EnumC5539a.CANCEL, c4424z);
                return;
            }
            this.f19105J.m22219h0(C5379h.this);
            this.f19096A = null;
            this.f19097B.m14617c();
            this.f19106K = false;
            if (c4424z == null) {
                c4424z = new C4424Z();
            }
            m19790N(c4448l0, true, c4424z);
        }

        /* renamed from: b0 */
        public C5389r.c m22158b0() {
            C5389r.c cVar;
            synchronized (this.f19112z) {
                cVar = this.f19108M;
            }
            return cVar;
        }

        @Override // p253i5.AbstractC4586V, p253i5.AbstractC4594a.c, p253i5.C4619m0.b
        /* renamed from: c */
        public void mo19531c(boolean z6) {
            m22160d0();
            super.mo19531c(z6);
        }

        /* renamed from: c0 */
        public int m22159c0() {
            return this.f19109N;
        }

        @Override // p253i5.C4619m0.b
        /* renamed from: d */
        public void mo19532d(int i7) {
            int i8 = this.f19102G - i7;
            this.f19102G = i8;
            float f7 = i8;
            int i9 = this.f19111y;
            if (f7 <= i9 * 0.5f) {
                int i10 = i9 - i8;
                this.f19101F += i10;
                this.f19102G = i8 + i10;
                this.f19103H.mo22120f(m22159c0(), i10);
            }
        }

        /* renamed from: d0 */
        public final void m22160d0() {
            if (m19783G()) {
                this.f19105J.m22207V(m22159c0(), null, InterfaceC4630s.a.PROCESSED, false, null, null);
            } else {
                this.f19105J.m22207V(m22159c0(), null, InterfaceC4630s.a.PROCESSED, false, EnumC5539a.CANCEL, null);
            }
        }

        @Override // p253i5.C4619m0.b
        /* renamed from: e */
        public void mo19533e(Throwable th) {
            mo19669P(C4448l0.m18954k(th), true, new C4424Z());
        }

        /* renamed from: e0 */
        public final void m22161e0(C3616d c3616d, boolean z6, boolean z7) {
            if (this.f19100E) {
                return;
            }
            if (!this.f19106K) {
                AbstractC2932o.m10579v(m22159c0() != -1, "streamId should be set");
                this.f19104I.m22271d(z6, this.f19108M, c3616d, z7);
            } else {
                this.f19097B.mo14482s(c3616d, (int) c3616d.m14618c0());
                this.f19098C |= z6;
                this.f19099D |= z7;
            }
        }

        @Override // p253i5.C4604f.d
        /* renamed from: f */
        public void mo19869f(Runnable runnable) {
            synchronized (this.f19112z) {
                runnable.run();
            }
        }

        /* renamed from: f0 */
        public void m22162f0(int i7) {
            AbstractC2932o.m10580w(this.f19109N == -1, "the stream has been started with id %s", i7);
            this.f19109N = i7;
            this.f19108M = this.f19104I.m22270c(this, i7);
            C5379h.this.f19091l.mo19814r();
            if (this.f19106K) {
                this.f19103H.mo22123r0(C5379h.this.f19094o, false, this.f19109N, 0, this.f19096A);
                C5379h.this.f19089j.m19585c();
                this.f19096A = null;
                if (this.f19097B.m14618c0() > 0) {
                    this.f19104I.m22271d(this.f19098C, this.f19108M, this.f19097B, this.f19099D);
                }
                this.f19106K = false;
            }
        }

        /* renamed from: g0 */
        public final void m22163g0(C4424Z c4424z, String str) {
            this.f19096A = AbstractC5375d.m22126b(c4424z, str, C5379h.this.f19090k, C5379h.this.f19088i, C5379h.this.f19094o, this.f19105J.m22214b0());
            this.f19105J.m22226o0(C5379h.this);
        }

        /* renamed from: h0 */
        public C6228d m22164h0() {
            return this.f19107L;
        }

        /* renamed from: i0 */
        public void m22165i0(C3616d c3616d, boolean z6, int i7) {
            int m14618c0 = this.f19101F - (((int) c3616d.m14618c0()) + i7);
            this.f19101F = m14618c0;
            this.f19102G -= i7;
            if (m14618c0 >= 0) {
                super.m19671S(new C5383l(c3616d), z6);
            } else {
                this.f19103H.mo22113e(m22159c0(), EnumC5539a.FLOW_CONTROL_ERROR);
                this.f19105J.m22207V(m22159c0(), C4448l0.f15809s.m18963q("Received data size exceeded our receiving window size"), InterfaceC4630s.a.PROCESSED, false, null, null);
            }
        }

        /* renamed from: j0 */
        public void m22166j0(List list, boolean z6) {
            if (z6) {
                m19673U(AbstractC5390s.m22293c(list));
            } else {
                m19672T(AbstractC5390s.m22291a(list));
            }
        }

        @Override // p253i5.AbstractC4598c.a
        /* renamed from: r */
        public void mo19814r() {
            super.mo19814r();
            m19810m().m19679c();
        }
    }

    public C5379h(C4426a0 c4426a0, C4424Z c4424z, C5373b c5373b, C5380i c5380i, C5389r c5389r, Object obj, int i7, int i8, String str, String str2, C4576P0 c4576p0, C4587V0 c4587v0, C4429c c4429c, boolean z6) {
        super(new C5388q(), c4576p0, c4587v0, c4424z, c4429c, z6 && c4426a0.m18833f());
        this.f19092m = new a();
        this.f19094o = false;
        this.f19089j = (C4576P0) AbstractC2932o.m10573p(c4576p0, "statsTraceCtx");
        this.f19087h = c4426a0;
        this.f19090k = str;
        this.f19088i = str2;
        this.f19093n = c5380i.mo19521c();
        this.f19091l = new b(i7, c4576p0, obj, c5373b, c5389r, c5380i, i8, c4426a0.m18830c());
    }

    @Override // p253i5.AbstractC4594a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public a mo19768v() {
        return this.f19092m;
    }

    /* renamed from: M */
    public C4426a0.d m22150M() {
        return this.f19087h.m18832e();
    }

    @Override // p253i5.AbstractC4594a
    /* renamed from: N, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public b mo19771z() {
        return this.f19091l;
    }

    /* renamed from: O */
    public boolean m22152O() {
        return this.f19094o;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: c */
    public C4425a mo20103c() {
        return this.f19093n;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: k */
    public void mo19373k(String str) {
        this.f19090k = (String) AbstractC2932o.m10573p(str, "authority");
    }
}
