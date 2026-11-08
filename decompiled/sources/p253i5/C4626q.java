package p253i5;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p211d3.AbstractC4116f;
import p237g5.AbstractC4406G;
import p237g5.AbstractC4407H;
import p237g5.AbstractC4437g;
import p237g5.AbstractC4445k;
import p237g5.AbstractC4461s;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4453o;
import p237g5.C4459r;
import p237g5.C4462t;
import p237g5.C4464v;
import p237g5.InterfaceC4447l;
import p237g5.InterfaceC4451n;
import p253i5.C4615k0;
import p253i5.InterfaceC4579R0;
import p253i5.InterfaceC4630s;
import p324q5.AbstractC6227c;
import p324q5.C6226b;
import p324q5.C6228d;
import p324q5.C6229e;

/* renamed from: i5.q */
/* loaded from: classes2.dex */
public final class C4626q extends AbstractC4437g {

    /* renamed from: t */
    public static final Logger f17169t = Logger.getLogger(C4626q.class.getName());

    /* renamed from: u */
    public static final byte[] f17170u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v */
    public static final double f17171v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a */
    public final C4426a0 f17172a;

    /* renamed from: b */
    public final C6228d f17173b;

    /* renamed from: c */
    public final Executor f17174c;

    /* renamed from: d */
    public final boolean f17175d;

    /* renamed from: e */
    public final C4620n f17176e;

    /* renamed from: f */
    public final C4459r f17177f;

    /* renamed from: g */
    public volatile ScheduledFuture f17178g;

    /* renamed from: h */
    public final boolean f17179h;

    /* renamed from: i */
    public C4429c f17180i;

    /* renamed from: j */
    public InterfaceC4628r f17181j;

    /* renamed from: k */
    public volatile boolean f17182k;

    /* renamed from: l */
    public boolean f17183l;

    /* renamed from: m */
    public boolean f17184m;

    /* renamed from: n */
    public final e f17185n;

    /* renamed from: p */
    public final ScheduledExecutorService f17187p;

    /* renamed from: q */
    public boolean f17188q;

    /* renamed from: o */
    public final f f17186o = new f();

    /* renamed from: r */
    public C4464v f17189r = C4464v.m19028c();

    /* renamed from: s */
    public C4453o f17190s = C4453o.m18978a();

    /* renamed from: i5.q$b */
    public class b extends AbstractRunnableC4642y {

        /* renamed from: b */
        public final /* synthetic */ AbstractC4437g.a f17191b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC4437g.a aVar) {
            super(C4626q.this.f17177f);
            this.f17191b = aVar;
        }

