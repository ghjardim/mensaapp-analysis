package androidx.media3.exoplayer.rtsp;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.exoplayer.rtsp.C3380b;
import androidx.media3.exoplayer.rtsp.C3382d;
import androidx.media3.exoplayer.rtsp.C3384f;
import androidx.media3.exoplayer.rtsp.C3385g;
import androidx.media3.exoplayer.rtsp.InterfaceC3379a;
import androidx.media3.exoplayer.rtsp.RtspMediaSource;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import p022D0.C0143b0;
import p022D0.C0165m0;
import p022D0.InterfaceC0117C;
import p022D0.InterfaceC0145c0;
import p043G0.InterfaceC0375y;
import p050H0.C0545n;
import p050H0.InterfaceC0533b;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p178Z2.AbstractC3033v;
import p232g0.C4304J;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p284m0.C5561i;
import p292n0.C5714a1;
import p292n0.C5756s0;
import p292n0.C5762v0;
import p387z0.C7114o;
import p387z0.C7122w;
import p387z0.C7123x;

/* renamed from: androidx.media3.exoplayer.rtsp.f */
/* loaded from: classes.dex */
public final class C3384f implements InterfaceC0117C {

    /* renamed from: A */
    public boolean f11029A;

    /* renamed from: B */
    public int f11030B;

    /* renamed from: C */
    public boolean f11031C;

    /* renamed from: a */
    public final InterfaceC0533b f11032a;

    /* renamed from: b */
    public final Handler f11033b = AbstractC5330M.m21671A();

    /* renamed from: c */
    public final c f11034c;

    /* renamed from: d */
    public final C3382d f11035d;

    /* renamed from: e */
    public final List f11036e;

    /* renamed from: f */
    public final List f11037f;

    /* renamed from: n */
    public final d f11038n;

    /* renamed from: o */
    public final InterfaceC3379a.a f11039o;

    /* renamed from: p */
    public InterfaceC0117C.a f11040p;

    /* renamed from: q */
    public AbstractC3033v f11041q;

    /* renamed from: r */
    public IOException f11042r;

    /* renamed from: s */
    public RtspMediaSource.C3377c f11043s;

    /* renamed from: t */
    public long f11044t;

    /* renamed from: u */
    public long f11045u;

    /* renamed from: v */
    public long f11046v;

    /* renamed from: w */
    public boolean f11047w;

    /* renamed from: x */
    public boolean f11048x;

    /* renamed from: y */
    public boolean f11049y;

    /* renamed from: z */
    public boolean f11050z;

    /* renamed from: androidx.media3.exoplayer.rtsp.f$b */
    public final class b implements InterfaceC0885t {

        /* renamed from: a */
        public final InterfaceC0861T f11051a;

        @Override // p078L0.InterfaceC0885t
        /* renamed from: b */
        public InterfaceC0861T mo455b(int i7, int i8) {
            return this.f11051a;
        }

        @Override // p078L0.InterfaceC0885t
        /* renamed from: q */
        public void mo472q() {
            Handler handler = C3384f.this.f11033b;
            final C3384f c3384f = C3384f.this;
            handler.post(new Runnable() { // from class: z0.l
                @Override // java.lang.Runnable
                public final void run() {
                    C3384f.m13270J(C3384f.this);
                }
            });
        }

        public b(InterfaceC0861T interfaceC0861T) {
            this.f11051a = interfaceC0861T;
        }

