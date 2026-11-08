package p253i5;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p171Y2.C2937t;
import p171Y2.InterfaceC2939v;
import p207d.AbstractC4094d;
import p237g5.AbstractC4435f;
import p237g5.AbstractC4445k;
import p237g5.C4403D;
import p237g5.C4404E;
import p237g5.C4410K;
import p237g5.C4424Z;
import p237g5.C4425a;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4457q;
import p237g5.C4466x;
import p237g5.EnumC4455p;
import p237g5.ExecutorC4456p0;
import p237g5.InterfaceC4409J;
import p253i5.InterfaceC4612j;
import p253i5.InterfaceC4617l0;
import p253i5.InterfaceC4630s;
import p253i5.InterfaceC4634u;
import p256j$.util.DesugarCollections;

/* renamed from: i5.Z */
/* loaded from: classes2.dex */
public final class C4593Z implements InterfaceC4409J, InterfaceC4585U0 {

    /* renamed from: a */
    public final C4410K f16678a;

    /* renamed from: b */
    public final String f16679b;

    /* renamed from: c */
    public final String f16680c;

    /* renamed from: d */
    public final InterfaceC4612j.a f16681d;

    /* renamed from: e */
    public final j f16682e;

    /* renamed from: f */
    public final InterfaceC4634u f16683f;

    /* renamed from: g */
    public final ScheduledExecutorService f16684g;

    /* renamed from: h */
    public final C4404E f16685h;

    /* renamed from: i */
    public final C4620n f16686i;

    /* renamed from: j */
    public final C4624p f16687j;

    /* renamed from: k */
    public final AbstractC4435f f16688k;

    /* renamed from: l */
    public final List f16689l;

    /* renamed from: m */
    public final ExecutorC4456p0 f16690m;

    /* renamed from: n */
    public final k f16691n;

    /* renamed from: o */
    public volatile List f16692o;

    /* renamed from: p */
    public InterfaceC4612j f16693p;

    /* renamed from: q */
    public final C2937t f16694q;

    /* renamed from: r */
    public ExecutorC4456p0.d f16695r;

    /* renamed from: s */
    public ExecutorC4456p0.d f16696s;

    /* renamed from: t */
    public InterfaceC4617l0 f16697t;

    /* renamed from: w */
    public InterfaceC4638w f16700w;

    /* renamed from: x */
    public volatile InterfaceC4617l0 f16701x;

    /* renamed from: z */
    public C4448l0 f16703z;

    /* renamed from: u */
    public final Collection f16698u = new ArrayList();

    /* renamed from: v */
    public final AbstractC4590X f16699v = new a();

    /* renamed from: y */
    public volatile C4457q f16702y = C4457q.m18996a(EnumC4455p.IDLE);

    /* renamed from: i5.Z$a */
    public class a extends AbstractC4590X {
        public a() {
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: b */
        public void mo19698b() {
            C4593Z.this.f16682e.mo19748a(C4593Z.this);
        }

        @Override // p253i5.AbstractC4590X
        /* renamed from: c */
        public void mo19699c() {
            C4593Z.this.f16682e.mo19749b(C4593Z.this);
        }
    }