        @Override // p253i5.AbstractRunnableC4642y
        /* renamed from: a */
        public void mo19323a() {
            C4626q c4626q = C4626q.this;
            c4626q.m20091t(this.f17191b, AbstractC4461s.m19015a(c4626q.f17177f), new C4424Z());
        }
    }

    /* renamed from: i5.q$c */
    public class c extends AbstractRunnableC4642y {

        /* renamed from: b */
        public final /* synthetic */ AbstractC4437g.a f17193b;

        /* renamed from: c */
        public final /* synthetic */ String f17194c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC4437g.a aVar, String str) {
            super(C4626q.this.f17177f);
            this.f17193b = aVar;
            this.f17194c = str;
        }

        @Override // p253i5.AbstractRunnableC4642y
        /* renamed from: a */
        public void mo19323a() {
            C4626q.this.m20091t(this.f17193b, C4448l0.f15809s.m18963q(String.format("Unable to find compressor by name %s", this.f17194c)), new C4424Z());
        }
    }

    /* renamed from: i5.q$d */
    public class d implements InterfaceC4630s {

        /* renamed from: a */
        public final AbstractC4437g.a f17196a;

        /* renamed from: b */
        public C4448l0 f17197b;

        /* renamed from: i5.q$d$a */
        public final class a extends AbstractRunnableC4642y {

            /* renamed from: b */
            public final /* synthetic */ C6226b f17199b;

            /* renamed from: c */
            public final /* synthetic */ C4424Z f17200c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6226b c6226b, C4424Z c4424z) {
                super(C4626q.this.f17177f);
                this.f17199b = c6226b;
                this.f17200c = c4424z;
            }

            @Override // p253i5.AbstractRunnableC4642y
            /* renamed from: a */
            public void mo19323a() {
                C6229e m25990h = AbstractC6227c.m25990h("ClientCall$Listener.headersRead");
                try {
                    AbstractC6227c.m25983a(C4626q.this.f17173b);
                    AbstractC6227c.m25987e(this.f17199b);
                    m20099b();
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

            /* renamed from: b */
            public final void m20099b() {
                if (d.this.f17197b != null) {
                    return;
                }
                try {
                    d.this.f17196a.mo6929b(this.f17200c);
                } catch (Throwable th) {
                    d.this.m20098i(C4448l0.f15796f.m18962p(th).m18963q("Failed to read headers"));
                }
            }
        }

        /* renamed from: i5.q$d$b */
        public final class b extends AbstractRunnableC4642y {

            /* renamed from: b */
            public final /* synthetic */ C6226b f17202b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC4579R0.a f17203c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C6226b c6226b, InterfaceC4579R0.a aVar) {
                super(C4626q.this.f17177f);
                this.f17202b = c6226b;
                this.f17203c = aVar;
            }

            /* renamed from: b */
            private void m20100b() {
                if (d.this.f17197b != null) {
                    AbstractC4580S.m19598d(this.f17203c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f17203c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f17196a.mo6930c(C4626q.this.f17172a.m18834i(next));
                            next.close();
                        } catch (Throwable th) {
                            AbstractC4580S.m19599e(next);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        AbstractC4580S.m19598d(this.f17203c);
                        d.this.m20098i(C4448l0.f15796f.m18962p(th2).m18963q("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // p253i5.AbstractRunnableC4642y
            /* renamed from: a */
            public void mo19323a() {
                C6229e m25990h = AbstractC6227c.m25990h("ClientCall$Listener.messagesAvailable");
                try {
                    AbstractC6227c.m25983a(C4626q.this.f17173b);
                    AbstractC6227c.m25987e(this.f17202b);
                    m20100b();
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

        /* renamed from: i5.q$d$c */
        public final class c extends AbstractRunnableC4642y {

            /* renamed from: b */
            public final /* synthetic */ C6226b f17205b;

            /* renamed from: c */
            public final /* synthetic */ C4448l0 f17206c;

            /* renamed from: d */
            public final /* synthetic */ C4424Z f17207d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C6226b c6226b, C4448l0 c4448l0, C4424Z c4424z) {
                super(C4626q.this.f17177f);
                this.f17205b = c6226b;
                this.f17206c = c4448l0;
                this.f17207d = c4424z;
            }

            /* renamed from: b */
            private void m20101b() {
                C4448l0 c4448l0 = this.f17206c;
                C4424Z c4424z = this.f17207d;
                if (d.this.f17197b != null) {
                    c4448l0 = d.this.f17197b;
                    c4424z = new C4424Z();
                }
                C4626q.this.f17182k = true;
                try {
                    d dVar = d.this;
                    C4626q.this.m20091t(dVar.f17196a, c4448l0, c4424z);
                } finally {
                    C4626q.this.m20082A();
                    C4626q.this.f17176e.m20033a(c4448l0.m18961o());
                }
            }

            @Override // p253i5.AbstractRunnableC4642y
            /* renamed from: a */
            public void mo19323a() {
                C6229e m25990h = AbstractC6227c.m25990h("ClientCall$Listener.onClose");
                try {
                    AbstractC6227c.m25983a(C4626q.this.f17173b);
                    AbstractC6227c.m25987e(this.f17205b);
                    m20101b();
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

        /* renamed from: i5.q$d$d, reason: collision with other inner class name */
        public final class C7228d extends AbstractRunnableC4642y {

            /* renamed from: b */
            public final /* synthetic */ C6226b f17209b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7228d(C6226b c6226b) {
                super(C4626q.this.f17177f);
                this.f17209b = c6226b;
            }

            /* renamed from: b */
            private void m20102b() {
                if (d.this.f17197b != null) {
                    return;
                }
                try {
                    d.this.f17196a.mo6931d();
                } catch (Throwable th) {
                    d.this.m20098i(C4448l0.f15796f.m18962p(th).m18963q("Failed to call onReady."));
                }
            }

            @Override // p253i5.AbstractRunnableC4642y
            /* renamed from: a */
            public void mo19323a() {
                C6229e m25990h = AbstractC6227c.m25990h("ClientCall$Listener.onReady");
                try {
                    AbstractC6227c.m25983a(C4626q.this.f17173b);
                    AbstractC6227c.m25987e(this.f17209b);
                    m20102b();
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

        public d(AbstractC4437g.a aVar) {
            this.f17196a = (AbstractC4437g.a) AbstractC2932o.m10573p(aVar, "observer");
        }

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: a */
        public void mo19386a(InterfaceC4579R0.a aVar) {
            C6229e m25990h = AbstractC6227c.m25990h("ClientStreamListener.messagesAvailable");
            try {
                AbstractC6227c.m25983a(C4626q.this.f17173b);
                C4626q.this.f17174c.execute(new b(AbstractC6227c.m25988f(), aVar));
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

        @Override // p253i5.InterfaceC4630s
        /* renamed from: b */
        public void mo19387b(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            C6229e m25990h = AbstractC6227c.m25990h("ClientStreamListener.closed");
            try {
                AbstractC6227c.m25983a(C4626q.this.f17173b);
                m20097h(c4448l0, aVar, c4424z);
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

        @Override // p253i5.InterfaceC4630s
        /* renamed from: c */
        public void mo19388c(C4424Z c4424z) {
            C6229e m25990h = AbstractC6227c.m25990h("ClientStreamListener.headersRead");
            try {
                AbstractC6227c.m25983a(C4626q.this.f17173b);
                C4626q.this.f17174c.execute(new a(AbstractC6227c.m25988f(), c4424z));
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

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: d */
        public void mo19389d() {
            if (C4626q.this.f17172a.m18832e().m18844b()) {
                return;
            }
            C6229e m25990h = AbstractC6227c.m25990h("ClientStreamListener.onReady");
            try {
                AbstractC6227c.m25983a(C4626q.this.f17173b);
                C4626q.this.f17174c.execute(new C7228d(AbstractC6227c.m25988f()));
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

        /* renamed from: h */
        public final void m20097h(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            C4462t m20092u = C4626q.this.m20092u();
            if (c4448l0.m18959m() == C4448l0.b.CANCELLED && m20092u != null && m20092u.m19023l()) {
                C4592Y c4592y = new C4592Y();
                C4626q.this.f17181j.mo19361j(c4592y);
                c4448l0 = C4448l0.f15799i.m18957e("ClientCall was cancelled at or after deadline. " + c4592y);
                c4424z = new C4424Z();
            }
            C4626q.this.f17174c.execute(new c(AbstractC6227c.m25988f(), c4448l0, c4424z));
        }

        /* renamed from: i */
        public final void m20098i(C4448l0 c4448l0) {
            this.f17197b = c4448l0;
            C4626q.this.f17181j.mo19360a(c4448l0);
        }
    }

    /* renamed from: i5.q$e */
    public interface e {
        /* renamed from: a */
        InterfaceC4628r mo19955a(C4426a0 c4426a0, C4429c c4429c, C4424Z c4424z, C4459r c4459r);
    }

    /* renamed from: i5.q$f */
    public final class f implements C4459r.a {
        public f() {
        }
    }

    /* renamed from: i5.q$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final long f17212a;

        public g(long j7) {
            this.f17212a = j7;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4592Y c4592y = new C4592Y();
            C4626q.this.f17181j.mo19361j(c4592y);
            long abs = Math.abs(this.f17212a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f17212a) % timeUnit.toNanos(1L);
            StringBuilder sb = new StringBuilder();
            sb.append("deadline exceeded after ");
            if (this.f17212a < 0) {
                sb.append('-');
            }
            sb.append(nanos);
            Locale locale = Locale.US;
            sb.append(String.format(locale, ".%09d", Long.valueOf(abs2)));
            sb.append("s. ");
            sb.append(String.format(locale, "Name resolution delay %.9f seconds. ", Double.valueOf(((Long) C4626q.this.f17180i.m18855h(AbstractC4445k.f15785a)) == null ? 0.0d : r4.longValue() / C4626q.f17171v)));
            sb.append(c4592y);
            C4626q.this.f17181j.mo19360a(C4448l0.f15799i.m18957e(sb.toString()));
        }
    }

    public C4626q(C4426a0 c4426a0, Executor executor, C4429c c4429c, e eVar, ScheduledExecutorService scheduledExecutorService, C4620n c4620n, AbstractC4406G abstractC4406G) {
        this.f17172a = c4426a0;
        C6228d m25985c = AbstractC6227c.m25985c(c4426a0.m18830c(), System.identityHashCode(this));
        this.f17173b = m25985c;
        if (executor == AbstractC4116f.m17293a()) {
            this.f17174c = new ExecutorC4564J0();
            this.f17175d = true;
        } else {
            this.f17174c = new ExecutorC4566K0(executor);
            this.f17175d = false;
        }
        this.f17176e = c4620n;
        this.f17177f = C4459r.m19004e();
        this.f17179h = c4426a0.m18832e() == C4426a0.d.UNARY || c4426a0.m18832e() == C4426a0.d.SERVER_STREAMING;
        this.f17180i = c4429c;
        this.f17185n = eVar;
        this.f17187p = scheduledExecutorService;
        AbstractC6227c.m25986d("ClientCall.<init>", m25985c);
    }

    /* renamed from: w */
    public static boolean m20078w(C4462t c4462t, C4462t c4462t2) {
        if (c4462t == null) {
            return false;
        }
        if (c4462t2 == null) {
            return true;
        }
        return c4462t.m19022k(c4462t2);
    }

    /* renamed from: x */
    public static void m20079x(C4462t c4462t, C4462t c4462t2, C4462t c4462t3) {
        Logger logger = f17169t;
        if (logger.isLoggable(Level.FINE) && c4462t != null && c4462t.equals(c4462t2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0L, c4462t.m19025n(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
            if (c4462t3 == null) {
                sb.append(" Explicit call timeout was not set.");
            } else {
                sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c4462t3.m19025n(timeUnit))));
            }
            logger.fine(sb.toString());
        }
    }

    /* renamed from: y */
    public static C4462t m20080y(C4462t c4462t, C4462t c4462t2) {
        return c4462t == null ? c4462t2 : c4462t2 == null ? c4462t : c4462t.m19024m(c4462t2);
    }

    /* renamed from: z */
    public static void m20081z(C4424Z c4424z, C4464v c4464v, InterfaceC4451n interfaceC4451n, boolean z6) {
        c4424z.m18777e(AbstractC4580S.f16577i);
        C4424Z.g gVar = AbstractC4580S.f16573e;
        c4424z.m18777e(gVar);
        if (interfaceC4451n != InterfaceC4447l.b.f15793a) {
            c4424z.m18788p(gVar, interfaceC4451n.mo18944a());
        }
        C4424Z.g gVar2 = AbstractC4580S.f16574f;
        c4424z.m18777e(gVar2);
        byte[] m18662a = AbstractC4407H.m18662a(c4464v);
        if (m18662a.length != 0) {
            c4424z.m18788p(gVar2, m18662a);
        }
        c4424z.m18777e(AbstractC4580S.f16575g);
        C4424Z.g gVar3 = AbstractC4580S.f16576h;
        c4424z.m18777e(gVar3);
        if (z6) {
            c4424z.m18788p(gVar3, f17170u);
        }
    }

    /* renamed from: A */
    public final void m20082A() {
        this.f17177f.m19013i(this.f17186o);
        ScheduledFuture scheduledFuture = this.f17178g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: B */
    public final void m20083B(Object obj) {
        AbstractC2932o.m10579v(this.f17181j != null, "Not started");
        AbstractC2932o.m10579v(!this.f17183l, "call was cancelled");
        AbstractC2932o.m10579v(!this.f17184m, "call was half-closed");
        try {
            InterfaceC4628r interfaceC4628r = this.f17181j;
            if (interfaceC4628r instanceof AbstractC4552D0) {
                ((AbstractC4552D0) interfaceC4628r).m19484o0(obj);
            } else {
                interfaceC4628r.mo19377o(this.f17172a.m18835j(obj));
            }
            if (this.f17179h) {
                return;
            }
            this.f17181j.flush();
        } catch (Error e7) {
            this.f17181j.mo19360a(C4448l0.f15796f.m18963q("Client sendMessage() failed with Error"));
            throw e7;
        } catch (RuntimeException e8) {
            this.f17181j.mo19360a(C4448l0.f15796f.m18962p(e8).m18963q("Failed to stream message"));
        }
    }

    /* renamed from: C */
    public C4626q m20084C(C4453o c4453o) {
        this.f17190s = c4453o;
        return this;
    }

    /* renamed from: D */
    public C4626q m20085D(C4464v c4464v) {
        this.f17189r = c4464v;
        return this;
    }

    /* renamed from: E */
    public C4626q m20086E(boolean z6) {
        this.f17188q = z6;
        return this;
    }

    /* renamed from: F */
    public final ScheduledFuture m20087F(C4462t c4462t) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long m19025n = c4462t.m19025n(timeUnit);
        return this.f17187p.schedule(new RunnableC4603e0(new g(m19025n)), m19025n, timeUnit);
    }

    /* renamed from: G */
    public final void m20088G(AbstractC4437g.a aVar, C4424Z c4424z) {
        InterfaceC4451n interfaceC4451n;
        AbstractC2932o.m10579v(this.f17181j == null, "Already started");
        AbstractC2932o.m10579v(!this.f17183l, "call was cancelled");
        AbstractC2932o.m10573p(aVar, "observer");
        AbstractC2932o.m10573p(c4424z, "headers");
        if (this.f17177f.m19012h()) {
            this.f17181j = C4625p0.f17168a;
            this.f17174c.execute(new b(aVar));
            return;
        }
        m20089r();
        String m18849b = this.f17180i.m18849b();
        if (m18849b != null) {
            interfaceC4451n = this.f17190s.m18979b(m18849b);
            if (interfaceC4451n == null) {
                this.f17181j = C4625p0.f17168a;
                this.f17174c.execute(new c(aVar, m18849b));
                return;
            }
        } else {
            interfaceC4451n = InterfaceC4447l.b.f15793a;
        }
        m20081z(c4424z, this.f17189r, interfaceC4451n, this.f17188q);
        C4462t m20092u = m20092u();
        if (m20092u == null || !m20092u.m19023l()) {
            m20079x(m20092u, this.f17177f.m19011g(), this.f17180i.m18851d());
            this.f17181j = this.f17185n.mo19955a(this.f17172a, this.f17180i, c4424z, this.f17177f);
        } else {
            AbstractC4445k[] m19600f = AbstractC4580S.m19600f(this.f17180i, c4424z, 0, false);
            String str = m20078w(this.f17180i.m18851d(), this.f17177f.m19011g()) ? "CallOptions" : "Context";
            Long l7 = (Long) this.f17180i.m18855h(AbstractC4445k.f15785a);
            double m19025n = m20092u.m19025n(TimeUnit.NANOSECONDS);
            double d7 = f17171v;
            this.f17181j = new C4557G(C4448l0.f15799i.m18963q(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(m19025n / d7), Double.valueOf(l7 == null ? 0.0d : l7.longValue() / d7))), m19600f);
        }
        if (this.f17175d) {
            this.f17181j.mo19378p();
        }
        if (this.f17180i.m18848a() != null) {
            this.f17181j.mo19373k(this.f17180i.m18848a());
        }
        if (this.f17180i.m18853f() != null) {
            this.f17181j.mo19370g(this.f17180i.m18853f().intValue());
        }
        if (this.f17180i.m18854g() != null) {
            this.f17181j.mo19371h(this.f17180i.m18854g().intValue());
        }
        if (m20092u != null) {
            this.f17181j.mo19375m(m20092u);
        }
        this.f17181j.mo19369e(interfaceC4451n);
        boolean z6 = this.f17188q;
        if (z6) {
            this.f17181j.mo19379q(z6);
        }
        this.f17181j.mo19376n(this.f17189r);
        this.f17176e.m20034b();
        this.f17181j.mo19372i(new d(aVar));
        this.f17177f.m19007a(this.f17186o, AbstractC4116f.m17293a());
        if (m20092u != null && !m20092u.equals(this.f17177f.m19011g()) && this.f17187p != null) {
            this.f17178g = m20087F(m20092u);
        }
        if (this.f17182k) {
            m20082A();
        }
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: a */
    public void mo18624a(String str, Throwable th) {
        C6229e m25990h = AbstractC6227c.m25990h("ClientCall.cancel");
        try {
            AbstractC6227c.m25983a(this.f17173b);
            m20090s(str, th);
            if (m25990h != null) {
                m25990h.close();
            }
        } catch (Throwable th2) {
            if (m25990h != null) {
                try {
                    m25990h.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: b */
    public void mo6932b() {
        C6229e m25990h = AbstractC6227c.m25990h("ClientCall.halfClose");
        try {
            AbstractC6227c.m25983a(this.f17173b);
            m20093v();
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

    @Override // p237g5.AbstractC4437g
    /* renamed from: c */
    public void mo18625c(int i7) {
        C6229e m25990h = AbstractC6227c.m25990h("ClientCall.request");
        try {
            AbstractC6227c.m25983a(this.f17173b);
            AbstractC2932o.m10579v(this.f17181j != null, "Not started");
            AbstractC2932o.m10562e(i7 >= 0, "Number requested must be non-negative");
            this.f17181j.mo19368d(i7);
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

    @Override // p237g5.AbstractC4437g
    /* renamed from: d */
    public void mo18626d(Object obj) {
        C6229e m25990h = AbstractC6227c.m25990h("ClientCall.sendMessage");
        try {
            AbstractC6227c.m25983a(this.f17173b);
            m20083B(obj);
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

    @Override // p237g5.AbstractC4437g
    /* renamed from: e */
    public void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
        C6229e m25990h = AbstractC6227c.m25990h("ClientCall.start");
        try {
            AbstractC6227c.m25983a(this.f17173b);
            m20088G(aVar, c4424z);
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

    /* renamed from: r */
    public final void m20089r() {
        C4615k0.b bVar = (C4615k0.b) this.f17180i.m18855h(C4615k0.b.f17064g);
        if (bVar == null) {
            return;
        }
        Long l7 = bVar.f17065a;
        if (l7 != null) {
            C4462t m19016b = C4462t.m19016b(l7.longValue(), TimeUnit.NANOSECONDS);
            C4462t m18851d = this.f17180i.m18851d();
            if (m18851d == null || m19016b.compareTo(m18851d) < 0) {
                this.f17180i = this.f17180i.m18859m(m19016b);
            }
        }
        Boolean bool = bVar.f17066b;
        if (bool != null) {
            this.f17180i = bool.booleanValue() ? this.f17180i.m18865s() : this.f17180i.m18866t();
        }
        if (bVar.f17067c != null) {
            Integer m18853f = this.f17180i.m18853f();
            if (m18853f != null) {
                this.f17180i = this.f17180i.m18861o(Math.min(m18853f.intValue(), bVar.f17067c.intValue()));
            } else {
                this.f17180i = this.f17180i.m18861o(bVar.f17067c.intValue());
            }
        }
        if (bVar.f17068d != null) {
            Integer m18854g = this.f17180i.m18854g();
            if (m18854g != null) {
                this.f17180i = this.f17180i.m18862p(Math.min(m18854g.intValue(), bVar.f17068d.intValue()));
            } else {
                this.f17180i = this.f17180i.m18862p(bVar.f17068d.intValue());
            }
        }
    }

    /* renamed from: s */
    public final void m20090s(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            f17169t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.f17183l) {
            return;
        }
        this.f17183l = true;
        try {
            if (this.f17181j != null) {
                C4448l0 c4448l0 = C4448l0.f15796f;
                C4448l0 m18963q = str != null ? c4448l0.m18963q(str) : c4448l0.m18963q("Call cancelled without message");
                if (th != null) {
                    m18963q = m18963q.m18962p(th);
                }
                this.f17181j.mo19360a(m18963q);
            }
            m20082A();
        } catch (Throwable th2) {
            m20082A();
            throw th2;
        }
    }

    /* renamed from: t */
    public final void m20091t(AbstractC4437g.a aVar, C4448l0 c4448l0, C4424Z c4424z) {
        aVar.mo6928a(c4448l0, c4424z);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("method", this.f17172a).toString();
    }

    /* renamed from: u */
    public final C4462t m20092u() {
        return m20080y(this.f17180i.m18851d(), this.f17177f.m19011g());
    }

    /* renamed from: v */
    public final void m20093v() {
        AbstractC2932o.m10579v(this.f17181j != null, "Not started");
        AbstractC2932o.m10579v(!this.f17183l, "call was cancelled");
        AbstractC2932o.m10579v(!this.f17184m, "call already half-closed");
        this.f17184m = true;
        this.f17181j.mo19374l();
    }
}
