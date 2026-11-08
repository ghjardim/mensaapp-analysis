package androidx.media3.exoplayer.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.C3393a;
import androidx.media3.exoplayer.smoothstreaming.InterfaceC3394b;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p015C0.C0070a;
import p015C0.C0071b;
import p022D0.AbstractC0140a;
import p022D0.C0116B;
import p022D0.C0151f0;
import p022D0.C0160k;
import p022D0.C0179y;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0120F;
import p022D0.InterfaceC0127M;
import p022D0.InterfaceC0158j;
import p050H0.AbstractC0537f;
import p050H0.C0542k;
import p050H0.C0545n;
import p050H0.C0547p;
import p050H0.InterfaceC0533b;
import p050H0.InterfaceC0544m;
import p050H0.InterfaceC0546o;
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
import p380y0.C7049b;

/* loaded from: classes.dex */
public final class SsMediaSource extends AbstractC0140a implements C0545n.b {

    /* renamed from: A */
    public C0545n f11108A;

    /* renamed from: B */
    public InterfaceC0546o f11109B;

    /* renamed from: C */
    public InterfaceC5511y f11110C;

    /* renamed from: D */
    public long f11111D;

    /* renamed from: E */
    public C0070a f11112E;

    /* renamed from: F */
    public Handler f11113F;

    /* renamed from: G */
    public C4331u f11114G;

    /* renamed from: o */
    public final boolean f11115o;

    /* renamed from: p */
    public final Uri f11116p;

    /* renamed from: q */
    public final InterfaceC5493g.a f11117q;

    /* renamed from: r */
    public final InterfaceC3394b.a f11118r;

    /* renamed from: s */
    public final InterfaceC0158j f11119s;

    /* renamed from: t */
    public final InterfaceC6364x f11120t;

    /* renamed from: u */
    public final InterfaceC0544m f11121u;

    /* renamed from: v */
    public final long f11122v;

    /* renamed from: w */
    public final InterfaceC0127M.a f11123w;

    /* renamed from: x */
    public final C0547p.a f11124x;

    /* renamed from: y */
    public final ArrayList f11125y;

    /* renamed from: z */
    public InterfaceC5493g f11126z;

    public static final class Factory implements InterfaceC0120F.a {

        /* renamed from: a */
        public final InterfaceC3394b.a f11127a;

        /* renamed from: b */
        public final InterfaceC5493g.a f11128b;

        /* renamed from: c */
        public InterfaceC0158j f11129c;

        /* renamed from: d */
        public InterfaceC6321A f11130d;

        /* renamed from: e */
        public InterfaceC0544m f11131e;

        /* renamed from: f */
        public long f11132f;

        /* renamed from: g */
        public C0547p.a f11133g;

