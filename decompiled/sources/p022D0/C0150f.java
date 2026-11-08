package p022D0;

import java.io.IOException;
import java.util.ArrayList;
import p022D0.InterfaceC0120F;
import p050H0.InterfaceC0533b;
import p232g0.AbstractC4303I;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: D0.f */
/* loaded from: classes.dex */
public final class C0150f extends AbstractC0169o0 {

    /* renamed from: A */
    public a f588A;

    /* renamed from: B */
    public b f589B;

    /* renamed from: C */
    public long f590C;

    /* renamed from: D */
    public long f591D;

    /* renamed from: t */
    public final long f592t;

    /* renamed from: u */
    public final long f593u;

    /* renamed from: v */
    public final boolean f594v;

    /* renamed from: w */
    public final boolean f595w;

    /* renamed from: x */
    public final boolean f596x;

    /* renamed from: y */
    public final ArrayList f597y;

    /* renamed from: z */
    public final AbstractC4303I.c f598z;

    /* renamed from: D0.f$a */
    public static final class a extends AbstractC0177w {

        /* renamed from: f */
        public final long f599f;

        /* renamed from: g */
        public final long f600g;

        /* renamed from: h */
        public final long f601h;

        /* renamed from: i */
        public final boolean f602i;

        public a(AbstractC4303I abstractC4303I, long j7, long j8) {
            super(abstractC4303I);
            boolean z6 = false;
            if (abstractC4303I.mo307i() != 1) {
                throw new b(0);
            }
            AbstractC4303I.c m18031n = abstractC4303I.m18031n(0, new AbstractC4303I.c());
            long max = Math.max(0L, j7);
            if (!m18031n.f14842k && max != 0 && !m18031n.f14839h) {
                throw new b(1);
            }
            long max2 = j8 == Long.MIN_VALUE ? m18031n.f14844m : Math.max(0L, j8);
            long j9 = m18031n.f14844m;
            if (j9 != -9223372036854775807L) {
                max2 = max2 > j9 ? j9 : max2;
                if (max > max2) {
                    throw new b(2);
                }
            }
            this.f599f = max;
            this.f600g = max2;
            this.f601h = max2 == -9223372036854775807L ? -9223372036854775807L : max2 - max;
            if (m18031n.f14840i && (max2 == -9223372036854775807L || (j9 != -9223372036854775807L && max2 == j9))) {
                z6 = true;
            }
            this.f602i = z6;
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: g */
        public AbstractC4303I.b mo303g(int i7, AbstractC4303I.b bVar, boolean z6) {
            this.f731e.mo303g(0, bVar, z6);
            long m18047n = bVar.m18047n() - this.f599f;
            long j7 = this.f601h;
            return bVar.m18052s(bVar.f14809a, bVar.f14810b, 0, j7 == -9223372036854775807L ? -9223372036854775807L : j7 - m18047n, m18047n);
        }

        @Override // p022D0.AbstractC0177w, p232g0.AbstractC4303I
        /* renamed from: o */
        public AbstractC4303I.c mo305o(int i7, AbstractC4303I.c cVar, long j7) {
            this.f731e.mo305o(0, cVar, 0L);
            long j8 = cVar.f14847p;
            long j9 = this.f599f;
            cVar.f14847p = j8 + j9;
            cVar.f14844m = this.f601h;
            cVar.f14840i = this.f602i;
            long j10 = cVar.f14843l;
            if (j10 != -9223372036854775807L) {
                long max = Math.max(j10, j9);
                cVar.f14843l = max;
                long j11 = this.f600g;
                if (j11 != -9223372036854775807L) {
                    max = Math.min(max, j11);
                }
                cVar.f14843l = max - this.f599f;
            }
            long m21758l1 = AbstractC5330M.m21758l1(this.f599f);
            long j12 = cVar.f14836e;
            if (j12 != -9223372036854775807L) {
                cVar.f14836e = j12 + m21758l1;
            }
            long j13 = cVar.f14837f;
            if (j13 != -9223372036854775807L) {
                cVar.f14837f = j13 + m21758l1;
            }
            return cVar;
        }
    }

    /* renamed from: D0.f$b */
    public static final class b extends IOException {

        /* renamed from: a */
        public final int f603a;

        public b(int i7) {
            super("Illegal clipping: " + m608a(i7));
            this.f603a = i7;
        }

        /* renamed from: a */
        public static String m608a(int i7) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public C0150f(InterfaceC0120F interfaceC0120F, long j7, long j8, boolean z6, boolean z7, boolean z8) {
        super((InterfaceC0120F) AbstractC5332a.m21800e(interfaceC0120F));
        AbstractC5332a.m21796a(j7 >= 0);
        this.f592t = j7;
        this.f593u = j8;
        this.f594v = z6;
        this.f595w = z7;
        this.f596x = z8;
        this.f597y = new ArrayList();
        this.f598z = new AbstractC4303I.c();
    }

    @Override // p022D0.AbstractC0154h, p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        super.mo286E();
        this.f589B = null;
        this.f588A = null;
    }

    @Override // p022D0.AbstractC0169o0
    /* renamed from: S */
    public void mo288S(AbstractC4303I abstractC4303I) {
        if (this.f589B != null) {
            return;
        }
        m607W(abstractC4303I);
    }

    /* renamed from: W */
    public final void m607W(AbstractC4303I abstractC4303I) {
        long j7;
        long j8;
        abstractC4303I.m18031n(0, this.f598z);
        long m18058e = this.f598z.m18058e();
        if (this.f588A == null || this.f597y.isEmpty() || this.f595w) {
            long j9 = this.f592t;
            long j10 = this.f593u;
            if (this.f596x) {
                long m18056c = this.f598z.m18056c();
                j9 += m18056c;
                j10 += m18056c;
            }
            this.f590C = m18058e + j9;
            this.f591D = this.f593u != Long.MIN_VALUE ? m18058e + j10 : Long.MIN_VALUE;
            int size = this.f597y.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C0148e) this.f597y.get(i7)).m596w(this.f590C, this.f591D);
            }
            j7 = j9;
            j8 = j10;
        } else {
            long j11 = this.f590C - m18058e;
            j8 = this.f593u != Long.MIN_VALUE ? this.f591D - m18058e : Long.MIN_VALUE;
            j7 = j11;
        }
        try {
            a aVar = new a(abstractC4303I, j7, j8);
            this.f588A = aVar;
            m522D(aVar);
        } catch (b e7) {
            this.f589B = e7;
            for (int i8 = 0; i8 < this.f597y.size(); i8++) {
                ((C0148e) this.f597y.get(i8)).m595r(this.f589B);
            }
        }
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        C0148e c0148e = new C0148e(this.f695r.mo296e(bVar, interfaceC0533b, j7), this.f594v, this.f590C, this.f591D);
        this.f597y.add(c0148e);
        return c0148e;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        AbstractC5332a.m21802g(this.f597y.remove(interfaceC0117C));
        this.f695r.mo297f(((C0148e) interfaceC0117C).f575a);
        if (!this.f597y.isEmpty() || this.f595w) {
            return;
        }
        m607W(((a) AbstractC5332a.m21800e(this.f588A)).f731e);
    }

    @Override // p022D0.AbstractC0154h, p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        b bVar = this.f589B;
        if (bVar != null) {
            throw bVar;
        }
        super.mo298n();
    }
}
