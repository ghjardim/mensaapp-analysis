package p132S5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p104O5.AbstractC1421h;
import p132S5.InterfaceC2353T;
import p167X5.C2846G;
import p167X5.C2852M;
import p167X5.C2875t;
import p167X5.InterfaceC2853N;
import p350u.AbstractC6581b;
import p371w5.C6934q;
import p392z5.InterfaceC7161i;

/* renamed from: S5.f0 */
/* loaded from: classes2.dex */
public abstract class AbstractC2379f0 extends AbstractC2381g0 implements InterfaceC2353T {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7122f = AtomicReferenceFieldUpdater.newUpdater(AbstractC2379f0.class, Object.class, "_queue$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7123n = AtomicReferenceFieldUpdater.newUpdater(AbstractC2379f0.class, Object.class, "_delayed$volatile");

    /* renamed from: o */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7124o = AtomicIntegerFieldUpdater.newUpdater(AbstractC2379f0.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    /* renamed from: S5.f0$a */
    public final class a extends c {

        /* renamed from: c */
        public final InterfaceC2394n f7125c;

        public a(long j7, InterfaceC2394n interfaceC2394n) {
            super(j7);
            this.f7125c = interfaceC2394n;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7125c.mo8138n(AbstractC2379f0.this, C6934q.f24811a);
        }

        @Override // p132S5.AbstractC2379f0.c
        public String toString() {
            return super.toString() + this.f7125c;
        }
    }

    /* renamed from: S5.f0$b */
    public static final class b extends c {

        /* renamed from: c */
        public final Runnable f7127c;

        public b(long j7, Runnable runnable) {
            super(j7);
            this.f7127c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f7127c.run();
        }

        @Override // p132S5.AbstractC2379f0.c
        public String toString() {
            return super.toString() + this.f7127c;
        }
    }

    /* renamed from: S5.f0$c */
    public static abstract class c implements Runnable, Comparable, InterfaceC2368a0, InterfaceC2853N {
        private volatile Object _heap;

        /* renamed from: a */
        public long f7128a;

        /* renamed from: b */
        public int f7129b = -1;

        public c(long j7) {
            this.f7128a = j7;
        }

        @Override // p132S5.InterfaceC2368a0
        /* renamed from: b */
        public final void mo7864b() {
            C2846G c2846g;
            C2846G c2846g2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    c2846g = AbstractC2385i0.f7134a;
                    if (obj == c2846g) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.m10292h(this);
                    }
                    c2846g2 = AbstractC2385i0.f7134a;
                    this._heap = c2846g2;
                    C6934q c6934q = C6934q.f24811a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p167X5.InterfaceC2853N
        /* renamed from: g */
        public C2852M mo8102g() {
            Object obj = this._heap;
            if (obj instanceof C2852M) {
                return (C2852M) obj;
            }
            return null;
        }

        @Override // p167X5.InterfaceC2853N
        /* renamed from: h */
        public void mo8103h(C2852M c2852m) {
            C2846G c2846g;
            Object obj = this._heap;
            c2846g = AbstractC2385i0.f7134a;
            if (obj == c2846g) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = c2852m;
        }

        @Override // p167X5.InterfaceC2853N
        /* renamed from: i */
        public void mo8104i(int i7) {
            this.f7129b = i7;
        }

        @Override // p167X5.InterfaceC2853N
        /* renamed from: j */
        public int mo8105j() {
            return this.f7129b;
        }

        @Override // java.lang.Comparable
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            long j7 = this.f7128a - cVar.f7128a;
            if (j7 > 0) {
                return 1;
            }
            return j7 < 0 ? -1 : 0;
        }

        /* renamed from: l */
        public final int m8107l(long j7, d dVar, AbstractC2379f0 abstractC2379f0) {
            C2846G c2846g;
            synchronized (this) {
                Object obj = this._heap;
                c2846g = AbstractC2385i0.f7134a;
                if (obj == c2846g) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.m10287b();
                        if (abstractC2379f0.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.f7130c = j7;
                        } else {
                            long j8 = cVar.f7128a;
                            if (j8 - j7 < 0) {
                                j7 = j8;
                            }
                            if (j7 - dVar.f7130c > 0) {
                                dVar.f7130c = j7;
                            }
                        }
                        long j9 = this.f7128a;
                        long j10 = dVar.f7130c;
                        if (j9 - j10 < 0) {
                            this.f7128a = j10;
                        }
                        dVar.m10286a(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        /* renamed from: m */
        public final boolean m8108m(long j7) {
            return j7 - this.f7128a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f7128a + ']';
        }
    }

    /* renamed from: S5.f0$d */
    public static final class d extends C2852M {

        /* renamed from: c */
        public long f7130c;

        public d(long j7) {
            this.f7130c = j7;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return f7124o.get(this) != 0;
    }

    /* renamed from: B0 */
    public final void m8091B0() {
        C2846G c2846g;
        C2846G c2846g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7122f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7122f;
                c2846g = AbstractC2385i0.f7135b;
                if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater2, this, null, c2846g)) {
                    return;
                }
            } else {
                if (obj instanceof C2875t) {
                    ((C2875t) obj).m10376d();
                    return;
                }
                c2846g2 = AbstractC2385i0.f7135b;
                if (obj == c2846g2) {
                    return;
                }
                C2875t c2875t = new C2875t(8, true);
                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2875t.m10373a((Runnable) obj);
                if (AbstractC6581b.m27343a(f7122f, this, obj, c2875t)) {
                    return;
                }
            }
        }
    }

    /* renamed from: C0 */
    public final Runnable m8092C0() {
        C2846G c2846g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7122f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C2875t) {
                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2875t c2875t = (C2875t) obj;
                Object m10383m = c2875t.m10383m();
                if (m10383m != C2875t.f8859h) {
                    return (Runnable) m10383m;
                }
                AbstractC6581b.m27343a(f7122f, this, obj, c2875t.m10382l());
            } else {
                c2846g = AbstractC2385i0.f7135b;
                if (obj == c2846g) {
                    return null;
                }
                if (AbstractC6581b.m27343a(f7122f, this, obj, null)) {
                    AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    @Override // p132S5.AbstractC2328G
    /* renamed from: D */
    public final void mo7983D(InterfaceC7161i interfaceC7161i, Runnable runnable) {
        mo8007D0(runnable);
    }

    /* renamed from: D0 */
    public void mo8007D0(Runnable runnable) {
        if (m8093E0(runnable)) {
            m8110z0();
        } else {
            RunnableC2344O.f7079p.mo8007D0(runnable);
        }
    }

    /* renamed from: E0 */
    public final boolean m8093E0(Runnable runnable) {
        C2846G c2846g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7122f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC6581b.m27343a(f7122f, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C2875t) {
                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C2875t c2875t = (C2875t) obj;
                int m10373a = c2875t.m10373a(runnable);
                if (m10373a == 0) {
                    return true;
                }
                if (m10373a == 1) {
                    AbstractC6581b.m27343a(f7122f, this, obj, c2875t.m10382l());
                } else if (m10373a == 2) {
                    return false;
                }
            } else {
                c2846g = AbstractC2385i0.f7135b;
                if (obj == c2846g) {
                    return false;
                }
                C2875t c2875t2 = new C2875t(8, true);
                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                c2875t2.m10373a((Runnable) obj);
                c2875t2.m10373a(runnable);
                if (AbstractC6581b.m27343a(f7122f, this, obj, c2875t2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: I0 */
    public boolean m8094I0() {
        C2846G c2846g;
        if (!m8080f0()) {
            return false;
        }
        d dVar = (d) f7123n.get(this);
        if (dVar != null && !dVar.m10289e()) {
            return false;
        }
        Object obj = f7122f.get(this);
        if (obj != null) {
            if (obj instanceof C2875t) {
                return ((C2875t) obj).m10380j();
            }
            c2846g = AbstractC2385i0.f7135b;
            if (obj != c2846g) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public final void m8095J0() {
        c cVar;
        AbstractC2372c.m8061a();
        long nanoTime = System.nanoTime();
        while (true) {
            d dVar = (d) f7123n.get(this);
            if (dVar == null || (cVar = (c) dVar.m10294j()) == null) {
                return;
            } else {
                mo8016y0(nanoTime, cVar);
            }
        }
    }

    /* renamed from: K0 */
    public final void m8096K0() {
        f7122f.set(this, null);
        f7123n.set(this, null);
    }

    /* renamed from: L0 */
    public final void m8097L0(long j7, c cVar) {
        int m8098M0 = m8098M0(j7, cVar);
        if (m8098M0 == 0) {
            if (m8101P0(cVar)) {
                m8110z0();
            }
        } else if (m8098M0 == 1) {
            mo8016y0(j7, cVar);
        } else if (m8098M0 != 2) {
            throw new IllegalStateException("unexpected result");
        }
    }

    /* renamed from: M0 */
    public final int m8098M0(long j7, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        d dVar = (d) f7123n.get(this);
        if (dVar == null) {
            AbstractC6581b.m27343a(f7123n, this, null, new d(j7));
            Object obj = f7123n.get(this);
            AbstractC5469l.m23025b(obj);
            dVar = (d) obj;
        }
        return cVar.m8107l(j7, dVar, this);
    }

    /* renamed from: N0 */
    public final InterfaceC2368a0 m8099N0(long j7, Runnable runnable) {
        long m8121c = AbstractC2385i0.m8121c(j7);
        if (m8121c >= 4611686018427387903L) {
            return C2333I0.f7067a;
        }
        AbstractC2372c.m8061a();
        long nanoTime = System.nanoTime();
        b bVar = new b(m8121c + nanoTime, runnable);
        m8097L0(nanoTime, bVar);
        return bVar;
    }

    /* renamed from: O0 */
    public final void m8100O0(boolean z6) {
        f7124o.set(this, z6 ? 1 : 0);
    }

    /* renamed from: P0 */
    public final boolean m8101P0(c cVar) {
        d dVar = (d) f7123n.get(this);
        return (dVar != null ? (c) dVar.m10290f() : null) == cVar;
    }

    @Override // p132S5.AbstractC2377e0
    /* renamed from: S */
    public long mo8077S() {
        c cVar;
        C2846G c2846g;
        if (super.mo8077S() == 0) {
            return 0L;
        }
        Object obj = f7122f.get(this);
        if (obj != null) {
            if (!(obj instanceof C2875t)) {
                c2846g = AbstractC2385i0.f7135b;
                return obj == c2846g ? Long.MAX_VALUE : 0L;
            }
            if (!((C2875t) obj).m10380j()) {
                return 0L;
            }
        }
        d dVar = (d) f7123n.get(this);
        if (dVar == null || (cVar = (c) dVar.m10290f()) == null) {
            return Long.MAX_VALUE;
        }
        long j7 = cVar.f7128a;
        AbstractC2372c.m8061a();
        return AbstractC1421h.m5529b(j7 - System.nanoTime(), 0L);
    }

    @Override // p132S5.InterfaceC2353T
    /* renamed from: d */
    public void mo8028d(long j7, InterfaceC2394n interfaceC2394n) {
        long m8121c = AbstractC2385i0.m8121c(j7);
        if (m8121c < 4611686018427387903L) {
            AbstractC2372c.m8061a();
            long nanoTime = System.nanoTime();
            a aVar = new a(m8121c + nanoTime, interfaceC2394n);
            m8097L0(nanoTime, aVar);
            AbstractC2400q.m8173a(interfaceC2394n, aVar);
        }
    }

    @Override // p132S5.AbstractC2377e0
    /* renamed from: k0 */
    public long mo8081k0() {
        InterfaceC2853N interfaceC2853N;
        if (m8082l0()) {
            return 0L;
        }
        d dVar = (d) f7123n.get(this);
        if (dVar != null && !dVar.m10289e()) {
            AbstractC2372c.m8061a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (dVar) {
                    try {
                        InterfaceC2853N m10287b = dVar.m10287b();
                        if (m10287b != null) {
                            c cVar = (c) m10287b;
                            interfaceC2853N = cVar.m8108m(nanoTime) ? m8093E0(cVar) : false ? dVar.m10293i(0) : null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((c) interfaceC2853N) != null);
        }
        Runnable m8092C0 = m8092C0();
        if (m8092C0 == null) {
            return mo8077S();
        }
        m8092C0.run();
        return 0L;
    }

    @Override // p132S5.AbstractC2377e0
    public void shutdown() {
        C2352S0.f7083a.m8026c();
        m8100O0(true);
        m8091B0();
        while (mo8081k0() <= 0) {
        }
        m8095J0();
    }

    /* renamed from: y */
    public InterfaceC2368a0 mo8015y(long j7, Runnable runnable, InterfaceC7161i interfaceC7161i) {
        return InterfaceC2353T.a.m8029a(this, j7, runnable, interfaceC7161i);
    }
}
