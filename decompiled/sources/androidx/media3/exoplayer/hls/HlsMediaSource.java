package androidx.media3.exoplayer.hls;

import android.os.Looper;
import java.util.List;
import p022D0.AbstractC0140a;
import p022D0.C0151f0;
import p022D0.C0160k;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0158j;
import p050H0.AbstractC0537f;
import p050H0.C0542k;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p232g0.AbstractC4332v;
import p232g0.C4331u;
import p249i1.InterfaceC4529t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.InterfaceC5493g;
import p276l0.InterfaceC5511y;
import p335s0.C6352l;
import p335s0.InterfaceC6321A;
import p335s0.InterfaceC6364x;
import p343t0.C6409c;
import p343t0.C6415i;
import p343t0.C6419m;
import p343t0.InterfaceC6413g;
import p343t0.InterfaceC6414h;
import p351u0.C6584a;
import p351u0.C6586c;
import p351u0.C6588e;
import p351u0.C6589f;
import p351u0.C6590g;
import p351u0.InterfaceC6593j;
import p351u0.InterfaceC6594k;

/* loaded from: classes.dex */
public final class HlsMediaSource extends AbstractC0140a implements InterfaceC6594k.e {

    /* renamed from: A */
    public InterfaceC5511y f10938A;

    /* renamed from: B */
    public C4331u f10939B;

    /* renamed from: o */
    public final InterfaceC6414h f10940o;

    /* renamed from: p */
    public final InterfaceC6413g f10941p;

    /* renamed from: q */
    public final InterfaceC0158j f10942q;

    /* renamed from: r */
    public final InterfaceC6364x f10943r;

    /* renamed from: s */
    public final InterfaceC0544m f10944s;

    /* renamed from: t */
    public final boolean f10945t;

    /* renamed from: u */
    public final int f10946u;

    /* renamed from: v */
    public final boolean f10947v;

    /* renamed from: w */
    public final InterfaceC6594k f10948w;

    /* renamed from: x */
    public final long f10949x;

    /* renamed from: y */
    public final long f10950y;

    /* renamed from: z */
    public C4331u.g f10951z;

    public static final class Factory implements InterfaceC0120F.a {

        /* renamed from: a */
        public final InterfaceC6413g f10952a;

        /* renamed from: b */
        public InterfaceC6414h f10953b;

        /* renamed from: c */
        public InterfaceC6593j f10954c;

        /* renamed from: d */
        public InterfaceC6594k.a f10955d;

        /* renamed from: e */
        public InterfaceC0158j f10956e;

        /* renamed from: f */
        public InterfaceC6321A f10957f;

        /* renamed from: g */
        public InterfaceC0544m f10958g;

        /* renamed from: h */
        public boolean f10959h;

        /* renamed from: i */
        public int f10960i;

        /* renamed from: j */
        public boolean f10961j;

        /* renamed from: k */
        public long f10962k;

        /* renamed from: l */
        public long f10963l;