        public Factory(InterfaceC5493g.a aVar) {
            this(new C3393a.a(aVar), aVar);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public SsMediaSource mo343e(C4331u c4331u) {
            AbstractC5332a.m21800e(c4331u.f15212b);
            C0547p.a aVar = this.f11133g;
            if (aVar == null) {
                aVar = new C0071b();
            }
            List list = c4331u.f15212b.f15307d;
            return new SsMediaSource(c4331u, null, this.f11128b, !list.isEmpty() ? new C7049b(aVar, list) : aVar, this.f11127a, this.f11129c, null, this.f11130d.mo26474a(c4331u), this.f11131e, this.f11132f);
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Factory mo340b(boolean z6) {
            this.f11127a.mo13384b(z6);
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Factory mo342d(InterfaceC6321A interfaceC6321A) {
            this.f11130d = (InterfaceC6321A) AbstractC5332a.m21801f(interfaceC6321A, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Factory mo341c(InterfaceC0544m interfaceC0544m) {
            this.f11131e = (InterfaceC0544m) AbstractC5332a.m21801f(interfaceC0544m, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
            return this;
        }

        @Override // p022D0.InterfaceC0120F.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Factory mo339a(InterfaceC4529t.a aVar) {
            this.f11127a.mo13383a((InterfaceC4529t.a) AbstractC5332a.m21800e(aVar));
            return this;
        }

        public Factory(InterfaceC3394b.a aVar, InterfaceC5493g.a aVar2) {
            this.f11127a = (InterfaceC3394b.a) AbstractC5332a.m21800e(aVar);
            this.f11128b = aVar2;
            this.f11130d = new C6352l();
            this.f11131e = new C0542k();
            this.f11132f = 30000L;
            this.f11129c = new C0160k();
            mo340b(true);
        }
    }

    static {
        AbstractC4332v.m18323a("media3.exoplayer.smoothstreaming");
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: C */
    public void mo410C(InterfaceC5511y interfaceC5511y) {
        this.f11110C = interfaceC5511y;
        this.f11120t.mo26607c(Looper.myLooper(), m520A());
        this.f11120t.mo26609f();
        if (this.f11115o) {
            this.f11109B = new InterfaceC0546o.a();
            m13371J();
            return;
        }
        this.f11126z = this.f11117q.mo23075a();
        C0545n c0545n = new C0545n("SsMediaSource");
        this.f11108A = c0545n;
        this.f11109B = c0545n;
        this.f11113F = AbstractC5330M.m21671A();
        m13373L();
    }

    @Override // p022D0.AbstractC0140a
    /* renamed from: E */
    public void mo286E() {
        this.f11112E = this.f11115o ? this.f11112E : null;
        this.f11126z = null;
        this.f11111D = 0L;
        C0545n c0545n = this.f11108A;
        if (c0545n != null) {
            c0545n.m2103l();
            this.f11108A = null;
        }
        Handler handler = this.f11113F;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f11113F = null;
        }
        this.f11120t.release();
    }

    @Override // p050H0.C0545n.b
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo468k(C0547p c0547p, long j7, long j8, boolean z6) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f11121u.mo2086b(c0547p.f1805a);
        this.f11123w.m373p(c0179y, c0547p.f1807c);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo473r(C0547p c0547p, long j7, long j8) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f11121u.mo2086b(c0547p.f1805a);
        this.f11123w.m376s(c0179y, c0547p.f1807c);
        this.f11112E = (C0070a) c0547p.m2117e();
        this.f11111D = j7 - j8;
        m13371J();
        m13372K();
    }

    @Override // p050H0.C0545n.b
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public C0545n.c mo471m(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        long mo2087c = this.f11121u.mo2087c(new InterfaceC0544m.c(c0179y, new C0116B(c0547p.f1807c), iOException, i7));
        C0545n.c m2096h = mo2087c == -9223372036854775807L ? C0545n.f1788g : C0545n.m2096h(false, mo2087c);
        boolean m2108c = m2096h.m2108c();
        this.f11123w.m380w(c0179y, c0547p.f1807c, iOException, !m2108c);
        if (!m2108c) {
            this.f11121u.mo2086b(c0547p.f1805a);
        }
        return m2096h;
    }

    /* renamed from: J */
    public final void m13371J() {
        C0151f0 c0151f0;
        for (int i7 = 0; i7 < this.f11125y.size(); i7++) {
            ((C3395c) this.f11125y.get(i7)).m13396y(this.f11112E);
        }
        long j7 = Long.MIN_VALUE;
        long j8 = Long.MAX_VALUE;
        for (C0070a.b bVar : this.f11112E.f220f) {
            if (bVar.f236k > 0) {
                j8 = Math.min(j8, bVar.m174e(0));
                j7 = Math.max(j7, bVar.m174e(bVar.f236k - 1) + bVar.m172c(bVar.f236k - 1));
            }
        }
        if (j8 == Long.MAX_VALUE) {
            long j9 = this.f11112E.f218d ? -9223372036854775807L : 0L;
            C0070a c0070a = this.f11112E;
            boolean z6 = c0070a.f218d;
            c0151f0 = new C0151f0(j9, 0L, 0L, 0L, true, z6, z6, c0070a, mo331i());
        } else {
            C0070a c0070a2 = this.f11112E;
            if (c0070a2.f218d) {
                long j10 = c0070a2.f222h;
                if (j10 != -9223372036854775807L && j10 > 0) {
                    j8 = Math.max(j8, j7 - j10);
                }
                long j11 = j8;
                long j12 = j7 - j11;
                long m21692K0 = j12 - AbstractC5330M.m21692K0(this.f11122v);
                if (m21692K0 < 5000000) {
                    m21692K0 = Math.min(5000000L, j12 / 2);
                }
                c0151f0 = new C0151f0(-9223372036854775807L, j12, j11, m21692K0, true, true, true, this.f11112E, mo331i());
            } else {
                long j13 = c0070a2.f221g;
                long j14 = j13 != -9223372036854775807L ? j13 : j7 - j8;
                c0151f0 = new C0151f0(j8 + j14, j14, j8, 0L, true, false, false, this.f11112E, mo331i());
            }
        }
        m522D(c0151f0);
    }

    /* renamed from: K */
    public final void m13372K() {
        if (this.f11112E.f218d) {
            this.f11113F.postDelayed(new Runnable() { // from class: B0.b
                @Override // java.lang.Runnable
                public final void run() {
                    SsMediaSource.this.m13373L();
                }
            }, Math.max(0L, (this.f11111D + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: L */
    public final void m13373L() {
        if (this.f11108A.m2100i()) {
            return;
        }
        C0547p c0547p = new C0547p(this.f11126z, this.f11116p, 4, this.f11124x);
        this.f11123w.m382y(new C0179y(c0547p.f1805a, c0547p.f1806b, this.f11108A.m2105n(c0547p, this, this.f11121u.mo2088d(c0547p.f1807c))), c0547p.f1807c);
    }

    @Override // p022D0.AbstractC0140a, p022D0.InterfaceC0120F
    /* renamed from: a */
    public synchronized void mo294a(C4331u c4331u) {
        this.f11114G = c4331u;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: e */
    public InterfaceC0117C mo296e(InterfaceC0120F.b bVar, InterfaceC0533b interfaceC0533b, long j7) {
        InterfaceC0127M.a m526x = m526x(bVar);
        C3395c c3395c = new C3395c(this.f11112E, this.f11118r, this.f11110C, this.f11119s, null, this.f11120t, m524v(bVar), this.f11121u, m526x, this.f11109B, interfaceC0533b);
        this.f11125y.add(c3395c);
        return c3395c;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: f */
    public void mo297f(InterfaceC0117C interfaceC0117C) {
        ((C3395c) interfaceC0117C).m13395x();
        this.f11125y.remove(interfaceC0117C);
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: i */
    public synchronized C4331u mo331i() {
        return this.f11114G;
    }

    @Override // p022D0.InterfaceC0120F
    /* renamed from: n */
    public void mo298n() {
        this.f11109B.mo2097c();
    }

    public SsMediaSource(C4331u c4331u, C0070a c0070a, InterfaceC5493g.a aVar, C0547p.a aVar2, InterfaceC3394b.a aVar3, InterfaceC0158j interfaceC0158j, AbstractC0537f abstractC0537f, InterfaceC6364x interfaceC6364x, InterfaceC0544m interfaceC0544m, long j7) {
        AbstractC5332a.m21802g(c0070a == null || !c0070a.f218d);
        this.f11114G = c4331u;
        C4331u.h hVar = (C4331u.h) AbstractC5332a.m21800e(c4331u.f15212b);
        this.f11112E = c0070a;
        this.f11116p = hVar.f15304a.equals(Uri.EMPTY) ? null : AbstractC5330M.m21683G(hVar.f15304a);
        this.f11117q = aVar;
        this.f11124x = aVar2;
        this.f11118r = aVar3;
        this.f11119s = interfaceC0158j;
        this.f11120t = interfaceC6364x;
        this.f11121u = interfaceC0544m;
        this.f11122v = j7;
        this.f11123w = m526x(null);
        this.f11115o = c0070a != null;
        this.f11125y = new ArrayList();
    }
}
