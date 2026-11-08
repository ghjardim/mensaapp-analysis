package p253i5;

import java.net.SocketAddress;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC2990D;
import p178Z2.AbstractC3010Y;
import p178Z2.AbstractC3033v;
import p237g5.AbstractC4417S;
import p237g5.C4448l0;
import p237g5.C4457q;
import p237g5.C4466x;
import p237g5.EnumC4455p;
import p237g5.ExecutorC4456p0;
import p256j$.util.Objects;

/* renamed from: i5.s0 */
/* loaded from: classes2.dex */
public final class C4631s0 extends AbstractC4417S {

    /* renamed from: p */
    public static final Logger f17221p = Logger.getLogger(C4631s0.class.getName());

    /* renamed from: g */
    public final AbstractC4417S.e f17222g;

    /* renamed from: i */
    public d f17224i;

    /* renamed from: l */
    public ExecutorC4456p0.d f17227l;

    /* renamed from: m */
    public EnumC4455p f17228m;

    /* renamed from: n */
    public EnumC4455p f17229n;

    /* renamed from: o */
    public final boolean f17230o;

    /* renamed from: h */
    public final Map f17223h = new HashMap();

    /* renamed from: j */
    public int f17225j = 0;

    /* renamed from: k */
    public boolean f17226k = true;

    /* renamed from: i5.s0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17231a;

        static {
            int[] iArr = new int[EnumC4455p.values().length];
            f17231a = iArr;
            try {
                iArr[EnumC4455p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17231a[EnumC4455p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17231a[EnumC4455p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17231a[EnumC4455p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17231a[EnumC4455p.SHUTDOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: i5.s0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4631s0.this.f17227l = null;
            if (C4631s0.this.f17224i.m20125b()) {
                C4631s0.this.mo18681e();
            }
        }
    }

    /* renamed from: i5.s0$d */
    public static final class d {

        /* renamed from: a */
        public List f17236a;

        /* renamed from: b */
        public int f17237b;

        /* renamed from: c */
        public int f17238c;

        public d(List list) {
            this.f17236a = list == null ? Collections.emptyList() : list;
        }

        /* renamed from: a */
        public SocketAddress m20124a() {
            if (m20126c()) {
                return (SocketAddress) ((C4466x) this.f17236a.get(this.f17237b)).m19034a().get(this.f17238c);
            }
            throw new IllegalStateException("Index is past the end of the address group list");
        }

        /* renamed from: b */
        public boolean m20125b() {
            if (!m20126c()) {
                return false;
            }
            C4466x c4466x = (C4466x) this.f17236a.get(this.f17237b);
            int i7 = this.f17238c + 1;
            this.f17238c = i7;
            if (i7 < c4466x.m19034a().size()) {
                return true;
            }
            int i8 = this.f17237b + 1;
            this.f17237b = i8;
            this.f17238c = 0;
            return i8 < this.f17236a.size();
        }

        /* renamed from: c */
        public boolean m20126c() {
            return this.f17237b < this.f17236a.size();
        }

        /* renamed from: d */
        public void m20127d() {
            this.f17237b = 0;
            this.f17238c = 0;
        }