        public Factory(InterfaceC5493g.a aVar) {
            this(new C6409c(aVar));
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource mo343e(C4331u c4331u) {
            AbstractC5332a.m21800e(c4331u.f15212b);
            InterfaceC6593j interfaceC6593j = this.f10954c;
            List list = c4331u.f15212b.f15307d;
            InterfaceC6593j c6588e = !list.isEmpty() ? new C6588e(interfaceC6593j, list) : interfaceC6593j;
            InterfaceC6413g interfaceC6413g = this.f10952a;
            InterfaceC6414h interfaceC6414h = this.f10953b;
            InterfaceC0158j interfaceC0158j = this.f10956e;
            InterfaceC6364x mo26474a = this.f10957f.mo26474a(c4331u);
            InterfaceC0544m interfaceC0544m = this.f10958g;
            return new HlsMediaSource(c4331u, interfaceC6413g, interfaceC6414h, interfaceC0158j, null, mo26474a, interfaceC0544m, this.f10955d.mo27357a(this.f10952a, interfaceC0544m, c6588e), this.f10962k, this.f10959h, this.f10960i, this.f10961j, this.f10963l);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo340b(boolean z6) {
            this.f10953b.mo26771b(z6);
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo342d(InterfaceC6321A interfaceC6321A) {
            this.f10957f = (InterfaceC6321A) AbstractC5332a.m21801f(interfaceC6321A, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory mo341c(InterfaceC0544m interfaceC0544m) {
            this.f10958g = (InterfaceC0544m) AbstractC5332a.m21801f(interfaceC0544m, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory mo339a(InterfaceC4529t.a aVar) {
            this.f10953b.mo26770a((InterfaceC4529t.a) AbstractC5332a.m21800e(aVar));
            return this;
        }

        public Factory(InterfaceC6413g interfaceC6413g) {
            this.f10952a = (InterfaceC6413g) AbstractC5332a.m21800e(interfaceC6413g);
            this.f10957f = new C6352l();
            this.f10954c = new C6584a();
            this.f10955d = C6586c.f23621w;
            this.f10953b = InterfaceC6414h.f23182a;
            this.f10958g = new C0542k();
            this.f10956e = new C0160k();
            this.f10960i = 1;
            this.f10962k = -9223372036854775807L;
            this.f10959h = true;
            mo340b(true);
        }
    }

    static {
        AbstractC4332v.m18323a("media3.exoplayer.hls");
    }

    /* renamed from: H */
    public static C6589f.b m13135H(List list, long j7) {
        C6589f.b bVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            C6589f.b bVar2 = (C6589f.b) list.get(i7);
            long j8 = bVar2.f23684e;
            if (j8 > j7 || !bVar2.f23673s) {
                if (j8 > j7) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    /* renamed from: I */
    public static C6589f.d m13136I(List list, long j7) {
        return (C6589f.d) list.get(AbstractC5330M.m21738f(list, Long.valueOf(j7), true, true));
    }

    /* renamed from: L */
    public static long m13137L(C6589f c6589f, long j7) {
        long j8;
        C6589f.f fVar = c6589f.f23672v;
        long j9 = c6589f.f23655e;
        if (j9 != -9223372036854775807L) {
            j8 = c6589f.f23671u - j9;
        } else {
            long j10 = fVar.f23694d;
            if (j10 == -9223372036854775807L || c6589f.f23664n == -9223372036854775807L) {
                long j11 = fVar.f23693c;
                j8 = j11 != -9223372036854775807L ? j11 : c6589f.f23663m * 3;
            } else {
                j8 = j10;
            }
        }
        return j8 + j7;
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f10938A = interfaceC5511y;
        this.f10943r.mo26607c((Looper) AbstractC5332a.m21800e(Looper.myLooper()), m520A());
        this.f10943r.mo26609f();
        this.f10948w.mo27390c(((C4331u.h) AbstractC5332a.m21800e(mo331i().f15212b)).f15304a, m526x(null), this);
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        this.f10948w.stop();
        this.f10943r.release();
    }

    /* renamed from: F */
    public final C0151f0 m13138F(C6589f c6589f, long j7, long j8, C6415i c6415i) {
        long mo27393f = c6589f.f23658h - this.f10948w.mo27393f();
        long j9 = c6589f.f23665o ? mo27393f + c6589f.f23671u : -9223372036854775807L;
        long m13140J = m13140J(c6589f);
        long j10 = this.f10951z.f15286a;
        m13142M(c6589f, AbstractC5330M.m21768q(j10 != -9223372036854775807L ? AbstractC5330M.m21692K0(j10) : m13137L(c6589f, m13140J), m13140J, c6589f.f23671u + m13140J));
        return new C0151f0(j7, j8, -9223372036854775807L, j9, c6589f.f23671u, mo27393f, m13141K(c6589f, m13140J), true, !c6589f.f23665o, c6589f.f23654d == 2 && c6589f.f23656f, c6415i, mo331i(), this.f10951z);
    }

    /* renamed from: G */
    public final C0151f0 m13139G(C6589f c6589f, long j7, long j8, C6415i c6415i) {
        long j9;
        if (c6589f.f23655e == -9223372036854775807L || c6589f.f23668r.isEmpty()) {
            j9 = 0;
        } else {
            if (!c6589f.f23657g) {
                long j10 = c6589f.f23655e;
                if (j10 != c6589f.f23671u) {
                    j9 = m13136I(c6589f.f23668r, j10).f23684e;
                }
            }
            j9 = c6589f.f23655e;
        }
        long j11 = j9;
        long j12 = c6589f.f23671u;
        return new C0151f0(j7, j8, -9223372036854775807L, j12, j12, 0L, j11, true, false, true, c6415i, mo331i(), null);
    }

    /* renamed from: J */
    public final long m13140J(C6589f c6589f) {
        if (c6589f.f23666p) {
            return AbstractC5330M.m21692K0(AbstractC5330M.m21739f0(this.f10949x)) - c6589f.m27427e();
        }
        return 0L;
    }

    /* renamed from: K */
    public final long m13141K(C6589f c6589f, long j7) {
        long j8 = c6589f.f23655e;
        if (j8 == -9223372036854775807L) {
            j8 = (c6589f.f23671u + j7) - AbstractC5330M.m21692K0(this.f10951z.f15286a);
        }
        if (c6589f.f23657g) {
            return j8;
        }
        C6589f.b m13135H = m13135H(c6589f.f23669s, j8);
        if (m13135H != null) {
            return m13135H.f23684e;
        }
        if (c6589f.f23668r.isEmpty()) {
            return 0L;
        }
        C6589f.d m13136I = m13136I(c6589f.f23668r, j8);
        C6589f.b m13135H2 = m13135H(m13136I.f23679t, j8);
        return m13135H2 != null ? m13135H2.f23684e : m13136I.f23684e;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m13142M(p351u0.C6589f r5, long r6) {
        /*
            r4 = this;
            g0.u r0 = r4.mo331i()
            g0.u$g r0 = r0.f15214d
            float r1 = r0.f15289d
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L2a
            float r0 = r0.f15290e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            u0.f$f r5 = r5.f23672v
            long r0 = r5.f23693c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r0 = r5.f23694d
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L2a
            r5 = 1
            goto L2b
        L2a:
            r5 = 0
        L2b:
            g0.u$g$a r0 = new g0.u$g$a
            r0.<init>()
            long r6 = p259j0.AbstractC5330M.m21758l1(r6)
            g0.u$g$a r6 = r0.m18315k(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r5 == 0) goto L3e
            r0 = r7
            goto L42
        L3e:
            g0.u$g r0 = r4.f10951z
            float r0 = r0.f15289d
        L42:
            g0.u$g$a r6 = r6.m18314j(r0)
            if (r5 == 0) goto L49
            goto L4d
        L49:
            g0.u$g r5 = r4.f10951z
            float r7 = r5.f15290e
        L4d:
            g0.u$g$a r5 = r6.m18312h(r7)
            g0.u$g r5 = r5.m18310f()
            r4.f10951z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.hls.HlsMediaSource.m13142M(u0.f, long):void");
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f10939B = c4331u;
    }

    @Override // p351u0.InterfaceC6594k.e
    /* renamed from: b */
    public void mo13143b(C6589f c6589f) {
        long m21758l1 = c6589f.f23666p ? AbstractC5330M.m21758l1(c6589f.f23658h) : -9223372036854775807L;
        int i7 = c6589f.f23654d;
        long j7 = (i7 == 2 || i7 == 1) ? m21758l1 : -9223372036854775807L;
        C6415i c6415i = new C6415i((C6590g) AbstractC5332a.m21800e(this.f10948w.mo27395h()), c6589f);
        m522D(this.f10948w.mo27394g() ? m13138F(c6589f, j7, m21758l1, c6415i) : m13139G(c6589f, j7, m21758l1, c6415i));
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        InterfaceC0127M.a m526x = m526x(bVar);
        return new C6419m(this.f10940o, this.f10948w, this.f10941p, this.f10938A, null, this.f10943r, m524v(bVar), this.f10944s, m526x, interfaceC0533b, this.f10942q, this.f10945t, this.f10946u, this.f10947v, m520A(), this.f10950y);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C6419m) interfaceC0117C).m26833D();
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f10939B;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        this.f10948w.mo27398l();
    }

    public HlsMediaSource(C4331u c4331u, InterfaceC6413g interfaceC6413g, InterfaceC6414h interfaceC6414h, InterfaceC0158j interfaceC0158j, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, InterfaceC6594k interfaceC6594k, long j7, boolean z6, int i7, boolean z7, long j8) {
        this.f10939B = c4331u;
        this.f10951z = c4331u.f15214d;
        this.f10941p = interfaceC6413g;
        this.f10940o = interfaceC6414h;
        this.f10942q = interfaceC0158j;
        this.f10943r = interfaceC6364x;
        this.f10944s = interfaceC0544m;
        this.f10948w = interfaceC6594k;
        this.f10949x = j7;
        this.f10945t = z6;
        this.f10946u = i7;
        this.f10947v = z7;
        this.f10950y = j8;
    }
}
