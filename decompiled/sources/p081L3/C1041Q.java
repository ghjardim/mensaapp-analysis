package p081L3;

import android.util.SparseArray;
import java.util.Comparator;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
import p081L3.C1041Q;
import p116Q3.AbstractC2155x;
import p116Q3.C2138g;
import p116Q3.InterfaceC2145n;

/* renamed from: L3.Q */
/* loaded from: classes.dex */
public class C1041Q {

    /* renamed from: c */
    public static final long f3441c;

    /* renamed from: d */
    public static final long f3442d;

    /* renamed from: a */
    public final InterfaceC1030M f3443a;

    /* renamed from: b */
    public final b f3444b;

    /* renamed from: L3.Q$a */
    public class a implements InterfaceC1032M1 {

        /* renamed from: a */
        public final C2138g f3445a;

        /* renamed from: b */
        public final C1024K f3446b;

        /* renamed from: c */
        public boolean f3447c = false;

        /* renamed from: d */
        public C2138g.b f3448d;

        public a(C2138g c2138g, C1024K c1024k) {
            this.f3445a = c2138g;
            this.f3446b = c1024k;
        }

        /* renamed from: b */
        public final /* synthetic */ void m4138b() {
            this.f3446b.m4047z(C1041Q.this);
            this.f3447c = true;
            m4139c();
        }

        /* renamed from: c */
        public final void m4139c() {
            this.f3448d = this.f3445a.m7233k(C2138g.d.GARBAGE_COLLECTION, this.f3447c ? C1041Q.f3442d : C1041Q.f3441c, new Runnable() { // from class: L3.P
                @Override // java.lang.Runnable
                public final void run() {
                    C1041Q.a.this.m4138b();
                }
            });
        }

        @Override // p081L3.InterfaceC1032M1
        public void start() {
            if (C1041Q.this.f3444b.f3450a != -1) {
                m4139c();
            }
        }

        @Override // p081L3.InterfaceC1032M1
        public void stop() {
            C2138g.b bVar = this.f3448d;
            if (bVar != null) {
                bVar.m7245c();
            }
        }
    }

    /* renamed from: L3.Q$b */
    public static class b {

        /* renamed from: a */
        public long f3450a;

        /* renamed from: b */
        public int f3451b;

        /* renamed from: c */
        public final int f3452c;

        public b(long j7, int i7, int i8) {
            this.f3450a = j7;
            this.f3451b = i7;
            this.f3452c = i8;
        }

        /* renamed from: a */
        public static b m4140a(long j7) {
            return new b(j7, 10, PipesIterator.DEFAULT_QUEUE_SIZE);
        }
    }

    /* renamed from: L3.Q$c */
    public static class c {

        /* renamed from: a */
        public final boolean f3453a;

        /* renamed from: b */
        public final int f3454b;

        /* renamed from: c */
        public final int f3455c;

        /* renamed from: d */
        public final int f3456d;

        public c(boolean z6, int i7, int i8, int i9) {
            this.f3453a = z6;
            this.f3454b = i7;
            this.f3455c = i8;
            this.f3456d = i9;
        }

        /* renamed from: a */
        public static c m4141a() {
            return new c(false, 0, 0, 0);
        }
    }

    /* renamed from: L3.Q$d */
    public static class d {

        /* renamed from: c */
        public static final Comparator f3457c = new Comparator() { // from class: L3.S
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m4143d;
                m4143d = C1041Q.d.m4143d((Long) obj, (Long) obj2);
                return m4143d;
            }
        };

        /* renamed from: a */
        public final PriorityQueue f3458a;

        /* renamed from: b */
        public final int f3459b;

        public d(int i7) {
            this.f3459b = i7;
            this.f3458a = new PriorityQueue(i7, f3457c);
        }

        /* renamed from: d */
        public static /* synthetic */ int m4143d(Long l7, Long l8) {
            return l8.compareTo(l7);
        }

        /* renamed from: b */
        public void m4144b(Long l7) {
            if (this.f3458a.size() < this.f3459b) {
                this.f3458a.add(l7);
                return;
            }
            if (l7.longValue() < ((Long) this.f3458a.peek()).longValue()) {
                this.f3458a.poll();
                this.f3458a.add(l7);
            }
        }

        /* renamed from: c */
        public long m4145c() {
            return ((Long) this.f3458a.peek()).longValue();
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        f3441c = timeUnit.toMillis(1L);
        f3442d = timeUnit.toMillis(5L);
    }

