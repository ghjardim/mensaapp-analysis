package p253i5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4437g;
import p237g5.C4424Z;
import p237g5.C4448l0;
import p237g5.C4459r;
import p237g5.C4462t;

/* renamed from: i5.A */
/* loaded from: classes2.dex */
public abstract class AbstractC4545A extends AbstractC4437g {

    /* renamed from: j */
    public static final Logger f16222j = Logger.getLogger(AbstractC4545A.class.getName());

    /* renamed from: k */
    public static final AbstractC4437g f16223k = new i();

    /* renamed from: a */
    public final ScheduledFuture f16224a;

    /* renamed from: b */
    public final Executor f16225b;

    /* renamed from: c */
    public final C4459r f16226c;

    /* renamed from: d */
    public volatile boolean f16227d;

    /* renamed from: e */
    public AbstractC4437g.a f16228e;

    /* renamed from: f */
    public AbstractC4437g f16229f;

    /* renamed from: g */
    public C4448l0 f16230g;

    /* renamed from: h */
    public List f16231h = new ArrayList();

    /* renamed from: i */
    public k f16232i;

    /* renamed from: i5.A$a */
    public class a extends AbstractRunnableC4642y {
        public a(C4459r c4459r) {
            super(c4459r);
        }

        @Override // p253i5.AbstractRunnableC4642y
        /* renamed from: a */
        public void mo19323a() {
            AbstractC4545A.this.m19318m();
        }
    }

    /* renamed from: i5.A$b */
    public class b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ StringBuilder f16234a;

