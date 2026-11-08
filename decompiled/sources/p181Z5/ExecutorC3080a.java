package p181Z5;

import com.google.android.gms.common.api.C3643a;
import java.io.Closeable;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.C5480w;
import p020C5.AbstractC0091b;
import p020C5.InterfaceC0090a;
import p104O5.AbstractC1421h;
import p132S5.AbstractC2342N;
import p132S5.AbstractC2372c;
import p167X5.C2841B;
import p167X5.C2846G;
import p371w5.C6934q;

/* renamed from: Z5.a */
/* loaded from: classes2.dex */
public final class ExecutorC3080a implements Executor, Closeable {

    /* renamed from: o */
    public static final a f9515o = new a(null);

    /* renamed from: p */
    public static final /* synthetic */ AtomicLongFieldUpdater f9516p = AtomicLongFieldUpdater.newUpdater(ExecutorC3080a.class, "parkedWorkersStack$volatile");

    /* renamed from: q */
    public static final /* synthetic */ AtomicLongFieldUpdater f9517q = AtomicLongFieldUpdater.newUpdater(ExecutorC3080a.class, "controlState$volatile");

    /* renamed from: r */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9518r = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3080a.class, "_isTerminated$volatile");

    /* renamed from: s */
    public static final C2846G f9519s = new C2846G("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: a */
    public final int f9520a;

    /* renamed from: b */
    public final int f9521b;

    /* renamed from: c */
    public final long f9522c;
    private volatile /* synthetic */ long controlState$volatile;

    /* renamed from: d */
    public final String f9523d;

    /* renamed from: e */
    public final C3083d f9524e;

    /* renamed from: f */
    public final C3083d f9525f;

    /* renamed from: n */
    public final C2841B f9526n;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* renamed from: Z5.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        public a() {
        }
    }

    /* renamed from: Z5.a$b */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9527a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.f9539c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.f9538b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.f9537a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.f9540d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.f9541e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f9527a = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Z5.a$d */
    public static final class d {

        /* renamed from: a */
        public static final d f9537a = new d("CPU_ACQUIRED", 0);

        /* renamed from: b */
        public static final d f9538b = new d("BLOCKING", 1);

        /* renamed from: c */
        public static final d f9539c = new d("PARKING", 2);

        /* renamed from: d */
        public static final d f9540d = new d("DORMANT", 3);

        /* renamed from: e */
        public static final d f9541e = new d("TERMINATED", 4);

        /* renamed from: f */
        public static final /* synthetic */ d[] f9542f;

        /* renamed from: n */
        public static final /* synthetic */ InterfaceC0090a f9543n;

        static {
            d[] m11284b = m11284b();
            f9542f = m11284b;
            f9543n = AbstractC0091b.m239a(m11284b);
        }

        public d(String str, int i7) {
        }

        /* renamed from: b */
        public static final /* synthetic */ d[] m11284b() {
            return new d[]{f9537a, f9538b, f9539c, f9540d, f9541e};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f9542f.clone();
        }
    }

    public ExecutorC3080a(int i7, int i8, long j7, String str) {
        this.f9520a = i7;
        this.f9521b = i8;
        this.f9522c = j7;
        this.f9523d = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i7 + " should be at least 1").toString());
        }
        if (i8 < i7) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should be greater than or equals to core pool size " + i7).toString());
        }
        if (i8 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i8 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j7 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j7 + " must be positive").toString());
        }
        this.f9524e = new C3083d();
        this.f9525f = new C3083d();
        this.f9526n = new C2841B((i7 + 1) * 2);
        this.controlState$volatile = i7 << 42;
        this._isTerminated$volatile = 0;
    }

    /* renamed from: c0 */
    public static /* synthetic */ boolean m11240c0(ExecutorC3080a executorC3080a, long j7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j7 = f9517q.get(executorC3080a);
        }
        return executorC3080a.m11254T(j7);
    }

    /* renamed from: r */
    public static /* synthetic */ void m11241r(ExecutorC3080a executorC3080a, Runnable runnable, InterfaceC3088i interfaceC3088i, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            interfaceC3088i = AbstractC3091l.f9563g;
        }
        if ((i7 & 4) != 0) {
            z6 = false;
        }
        executorC3080a.m11260m(runnable, interfaceC3088i, z6);
    }

    /* renamed from: v */
    public static final /* synthetic */ AtomicLongFieldUpdater m11242v() {
        return f9517q;
    }

    /* renamed from: C */
    public final int m11245C(c cVar) {
        Object m11270i = cVar.m11270i();
        while (m11270i != f9519s) {
            if (m11270i == null) {
                return 0;
            }
            c cVar2 = (c) m11270i;
            int m11269h = cVar2.m11269h();
            if (m11269h != 0) {
                return m11269h;
            }
            m11270i = cVar2.m11270i();
        }
        return -1;
    }

    /* renamed from: D */
    public final c m11246D() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9516p;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f9526n.m10251b((int) (2097151 & j7));
            if (cVar == null) {
                return null;
            }
            long j8 = (2097152 + j7) & (-2097152);
            int m11245C = m11245C(cVar);
            if (m11245C >= 0 && f9516p.compareAndSet(this, j7, m11245C | j8)) {
                cVar.m11278r(f9519s);
                return cVar;
            }
        }
    }

    /* renamed from: F */
    public final boolean m11247F(c cVar) {
        long j7;
        int m11269h;
        if (cVar.m11270i() != f9519s) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9516p;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            m11269h = cVar.m11269h();
            cVar.m11278r(this.f9526n.m10251b((int) (2097151 & j7)));
        } while (!f9516p.compareAndSet(this, j7, ((2097152 + j7) & (-2097152)) | m11269h));
        return true;
    }

    /* renamed from: G */
    public final void m11248G(c cVar, int i7, int i8) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f9516p;
        while (true) {
            long j7 = atomicLongFieldUpdater.get(this);
            int i9 = (int) (2097151 & j7);
            long j8 = (2097152 + j7) & (-2097152);
            if (i9 == i7) {
                i9 = i8 == 0 ? m11245C(cVar) : i8;
            }
            if (i9 >= 0 && f9516p.compareAndSet(this, j7, j8 | i9)) {
                return;
            }
        }
    }

    /* renamed from: K */
    public final void m11249K(AbstractRunnableC3087h abstractRunnableC3087h) {
        try {
            abstractRunnableC3087h.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: M */
    public final void m11250M(long j7) {
        int i7;
        AbstractRunnableC3087h abstractRunnableC3087h;
        if (f9518r.compareAndSet(this, 0, 1)) {
            c m11259j = m11259j();
            synchronized (this.f9526n) {
                i7 = (int) (m11242v().get(this) & 2097151);
            }
            if (1 <= i7) {
                int i8 = 1;
                while (true) {
                    Object m10251b = this.f9526n.m10251b(i8);
                    AbstractC5469l.m23025b(m10251b);
                    c cVar = (c) m10251b;
                    if (cVar != m11259j) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j7);
                        }
                        cVar.f9529a.m11299j(this.f9525f);
                    }
                    if (i8 == i7) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f9525f.m10368b();
            this.f9524e.m10368b();
            while (true) {
                if (m11259j != null) {
                    abstractRunnableC3087h = m11259j.m11268g(true);
                    if (abstractRunnableC3087h != null) {
                        continue;
                        m11249K(abstractRunnableC3087h);
                    }
                }
                abstractRunnableC3087h = (AbstractRunnableC3087h) this.f9524e.m10370e();
                if (abstractRunnableC3087h == null && (abstractRunnableC3087h = (AbstractRunnableC3087h) this.f9525f.m10370e()) == null) {
                    break;
                }
                m11249K(abstractRunnableC3087h);
            }
            if (m11259j != null) {
                m11259j.m11281u(d.f9541e);
            }
            f9516p.set(this, 0L);
            f9517q.set(this, 0L);
        }
    }

    /* renamed from: N */
    public final void m11251N(long j7, boolean z6) {
        if (z6 || m11257d0() || m11254T(j7)) {
            return;
        }
        m11257d0();
    }

    /* renamed from: R */
    public final void m11252R() {
        if (m11257d0() || m11240c0(this, 0L, 1, null)) {
            return;
        }
        m11257d0();
    }

    /* renamed from: S */
    public final AbstractRunnableC3087h m11253S(c cVar, AbstractRunnableC3087h abstractRunnableC3087h, boolean z6) {
        if (cVar == null) {
            return abstractRunnableC3087h;
        }
        if (cVar.f9531c == d.f9541e) {
            return abstractRunnableC3087h;
        }
        if (abstractRunnableC3087h.f9554b.mo11289b() == 0 && cVar.f9531c == d.f9538b) {
            return abstractRunnableC3087h;
        }
        cVar.f9535n = true;
        return cVar.f9529a.m11294a(abstractRunnableC3087h, z6);
    }

    /* renamed from: T */
    public final boolean m11254T(long j7) {
        if (AbstractC1421h.m5528a(((int) (2097151 & j7)) - ((int) ((j7 & 4398044413952L) >> 21)), 0) < this.f9520a) {
            int m11256d = m11256d();
            if (m11256d == 1 && this.f9520a > 1) {
                m11256d();
            }
            if (m11256d > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m11255c(AbstractRunnableC3087h abstractRunnableC3087h) {
        return abstractRunnableC3087h.f9554b.mo11289b() == 1 ? this.f9525f.m10367a(abstractRunnableC3087h) : this.f9524e.m10367a(abstractRunnableC3087h);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m11250M(10000L);
    }

    /* renamed from: d */
    public final int m11256d() {
        synchronized (this.f9526n) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j7 = f9517q.get(this);
                int i7 = (int) (j7 & 2097151);
                int m5528a = AbstractC1421h.m5528a(i7 - ((int) ((j7 & 4398044413952L) >> 21)), 0);
                if (m5528a >= this.f9520a) {
                    return 0;
                }
                if (i7 >= this.f9521b) {
                    return 0;
                }
                int i8 = ((int) (m11242v().get(this) & 2097151)) + 1;
                if (i8 <= 0 || this.f9526n.m10251b(i8) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i8);
                this.f9526n.m10252c(i8, cVar);
                if (i8 != ((int) (2097151 & f9517q.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i9 = m5528a + 1;
                cVar.start();
                return i9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d0 */
    public final boolean m11257d0() {
        c m11246D;
        do {
            m11246D = m11246D();
            if (m11246D == null) {
                return false;
            }
        } while (!c.f9528p.compareAndSet(m11246D, -1, 0));
        LockSupport.unpark(m11246D);
        return true;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m11241r(this, runnable, null, false, 6, null);
    }

    /* renamed from: h */
    public final AbstractRunnableC3087h m11258h(Runnable runnable, InterfaceC3088i interfaceC3088i) {
        long mo11285a = AbstractC3091l.f9562f.mo11285a();
        if (!(runnable instanceof AbstractRunnableC3087h)) {
            return new C3090k(runnable, mo11285a, interfaceC3088i);
        }
        AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) runnable;
        abstractRunnableC3087h.f9553a = mo11285a;
        abstractRunnableC3087h.f9554b = interfaceC3088i;
        return abstractRunnableC3087h;
    }

    public final boolean isTerminated() {
        return f9518r.get(this) != 0;
    }

    /* renamed from: j */
    public final c m11259j() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !AbstractC5469l.m23024a(ExecutorC3080a.this, this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: m */
    public final void m11260m(Runnable runnable, InterfaceC3088i interfaceC3088i, boolean z6) {
        AbstractC2372c.m8061a();
        AbstractRunnableC3087h m11258h = m11258h(runnable, interfaceC3088i);
        boolean z7 = false;
        boolean z8 = m11258h.f9554b.mo11289b() == 1;
        long addAndGet = z8 ? f9517q.addAndGet(this, 2097152L) : 0L;
        c m11259j = m11259j();
        AbstractRunnableC3087h m11253S = m11253S(m11259j, m11258h, z6);
        if (m11253S != null && !m11255c(m11253S)) {
            throw new RejectedExecutionException(this.f9523d + " was terminated");
        }
        if (z6 && m11259j != null) {
            z7 = true;
        }
        if (z8) {
            m11251N(addAndGet, z7);
        } else {
            if (z7) {
                return;
            }
            m11252R();
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int m10250a = this.f9526n.m10250a();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 1; i12 < m10250a; i12++) {
            c cVar = (c) this.f9526n.m10251b(i12);
            if (cVar != null) {
                int m11298i = cVar.f9529a.m11298i();
                int i13 = b.f9527a[cVar.f9531c.ordinal()];
                if (i13 == 1) {
                    i9++;
                } else if (i13 == 2) {
                    i8++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(m11298i);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i13 == 3) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m11298i);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i13 == 4) {
                    i10++;
                    if (m11298i > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(m11298i);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i13 == 5) {
                    i11++;
                }
            }
        }
        long j7 = f9517q.get(this);
        return this.f9523d + '@' + AbstractC2342N.m8005b(this) + "[Pool Size {core = " + this.f9520a + ", max = " + this.f9521b + "}, Worker States {CPU = " + i7 + ", blocking = " + i8 + ", parked = " + i9 + ", dormant = " + i10 + ", terminated = " + i11 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f9524e.m10369c() + ", global blocking queue size = " + this.f9525f.m10369c() + ", Control State {created workers= " + ((int) (2097151 & j7)) + ", blocking tasks = " + ((int) ((4398044413952L & j7) >> 21)) + ", CPUs acquired = " + (this.f9520a - ((int) ((9223367638808264704L & j7) >> 42))) + "}]";
    }

    /* renamed from: Z5.a$c */
    public final class c extends Thread {

        /* renamed from: p */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f9528p = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* renamed from: a */
        public final C3093n f9529a;

        /* renamed from: b */
        public final C5480w f9530b;

        /* renamed from: c */
        public d f9531c;

        /* renamed from: d */
        public long f9532d;

        /* renamed from: e */
        public long f9533e;

        /* renamed from: f */
        public int f9534f;
        private volatile int indexInArray;

        /* renamed from: n */
        public boolean f9535n;
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        public c() {
            setDaemon(true);
            setContextClassLoader(ExecutorC3080a.this.getClass().getClassLoader());
            this.f9529a = new C3093n();
            this.f9530b = new C5480w();
            this.f9531c = d.f9540d;
            this.nextParkedWorker = ExecutorC3080a.f9519s;
            int nanoTime = (int) System.nanoTime();
            this.f9534f = nanoTime == 0 ? 42 : nanoTime;
        }

        /* renamed from: b */
        public final void m11263b(int i7) {
            if (i7 == 0) {
                return;
            }
            ExecutorC3080a.m11242v().addAndGet(ExecutorC3080a.this, -2097152L);
            if (this.f9531c != d.f9541e) {
                this.f9531c = d.f9540d;
            }
        }

        /* renamed from: c */
        public final void m11264c(int i7) {
            if (i7 != 0 && m11281u(d.f9538b)) {
                ExecutorC3080a.this.m11252R();
            }
        }

        /* renamed from: d */
        public final void m11265d(AbstractRunnableC3087h abstractRunnableC3087h) {
            int mo11289b = abstractRunnableC3087h.f9554b.mo11289b();
            m11271k(mo11289b);
            m11264c(mo11289b);
            ExecutorC3080a.this.m11249K(abstractRunnableC3087h);
            m11263b(mo11289b);
        }

        /* renamed from: e */
        public final AbstractRunnableC3087h m11266e(boolean z6) {
            AbstractRunnableC3087h m11275o;
            AbstractRunnableC3087h m11275o2;
            if (z6) {
                boolean z7 = m11273m(ExecutorC3080a.this.f9520a * 2) == 0;
                if (z7 && (m11275o2 = m11275o()) != null) {
                    return m11275o2;
                }
                AbstractRunnableC3087h m11300k = this.f9529a.m11300k();
                if (m11300k != null) {
                    return m11300k;
                }
                if (!z7 && (m11275o = m11275o()) != null) {
                    return m11275o;
                }
            } else {
                AbstractRunnableC3087h m11275o3 = m11275o();
                if (m11275o3 != null) {
                    return m11275o3;
                }
            }
            return m11282v(3);
        }

        /* renamed from: f */
        public final AbstractRunnableC3087h m11267f() {
            AbstractRunnableC3087h m11301l = this.f9529a.m11301l();
            if (m11301l != null) {
                return m11301l;
            }
            AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) ExecutorC3080a.this.f9525f.m10370e();
            return abstractRunnableC3087h == null ? m11282v(1) : abstractRunnableC3087h;
        }

        /* renamed from: g */
        public final AbstractRunnableC3087h m11268g(boolean z6) {
            return m11279s() ? m11266e(z6) : m11267f();
        }

        /* renamed from: h */
        public final int m11269h() {
            return this.indexInArray;
        }

        /* renamed from: i */
        public final Object m11270i() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final void m11271k(int i7) {
            this.f9532d = 0L;
            if (this.f9531c == d.f9539c) {
                this.f9531c = d.f9538b;
            }
        }

        /* renamed from: l */
        public final boolean m11272l() {
            return this.nextParkedWorker != ExecutorC3080a.f9519s;
        }

        /* renamed from: m */
        public final int m11273m(int i7) {
            int i8 = this.f9534f;
            int i9 = i8 ^ (i8 << 13);
            int i10 = i9 ^ (i9 >> 17);
            int i11 = i10 ^ (i10 << 5);
            this.f9534f = i11;
            int i12 = i7 - 1;
            return (i12 & i7) == 0 ? i11 & i12 : (i11 & C3643a.e.API_PRIORITY_OTHER) % i7;
        }

        /* renamed from: n */
        public final void m11274n() {
            if (this.f9532d == 0) {
                this.f9532d = System.nanoTime() + ExecutorC3080a.this.f9522c;
            }
            LockSupport.parkNanos(ExecutorC3080a.this.f9522c);
            if (System.nanoTime() - this.f9532d >= 0) {
                this.f9532d = 0L;
                m11283w();
            }
        }

        /* renamed from: o */
        public final AbstractRunnableC3087h m11275o() {
            if (m11273m(2) == 0) {
                AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) ExecutorC3080a.this.f9524e.m10370e();
                return abstractRunnableC3087h != null ? abstractRunnableC3087h : (AbstractRunnableC3087h) ExecutorC3080a.this.f9525f.m10370e();
            }
            AbstractRunnableC3087h abstractRunnableC3087h2 = (AbstractRunnableC3087h) ExecutorC3080a.this.f9525f.m10370e();
            return abstractRunnableC3087h2 != null ? abstractRunnableC3087h2 : (AbstractRunnableC3087h) ExecutorC3080a.this.f9524e.m10370e();
        }

        /* renamed from: p */
        public final void m11276p() {
            loop0: while (true) {
                boolean z6 = false;
                while (!ExecutorC3080a.this.isTerminated() && this.f9531c != d.f9541e) {
                    AbstractRunnableC3087h m11268g = m11268g(this.f9535n);
                    if (m11268g != null) {
                        this.f9533e = 0L;
                        m11265d(m11268g);
                    } else {
                        this.f9535n = false;
                        if (this.f9533e == 0) {
                            m11280t();
                        } else if (z6) {
                            m11281u(d.f9539c);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f9533e);
                            this.f9533e = 0L;
                        } else {
                            z6 = true;
                        }
                    }
                }
            }
            m11281u(d.f9541e);
        }

        /* renamed from: q */
        public final void m11277q(int i7) {
            StringBuilder sb = new StringBuilder();
            sb.append(ExecutorC3080a.this.f9523d);
            sb.append("-worker-");
            sb.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
            setName(sb.toString());
            this.indexInArray = i7;
        }

        /* renamed from: r */
        public final void m11278r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m11276p();
        }

        /* renamed from: s */
        public final boolean m11279s() {
            long j7;
            if (this.f9531c == d.f9537a) {
                return true;
            }
            ExecutorC3080a executorC3080a = ExecutorC3080a.this;
            AtomicLongFieldUpdater m11242v = ExecutorC3080a.m11242v();
            do {
                j7 = m11242v.get(executorC3080a);
                if (((int) ((9223367638808264704L & j7) >> 42)) == 0) {
                    return false;
                }
            } while (!ExecutorC3080a.m11242v().compareAndSet(executorC3080a, j7, j7 - 4398046511104L));
            this.f9531c = d.f9537a;
            return true;
        }

        /* renamed from: t */
        public final void m11280t() {
            if (!m11272l()) {
                ExecutorC3080a.this.m11247F(this);
                return;
            }
            f9528p.set(this, -1);
            while (m11272l() && f9528p.get(this) == -1 && !ExecutorC3080a.this.isTerminated() && this.f9531c != d.f9541e) {
                m11281u(d.f9539c);
                Thread.interrupted();
                m11274n();
            }
        }

        /* renamed from: u */
        public final boolean m11281u(d dVar) {
            d dVar2 = this.f9531c;
            boolean z6 = dVar2 == d.f9537a;
            if (z6) {
                ExecutorC3080a.m11242v().addAndGet(ExecutorC3080a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f9531c = dVar;
            }
            return z6;
        }

        /* renamed from: v */
        public final AbstractRunnableC3087h m11282v(int i7) {
            int i8 = (int) (ExecutorC3080a.m11242v().get(ExecutorC3080a.this) & 2097151);
            if (i8 < 2) {
                return null;
            }
            int m11273m = m11273m(i8);
            ExecutorC3080a executorC3080a = ExecutorC3080a.this;
            long j7 = Long.MAX_VALUE;
            for (int i9 = 0; i9 < i8; i9++) {
                m11273m++;
                if (m11273m > i8) {
                    m11273m = 1;
                }
                c cVar = (c) executorC3080a.f9526n.m10251b(m11273m);
                if (cVar != null && cVar != this) {
                    long m11307r = cVar.f9529a.m11307r(i7, this.f9530b);
                    if (m11307r == -1) {
                        C5480w c5480w = this.f9530b;
                        AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) c5480w.f19710a;
                        c5480w.f19710a = null;
                        return abstractRunnableC3087h;
                    }
                    if (m11307r > 0) {
                        j7 = Math.min(j7, m11307r);
                    }
                }
            }
            if (j7 == Long.MAX_VALUE) {
                j7 = 0;
            }
            this.f9533e = j7;
            return null;
        }

        /* renamed from: w */
        public final void m11283w() {
            ExecutorC3080a executorC3080a = ExecutorC3080a.this;
            synchronized (executorC3080a.f9526n) {
                try {
                    if (executorC3080a.isTerminated()) {
                        return;
                    }
                    if (((int) (ExecutorC3080a.m11242v().get(executorC3080a) & 2097151)) <= executorC3080a.f9520a) {
                        return;
                    }
                    if (f9528p.compareAndSet(this, -1, 1)) {
                        int i7 = this.indexInArray;
                        m11277q(0);
                        executorC3080a.m11248G(this, i7, 0);
                        int andDecrement = (int) (ExecutorC3080a.m11242v().getAndDecrement(executorC3080a) & 2097151);
                        if (andDecrement != i7) {
                            Object m10251b = executorC3080a.f9526n.m10251b(andDecrement);
                            AbstractC5469l.m23025b(m10251b);
                            c cVar = (c) m10251b;
                            executorC3080a.f9526n.m10252c(i7, cVar);
                            cVar.m11277q(i7);
                            executorC3080a.m11248G(cVar, andDecrement, i7);
                        }
                        executorC3080a.f9526n.m10252c(andDecrement, null);
                        C6934q c6934q = C6934q.f24811a;
                        this.f9531c = d.f9541e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(ExecutorC3080a executorC3080a, int i7) {
            this();
            m11277q(i7);
        }
    }
}