    public C1041Q(InterfaceC1030M interfaceC1030M, b bVar) {
        this.f3443a = interfaceC1030M;
        this.f3444b = bVar;
    }

    /* renamed from: i */
    public static /* synthetic */ void m4128i(d dVar, C1038O1 c1038o1) {
        dVar.m4144b(Long.valueOf(c1038o1.m4116e()));
    }

    /* renamed from: e */
    public int m4129e(int i7) {
        return (int) ((i7 / 100.0f) * this.f3443a.mo4087g());
    }

    /* renamed from: f */
    public c m4130f(SparseArray sparseArray) {
        if (this.f3444b.f3450a == -1) {
            AbstractC2155x.m7309a("LruGarbageCollector", "Garbage collection skipped; disabled", new Object[0]);
            return c.m4141a();
        }
        long m4131g = m4131g();
        if (m4131g >= this.f3444b.f3450a) {
            return m4136m(sparseArray);
        }
        AbstractC2155x.m7309a("LruGarbageCollector", "Garbage collection skipped; Cache size " + m4131g + " is lower than threshold " + this.f3444b.f3450a, new Object[0]);
        return c.m4141a();
    }

    /* renamed from: g */
    public long m4131g() {
        return this.f3443a.mo4089l();
    }

    /* renamed from: h */
    public long m4132h(int i7) {
        if (i7 == 0) {
            return -1L;
        }
        final d dVar = new d(i7);
        this.f3443a.mo4091p(new InterfaceC2145n() { // from class: L3.N
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1041Q.m4128i(C1041Q.d.this, (C1038O1) obj);
            }
        });
        this.f3443a.mo4090m(new InterfaceC2145n() { // from class: L3.O
            @Override // p116Q3.InterfaceC2145n
            public final void accept(Object obj) {
                C1041Q.d.this.m4144b((Long) obj);
            }
        });
        return dVar.m4145c();
    }

    /* renamed from: j */
    public a m4133j(C2138g c2138g, C1024K c1024k) {
        return new a(c2138g, c1024k);
    }

    /* renamed from: k */
    public int m4134k(long j7) {
        return this.f3443a.mo4088h(j7);
    }

    /* renamed from: l */
    public int m4135l(long j7, SparseArray sparseArray) {
        return this.f3443a.mo4085a(j7, sparseArray);
    }

    /* renamed from: m */
    public final c m4136m(SparseArray sparseArray) {
        boolean z6;
        long currentTimeMillis = System.currentTimeMillis();
        int m4129e = m4129e(this.f3444b.f3451b);
        if (m4129e > this.f3444b.f3452c) {
            AbstractC2155x.m7309a("LruGarbageCollector", "Capping sequence numbers to collect down to the maximum of " + this.f3444b.f3452c + " from " + m4129e, new Object[0]);
            m4129e = this.f3444b.f3452c;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        long m4132h = m4132h(m4129e);
        long currentTimeMillis3 = System.currentTimeMillis();
        int m4135l = m4135l(m4132h, sparseArray);
        long currentTimeMillis4 = System.currentTimeMillis();
        int m4134k = m4134k(m4132h);
        long currentTimeMillis5 = System.currentTimeMillis();
        if (AbstractC2155x.m7311c()) {
            StringBuilder sb = new StringBuilder();
            sb.append("LRU Garbage Collection:\n\tCounted targets in " + (currentTimeMillis2 - currentTimeMillis) + "ms\n");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "\tDetermined least recently used %d sequence numbers in %dms\n", Integer.valueOf(m4129e), Long.valueOf(currentTimeMillis3 - currentTimeMillis2)));
            String str = sb.toString() + String.format(locale, "\tRemoved %d targets in %dms\n", Integer.valueOf(m4135l), Long.valueOf(currentTimeMillis4 - currentTimeMillis3));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            z6 = true;
            sb2.append(String.format(locale, "\tRemoved %d documents in %dms\n", Integer.valueOf(m4134k), Long.valueOf(currentTimeMillis5 - currentTimeMillis4)));
            AbstractC2155x.m7309a("LruGarbageCollector", sb2.toString() + String.format(locale, "Total Duration: %dms", Long.valueOf(currentTimeMillis5 - currentTimeMillis)), new Object[0]);
        } else {
            z6 = true;
        }
        return new c(z6, m4129e, m4135l, m4134k);
    }
}
