package p253i5;

import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p237g5.AbstractC4445k;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4448l0;
import p237g5.C4462t;
import p237g5.C4464v;
import p237g5.ExecutorC4456p0;
import p237g5.InterfaceC4451n;
import p253i5.InterfaceC4579R0;
import p253i5.InterfaceC4630s;
import p256j$.util.DesugarCollections;

/* renamed from: i5.D0 */
/* loaded from: classes2.dex */
public abstract class AbstractC4552D0 implements InterfaceC4628r {

    /* renamed from: A */
    public static final C4424Z.g f16390A;

    /* renamed from: B */
    public static final C4424Z.g f16391B;

    /* renamed from: C */
    public static final C4448l0 f16392C;

    /* renamed from: D */
    public static Random f16393D;

    /* renamed from: a */
    public final C4426a0 f16394a;

    /* renamed from: b */
    public final Executor f16395b;

    /* renamed from: d */
    public final ScheduledExecutorService f16397d;

    /* renamed from: e */
    public final C4424Z f16398e;

    /* renamed from: f */
    public final C4554E0 f16399f;

    /* renamed from: g */
    public final C4584U f16400g;

    /* renamed from: h */
    public final boolean f16401h;

    /* renamed from: j */
    public final t f16403j;

    /* renamed from: k */
    public final long f16404k;

    /* renamed from: l */
    public final long f16405l;

    /* renamed from: m */
    public final D f16406m;

    /* renamed from: s */
    public y f16412s;

    /* renamed from: t */
    public long f16413t;

    /* renamed from: u */
    public InterfaceC4630s f16414u;

    /* renamed from: v */
    public u f16415v;

    /* renamed from: w */
    public u f16416w;

    /* renamed from: x */
    public long f16417x;

    /* renamed from: y */
    public C4448l0 f16418y;

    /* renamed from: z */
    public boolean f16419z;

    /* renamed from: c */
    public final Executor f16396c = new ExecutorC4456p0(new C7254a());

    /* renamed from: i */
    public final Object f16402i = new Object();

    /* renamed from: n */
    public final C4592Y f16407n = new C4592Y();

    /* renamed from: o */
    public volatile A f16408o = new A(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p */
    public final AtomicBoolean f16409p = new AtomicBoolean();

    /* renamed from: q */
    public final AtomicInteger f16410q = new AtomicInteger();

    /* renamed from: r */
    public final AtomicInteger f16411r = new AtomicInteger();

    /* renamed from: i5.D0$A */
    public static final class A {

        /* renamed from: a */
        public final boolean f16420a;

        /* renamed from: b */
        public final List f16421b;

        /* renamed from: c */
        public final Collection f16422c;

        /* renamed from: d */
        public final Collection f16423d;

        /* renamed from: e */
        public final int f16424e;

        /* renamed from: f */
        public final C f16425f;

        /* renamed from: g */
        public final boolean f16426g;

        /* renamed from: h */
        public final boolean f16427h;

        public A(List list, Collection collection, Collection collection2, C c7, boolean z6, boolean z7, boolean z8, int i7) {
            this.f16421b = list;
            this.f16422c = (Collection) AbstractC2932o.m10573p(collection, "drainedSubstreams");
            this.f16425f = c7;
            this.f16423d = collection2;
            this.f16426g = z6;
            this.f16420a = z7;
            this.f16427h = z8;
            this.f16424e = i7;
            AbstractC2932o.m10579v(!z7 || list == null, "passThrough should imply buffer is null");
            AbstractC2932o.m10579v((z7 && c7 == null) ? false : true, "passThrough should imply winningSubstream != null");
            AbstractC2932o.m10579v(!z7 || (collection.size() == 1 && collection.contains(c7)) || (collection.size() == 0 && c7.f16442b), "passThrough should imply winningSubstream is drained");
            AbstractC2932o.m10579v((z6 && c7 == null) ? false : true, "cancelled should imply committed");
        }

        /* renamed from: a */
        public A m19486a(C c7) {
            Collection unmodifiableCollection;
            AbstractC2932o.m10579v(!this.f16427h, "hedging frozen");
            AbstractC2932o.m10579v(this.f16425f == null, "already committed");
            if (this.f16423d == null) {
                unmodifiableCollection = Collections.singleton(c7);
            } else {
                ArrayList arrayList = new ArrayList(this.f16423d);
                arrayList.add(c7);
                unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            return new A(this.f16421b, this.f16422c, unmodifiableCollection, this.f16425f, this.f16426g, this.f16420a, this.f16427h, this.f16424e + 1);
        }

        /* renamed from: b */
        public A m19487b() {
            return new A(this.f16421b, this.f16422c, this.f16423d, this.f16425f, true, this.f16420a, this.f16427h, this.f16424e);
        }

        /* renamed from: c */
        public A m19488c(C c7) {
            List list;
            boolean z6;
            Collection emptyList;
            AbstractC2932o.m10579v(this.f16425f == null, "Already committed");
            List list2 = this.f16421b;
            if (this.f16422c.contains(c7)) {
                emptyList = Collections.singleton(c7);
                list = null;
                z6 = true;
            } else {
                list = list2;
                z6 = false;
                emptyList = Collections.emptyList();
            }
            return new A(list, emptyList, this.f16423d, c7, this.f16426g, z6, this.f16427h, this.f16424e);
        }

        /* renamed from: d */
        public A m19489d() {
            return this.f16427h ? this : new A(this.f16421b, this.f16422c, this.f16423d, this.f16425f, this.f16426g, this.f16420a, true, this.f16424e);
        }

        /* renamed from: e */
        public A m19490e(C c7) {
            ArrayList arrayList = new ArrayList(this.f16423d);
            arrayList.remove(c7);
            return new A(this.f16421b, this.f16422c, DesugarCollections.unmodifiableCollection(arrayList), this.f16425f, this.f16426g, this.f16420a, this.f16427h, this.f16424e);
        }

        /* renamed from: f */
        public A m19491f(C c7, C c8) {
            ArrayList arrayList = new ArrayList(this.f16423d);
            arrayList.remove(c7);
            arrayList.add(c8);
            return new A(this.f16421b, this.f16422c, DesugarCollections.unmodifiableCollection(arrayList), this.f16425f, this.f16426g, this.f16420a, this.f16427h, this.f16424e);
        }

        /* renamed from: g */
        public A m19492g(C c7) {
            c7.f16442b = true;
            if (!this.f16422c.contains(c7)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f16422c);
            arrayList.remove(c7);
            return new A(this.f16421b, DesugarCollections.unmodifiableCollection(arrayList), this.f16423d, this.f16425f, this.f16426g, this.f16420a, this.f16427h, this.f16424e);
        }

        /* renamed from: h */
        public A m19493h(C c7) {
            Collection unmodifiableCollection;
            AbstractC2932o.m10579v(!this.f16420a, "Already passThrough");
            if (c7.f16442b) {
                unmodifiableCollection = this.f16422c;
            } else if (this.f16422c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(c7);
            } else {
                ArrayList arrayList = new ArrayList(this.f16422c);
                arrayList.add(c7);
                unmodifiableCollection = DesugarCollections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            C c8 = this.f16425f;
            boolean z6 = c8 != null;
            List list = this.f16421b;
            if (z6) {
                AbstractC2932o.m10579v(c8 == c7, "Another RPC attempt has already committed");
                list = null;
            }
            return new A(list, collection, this.f16423d, this.f16425f, this.f16426g, z6, this.f16427h, this.f16424e);
        }
    }

    /* renamed from: i5.D0$B */
    public final class B implements InterfaceC4630s {

        /* renamed from: a */
        public final C f16428a;

        /* renamed from: i5.D0$B$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4424Z f16430a;

            public a(C4424Z c4424z) {
                this.f16430a = c4424z;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC4552D0.this.f16414u.mo19388c(this.f16430a);
            }
        }

        /* renamed from: i5.D0$B$b */
        public class b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C f16432a;

            /* renamed from: i5.D0$B$b$a */
            public class a implements Runnable {
                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b bVar = b.this;
                    AbstractC4552D0.this.m19476g0(bVar.f16432a);
                }
            }

            public b(C c7) {
                this.f16432a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC4552D0.this.f16395b.execute(new a());
            }
        }

        /* renamed from: i5.D0$B$c */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC4552D0.this.f16419z = true;
                AbstractC4552D0.this.f16414u.mo19387b(AbstractC4552D0.this.f16412s.f16498a, AbstractC4552D0.this.f16412s.f16499b, AbstractC4552D0.this.f16412s.f16500c);
            }
        }

