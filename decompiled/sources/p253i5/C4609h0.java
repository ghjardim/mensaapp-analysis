package p253i5;

import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.tika.utils.StringUtils;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p171Y2.C2937t;
import p171Y2.InterfaceC2939v;
import p207d.AbstractC4094d;
import p237g5.AbstractC4400A;
import p237g5.AbstractC4406G;
import p237g5.AbstractC4417S;
import p237g5.AbstractC4420V;
import p237g5.AbstractC4430c0;
import p237g5.AbstractC4431d;
import p237g5.AbstractC4432d0;
import p237g5.AbstractC4435f;
import p237g5.AbstractC4437g;
import p237g5.AbstractC4443j;
import p237g5.AbstractC4445k;
import p237g5.C4404E;
import p237g5.C4405F;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4434e0;
import p237g5.C4448l0;
import p237g5.C4453o;
import p237g5.C4457q;
import p237g5.C4459r;
import p237g5.C4462t;
import p237g5.C4464v;
import p237g5.C4466x;
import p237g5.EnumC4455p;
import p237g5.ExecutorC4456p0;
import p237g5.InterfaceC4409J;
import p237g5.InterfaceC4440h0;
import p253i5.AbstractC4552D0;
import p253i5.C4555F;
import p253i5.C4558G0;
import p253i5.C4593Z;
import p253i5.C4610i;
import p253i5.C4615k0;
import p253i5.C4620n;
import p253i5.C4626q;
import p253i5.InterfaceC4612j;
import p253i5.InterfaceC4617l0;
import p256j$.util.DesugarCollections;

/* renamed from: i5.h0 */
/* loaded from: classes2.dex */
public final class C4609h0 extends AbstractC4420V implements InterfaceC4409J {

    /* renamed from: m0 */
    public static final Logger f16833m0 = Logger.getLogger(C4609h0.class.getName());

    /* renamed from: n0 */
    public static final Pattern f16834n0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: o0 */
    public static final C4448l0 f16835o0;

    /* renamed from: p0 */
    public static final C4448l0 f16836p0;

    /* renamed from: q0 */
    public static final C4448l0 f16837q0;

    /* renamed from: r0 */
    public static final C4615k0 f16838r0;

    /* renamed from: s0 */
    public static final AbstractC4406G f16839s0;

    /* renamed from: t0 */
    public static final AbstractC4437g f16840t0;

    /* renamed from: A */
    public final List f16841A;

    /* renamed from: B */
    public final String f16842B;

    /* renamed from: C */
    public AbstractC4430c0 f16843C;

    /* renamed from: D */
    public boolean f16844D;

    /* renamed from: E */
    public s f16845E;

    /* renamed from: F */
    public volatile AbstractC4417S.j f16846F;

    /* renamed from: G */
    public boolean f16847G;

    /* renamed from: H */
    public final Set f16848H;

    /* renamed from: I */
    public Collection f16849I;

    /* renamed from: J */
    public final Object f16850J;

    /* renamed from: K */
    public final Set f16851K;

    /* renamed from: L */
    public final C4547B f16852L;

    /* renamed from: M */
    public final y f16853M;

    /* renamed from: N */
    public final AtomicBoolean f16854N;

    /* renamed from: O */
    public boolean f16855O;

    /* renamed from: P */
    public boolean f16856P;

    /* renamed from: Q */
    public volatile boolean f16857Q;

    /* renamed from: R */
    public final CountDownLatch f16858R;

    /* renamed from: S */
    public final C4620n.b f16859S;

    /* renamed from: T */
    public final C4620n f16860T;

    /* renamed from: U */
    public final C4624p f16861U;

    /* renamed from: V */
    public final AbstractC4435f f16862V;

    /* renamed from: W */
    public final C4404E f16863W;

    /* renamed from: X */
    public final u f16864X;

    /* renamed from: Y */
    public v f16865Y;

    /* renamed from: Z */
    public C4615k0 f16866Z;

    /* renamed from: a */
    public final C4410K f16867a;

    /* renamed from: a0 */
    public final C4615k0 f16868a0;

    /* renamed from: b */
    public final String f16869b;

    /* renamed from: b0 */
    public boolean f16870b0;

    /* renamed from: c */
    public final String f16871c;

    /* renamed from: c0 */
    public final boolean f16872c0;

    /* renamed from: d */
    public final C4434e0 f16873d;

    /* renamed from: d0 */
    public final AbstractC4552D0.t f16874d0;

    /* renamed from: e */
    public final AbstractC4430c0.a f16875e;

    /* renamed from: e0 */
    public final long f16876e0;

    /* renamed from: f */
    public final C4610i f16877f;

    /* renamed from: f0 */
    public final long f16878f0;

    /* renamed from: g */
    public final InterfaceC4634u f16879g;

    /* renamed from: g0 */
    public final boolean f16880g0;

    /* renamed from: h */
    public final InterfaceC4634u f16881h;

    /* renamed from: h0 */
    public final C4462t.c f16882h0;

    /* renamed from: i */
    public final InterfaceC4634u f16883i;

    /* renamed from: i0 */
    public final InterfaceC4617l0.a f16884i0;

    /* renamed from: j */
    public final w f16885j;

    /* renamed from: j0 */
    public final AbstractC4590X f16886j0;

    /* renamed from: k */
    public final Executor f16887k;

    /* renamed from: k0 */
    public final m f16888k0;

    /* renamed from: l */
    public final InterfaceC4627q0 f16889l;

    /* renamed from: l0 */
    public final C4550C0 f16890l0;

    /* renamed from: m */
    public final InterfaceC4627q0 f16891m;

    /* renamed from: n */
    public final p f16892n;

    /* renamed from: o */
    public final p f16893o;

    /* renamed from: p */
    public final InterfaceC4581S0 f16894p;

    /* renamed from: q */
    public final int f16895q;

    /* renamed from: r */
    public final ExecutorC4456p0 f16896r;

    /* renamed from: s */
    public boolean f16897s;

    /* renamed from: t */
    public final C4464v f16898t;

    /* renamed from: u */
    public final C4453o f16899u;

    /* renamed from: v */
    public final InterfaceC2939v f16900v;

    /* renamed from: w */
    public final long f16901w;

    /* renamed from: x */
    public final C4640x f16902x;

    /* renamed from: y */
    public final InterfaceC4612j.a f16903y;

    /* renamed from: z */
    public final AbstractC4431d f16904z;

    /* renamed from: i5.h0$a */
    public class a extends AbstractC4406G {
        @Override // p237g5.AbstractC4406G
        /* renamed from: a */
        public AbstractC4406G.b mo18655a(AbstractC4417S.g gVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    /* renamed from: i5.h0$b */
    public final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4609h0.this.m19951y0(true);
        }
    }

    /* renamed from: i5.h0$c */
    public final class c implements C4620n.b {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4581S0 f16906a;

        public c(InterfaceC4581S0 interfaceC4581S0) {
            this.f16906a = interfaceC4581S0;
        }

        @Override // p253i5.C4620n.b
        /* renamed from: a */
        public C4620n mo19953a() {
            return new C4620n(this.f16906a);
        }
    }

    /* renamed from: i5.h0$d */
    public final class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f16908a;

        /* renamed from: b */
        public final /* synthetic */ EnumC4455p f16909b;