    /* renamed from: i5.Z$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4593Z.this.f16695r = null;
            C4593Z.this.f16688k.mo18924a(AbstractC4435f.a.INFO, "CONNECTING after backoff");
            C4593Z.this.m19737O(EnumC4455p.CONNECTING);
            C4593Z.this.m19743U();
        }
    }

    /* renamed from: i5.Z$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C4593Z.this.f16702y.m18998c() == EnumC4455p.IDLE) {
                C4593Z.this.f16688k.mo18924a(AbstractC4435f.a.INFO, "CONNECTING as requested");
                C4593Z.this.m19737O(EnumC4455p.CONNECTING);
                C4593Z.this.m19743U();
            }
        }
    }

    /* renamed from: i5.Z$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ List f16707a;

        /* renamed from: i5.Z$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC4617l0 interfaceC4617l0 = C4593Z.this.f16697t;
                C4593Z.this.f16696s = null;
                C4593Z.this.f16697t = null;
                interfaceC4617l0.mo19350f(C4448l0.f15810t.m18963q("InternalSubchannel closed transport due to address change"));
            }
        }

        public d(List list) {
            this.f16707a = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                i5.Z r0 = p253i5.C4593Z.this
                i5.Z$k r0 = p253i5.C4593Z.m19715K(r0)
                java.net.SocketAddress r0 = r0.m19752a()
                i5.Z r1 = p253i5.C4593Z.this
                i5.Z$k r1 = p253i5.C4593Z.m19715K(r1)
                java.util.List r2 = r7.f16707a
                r1.m19759h(r2)
                i5.Z r1 = p253i5.C4593Z.this
                java.util.List r2 = r7.f16707a
                p253i5.C4593Z.m19716L(r1, r2)
                i5.Z r1 = p253i5.C4593Z.this
                g5.q r1 = p253i5.C4593Z.m19719j(r1)
                g5.p r1 = r1.m18998c()
                g5.p r2 = p237g5.EnumC4455p.READY
                r3 = 0
                if (r1 == r2) goto L39
                i5.Z r1 = p253i5.C4593Z.this
                g5.q r1 = p253i5.C4593Z.m19719j(r1)
                g5.p r1 = r1.m18998c()
                g5.p r4 = p237g5.EnumC4455p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                i5.Z r1 = p253i5.C4593Z.this
                i5.Z$k r1 = p253i5.C4593Z.m19715K(r1)
                boolean r0 = r1.m19758g(r0)
                if (r0 != 0) goto L91
                i5.Z r0 = p253i5.C4593Z.this
                g5.q r0 = p253i5.C4593Z.m19719j(r0)
                g5.p r0 = r0.m18998c()
                if (r0 != r2) goto L6d
                i5.Z r0 = p253i5.C4593Z.this
                i5.l0 r0 = p253i5.C4593Z.m19720k(r0)
                i5.Z r1 = p253i5.C4593Z.this
                p253i5.C4593Z.m19721l(r1, r3)
                i5.Z r1 = p253i5.C4593Z.this
                i5.Z$k r1 = p253i5.C4593Z.m19715K(r1)
                r1.m19757f()
                i5.Z r1 = p253i5.C4593Z.this
                g5.p r2 = p237g5.EnumC4455p.IDLE
                p253i5.C4593Z.m19711G(r1, r2)
                goto L92
            L6d:
                i5.Z r0 = p253i5.C4593Z.this
                i5.w r0 = p253i5.C4593Z.m19722m(r0)
                g5.l0 r1 = p237g5.C4448l0.f15810t
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                g5.l0 r1 = r1.m18963q(r2)
                r0.mo19350f(r1)
                i5.Z r0 = p253i5.C4593Z.this
                p253i5.C4593Z.m19723n(r0, r3)
                i5.Z r0 = p253i5.C4593Z.this
                i5.Z$k r0 = p253i5.C4593Z.m19715K(r0)
                r0.m19757f()
                i5.Z r0 = p253i5.C4593Z.this
                p253i5.C4593Z.m19712H(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                i5.Z r1 = p253i5.C4593Z.this
                g5.p0$d r1 = p253i5.C4593Z.m19724o(r1)
                if (r1 == 0) goto Lc0
                i5.Z r1 = p253i5.C4593Z.this
                i5.l0 r1 = p253i5.C4593Z.m19726q(r1)
                g5.l0 r2 = p237g5.C4448l0.f15810t
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                g5.l0 r2 = r2.m18963q(r4)
                r1.mo19350f(r2)
                i5.Z r1 = p253i5.C4593Z.this
                g5.p0$d r1 = p253i5.C4593Z.m19724o(r1)
                r1.m18994a()
                i5.Z r1 = p253i5.C4593Z.this
                p253i5.C4593Z.m19725p(r1, r3)
                i5.Z r1 = p253i5.C4593Z.this
                p253i5.C4593Z.m19727r(r1, r3)
            Lc0:
                i5.Z r1 = p253i5.C4593Z.this
                p253i5.C4593Z.m19727r(r1, r0)
                i5.Z r0 = p253i5.C4593Z.this
                g5.p0 r1 = p253i5.C4593Z.m19729t(r0)
                i5.Z$d$a r2 = new i5.Z$d$a
                r2.<init>()
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                i5.Z r3 = p253i5.C4593Z.this
                java.util.concurrent.ScheduledExecutorService r6 = p253i5.C4593Z.m19728s(r3)
                r3 = 5
                g5.p0$d r1 = r1.m18991c(r2, r3, r5, r6)
                p253i5.C4593Z.m19725p(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p253i5.C4593Z.d.run():void");
        }
    }

    /* renamed from: i5.Z$e */
    public class e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16710a;