        /* renamed from: e */
        public boolean m20128e(SocketAddress socketAddress) {
            for (int i7 = 0; i7 < this.f17236a.size(); i7++) {
                int indexOf = ((C4466x) this.f17236a.get(i7)).m19034a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f17237b = i7;
                    this.f17238c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: f */
        public int m20129f() {
            List list = this.f17236a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
        /* renamed from: g */
        public void m20130g(AbstractC3033v abstractC3033v) {
            AbstractC3033v abstractC3033v2 = abstractC3033v;
            if (abstractC3033v == null) {
                abstractC3033v2 = Collections.emptyList();
            }
            this.f17236a = abstractC3033v2;
            m20127d();
        }
    }

    /* renamed from: i5.s0$e */
    public static final class e extends AbstractC4417S.j {

        /* renamed from: a */
        public final AbstractC4417S.f f17239a;

        public e(AbstractC4417S.f fVar) {
            this.f17239a = (AbstractC4417S.f) AbstractC2932o.m10573p(fVar, "result");
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return this.f17239a;
        }

        public String toString() {
            return AbstractC2926i.m10534b(e.class).m10540d("result", this.f17239a).toString();
        }
    }

    /* renamed from: i5.s0$f */
    public final class f extends AbstractC4417S.j {

        /* renamed from: a */
        public final C4631s0 f17240a;

        /* renamed from: b */
        public final AtomicBoolean f17241b = new AtomicBoolean(false);

        public f(C4631s0 c4631s0) {
            this.f17240a = (C4631s0) AbstractC2932o.m10573p(c4631s0, "pickFirstLeafLoadBalancer");
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            if (this.f17241b.compareAndSet(false, true)) {
                ExecutorC4456p0 mo18701d = C4631s0.this.f17222g.mo18701d();
                final C4631s0 c4631s0 = this.f17240a;
                Objects.requireNonNull(c4631s0);
                mo18701d.execute(new Runnable() { // from class: i5.t0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C4631s0.this.mo18681e();
                    }
                });
            }
            return AbstractC4417S.f.m18706g();
        }
    }

    /* renamed from: i5.s0$g */
    public static final class g {

        /* renamed from: a */
        public final AbstractC4417S.i f17243a;

        /* renamed from: b */
        public EnumC4455p f17244b;

        /* renamed from: c */
        public final c f17245c;

        /* renamed from: d */
        public boolean f17246d = false;

        public g(AbstractC4417S.i iVar, EnumC4455p enumC4455p, c cVar) {
            this.f17243a = iVar;
            this.f17244b = enumC4455p;
            this.f17245c = cVar;
        }

        /* renamed from: f */
        public final EnumC4455p m20136f() {
            return this.f17245c.f17233a.m18998c();
        }

        /* renamed from: g */
        public EnumC4455p m20137g() {
            return this.f17244b;
        }

        /* renamed from: h */
        public AbstractC4417S.i m20138h() {
            return this.f17243a;
        }

        /* renamed from: i */
        public boolean m20139i() {
            return this.f17246d;
        }

        /* renamed from: j */
        public final void m20140j(EnumC4455p enumC4455p) {
            this.f17244b = enumC4455p;
            if (enumC4455p == EnumC4455p.READY || enumC4455p == EnumC4455p.TRANSIENT_FAILURE) {
                this.f17246d = true;
            } else if (enumC4455p == EnumC4455p.IDLE) {
                this.f17246d = false;
            }
        }
    }

    public C4631s0(AbstractC4417S.e eVar) {
        EnumC4455p enumC4455p = EnumC4455p.IDLE;
        this.f17228m = enumC4455p;
        this.f17229n = enumC4455p;
        this.f17230o = AbstractC4580S.m19601g("GRPC_EXPERIMENTAL_XDS_DUALSTACK_ENDPOINTS", false);
        this.f17222g = (AbstractC4417S.e) AbstractC2932o.m10573p(eVar, "helper");
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: a */
    public C4448l0 mo18677a(AbstractC4417S.h hVar) {
        EnumC4455p enumC4455p;
        if (this.f17228m == EnumC4455p.SHUTDOWN) {
            return C4448l0.f15805o.m18963q("Already shut down");
        }
        List m18717a = hVar.m18717a();
        if (m18717a.isEmpty()) {
            C4448l0 m18963q = C4448l0.f15810t.m18963q("NameResolver returned no usable address. addrs=" + hVar.m18717a() + ", attrs=" + hVar.m18718b());
            mo18679c(m18963q);
            return m18963q;
        }
        Iterator it = m18717a.iterator();
        while (it.hasNext()) {
            if (((C4466x) it.next()) == null) {
                C4448l0 m18963q2 = C4448l0.f15810t.m18963q("NameResolver returned address list with null endpoint. addrs=" + hVar.m18717a() + ", attrs=" + hVar.m18718b());
                mo18679c(m18963q2);
                return m18963q2;
            }
        }
        this.f17226k = true;
        hVar.m18719c();
        AbstractC3033v m11063k = AbstractC3033v.m11045m().m11062j(m18717a).m11063k();
        d dVar = this.f17224i;
        if (dVar == null) {
            this.f17224i = new d(m11063k);
        } else if (this.f17228m == EnumC4455p.READY) {
            SocketAddress m20124a = dVar.m20124a();
            this.f17224i.m20130g(m11063k);
            if (this.f17224i.m20128e(m20124a)) {
                return C4448l0.f15795e;
            }
            this.f17224i.m20127d();
        } else {
            dVar.m20130g(m11063k);
        }
        HashSet<SocketAddress> hashSet = new HashSet(this.f17223h.keySet());
        HashSet hashSet2 = new HashSet();
        AbstractC3010Y it2 = m11063k.iterator();
        while (it2.hasNext()) {
            hashSet2.addAll(((C4466x) it2.next()).m19034a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((g) this.f17223h.remove(socketAddress)).m20138h().mo18731g();
            }
        }
        if (hashSet.size() == 0 || (enumC4455p = this.f17228m) == EnumC4455p.CONNECTING || enumC4455p == EnumC4455p.READY) {
            EnumC4455p enumC4455p2 = EnumC4455p.CONNECTING;
            this.f17228m = enumC4455p2;
            m20119v(enumC4455p2, new e(AbstractC4417S.f.m18706g()));
            m20111n();
            mo18681e();
        } else {
            EnumC4455p enumC4455p3 = EnumC4455p.IDLE;
            if (enumC4455p == enumC4455p3) {
                m20119v(enumC4455p3, new f(this));
            } else if (enumC4455p == EnumC4455p.TRANSIENT_FAILURE) {
                m20111n();
                mo18681e();
            }
        }
        return C4448l0.f15795e;
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: c */
    public void mo18679c(C4448l0 c4448l0) {
        Iterator it = this.f17223h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).m20138h().mo18731g();
        }
        this.f17223h.clear();
        m20119v(EnumC4455p.TRANSIENT_FAILURE, new e(AbstractC4417S.f.m18705f(c4448l0)));
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: e */
    public void mo18681e() {
        d dVar = this.f17224i;
        if (dVar == null || !dVar.m20126c() || this.f17228m == EnumC4455p.SHUTDOWN) {
            return;
        }
        SocketAddress m20124a = this.f17224i.m20124a();
        AbstractC4417S.i m20138h = this.f17223h.containsKey(m20124a) ? ((g) this.f17223h.get(m20124a)).m20138h() : m20112o(m20124a);
        int i7 = a.f17231a[((g) this.f17223h.get(m20124a)).m20137g().ordinal()];
        if (i7 == 1) {
            m20138h.mo18730f();
            ((g) this.f17223h.get(m20124a)).m20140j(EnumC4455p.CONNECTING);
            m20117t();
        } else {
            if (i7 == 2) {
                if (this.f17230o) {
                    m20117t();
                    return;
                } else {
                    m20138h.mo18730f();
                    return;
                }
            }
            if (i7 == 3) {
                f17221p.warning("Requesting a connection even though we have a READY subchannel");
            } else {
                if (i7 != 4) {
                    return;
                }
                this.f17224i.m20125b();
                mo18681e();
            }
        }
    }

    @Override // p237g5.AbstractC4417S
    /* renamed from: f */
    public void mo18682f() {
        f17221p.log(Level.FINE, "Shutting down, currently have {} subchannels created", Integer.valueOf(this.f17223h.size()));
        EnumC4455p enumC4455p = EnumC4455p.SHUTDOWN;
        this.f17228m = enumC4455p;
        this.f17229n = enumC4455p;
        m20111n();
        Iterator it = this.f17223h.values().iterator();
        while (it.hasNext()) {
            ((g) it.next()).m20138h().mo18731g();
        }
        this.f17223h.clear();
    }

    /* renamed from: n */
    public final void m20111n() {
        ExecutorC4456p0.d dVar = this.f17227l;
        if (dVar != null) {
            dVar.m18994a();
            this.f17227l = null;
        }
    }

    /* renamed from: o */
    public final AbstractC4417S.i m20112o(SocketAddress socketAddress) {
        c cVar = new c(this, null);
        final AbstractC4417S.i mo18698a = this.f17222g.mo18698a(AbstractC4417S.b.m18684d().m18693e(AbstractC2990D.m10790j(new C4466x(socketAddress))).m18690b(AbstractC4417S.f15639c, cVar).m18691c());
        if (mo18698a == null) {
            f17221p.warning("Was not able to create subchannel for " + socketAddress);
            throw new IllegalStateException("Can't create subchannel");
        }
        g gVar = new g(mo18698a, EnumC4455p.IDLE, cVar);
        cVar.f17234b = gVar;
        this.f17223h.put(socketAddress, gVar);
        if (mo18698a.mo18727c().m18819b(AbstractC4417S.f15640d) == null) {
            cVar.f17233a = C4457q.m18996a(EnumC4455p.READY);
        }
        mo18698a.mo18732h(new AbstractC4417S.k() { // from class: i5.r0
            @Override // p237g5.AbstractC4417S.k
            /* renamed from: a */
            public final void mo18735a(C4457q c4457q) {
                C4631s0.this.m20115r(mo18698a, c4457q);
            }
        });
        return mo18698a;
    }

    /* renamed from: p */
    public final SocketAddress m20113p(AbstractC4417S.i iVar) {
        return (SocketAddress) iVar.m18725a().m19034a().get(0);
    }

    /* renamed from: q */
    public final boolean m20114q() {
        d dVar = this.f17224i;
        if (dVar == null || dVar.m20126c() || this.f17223h.size() < this.f17224i.m20129f()) {
            return false;
        }
        Iterator it = this.f17223h.values().iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).m20139i()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m20115r(AbstractC4417S.i iVar, C4457q c4457q) {
        EnumC4455p m18998c = c4457q.m18998c();
        g gVar = (g) this.f17223h.get(m20113p(iVar));
        if (gVar == null || gVar.m20138h() != iVar || m18998c == EnumC4455p.SHUTDOWN) {
            return;
        }
        EnumC4455p enumC4455p = EnumC4455p.IDLE;
        if (m18998c == enumC4455p) {
            this.f17222g.mo18702e();
        }
        gVar.m20140j(m18998c);
        EnumC4455p enumC4455p2 = this.f17228m;
        EnumC4455p enumC4455p3 = EnumC4455p.TRANSIENT_FAILURE;
        if (enumC4455p2 == enumC4455p3 || this.f17229n == enumC4455p3) {
            if (m18998c == EnumC4455p.CONNECTING) {
                return;
            }
            if (m18998c == enumC4455p) {
                mo18681e();
                return;
            }
        }
        int i7 = a.f17231a[m18998c.ordinal()];
        if (i7 == 1) {
            this.f17224i.m20127d();
            this.f17228m = enumC4455p;
            m20119v(enumC4455p, new f(this));
            return;
        }
        if (i7 == 2) {
            EnumC4455p enumC4455p4 = EnumC4455p.CONNECTING;
            this.f17228m = enumC4455p4;
            m20119v(enumC4455p4, new e(AbstractC4417S.f.m18706g()));
            return;
        }
        if (i7 == 3) {
            m20118u(gVar);
            this.f17224i.m20128e(m20113p(iVar));
            this.f17228m = EnumC4455p.READY;
            m20120w(gVar);
            return;
        }
        if (i7 != 4) {
            throw new IllegalArgumentException("Unsupported state:" + m18998c);
        }
        if (this.f17224i.m20126c() && ((g) this.f17223h.get(this.f17224i.m20124a())).m20138h() == iVar && this.f17224i.m20125b()) {
            m20111n();
            mo18681e();
        }
        if (m20114q()) {
            this.f17228m = enumC4455p3;
            m20119v(enumC4455p3, new e(AbstractC4417S.f.m18705f(c4457q.m18999d())));
            int i8 = this.f17225j + 1;
            this.f17225j = i8;
            if (i8 >= this.f17224i.m20129f() || this.f17226k) {
                this.f17226k = false;
                this.f17225j = 0;
                this.f17222g.mo18702e();
            }
        }
    }

    /* renamed from: t */
    public final void m20117t() {
        if (this.f17230o) {
            ExecutorC4456p0.d dVar = this.f17227l;
            if (dVar == null || !dVar.m18995b()) {
                this.f17227l = this.f17222g.mo18701d().m18991c(new b(), 250L, TimeUnit.MILLISECONDS, this.f17222g.mo18700c());
            }
        }
    }

    /* renamed from: u */
    public final void m20118u(g gVar) {
        m20111n();
        for (g gVar2 : this.f17223h.values()) {
            if (!gVar2.m20138h().equals(gVar.f17243a)) {
                gVar2.m20138h().mo18731g();
            }
        }
        this.f17223h.clear();
        gVar.m20140j(EnumC4455p.READY);
        this.f17223h.put(m20113p(gVar.f17243a), gVar);
    }

    /* renamed from: v */
    public final void m20119v(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
        if (enumC4455p == this.f17229n && (enumC4455p == EnumC4455p.IDLE || enumC4455p == EnumC4455p.CONNECTING)) {
            return;
        }
        this.f17229n = enumC4455p;
        this.f17222g.mo18703f(enumC4455p, jVar);
    }

    /* renamed from: w */
    public final void m20120w(g gVar) {
        EnumC4455p enumC4455p = gVar.f17244b;
        EnumC4455p enumC4455p2 = EnumC4455p.READY;
        if (enumC4455p != enumC4455p2) {
            return;
        }
        if (gVar.m20136f() == enumC4455p2) {
            m20119v(enumC4455p2, new AbstractC4417S.d(AbstractC4417S.f.m18707h(gVar.f17243a)));
            return;
        }
        EnumC4455p m20136f = gVar.m20136f();
        EnumC4455p enumC4455p3 = EnumC4455p.TRANSIENT_FAILURE;
        if (m20136f == enumC4455p3) {
            m20119v(enumC4455p3, new e(AbstractC4417S.f.m18705f(gVar.f17245c.f17233a.m18999d())));
        } else if (this.f17229n != enumC4455p3) {
            m20119v(gVar.m20136f(), new e(AbstractC4417S.f.m18706g()));
        }
    }

    /* renamed from: i5.s0$c */
    public final class c implements AbstractC4417S.k {

        /* renamed from: a */
        public C4457q f17233a;

        /* renamed from: b */
        public g f17234b;

        public c() {
            this.f17233a = C4457q.m18996a(EnumC4455p.IDLE);
        }

        @Override // p237g5.AbstractC4417S.k
        /* renamed from: a */
        public void mo18735a(C4457q c4457q) {
            C4631s0.f17221p.log(Level.FINE, "Received health status {0} for subchannel {1}", new Object[]{c4457q, this.f17234b.f17243a});
            this.f17233a = c4457q;
            if (C4631s0.this.f17224i.m20126c() && ((g) C4631s0.this.f17223h.get(C4631s0.this.f17224i.m20124a())).f17245c == this) {
                C4631s0.this.m20120w(this.f17234b);
            }
        }

        public /* synthetic */ c(C4631s0 c4631s0, a aVar) {
            this();
        }
    }
}