        public d(Runnable runnable, EnumC4455p enumC4455p) {
            this.f16908a = runnable;
            this.f16909b = enumC4455p;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4609h0.this.f16902x.m20168c(this.f16908a, C4609h0.this.f16887k, this.f16909b);
        }
    }

    /* renamed from: i5.h0$e */
    public final class e extends AbstractC4417S.j {

        /* renamed from: a */
        public final AbstractC4417S.f f16911a;

        /* renamed from: b */
        public final /* synthetic */ Throwable f16912b;

        public e(Throwable th) {
            this.f16912b = th;
            this.f16911a = AbstractC4417S.f.m18704e(C4448l0.f15809s.m18963q("Panic! This is a bug!").m18962p(th));
        }

        @Override // p237g5.AbstractC4417S.j
        /* renamed from: a */
        public AbstractC4417S.f mo18683a(AbstractC4417S.g gVar) {
            return this.f16911a;
        }

        public String toString() {
            return AbstractC2926i.m10534b(e.class).m10540d("panicPickResult", this.f16911a).toString();
        }
    }

    /* renamed from: i5.h0$f */
    public final class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4609h0.this.f16854N.get() || C4609h0.this.f16845E == null) {
                return;
            }
            C4609h0.this.m19951y0(false);
            C4609h0.this.m19952z0();
        }
    }

    /* renamed from: i5.h0$g */
    public final class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4609h0.this.m19940A0();
            if (C4609h0.this.f16846F != null) {
                C4609h0.this.f16846F.m18734b();
            }
            if (C4609h0.this.f16845E != null) {
                C4609h0.this.f16845E.f16945a.m19986c();
            }
        }
    }

    /* renamed from: i5.h0$h */
    public final class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4609h0.this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Entering SHUTDOWN state");
            C4609h0.this.f16902x.m20167b(EnumC4455p.SHUTDOWN);
        }
    }

    /* renamed from: i5.h0$i */
    public final class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4609h0.this.f16855O) {
                return;
            }
            C4609h0.this.f16855O = true;
            C4609h0.this.m19942E0();
        }
    }

    /* renamed from: i5.h0$j */
    public class j implements Thread.UncaughtExceptionHandler {
        public j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            C4609h0.f16833m0.log(Level.SEVERE, "[" + C4609h0.this.mo18676i() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            C4609h0.this.m19944G0(th);
        }
    }

    /* renamed from: i5.h0$k */
    public class k extends AbstractC4571N {

        /* renamed from: b */
        public final /* synthetic */ String f16919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC4430c0 abstractC4430c0, String str) {
            super(abstractC4430c0);
            this.f16919b = str;
        }

        @Override // p253i5.AbstractC4571N, p237g5.AbstractC4430c0
        /* renamed from: a */
        public String mo18871a() {
            return this.f16919b;
        }
    }

    /* renamed from: i5.h0$m */
    public final class m implements C4626q.e {

        /* renamed from: a */
        public volatile AbstractC4552D0.D f16920a;

        /* renamed from: i5.h0$m$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4609h0.this.m19940A0();
            }
        }

        /* renamed from: i5.h0$m$b */
        public final class b extends AbstractC4552D0 {

            /* renamed from: E */
            public final /* synthetic */ C4426a0 f16923E;

            /* renamed from: F */
            public final /* synthetic */ C4424Z f16924F;

            /* renamed from: G */
            public final /* synthetic */ C4429c f16925G;

            /* renamed from: H */
            public final /* synthetic */ C4554E0 f16926H;

            /* renamed from: I */
            public final /* synthetic */ C4584U f16927I;

            /* renamed from: J */
            public final /* synthetic */ C4459r f16928J;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, C4554E0 c4554e0, C4584U c4584u, C4459r c4459r) {
                super(c4426a0, c4424z, C4609h0.this.f16874d0, C4609h0.this.f16876e0, C4609h0.this.f16878f0, C4609h0.this.m19941B0(c4429c), C4609h0.this.f16881h.mo20012j0(), c4554e0, c4584u, m.this.f16920a);
                this.f16923E = c4426a0;
                this.f16924F = c4424z;
                this.f16925G = c4429c;
                this.f16926H = c4554e0;
                this.f16927I = c4584u;
                this.f16928J = c4459r;
            }

            @Override // p253i5.AbstractC4552D0
            /* renamed from: j0 */
            public InterfaceC4628r mo19479j0(C4424Z c4424z, AbstractC4445k.a aVar, int i7, boolean z6) {
                C4429c m18864r = this.f16925G.m18864r(aVar);
                AbstractC4445k[] m19600f = AbstractC4580S.m19600f(m18864r, c4424z, i7, z6);
                InterfaceC4632t m19956c = m.this.m19956c(new C4639w0(this.f16923E, c4424z, m18864r));
                C4459r m19008b = this.f16928J.m19008b();
                try {
                    return m19956c.mo19351g(this.f16923E, c4424z, m18864r, m19600f);
                } finally {
                    this.f16928J.m19010f(m19008b);
                }
            }

            @Override // p253i5.AbstractC4552D0
            /* renamed from: k0 */
            public void mo19480k0() {
                C4609h0.this.f16853M.m19977d(this);
            }

            @Override // p253i5.AbstractC4552D0
            /* renamed from: l0 */
            public C4448l0 mo19481l0() {
                return C4609h0.this.f16853M.m19974a(this);
            }
        }

        public m() {
        }

        @Override // p253i5.C4626q.e
        /* renamed from: a */
        public InterfaceC4628r mo19955a(C4426a0 c4426a0, C4429c c4429c, C4424Z c4424z, C4459r c4459r) {
            if (C4609h0.this.f16880g0) {
                C4615k0.b bVar = (C4615k0.b) c4429c.m18855h(C4615k0.b.f17064g);
                return new b(c4426a0, c4424z, c4429c, bVar == null ? null : bVar.f17069e, bVar != null ? bVar.f17070f : null, c4459r);
            }
            InterfaceC4632t m19956c = m19956c(new C4639w0(c4426a0, c4424z, c4429c));
            C4459r m19008b = c4459r.m19008b();
            try {
                return m19956c.mo19351g(c4426a0, c4424z, c4429c, AbstractC4580S.m19600f(c4429c, c4424z, 0, false));
            } finally {
                c4459r.m19010f(m19008b);
            }
        }

        /* renamed from: c */
        public final InterfaceC4632t m19956c(AbstractC4417S.g gVar) {
            AbstractC4417S.j jVar = C4609h0.this.f16846F;
            if (C4609h0.this.f16854N.get()) {
                return C4609h0.this.f16852L;
            }
            if (jVar == null) {
                C4609h0.this.f16896r.execute(new a());
                return C4609h0.this.f16852L;
            }
            InterfaceC4632t m19605k = AbstractC4580S.m19605k(jVar.mo18683a(gVar), gVar.mo18713a().m18857j());
            return m19605k != null ? m19605k : C4609h0.this.f16852L;
        }

        public /* synthetic */ m(C4609h0 c4609h0, a aVar) {
            this();
        }
    }

    /* renamed from: i5.h0$n */
    public static final class n extends AbstractC4400A {

        /* renamed from: a */
        public final AbstractC4406G f16930a;

        /* renamed from: b */
        public final AbstractC4431d f16931b;

        /* renamed from: c */
        public final Executor f16932c;

        /* renamed from: d */
        public final C4426a0 f16933d;

        /* renamed from: e */
        public final C4459r f16934e;

        /* renamed from: f */
        public C4429c f16935f;

        /* renamed from: g */
        public AbstractC4437g f16936g;

        /* renamed from: i5.h0$n$a */
        public class a extends AbstractRunnableC4642y {

            /* renamed from: b */
            public final /* synthetic */ AbstractC4437g.a f16937b;

            /* renamed from: c */
            public final /* synthetic */ C4448l0 f16938c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AbstractC4437g.a aVar, C4448l0 c4448l0) {
                super(n.this.f16934e);
                this.f16937b = aVar;
                this.f16938c = c4448l0;
            }

            @Override // p253i5.AbstractRunnableC4642y
            /* renamed from: a */
            public void mo19323a() {
                this.f16937b.mo6928a(this.f16938c, new C4424Z());
            }
        }

        public n(AbstractC4406G abstractC4406G, AbstractC4431d abstractC4431d, Executor executor, C4426a0 c4426a0, C4429c c4429c) {
            this.f16930a = abstractC4406G;
            this.f16931b = abstractC4431d;
            this.f16933d = c4426a0;
            executor = c4429c.m18852e() != null ? c4429c.m18852e() : executor;
            this.f16932c = executor;
            this.f16935f = c4429c.m18860n(executor);
            this.f16934e = C4459r.m19004e();
        }

        @Override // p237g5.AbstractC4400A, p237g5.AbstractC4436f0, p237g5.AbstractC4437g
        /* renamed from: a */
        public void mo18624a(String str, Throwable th) {
            AbstractC4437g abstractC4437g = this.f16936g;
            if (abstractC4437g != null) {
                abstractC4437g.mo18624a(str, th);
            }
        }

        @Override // p237g5.AbstractC4400A, p237g5.AbstractC4437g
        /* renamed from: e */
        public void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
            AbstractC4406G.b mo18655a = this.f16930a.mo18655a(new C4639w0(this.f16933d, c4424z, this.f16935f));
            C4448l0 m18659c = mo18655a.m18659c();
            if (!m18659c.m18961o()) {
                m19958h(aVar, AbstractC4580S.m19609o(m18659c));
                this.f16936g = C4609h0.f16840t0;
                return;
            }
            mo18655a.m18658b();
            C4615k0.b m20004f = ((C4615k0) mo18655a.m18657a()).m20004f(this.f16933d);
            if (m20004f != null) {
                this.f16935f = this.f16935f.m18863q(C4615k0.b.f17064g, m20004f);
            }
            AbstractC4437g mo18910h = this.f16931b.mo18910h(this.f16933d, this.f16935f);
            this.f16936g = mo18910h;
            mo18910h.mo18627e(aVar, c4424z);
        }

        @Override // p237g5.AbstractC4400A, p237g5.AbstractC4436f0
        /* renamed from: f */
        public AbstractC4437g mo6933f() {
            return this.f16936g;
        }

        /* renamed from: h */
        public final void m19958h(AbstractC4437g.a aVar, C4448l0 c4448l0) {
            this.f16932c.execute(new a(aVar, c4448l0));
        }
    }

    /* renamed from: i5.h0$o */
    public final class o implements InterfaceC4617l0.a {
        public o() {
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: c */
        public void mo19762c() {
            AbstractC2932o.m10579v(C4609h0.this.f16854N.get(), "Channel must have been shut down");
            C4609h0.this.f16856P = true;
            C4609h0.this.m19948K0(false);
            C4609h0.this.m19942E0();
            C4609h0.this.m19943F0();
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: d */
        public void mo19763d(C4448l0 c4448l0) {
            AbstractC2932o.m10579v(C4609h0.this.f16854N.get(), "Channel must have been shut down");
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: e */
        public void mo19764e(boolean z6) {
            C4609h0 c4609h0 = C4609h0.this;
            c4609h0.f16886j0.m19701e(c4609h0.f16852L, z6);
        }

        public /* synthetic */ o(C4609h0 c4609h0, a aVar) {
            this();
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: b */
        public void mo19761b() {
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: a */
        public C4425a mo19760a(C4425a c4425a) {
            return c4425a;
        }
    }

    /* renamed from: i5.h0$p */
    public static final class p implements Executor {

        /* renamed from: a */
        public final InterfaceC4627q0 f16941a;

        /* renamed from: b */
        public Executor f16942b;

        public p(InterfaceC4627q0 interfaceC4627q0) {
            this.f16941a = (InterfaceC4627q0) AbstractC2932o.m10573p(interfaceC4627q0, "executorPool");
        }

        /* renamed from: a */
        public synchronized Executor m19959a() {
            try {
                if (this.f16942b == null) {
                    this.f16942b = (Executor) AbstractC2932o.m10574q((Executor) this.f16941a.mo19576a(), "%s.getObject()", this.f16942b);
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f16942b;
        }

        /* renamed from: b */
        public synchronized void m19960b() {
            Executor executor = this.f16942b;
            if (executor != null) {
                this.f16942b = (Executor) this.f16941a.mo19577b(executor);
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            m19959a().execute(runnable);
        }
    }

    /* renamed from: i5.h0$q */
    public final class q extends AbstractC4590X {
        public q() {
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: b */
        public void mo19698b() {
            C4609h0.this.m19940A0();
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: c */
        public void mo19699c() {
            if (C4609h0.this.f16854N.get()) {
                return;
            }
            C4609h0.this.m19946I0();
        }

        public /* synthetic */ q(C4609h0 c4609h0, a aVar) {
            this();
        }
    }

    /* renamed from: i5.h0$r */
    public class r implements Runnable {
        public r() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4609h0.this.f16845E == null) {
                return;
            }
            C4609h0.this.m19952z0();
        }

        public /* synthetic */ r(C4609h0 c4609h0, a aVar) {
            this();
        }
    }

    /* renamed from: i5.h0$s */
    public final class s extends AbstractC4417S.e {

        /* renamed from: a */
        public C4610i.b f16945a;

        /* renamed from: i5.h0$s$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4609h0.this.m19945H0();
            }
        }

        /* renamed from: i5.h0$s$b */
        public final class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AbstractC4417S.j f16948a;

            /* renamed from: b */
            public final /* synthetic */ EnumC4455p f16949b;

            public b(AbstractC4417S.j jVar, EnumC4455p enumC4455p) {
                this.f16948a = jVar;
                this.f16949b = enumC4455p;
            }

            @Override // java.lang.Runnable
            public void run() {
                s sVar = s.this;
                if (sVar != C4609h0.this.f16845E) {
                    return;
                }
                C4609h0.this.m19950M0(this.f16948a);
                if (this.f16949b != EnumC4455p.SHUTDOWN) {
                    C4609h0.this.f16862V.mo18925b(AbstractC4435f.a.INFO, "Entering {0} state with picker: {1}", this.f16949b, this.f16948a);
                    C4609h0.this.f16902x.m20167b(this.f16949b);
                }
            }
        }

        public s() {
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: b */
        public AbstractC4435f mo18699b() {
            return C4609h0.this.f16862V;
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: c */
        public ScheduledExecutorService mo18700c() {
            return C4609h0.this.f16885j;
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: d */
        public ExecutorC4456p0 mo18701d() {
            return C4609h0.this.f16896r;
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: e */
        public void mo18702e() {
            C4609h0.this.f16896r.m18993e();
            C4609h0.this.f16896r.execute(new a());
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: f */
        public void mo18703f(EnumC4455p enumC4455p, AbstractC4417S.j jVar) {
            C4609h0.this.f16896r.m18993e();
            AbstractC2932o.m10573p(enumC4455p, "newState");
            AbstractC2932o.m10573p(jVar, "newPicker");
            C4609h0.this.f16896r.execute(new b(jVar, enumC4455p));
        }

        @Override // p237g5.AbstractC4417S.e
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC4600d mo18698a(AbstractC4417S.b bVar) {
            C4609h0.this.f16896r.m18993e();
            AbstractC2932o.m10579v(!C4609h0.this.f16856P, "Channel is being terminated");
            return C4609h0.this.new x(bVar);
        }

        public /* synthetic */ s(C4609h0 c4609h0, a aVar) {
            this();
        }
    }

    /* renamed from: i5.h0$t */
    public final class t extends AbstractC4430c0.d {

        /* renamed from: a */
        public final s f16951a;

        /* renamed from: b */
        public final AbstractC4430c0 f16952b;

        /* renamed from: i5.h0$t$a */
        public final class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4448l0 f16954a;

            public a(C4448l0 c4448l0) {
                this.f16954a = c4448l0;
            }

            @Override // java.lang.Runnable
            public void run() {
                t.this.m19963d(this.f16954a);
            }
        }

        /* renamed from: i5.h0$t$b */
        public final class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AbstractC4430c0.e f16956a;

            public b(AbstractC4430c0.e eVar) {
                this.f16956a = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C4615k0 c4615k0;
                if (C4609h0.this.f16843C != t.this.f16952b) {
                    return;
                }
                List m18900a = this.f16956a.m18900a();
                AbstractC4435f abstractC4435f = C4609h0.this.f16862V;
                AbstractC4435f.a aVar = AbstractC4435f.a.DEBUG;
                abstractC4435f.mo18925b(aVar, "Resolved address: {0}, config={1}", m18900a, this.f16956a.m18901b());
                v vVar = C4609h0.this.f16865Y;
                v vVar2 = v.SUCCESS;
                if (vVar != vVar2) {
                    C4609h0.this.f16862V.mo18925b(AbstractC4435f.a.INFO, "Address resolved: {0}", m18900a);
                    C4609h0.this.f16865Y = vVar2;
                }
                AbstractC4430c0.b m18902c = this.f16956a.m18902c();
                C4558G0.b bVar = (C4558G0.b) this.f16956a.m18901b().m18819b(C4558G0.f16519e);
                AbstractC4406G abstractC4406G = (AbstractC4406G) this.f16956a.m18901b().m18819b(AbstractC4406G.f15626a);
                C4615k0 c4615k02 = (m18902c == null || m18902c.m18893c() == null) ? null : (C4615k0) m18902c.m18893c();
                C4448l0 m18894d = m18902c != null ? m18902c.m18894d() : null;
                if (C4609h0.this.f16872c0) {
                    if (c4615k02 != null) {
                        if (abstractC4406G != null) {
                            C4609h0.this.f16864X.m19971q(abstractC4406G);
                            if (c4615k02.m20001c() != null) {
                                C4609h0.this.f16862V.mo18924a(aVar, "Method configs in service config will be discarded due to presence ofconfig-selector");
                            }
                        } else {
                            C4609h0.this.f16864X.m19971q(c4615k02.m20001c());
                        }
                    } else if (C4609h0.this.f16868a0 != null) {
                        c4615k02 = C4609h0.this.f16868a0;
                        C4609h0.this.f16864X.m19971q(c4615k02.m20001c());
                        C4609h0.this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Received no service config, using default service config");
                    } else if (m18894d == null) {
                        c4615k02 = C4609h0.f16838r0;
                        C4609h0.this.f16864X.m19971q(null);
                    } else {
                        if (!C4609h0.this.f16870b0) {
                            C4609h0.this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Fallback to error due to invalid first service config without default config");
                            t.this.mo18897a(m18902c.m18894d());
                            if (bVar != null) {
                                bVar.m19513a(m18902c.m18894d());
                                return;
                            }
                            return;
                        }
                        c4615k02 = C4609h0.this.f16866Z;
                    }
                    if (!c4615k02.equals(C4609h0.this.f16866Z)) {
                        C4609h0.this.f16862V.mo18925b(AbstractC4435f.a.INFO, "Service config changed{0}", c4615k02 == C4609h0.f16838r0 ? " to empty" : StringUtils.EMPTY);
                        C4609h0.this.f16866Z = c4615k02;
                        C4609h0.this.f16888k0.f16920a = c4615k02.m20005g();
                    }
                    try {
                        C4609h0.this.f16870b0 = true;
                    } catch (RuntimeException e7) {
                        C4609h0.f16833m0.log(Level.WARNING, "[" + C4609h0.this.mo18676i() + "] Unexpected exception from parsing service config", (Throwable) e7);
                    }
                    c4615k0 = c4615k02;
                } else {
                    if (c4615k02 != null) {
                        C4609h0.this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Service config from name resolver discarded by channel settings");
                    }
                    c4615k0 = C4609h0.this.f16868a0 == null ? C4609h0.f16838r0 : C4609h0.this.f16868a0;
                    if (abstractC4406G != null) {
                        C4609h0.this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Config selector from name resolver discarded by channel settings");
                    }
                    C4609h0.this.f16864X.m19971q(c4615k0.m20001c());
                }
                C4425a m18901b = this.f16956a.m18901b();
                t tVar = t.this;
                if (tVar.f16951a == C4609h0.this.f16845E) {
                    C4425a.b m18823c = m18901b.m18820d().m18823c(AbstractC4406G.f15626a);
                    Map m20002d = c4615k0.m20002d();
                    if (m20002d != null) {
                        m18823c.m18824d(AbstractC4417S.f15638b, m20002d).m18821a();
                    }
                    C4448l0 m19988e = t.this.f16951a.f16945a.m19988e(AbstractC4417S.h.m18716d().m18722b(m18900a).m18723c(m18823c.m18821a()).m18724d(c4615k0.m20003e()).m18721a());
                    if (bVar != null) {
                        bVar.m19513a(m19988e);
                    }
                }
            }
        }

        public t(s sVar, AbstractC4430c0 abstractC4430c0) {
            this.f16951a = (s) AbstractC2932o.m10573p(sVar, "helperImpl");
            this.f16952b = (AbstractC4430c0) AbstractC2932o.m10573p(abstractC4430c0, "resolver");
        }

        @Override // p237g5.AbstractC4430c0.d
        /* renamed from: a */
        public void mo18897a(C4448l0 c4448l0) {
            AbstractC2932o.m10562e(!c4448l0.m18961o(), "the error status must not be OK");
            C4609h0.this.f16896r.execute(new a(c4448l0));
        }

        @Override // p237g5.AbstractC4430c0.d
        /* renamed from: b */
        public void mo18898b(AbstractC4430c0.e eVar) {
            C4609h0.this.f16896r.execute(new b(eVar));
        }

        /* renamed from: d */
        public final void m19963d(C4448l0 c4448l0) {
            C4609h0.f16833m0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{C4609h0.this.mo18676i(), c4448l0});
            C4609h0.this.f16864X.m19968n();
            v vVar = C4609h0.this.f16865Y;
            v vVar2 = v.ERROR;
            if (vVar != vVar2) {
                C4609h0.this.f16862V.mo18925b(AbstractC4435f.a.WARNING, "Failed to resolve name: {0}", c4448l0);
                C4609h0.this.f16865Y = vVar2;
            }
            if (this.f16951a != C4609h0.this.f16845E) {
                return;
            }
            this.f16951a.f16945a.m19985b(c4448l0);
        }
    }

    /* renamed from: i5.h0$u */
    public class u extends AbstractC4431d {

        /* renamed from: a */
        public final AtomicReference f16958a;

        /* renamed from: b */
        public final String f16959b;

        /* renamed from: c */
        public final AbstractC4431d f16960c;

        /* renamed from: i5.h0$u$a */
        public class a extends AbstractC4431d {
            public a() {
            }

            @Override // p237g5.AbstractC4431d
            /* renamed from: a */
            public String mo18909a() {
                return u.this.f16959b;
            }

            @Override // p237g5.AbstractC4431d
            /* renamed from: h */
            public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
                return new C4626q(c4426a0, C4609h0.this.m19941B0(c4429c), c4429c, C4609h0.this.f16888k0, C4609h0.this.f16857Q ? null : C4609h0.this.f16881h.mo20012j0(), C4609h0.this.f16860T, null).m20086E(C4609h0.this.f16897s).m20085D(C4609h0.this.f16898t).m20084C(C4609h0.this.f16899u);
            }
        }

        /* renamed from: i5.h0$u$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C4609h0.this.f16849I == null) {
                    if (u.this.f16958a.get() == C4609h0.f16839s0) {
                        u.this.f16958a.set(null);
                    }
                    C4609h0.this.f16853M.m19975b(C4609h0.f16836p0);
                }
            }
        }

        /* renamed from: i5.h0$u$c */
        public final class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f16958a.get() == C4609h0.f16839s0) {
                    u.this.f16958a.set(null);
                }
                if (C4609h0.this.f16849I != null) {
                    Iterator it = C4609h0.this.f16849I.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).mo18624a("Channel is forcefully shutdown", null);
                    }
                }
                C4609h0.this.f16853M.m19976c(C4609h0.f16835o0);
            }
        }

        /* renamed from: i5.h0$u$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4609h0.this.m19940A0();
            }
        }

        /* renamed from: i5.h0$u$f */
        public class f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ g f16967a;

            public f(g gVar) {
                this.f16967a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (u.this.f16958a.get() != C4609h0.f16839s0) {
                    this.f16967a.m19972r();
                    return;
                }
                if (C4609h0.this.f16849I == null) {
                    C4609h0.this.f16849I = new LinkedHashSet();
                    C4609h0 c4609h0 = C4609h0.this;
                    c4609h0.f16886j0.m19701e(c4609h0.f16850J, true);
                }
                C4609h0.this.f16849I.add(this.f16967a);
            }
        }

        /* renamed from: i5.h0$u$g */
        public final class g extends AbstractC4545A {

            /* renamed from: l */
            public final C4459r f16969l;

            /* renamed from: m */
            public final C4426a0 f16970m;

            /* renamed from: n */
            public final C4429c f16971n;

            /* renamed from: o */
            public final long f16972o;

            /* renamed from: i5.h0$u$g$a */
            public class a implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ Runnable f16974a;

                public a(Runnable runnable) {
                    this.f16974a = runnable;
                }

                @Override // java.lang.Runnable
                public void run() {
                    this.f16974a.run();
                    g gVar = g.this;
                    C4609h0.this.f16896r.execute(gVar.new b());
                }
            }

            /* renamed from: i5.h0$u$g$b */
            public final class b implements Runnable {
                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (C4609h0.this.f16849I != null) {
                        C4609h0.this.f16849I.remove(g.this);
                        if (C4609h0.this.f16849I.isEmpty()) {
                            C4609h0 c4609h0 = C4609h0.this;
                            c4609h0.f16886j0.m19701e(c4609h0.f16850J, false);
                            C4609h0.this.f16849I = null;
                            if (C4609h0.this.f16854N.get()) {
                                C4609h0.this.f16853M.m19975b(C4609h0.f16836p0);
                            }
                        }
                    }
                }
            }

            public g(C4459r c4459r, C4426a0 c4426a0, C4429c c4429c) {
                super(C4609h0.this.m19941B0(c4429c), C4609h0.this.f16885j, c4429c.m18851d());
                this.f16969l = c4459r;
                this.f16970m = c4426a0;
                this.f16971n = c4429c;
                this.f16972o = C4609h0.this.f16882h0.mo19026a();
            }

            @Override // p253i5.AbstractC4545A
            /* renamed from: j */
            public void mo19315j() {
                super.mo19315j();
                C4609h0.this.f16896r.execute(new b());
            }

            /* renamed from: r */
            public void m19972r() {
                C4459r m19008b = this.f16969l.m19008b();
                try {
                    AbstractC4437g m19967m = u.this.m19967m(this.f16970m, this.f16971n.m18863q(AbstractC4445k.f15785a, Long.valueOf(C4609h0.this.f16882h0.mo19026a() - this.f16972o)));
                    this.f16969l.m19010f(m19008b);
                    Runnable m19321p = m19321p(m19967m);
                    if (m19321p == null) {
                        C4609h0.this.f16896r.execute(new b());
                    } else {
                        C4609h0.this.m19941B0(this.f16971n).execute(new a(m19321p));
                    }
                } catch (Throwable th) {
                    this.f16969l.m19010f(m19008b);
                    throw th;
                }
            }
        }

        public /* synthetic */ u(C4609h0 c4609h0, String str, a aVar) {
            this(str);
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: a */
        public String mo18909a() {
            return this.f16959b;
        }

        @Override // p237g5.AbstractC4431d
        /* renamed from: h */
        public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
            if (this.f16958a.get() != C4609h0.f16839s0) {
                return m19967m(c4426a0, c4429c);
            }
            C4609h0.this.f16896r.execute(new d());
            if (this.f16958a.get() != C4609h0.f16839s0) {
                return m19967m(c4426a0, c4429c);
            }
            if (C4609h0.this.f16854N.get()) {
                return new e();
            }
            g gVar = new g(C4459r.m19004e(), c4426a0, c4429c);
            C4609h0.this.f16896r.execute(new f(gVar));
            return gVar;
        }

        /* renamed from: m */
        public final AbstractC4437g m19967m(C4426a0 c4426a0, C4429c c4429c) {
            AbstractC4406G abstractC4406G = (AbstractC4406G) this.f16958a.get();
            if (abstractC4406G == null) {
                return this.f16960c.mo18910h(c4426a0, c4429c);
            }
            if (!(abstractC4406G instanceof C4615k0.c)) {
                return new n(abstractC4406G, this.f16960c, C4609h0.this.f16887k, c4426a0, c4429c);
            }
            C4615k0.b m20004f = ((C4615k0.c) abstractC4406G).f17071b.m20004f(c4426a0);
            if (m20004f != null) {
                c4429c = c4429c.m18863q(C4615k0.b.f17064g, m20004f);
            }
            return this.f16960c.mo18910h(c4426a0, c4429c);
        }

        /* renamed from: n */
        public void m19968n() {
            if (this.f16958a.get() == C4609h0.f16839s0) {
                m19971q(null);
            }
        }

        /* renamed from: o */
        public void m19969o() {
            C4609h0.this.f16896r.execute(new b());
        }

        /* renamed from: p */
        public void m19970p() {
            C4609h0.this.f16896r.execute(new c());
        }

        /* renamed from: q */
        public void m19971q(AbstractC4406G abstractC4406G) {
            AbstractC4406G abstractC4406G2 = (AbstractC4406G) this.f16958a.get();
            this.f16958a.set(abstractC4406G);
            if (abstractC4406G2 != C4609h0.f16839s0 || C4609h0.this.f16849I == null) {
                return;
            }
            Iterator it = C4609h0.this.f16849I.iterator();
            while (it.hasNext()) {
                ((g) it.next()).m19972r();
            }
        }

        public u(String str) {
            this.f16958a = new AtomicReference(C4609h0.f16839s0);
            this.f16960c = new a();
            this.f16959b = (String) AbstractC2932o.m10573p(str, "authority");
        }

        /* renamed from: i5.h0$u$e */
        public class e extends AbstractC4437g {
            public e() {
            }

            @Override // p237g5.AbstractC4437g
            /* renamed from: e */
            public void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
                aVar.mo6928a(C4609h0.f16836p0, new C4424Z());
            }

            @Override // p237g5.AbstractC4437g
            /* renamed from: b */
            public void mo6932b() {
            }

            @Override // p237g5.AbstractC4437g
            /* renamed from: c */
            public void mo18625c(int i7) {
            }

            @Override // p237g5.AbstractC4437g
            /* renamed from: d */
            public void mo18626d(Object obj) {
            }

            @Override // p237g5.AbstractC4437g
            /* renamed from: a */
            public void mo18624a(String str, Throwable th) {
            }
        }
    }

    /* renamed from: i5.h0$v */
    public enum v {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    /* renamed from: i5.h0$w */
    public static final class w implements ScheduledExecutorService {

        /* renamed from: a */
        public final ScheduledExecutorService f16981a;

        public /* synthetic */ w(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j7, TimeUnit timeUnit) {
            return this.f16981a.awaitTermination(j7, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f16981a.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection) {
            return this.f16981a.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection) {
            return this.f16981a.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f16981a.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f16981a.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Callable callable, long j7, TimeUnit timeUnit) {
            return this.f16981a.schedule(callable, j7, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
            return this.f16981a.scheduleAtFixedRate(runnable, j7, j8, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j7, long j8, TimeUnit timeUnit) {
            return this.f16981a.scheduleWithFixedDelay(runnable, j7, j8, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Callable callable) {
            return this.f16981a.submit(callable);
        }

        public w(ScheduledExecutorService scheduledExecutorService) {
            this.f16981a = (ScheduledExecutorService) AbstractC2932o.m10573p(scheduledExecutorService, "delegate");
        }

        @Override // java.util.concurrent.ExecutorService
        public List invokeAll(Collection collection, long j7, TimeUnit timeUnit) {
            return this.f16981a.invokeAll(collection, j7, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Object invokeAny(Collection collection, long j7, TimeUnit timeUnit) {
            return this.f16981a.invokeAny(collection, j7, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture schedule(Runnable runnable, long j7, TimeUnit timeUnit) {
            return this.f16981a.schedule(runnable, j7, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable) {
            return this.f16981a.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public Future submit(Runnable runnable, Object obj) {
            return this.f16981a.submit(runnable, obj);
        }
    }

    /* renamed from: i5.h0$x */
    public final class x extends AbstractC4600d {

        /* renamed from: a */
        public final AbstractC4417S.b f16982a;

        /* renamed from: b */
        public final C4410K f16983b;

        /* renamed from: c */
        public final C4622o f16984c;

        /* renamed from: d */
        public final C4624p f16985d;

        /* renamed from: e */
        public List f16986e;

        /* renamed from: f */
        public C4593Z f16987f;

        /* renamed from: g */
        public boolean f16988g;

        /* renamed from: h */
        public boolean f16989h;

        /* renamed from: i */
        public ExecutorC4456p0.d f16990i;

        /* renamed from: i5.h0$x$a */
        public final class a extends C4593Z.j {

            /* renamed from: a */
            public final /* synthetic */ AbstractC4417S.k f16992a;

            public a(AbstractC4417S.k kVar) {
                this.f16992a = kVar;
            }

            @Override // p253i5.C4593Z.j
            /* renamed from: a */
            public void mo19748a(C4593Z c4593z) {
                C4609h0.this.f16886j0.m19701e(c4593z, true);
            }

            @Override // p253i5.C4593Z.j
            /* renamed from: b */
            public void mo19749b(C4593Z c4593z) {
                C4609h0.this.f16886j0.m19701e(c4593z, false);
            }

            @Override // p253i5.C4593Z.j
            /* renamed from: c */
            public void mo19750c(C4593Z c4593z, C4457q c4457q) {
                AbstractC2932o.m10579v(this.f16992a != null, "listener is null");
                this.f16992a.mo18735a(c4457q);
            }

            @Override // p253i5.C4593Z.j
            /* renamed from: d */
            public void mo19751d(C4593Z c4593z) {
                C4609h0.this.f16848H.remove(c4593z);
                C4609h0.this.f16863W.m18649k(c4593z);
                C4609h0.this.m19943F0();
            }
        }

        /* renamed from: i5.h0$x$b */
        public final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x.this.f16987f.m19746f(C4609h0.f16837q0);
            }
        }

        public x(AbstractC4417S.b bVar) {
            AbstractC2932o.m10573p(bVar, "args");
            this.f16986e = bVar.m18685a();
            if (C4609h0.this.f16871c != null) {
                bVar = bVar.m18688e().m18693e(m19973j(bVar.m18685a())).m18691c();
            }
            this.f16982a = bVar;
            C4410K m18665b = C4410K.m18665b("Subchannel", C4609h0.this.mo18909a());
            this.f16983b = m18665b;
            C4624p c4624p = new C4624p(m18665b, C4609h0.this.f16895q, C4609h0.this.f16894p.mo19625a(), "Subchannel for " + bVar.m18685a());
            this.f16985d = c4624p;
            this.f16984c = new C4622o(c4624p, C4609h0.this.f16894p);
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: b */
        public List mo18726b() {
            C4609h0.this.f16896r.m18993e();
            AbstractC2932o.m10579v(this.f16988g, "not started");
            return this.f16986e;
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: c */
        public C4425a mo18727c() {
            return this.f16982a.m18686b();
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: d */
        public AbstractC4435f mo18728d() {
            return this.f16984c;
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: e */
        public Object mo18729e() {
            AbstractC2932o.m10579v(this.f16988g, "Subchannel is not started");
            return this.f16987f;
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: f */
        public void mo18730f() {
            C4609h0.this.f16896r.m18993e();
            AbstractC2932o.m10579v(this.f16988g, "not started");
            this.f16987f.mo19666a();
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: g */
        public void mo18731g() {
            ExecutorC4456p0.d dVar;
            C4609h0.this.f16896r.m18993e();
            if (this.f16987f == null) {
                this.f16989h = true;
                return;
            }
            if (!this.f16989h) {
                this.f16989h = true;
            } else {
                if (!C4609h0.this.f16856P || (dVar = this.f16990i) == null) {
                    return;
                }
                dVar.m18994a();
                this.f16990i = null;
            }
            if (C4609h0.this.f16856P) {
                this.f16987f.m19746f(C4609h0.f16836p0);
            } else {
                this.f16990i = C4609h0.this.f16896r.m18991c(new RunnableC4603e0(new b()), 5L, TimeUnit.SECONDS, C4609h0.this.f16881h.mo20012j0());
            }
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: h */
        public void mo18732h(AbstractC4417S.k kVar) {
            C4609h0.this.f16896r.m18993e();
            AbstractC2932o.m10579v(!this.f16988g, "already started");
            AbstractC2932o.m10579v(!this.f16989h, "already shutdown");
            AbstractC2932o.m10579v(!C4609h0.this.f16856P, "Channel is being terminated");
            this.f16988g = true;
            C4593Z c4593z = new C4593Z(this.f16982a.m18685a(), C4609h0.this.mo18909a(), C4609h0.this.f16842B, C4609h0.this.f16903y, C4609h0.this.f16881h, C4609h0.this.f16881h.mo20012j0(), C4609h0.this.f16900v, C4609h0.this.f16896r, new a(kVar), C4609h0.this.f16863W, C4609h0.this.f16859S.mo19953a(), this.f16985d, this.f16983b, this.f16984c, C4609h0.this.f16841A);
            C4609h0.this.f16861U.m20063e(new C4405F.a().m18651b("Child Subchannel started").m18652c(C4405F.b.CT_INFO).m18654e(C4609h0.this.f16894p.mo19625a()).m18653d(c4593z).m18650a());
            this.f16987f = c4593z;
            C4609h0.this.f16863W.m18646e(c4593z);
            C4609h0.this.f16848H.add(c4593z);
        }

        @Override // p237g5.AbstractC4417S.i
        /* renamed from: i */
        public void mo18733i(List list) {
            C4609h0.this.f16896r.m18993e();
            this.f16986e = list;
            if (C4609h0.this.f16871c != null) {
                list = m19973j(list);
            }
            this.f16987f.m19744V(list);
        }

        /* renamed from: j */
        public final List m19973j(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4466x c4466x = (C4466x) it.next();
                arrayList.add(new C4466x(c4466x.m19034a(), c4466x.m19035b().m18820d().m18823c(C4466x.f15902d).m18821a()));
            }
            return DesugarCollections.unmodifiableList(arrayList);
        }

        public String toString() {
            return this.f16983b.toString();
        }
    }

    static {
        C4448l0 c4448l0 = C4448l0.f15810t;
        f16835o0 = c4448l0.m18963q("Channel shutdownNow invoked");
        f16836p0 = c4448l0.m18963q("Channel shutdown invoked");
        f16837q0 = c4448l0.m18963q("Subchannel shutdown invoked");
        f16838r0 = C4615k0.m19999a();
        f16839s0 = new a();
        f16840t0 = new l();
    }

    public C4609h0(C4611i0 c4611i0, InterfaceC4634u interfaceC4634u, InterfaceC4612j.a aVar, InterfaceC4627q0 interfaceC4627q0, InterfaceC2939v interfaceC2939v, List list, InterfaceC4581S0 interfaceC4581S0) {
        a aVar2;
        ExecutorC4456p0 executorC4456p0 = new ExecutorC4456p0(new j());
        this.f16896r = executorC4456p0;
        this.f16902x = new C4640x();
        this.f16848H = new HashSet(16, 0.75f);
        this.f16850J = new Object();
        this.f16851K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.f16853M = new y(this, aVar3);
        this.f16854N = new AtomicBoolean(false);
        this.f16858R = new CountDownLatch(1);
        this.f16865Y = v.NO_RESOLUTION;
        this.f16866Z = f16838r0;
        this.f16870b0 = false;
        this.f16874d0 = new AbstractC4552D0.t();
        this.f16882h0 = C4462t.m19019j();
        o oVar = new o(this, aVar3);
        this.f16884i0 = oVar;
        this.f16886j0 = new q(this, aVar3);
        this.f16888k0 = new m(this, aVar3);
        String str = (String) AbstractC2932o.m10573p(c4611i0.f17025f, "target");
        this.f16869b = str;
        C4410K m18665b = C4410K.m18665b("Channel", str);
        this.f16867a = m18665b;
        this.f16894p = (InterfaceC4581S0) AbstractC2932o.m10573p(interfaceC4581S0, "timeProvider");
        InterfaceC4627q0 interfaceC4627q02 = (InterfaceC4627q0) AbstractC2932o.m10573p(c4611i0.f17020a, "executorPool");
        this.f16889l = interfaceC4627q02;
        Executor executor = (Executor) AbstractC2932o.m10573p((Executor) interfaceC4627q02.mo19576a(), "executor");
        this.f16887k = executor;
        this.f16879g = interfaceC4634u;
        p pVar = new p((InterfaceC4627q0) AbstractC2932o.m10573p(c4611i0.f17021b, "offloadExecutorPool"));
        this.f16893o = pVar;
        C4618m c4618m = new C4618m(interfaceC4634u, c4611i0.f17026g, pVar);
        this.f16881h = c4618m;
        this.f16883i = new C4618m(interfaceC4634u, null, pVar);
        w wVar = new w(c4618m.mo20012j0(), aVar3);
        this.f16885j = wVar;
        this.f16895q = c4611i0.f17041v;
        C4624p c4624p = new C4624p(m18665b, c4611i0.f17041v, interfaceC4581S0.mo19625a(), "Channel for '" + str + "'");
        this.f16861U = c4624p;
        C4622o c4622o = new C4622o(c4624p, interfaceC4581S0);
        this.f16862V = c4622o;
        InterfaceC4440h0 interfaceC4440h0 = c4611i0.f17044y;
        interfaceC4440h0 = interfaceC4440h0 == null ? AbstractC4580S.f16585q : interfaceC4440h0;
        boolean z6 = c4611i0.f17039t;
        this.f16880g0 = z6;
        C4610i c4610i = new C4610i(c4611i0.f17030k);
        this.f16877f = c4610i;
        C4434e0 c4434e0 = c4611i0.f17023d;
        this.f16873d = c4434e0;
        C4562I0 c4562i0 = new C4562I0(z6, c4611i0.f17035p, c4611i0.f17036q, c4610i);
        String str2 = c4611i0.f17029j;
        this.f16871c = str2;
        AbstractC4430c0.a m18882a = AbstractC4430c0.a.m18875g().m18884c(c4611i0.m19989e()).m18887f(interfaceC4440h0).m18890i(executorC4456p0).m18888g(wVar).m18889h(c4562i0).m18883b(c4622o).m18885d(pVar).m18886e(str2).m18882a();
        this.f16875e = m18882a;
        this.f16843C = m19882D0(str, str2, c4434e0, m18882a, c4618m.mo20014v0());
        this.f16891m = (InterfaceC4627q0) AbstractC2932o.m10573p(interfaceC4627q0, "balancerRpcExecutorPool");
        this.f16892n = new p(interfaceC4627q0);
        C4547B c4547b = new C4547B(executor, executorC4456p0);
        this.f16852L = c4547b;
        c4547b.mo19349d(oVar);
        this.f16903y = aVar;
        Map map = c4611i0.f17042w;
        if (map != null) {
            AbstractC4430c0.b mo18908a = c4562i0.mo18908a(map);
            AbstractC2932o.m10581x(mo18908a.m18894d() == null, "Default config is invalid: %s", mo18908a.m18894d());
            C4615k0 c4615k0 = (C4615k0) mo18908a.m18893c();
            this.f16868a0 = c4615k0;
            this.f16866Z = c4615k0;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f16868a0 = null;
        }
        boolean z7 = c4611i0.f17043x;
        this.f16872c0 = z7;
        u uVar = new u(this, this.f16843C.mo18871a(), aVar2);
        this.f16864X = uVar;
        this.f16904z = AbstractC4443j.m18927a(uVar, list);
        this.f16841A = new ArrayList(c4611i0.f17024e);
        this.f16900v = (InterfaceC2939v) AbstractC2932o.m10573p(interfaceC2939v, "stopwatchSupplier");
        long j7 = c4611i0.f17034o;
        if (j7 == -1) {
            this.f16901w = j7;
        } else {
            AbstractC2932o.m10567j(j7 >= C4611i0.f17008J, "invalid idleTimeoutMillis %s", j7);
            this.f16901w = c4611i0.f17034o;
        }
        this.f16890l0 = new C4550C0(new r(this, null), executorC4456p0, c4618m.mo20012j0(), (C2937t) interfaceC2939v.get());
        this.f16897s = c4611i0.f17031l;
        this.f16898t = (C4464v) AbstractC2932o.m10573p(c4611i0.f17032m, "decompressorRegistry");
        this.f16899u = (C4453o) AbstractC2932o.m10573p(c4611i0.f17033n, "compressorRegistry");
        this.f16842B = c4611i0.f17028i;
        this.f16878f0 = c4611i0.f17037r;
        this.f16876e0 = c4611i0.f17038s;
        c cVar = new c(interfaceC4581S0);
        this.f16859S = cVar;
        this.f16860T = cVar.mo19953a();
        C4404E c4404e = (C4404E) AbstractC2932o.m10572o(c4611i0.f17040u);
        this.f16863W = c4404e;
        c4404e.m18645d(this);
        if (z7) {
            return;
        }
        if (this.f16868a0 != null) {
            c4622o.mo18924a(AbstractC4435f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f16870b0 = true;
    }

    /* renamed from: C0 */
    public static AbstractC4430c0 m19880C0(String str, C4434e0 c4434e0, AbstractC4430c0.a aVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e7) {
            sb.append(e7.getMessage());
            uri = null;
        }
        AbstractC4432d0 m18919e = uri != null ? c4434e0.m18919e(uri.getScheme()) : null;
        String str2 = StringUtils.EMPTY;
        if (m18919e == null && !f16834n0.matcher(str).matches()) {
            try {
                uri = new URI(c4434e0.m18918c(), StringUtils.EMPTY, "/" + str, null);
                m18919e = c4434e0.m18919e(uri.getScheme());
            } catch (URISyntaxException e8) {
                throw new IllegalArgumentException(e8);
            }
        }
        if (m18919e == null) {
            if (sb.length() > 0) {
                str2 = " (" + ((Object) sb) + ")";
            }
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, str2));
        }
        if (collection != null && !collection.containsAll(m18919e.mo18911c())) {
            throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
        }
        AbstractC4430c0 mo18896b = m18919e.mo18896b(uri, aVar);
        if (mo18896b != null) {
            return mo18896b;
        }
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        throw new IllegalArgumentException(String.format("cannot create a NameResolver for %s%s", str, str2));
    }

    /* renamed from: D0 */
    public static AbstractC4430c0 m19882D0(String str, String str2, C4434e0 c4434e0, AbstractC4430c0.a aVar, Collection collection) {
        C4558G0 c4558g0 = new C4558G0(m19880C0(str, c4434e0, aVar, collection), new C4616l(new C4555F.a(), aVar.m18879d(), aVar.m18881f()), aVar.m18881f());
        return str2 == null ? c4558g0 : new k(c4558g0, str2);
    }

    /* renamed from: A0 */
    public void m19940A0() {
        this.f16896r.m18993e();
        if (this.f16854N.get() || this.f16847G) {
            return;
        }
        if (this.f16886j0.m19700d()) {
            m19951y0(false);
        } else {
            m19946I0();
        }
        if (this.f16845E != null) {
            return;
        }
        this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Exiting idle mode");
        s sVar = new s(this, null);
        sVar.f16945a = this.f16877f.m19982e(sVar);
        this.f16845E = sVar;
        this.f16843C.mo18874d(new t(sVar, this.f16843C));
        this.f16844D = true;
    }

    /* renamed from: B0 */
    public final Executor m19941B0(C4429c c4429c) {
        Executor m18852e = c4429c.m18852e();
        return m18852e == null ? this.f16887k : m18852e;
    }

    /* renamed from: E0 */
    public final void m19942E0() {
        if (this.f16855O) {
            Iterator it = this.f16848H.iterator();
            while (it.hasNext()) {
                ((C4593Z) it.next()).m19745b(f16835o0);
            }
            Iterator it2 = this.f16851K.iterator();
            if (it2.hasNext()) {
                AbstractC4094d.m17162a(it2.next());
                throw null;
            }
        }
    }

    /* renamed from: F0 */
    public final void m19943F0() {
        if (!this.f16857Q && this.f16854N.get() && this.f16848H.isEmpty() && this.f16851K.isEmpty()) {
            this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Terminated");
            this.f16863W.m18648j(this);
            this.f16889l.mo19577b(this.f16887k);
            this.f16892n.m19960b();
            this.f16893o.m19960b();
            this.f16881h.close();
            this.f16857Q = true;
            this.f16858R.countDown();
        }
    }

    /* renamed from: G0 */
    public void m19944G0(Throwable th) {
        if (this.f16847G) {
            return;
        }
        this.f16847G = true;
        m19951y0(true);
        m19948K0(false);
        m19950M0(new e(th));
        this.f16864X.m19971q(null);
        this.f16862V.mo18924a(AbstractC4435f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f16902x.m20167b(EnumC4455p.TRANSIENT_FAILURE);
    }

    /* renamed from: H0 */
    public final void m19945H0() {
        this.f16896r.m18993e();
        if (this.f16844D) {
            this.f16843C.mo18872b();
        }
    }

    /* renamed from: I0 */
    public final void m19946I0() {
        long j7 = this.f16901w;
        if (j7 == -1) {
            return;
        }
        this.f16890l0.m19402k(j7, TimeUnit.MILLISECONDS);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public C4609h0 mo18753n() {
        this.f16862V.mo18924a(AbstractC4435f.a.DEBUG, "shutdown() called");
        if (!this.f16854N.compareAndSet(false, true)) {
            return this;
        }
        this.f16896r.execute(new h());
        this.f16864X.m19969o();
        this.f16896r.execute(new b());
        return this;
    }

    /* renamed from: K0 */
    public final void m19948K0(boolean z6) {
        this.f16896r.m18993e();
        if (z6) {
            AbstractC2932o.m10579v(this.f16844D, "nameResolver is not started");
            AbstractC2932o.m10579v(this.f16845E != null, "lbHelper is null");
        }
        AbstractC4430c0 abstractC4430c0 = this.f16843C;
        if (abstractC4430c0 != null) {
            abstractC4430c0.mo18873c();
            this.f16844D = false;
            if (z6) {
                this.f16843C = m19882D0(this.f16869b, this.f16871c, this.f16873d, this.f16875e, this.f16881h.mo20014v0());
            } else {
                this.f16843C = null;
            }
        }
        s sVar = this.f16845E;
        if (sVar != null) {
            sVar.f16945a.m19987d();
            this.f16845E = null;
        }
        this.f16846F = null;
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public C4609h0 mo18754o() {
        this.f16862V.mo18924a(AbstractC4435f.a.DEBUG, "shutdownNow() called");
        mo18753n();
        this.f16864X.m19970p();
        this.f16896r.execute(new i());
        return this;
    }

    /* renamed from: M0 */
    public final void m19950M0(AbstractC4417S.j jVar) {
        this.f16846F = jVar;
        this.f16852L.m19355s(jVar);
    }

    @Override // p237g5.AbstractC4431d
    /* renamed from: a */
    public String mo18909a() {
        return this.f16904z.mo18909a();
    }

    @Override // p237g5.AbstractC4431d
    /* renamed from: h */
    public AbstractC4437g mo18910h(C4426a0 c4426a0, C4429c c4429c) {
        return this.f16904z.mo18910h(c4426a0, c4429c);
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        return this.f16867a;
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: j */
    public boolean mo18749j(long j7, TimeUnit timeUnit) {
        return this.f16858R.await(j7, timeUnit);
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: k */
    public void mo18750k() {
        this.f16896r.execute(new f());
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: l */
    public EnumC4455p mo18751l(boolean z6) {
        EnumC4455p m20166a = this.f16902x.m20166a();
        if (z6 && m20166a == EnumC4455p.IDLE) {
            this.f16896r.execute(new g());
        }
        return m20166a;
    }

    @Override // p237g5.AbstractC4420V
    /* renamed from: m */
    public void mo18752m(EnumC4455p enumC4455p, Runnable runnable) {
        this.f16896r.execute(new d(runnable, enumC4455p));
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10539c("logId", this.f16867a.m18668d()).m10540d("target", this.f16869b).toString();
    }

    /* renamed from: y0 */
    public final void m19951y0(boolean z6) {
        this.f16890l0.m19400i(z6);
    }

    /* renamed from: z0 */
    public final void m19952z0() {
        m19948K0(true);
        this.f16852L.m19355s(null);
        this.f16862V.mo18924a(AbstractC4435f.a.INFO, "Entering IDLE state");
        this.f16902x.m20167b(EnumC4455p.IDLE);
        if (this.f16886j0.m19697a(this.f16850J, this.f16852L)) {
            m19940A0();
        }
    }

    /* renamed from: i5.h0$y */
    public final class y {

        /* renamed from: a */
        public final Object f16995a;

        /* renamed from: b */
        public Collection f16996b;

        /* renamed from: c */
        public C4448l0 f16997c;

        public y() {
            this.f16995a = new Object();
            this.f16996b = new HashSet();
        }

        /* renamed from: a */
        public C4448l0 m19974a(AbstractC4552D0 abstractC4552D0) {
            synchronized (this.f16995a) {
                try {
                    C4448l0 c4448l0 = this.f16997c;
                    if (c4448l0 != null) {
                        return c4448l0;
                    }
                    this.f16996b.add(abstractC4552D0);
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public void m19975b(C4448l0 c4448l0) {
            synchronized (this.f16995a) {
                try {
                    if (this.f16997c != null) {
                        return;
                    }
                    this.f16997c = c4448l0;
                    boolean isEmpty = this.f16996b.isEmpty();
                    if (isEmpty) {
                        C4609h0.this.f16852L.mo19350f(c4448l0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: c */
        public void m19976c(C4448l0 c4448l0) {
            ArrayList arrayList;
            m19975b(c4448l0);
            synchronized (this.f16995a) {
                arrayList = new ArrayList(this.f16996b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC4628r) it.next()).mo19360a(c4448l0);
            }
            C4609h0.this.f16852L.mo19348b(c4448l0);
        }

        /* renamed from: d */
        public void m19977d(AbstractC4552D0 abstractC4552D0) {
            C4448l0 c4448l0;
            synchronized (this.f16995a) {
                try {
                    this.f16996b.remove(abstractC4552D0);
                    if (this.f16996b.isEmpty()) {
                        c4448l0 = this.f16997c;
                        this.f16996b = new HashSet();
                    } else {
                        c4448l0 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c4448l0 != null) {
                C4609h0.this.f16852L.mo19350f(c4448l0);
            }
        }

        public /* synthetic */ y(C4609h0 c4609h0, a aVar) {
            this();
        }
    }

    /* renamed from: i5.h0$l */
    public class l extends AbstractC4437g {
        @Override // p237g5.AbstractC4437g
        /* renamed from: b */
        public void mo6932b() {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: c */
        public void mo18625c(int i7) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: d */
        public void mo18626d(Object obj) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: a */
        public void mo18624a(String str, Throwable th) {
        }

        @Override // p237g5.AbstractC4437g
        /* renamed from: e */
        public void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
        }
    }
}
