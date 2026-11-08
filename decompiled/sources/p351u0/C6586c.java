package p351u0;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.api.C3643a;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p022D0.C0116B;
import p022D0.C0179y;
import p022D0.InterfaceC0127M;
import p050H0.C0545n;
import p050H0.C0547p;
import p050H0.InterfaceC0544m;
import p178Z2.AbstractC2987A;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p276l0.C5506t;
import p276l0.InterfaceC5493g;
import p343t0.InterfaceC6413g;
import p351u0.C6586c;
import p351u0.C6589f;
import p351u0.C6590g;
import p351u0.C6592i;
import p351u0.InterfaceC6594k;

/* renamed from: u0.c */
/* loaded from: classes.dex */
public final class C6586c implements InterfaceC6594k, C0545n.b {

    /* renamed from: w */
    public static final InterfaceC6594k.a f23621w = new InterfaceC6594k.a() { // from class: u0.b
        @Override // p351u0.InterfaceC6594k.a
        /* renamed from: a */
        public final InterfaceC6594k mo27357a(InterfaceC6413g interfaceC6413g, InterfaceC0544m interfaceC0544m, InterfaceC6593j interfaceC6593j) {
            return new C6586c(interfaceC6413g, interfaceC0544m, interfaceC6593j);
        }
    };

    /* renamed from: a */
    public final InterfaceC6413g f23622a;

    /* renamed from: b */
    public final InterfaceC6593j f23623b;

    /* renamed from: c */
    public final InterfaceC0544m f23624c;

    /* renamed from: d */
    public final HashMap f23625d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f23626e;

    /* renamed from: f */
    public final double f23627f;

    /* renamed from: n */
    public InterfaceC0127M.a f23628n;

    /* renamed from: o */
    public C0545n f23629o;

    /* renamed from: p */
    public Handler f23630p;

    /* renamed from: q */
    public InterfaceC6594k.e f23631q;

    /* renamed from: r */
    public C6590g f23632r;

    /* renamed from: s */
    public Uri f23633s;

    /* renamed from: t */
    public C6589f f23634t;

    /* renamed from: u */
    public boolean f23635u;

    /* renamed from: v */
    public long f23636v;

    /* renamed from: u0.c$b */
    public class b implements InterfaceC6594k.b {
        public b() {
        }

        @Override // p351u0.InterfaceC6594k.b
        /* renamed from: b */
        public void mo26834b() {
            C6586c.this.f23626e.remove(this);
        }

        @Override // p351u0.InterfaceC6594k.b
        /* renamed from: c */
        public boolean mo26835c(Uri uri, InterfaceC0544m.c cVar, boolean z6) {
            c cVar2;
            if (C6586c.this.f23634t == null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((C6590g) AbstractC5330M.m21747i(C6586c.this.f23632r)).f23698e;
                int i7 = 0;
                for (int i8 = 0; i8 < list.size(); i8++) {
                    c cVar3 = (c) C6586c.this.f23625d.get(((C6590g.b) list.get(i8)).f23711a);
                    if (cVar3 != null && elapsedRealtime < cVar3.f23645o) {
                        i7++;
                    }
                }
                InterfaceC0544m.b mo2085a = C6586c.this.f23624c.mo2085a(new InterfaceC0544m.a(1, 0, C6586c.this.f23632r.f23698e.size(), i7), cVar);
                if (mo2085a != null && mo2085a.f1779a == 2 && (cVar2 = (c) C6586c.this.f23625d.get(uri)) != null) {
                    cVar2.m27408h(mo2085a.f1780b);
                }
            }
            return false;
        }
    }

    /* renamed from: u0.c$c */
    public final class c implements C0545n.b {

        /* renamed from: a */
        public final Uri f23638a;

