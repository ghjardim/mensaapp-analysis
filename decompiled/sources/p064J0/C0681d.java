package p064J0;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p064J0.C0681d;
import p064J0.C0697t;
import p064J0.InterfaceC0676F;
import p171Y2.AbstractC2940w;
import p171Y2.InterfaceC2939v;
import p178Z2.AbstractC3033v;
import p207d.AbstractC4094d;
import p232g0.C4307M;
import p232g0.C4310P;
import p232g0.C4318h;
import p232g0.C4327q;
import p232g0.C4328r;
import p232g0.InterfaceC4300F;
import p232g0.InterfaceC4308N;
import p232g0.InterfaceC4309O;
import p232g0.InterfaceC4321k;
import p232g0.InterfaceC4324n;
import p256j$.util.Objects;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.C5318A;
import p259j0.InterfaceC5334c;
import p259j0.InterfaceC5342k;
import p292n0.C5759u;

/* renamed from: J0.d */
/* loaded from: classes.dex */
public final class C0681d implements InterfaceC0677G, InterfaceC4309O {

    /* renamed from: n */
    public static final Executor f2289n = new Executor() { // from class: J0.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C0681d.m2749D(runnable);
        }
    };

    /* renamed from: a */
    public final Context f2290a;

    /* renamed from: b */
    public final h f2291b;

    /* renamed from: c */
    public final C0694q f2292c;

    /* renamed from: d */
    public final C0697t f2293d;

    /* renamed from: e */
    public final InterfaceC4300F.a f2294e;

    /* renamed from: f */
    public final InterfaceC5334c f2295f;

    /* renamed from: g */
    public final CopyOnWriteArraySet f2296g;

    /* renamed from: h */
    public C4327q f2297h;

    /* renamed from: i */
    public InterfaceC0693p f2298i;

    /* renamed from: j */
    public InterfaceC5342k f2299j;

    /* renamed from: k */
    public Pair f2300k;

    /* renamed from: l */
    public int f2301l;

    /* renamed from: m */
    public int f2302m;

    /* renamed from: J0.d$b */
    public static final class b {

        /* renamed from: a */
        public final Context f2303a;

        /* renamed from: b */
        public final C0694q f2304b;

        /* renamed from: c */
        public InterfaceC4308N.a f2305c;

        /* renamed from: d */
        public InterfaceC4300F.a f2306d;

        /* renamed from: e */
        public InterfaceC5334c f2307e = InterfaceC5334c.f18817a;

        /* renamed from: f */
        public boolean f2308f;

        public b(Context context, C0694q c0694q) {
            this.f2303a = context.getApplicationContext();
            this.f2304b = c0694q;
        }

        /* renamed from: e */
        public C0681d m2787e() {
            AbstractC5332a.m21802g(!this.f2308f);
            if (this.f2306d == null) {
                if (this.f2305c == null) {
                    this.f2305c = new e();
                }
                this.f2306d = new f(this.f2305c);
            }
            C0681d c0681d = new C0681d(this);
            this.f2308f = true;
            return c0681d;
        }

        /* renamed from: f */
        public b m2788f(InterfaceC5334c interfaceC5334c) {
            this.f2307e = interfaceC5334c;
            return this;
        }
    }

    /* renamed from: J0.d$c */
    public final class c implements C0697t.a {
        public c() {
        }

        @Override // p064J0.C0697t.a
        /* renamed from: a */
        public void mo2789a(C4310P c4310p) {
            C0681d.this.f2297h = new C4327q.b().m18271v0(c4310p.f14972a).m18248Y(c4310p.f14973b).m18264o0("video/raw").m18234K();
            Iterator it = C0681d.this.f2296g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).mo2794x(C0681d.this, c4310p);
            }
        }

        @Override // p064J0.C0697t.a
        /* renamed from: b */
        public void mo2790b(long j7, long j8, long j9, boolean z6) {
            if (z6 && C0681d.this.f2300k != null) {
                Iterator it = C0681d.this.f2296g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).mo2793e(C0681d.this);
                }
            }
            if (C0681d.this.f2298i != null) {
                C0681d.this.f2298i.mo2919i(j8, C0681d.this.f2295f.mo21614c(), C0681d.this.f2297h == null ? new C4327q.b().m18234K() : C0681d.this.f2297h, null);
            }
            C0681d.m2764q(C0681d.this);
            AbstractC4094d.m17162a(AbstractC5332a.m21804i(null));
            throw null;
        }

        @Override // p064J0.C0697t.a
        /* renamed from: c */
        public void mo2791c() {
            Iterator it = C0681d.this.f2296g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).mo2792a(C0681d.this);
            }
            C0681d.m2764q(C0681d.this);
            AbstractC4094d.m17162a(AbstractC5332a.m21804i(null));
            throw null;
        }
    }

    /* renamed from: J0.d$d */
    public interface d {
        /* renamed from: a */
        void mo2792a(C0681d c0681d);

        /* renamed from: e */
        void mo2793e(C0681d c0681d);

        /* renamed from: x */
        void mo2794x(C0681d c0681d, C4310P c4310p);
    }

    /* renamed from: J0.d$e */
    public static final class e implements InterfaceC4308N.a {

        /* renamed from: a */
        public static final InterfaceC2939v f2310a = AbstractC2940w.m10611a(new InterfaceC2939v() { // from class: J0.e
            @Override // p171Y2.InterfaceC2939v
            public final Object get() {
                InterfaceC4308N.a m2796b;
                m2796b = C0681d.e.m2796b();
                return m2796b;
            }
        });

        public e() {
        }

        /* renamed from: b */
        public static /* synthetic */ InterfaceC4308N.a m2796b() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                return (InterfaceC4308N.a) AbstractC5332a.m21800e(cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null));
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }
    }

    /* renamed from: J0.d$f */
    public static final class f implements InterfaceC4300F.a {

        /* renamed from: a */
        public final InterfaceC4308N.a f2311a;

        public f(InterfaceC4308N.a aVar) {
            this.f2311a = aVar;
        }

        @Override // p232g0.InterfaceC4300F.a
        /* renamed from: a */
        public InterfaceC4300F mo2797a(Context context, C4318h c4318h, InterfaceC4321k interfaceC4321k, InterfaceC4309O interfaceC4309O, Executor executor, List list, long j7) {
            try {
            } catch (Exception e7) {
                e = e7;
            }
            try {
                ((InterfaceC4300F.a) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC4308N.a.class).newInstance(this.f2311a)).mo2797a(context, c4318h, interfaceC4321k, interfaceC4309O, executor, list, j7);
                return null;
            } catch (Exception e8) {
                e = e8;
                throw C4307M.m18107a(e);
            }
        }
    }

    /* renamed from: J0.d$g */
    public static final class g {

        /* renamed from: a */
        public static Constructor f2312a;

        /* renamed from: b */
        public static Method f2313b;

        /* renamed from: c */
        public static Method f2314c;

        /* renamed from: a */
        public static InterfaceC4324n m2798a(float f7) {
            try {
                m2799b();
                Object newInstance = f2312a.newInstance(null);
                f2313b.invoke(newInstance, Float.valueOf(f7));
                AbstractC4094d.m17162a(AbstractC5332a.m21800e(f2314c.invoke(newInstance, null)));
                return null;
            } catch (Exception e7) {
                throw new IllegalStateException(e7);
            }
        }

        /* renamed from: b */
        public static void m2799b() {
            if (f2312a == null || f2313b == null || f2314c == null) {
                Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                f2312a = cls.getConstructor(null);
                f2313b = cls.getMethod("setRotationDegrees", Float.TYPE);
                f2314c = cls.getMethod("build", null);
            }
        }
    }

    /* renamed from: J0.d$h */
    public final class h implements InterfaceC0676F, d {

        /* renamed from: a */
        public final Context f2315a;

        /* renamed from: b */
        public final int f2316b;

        /* renamed from: d */
        public C4327q f2318d;

        /* renamed from: e */
        public int f2319e;

        /* renamed from: f */
        public long f2320f;

        /* renamed from: g */
        public long f2321g;

        /* renamed from: h */
        public boolean f2322h;

        /* renamed from: k */
        public boolean f2325k;

        /* renamed from: l */
        public long f2326l;

        /* renamed from: c */
        public final ArrayList f2317c = new ArrayList();

        /* renamed from: i */
        public long f2323i = -9223372036854775807L;

        /* renamed from: j */
        public long f2324j = -9223372036854775807L;

        /* renamed from: m */
        public InterfaceC0676F.a f2327m = InterfaceC0676F.a.f2285a;

        /* renamed from: n */
        public Executor f2328n = C0681d.f2289n;

        public h(Context context) {
            this.f2315a = context;
            this.f2316b = AbstractC5330M.m21733d0(context);
        }

        /* renamed from: C */
        public final /* synthetic */ void m2803C(InterfaceC0676F.a aVar) {
            aVar.mo2746c(this);
        }

        /* renamed from: D */
        public final /* synthetic */ void m2804D(InterfaceC0676F.a aVar) {
            aVar.mo2745b((InterfaceC0676F) AbstractC5332a.m21804i(this));
        }

        /* renamed from: E */
        public final /* synthetic */ void m2805E(InterfaceC0676F.a aVar, C4310P c4310p) {
            aVar.mo2744a(this, c4310p);
        }

        /* renamed from: F */
        public final void m2806F() {
            if (this.f2318d == null) {
                return;
            }
            new ArrayList().addAll(this.f2317c);
            C4327q c4327q = (C4327q) AbstractC5332a.m21800e(this.f2318d);
            AbstractC4094d.m17162a(AbstractC5332a.m21804i(null));
            new C4328r.b(C0681d.m2768y(c4327q.f15113A), c4327q.f15144t, c4327q.f15145u).m18273b(c4327q.f15148x).m18272a();
            throw null;
        }

        /* renamed from: G */
        public void m2807G(List list) {
            this.f2317c.clear();
            this.f2317c.addAll(list);
        }

        @Override // p064J0.C0681d.d
        /* renamed from: a */
        public void mo2792a(C0681d c0681d) {
            final InterfaceC0676F.a aVar = this.f2327m;
            this.f2328n.execute(new Runnable() { // from class: J0.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0681d.h.this.m2804D(aVar);
                }
            });
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: b */
        public boolean mo2722b() {
            return mo2724d() && C0681d.this.m2771C();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: c */
        public boolean mo2723c() {
            if (mo2724d()) {
                long j7 = this.f2323i;
                if (j7 != -9223372036854775807L && C0681d.this.m2782z(j7)) {
                    return true;
                }
            }
            return false;
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: d */
        public boolean mo2724d() {
            return false;
        }

        @Override // p064J0.C0681d.d
        /* renamed from: e */
        public void mo2793e(C0681d c0681d) {
            final InterfaceC0676F.a aVar = this.f2327m;
            this.f2328n.execute(new Runnable() { // from class: J0.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0681d.h.this.m2803C(aVar);
                }
            });
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: f */
        public void mo2725f() {
            C0681d.this.f2292c.m2920a();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: g */
        public void mo2726g(long j7, long j8) {
            try {
                C0681d.this.m2774G(j7, j8);
            } catch (C5759u e7) {
                C4327q c4327q = this.f2318d;
                if (c4327q == null) {
                    c4327q = new C4327q.b().m18234K();
                }
                throw new InterfaceC0676F.b(e7, c4327q);
            }
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: h */
        public Surface mo2727h() {
            AbstractC5332a.m21802g(mo2724d());
            AbstractC4094d.m17162a(AbstractC5332a.m21804i(null));
            throw null;
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: i */
        public void mo2728i(int i7, C4327q c4327q) {
            int i8;
            AbstractC5332a.m21802g(mo2724d());
            if (i7 != 1 && i7 != 2) {
                throw new UnsupportedOperationException("Unsupported input type " + i7);
            }
            C0681d.this.f2292c.m2935p(c4327q.f15146v);
            if (i7 == 1 && AbstractC5330M.f18800a < 21 && (i8 = c4327q.f15147w) != -1 && i8 != 0) {
                g.m2798a(i8);
            }
            this.f2319e = i7;
            this.f2318d = c4327q;
            if (this.f2325k) {
                AbstractC5332a.m21802g(this.f2324j != -9223372036854775807L);
                this.f2326l = this.f2324j;
            } else {
                m2806F();
                this.f2325k = true;
                this.f2326l = -9223372036854775807L;
            }
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: j */
        public void mo2729j() {
            C0681d.this.f2292c.m2930k();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: k */
        public void mo2730k(InterfaceC0676F.a aVar, Executor executor) {
            this.f2327m = aVar;
            this.f2328n = executor;
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: l */
        public void mo2731l(C4327q c4327q) {
            AbstractC5332a.m21802g(!mo2724d());
            C0681d.m2767t(C0681d.this, c4327q);
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: m */
        public void mo2732m(InterfaceC0693p interfaceC0693p) {
            C0681d.this.m2777J(interfaceC0693p);
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: n */
        public void mo2733n() {
            C0681d.this.f2292c.m2926g();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: o */
        public void mo2734o(float f7) {
            C0681d.this.m2776I(f7);
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: p */
        public void mo2735p() {
            C0681d.this.m2779v();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: q */
        public long mo2736q(long j7, boolean z6) {
            AbstractC5332a.m21802g(mo2724d());
            AbstractC5332a.m21802g(this.f2316b != -1);
            long j8 = this.f2326l;
            if (j8 != -9223372036854775807L) {
                if (!C0681d.this.m2782z(j8)) {
                    return -9223372036854775807L;
                }
                m2806F();
                this.f2326l = -9223372036854775807L;
            }
            AbstractC4094d.m17162a(AbstractC5332a.m21804i(null));
            throw null;
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: r */
        public void mo2737r(boolean z6) {
            if (mo2724d()) {
                throw null;
            }
            this.f2325k = false;
            this.f2323i = -9223372036854775807L;
            this.f2324j = -9223372036854775807L;
            C0681d.this.m2780w();
            if (z6) {
                C0681d.this.f2292c.m2932m();
            }
        }

        @Override // p064J0.InterfaceC0676F
        public void release() {
            C0681d.this.m2773F();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: s */
        public void mo2738s() {
            C0681d.this.f2292c.m2931l();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: t */
        public void mo2739t(List list) {
            if (this.f2317c.equals(list)) {
                return;
            }
            m2807G(list);
            m2806F();
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: u */
        public void mo2740u(Surface surface, C5318A c5318a) {
            C0681d.this.m2775H(surface, c5318a);
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: v */
        public void mo2741v(long j7, long j8) {
            this.f2322h |= (this.f2320f == j7 && this.f2321g == j8) ? false : true;
            this.f2320f = j7;
            this.f2321g = j8;
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: w */
        public boolean mo2742w() {
            return AbstractC5330M.m21676C0(this.f2315a);
        }

        @Override // p064J0.C0681d.d
        /* renamed from: x */
        public void mo2794x(C0681d c0681d, final C4310P c4310p) {
            final InterfaceC0676F.a aVar = this.f2327m;
            this.f2328n.execute(new Runnable() { // from class: J0.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0681d.h.this.m2805E(aVar, c4310p);
                }
            });
        }

        @Override // p064J0.InterfaceC0676F
        /* renamed from: y */
        public void mo2743y(boolean z6) {
            C0681d.this.f2292c.m2927h(z6);
        }
    }

    /* renamed from: q */
    public static /* synthetic */ InterfaceC4300F m2764q(C0681d c0681d) {
        c0681d.getClass();
        return null;
    }

    /* renamed from: t */
    public static /* synthetic */ InterfaceC4308N m2767t(C0681d c0681d, C4327q c4327q) {
        c0681d.m2769A(c4327q);
        return null;
    }

    /* renamed from: y */
    public static C4318h m2768y(C4318h c4318h) {
        return (c4318h == null || !c4318h.m18148g()) ? C4318h.f15032h : c4318h;
    }

    /* renamed from: A */
    public final InterfaceC4308N m2769A(C4327q c4327q) {
        AbstractC5332a.m21802g(this.f2302m == 0);
        C4318h m2768y = m2768y(c4327q.f15113A);
        if (m2768y.f15042c == 7 && AbstractC5330M.f18800a < 34) {
            m2768y = m2768y.m18146a().m18155e(6).m18151a();
        }
        C4318h c4318h = m2768y;
        final InterfaceC5342k mo21616e = this.f2295f.mo21616e((Looper) AbstractC5332a.m21804i(Looper.myLooper()), null);
        this.f2299j = mo21616e;
        try {
            InterfaceC4300F.a aVar = this.f2294e;
            Context context = this.f2290a;
            InterfaceC4321k interfaceC4321k = InterfaceC4321k.f15053a;
            Objects.requireNonNull(mo21616e);
            aVar.mo2797a(context, c4318h, interfaceC4321k, this, new Executor() { // from class: J0.a
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    InterfaceC5342k.this.mo21622b(runnable);
                }
            }, AbstractC3033v.m11050t(), 0L);
            Pair pair = this.f2300k;
            if (pair == null) {
                throw null;
            }
            Surface surface = (Surface) pair.first;
            C5318A c5318a = (C5318A) pair.second;
            m2772E(surface, c5318a.m21611b(), c5318a.m21610a());
            throw null;
        } catch (C4307M e7) {
            throw new InterfaceC0676F.b(e7, c4327q);
        }
    }

    /* renamed from: B */
    public final boolean m2770B() {
        return this.f2302m == 1;
    }

    /* renamed from: C */
    public final boolean m2771C() {
        return this.f2301l == 0 && this.f2293d.m2980e();
    }

    /* renamed from: F */
    public void m2773F() {
        if (this.f2302m == 2) {
            return;
        }
        InterfaceC5342k interfaceC5342k = this.f2299j;
        if (interfaceC5342k != null) {
            interfaceC5342k.mo21630j(null);
        }
        this.f2300k = null;
        this.f2302m = 2;
    }

    /* renamed from: G */
    public void m2774G(long j7, long j8) {
        if (this.f2301l == 0) {
            this.f2293d.m2983h(j7, j8);
        }
    }

    /* renamed from: H */
    public void m2775H(Surface surface, C5318A c5318a) {
        Pair pair = this.f2300k;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C5318A) this.f2300k.second).equals(c5318a)) {
            return;
        }
        this.f2300k = Pair.create(surface, c5318a);
        m2772E(surface, c5318a.m21611b(), c5318a.m21610a());
    }

    /* renamed from: I */
    public final void m2776I(float f7) {
        this.f2293d.m2985j(f7);
    }

    /* renamed from: J */
    public final void m2777J(InterfaceC0693p interfaceC0693p) {
        this.f2298i = interfaceC0693p;
    }

    @Override // p064J0.InterfaceC0677G
    /* renamed from: a */
    public C0694q mo2747a() {
        return this.f2292c;
    }

    @Override // p064J0.InterfaceC0677G
    /* renamed from: b */
    public InterfaceC0676F mo2748b() {
        return this.f2291b;
    }

    /* renamed from: u */
    public void m2778u(d dVar) {
        this.f2296g.add(dVar);
    }

    /* renamed from: v */
    public void m2779v() {
        C5318A c5318a = C5318A.f18783c;
        m2772E(null, c5318a.m21611b(), c5318a.m21610a());
        this.f2300k = null;
    }

    /* renamed from: w */
    public final void m2780w() {
        if (m2770B()) {
            this.f2301l++;
            this.f2293d.m2978b();
            ((InterfaceC5342k) AbstractC5332a.m21804i(this.f2299j)).mo21622b(new Runnable() { // from class: J0.c
                @Override // java.lang.Runnable
                public final void run() {
                    C0681d.this.m2781x();
                }
            });
        }
    }

    /* renamed from: x */
    public final void m2781x() {
        int i7 = this.f2301l - 1;
        this.f2301l = i7;
        if (i7 > 0) {
            return;
        }
        if (i7 < 0) {
            throw new IllegalStateException(String.valueOf(this.f2301l));
        }
        this.f2293d.m2978b();
    }

    /* renamed from: z */
    public final boolean m2782z(long j7) {
        return this.f2301l == 0 && this.f2293d.m2979d(j7);
    }

    public C0681d(b bVar) {
        Context context = bVar.f2303a;
        this.f2290a = context;
        h hVar = new h(context);
        this.f2291b = hVar;
        InterfaceC5334c interfaceC5334c = bVar.f2307e;
        this.f2295f = interfaceC5334c;
        C0694q c0694q = bVar.f2304b;
        this.f2292c = c0694q;
        c0694q.m2934o(interfaceC5334c);
        this.f2293d = new C0697t(new c(), c0694q);
        this.f2294e = (InterfaceC4300F.a) AbstractC5332a.m21804i(bVar.f2306d);
        this.f2296g = new CopyOnWriteArraySet();
        this.f2302m = 0;
        m2778u(hVar);
    }

    /* renamed from: D */
    public static /* synthetic */ void m2749D(Runnable runnable) {
    }

    /* renamed from: E */
    public final void m2772E(Surface surface, int i7, int i8) {
    }
}