        public e(C4448l0 c4448l0) {
            this.f16710a = c4448l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            EnumC4455p m18998c = C4593Z.this.f16702y.m18998c();
            EnumC4455p enumC4455p = EnumC4455p.SHUTDOWN;
            if (m18998c == enumC4455p) {
                return;
            }
            C4593Z.this.f16703z = this.f16710a;
            InterfaceC4617l0 interfaceC4617l0 = C4593Z.this.f16701x;
            InterfaceC4638w interfaceC4638w = C4593Z.this.f16700w;
            C4593Z.this.f16701x = null;
            C4593Z.this.f16700w = null;
            C4593Z.this.m19737O(enumC4455p);
            C4593Z.this.f16691n.m19757f();
            if (C4593Z.this.f16698u.isEmpty()) {
                C4593Z.this.m19739Q();
            }
            C4593Z.this.m19736M();
            if (C4593Z.this.f16696s != null) {
                C4593Z.this.f16696s.m18994a();
                C4593Z.this.f16697t.mo19350f(this.f16710a);
                C4593Z.this.f16696s = null;
                C4593Z.this.f16697t = null;
            }
            if (interfaceC4617l0 != null) {
                interfaceC4617l0.mo19350f(this.f16710a);
            }
            if (interfaceC4638w != null) {
                interfaceC4638w.mo19350f(this.f16710a);
            }
        }
    }

