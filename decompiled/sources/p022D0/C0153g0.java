package p022D0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0127M;
import p043G0.InterfaceC0375y;
import p050H0.C0545n;
import p050H0.InterfaceC0544m;
import p232g0.AbstractC4336z;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;

/* renamed from: D0.g0 */
/* loaded from: classes.dex */
public final class C0153g0 implements InterfaceC0117C, C0545n.b {

    /* renamed from: a */
    public final C5497k f621a;

    /* renamed from: b */
    public final InterfaceC5493g.a f622b;

    /* renamed from: c */
    public final InterfaceC5511y f623c;

    /* renamed from: d */
    public final InterfaceC0544m f624d;

    /* renamed from: e */
    public final InterfaceC0127M.a f625e;

    /* renamed from: f */
    public final C0165m0 f626f;

    /* renamed from: o */
    public final long f628o;

    /* renamed from: q */
    public final C4327q f630q;

    /* renamed from: r */
    public final boolean f631r;

    /* renamed from: s */
    public boolean f632s;

    /* renamed from: t */
    public byte[] f633t;

    /* renamed from: u */
    public int f634u;

    /* renamed from: n */
    public final ArrayList f627n = new ArrayList();

    /* renamed from: p */
    public final C0545n f629p = new C0545n("SingleSampleMediaPeriod");

    /* renamed from: D0.g0$b */
    public final class b implements InterfaceC0145c0 {

        /* renamed from: a */
        public int f635a;

        /* renamed from: b */
        public boolean f636b;

        public b() {
        }

        /* renamed from: a */
        public final void m614a() {
            if (this.f636b) {
                return;
            }
            C0153g0.this.f625e.m365h(AbstractC4336z.m18418k(C0153g0.this.f630q.f15138n), C0153g0.this.f630q, 0, null, 0L);
            this.f636b = true;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return C0153g0.this.f632s;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            C0153g0 c0153g0 = C0153g0.this;
            if (c0153g0.f631r) {
                return;
            }
            c0153g0.f629p.mo2097c();
        }

        /* renamed from: d */
        public void m615d() {
            if (this.f635a == 2) {
                this.f635a = 1;
            }
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            m614a();
            if (j7 <= 0 || this.f635a == 2) {
                return 0;
            }
            this.f635a = 2;
            return 1;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            m614a();
            C0153g0 c0153g0 = C0153g0.this;
            boolean z6 = c0153g0.f632s;
            if (z6 && c0153g0.f633t == null) {
                this.f635a = 2;
            }
            int i8 = this.f635a;
            if (i8 == 2) {
                c5561i.m23272i(4);
                return -4;
            }
            if ((i7 & 2) != 0 || i8 == 0) {
                c5756s0.f20950b = c0153g0.f630q;
                this.f635a = 1;
                return -5;
            }
            if (!z6) {
                return -3;
            }
            AbstractC5332a.m21800e(c0153g0.f633t);
            c5561i.m23272i(1);
            c5561i.f20079f = 0L;
            if ((i7 & 4) == 0) {
                c5561i.m23290s(C0153g0.this.f634u);
                ByteBuffer byteBuffer = c5561i.f20077d;
                C0153g0 c0153g02 = C0153g0.this;
                byteBuffer.put(c0153g02.f633t, 0, c0153g02.f634u);
            }
            if ((i7 & 1) == 0) {
                this.f635a = 2;
            }
            return -4;
        }
    }