        /* renamed from: b */
        public final C0545n f23639b = new C0545n("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* renamed from: c */
        public final InterfaceC5493g f23640c;

        /* renamed from: d */
        public C6589f f23641d;

        /* renamed from: e */
        public long f23642e;

        /* renamed from: f */
        public long f23643f;

        /* renamed from: n */
        public long f23644n;

        /* renamed from: o */
        public long f23645o;

        /* renamed from: p */
        public boolean f23646p;

        /* renamed from: q */
        public IOException f23647q;

        /* renamed from: r */
        public boolean f23648r;

        public c(Uri uri) {
            this.f23638a = uri;
            this.f23640c = C6586c.this.f23622a.mo26764a(4);
        }

        /* renamed from: h */
        public final boolean m27408h(long j7) {
            this.f23645o = SystemClock.elapsedRealtime() + j7;
            return this.f23638a.equals(C6586c.this.f23633s) && !C6586c.this.m27381N();
        }

        /* renamed from: i */
        public final Uri m27409i() {
            C6589f c6589f = this.f23641d;
            if (c6589f != null) {
                C6589f.f fVar = c6589f.f23672v;
                if (fVar.f23691a != -9223372036854775807L || fVar.f23695e) {
                    Uri.Builder buildUpon = this.f23638a.buildUpon();
                    C6589f c6589f2 = this.f23641d;
                    if (c6589f2.f23672v.f23695e) {
                        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c6589f2.f23661k + c6589f2.f23668r.size()));
                        C6589f c6589f3 = this.f23641d;
                        if (c6589f3.f23664n != -9223372036854775807L) {
                            List list = c6589f3.f23669s;
                            int size = list.size();
                            if (!list.isEmpty() && ((C6589f.b) AbstractC2987A.m10751d(list)).f23674t) {
                                size--;
                            }
                            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    C6589f.f fVar2 = this.f23641d.f23672v;
                    if (fVar2.f23691a != -9223372036854775807L) {
                        buildUpon.appendQueryParameter("_HLS_skip", fVar2.f23692b ? "v2" : "YES");
                    }
                    return buildUpon.build();
                }
            }
            return this.f23638a;
        }

        /* renamed from: j */
        public C6589f m27410j() {
            return this.f23641d;
        }

        /* renamed from: l */
        public boolean m27411l() {
            return this.f23648r;
        }

        /* renamed from: n */
        public boolean m27412n() {
            int i7;
            if (this.f23641d == null) {
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long max = Math.max(30000L, AbstractC5330M.m21758l1(this.f23641d.f23671u));
            C6589f c6589f = this.f23641d;
            return c6589f.f23665o || (i7 = c6589f.f23654d) == 2 || i7 == 1 || this.f23642e + max > elapsedRealtime;
        }

        /* renamed from: o */
        public final /* synthetic */ void m27413o(Uri uri) {
            this.f23646p = false;
            m27415q(uri);
        }

        /* renamed from: p */
        public void m27414p(boolean z6) {
            m27416s(z6 ? m27409i() : this.f23638a);
        }

        /* renamed from: q */
        public final void m27415q(Uri uri) {
            C0547p c0547p = new C0547p(this.f23640c, uri, 4, C6586c.this.f23623b.mo27355a(C6586c.this.f23632r, this.f23641d));
            C6586c.this.f23628n.m382y(new C0179y(c0547p.f1805a, c0547p.f1806b, this.f23639b.m2105n(c0547p, this, C6586c.this.f23624c.mo2088d(c0547p.f1807c))), c0547p.f1807c);
        }

        /* renamed from: s */
        public final void m27416s(final Uri uri) {
            this.f23645o = 0L;
            if (this.f23646p || this.f23639b.m2101j() || this.f23639b.m2100i()) {
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime >= this.f23644n) {
                m27415q(uri);
            } else {
                this.f23646p = true;
                C6586c.this.f23630p.postDelayed(new Runnable() { // from class: u0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6586c.c.this.m27413o(uri);
                    }
                }, this.f23644n - elapsedRealtime);
            }
        }

        /* renamed from: t */
        public void m27417t() {
            this.f23639b.mo2097c();
            IOException iOException = this.f23647q;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // p050H0.C0545n.b
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public void mo468k(C0547p c0547p, long j7, long j8, boolean z6) {
            C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
            C6586c.this.f23624c.mo2086b(c0547p.f1805a);
            C6586c.this.f23628n.m373p(c0179y, 4);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public void mo473r(C0547p c0547p, long j7, long j8) {
            AbstractC6591h abstractC6591h = (AbstractC6591h) c0547p.m2117e();
            C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
            if (abstractC6591h instanceof C6589f) {
                m27421x((C6589f) abstractC6591h, c0179y);
                C6586c.this.f23628n.m376s(c0179y, 4);
            } else {
                this.f23647q = C4295A.m17945c("Loaded playlist has unexpected type.", null);
                C6586c.this.f23628n.m380w(c0179y, 4, this.f23647q, true);
            }
            C6586c.this.f23624c.mo2086b(c0547p.f1805a);
        }

        @Override // p050H0.C0545n.b
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C0545n.c mo471m(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
            C0545n.c cVar;
            C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
            boolean z6 = iOException instanceof C6592i.a;
            if ((c0547p.m2118f().getQueryParameter("_HLS_msn") != null) || z6) {
                int i8 = iOException instanceof C5506t ? ((C5506t) iOException).f19849d : C3643a.e.API_PRIORITY_OTHER;
                if (z6 || i8 == 400 || i8 == 503) {
                    this.f23644n = SystemClock.elapsedRealtime();
                    m27414p(false);
                    ((InterfaceC0127M.a) AbstractC5330M.m21747i(C6586c.this.f23628n)).m380w(c0179y, c0547p.f1807c, iOException, true);
                    return C0545n.f1787f;
                }
            }
            InterfaceC0544m.c cVar2 = new InterfaceC0544m.c(c0179y, new C0116B(c0547p.f1807c), iOException, i7);
            if (C6586c.this.m27383P(this.f23638a, cVar2, false)) {
                long mo2087c = C6586c.this.f23624c.mo2087c(cVar2);
                cVar = mo2087c != -9223372036854775807L ? C0545n.m2096h(false, mo2087c) : C0545n.f1788g;
            } else {
                cVar = C0545n.f1787f;
            }
            boolean m2108c = cVar.m2108c();
            C6586c.this.f23628n.m380w(c0179y, c0547p.f1807c, iOException, !m2108c);
            if (!m2108c) {
                C6586c.this.f23624c.mo2086b(c0547p.f1805a);
            }
            return cVar;
        }

        /* renamed from: x */
        public final void m27421x(C6589f c6589f, C0179y c0179y) {
            boolean z6;
            C6589f c6589f2 = this.f23641d;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f23642e = elapsedRealtime;
            C6589f m27375H = C6586c.this.m27375H(c6589f2, c6589f);
            this.f23641d = m27375H;
            IOException iOException = null;
            if (m27375H != c6589f2) {
                this.f23647q = null;
                this.f23643f = elapsedRealtime;
                C6586c.this.m27387T(this.f23638a, m27375H);
            } else if (!m27375H.f23665o) {
                if (c6589f.f23661k + c6589f.f23668r.size() < this.f23641d.f23661k) {
                    iOException = new InterfaceC6594k.c(this.f23638a);
                    z6 = true;
                } else {
                    z6 = false;
                    if (elapsedRealtime - this.f23643f > AbstractC5330M.m21758l1(r13.f23663m) * C6586c.this.f23627f) {
                        iOException = new InterfaceC6594k.d(this.f23638a);
                    }
                }
                if (iOException != null) {
                    this.f23647q = iOException;
                    C6586c.this.m27383P(this.f23638a, new InterfaceC0544m.c(c0179y, new C0116B(4), iOException, 1), z6);
                }
            }
            C6589f c6589f3 = this.f23641d;
            this.f23644n = (elapsedRealtime + AbstractC5330M.m21758l1(!c6589f3.f23672v.f23695e ? c6589f3 != c6589f2 ? c6589f3.f23663m : c6589f3.f23663m / 2 : 0L)) - c0179y.f743f;
            if (this.f23641d.f23665o) {
                return;
            }
            if (this.f23638a.equals(C6586c.this.f23633s) || this.f23648r) {
                m27416s(m27409i());
            }
        }

        /* renamed from: y */
        public void m27422y() {
            this.f23639b.m2103l();
        }

        /* renamed from: z */
        public void m27423z(boolean z6) {
            this.f23648r = z6;
        }
    }

    public C6586c(InterfaceC6413g interfaceC6413g, InterfaceC0544m interfaceC0544m, InterfaceC6593j interfaceC6593j) {
        this(interfaceC6413g, interfaceC0544m, interfaceC6593j, 3.5d);
    }

    /* renamed from: G */
    public static C6589f.d m27363G(C6589f c6589f, C6589f c6589f2) {
        int i7 = (int) (c6589f2.f23661k - c6589f.f23661k);
        List list = c6589f.f23668r;
        if (i7 < list.size()) {
            return (C6589f.d) list.get(i7);
        }
        return null;
    }

    /* renamed from: F */
    public final void m27374F(List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            Uri uri = (Uri) list.get(i7);
            this.f23625d.put(uri, new c(uri));
        }
    }

    /* renamed from: H */
    public final C6589f m27375H(C6589f c6589f, C6589f c6589f2) {
        return !c6589f2.m27428f(c6589f) ? c6589f2.f23665o ? c6589f.m27426d() : c6589f : c6589f2.m27425c(m27377J(c6589f, c6589f2), m27376I(c6589f, c6589f2));
    }

    /* renamed from: I */
    public final int m27376I(C6589f c6589f, C6589f c6589f2) {
        if (c6589f2.f23659i) {
            return c6589f2.f23660j;
        }
        C6589f c6589f3 = this.f23634t;
        int i7 = c6589f3 != null ? c6589f3.f23660j : 0;
        if (c6589f == null) {
            return i7;
        }
        C6589f.d m27363G = m27363G(c6589f, c6589f2);
        return m27363G != null ? (c6589f.f23660j + m27363G.f23683d) - ((C6589f.d) c6589f2.f23668r.get(0)).f23683d : i7;
    }

    /* renamed from: J */
    public final long m27377J(C6589f c6589f, C6589f c6589f2) {
        if (c6589f2.f23666p) {
            return c6589f2.f23658h;
        }
        C6589f c6589f3 = this.f23634t;
        long j7 = c6589f3 != null ? c6589f3.f23658h : 0L;
        if (c6589f == null) {
            return j7;
        }
        int size = c6589f.f23668r.size();
        C6589f.d m27363G = m27363G(c6589f, c6589f2);
        return m27363G != null ? c6589f.f23658h + m27363G.f23684e : ((long) size) == c6589f2.f23661k - c6589f.f23661k ? c6589f.m27427e() : j7;
    }

    /* renamed from: K */
    public final Uri m27378K(Uri uri) {
        C6589f.c cVar;
        C6589f c6589f = this.f23634t;
        if (c6589f == null || !c6589f.f23672v.f23695e || (cVar = (C6589f.c) c6589f.f23670t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f23676b));
        int i7 = cVar.f23677c;
        if (i7 != -1) {
            buildUpon.appendQueryParameter("_HLS_part", String.valueOf(i7));
        }
        return buildUpon.build();
    }

    /* renamed from: L */
    public final boolean m27379L(Uri uri) {
        List list = this.f23632r.f23698e;
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (uri.equals(((C6590g.b) list.get(i7)).f23711a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: M */
    public final void m27380M(Uri uri) {
        c cVar = (c) this.f23625d.get(uri);
        C6589f m27410j = cVar.m27410j();
        if (cVar.m27411l()) {
            return;
        }
        cVar.m27423z(true);
        if (m27410j == null || m27410j.f23665o) {
            return;
        }
        cVar.m27414p(true);
    }

    /* renamed from: N */
    public final boolean m27381N() {
        List list = this.f23632r.f23698e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i7 = 0; i7 < size; i7++) {
            c cVar = (c) AbstractC5332a.m21800e((c) this.f23625d.get(((C6590g.b) list.get(i7)).f23711a));
            if (elapsedRealtime > cVar.f23645o) {
                Uri uri = cVar.f23638a;
                this.f23633s = uri;
                cVar.m27416s(m27378K(uri));
                return true;
            }
        }
        return false;
    }

    /* renamed from: O */
    public final void m27382O(Uri uri) {
        if (uri.equals(this.f23633s) || !m27379L(uri)) {
            return;
        }
        C6589f c6589f = this.f23634t;
        if (c6589f == null || !c6589f.f23665o) {
            this.f23633s = uri;
            c cVar = (c) this.f23625d.get(uri);
            C6589f c6589f2 = cVar.f23641d;
            if (c6589f2 == null || !c6589f2.f23665o) {
                cVar.m27416s(m27378K(uri));
            } else {
                this.f23634t = c6589f2;
                this.f23631q.mo13143b(c6589f2);
            }
        }
    }

    /* renamed from: P */
    public final boolean m27383P(Uri uri, InterfaceC0544m.c cVar, boolean z6) {
        Iterator it = this.f23626e.iterator();
        boolean z7 = false;
        while (it.hasNext()) {
            z7 |= !((InterfaceC6594k.b) it.next()).mo26835c(uri, cVar, z6);
        }
        return z7;
    }

    @Override // p050H0.C0545n.b
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo468k(C0547p c0547p, long j7, long j8, boolean z6) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        this.f23624c.mo2086b(c0547p.f1805a);
        this.f23628n.m373p(c0179y, 4);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo473r(C0547p c0547p, long j7, long j8) {
        AbstractC6591h abstractC6591h = (AbstractC6591h) c0547p.m2117e();
        boolean z6 = abstractC6591h instanceof C6589f;
        C6590g m27434e = z6 ? C6590g.m27434e(abstractC6591h.f23717a) : (C6590g) abstractC6591h;
        this.f23632r = m27434e;
        this.f23633s = ((C6590g.b) m27434e.f23698e.get(0)).f23711a;
        this.f23626e.add(new b());
        m27374F(m27434e.f23697d);
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        c cVar = (c) this.f23625d.get(this.f23633s);
        if (z6) {
            cVar.m27421x((C6589f) abstractC6591h, c0179y);
        } else {
            cVar.m27414p(false);
        }
        this.f23624c.mo2086b(c0547p.f1805a);
        this.f23628n.m376s(c0179y, 4);
    }

    @Override // p050H0.C0545n.b
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public C0545n.c mo471m(C0547p c0547p, long j7, long j8, IOException iOException, int i7) {
        C0179y c0179y = new C0179y(c0547p.f1805a, c0547p.f1806b, c0547p.m2118f(), c0547p.m2116d(), j7, j8, c0547p.m2115a());
        long mo2087c = this.f23624c.mo2087c(new InterfaceC0544m.c(c0179y, new C0116B(c0547p.f1807c), iOException, i7));
        boolean z6 = mo2087c == -9223372036854775807L;
        this.f23628n.m380w(c0179y, c0547p.f1807c, iOException, z6);
        if (z6) {
            this.f23624c.mo2086b(c0547p.f1805a);
        }
        return z6 ? C0545n.f1788g : C0545n.m2096h(false, mo2087c);
    }

    /* renamed from: T */
    public final void m27387T(Uri uri, C6589f c6589f) {
        if (uri.equals(this.f23633s)) {
            if (this.f23634t == null) {
                this.f23635u = !c6589f.f23665o;
                this.f23636v = c6589f.f23658h;
            }
            this.f23634t = c6589f;
            this.f23631q.mo13143b(c6589f);
        }
        Iterator it = this.f23626e.iterator();
        while (it.hasNext()) {
            ((InterfaceC6594k.b) it.next()).mo26834b();
        }
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: a */
    public void mo27388a(InterfaceC6594k.b bVar) {
        AbstractC5332a.m21800e(bVar);
        this.f23626e.add(bVar);
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: b */
    public boolean mo27389b(Uri uri) {
        return ((c) this.f23625d.get(uri)).m27412n();
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: c */
    public void mo27390c(Uri uri, InterfaceC0127M.a aVar, InterfaceC6594k.e eVar) {
        this.f23630p = AbstractC5330M.m21671A();
        this.f23628n = aVar;
        this.f23631q = eVar;
        C0547p c0547p = new C0547p(this.f23622a.mo26764a(4), uri, 4, this.f23623b.mo27356b());
        AbstractC5332a.m21802g(this.f23629o == null);
        C0545n c0545n = new C0545n("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f23629o = c0545n;
        aVar.m382y(new C0179y(c0547p.f1805a, c0547p.f1806b, c0545n.m2105n(c0547p, this, this.f23624c.mo2088d(c0547p.f1807c))), c0547p.f1807c);
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: d */
    public void mo27391d(Uri uri) {
        c cVar = (c) this.f23625d.get(uri);
        if (cVar != null) {
            cVar.m27423z(false);
        }
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: e */
    public void mo27392e(Uri uri) {
        ((c) this.f23625d.get(uri)).m27417t();
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: f */
    public long mo27393f() {
        return this.f23636v;
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: g */
    public boolean mo27394g() {
        return this.f23635u;
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: h */
    public C6590g mo27395h() {
        return this.f23632r;
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: i */
    public boolean mo27396i(Uri uri, long j7) {
        if (((c) this.f23625d.get(uri)) != null) {
            return !r2.m27408h(j7);
        }
        return false;
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: j */
    public void mo27397j(InterfaceC6594k.b bVar) {
        this.f23626e.remove(bVar);
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: l */
    public void mo27398l() {
        C0545n c0545n = this.f23629o;
        if (c0545n != null) {
            c0545n.mo2097c();
        }
        Uri uri = this.f23633s;
        if (uri != null) {
            mo27392e(uri);
        }
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: n */
    public void mo27399n(Uri uri) {
        ((c) this.f23625d.get(uri)).m27414p(true);
    }

    @Override // p351u0.InterfaceC6594k
    /* renamed from: o */
    public C6589f mo27400o(Uri uri, boolean z6) {
        C6589f m27410j = ((c) this.f23625d.get(uri)).m27410j();
        if (m27410j != null && z6) {
            m27382O(uri);
            m27380M(uri);
        }
        return m27410j;
    }

    @Override // p351u0.InterfaceC6594k
    public void stop() {
        this.f23633s = null;
        this.f23634t = null;
        this.f23632r = null;
        this.f23636v = -9223372036854775807L;
        this.f23629o.m2103l();
        this.f23629o = null;
        Iterator it = this.f23625d.values().iterator();
        while (it.hasNext()) {
            ((c) it.next()).m27422y();
        }
        this.f23630p.removeCallbacksAndMessages(null);
        this.f23630p = null;
        this.f23625d.clear();
    }

    public C6586c(InterfaceC6413g interfaceC6413g, InterfaceC0544m interfaceC0544m, InterfaceC6593j interfaceC6593j, double d7) {
        this.f23622a = interfaceC6413g;
        this.f23623b = interfaceC6593j;
        this.f23624c = interfaceC0544m;
        this.f23627f = d7;
        this.f23626e = new CopyOnWriteArrayList();
        this.f23625d = new HashMap();
        this.f23636v = -9223372036854775807L;
    }
}