    /* renamed from: i5.Z$f */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C4593Z.this.f16688k.mo18924a(AbstractC4435f.a.INFO, "Terminated");
            C4593Z.this.f16682e.mo19751d(C4593Z.this);
        }
    }

    /* renamed from: i5.Z$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4638w f16713a;

        /* renamed from: b */
        public final /* synthetic */ boolean f16714b;

        public g(InterfaceC4638w interfaceC4638w, boolean z6) {
            this.f16713a = interfaceC4638w;
            this.f16714b = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4593Z.this.f16699v.m19701e(this.f16713a, this.f16714b);
        }
    }

    /* renamed from: i5.Z$h */
    public class h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16716a;

        public h(C4448l0 c4448l0) {
            this.f16716a = c4448l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(C4593Z.this.f16698u).iterator();
            while (it.hasNext()) {
                ((InterfaceC4617l0) it.next()).mo19348b(this.f16716a);
            }
        }
    }

    /* renamed from: i5.Z$i */
    public static final class i extends AbstractC4565K {

        /* renamed from: a */
        public final InterfaceC4638w f16718a;

        /* renamed from: b */
        public final C4620n f16719b;

        /* renamed from: i5.Z$i$a */
        public class a extends AbstractC4561I {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4628r f16720a;

            /* renamed from: i5.Z$i$a$a, reason: collision with other inner class name */
            public class C7225a extends AbstractC4563J {

                /* renamed from: a */
                public final /* synthetic */ InterfaceC4630s f16722a;

                public C7225a(InterfaceC4630s interfaceC4630s) {
                    this.f16722a = interfaceC4630s;
                }

                @Override // p253i5.AbstractC4563J, p253i5.InterfaceC4630s
                /* renamed from: b */
                public void mo19387b(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
                    i.this.f16719b.m20033a(c4448l0.m18961o());
                    super.mo19387b(c4448l0, aVar, c4424z);
                }

                @Override // p253i5.AbstractC4563J
                /* renamed from: e */
                public InterfaceC4630s mo19517e() {
                    return this.f16722a;
                }
            }

            public a(InterfaceC4628r interfaceC4628r) {
                this.f16720a = interfaceC4628r;
            }

            @Override // p253i5.AbstractC4561I
            /* renamed from: f */
            public InterfaceC4628r mo19516f() {
                return this.f16720a;
            }

            @Override // p253i5.AbstractC4561I, p253i5.InterfaceC4628r
            /* renamed from: i */
            public void mo19372i(InterfaceC4630s interfaceC4630s) {
                i.this.f16719b.m20034b();
                super.mo19372i(new C7225a(interfaceC4630s));
            }
        }

        public /* synthetic */ i(InterfaceC4638w interfaceC4638w, C4620n c4620n, a aVar) {
            this(interfaceC4638w, c4620n);
        }

        @Override // p253i5.AbstractC4565K
        /* renamed from: a */
        public InterfaceC4638w mo19520a() {
            return this.f16718a;
        }

        @Override // p253i5.AbstractC4565K, p253i5.InterfaceC4632t
        /* renamed from: g */
        public InterfaceC4628r mo19351g(C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, AbstractC4445k[] abstractC4445kArr) {
            return new a(super.mo19351g(c4426a0, c4424z, c4429c, abstractC4445kArr));
        }

        public i(InterfaceC4638w interfaceC4638w, C4620n c4620n) {
            this.f16718a = interfaceC4638w;
            this.f16719b = c4620n;
        }
    }

    /* renamed from: i5.Z$j */
    public static abstract class j {
        /* renamed from: a */
        public abstract void mo19748a(C4593Z c4593z);

        /* renamed from: b */
        public abstract void mo19749b(C4593Z c4593z);

        /* renamed from: c */
        public abstract void mo19750c(C4593Z c4593z, C4457q c4457q);

        /* renamed from: d */
        public abstract void mo19751d(C4593Z c4593z);
    }

    /* renamed from: i5.Z$k */
    public static final class k {

        /* renamed from: a */
        public List f16724a;

        /* renamed from: b */
        public int f16725b;

        /* renamed from: c */
        public int f16726c;

        public k(List list) {
            this.f16724a = list;
        }

        /* renamed from: a */
        public SocketAddress m19752a() {
            return (SocketAddress) ((C4466x) this.f16724a.get(this.f16725b)).m19034a().get(this.f16726c);
        }

        /* renamed from: b */
        public C4425a m19753b() {
            return ((C4466x) this.f16724a.get(this.f16725b)).m19035b();
        }

        /* renamed from: c */
        public void m19754c() {
            C4466x c4466x = (C4466x) this.f16724a.get(this.f16725b);
            int i7 = this.f16726c + 1;
            this.f16726c = i7;
            if (i7 >= c4466x.m19034a().size()) {
                this.f16725b++;
                this.f16726c = 0;
            }
        }

        /* renamed from: d */
        public boolean m19755d() {
            return this.f16725b == 0 && this.f16726c == 0;
        }

        /* renamed from: e */
        public boolean m19756e() {
            return this.f16725b < this.f16724a.size();
        }

        /* renamed from: f */
        public void m19757f() {
            this.f16725b = 0;
            this.f16726c = 0;
        }

        /* renamed from: g */
        public boolean m19758g(SocketAddress socketAddress) {
            for (int i7 = 0; i7 < this.f16724a.size(); i7++) {
                int indexOf = ((C4466x) this.f16724a.get(i7)).m19034a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f16725b = i7;
                    this.f16726c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void m19759h(List list) {
            this.f16724a = list;
            m19757f();
        }
    }

    /* renamed from: i5.Z$l */
    public class l implements InterfaceC4617l0.a {

        /* renamed from: a */
        public final InterfaceC4638w f16727a;

        /* renamed from: b */
        public boolean f16728b = false;

        /* renamed from: i5.Z$l$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4593Z.this.f16693p = null;
                if (C4593Z.this.f16703z != null) {
                    AbstractC2932o.m10579v(C4593Z.this.f16701x == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f16727a.mo19350f(C4593Z.this.f16703z);
                    return;
                }
                InterfaceC4638w interfaceC4638w = C4593Z.this.f16700w;
                l lVar2 = l.this;
                InterfaceC4638w interfaceC4638w2 = lVar2.f16727a;
                if (interfaceC4638w == interfaceC4638w2) {
                    C4593Z.this.f16701x = interfaceC4638w2;
                    C4593Z.this.f16700w = null;
                    C4593Z.this.m19737O(EnumC4455p.READY);
                }
            }
        }

        /* renamed from: i5.Z$l$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4448l0 f16731a;

            public b(C4448l0 c4448l0) {
                this.f16731a = c4448l0;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (C4593Z.this.f16702y.m18998c() == EnumC4455p.SHUTDOWN) {
                    return;
                }
                InterfaceC4617l0 interfaceC4617l0 = C4593Z.this.f16701x;
                l lVar = l.this;
                if (interfaceC4617l0 == lVar.f16727a) {
                    C4593Z.this.f16701x = null;
                    C4593Z.this.f16691n.m19757f();
                    C4593Z.this.m19737O(EnumC4455p.IDLE);
                    return;
                }
                InterfaceC4638w interfaceC4638w = C4593Z.this.f16700w;
                l lVar2 = l.this;
                if (interfaceC4638w == lVar2.f16727a) {
                    AbstractC2932o.m10581x(C4593Z.this.f16702y.m18998c() == EnumC4455p.CONNECTING, "Expected state is CONNECTING, actual state is %s", C4593Z.this.f16702y.m18998c());
                    C4593Z.this.f16691n.m19754c();
                    if (C4593Z.this.f16691n.m19756e()) {
                        C4593Z.this.m19743U();
                        return;
                    }
                    C4593Z.this.f16700w = null;
                    C4593Z.this.f16691n.m19757f();
                    C4593Z.this.m19742T(this.f16731a);
                }
            }
        }

        /* renamed from: i5.Z$l$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C4593Z.this.f16698u.remove(l.this.f16727a);
                if (C4593Z.this.f16702y.m18998c() == EnumC4455p.SHUTDOWN && C4593Z.this.f16698u.isEmpty()) {
                    C4593Z.this.m19739Q();
                }
            }
        }

        public l(InterfaceC4638w interfaceC4638w) {
            this.f16727a = interfaceC4638w;
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: a */
        public C4425a mo19760a(C4425a c4425a) {
            Iterator it = C4593Z.this.f16689l.iterator();
            if (!it.hasNext()) {
                return c4425a;
            }
            AbstractC4094d.m17162a(it.next());
            throw null;
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: b */
        public void mo19761b() {
            C4593Z.this.f16688k.mo18924a(AbstractC4435f.a.INFO, "READY");
            C4593Z.this.f16690m.execute(new a());
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: c */
        public void mo19762c() {
            AbstractC2932o.m10579v(this.f16728b, "transportShutdown() must be called before transportTerminated().");
            C4593Z.this.f16688k.mo18925b(AbstractC4435f.a.INFO, "{0} Terminated", this.f16727a.mo18676i());
            C4593Z.this.f16685h.m18647i(this.f16727a);
            C4593Z.this.m19740R(this.f16727a, false);
            Iterator it = C4593Z.this.f16689l.iterator();
            if (!it.hasNext()) {
                C4593Z.this.f16690m.execute(new c());
            } else {
                AbstractC4094d.m17162a(it.next());
                this.f16727a.mo19521c();
                throw null;
            }
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: d */
        public void mo19763d(C4448l0 c4448l0) {
            C4593Z.this.f16688k.mo18925b(AbstractC4435f.a.INFO, "{0} SHUTDOWN with {1}", this.f16727a.mo18676i(), C4593Z.this.m19741S(c4448l0));
            this.f16728b = true;
            C4593Z.this.f16690m.execute(new b(c4448l0));
        }

        @Override // p253i5.InterfaceC4617l0.a
        /* renamed from: e */
        public void mo19764e(boolean z6) {
            C4593Z.this.m19740R(this.f16727a, z6);
        }
    }

    /* renamed from: i5.Z$m */
    public static final class m extends AbstractC4435f {

        /* renamed from: a */
        public C4410K f16734a;

        @Override // p237g5.AbstractC4435f
        /* renamed from: a */
        public void mo18924a(AbstractC4435f.a aVar, String str) {
            C4622o.m20051d(this.f16734a, aVar, str);
        }

        @Override // p237g5.AbstractC4435f
        /* renamed from: b */
        public void mo18925b(AbstractC4435f.a aVar, String str, Object... objArr) {
            C4622o.m20052e(this.f16734a, aVar, str, objArr);
        }
    }

    public C4593Z(List list, String str, String str2, InterfaceC4612j.a aVar, InterfaceC4634u interfaceC4634u, ScheduledExecutorService scheduledExecutorService, InterfaceC2939v interfaceC2939v, ExecutorC4456p0 executorC4456p0, j jVar, C4404E c4404e, C4620n c4620n, C4624p c4624p, C4410K c4410k, AbstractC4435f abstractC4435f, List list2) {
        AbstractC2932o.m10573p(list, "addressGroups");
        AbstractC2932o.m10562e(!list.isEmpty(), "addressGroups is empty");
        m19717N(list, "addressGroups contains null entry");
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        this.f16692o = unmodifiableList;
        this.f16691n = new k(unmodifiableList);
        this.f16679b = str;
        this.f16680c = str2;
        this.f16681d = aVar;
        this.f16683f = interfaceC4634u;
        this.f16684g = scheduledExecutorService;
        this.f16694q = (C2937t) interfaceC2939v.get();
        this.f16690m = executorC4456p0;
        this.f16682e = jVar;
        this.f16685h = c4404e;
        this.f16686i = c4620n;
        this.f16687j = (C4624p) AbstractC2932o.m10573p(c4624p, "channelTracer");
        this.f16678a = (C4410K) AbstractC2932o.m10573p(c4410k, "logId");
        this.f16688k = (AbstractC4435f) AbstractC2932o.m10573p(abstractC4435f, "channelLogger");
        this.f16689l = list2;
    }

    /* renamed from: N */
    public static void m19717N(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC2932o.m10573p(it.next(), str);
        }
    }

    /* renamed from: M */
    public final void m19736M() {
        this.f16690m.m18993e();
        ExecutorC4456p0.d dVar = this.f16695r;
        if (dVar != null) {
            dVar.m18994a();
            this.f16695r = null;
            this.f16693p = null;
        }
    }

    /* renamed from: O */
    public final void m19737O(EnumC4455p enumC4455p) {
        this.f16690m.m18993e();
        m19738P(C4457q.m18996a(enumC4455p));
    }

    /* renamed from: P */
    public final void m19738P(C4457q c4457q) {
        this.f16690m.m18993e();
        if (this.f16702y.m18998c() != c4457q.m18998c()) {
            AbstractC2932o.m10579v(this.f16702y.m18998c() != EnumC4455p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + c4457q);
            this.f16702y = c4457q;
            this.f16682e.mo19750c(this, c4457q);
        }
    }

    /* renamed from: Q */
    public final void m19739Q() {
        this.f16690m.execute(new f());
    }

    /* renamed from: R */
    public final void m19740R(InterfaceC4638w interfaceC4638w, boolean z6) {
        this.f16690m.execute(new g(interfaceC4638w, z6));
    }

    /* renamed from: S */
    public final String m19741S(C4448l0 c4448l0) {
        StringBuilder sb = new StringBuilder();
        sb.append(c4448l0.m18959m());
        if (c4448l0.m18960n() != null) {
            sb.append("(");
            sb.append(c4448l0.m18960n());
            sb.append(")");
        }
        if (c4448l0.m18958l() != null) {
            sb.append("[");
            sb.append(c4448l0.m18958l());
            sb.append("]");
        }
        return sb.toString();
    }

    /* renamed from: T */
    public final void m19742T(C4448l0 c4448l0) {
        this.f16690m.m18993e();
        m19738P(C4457q.m18997b(c4448l0));
        if (this.f16693p == null) {
            this.f16693p = this.f16681d.get();
        }
        long mo19508a = this.f16693p.mo19508a();
        C2937t c2937t = this.f16694q;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long m10603d = mo19508a - c2937t.m10603d(timeUnit);
        this.f16688k.mo18925b(AbstractC4435f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m19741S(c4448l0), Long.valueOf(m10603d));
        AbstractC2932o.m10579v(this.f16695r == null, "previous reconnectTask is not done");
        this.f16695r = this.f16690m.m18991c(new b(), m10603d, timeUnit, this.f16684g);
    }

    /* renamed from: U */
    public final void m19743U() {
        SocketAddress socketAddress;
        C4403D c4403d;
        this.f16690m.m18993e();
        AbstractC2932o.m10579v(this.f16695r == null, "Should have no reconnectTask scheduled");
        if (this.f16691n.m19755d()) {
            this.f16694q.m10605f().m10606g();
        }
        SocketAddress m19752a = this.f16691n.m19752a();
        a aVar = null;
        if (m19752a instanceof C4403D) {
            c4403d = (C4403D) m19752a;
            socketAddress = c4403d.m18632c();
        } else {
            socketAddress = m19752a;
            c4403d = null;
        }
        C4425a m19753b = this.f16691n.m19753b();
        String str = (String) m19753b.m18819b(C4466x.f15902d);
        InterfaceC4634u.a aVar2 = new InterfaceC4634u.a();
        if (str == null) {
            str = this.f16679b;
        }
        InterfaceC4634u.a m20147g = aVar2.m20145e(str).m20146f(m19753b).m20148h(this.f16680c).m20147g(c4403d);
        m mVar = new m();
        mVar.f16734a = mo18676i();
        i iVar = new i(this.f16683f.mo20013n0(socketAddress, m20147g, mVar), this.f16686i, aVar);
        mVar.f16734a = iVar.mo18676i();
        this.f16685h.m18644c(iVar);
        this.f16700w = iVar;
        this.f16698u.add(iVar);
        Runnable mo19349d = iVar.mo19349d(new l(iVar));
        if (mo19349d != null) {
            this.f16690m.m18990b(mo19349d);
        }
        this.f16688k.mo18925b(AbstractC4435f.a.INFO, "Started transport {0}", mVar.f16734a);
    }

    /* renamed from: V */
    public void m19744V(List list) {
        AbstractC2932o.m10573p(list, "newAddressGroups");
        m19717N(list, "newAddressGroups contains null entry");
        AbstractC2932o.m10562e(!list.isEmpty(), "newAddressGroups is empty");
        this.f16690m.execute(new d(DesugarCollections.unmodifiableList(new ArrayList(list))));
    }

    @Override // p253i5.InterfaceC4585U0
    /* renamed from: a */
    public InterfaceC4632t mo19666a() {
        InterfaceC4617l0 interfaceC4617l0 = this.f16701x;
        if (interfaceC4617l0 != null) {
            return interfaceC4617l0;
        }
        this.f16690m.execute(new c());
        return null;
    }

    /* renamed from: b */
    public void m19745b(C4448l0 c4448l0) {
        m19746f(c4448l0);
        this.f16690m.execute(new h(c4448l0));
    }

    /* renamed from: f */
    public void m19746f(C4448l0 c4448l0) {
        this.f16690m.execute(new e(c4448l0));
    }

    @Override // p237g5.InterfaceC4415P
    /* renamed from: i */
    public C4410K mo18676i() {
        return this.f16678a;
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10539c("logId", this.f16678a.m18668d()).m10540d("addressGroups", this.f16692o).toString();
    }
}