    public C0153g0(C5497k c5497k, InterfaceC5493g.a aVar, InterfaceC5511y interfaceC5511y, C4327q c4327q, long j7, InterfaceC0544m interfaceC0544m, InterfaceC0127M.a aVar2, boolean z6) {
        this.f621a = c5497k;
        this.f622b = aVar;
        this.f623c = interfaceC5511y;
        this.f630q = c4327q;
        this.f628o = j7;
        this.f624d = interfaceC0544m;
        this.f625e = aVar2;
        this.f631r = z6;
        this.f626f = new C0165m0(new C4304J(c4327q));
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return (this.f632s || this.f629p.m2101j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // p050H0.C0545n.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo468k(c cVar, long j7, long j8, boolean z6) {
        C5510x c5510x = cVar.f640c;
        C0179y c0179y = new C0179y(cVar.f638a, cVar.f639b, c5510x.m23137v(), c5510x.m23138w(), j7, j8, c5510x.m23136g());
        this.f624d.mo2086b(cVar.f638a);
        this.f625e.m374q(c0179y, 1, -1, null, 0, null, 0L, this.f628o);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return this.f629p.m2101j();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        if (this.f632s || this.f629p.m2101j() || this.f629p.m2100i()) {
            return false;
        }
        InterfaceC5493g mo23075a = this.f622b.mo23075a();
        InterfaceC5511y interfaceC5511y = this.f623c;
        if (interfaceC5511y != null) {
            mo23075a.mo711c(interfaceC5511y);
        }
        c cVar = new c(this.f621a, mo23075a);
        this.f625e.m383z(new C0179y(cVar.f638a, this.f621a, this.f629p.m2105n(cVar, this, this.f624d.mo2088d(1))), 1, -1, this.f630q, 0, null, 0L, this.f628o);
        return true;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        return this.f632s ? Long.MIN_VALUE : 0L;
    }

    @Override // p050H0.C0545n.b
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void mo473r(c cVar, long j7, long j8) {
        this.f634u = (int) cVar.f640c.m23136g();
        this.f633t = (byte[]) AbstractC5332a.m21800e(cVar.f641d);
        this.f632s = true;
        C5510x c5510x = cVar.f640c;
        C0179y c0179y = new C0179y(cVar.f638a, cVar.f639b, c5510x.m23137v(), c5510x.m23138w(), j7, j8, this.f634u);
        this.f624d.mo2086b(cVar.f638a);
        this.f625e.m377t(c0179y, 1, -1, this.f630q, 0, null, 0L, this.f628o);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C0545n.c mo471m(c cVar, long j7, long j8, IOException iOException, int i7) {
        C0545n.c m2096h;
        C5510x c5510x = cVar.f640c;
        C0179y c0179y = new C0179y(cVar.f638a, cVar.f639b, c5510x.m23137v(), c5510x.m23138w(), j7, j8, c5510x.m23136g());
        long mo2087c = this.f624d.mo2087c(new InterfaceC0544m.c(c0179y, new C0116B(1, -1, this.f630q, 0, null, 0L, AbstractC5330M.m21758l1(this.f628o)), iOException, i7));
        boolean z6 = mo2087c == -9223372036854775807L || i7 >= this.f624d.mo2088d(1);
        if (this.f631r && z6) {
            AbstractC5346o.m21868i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f632s = true;
            m2096h = C0545n.f1787f;
        } else {
            m2096h = mo2087c != -9223372036854775807L ? C0545n.m2096h(false, mo2087c) : C0545n.f1788g;
        }
        C0545n.c cVar2 = m2096h;
        boolean m2108c = cVar2.m2108c();
        this.f625e.m379v(c0179y, 1, -1, this.f630q, 0, null, 0L, this.f628o, iOException, !m2108c);
        if (!m2108c) {
            this.f624d.mo2086b(cVar.f638a);
        }
        return cVar2;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            InterfaceC0145c0 interfaceC0145c0 = interfaceC0145c0Arr[i7];
            if (interfaceC0145c0 != null && (interfaceC0375yArr[i7] == null || !zArr[i7])) {
                this.f627n.remove(interfaceC0145c0);
                interfaceC0145c0Arr[i7] = null;
            }
            if (interfaceC0145c0Arr[i7] == null && interfaceC0375yArr[i7] != null) {
                b bVar = new b();
                this.f627n.add(bVar);
                interfaceC0145c0Arr[i7] = bVar;
                zArr2[i7] = true;
            }
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        for (int i7 = 0; i7 < this.f627n.size(); i7++) {
            ((b) this.f627n.get(i7)).m615d();
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        aVar.mo322c(this);
    }

    /* renamed from: q */
    public void m613q() {
        this.f629p.m2103l();
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        return -9223372036854775807L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        return this.f626f;
    }

    /* renamed from: D0.g0$c */
    public static final class c implements C0545n.e {

        /* renamed from: a */
        public final long f638a = C0179y.m716a();

        /* renamed from: b */
        public final C5497k f639b;

        /* renamed from: c */
        public final C5510x f640c;

        /* renamed from: d */
        public byte[] f641d;

        public c(C5497k c5497k, InterfaceC5493g interfaceC5493g) {
            this.f639b = c5497k;
            this.f640c = new C5510x(interfaceC5493g);
        }

        @Override // p050H0.C0545n.e
        /* renamed from: b */
        public void mo481b() {
            this.f640c.m23139x();
            try {
                this.f640c.mo714o(this.f639b);
                int i7 = 0;
                while (i7 != -1) {
                    int m23136g = (int) this.f640c.m23136g();
                    byte[] bArr = this.f641d;
                    if (bArr == null) {
                        this.f641d = new byte[1024];
                    } else if (m23136g == bArr.length) {
                        this.f641d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    C5510x c5510x = this.f640c;
                    byte[] bArr2 = this.f641d;
                    i7 = c5510x.read(bArr2, m23136g, bArr2.length - m23136g);
                }
                AbstractC5496j.m23079a(this.f640c);
            } catch (Throwable th) {
                AbstractC5496j.m23079a(this.f640c);
                throw th;
            }
        }

        @Override // p050H0.C0545n.e
        /* renamed from: c */
        public void mo482c() {
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
    }
}