        @Override // p078L0.InterfaceC0885t
        /* renamed from: j */
        public void mo466j(InterfaceC0855M interfaceC0855M) {
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$c */
    public final class c implements C0545n.b, C0143b0.d, C3382d.f, C3382d.e {
        public c() {
        }

        @Override // androidx.media3.exoplayer.rtsp.C3382d.f
        /* renamed from: a */
        public void mo13249a(String str, Throwable th) {
            C3384f.this.f11042r = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // androidx.media3.exoplayer.rtsp.C3382d.e
        /* renamed from: b */
        public void mo13246b() {
            C3384f.this.f11035d.m13220N0(C3384f.this.f11045u != -9223372036854775807L ? AbstractC5330M.m21758l1(C3384f.this.f11045u) : C3384f.this.f11046v != -9223372036854775807L ? AbstractC5330M.m21758l1(C3384f.this.f11046v) : 0L);
        }

        @Override // p022D0.C0143b0.d
        /* renamed from: c */
        public void mo457c(C4327q c4327q) {
            Handler handler = C3384f.this.f11033b;
            final C3384f c3384f = C3384f.this;
            handler.post(new Runnable() { // from class: z0.m
                @Override // java.lang.Runnable
                public final void run() {
                    C3384f.m13270J(C3384f.this);
                }
            });
        }

        @Override // androidx.media3.exoplayer.rtsp.C3382d.e
        /* renamed from: d */
        public void mo13247d(RtspMediaSource.C3377c c3377c) {
            if (!(c3377c instanceof RtspMediaSource.C3378d) || C3384f.this.f11031C) {
                C3384f.this.f11043s = c3377c;
            } else {
                C3384f.this.m13298X();
            }
        }

        @Override // androidx.media3.exoplayer.rtsp.C3382d.f
        /* renamed from: e */
        public void mo13250e(C7122w c7122w, AbstractC3033v abstractC3033v) {
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                C7114o c7114o = (C7114o) abstractC3033v.get(i7);
                C3384f c3384f = C3384f.this;
                f fVar = c3384f.new f(c7114o, i7, c3384f.f11039o);
                C3384f.this.f11036e.add(fVar);
                fVar.m13325k();
            }
            C3384f.this.f11038n.mo13158a(c7122w);
        }

        @Override // androidx.media3.exoplayer.rtsp.C3382d.e
        /* renamed from: f */
        public void mo13248f(long j7, AbstractC3033v abstractC3033v) {
            ArrayList arrayList = new ArrayList(abstractC3033v.size());
            for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
                arrayList.add((String) AbstractC5332a.m21800e(((C7123x) abstractC3033v.get(i7)).f25310c.getPath()));
            }
            for (int i8 = 0; i8 < C3384f.this.f11037f.size(); i8++) {
                if (!arrayList.contains(((e) C3384f.this.f11037f.get(i8)).m13311c().getPath())) {
                    C3384f.this.f11038n.mo13159b();
                    if (C3384f.this.m13294S()) {
                        C3384f.this.f11048x = true;
                        C3384f.this.f11045u = -9223372036854775807L;
                        C3384f.this.f11044t = -9223372036854775807L;
                        C3384f.this.f11046v = -9223372036854775807L;
                    }
                }
            }
            for (int i9 = 0; i9 < abstractC3033v.size(); i9++) {
                C7123x c7123x = (C7123x) abstractC3033v.get(i9);
                C3380b m13292Q = C3384f.this.m13292Q(c7123x.f25310c);
                if (m13292Q != null) {
                    m13292Q.m13171h(c7123x.f25308a);
                    m13292Q.m13170g(c7123x.f25309b);
                    if (C3384f.this.m13294S() && C3384f.this.f11045u == C3384f.this.f11044t) {
                        m13292Q.m13169f(j7, c7123x.f25308a);
                    }
                }
            }
            if (!C3384f.this.m13294S()) {
                if (C3384f.this.f11046v == -9223372036854775807L || !C3384f.this.f11031C) {
                    return;
                }
                C3384f c3384f = C3384f.this;
                c3384f.mo317o(c3384f.f11046v);
                C3384f.this.f11046v = -9223372036854775807L;
                return;
            }
            if (C3384f.this.f11045u == C3384f.this.f11044t) {
                C3384f.this.f11045u = -9223372036854775807L;
                C3384f.this.f11044t = -9223372036854775807L;
            } else {
                C3384f.this.f11045u = -9223372036854775807L;
                C3384f c3384f2 = C3384f.this;
                c3384f2.mo317o(c3384f2.f11044t);
            }
        }

        @Override // p050H0.C0545n.b
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo468k(C3380b c3380b, long j7, long j8, boolean z6) {
        }

        @Override // p050H0.C0545n.b
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void mo473r(C3380b c3380b, long j7, long j8) {
            if (C3384f.this.mo312f() == 0) {
                if (C3384f.this.f11031C) {
                    return;
                }
                C3384f.this.m13298X();
                return;
            }
            int i7 = 0;
            while (true) {
                if (i7 >= C3384f.this.f11036e.size()) {
                    break;
                }
                f fVar = (f) C3384f.this.f11036e.get(i7);
                if (fVar.f11058a.f11055b == c3380b) {
                    fVar.m13317c();
                    break;
                }
                i7++;
            }
            C3384f.this.f11035d.m13218L0();
        }

        @Override // p050H0.C0545n.b
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C0545n.c mo471m(C3380b c3380b, long j7, long j8, IOException iOException, int i7) {
            if (!C3384f.this.f11050z) {
                C3384f.this.f11042r = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                C3384f.this.f11043s = new RtspMediaSource.C3377c(c3380b.f10982b.f25287b.toString(), iOException);
            } else if (C3384f.m13281i(C3384f.this) < 3) {
                return C0545n.f1785d;
            }
            return C0545n.f1787f;
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$d */
    public interface d {
        /* renamed from: a */
        void mo13158a(C7122w c7122w);

        /* renamed from: b */
        void mo13159b();
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$e */
    public final class e {

        /* renamed from: a */
        public final C7114o f11054a;

        /* renamed from: b */
        public final C3380b f11055b;

        /* renamed from: c */
        public String f11056c;

        public e(C7114o c7114o, int i7, InterfaceC0861T interfaceC0861T, InterfaceC3379a.a aVar) {
            this.f11054a = c7114o;
            this.f11055b = new C3380b(i7, c7114o, new C3380b.a() { // from class: z0.n
                @Override // androidx.media3.exoplayer.rtsp.C3380b.a
                /* renamed from: a */
                public final void mo13172a(String str, InterfaceC3379a interfaceC3379a) {
                    C3384f.e.this.m13314f(str, interfaceC3379a);
                }
            }, new b(interfaceC0861T), aVar);
        }

        /* renamed from: c */
        public Uri m13311c() {
            return this.f11055b.f10982b.f25287b;
        }

        /* renamed from: d */
        public String m13312d() {
            AbstractC5332a.m21804i(this.f11056c);
            return this.f11056c;
        }

        /* renamed from: e */
        public boolean m13313e() {
            return this.f11056c != null;
        }

        /* renamed from: f */
        public final /* synthetic */ void m13314f(String str, InterfaceC3379a interfaceC3379a) {
            this.f11056c = str;
            C3385g.b mo13163j = interfaceC3379a.mo13163j();
            if (mo13163j != null) {
                C3384f.this.f11035d.m13214G0(interfaceC3379a.mo13161e(), mo13163j);
                C3384f.this.f11031C = true;
            }
            C3384f.this.m13295U();
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$f */
    public final class f {

        /* renamed from: a */
        public final e f11058a;

        /* renamed from: b */
        public final C0545n f11059b;

        /* renamed from: c */
        public final C0143b0 f11060c;

        /* renamed from: d */
        public boolean f11061d;

        /* renamed from: e */
        public boolean f11062e;

        public f(C7114o c7114o, int i7, InterfaceC3379a.a aVar) {
            this.f11059b = new C0545n("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i7);
            C0143b0 m532l = C0143b0.m532l(C3384f.this.f11032a);
            this.f11060c = m532l;
            this.f11058a = C3384f.this.new e(c7114o, i7, m532l, aVar);
            m532l.m567e0(C3384f.this.f11034c);
        }

        /* renamed from: c */
        public void m13317c() {
            if (this.f11061d) {
                return;
            }
            this.f11058a.f11055b.mo482c();
            this.f11061d = true;
            C3384f.this.m13301b0();
        }

        /* renamed from: d */
        public long m13318d() {
            return this.f11060c.m533A();
        }

        /* renamed from: e */
        public boolean m13319e() {
            return this.f11060c.m544L(this.f11061d);
        }

        /* renamed from: f */
        public int m13320f(C5756s0 c5756s0, C5561i c5561i, int i7) {
            return this.f11060c.m551T(c5756s0, c5561i, i7, this.f11061d);
        }

        /* renamed from: g */
        public void m13321g() {
            if (this.f11062e) {
                return;
            }
            this.f11059b.m2103l();
            this.f11060c.m552U();
            this.f11062e = true;
        }

        /* renamed from: h */
        public void m13322h() {
            AbstractC5332a.m21802g(this.f11061d);
            this.f11061d = false;
            C3384f.this.m13301b0();
            m13325k();
        }

        /* renamed from: i */
        public void m13323i(long j7) {
            if (this.f11061d) {
                return;
            }
            this.f11058a.f11055b.m13168e();
            this.f11060c.m554W();
            this.f11060c.m563c0(j7);
        }

        /* renamed from: j */
        public int m13324j(long j7) {
            int m538F = this.f11060c.m538F(j7, this.f11061d);
            this.f11060c.m569f0(m538F);
            return m538F;
        }

        /* renamed from: k */
        public void m13325k() {
            this.f11059b.m2105n(this.f11058a.f11055b, C3384f.this.f11034c, 0);
        }
    }

    /* renamed from: androidx.media3.exoplayer.rtsp.f$g */
    public final class g implements InterfaceC0145c0 {

        /* renamed from: a */
        public final int f11064a;

        public g(int i7) {
            this.f11064a = i7;
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: b */
        public boolean mo487b() {
            return C3384f.this.m13293R(this.f11064a);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: c */
        public void mo488c() {
            if (C3384f.this.f11043s != null) {
                throw C3384f.this.f11043s;
            }
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: j */
        public int mo489j(long j7) {
            return C3384f.this.m13300Z(this.f11064a, j7);
        }

        @Override // p022D0.InterfaceC0145c0
        /* renamed from: q */
        public int mo490q(C5756s0 c5756s0, C5561i c5561i, int i7) {
            return C3384f.this.m13296V(this.f11064a, c5756s0, c5561i, i7);
        }
    }

    public C3384f(InterfaceC0533b interfaceC0533b, InterfaceC3379a.a aVar, Uri uri, d dVar, String str, SocketFactory socketFactory, boolean z6) {
        this.f11032a = interfaceC0533b;
        this.f11039o = aVar;
        this.f11038n = dVar;
        c cVar = new c();
        this.f11034c = cVar;
        this.f11035d = new C3382d(cVar, cVar, str, uri, socketFactory, z6);
        this.f11036e = new ArrayList();
        this.f11037f = new ArrayList();
        this.f11045u = -9223372036854775807L;
        this.f11044t = -9223372036854775807L;
        this.f11046v = -9223372036854775807L;
    }

    /* renamed from: J */
    public static /* synthetic */ void m13270J(C3384f c3384f) {
        c3384f.m13277T();
    }

    /* renamed from: P */
    public static AbstractC3033v m13276P(AbstractC3033v abstractC3033v) {
        AbstractC3033v.a aVar = new AbstractC3033v.a();
        for (int i7 = 0; i7 < abstractC3033v.size(); i7++) {
            aVar.mo11040a(new C4304J(Integer.toString(i7), (C4327q) AbstractC5332a.m21800e(((f) abstractC3033v.get(i7)).f11060c.m539G())));
        }
        return aVar.m11063k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public void m13277T() {
        if (this.f11049y || this.f11050z) {
            return;
        }
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            if (((f) this.f11036e.get(i7)).f11060c.m539G() == null) {
                return;
            }
        }
        this.f11050z = true;
        this.f11041q = m13276P(AbstractC3033v.m11048p(this.f11036e));
        ((InterfaceC0117C.a) AbstractC5332a.m21800e(this.f11040p)).mo322c(this);
    }

    /* renamed from: a0 */
    private boolean m13278a0() {
        return this.f11048x;
    }

    /* renamed from: i */
    public static /* synthetic */ int m13281i(C3384f c3384f) {
        int i7 = c3384f.f11030B;
        c3384f.f11030B = i7 + 1;
        return i7;
    }

    /* renamed from: Q */
    public final C3380b m13292Q(Uri uri) {
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            if (!((f) this.f11036e.get(i7)).f11061d) {
                e eVar = ((f) this.f11036e.get(i7)).f11058a;
                if (eVar.m13311c().equals(uri)) {
                    return eVar.f11055b;
                }
            }
        }
        return null;
    }

    /* renamed from: R */
    public boolean m13293R(int i7) {
        return !m13278a0() && ((f) this.f11036e.get(i7)).m13319e();
    }

    /* renamed from: S */
    public final boolean m13294S() {
        return this.f11045u != -9223372036854775807L;
    }

    /* renamed from: U */
    public final void m13295U() {
        boolean z6 = true;
        for (int i7 = 0; i7 < this.f11037f.size(); i7++) {
            z6 &= ((e) this.f11037f.get(i7)).m13313e();
        }
        if (z6 && this.f11029A) {
            this.f11035d.m13217K0(this.f11037f);
        }
    }

    /* renamed from: V */
    public int m13296V(int i7, C5756s0 c5756s0, C5561i c5561i, int i8) {
        if (m13278a0()) {
            return -3;
        }
        return ((f) this.f11036e.get(i7)).m13320f(c5756s0, c5561i, i8);
    }

    /* renamed from: W */
    public void m13297W() {
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            ((f) this.f11036e.get(i7)).m13321g();
        }
        AbstractC5330M.m21759m(this.f11035d);
        this.f11049y = true;
    }

    /* renamed from: X */
    public final void m13298X() {
        this.f11031C = true;
        this.f11035d.m13215H0();
        InterfaceC3379a.a mo13165b = this.f11039o.mo13165b();
        if (mo13165b == null) {
            this.f11043s = new RtspMediaSource.C3377c("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f11036e.size());
        ArrayList arrayList2 = new ArrayList(this.f11037f.size());
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            f fVar = (f) this.f11036e.get(i7);
            if (fVar.f11061d) {
                arrayList.add(fVar);
            } else {
                f fVar2 = new f(fVar.f11058a.f11054a, i7, mo13165b);
                arrayList.add(fVar2);
                fVar2.m13325k();
                if (this.f11037f.contains(fVar.f11058a)) {
                    arrayList2.add(fVar2.f11058a);
                }
            }
        }
        AbstractC3033v m11048p = AbstractC3033v.m11048p(this.f11036e);
        this.f11036e.clear();
        this.f11036e.addAll(arrayList);
        this.f11037f.clear();
        this.f11037f.addAll(arrayList2);
        for (int i8 = 0; i8 < m11048p.size(); i8++) {
            ((f) m11048p.get(i8)).m13317c();
        }
    }

    /* renamed from: Y */
    public final boolean m13299Y(long j7) {
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            if (!((f) this.f11036e.get(i7)).f11060c.m559a0(j7, false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Z */
    public int m13300Z(int i7, long j7) {
        if (m13278a0()) {
            return -3;
        }
        return ((f) this.f11036e.get(i7)).m13324j(j7);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: a */
    public long mo309a() {
        return mo312f();
    }

    /* renamed from: b0 */
    public final void m13301b0() {
        this.f11047w = true;
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            this.f11047w &= ((f) this.f11036e.get(i7)).f11061d;
        }
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: d */
    public boolean mo310d() {
        return !this.f11047w && (this.f11035d.m13212E0() == 2 || this.f11035d.m13212E0() == 1);
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: e */
    public boolean mo311e(C5762v0 c5762v0) {
        return mo310d();
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: f */
    public long mo312f() {
        if (this.f11047w || this.f11036e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        long j7 = this.f11044t;
        if (j7 != -9223372036854775807L) {
            return j7;
        }
        boolean z6 = true;
        long j8 = Long.MAX_VALUE;
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            f fVar = (f) this.f11036e.get(i7);
            if (!fVar.f11061d) {
                j8 = Math.min(j8, fVar.m13318d());
                z6 = false;
            }
        }
        if (z6 || j8 == Long.MIN_VALUE) {
            return 0L;
        }
        return j8;
    }

    @Override // p022D0.InterfaceC0117C, p022D0.InterfaceC0147d0
    /* renamed from: h */
    public void mo314h(long j7) {
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: l */
    public void mo315l() {
        IOException iOException = this.f11042r;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: n */
    public long mo316n(InterfaceC0375y[] interfaceC0375yArr, boolean[] zArr, InterfaceC0145c0[] interfaceC0145c0Arr, boolean[] zArr2, long j7) {
        for (int i7 = 0; i7 < interfaceC0375yArr.length; i7++) {
            if (interfaceC0145c0Arr[i7] != null && (interfaceC0375yArr[i7] == null || !zArr[i7])) {
                interfaceC0145c0Arr[i7] = null;
            }
        }
        this.f11037f.clear();
        for (int i8 = 0; i8 < interfaceC0375yArr.length; i8++) {
            InterfaceC0375y interfaceC0375y = interfaceC0375yArr[i8];
            if (interfaceC0375y != null) {
                C4304J mo389a = interfaceC0375y.mo389a();
                int indexOf = ((AbstractC3033v) AbstractC5332a.m21800e(this.f11041q)).indexOf(mo389a);
                this.f11037f.add(((f) AbstractC5332a.m21800e((f) this.f11036e.get(indexOf))).f11058a);
                if (this.f11041q.contains(mo389a) && interfaceC0145c0Arr[i8] == null) {
                    interfaceC0145c0Arr[i8] = new g(indexOf);
                    zArr2[i8] = true;
                }
            }
        }
        for (int i9 = 0; i9 < this.f11036e.size(); i9++) {
            f fVar = (f) this.f11036e.get(i9);
            if (!this.f11037f.contains(fVar.f11058a)) {
                fVar.m13317c();
            }
        }
        this.f11029A = true;
        if (j7 != 0) {
            this.f11044t = j7;
            this.f11045u = j7;
            this.f11046v = j7;
        }
        m13295U();
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: o */
    public long mo317o(long j7) {
        if (mo312f() == 0 && !this.f11031C) {
            this.f11046v = j7;
            return j7;
        }
        mo321u(j7, false);
        this.f11044t = j7;
        if (m13294S()) {
            int m13212E0 = this.f11035d.m13212E0();
            if (m13212E0 == 1) {
                return j7;
            }
            if (m13212E0 != 2) {
                throw new IllegalStateException();
            }
            this.f11045u = j7;
            this.f11035d.m13216I0(j7);
            return j7;
        }
        if (m13299Y(j7)) {
            return j7;
        }
        this.f11045u = j7;
        if (this.f11047w) {
            for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
                ((f) this.f11036e.get(i7)).m13322h();
            }
            if (this.f11031C) {
                this.f11035d.m13220N0(AbstractC5330M.m21758l1(j7));
            } else {
                this.f11035d.m13216I0(j7);
            }
        } else {
            this.f11035d.m13216I0(j7);
        }
        for (int i8 = 0; i8 < this.f11036e.size(); i8++) {
            ((f) this.f11036e.get(i8)).m13323i(j7);
        }
        return j7;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: p */
    public void mo318p(InterfaceC0117C.a aVar, long j7) {
        this.f11040p = aVar;
        try {
            this.f11035d.m13219M0();
        } catch (IOException e7) {
            this.f11042r = e7;
            AbstractC5330M.m21759m(this.f11035d);
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: s */
    public long mo319s() {
        if (!this.f11048x) {
            return -9223372036854775807L;
        }
        this.f11048x = false;
        return 0L;
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: t */
    public C0165m0 mo320t() {
        AbstractC5332a.m21802g(this.f11050z);
        return new C0165m0((C4304J[]) ((AbstractC3033v) AbstractC5332a.m21800e(this.f11041q)).toArray(new C4304J[0]));
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: u */
    public void mo321u(long j7, boolean z6) {
        if (m13294S()) {
            return;
        }
        for (int i7 = 0; i7 < this.f11036e.size(); i7++) {
            f fVar = (f) this.f11036e.get(i7);
            if (!fVar.f11061d) {
                fVar.f11060c.m579q(j7, z6, true);
            }
        }
    }

    @Override // p022D0.InterfaceC0117C
    /* renamed from: g */
    public long mo313g(long j7, C5714a1 c5714a1) {
        return j7;
    }
}