        public b(StringBuilder sb) {
            this.f16234a = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.m19316k(C4448l0.f15799i.m18963q(this.f16234a.toString()), true);
        }
    }

    /* renamed from: i5.A$c */
    public class c extends AbstractRunnableC4642y {

        /* renamed from: b */
        public final /* synthetic */ k f16236b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(k kVar) {
            super(AbstractC4545A.this.f16226c);
            this.f16236b = kVar;
        }

        @Override // p253i5.AbstractRunnableC4642y
        /* renamed from: a */
        public void mo19323a() {
            this.f16236b.m19326g();
        }
    }

    /* renamed from: i5.A$d */
    public class d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4437g.a f16238a;

        /* renamed from: b */
        public final /* synthetic */ C4424Z f16239b;

        public d(AbstractC4437g.a aVar, C4424Z c4424z) {
            this.f16238a = aVar;
            this.f16239b = c4424z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.f16229f.mo18627e(this.f16238a, this.f16239b);
        }
    }

    /* renamed from: i5.A$e */
    public class e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16241a;

        public e(C4448l0 c4448l0) {
            this.f16241a = c4448l0;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.f16229f.mo18624a(this.f16241a.m18960n(), this.f16241a.m18958l());
        }
    }

    /* renamed from: i5.A$f */
    public class f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Object f16243a;

        public f(Object obj) {
            this.f16243a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.f16229f.mo18626d(this.f16243a);
        }
    }

    /* renamed from: i5.A$g */
    public class g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ int f16245a;

        public g(int i7) {
            this.f16245a = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.f16229f.mo18625c(this.f16245a);
        }
    }

    /* renamed from: i5.A$h */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4545A.this.f16229f.mo6932b();
        }
    }

    /* renamed from: i5.A$j */
    public final class j extends AbstractRunnableC4642y {

        /* renamed from: b */
        public final AbstractC4437g.a f16248b;

        /* renamed from: c */
        public final C4448l0 f16249c;

        public j(AbstractC4437g.a aVar, C4448l0 c4448l0) {
            super(AbstractC4545A.this.f16226c);
            this.f16248b = aVar;
            this.f16249c = c4448l0;
        }

        @Override // p253i5.AbstractRunnableC4642y
        /* renamed from: a */
        public void mo19323a() {
            this.f16248b.mo6928a(this.f16249c, new C4424Z());
        }
    }

    /* renamed from: i5.A$k */
    public static final class k extends AbstractC4437g.a {

        /* renamed from: a */
        public final AbstractC4437g.a f16251a;

        /* renamed from: b */
        public volatile boolean f16252b;

        /* renamed from: c */
        public List f16253c = new ArrayList();

        /* renamed from: i5.A$k$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4424Z f16254a;

            public a(C4424Z c4424z) {
                this.f16254a = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16251a.mo6929b(this.f16254a);
            }
        }

        /* renamed from: i5.A$k$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Object f16256a;

            public b(Object obj) {
                this.f16256a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16251a.mo6930c(this.f16256a);
            }
        }

        /* renamed from: i5.A$k$c */
        public class c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4448l0 f16258a;

            /* renamed from: b */
            public final /* synthetic */ C4424Z f16259b;

            public c(C4448l0 c4448l0, C4424Z c4424z) {
                this.f16258a = c4448l0;
                this.f16259b = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16251a.mo6928a(this.f16258a, this.f16259b);
            }
        }

        /* renamed from: i5.A$k$d */
        public class d implements Runnable {
            public d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f16251a.mo6931d();
            }
        }

        public k(AbstractC4437g.a aVar) {
            this.f16251a = aVar;
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: a */
        public void mo6928a(C4448l0 c4448l0, C4424Z c4424z) {
            m19325f(new c(c4448l0, c4424z));
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: b */
        public void mo6929b(C4424Z c4424z) {
            if (this.f16252b) {
                this.f16251a.mo6929b(c4424z);
            } else {
                m19325f(new a(c4424z));
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: c */
        public void mo6930c(Object obj) {
            if (this.f16252b) {
                this.f16251a.mo6930c(obj);
            } else {
                m19325f(new b(obj));
            }
        }

        @Override // p237g5.AbstractC4437g.a
        /* renamed from: d */
        public void mo6931d() {
            if (this.f16252b) {
                this.f16251a.mo6931d();
            } else {
                m19325f(new d());
            }
        }

        /* renamed from: f */
        public final void m19325f(Runnable runnable) {
            synchronized (this) {
                try {
                    if (this.f16252b) {
                        runnable.run();
                    } else {
                        this.f16253c.add(runnable);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* renamed from: g */
        public void m19326g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    try {
                        if (this.f16253c.isEmpty()) {
                            this.f16253c = null;
                            this.f16252b = true;
                            return;
                        } else {
                            list = this.f16253c;
                            this.f16253c = arrayList;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    public AbstractC4545A(Executor executor, ScheduledExecutorService scheduledExecutorService, C4462t c4462t) {
        this.f16225b = (Executor) AbstractC2932o.m10573p(executor, "callExecutor");
        AbstractC2932o.m10573p(scheduledExecutorService, "scheduler");
        this.f16226c = C4459r.m19004e();
        this.f16224a = m19320o(scheduledExecutorService, c4462t);
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: a */
    public final void mo18624a(String str, Throwable th) {
        C4448l0 c4448l0 = C4448l0.f15796f;
        C4448l0 m18963q = str != null ? c4448l0.m18963q(str) : c4448l0.m18963q("Call cancelled without message");
        if (th != null) {
            m18963q = m18963q.m18962p(th);
        }
        m19316k(m18963q, false);
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: b */
    public final void mo6932b() {
        m19317l(new h());
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: c */
    public final void mo18625c(int i7) {
        if (this.f16227d) {
            this.f16229f.mo18625c(i7);
        } else {
            m19317l(new g(i7));
        }
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: d */
    public final void mo18626d(Object obj) {
        if (this.f16227d) {
            this.f16229f.mo18626d(obj);
        } else {
            m19317l(new f(obj));
        }
    }

    @Override // p237g5.AbstractC4437g
    /* renamed from: e */
    public final void mo18627e(AbstractC4437g.a aVar, C4424Z c4424z) {
        C4448l0 c4448l0;
        boolean z6;
        AbstractC2932o.m10579v(this.f16228e == null, "already started");
        synchronized (this) {
            try {
                this.f16228e = (AbstractC4437g.a) AbstractC2932o.m10573p(aVar, "listener");
                c4448l0 = this.f16230g;
                z6 = this.f16227d;
                if (!z6) {
                    k kVar = new k(aVar);
                    this.f16232i = kVar;
                    aVar = kVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4448l0 != null) {
            this.f16225b.execute(new j(aVar, c4448l0));
        } else if (z6) {
            this.f16229f.mo18627e(aVar, c4424z);
        } else {
            m19317l(new d(aVar, c4424z));
        }
    }

    /* renamed from: k */
    public final void m19316k(C4448l0 c4448l0, boolean z6) {
        boolean z7;
        AbstractC4437g.a aVar;
        synchronized (this) {
            try {
                if (this.f16229f == null) {
                    m19322q(f16223k);
                    aVar = this.f16228e;
                    this.f16230g = c4448l0;
                    z7 = false;
                } else {
                    if (z6) {
                        return;
                    }
                    z7 = true;
                    aVar = null;
                }
                if (z7) {
                    m19317l(new e(c4448l0));
                } else {
                    if (aVar != null) {
                        this.f16225b.execute(new j(aVar, c4448l0));
                    }
                    m19318m();
                }
                mo19315j();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final void m19317l(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.f16227d) {
                    runnable.run();
                } else {
                    this.f16231h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19318m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f16231h     // Catch: java.lang.Throwable -> L24
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L26
            r0 = 0
            r3.f16231h = r0     // Catch: java.lang.Throwable -> L24
            r0 = 1
            r3.f16227d = r0     // Catch: java.lang.Throwable -> L24
            i5.A$k r0 = r3.f16232i     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f16225b
            i5.A$c r2 = new i5.A$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            r0 = move-exception
            goto L44
        L26:
            java.util.List r1 = r3.f16231h     // Catch: java.lang.Throwable -> L24
            r3.f16231h = r0     // Catch: java.lang.Throwable -> L24
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Iterator r0 = r1.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2f
        L3f:
            r1.clear()
            r0 = r1
            goto L5
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.AbstractC4545A.m19318m():void");
    }

    /* renamed from: n */
    public final boolean m19319n(C4462t c4462t, C4462t c4462t2) {
        if (c4462t2 == null) {
            return true;
        }
        if (c4462t == null) {
            return false;
        }
        return c4462t.m19022k(c4462t2);
    }

    /* renamed from: o */
    public final ScheduledFuture m19320o(ScheduledExecutorService scheduledExecutorService, C4462t c4462t) {
        C4462t m19011g = this.f16226c.m19011g();
        if (c4462t == null && m19011g == null) {
            return null;
        }
        long m19025n = c4462t != null ? c4462t.m19025n(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (m19011g != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (m19011g.m19025n(timeUnit) < m19025n) {
                m19025n = m19011g.m19025n(timeUnit);
                Logger logger = f16222j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(m19025n)));
                    if (c4462t == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c4462t.m19025n(timeUnit))));
                    }
                    logger.fine(sb.toString());
                }
            }
        }
        long abs = Math.abs(m19025n);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(m19025n) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        String str = m19319n(m19011g, c4462t) ? "Context" : "CallOptions";
        if (m19025n < 0) {
            sb2.append("ClientCall started after ");
            sb2.append(str);
            sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
        } else {
            sb2.append("Deadline ");
            sb2.append(str);
            sb2.append(" will be exceeded in ");
        }
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), m19025n, TimeUnit.NANOSECONDS);
    }

    /* renamed from: p */
    public final Runnable m19321p(AbstractC4437g abstractC4437g) {
        synchronized (this) {
            try {
                if (this.f16229f != null) {
                    return null;
                }
                m19322q((AbstractC4437g) AbstractC2932o.m10573p(abstractC4437g, "call"));
                return new a(this.f16226c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: q */
    public final void m19322q(AbstractC4437g abstractC4437g) {
        AbstractC4437g abstractC4437g2 = this.f16229f;
        AbstractC2932o.m10581x(abstractC4437g2 == null, "realCall already set to %s", abstractC4437g2);
        ScheduledFuture scheduledFuture = this.f16224a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f16229f = abstractC4437g;
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10540d("realCall", this.f16229f).toString();
    }

    /* renamed from: i5.A$i */
    public class i extends AbstractC4437g {
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

    /* renamed from: j */
    public void mo19315j() {
    }
}