        /* renamed from: i5.D0$B$d */
        public class d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C f16436a;

            public d(C c7) {
                this.f16436a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC4552D0.this.m19476g0(this.f16436a);
            }
        }

        /* renamed from: i5.D0$B$e */
        public class e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ InterfaceC4579R0.a f16438a;

            public e(InterfaceC4579R0.a aVar) {
                this.f16438a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                AbstractC4552D0.this.f16414u.mo19386a(this.f16438a);
            }
        }

        /* renamed from: i5.D0$B$f */
        public class f implements Runnable {
            public f() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC4552D0.this.f16419z) {
                    return;
                }
                AbstractC4552D0.this.f16414u.mo19389d();
            }
        }

        public B(C c7) {
            this.f16428a = c7;
        }

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: a */
        public void mo19386a(InterfaceC4579R0.a aVar) {
            A a7 = AbstractC4552D0.this.f16408o;
            AbstractC2932o.m10579v(a7.f16425f != null, "Headers should be received prior to messages.");
            if (a7.f16425f != this.f16428a) {
                AbstractC4580S.m19598d(aVar);
            } else {
                AbstractC4552D0.this.f16396c.execute(new e(aVar));
            }
        }

        @Override // p253i5.InterfaceC4630s
        /* renamed from: b */
        public void mo19387b(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            u uVar;
            synchronized (AbstractC4552D0.this.f16402i) {
                AbstractC4552D0 abstractC4552D0 = AbstractC4552D0.this;
                abstractC4552D0.f16408o = abstractC4552D0.f16408o.m19492g(this.f16428a);
                AbstractC4552D0.this.f16407n.m19703a(c4448l0.m18959m());
            }
            if (AbstractC4552D0.this.f16411r.decrementAndGet() == Integer.MIN_VALUE) {
                AbstractC4552D0.this.f16396c.execute(new c());
                return;
            }
            C c7 = this.f16428a;
            if (c7.f16443c) {
                AbstractC4552D0.this.m19473d0(c7);
                if (AbstractC4552D0.this.f16408o.f16425f == this.f16428a) {
                    AbstractC4552D0.this.m19483n0(c4448l0, aVar, c4424z);
                    return;
                }
                return;
            }
            InterfaceC4630s.a aVar2 = InterfaceC4630s.a.MISCARRIED;
            if (aVar == aVar2 && AbstractC4552D0.this.f16410q.incrementAndGet() > 1000) {
                AbstractC4552D0.this.m19473d0(this.f16428a);
                if (AbstractC4552D0.this.f16408o.f16425f == this.f16428a) {
                    AbstractC4552D0.this.m19483n0(C4448l0.f15809s.m18963q("Too many transparent retries. Might be a bug in gRPC").m18962p(c4448l0.m18956d()), aVar, c4424z);
                    return;
                }
                return;
            }
            if (AbstractC4552D0.this.f16408o.f16425f == null) {
                if (aVar == aVar2 || (aVar == InterfaceC4630s.a.REFUSED && AbstractC4552D0.this.f16409p.compareAndSet(false, true))) {
                    C m19474e0 = AbstractC4552D0.this.m19474e0(this.f16428a.f16444d, true);
                    if (m19474e0 == null) {
                        return;
                    }
                    if (AbstractC4552D0.this.f16401h) {
                        synchronized (AbstractC4552D0.this.f16402i) {
                            AbstractC4552D0 abstractC4552D02 = AbstractC4552D0.this;
                            abstractC4552D02.f16408o = abstractC4552D02.f16408o.m19491f(this.f16428a, m19474e0);
                        }
                    }
                    AbstractC4552D0.this.f16395b.execute(new d(m19474e0));
                    return;
                }
                if (aVar != InterfaceC4630s.a.DROPPED) {
                    AbstractC4552D0.this.f16409p.set(true);
                    if (AbstractC4552D0.this.f16401h) {
                        v m19495f = m19495f(c4448l0, c4424z);
                        if (m19495f.f16490a) {
                            AbstractC4552D0.this.m19482m0(m19495f.f16491b);
                        }
                        synchronized (AbstractC4552D0.this.f16402i) {
                            try {
                                AbstractC4552D0 abstractC4552D03 = AbstractC4552D0.this;
                                abstractC4552D03.f16408o = abstractC4552D03.f16408o.m19490e(this.f16428a);
                                if (m19495f.f16490a) {
                                    AbstractC4552D0 abstractC4552D04 = AbstractC4552D0.this;
                                    if (!abstractC4552D04.m19478i0(abstractC4552D04.f16408o)) {
                                        if (!AbstractC4552D0.this.f16408o.f16423d.isEmpty()) {
                                        }
                                    }
                                    return;
                                }
                            } finally {
                            }
                        }
                    } else {
                        x m19496g = m19496g(c4448l0, c4424z);
                        if (m19496g.f16496a) {
                            C m19474e02 = AbstractC4552D0.this.m19474e0(this.f16428a.f16444d + 1, false);
                            if (m19474e02 == null) {
                                return;
                            }
                            synchronized (AbstractC4552D0.this.f16402i) {
                                AbstractC4552D0 abstractC4552D05 = AbstractC4552D0.this;
                                uVar = new u(abstractC4552D05.f16402i);
                                abstractC4552D05.f16415v = uVar;
                            }
                            uVar.m19504c(AbstractC4552D0.this.f16397d.schedule(new b(m19474e02), m19496g.f16497b, TimeUnit.NANOSECONDS));
                            return;
                        }
                    }
                } else if (AbstractC4552D0.this.f16401h) {
                    AbstractC4552D0.this.m19477h0();
                }
            }
            AbstractC4552D0.this.m19473d0(this.f16428a);
            if (AbstractC4552D0.this.f16408o.f16425f == this.f16428a) {
                AbstractC4552D0.this.m19483n0(c4448l0, aVar, c4424z);
            }
        }

        @Override // p253i5.InterfaceC4630s
        /* renamed from: c */
        public void mo19388c(C4424Z c4424z) {
            if (this.f16428a.f16444d > 0) {
                C4424Z.g gVar = AbstractC4552D0.f16390A;
                c4424z.m18777e(gVar);
                c4424z.m18788p(gVar, String.valueOf(this.f16428a.f16444d));
            }
            AbstractC4552D0.this.m19473d0(this.f16428a);
            if (AbstractC4552D0.this.f16408o.f16425f == this.f16428a) {
                if (AbstractC4552D0.this.f16406m != null) {
                    AbstractC4552D0.this.f16406m.m19499c();
                }
                AbstractC4552D0.this.f16396c.execute(new a(c4424z));
            }
        }

        @Override // p253i5.InterfaceC4579R0
        /* renamed from: d */
        public void mo19389d() {
            if (AbstractC4552D0.this.mo19367b()) {
                AbstractC4552D0.this.f16396c.execute(new f());
            }
        }

        /* renamed from: e */
        public final Integer m19494e(C4424Z c4424z) {
            String str = (String) c4424z.m18779g(AbstractC4552D0.f16391B);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: f */
        public final v m19495f(C4448l0 c4448l0, C4424Z c4424z) {
            Integer m19494e = m19494e(c4424z);
            boolean contains = AbstractC4552D0.this.f16400g.f16645c.contains(c4448l0.m18959m());
            boolean z6 = (AbstractC4552D0.this.f16406m == null || (!contains && (m19494e == null || m19494e.intValue() >= 0))) ? false : !AbstractC4552D0.this.f16406m.m19498b();
            if (contains && !z6 && !c4448l0.m18961o() && m19494e != null && m19494e.intValue() > 0) {
                m19494e = 0;
            }
            return new v(contains && !z6, m19494e);
        }

        /* renamed from: g */
        public final x m19496g(C4448l0 c4448l0, C4424Z c4424z) {
            long j7 = 0;
            boolean z6 = false;
            if (AbstractC4552D0.this.f16399f == null) {
                return new x(false, 0L);
            }
            boolean contains = AbstractC4552D0.this.f16399f.f16508f.contains(c4448l0.m18959m());
            Integer m19494e = m19494e(c4424z);
            boolean z7 = (AbstractC4552D0.this.f16406m == null || (!contains && (m19494e == null || m19494e.intValue() >= 0))) ? false : !AbstractC4552D0.this.f16406m.m19498b();
            if (AbstractC4552D0.this.f16399f.f16503a > this.f16428a.f16444d + 1 && !z7) {
                if (m19494e == null) {
                    if (contains) {
                        j7 = (long) (AbstractC4552D0.this.f16417x * AbstractC4552D0.f16393D.nextDouble());
                        AbstractC4552D0.this.f16417x = Math.min((long) (r10.f16417x * AbstractC4552D0.this.f16399f.f16506d), AbstractC4552D0.this.f16399f.f16505c);
                        z6 = true;
                    }
                } else if (m19494e.intValue() >= 0) {
                    j7 = TimeUnit.MILLISECONDS.toNanos(m19494e.intValue());
                    AbstractC4552D0 abstractC4552D0 = AbstractC4552D0.this;
                    abstractC4552D0.f16417x = abstractC4552D0.f16399f.f16504b;
                    z6 = true;
                }
            }
            return new x(z6, j7);
        }
    }

    /* renamed from: i5.D0$C */
    public static final class C {

        /* renamed from: a */
        public InterfaceC4628r f16441a;

        /* renamed from: b */
        public boolean f16442b;

        /* renamed from: c */
        public boolean f16443c;

        /* renamed from: d */
        public final int f16444d;

        public C(int i7) {
            this.f16444d = i7;
        }
    }

    /* renamed from: i5.D0$D */
    public static final class D {

        /* renamed from: a */
        public final int f16445a;

        /* renamed from: b */
        public final int f16446b;

        /* renamed from: c */
        public final int f16447c;

        /* renamed from: d */
        public final AtomicInteger f16448d;

        public D(float f7, float f8) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f16448d = atomicInteger;
            this.f16447c = (int) (f8 * 1000.0f);
            int i7 = (int) (f7 * 1000.0f);
            this.f16445a = i7;
            this.f16446b = i7 / 2;
            atomicInteger.set(i7);
        }

        /* renamed from: a */
        public boolean m19497a() {
            return this.f16448d.get() > this.f16446b;
        }

        /* renamed from: b */
        public boolean m19498b() {
            int i7;
            int i8;
            do {
                i7 = this.f16448d.get();
                if (i7 == 0) {
                    return false;
                }
                i8 = i7 - 1000;
            } while (!this.f16448d.compareAndSet(i7, Math.max(i8, 0)));
            return i8 > this.f16446b;
        }

        /* renamed from: c */
        public void m19499c() {
            int i7;
            int i8;
            do {
                i7 = this.f16448d.get();
                i8 = this.f16445a;
                if (i7 == i8) {
                    return;
                }
            } while (!this.f16448d.compareAndSet(i7, Math.min(this.f16447c + i7, i8)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof D)) {
                return false;
            }
            D d7 = (D) obj;
            return this.f16445a == d7.f16445a && this.f16447c == d7.f16447c;
        }

        public int hashCode() {
            return AbstractC2928k.m10551b(Integer.valueOf(this.f16445a), Integer.valueOf(this.f16447c));
        }
    }

    /* renamed from: i5.D0$a, reason: case insensitive filesystem */
    public class C7254a implements Thread.UncaughtExceptionHandler {
        public C7254a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw C4448l0.m18954k(th).m18963q("Uncaught exception in the SynchronizationContext. Re-thrown.").m18956d();
        }
    }

    /* renamed from: i5.D0$b, reason: case insensitive filesystem */
    public class C7255b implements r {

        /* renamed from: a */
        public final /* synthetic */ String f16450a;

        public C7255b(String str) {
            this.f16450a = str;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19373k(this.f16450a);
        }
    }

    /* renamed from: i5.D0$c, reason: case insensitive filesystem */
    public class RunnableC7256c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Collection f16452a;

        /* renamed from: b */
        public final /* synthetic */ C f16453b;

        /* renamed from: c */
        public final /* synthetic */ Future f16454c;

        /* renamed from: d */
        public final /* synthetic */ Future f16455d;

        public RunnableC7256c(Collection collection, C c7, Future future, Future future2) {
            this.f16452a = collection;
            this.f16453b = c7;
            this.f16454c = future;
            this.f16455d = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C c7 : this.f16452a) {
                if (c7 != this.f16453b) {
                    c7.f16441a.mo19360a(AbstractC4552D0.f16392C);
                }
            }
            Future future = this.f16454c;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f16455d;
            if (future2 != null) {
                future2.cancel(false);
            }
            AbstractC4552D0.this.mo19480k0();
        }
    }

    /* renamed from: i5.D0$d, reason: case insensitive filesystem */
    public class C7257d implements r {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC4451n f16457a;

        public C7257d(InterfaceC4451n interfaceC4451n) {
            this.f16457a = interfaceC4451n;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19369e(this.f16457a);
        }
    }

    /* renamed from: i5.D0$e */
    public class e implements r {

        /* renamed from: a */
        public final /* synthetic */ C4462t f16459a;

        public e(C4462t c4462t) {
            this.f16459a = c4462t;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19375m(this.f16459a);
        }
    }

    /* renamed from: i5.D0$f */
    public class f implements r {

        /* renamed from: a */
        public final /* synthetic */ C4464v f16461a;

        public f(C4464v c4464v) {
            this.f16461a = c4464v;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19376n(this.f16461a);
        }
    }

    /* renamed from: i5.D0$g */
    public class g implements r {
        public g() {
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.flush();
        }
    }

    /* renamed from: i5.D0$h */
    public class h implements r {

        /* renamed from: a */
        public final /* synthetic */ boolean f16464a;

        public h(boolean z6) {
            this.f16464a = z6;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19379q(this.f16464a);
        }
    }

    /* renamed from: i5.D0$i */
    public class i implements r {
        public i() {
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19374l();
        }
    }

    /* renamed from: i5.D0$j */
    public class j implements r {

        /* renamed from: a */
        public final /* synthetic */ int f16467a;

        public j(int i7) {
            this.f16467a = i7;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19370g(this.f16467a);
        }
    }

    /* renamed from: i5.D0$k */
    public class k implements r {

        /* renamed from: a */
        public final /* synthetic */ int f16469a;

        public k(int i7) {
            this.f16469a = i7;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19371h(this.f16469a);
        }
    }

    /* renamed from: i5.D0$l */
    public class l implements r {
        public l() {
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19378p();
        }
    }

    /* renamed from: i5.D0$m */
    public class m implements r {

        /* renamed from: a */
        public final /* synthetic */ int f16472a;

        public m(int i7) {
            this.f16472a = i7;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19368d(this.f16472a);
        }
    }

    /* renamed from: i5.D0$n */
    public class n implements r {

        /* renamed from: a */
        public final /* synthetic */ Object f16474a;

        public n(Object obj) {
            this.f16474a = obj;
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19377o(AbstractC4552D0.this.f16394a.m18835j(this.f16474a));
            c7.f16441a.flush();
        }
    }

    /* renamed from: i5.D0$o */
    public class o extends AbstractC4445k.a {

        /* renamed from: a */
        public final /* synthetic */ AbstractC4445k f16476a;

        public o(AbstractC4445k abstractC4445k) {
            this.f16476a = abstractC4445k;
        }

        @Override // p237g5.AbstractC4445k.a
        /* renamed from: a */
        public AbstractC4445k mo18933a(AbstractC4445k.b bVar, C4424Z c4424z) {
            return this.f16476a;
        }
    }

    /* renamed from: i5.D0$p */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC4552D0.this.f16419z) {
                return;
            }
            AbstractC4552D0.this.f16414u.mo19389d();
        }
    }

    /* renamed from: i5.D0$q */
    public class q implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C4448l0 f16479a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC4630s.a f16480b;

        /* renamed from: c */
        public final /* synthetic */ C4424Z f16481c;

        public q(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            this.f16479a = c4448l0;
            this.f16480b = aVar;
            this.f16481c = c4424z;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4552D0.this.f16419z = true;
            AbstractC4552D0.this.f16414u.mo19387b(this.f16479a, this.f16480b, this.f16481c);
        }
    }

    /* renamed from: i5.D0$r */
    public interface r {
        /* renamed from: a */
        void mo19500a(C c7);
    }

    /* renamed from: i5.D0$s */
    public class s extends AbstractC4445k {

        /* renamed from: b */
        public final C f16483b;

        /* renamed from: c */
        public long f16484c;

        public s(C c7) {
            this.f16483b = c7;
        }

        @Override // p237g5.AbstractC4454o0
        /* renamed from: h */
        public void mo18987h(long j7) {
            if (AbstractC4552D0.this.f16408o.f16425f != null) {
                return;
            }
            synchronized (AbstractC4552D0.this.f16402i) {
                try {
                    if (AbstractC4552D0.this.f16408o.f16425f == null && !this.f16483b.f16442b) {
                        long j8 = this.f16484c + j7;
                        this.f16484c = j8;
                        if (j8 <= AbstractC4552D0.this.f16413t) {
                            return;
                        }
                        if (this.f16484c > AbstractC4552D0.this.f16404k) {
                            this.f16483b.f16443c = true;
                        } else {
                            long m19501a = AbstractC4552D0.this.f16403j.m19501a(this.f16484c - AbstractC4552D0.this.f16413t);
                            AbstractC4552D0.this.f16413t = this.f16484c;
                            if (m19501a > AbstractC4552D0.this.f16405l) {
                                this.f16483b.f16443c = true;
                            }
                        }
                        C c7 = this.f16483b;
                        Runnable m19472c0 = c7.f16443c ? AbstractC4552D0.this.m19472c0(c7) : null;
                        if (m19472c0 != null) {
                            m19472c0.run();
                        }
                    }
                } finally {
                }
            }
        }
    }

    /* renamed from: i5.D0$t */
    public static final class t {

        /* renamed from: a */
        public final AtomicLong f16486a = new AtomicLong();

        /* renamed from: a */
        public long m19501a(long j7) {
            return this.f16486a.addAndGet(j7);
        }
    }

    /* renamed from: i5.D0$u */
    public static final class u {

        /* renamed from: a */
        public final Object f16487a;

        /* renamed from: b */
        public Future f16488b;

        /* renamed from: c */
        public boolean f16489c;

        public u(Object obj) {
            this.f16487a = obj;
        }

        /* renamed from: a */
        public boolean m19502a() {
            return this.f16489c;
        }

        /* renamed from: b */
        public Future m19503b() {
            this.f16489c = true;
            return this.f16488b;
        }

        /* renamed from: c */
        public void m19504c(Future future) {
            synchronized (this.f16487a) {
                try {
                    if (!this.f16489c) {
                        this.f16488b = future;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: i5.D0$v */
    public static final class v {

        /* renamed from: a */
        public final boolean f16490a;

        /* renamed from: b */
        public final Integer f16491b;

        public v(boolean z6, Integer num) {
            this.f16490a = z6;
            this.f16491b = num;
        }
    }

    /* renamed from: i5.D0$w */
    public final class w implements Runnable {

        /* renamed from: a */
        public final u f16492a;

        /* renamed from: i5.D0$w$a */
        public class a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C f16494a;

            public a(C c7) {
                this.f16494a = c7;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                boolean z6;
                synchronized (AbstractC4552D0.this.f16402i) {
                    try {
                        uVar = null;
                        if (w.this.f16492a.m19502a()) {
                            z6 = true;
                        } else {
                            AbstractC4552D0 abstractC4552D0 = AbstractC4552D0.this;
                            abstractC4552D0.f16408o = abstractC4552D0.f16408o.m19486a(this.f16494a);
                            AbstractC4552D0 abstractC4552D02 = AbstractC4552D0.this;
                            if (!abstractC4552D02.m19478i0(abstractC4552D02.f16408o) || (AbstractC4552D0.this.f16406m != null && !AbstractC4552D0.this.f16406m.m19497a())) {
                                AbstractC4552D0 abstractC4552D03 = AbstractC4552D0.this;
                                abstractC4552D03.f16408o = abstractC4552D03.f16408o.m19489d();
                                AbstractC4552D0.this.f16416w = null;
                                z6 = false;
                            }
                            AbstractC4552D0 abstractC4552D04 = AbstractC4552D0.this;
                            uVar = new u(abstractC4552D04.f16402i);
                            abstractC4552D04.f16416w = uVar;
                            z6 = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    this.f16494a.f16441a.mo19372i(AbstractC4552D0.this.new B(this.f16494a));
                    this.f16494a.f16441a.mo19360a(C4448l0.f15796f.m18963q("Unneeded hedging"));
                } else {
                    if (uVar != null) {
                        uVar.m19504c(AbstractC4552D0.this.f16397d.schedule(AbstractC4552D0.this.new w(uVar), AbstractC4552D0.this.f16400g.f16644b, TimeUnit.NANOSECONDS));
                    }
                    AbstractC4552D0.this.m19476g0(this.f16494a);
                }
            }
        }

        public w(u uVar) {
            this.f16492a = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4552D0 abstractC4552D0 = AbstractC4552D0.this;
            C m19474e0 = abstractC4552D0.m19474e0(abstractC4552D0.f16408o.f16424e, false);
            if (m19474e0 == null) {
                return;
            }
            AbstractC4552D0.this.f16395b.execute(new a(m19474e0));
        }
    }

    /* renamed from: i5.D0$x */
    public static final class x {

        /* renamed from: a */
        public final boolean f16496a;

        /* renamed from: b */
        public final long f16497b;

        public x(boolean z6, long j7) {
            this.f16496a = z6;
            this.f16497b = j7;
        }
    }

    /* renamed from: i5.D0$y */
    public static final class y {

        /* renamed from: a */
        public final C4448l0 f16498a;

        /* renamed from: b */
        public final InterfaceC4630s.a f16499b;

        /* renamed from: c */
        public final C4424Z f16500c;

        public y(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
            this.f16498a = c4448l0;
            this.f16499b = aVar;
            this.f16500c = c4424z;
        }
    }

    /* renamed from: i5.D0$z */
    public class z implements r {
        public z() {
        }

        @Override // p253i5.AbstractC4552D0.r
        /* renamed from: a */
        public void mo19500a(C c7) {
            c7.f16441a.mo19372i(AbstractC4552D0.this.new B(c7));
        }
    }

    static {
        C4424Z.d dVar = C4424Z.f15677e;
        f16390A = C4424Z.g.m18802e("grpc-previous-rpc-attempts", dVar);
        f16391B = C4424Z.g.m18802e("grpc-retry-pushback-ms", dVar);
        f16392C = C4448l0.f15796f.m18963q("Stream thrown away because RetriableStream committed");
        f16393D = new Random();
    }

    public AbstractC4552D0(C4426a0 c4426a0, C4424Z c4424z, t tVar, long j7, long j8, Executor executor, ScheduledExecutorService scheduledExecutorService, C4554E0 c4554e0, C4584U c4584u, D d7) {
        this.f16394a = c4426a0;
        this.f16403j = tVar;
        this.f16404k = j7;
        this.f16405l = j8;
        this.f16395b = executor;
        this.f16397d = scheduledExecutorService;
        this.f16398e = c4424z;
        this.f16399f = c4554e0;
        if (c4554e0 != null) {
            this.f16417x = c4554e0.f16504b;
        }
        this.f16400g = c4584u;
        AbstractC2932o.m10562e(c4554e0 == null || c4584u == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f16401h = c4584u != null;
        this.f16406m = d7;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: a */
    public final void mo19360a(C4448l0 c4448l0) {
        C c7;
        C c8 = new C(0);
        c8.f16441a = new C4625p0();
        Runnable m19472c0 = m19472c0(c8);
        if (m19472c0 != null) {
            synchronized (this.f16402i) {
                this.f16408o = this.f16408o.m19493h(c8);
            }
            m19472c0.run();
            m19483n0(c4448l0, InterfaceC4630s.a.PROCESSED, new C4424Z());
            return;
        }
        synchronized (this.f16402i) {
            try {
                if (this.f16408o.f16422c.contains(this.f16408o.f16425f)) {
                    c7 = this.f16408o.f16425f;
                } else {
                    this.f16418y = c4448l0;
                    c7 = null;
                }
                this.f16408o = this.f16408o.m19487b();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c7 != null) {
            c7.f16441a.mo19360a(c4448l0);
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: b */
    public final boolean mo19367b() {
        Iterator it = this.f16408o.f16422c.iterator();
        while (it.hasNext()) {
            if (((C) it.next()).f16441a.mo19367b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c0 */
    public final Runnable m19472c0(C c7) {
        Future future;
        Future future2;
        synchronized (this.f16402i) {
            try {
                if (this.f16408o.f16425f != null) {
                    return null;
                }
                Collection collection = this.f16408o.f16422c;
                this.f16408o = this.f16408o.m19488c(c7);
                this.f16403j.m19501a(-this.f16413t);
                u uVar = this.f16415v;
                if (uVar != null) {
                    Future m19503b = uVar.m19503b();
                    this.f16415v = null;
                    future = m19503b;
                } else {
                    future = null;
                }
                u uVar2 = this.f16416w;
                if (uVar2 != null) {
                    Future m19503b2 = uVar2.m19503b();
                    this.f16416w = null;
                    future2 = m19503b2;
                } else {
                    future2 = null;
                }
                return new RunnableC7256c(collection, c7, future, future2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: d */
    public final void mo19368d(int i7) {
        A a7 = this.f16408o;
        if (a7.f16420a) {
            a7.f16425f.f16441a.mo19368d(i7);
        } else {
            m19475f0(new m(i7));
        }
    }

    /* renamed from: d0 */
    public final void m19473d0(C c7) {
        Runnable m19472c0 = m19472c0(c7);
        if (m19472c0 != null) {
            this.f16395b.execute(m19472c0);
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: e */
    public final void mo19369e(InterfaceC4451n interfaceC4451n) {
        m19475f0(new C7257d(interfaceC4451n));
    }

    /* renamed from: e0 */
    public final C m19474e0(int i7, boolean z6) {
        int i8;
        do {
            i8 = this.f16411r.get();
            if (i8 < 0) {
                return null;
            }
        } while (!this.f16411r.compareAndSet(i8, i8 + 1));
        C c7 = new C(i7);
        c7.f16441a = mo19479j0(m19485p0(this.f16398e, i7), new o(new s(c7)), i7, z6);
        return c7;
    }

    /* renamed from: f0 */
    public final void m19475f0(r rVar) {
        Collection collection;
        synchronized (this.f16402i) {
            try {
                if (!this.f16408o.f16420a) {
                    this.f16408o.f16421b.add(rVar);
                }
                collection = this.f16408o.f16422c;
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rVar.mo19500a((C) it.next());
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    public final void flush() {
        A a7 = this.f16408o;
        if (a7.f16420a) {
            a7.f16425f.f16441a.flush();
        } else {
            m19475f0(new g());
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: g */
    public final void mo19370g(int i7) {
        m19475f0(new j(i7));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r8.f16396c.execute(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r2 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r9.f16441a.mo19372i(new p253i5.AbstractC4552D0.B(r8, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
    
        r0 = r9.f16441a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r8.f16408o.f16425f != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        r9 = r8.f16418y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r0.mo19360a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        r9 = p253i5.AbstractC4552D0.f16392C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
    
        r0 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r0.hasNext() == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        r4 = (p253i5.AbstractC4552D0.r) r0.next();
        r4.mo19500a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        if ((r4 instanceof p253i5.AbstractC4552D0.z) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a0, code lost:
    
        r4 = r8.f16408o;
        r5 = r4.f16425f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        if (r5 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a6, code lost:
    
        if (r5 == r9) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r4.f16426g == false) goto L67;
     */
    /* renamed from: g0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19476g0(p253i5.AbstractC4552D0.C r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r2 = r0
            r3 = r1
        L4:
            java.lang.Object r4 = r8.f16402i
            monitor-enter(r4)
            i5.D0$A r5 = r8.f16408o     // Catch: java.lang.Throwable -> L11
            i5.D0$C r6 = r5.f16425f     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L14
            if (r6 == r9) goto L14
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L11:
            r9 = move-exception
            goto Lb0
        L14:
            boolean r6 = r5.f16426g     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L1a
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            goto L36
        L1a:
            java.util.List r6 = r5.f16421b     // Catch: java.lang.Throwable -> L11
            int r6 = r6.size()     // Catch: java.lang.Throwable -> L11
            if (r0 != r6) goto L5b
            i5.D0$A r0 = r5.m19493h(r9)     // Catch: java.lang.Throwable -> L11
            r8.f16408o = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r8.mo19367b()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L30
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L30:
            i5.D0$p r1 = new i5.D0$p     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
        L36:
            if (r1 == 0) goto L3e
            java.util.concurrent.Executor r9 = r8.f16396c
            r9.execute(r1)
            return
        L3e:
            if (r2 != 0) goto L4a
            i5.r r0 = r9.f16441a
            i5.D0$B r1 = new i5.D0$B
            r1.<init>(r9)
            r0.mo19372i(r1)
        L4a:
            i5.r r0 = r9.f16441a
            i5.D0$A r1 = r8.f16408o
            i5.D0$C r1 = r1.f16425f
            if (r1 != r9) goto L55
            g5.l0 r9 = r8.f16418y
            goto L57
        L55:
            g5.l0 r9 = p253i5.AbstractC4552D0.f16392C
        L57:
            r0.mo19360a(r9)
            return
        L5b:
            boolean r6 = r9.f16442b     // Catch: java.lang.Throwable -> L11
            if (r6 == 0) goto L61
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            return
        L61:
            int r6 = r0 + 128
            java.util.List r7 = r5.f16421b     // Catch: java.lang.Throwable -> L11
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L11
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> L11
            if (r3 != 0) goto L7b
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f16421b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L11
            goto L87
        L7b:
            r3.clear()     // Catch: java.lang.Throwable -> L11
            java.util.List r5 = r5.f16421b     // Catch: java.lang.Throwable -> L11
            java.util.List r0 = r5.subList(r0, r6)     // Catch: java.lang.Throwable -> L11
            r3.addAll(r0)     // Catch: java.lang.Throwable -> L11
        L87:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            java.util.Iterator r0 = r3.iterator()
        L8c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lad
            java.lang.Object r4 = r0.next()
            i5.D0$r r4 = (p253i5.AbstractC4552D0.r) r4
            r4.mo19500a(r9)
            boolean r4 = r4 instanceof p253i5.AbstractC4552D0.z
            if (r4 == 0) goto La0
            r2 = 1
        La0:
            i5.D0$A r4 = r8.f16408o
            i5.D0$C r5 = r4.f16425f
            if (r5 == 0) goto La9
            if (r5 == r9) goto La9
            goto Lad
        La9:
            boolean r4 = r4.f16426g
            if (r4 == 0) goto L8c
        Lad:
            r0 = r6
            goto L4
        Lb0:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p253i5.AbstractC4552D0.m19476g0(i5.D0$C):void");
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: h */
    public final void mo19371h(int i7) {
        m19475f0(new k(i7));
    }

    /* renamed from: h0 */
    public final void m19477h0() {
        Future future;
        synchronized (this.f16402i) {
            try {
                u uVar = this.f16416w;
                future = null;
                if (uVar != null) {
                    Future m19503b = uVar.m19503b();
                    this.f16416w = null;
                    future = m19503b;
                }
                this.f16408o = this.f16408o.m19489d();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: i */
    public final void mo19372i(InterfaceC4630s interfaceC4630s) {
        u uVar;
        D d7;
        this.f16414u = interfaceC4630s;
        C4448l0 mo19481l0 = mo19481l0();
        if (mo19481l0 != null) {
            mo19360a(mo19481l0);
            return;
        }
        synchronized (this.f16402i) {
            this.f16408o.f16421b.add(new z());
        }
        C m19474e0 = m19474e0(0, false);
        if (m19474e0 == null) {
            return;
        }
        if (this.f16401h) {
            synchronized (this.f16402i) {
                try {
                    this.f16408o = this.f16408o.m19486a(m19474e0);
                    if (!m19478i0(this.f16408o) || ((d7 = this.f16406m) != null && !d7.m19497a())) {
                        uVar = null;
                    }
                    uVar = new u(this.f16402i);
                    this.f16416w = uVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (uVar != null) {
                uVar.m19504c(this.f16397d.schedule(new w(uVar), this.f16400g.f16644b, TimeUnit.NANOSECONDS));
            }
        }
        m19476g0(m19474e0);
    }

    /* renamed from: i0 */
    public final boolean m19478i0(A a7) {
        return a7.f16425f == null && a7.f16424e < this.f16400g.f16643a && !a7.f16427h;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: j */
    public void mo19361j(C4592Y c4592y) {
        A a7;
        synchronized (this.f16402i) {
            c4592y.m19704b("closed", this.f16407n);
            a7 = this.f16408o;
        }
        if (a7.f16425f != null) {
            C4592Y c4592y2 = new C4592Y();
            a7.f16425f.f16441a.mo19361j(c4592y2);
            c4592y.m19704b("committed", c4592y2);
            return;
        }
        C4592Y c4592y3 = new C4592Y();
        for (C c7 : a7.f16422c) {
            C4592Y c4592y4 = new C4592Y();
            c7.f16441a.mo19361j(c4592y4);
            c4592y3.m19703a(c4592y4);
        }
        c4592y.m19704b("open", c4592y3);
    }

    /* renamed from: j0 */
    public abstract InterfaceC4628r mo19479j0(C4424Z c4424z, AbstractC4445k.a aVar, int i7, boolean z6);

    @Override // p253i5.InterfaceC4628r
    /* renamed from: k */
    public final void mo19373k(String str) {
        m19475f0(new C7255b(str));
    }

    /* renamed from: k0 */
    public abstract void mo19480k0();

    @Override // p253i5.InterfaceC4628r
    /* renamed from: l */
    public final void mo19374l() {
        m19475f0(new i());
    }

    /* renamed from: l0 */
    public abstract C4448l0 mo19481l0();

    @Override // p253i5.InterfaceC4628r
    /* renamed from: m */
    public final void mo19375m(C4462t c4462t) {
        m19475f0(new e(c4462t));
    }

    /* renamed from: m0 */
    public final void m19482m0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            m19477h0();
            return;
        }
        synchronized (this.f16402i) {
            try {
                u uVar = this.f16416w;
                if (uVar == null) {
                    return;
                }
                Future m19503b = uVar.m19503b();
                u uVar2 = new u(this.f16402i);
                this.f16416w = uVar2;
                if (m19503b != null) {
                    m19503b.cancel(false);
                }
                uVar2.m19504c(this.f16397d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: n */
    public final void mo19376n(C4464v c4464v) {
        m19475f0(new f(c4464v));
    }

    /* renamed from: n0 */
    public final void m19483n0(C4448l0 c4448l0, InterfaceC4630s.a aVar, C4424Z c4424z) {
        this.f16412s = new y(c4448l0, aVar, c4424z);
        if (this.f16411r.addAndGet(Integer.MIN_VALUE) == Integer.MIN_VALUE) {
            this.f16396c.execute(new q(c4448l0, aVar, c4424z));
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: o */
    public final void mo19377o(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    /* renamed from: o0 */
    public final void m19484o0(Object obj) {
        A a7 = this.f16408o;
        if (a7.f16420a) {
            a7.f16425f.f16441a.mo19377o(this.f16394a.m18835j(obj));
        } else {
            m19475f0(new n(obj));
        }
    }

    @Override // p253i5.InterfaceC4578Q0
    /* renamed from: p */
    public void mo19378p() {
        m19475f0(new l());
    }

    /* renamed from: p0 */
    public final C4424Z m19485p0(C4424Z c4424z, int i7) {
        C4424Z c4424z2 = new C4424Z();
        c4424z2.m18785m(c4424z);
        if (i7 > 0) {
            c4424z2.m18788p(f16390A, String.valueOf(i7));
        }
        return c4424z2;
    }

    @Override // p253i5.InterfaceC4628r
    /* renamed from: q */
    public final void mo19379q(boolean z6) {
        m19475f0(new h(z6));
    }
}
