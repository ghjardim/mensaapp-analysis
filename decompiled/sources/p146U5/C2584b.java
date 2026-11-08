package p146U5;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0058b;
import p013B5.AbstractC0064h;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p132S5.AbstractC2400q;
import p132S5.C2396o;
import p132S5.InterfaceC2366Z0;
import p132S5.InterfaceC2394n;
import p167X5.AbstractC2843D;
import p167X5.AbstractC2844E;
import p167X5.AbstractC2845F;
import p167X5.AbstractC2859d;
import p167X5.AbstractC2860e;
import p167X5.AbstractC2868m;
import p167X5.AbstractC2880y;
import p167X5.C2846G;
import p167X5.C2855P;
import p189a6.InterfaceC3184e;
import p207d.AbstractC4094d;
import p350u.AbstractC6581b;
import p371w5.AbstractC6918a;
import p371w5.AbstractC6928k;
import p371w5.C6927j;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;

/* renamed from: U5.b */
/* loaded from: classes2.dex */
public class C2584b implements InterfaceC2586d {

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f7567d = AtomicLongFieldUpdater.newUpdater(C2584b.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicLongFieldUpdater f7568e = AtomicLongFieldUpdater.newUpdater(C2584b.class, "receivers$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f7569f = AtomicLongFieldUpdater.newUpdater(C2584b.class, "bufferEnd$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicLongFieldUpdater f7570n = AtomicLongFieldUpdater.newUpdater(C2584b.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7571o = AtomicReferenceFieldUpdater.newUpdater(C2584b.class, Object.class, "sendSegment$volatile");

    /* renamed from: p */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7572p = AtomicReferenceFieldUpdater.newUpdater(C2584b.class, Object.class, "receiveSegment$volatile");

    /* renamed from: q */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7573q = AtomicReferenceFieldUpdater.newUpdater(C2584b.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: r */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7574r = AtomicReferenceFieldUpdater.newUpdater(C2584b.class, Object.class, "_closeCause$volatile");

    /* renamed from: s */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7575s = AtomicReferenceFieldUpdater.newUpdater(C2584b.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: a */
    public final int f7576a;

    /* renamed from: b */
    public final InterfaceC0800l f7577b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c */
    public final InterfaceC0805q f7578c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* renamed from: U5.b$a */
    public final class a implements InterfaceC2588f, InterfaceC2366Z0 {

        /* renamed from: a */
        public Object f7579a;

        /* renamed from: b */
        public C2396o f7580b;

        public a() {
            C2846G c2846g;
            c2846g = AbstractC2585c.f7600p;
            this.f7579a = c2846g;
        }

        @Override // p146U5.InterfaceC2588f
        /* renamed from: a */
        public Object mo8807a(InterfaceC7157e interfaceC7157e) {
            C2592j c2592j;
            C2846G c2846g;
            C2846G c2846g2;
            C2846G c2846g3;
            C2584b c2584b = C2584b.this;
            C2592j c2592j2 = (C2592j) C2584b.m8715P().get(c2584b);
            while (!c2584b.m8772d0()) {
                long andIncrement = C2584b.m8716Q().getAndIncrement(c2584b);
                int i7 = AbstractC2585c.f7586b;
                long j7 = andIncrement / i7;
                int i8 = (int) (andIncrement % i7);
                if (c2592j2.f8806c != j7) {
                    C2592j m8747G = c2584b.m8747G(j7, c2592j2);
                    if (m8747G == null) {
                        continue;
                    } else {
                        c2592j = m8747G;
                    }
                } else {
                    c2592j = c2592j2;
                }
                Object m8753J0 = c2584b.m8753J0(c2592j, i8, andIncrement, null);
                c2846g = AbstractC2585c.f7597m;
                if (m8753J0 == c2846g) {
                    throw new IllegalStateException("unreachable");
                }
                c2846g2 = AbstractC2585c.f7599o;
                if (m8753J0 != c2846g2) {
                    c2846g3 = AbstractC2585c.f7598n;
                    if (m8753J0 == c2846g3) {
                        return m8808f(c2592j, i8, andIncrement, interfaceC7157e);
                    }
                    c2592j.m10312c();
                    this.f7579a = m8753J0;
                    return AbstractC0058b.m149a(true);
                }
                if (andIncrement < c2584b.m8764V()) {
                    c2592j.m10312c();
                }
                c2592j2 = c2592j;
            }
            return AbstractC0058b.m149a(m8809g());
        }

        @Override // p132S5.InterfaceC2366Z0
        /* renamed from: b */
        public void mo8056b(AbstractC2843D abstractC2843D, int i7) {
            C2396o c2396o = this.f7580b;
            if (c2396o != null) {
                c2396o.mo8056b(abstractC2843D, i7);
            }
        }

        /* renamed from: f */
        public final Object m8808f(C2592j c2592j, int i7, long j7, InterfaceC7157e interfaceC7157e) {
            C2846G c2846g;
            C2846G c2846g2;
            Boolean m149a;
            C2846G c2846g3;
            C2846G c2846g4;
            C2846G c2846g5;
            C2584b c2584b = C2584b.this;
            C2396o m8174b = AbstractC2400q.m8174b(AbstractC0023b.m74c(interfaceC7157e));
            try {
                this.f7580b = m8174b;
                Object m8753J0 = c2584b.m8753J0(c2592j, i7, j7, this);
                c2846g = AbstractC2585c.f7597m;
                if (m8753J0 == c2846g) {
                    c2584b.m8793t0(this, c2592j, i7);
                } else {
                    c2846g2 = AbstractC2585c.f7599o;
                    InterfaceC0800l interfaceC0800l = null;
                    if (m8753J0 == c2846g2) {
                        if (j7 < c2584b.m8764V()) {
                            c2592j.m10312c();
                        }
                        C2592j c2592j2 = (C2592j) C2584b.m8715P().get(c2584b);
                        while (true) {
                            if (c2584b.m8772d0()) {
                                m8810h();
                                break;
                            }
                            long andIncrement = C2584b.m8716Q().getAndIncrement(c2584b);
                            int i8 = AbstractC2585c.f7586b;
                            long j8 = andIncrement / i8;
                            int i9 = (int) (andIncrement % i8);
                            if (c2592j2.f8806c != j8) {
                                C2592j m8747G = c2584b.m8747G(j8, c2592j2);
                                if (m8747G != null) {
                                    c2592j2 = m8747G;
                                }
                            }
                            Object m8753J02 = c2584b.m8753J0(c2592j2, i9, andIncrement, this);
                            c2846g3 = AbstractC2585c.f7597m;
                            if (m8753J02 == c2846g3) {
                                c2584b.m8793t0(this, c2592j2, i9);
                                break;
                            }
                            c2846g4 = AbstractC2585c.f7599o;
                            if (m8753J02 != c2846g4) {
                                c2846g5 = AbstractC2585c.f7598n;
                                if (m8753J02 == c2846g5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c2592j2.m10312c();
                                this.f7579a = m8753J02;
                                this.f7580b = null;
                                m149a = AbstractC0058b.m149a(true);
                                InterfaceC0800l interfaceC0800l2 = c2584b.f7577b;
                                if (interfaceC0800l2 != null) {
                                    interfaceC0800l = AbstractC2880y.m10395a(interfaceC0800l2, m8753J02, m8174b.getContext());
                                }
                            } else if (andIncrement < c2584b.m8764V()) {
                                c2592j2.m10312c();
                            }
                        }
                    } else {
                        c2592j.m10312c();
                        this.f7579a = m8753J0;
                        this.f7580b = null;
                        m149a = AbstractC0058b.m149a(true);
                        InterfaceC0800l interfaceC0800l3 = c2584b.f7577b;
                        if (interfaceC0800l3 != null) {
                            interfaceC0800l = AbstractC2880y.m10395a(interfaceC0800l3, m8753J0, m8174b.getContext());
                        }
                    }
                    m8174b.mo8136f(m149a, interfaceC0800l);
                }
                Object m8171y = m8174b.m8171y();
                if (m8171y == AbstractC0024c.m76e()) {
                    AbstractC0064h.m164c(interfaceC7157e);
                }
                return m8171y;
            } catch (Throwable th) {
                m8174b.m8154M();
                throw th;
            }
        }

        /* renamed from: g */
        public final boolean m8809g() {
            this.f7579a = AbstractC2585c.m8843z();
            Throwable m8755L = C2584b.this.m8755L();
            if (m8755L == null) {
                return false;
            }
            throw AbstractC2845F.m10261a(m8755L);
        }

        /* renamed from: h */
        public final void m8810h() {
            C2396o c2396o = this.f7580b;
            AbstractC5469l.m23025b(c2396o);
            this.f7580b = null;
            this.f7579a = AbstractC2585c.m8843z();
            Throwable m8755L = C2584b.this.m8755L();
            if (m8755L == null) {
                C6927j.a aVar = C6927j.f24803b;
                c2396o.resumeWith(C6927j.m28373b(Boolean.FALSE));
            } else {
                C6927j.a aVar2 = C6927j.f24803b;
                c2396o.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m8755L)));
            }
        }

        /* renamed from: i */
        public final boolean m8811i(Object obj) {
            boolean m8816B;
            C2396o c2396o = this.f7580b;
            AbstractC5469l.m23025b(c2396o);
            this.f7580b = null;
            this.f7579a = obj;
            Boolean bool = Boolean.TRUE;
            InterfaceC0800l interfaceC0800l = C2584b.this.f7577b;
            m8816B = AbstractC2585c.m8816B(c2396o, bool, interfaceC0800l != null ? AbstractC2880y.m10395a(interfaceC0800l, obj, c2396o.getContext()) : null);
            return m8816B;
        }

        /* renamed from: j */
        public final void m8812j() {
            C2396o c2396o = this.f7580b;
            AbstractC5469l.m23025b(c2396o);
            this.f7580b = null;
            this.f7579a = AbstractC2585c.m8843z();
            Throwable m8755L = C2584b.this.m8755L();
            if (m8755L == null) {
                C6927j.a aVar = C6927j.f24803b;
                c2396o.resumeWith(C6927j.m28373b(Boolean.FALSE));
            } else {
                C6927j.a aVar2 = C6927j.f24803b;
                c2396o.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m8755L)));
            }
        }

        @Override // p146U5.InterfaceC2588f
        public Object next() {
            C2846G c2846g;
            C2846G c2846g2;
            Object obj = this.f7579a;
            c2846g = AbstractC2585c.f7600p;
            if (obj == c2846g) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            c2846g2 = AbstractC2585c.f7600p;
            this.f7579a = c2846g2;
            if (obj != AbstractC2585c.m8843z()) {
                return obj;
            }
            throw AbstractC2845F.m10261a(C2584b.this.m8759O());
        }
    }

    /* renamed from: U5.b$b */
    public static final class b extends AbstractC5470m implements InterfaceC0805q {

        /* renamed from: U5.b$b$a */
        public static final class a extends AbstractC5470m implements InterfaceC0800l {

            /* renamed from: a */
            public final /* synthetic */ Object f7583a;

            /* renamed from: b */
            public final /* synthetic */ C2584b f7584b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C2584b c2584b, InterfaceC3184e interfaceC3184e) {
                super(1);
                this.f7583a = obj;
                this.f7584b = c2584b;
            }

            /* renamed from: a */
            public final void m8814a(Throwable th) {
                if (this.f7583a == AbstractC2585c.m8843z()) {
                    return;
                }
                InterfaceC0800l interfaceC0800l = this.f7584b.f7577b;
                throw null;
            }

            @Override // p069J5.InterfaceC0800l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m8814a((Throwable) obj);
                return C6934q.f24811a;
            }
        }

        public b() {
            super(3);
        }

        /* renamed from: a */
        public final InterfaceC0800l m8813a(InterfaceC3184e interfaceC3184e, Object obj, Object obj2) {
            return new a(obj2, C2584b.this, interfaceC3184e);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3350c(Object obj, Object obj2, Object obj3) {
            AbstractC4094d.m17162a(obj);
            return m8813a(null, obj2, obj3);
        }
    }

    public C2584b(int i7, InterfaceC0800l interfaceC0800l) {
        long m8815A;
        C2846G c2846g;
        this.f7576a = i7;
        this.f7577b = interfaceC0800l;
        if (i7 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i7 + ", should be >=0").toString());
        }
        m8815A = AbstractC2585c.m8815A(i7);
        this.bufferEnd$volatile = m8815A;
        this.completedExpandBuffersAndPauseFlag$volatile = m8752J();
        C2592j c2592j = new C2592j(0L, null, this, 3);
        this.sendSegment$volatile = c2592j;
        this.receiveSegment$volatile = c2592j;
        if (m8778h0()) {
            c2592j = AbstractC2585c.f7585a;
            AbstractC5469l.m23026c(c2592j, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = c2592j;
        this.f7578c = interfaceC0800l != null ? new b() : null;
        c2846g = AbstractC2585c.f7603s;
        this._closeCause$volatile = c2846g;
    }

    /* renamed from: B0 */
    public static /* synthetic */ Object m8710B0(C2584b c2584b, Object obj, InterfaceC7157e interfaceC7157e) {
        C2592j c2592j = (C2592j) m8717T().get(c2584b);
        while (true) {
            long andIncrement = m8718U().getAndIncrement(c2584b);
            long j7 = 1152921504606846975L & andIncrement;
            boolean m8775f0 = c2584b.m8775f0(andIncrement);
            int i7 = AbstractC2585c.f7586b;
            long j8 = j7 / i7;
            int i8 = (int) (j7 % i7);
            if (c2592j.f8806c != j8) {
                C2592j m8749H = c2584b.m8749H(j8, c2592j);
                if (m8749H != null) {
                    c2592j = m8749H;
                } else if (m8775f0) {
                    Object m8788p0 = c2584b.m8788p0(obj, interfaceC7157e);
                    if (m8788p0 == AbstractC0024c.m76e()) {
                        return m8788p0;
                    }
                }
            }
            int m8756L0 = c2584b.m8756L0(c2592j, i8, obj, j7, null, m8775f0);
            if (m8756L0 == 0) {
                c2592j.m10312c();
                break;
            }
            if (m8756L0 == 1) {
                break;
            }
            if (m8756L0 != 2) {
                if (m8756L0 == 3) {
                    Object m8740C0 = c2584b.m8740C0(c2592j, i8, obj, j7, interfaceC7157e);
                    if (m8740C0 == AbstractC0024c.m76e()) {
                        return m8740C0;
                    }
                } else if (m8756L0 == 4) {
                    if (j7 < c2584b.m8762R()) {
                        c2592j.m10312c();
                    }
                    Object m8788p02 = c2584b.m8788p0(obj, interfaceC7157e);
                    if (m8788p02 == AbstractC0024c.m76e()) {
                        return m8788p02;
                    }
                } else if (m8756L0 == 5) {
                    c2592j.m10312c();
                }
            } else if (m8775f0) {
                c2592j.m10256t();
                Object m8788p03 = c2584b.m8788p0(obj, interfaceC7157e);
                if (m8788p03 == AbstractC0024c.m76e()) {
                    return m8788p03;
                }
            }
        }
        return C6934q.f24811a;
    }

    /* renamed from: P */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m8715P() {
        return f7572p;
    }

    /* renamed from: Q */
    public static final /* synthetic */ AtomicLongFieldUpdater m8716Q() {
        return f7568e;
    }

    /* renamed from: T */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m8717T() {
        return f7571o;
    }

    /* renamed from: U */
    public static final /* synthetic */ AtomicLongFieldUpdater m8718U() {
        return f7567d;
    }

    /* renamed from: Z */
    public static /* synthetic */ void m8720Z(C2584b c2584b, long j7, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i7 & 1) != 0) {
            j7 = 1;
        }
        c2584b.m8766Y(j7);
    }

    /* renamed from: v0 */
    public static /* synthetic */ Object m8735v0(C2584b c2584b, InterfaceC7157e interfaceC7157e) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2592j c2592j = (C2592j) m8715P().get(c2584b);
        while (!c2584b.m8772d0()) {
            long andIncrement = m8716Q().getAndIncrement(c2584b);
            int i7 = AbstractC2585c.f7586b;
            long j7 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (c2592j.f8806c != j7) {
                C2592j m8747G = c2584b.m8747G(j7, c2592j);
                if (m8747G == null) {
                    continue;
                } else {
                    c2592j = m8747G;
                }
            }
            Object m8753J0 = c2584b.m8753J0(c2592j, i8, andIncrement, null);
            c2846g = AbstractC2585c.f7597m;
            if (m8753J0 == c2846g) {
                throw new IllegalStateException("unexpected");
            }
            c2846g2 = AbstractC2585c.f7599o;
            if (m8753J0 != c2846g2) {
                c2846g3 = AbstractC2585c.f7598n;
                if (m8753J0 == c2846g3) {
                    return c2584b.m8797w0(c2592j, i8, andIncrement, interfaceC7157e);
                }
                c2592j.m10312c();
                return m8753J0;
            }
            if (andIncrement < c2584b.m8764V()) {
                c2592j.m10312c();
            }
        }
        throw AbstractC2845F.m10261a(c2584b.m8759O());
    }

    /* renamed from: A */
    public final void m8736A(long j7) {
        m8799x0(m8738B(j7));
    }

    /* renamed from: A0 */
    public final void m8737A0(InterfaceC2366Z0 interfaceC2366Z0, boolean z6) {
        if (interfaceC2366Z0 instanceof InterfaceC2394n) {
            InterfaceC7157e interfaceC7157e = (InterfaceC7157e) interfaceC2366Z0;
            C6927j.a aVar = C6927j.f24803b;
            interfaceC7157e.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(z6 ? m8759O() : m8763S())));
        } else {
            if (interfaceC2366Z0 instanceof a) {
                ((a) interfaceC2366Z0).m8812j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + interfaceC2366Z0).toString());
        }
    }

    /* renamed from: B */
    public final C2592j m8738B(long j7) {
        C2592j m8800y = m8800y();
        if (mo8777g0()) {
            long m8779i0 = m8779i0(m8800y);
            if (m8779i0 != -1) {
                m8741D(m8779i0);
            }
        }
        m8798x(m8800y, j7);
        return m8800y;
    }

    /* renamed from: C */
    public final void m8739C() {
        mo8791s();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011e  */
    /* renamed from: C0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m8740C0(p146U5.C2592j r21, int r22, java.lang.Object r23, long r24, p392z5.InterfaceC7157e r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.m8740C0(U5.j, int, java.lang.Object, long, z5.e):java.lang.Object");
    }

    /* renamed from: D */
    public final void m8741D(long j7) {
        C2846G c2846g;
        C2855P m10398d;
        C2592j c2592j = (C2592j) f7572p.get(this);
        while (true) {
            long j8 = f7568e.get(this);
            if (j7 < Math.max(this.f7576a + j8, m8752J())) {
                return;
            }
            if (f7568e.compareAndSet(this, j8, j8 + 1)) {
                int i7 = AbstractC2585c.f7586b;
                long j9 = j8 / i7;
                int i8 = (int) (j8 % i7);
                if (c2592j.f8806c != j9) {
                    C2592j m8747G = m8747G(j9, c2592j);
                    if (m8747G == null) {
                        continue;
                    } else {
                        c2592j = m8747G;
                    }
                }
                Object m8753J0 = m8753J0(c2592j, i8, j8, null);
                c2846g = AbstractC2585c.f7599o;
                if (m8753J0 != c2846g) {
                    c2592j.m10312c();
                    InterfaceC0800l interfaceC0800l = this.f7577b;
                    if (interfaceC0800l != null && (m10398d = AbstractC2880y.m10398d(interfaceC0800l, m8753J0, null, 2, null)) != null) {
                        throw m10398d;
                    }
                } else if (j8 < m8764V()) {
                    c2592j.m10312c();
                }
            }
        }
    }

    /* renamed from: D0 */
    public final boolean m8742D0(long j7) {
        if (m8775f0(j7)) {
            return false;
        }
        return !m8795v(j7 & 1152921504606846975L);
    }

    /* renamed from: E */
    public final void m8743E() {
        if (m8778h0()) {
            return;
        }
        C2592j c2592j = (C2592j) f7573q.get(this);
        while (true) {
            long andIncrement = f7569f.getAndIncrement(this);
            int i7 = AbstractC2585c.f7586b;
            long j7 = andIncrement / i7;
            if (m8764V() <= andIncrement) {
                if (c2592j.f8806c < j7 && c2592j.m10315f() != null) {
                    m8784m0(j7, c2592j);
                }
                m8720Z(this, 0L, 1, null);
                return;
            }
            if (c2592j.f8806c != j7) {
                C2592j m8745F = m8745F(j7, c2592j, andIncrement);
                if (m8745F == null) {
                    continue;
                } else {
                    c2592j = m8745F;
                }
            }
            if (m8750H0(c2592j, (int) (andIncrement % i7), andIncrement)) {
                m8720Z(this, 0L, 1, null);
                return;
            }
            m8720Z(this, 0L, 1, null);
        }
    }

    /* renamed from: E0 */
    public final boolean m8744E0(Object obj, Object obj2) {
        boolean m8816B;
        if (obj instanceof a) {
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).m8811i(obj2);
        }
        if (!(obj instanceof InterfaceC2394n)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC2394n interfaceC2394n = (InterfaceC2394n) obj;
        InterfaceC0800l interfaceC0800l = this.f7577b;
        m8816B = AbstractC2585c.m8816B(interfaceC2394n, obj2, interfaceC0800l != null ? AbstractC2880y.m10395a(interfaceC0800l, obj2, interfaceC2394n.getContext()) : null);
        return m8816B;
    }

    /* renamed from: F */
    public final C2592j m8745F(long j7, C2592j c2592j, long j8) {
        Object m10308c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7573q;
        InterfaceC0804p interfaceC0804p = (InterfaceC0804p) AbstractC2585c.m8842y();
        loop0: while (true) {
            m10308c = AbstractC2859d.m10308c(c2592j, j7, interfaceC0804p);
            if (!AbstractC2844E.m10260c(m10308c)) {
                AbstractC2843D m10259b = AbstractC2844E.m10259b(m10308c);
                while (true) {
                    AbstractC2843D abstractC2843D = (AbstractC2843D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2843D.f8806c >= m10259b.f8806c) {
                        break loop0;
                    }
                    if (!m10259b.m10257u()) {
                        break;
                    }
                    if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, abstractC2843D, m10259b)) {
                        if (abstractC2843D.m10255p()) {
                            abstractC2843D.m10320n();
                        }
                    } else if (m10259b.m10255p()) {
                        m10259b.m10320n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2844E.m10260c(m10308c)) {
            m8739C();
            m8784m0(j7, c2592j);
            m8720Z(this, 0L, 1, null);
            return null;
        }
        C2592j c2592j2 = (C2592j) AbstractC2844E.m10259b(m10308c);
        if (c2592j2.f8806c <= j7) {
            return c2592j2;
        }
        long j9 = c2592j2.f8806c;
        int i7 = AbstractC2585c.f7586b;
        if (f7569f.compareAndSet(this, j8 + 1, j9 * i7)) {
            m8766Y((c2592j2.f8806c * i7) - j8);
            return null;
        }
        m8720Z(this, 0L, 1, null);
        return null;
    }

    /* renamed from: F0 */
    public final boolean m8746F0(Object obj, C2592j c2592j, int i7) {
        if (obj instanceof InterfaceC2394n) {
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return AbstractC2585c.m8817C((InterfaceC2394n) obj, C6934q.f24811a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    /* renamed from: G */
    public final C2592j m8747G(long j7, C2592j c2592j) {
        Object m10308c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7572p;
        InterfaceC0804p interfaceC0804p = (InterfaceC0804p) AbstractC2585c.m8842y();
        loop0: while (true) {
            m10308c = AbstractC2859d.m10308c(c2592j, j7, interfaceC0804p);
            if (!AbstractC2844E.m10260c(m10308c)) {
                AbstractC2843D m10259b = AbstractC2844E.m10259b(m10308c);
                while (true) {
                    AbstractC2843D abstractC2843D = (AbstractC2843D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2843D.f8806c >= m10259b.f8806c) {
                        break loop0;
                    }
                    if (!m10259b.m10257u()) {
                        break;
                    }
                    if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, abstractC2843D, m10259b)) {
                        if (abstractC2843D.m10255p()) {
                            abstractC2843D.m10320n();
                        }
                    } else if (m10259b.m10255p()) {
                        m10259b.m10320n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2844E.m10260c(m10308c)) {
            m8739C();
            if (c2592j.f8806c * AbstractC2585c.f7586b >= m8764V()) {
                return null;
            }
            c2592j.m10312c();
            return null;
        }
        C2592j c2592j2 = (C2592j) AbstractC2844E.m10259b(m10308c);
        if (!m8778h0() && j7 <= m8752J() / AbstractC2585c.f7586b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7573q;
            while (true) {
                AbstractC2843D abstractC2843D2 = (AbstractC2843D) atomicReferenceFieldUpdater2.get(this);
                if (abstractC2843D2.f8806c >= c2592j2.f8806c || !c2592j2.m10257u()) {
                    break;
                }
                if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater2, this, abstractC2843D2, c2592j2)) {
                    if (abstractC2843D2.m10255p()) {
                        abstractC2843D2.m10320n();
                    }
                } else if (c2592j2.m10255p()) {
                    c2592j2.m10320n();
                }
            }
        }
        long j8 = c2592j2.f8806c;
        if (j8 <= j7) {
            return c2592j2;
        }
        int i7 = AbstractC2585c.f7586b;
        m8758N0(j8 * i7);
        if (c2592j2.f8806c * i7 >= m8764V()) {
            return null;
        }
        c2592j2.m10312c();
        return null;
    }

    /* renamed from: G0 */
    public final Object m8748G0(Object obj) {
        C2592j c2592j;
        Object obj2 = AbstractC2585c.f7588d;
        C2592j c2592j2 = (C2592j) m8717T().get(this);
        while (true) {
            long andIncrement = m8718U().getAndIncrement(this);
            long j7 = andIncrement & 1152921504606846975L;
            boolean m8775f0 = m8775f0(andIncrement);
            int i7 = AbstractC2585c.f7586b;
            long j8 = j7 / i7;
            int i8 = (int) (j7 % i7);
            if (c2592j2.f8806c != j8) {
                C2592j m8749H = m8749H(j8, c2592j2);
                if (m8749H != null) {
                    c2592j = m8749H;
                } else if (m8775f0) {
                    return AbstractC2590h.f7609a.m8855a(m8763S());
                }
            } else {
                c2592j = c2592j2;
            }
            int m8756L0 = m8756L0(c2592j, i8, obj, j7, obj2, m8775f0);
            if (m8756L0 == 0) {
                c2592j.m10312c();
                return AbstractC2590h.f7609a.m8857c(C6934q.f24811a);
            }
            if (m8756L0 == 1) {
                return AbstractC2590h.f7609a.m8857c(C6934q.f24811a);
            }
            if (m8756L0 == 2) {
                if (m8775f0) {
                    c2592j.m10256t();
                    return AbstractC2590h.f7609a.m8855a(m8763S());
                }
                InterfaceC2366Z0 interfaceC2366Z0 = obj2 instanceof InterfaceC2366Z0 ? (InterfaceC2366Z0) obj2 : null;
                if (interfaceC2366Z0 != null) {
                    m8794u0(interfaceC2366Z0, c2592j, i8);
                }
                m8741D((c2592j.f8806c * i7) + i8);
                return AbstractC2590h.f7609a.m8857c(C6934q.f24811a);
            }
            if (m8756L0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (m8756L0 == 4) {
                if (j7 < m8762R()) {
                    c2592j.m10312c();
                }
                return AbstractC2590h.f7609a.m8855a(m8763S());
            }
            if (m8756L0 == 5) {
                c2592j.m10312c();
            }
            c2592j2 = c2592j;
        }
    }

    /* renamed from: H */
    public final C2592j m8749H(long j7, C2592j c2592j) {
        Object m10308c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7571o;
        InterfaceC0804p interfaceC0804p = (InterfaceC0804p) AbstractC2585c.m8842y();
        loop0: while (true) {
            m10308c = AbstractC2859d.m10308c(c2592j, j7, interfaceC0804p);
            if (!AbstractC2844E.m10260c(m10308c)) {
                AbstractC2843D m10259b = AbstractC2844E.m10259b(m10308c);
                while (true) {
                    AbstractC2843D abstractC2843D = (AbstractC2843D) atomicReferenceFieldUpdater.get(this);
                    if (abstractC2843D.f8806c >= m10259b.f8806c) {
                        break loop0;
                    }
                    if (!m10259b.m10257u()) {
                        break;
                    }
                    if (AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, abstractC2843D, m10259b)) {
                        if (abstractC2843D.m10255p()) {
                            abstractC2843D.m10320n();
                        }
                    } else if (m10259b.m10255p()) {
                        m10259b.m10320n();
                    }
                }
            } else {
                break;
            }
        }
        if (AbstractC2844E.m10260c(m10308c)) {
            m8739C();
            if (c2592j.f8806c * AbstractC2585c.f7586b >= m8762R()) {
                return null;
            }
            c2592j.m10312c();
            return null;
        }
        C2592j c2592j2 = (C2592j) AbstractC2844E.m10259b(m10308c);
        long j8 = c2592j2.f8806c;
        if (j8 <= j7) {
            return c2592j2;
        }
        int i7 = AbstractC2585c.f7586b;
        m8760O0(j8 * i7);
        if (c2592j2.f8806c * i7 >= m8762R()) {
            return null;
        }
        c2592j2.m10312c();
        return null;
    }

    /* renamed from: H0 */
    public final boolean m8750H0(C2592j c2592j, int i7, long j7) {
        C2846G c2846g;
        C2846G c2846g2;
        Object m8860B = c2592j.m8860B(i7);
        if ((m8860B instanceof InterfaceC2366Z0) && j7 >= f7568e.get(this)) {
            c2846g = AbstractC2585c.f7591g;
            if (c2592j.m8868v(i7, m8860B, c2846g)) {
                if (m8746F0(m8860B, c2592j, i7)) {
                    c2592j.m8864F(i7, AbstractC2585c.f7588d);
                    return true;
                }
                c2846g2 = AbstractC2585c.f7594j;
                c2592j.m8864F(i7, c2846g2);
                c2592j.m8861C(i7, false);
                return false;
            }
        }
        return m8751I0(c2592j, i7, j7);
    }

    /* renamed from: I0 */
    public final boolean m8751I0(C2592j c2592j, int i7, long j7) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2846G c2846g6;
        C2846G c2846g7;
        C2846G c2846g8;
        while (true) {
            Object m8860B = c2592j.m8860B(i7);
            if (!(m8860B instanceof InterfaceC2366Z0)) {
                c2846g3 = AbstractC2585c.f7594j;
                if (m8860B != c2846g3) {
                    if (m8860B != null) {
                        if (m8860B != AbstractC2585c.f7588d) {
                            c2846g5 = AbstractC2585c.f7592h;
                            if (m8860B == c2846g5) {
                                break;
                            }
                            c2846g6 = AbstractC2585c.f7593i;
                            if (m8860B == c2846g6) {
                                break;
                            }
                            c2846g7 = AbstractC2585c.f7595k;
                            if (m8860B == c2846g7 || m8860B == AbstractC2585c.m8843z()) {
                                return true;
                            }
                            c2846g8 = AbstractC2585c.f7590f;
                            if (m8860B != c2846g8) {
                                throw new IllegalStateException(("Unexpected cell state: " + m8860B).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        c2846g4 = AbstractC2585c.f7589e;
                        if (c2592j.m8868v(i7, m8860B, c2846g4)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j7 >= f7568e.get(this)) {
                c2846g = AbstractC2585c.f7591g;
                if (c2592j.m8868v(i7, m8860B, c2846g)) {
                    if (m8746F0(m8860B, c2592j, i7)) {
                        c2592j.m8864F(i7, AbstractC2585c.f7588d);
                        return true;
                    }
                    c2846g2 = AbstractC2585c.f7594j;
                    c2592j.m8864F(i7, c2846g2);
                    c2592j.m8861C(i7, false);
                    return false;
                }
            } else if (c2592j.m8868v(i7, m8860B, new C2603u((InterfaceC2366Z0) m8860B))) {
                return true;
            }
        }
    }

    /* renamed from: J */
    public final long m8752J() {
        return f7569f.get(this);
    }

    /* renamed from: J0 */
    public final Object m8753J0(C2592j c2592j, int i7, long j7, Object obj) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        Object m8860B = c2592j.m8860B(i7);
        if (m8860B == null) {
            if (j7 >= (f7567d.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    c2846g3 = AbstractC2585c.f7598n;
                    return c2846g3;
                }
                if (c2592j.m8868v(i7, m8860B, obj)) {
                    m8743E();
                    c2846g2 = AbstractC2585c.f7597m;
                    return c2846g2;
                }
            }
        } else if (m8860B == AbstractC2585c.f7588d) {
            c2846g = AbstractC2585c.f7593i;
            if (c2592j.m8868v(i7, m8860B, c2846g)) {
                m8743E();
                return c2592j.m8862D(i7);
            }
        }
        return m8754K0(c2592j, i7, j7, obj);
    }

    /* renamed from: K0 */
    public final Object m8754K0(C2592j c2592j, int i7, long j7, Object obj) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2846G c2846g6;
        C2846G c2846g7;
        C2846G c2846g8;
        C2846G c2846g9;
        C2846G c2846g10;
        C2846G c2846g11;
        C2846G c2846g12;
        C2846G c2846g13;
        C2846G c2846g14;
        C2846G c2846g15;
        C2846G c2846g16;
        while (true) {
            Object m8860B = c2592j.m8860B(i7);
            if (m8860B != null) {
                c2846g5 = AbstractC2585c.f7589e;
                if (m8860B != c2846g5) {
                    if (m8860B == AbstractC2585c.f7588d) {
                        c2846g6 = AbstractC2585c.f7593i;
                        if (c2592j.m8868v(i7, m8860B, c2846g6)) {
                            m8743E();
                            return c2592j.m8862D(i7);
                        }
                    } else {
                        c2846g7 = AbstractC2585c.f7594j;
                        if (m8860B == c2846g7) {
                            c2846g8 = AbstractC2585c.f7599o;
                            return c2846g8;
                        }
                        c2846g9 = AbstractC2585c.f7592h;
                        if (m8860B == c2846g9) {
                            c2846g10 = AbstractC2585c.f7599o;
                            return c2846g10;
                        }
                        if (m8860B == AbstractC2585c.m8843z()) {
                            m8743E();
                            c2846g11 = AbstractC2585c.f7599o;
                            return c2846g11;
                        }
                        c2846g12 = AbstractC2585c.f7591g;
                        if (m8860B != c2846g12) {
                            c2846g13 = AbstractC2585c.f7590f;
                            if (c2592j.m8868v(i7, m8860B, c2846g13)) {
                                boolean z6 = m8860B instanceof C2603u;
                                if (z6) {
                                    m8860B = ((C2603u) m8860B).f7621a;
                                }
                                if (m8746F0(m8860B, c2592j, i7)) {
                                    c2846g16 = AbstractC2585c.f7593i;
                                    c2592j.m8864F(i7, c2846g16);
                                    m8743E();
                                    return c2592j.m8862D(i7);
                                }
                                c2846g14 = AbstractC2585c.f7594j;
                                c2592j.m8864F(i7, c2846g14);
                                c2592j.m8861C(i7, false);
                                if (z6) {
                                    m8743E();
                                }
                                c2846g15 = AbstractC2585c.f7599o;
                                return c2846g15;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j7 < (f7567d.get(this) & 1152921504606846975L)) {
                c2846g = AbstractC2585c.f7592h;
                if (c2592j.m8868v(i7, m8860B, c2846g)) {
                    m8743E();
                    c2846g2 = AbstractC2585c.f7599o;
                    return c2846g2;
                }
            } else {
                if (obj == null) {
                    c2846g3 = AbstractC2585c.f7598n;
                    return c2846g3;
                }
                if (c2592j.m8868v(i7, m8860B, obj)) {
                    m8743E();
                    c2846g4 = AbstractC2585c.f7597m;
                    return c2846g4;
                }
            }
        }
    }

    /* renamed from: L */
    public final Throwable m8755L() {
        return (Throwable) f7574r.get(this);
    }

    /* renamed from: L0 */
    public final int m8756L0(C2592j c2592j, int i7, Object obj, long j7, Object obj2, boolean z6) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        c2592j.m8865G(i7, obj);
        if (z6) {
            return m8757M0(c2592j, i7, obj, j7, obj2, z6);
        }
        Object m8860B = c2592j.m8860B(i7);
        if (m8860B == null) {
            if (m8795v(j7)) {
                if (c2592j.m8868v(i7, null, AbstractC2585c.f7588d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (c2592j.m8868v(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (m8860B instanceof InterfaceC2366Z0) {
            c2592j.m8869w(i7);
            if (m8744E0(m8860B, obj)) {
                c2846g3 = AbstractC2585c.f7593i;
                c2592j.m8864F(i7, c2846g3);
                m8790r0();
                return 0;
            }
            c2846g = AbstractC2585c.f7595k;
            Object m8870x = c2592j.m8870x(i7, c2846g);
            c2846g2 = AbstractC2585c.f7595k;
            if (m8870x != c2846g2) {
                c2592j.m8861C(i7, true);
            }
            return 5;
        }
        return m8757M0(c2592j, i7, obj, j7, obj2, z6);
    }

    /* renamed from: M0 */
    public final int m8757M0(C2592j c2592j, int i7, Object obj, long j7, Object obj2, boolean z6) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2846G c2846g6;
        C2846G c2846g7;
        while (true) {
            Object m8860B = c2592j.m8860B(i7);
            if (m8860B != null) {
                c2846g2 = AbstractC2585c.f7589e;
                if (m8860B != c2846g2) {
                    c2846g3 = AbstractC2585c.f7595k;
                    if (m8860B == c2846g3) {
                        c2592j.m8869w(i7);
                        return 5;
                    }
                    c2846g4 = AbstractC2585c.f7592h;
                    if (m8860B == c2846g4) {
                        c2592j.m8869w(i7);
                        return 5;
                    }
                    if (m8860B == AbstractC2585c.m8843z()) {
                        c2592j.m8869w(i7);
                        m8739C();
                        return 4;
                    }
                    c2592j.m8869w(i7);
                    if (m8860B instanceof C2603u) {
                        m8860B = ((C2603u) m8860B).f7621a;
                    }
                    if (m8744E0(m8860B, obj)) {
                        c2846g7 = AbstractC2585c.f7593i;
                        c2592j.m8864F(i7, c2846g7);
                        m8790r0();
                        return 0;
                    }
                    c2846g5 = AbstractC2585c.f7595k;
                    Object m8870x = c2592j.m8870x(i7, c2846g5);
                    c2846g6 = AbstractC2585c.f7595k;
                    if (m8870x != c2846g6) {
                        c2592j.m8861C(i7, true);
                    }
                    return 5;
                }
                if (c2592j.m8868v(i7, m8860B, AbstractC2585c.f7588d)) {
                    return 1;
                }
            } else if (!m8795v(j7) || z6) {
                if (z6) {
                    c2846g = AbstractC2585c.f7594j;
                    if (c2592j.m8868v(i7, null, c2846g)) {
                        c2592j.m8861C(i7, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (c2592j.m8868v(i7, null, obj2)) {
                        return 2;
                    }
                }
            } else if (c2592j.m8868v(i7, null, AbstractC2585c.f7588d)) {
                return 1;
            }
        }
    }

    /* renamed from: N0 */
    public final void m8758N0(long j7) {
        long j8;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7568e;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            if (j8 >= j7) {
                return;
            }
        } while (!f7568e.compareAndSet(this, j8, j7));
    }

    /* renamed from: O */
    public final Throwable m8759O() {
        Throwable m8755L = m8755L();
        return m8755L == null ? new C2595m("Channel was closed") : m8755L;
    }

    /* renamed from: O0 */
    public final void m8760O0(long j7) {
        long j8;
        long m8840w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7567d;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            long j9 = 1152921504606846975L & j8;
            if (j9 >= j7) {
                return;
            } else {
                m8840w = AbstractC2585c.m8840w(j9, (int) (j8 >> 60));
            }
        } while (!f7567d.compareAndSet(this, j8, m8840w));
    }

    /* renamed from: P0 */
    public final void m8761P0(long j7) {
        int i7;
        long j8;
        long m8839v;
        long m8839v2;
        long j9;
        long m8839v3;
        if (m8778h0()) {
            return;
        }
        while (m8752J() <= j7) {
        }
        i7 = AbstractC2585c.f7587c;
        for (int i8 = 0; i8 < i7; i8++) {
            long m8752J = m8752J();
            if (m8752J == (f7570n.get(this) & 4611686018427387903L) && m8752J == m8752J()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7570n;
        do {
            j8 = atomicLongFieldUpdater.get(this);
            m8839v = AbstractC2585c.m8839v(j8 & 4611686018427387903L, true);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j8, m8839v));
        while (true) {
            long m8752J2 = m8752J();
            long j10 = f7570n.get(this);
            long j11 = j10 & 4611686018427387903L;
            boolean z6 = (4611686018427387904L & j10) != 0;
            if (m8752J2 == j11 && m8752J2 == m8752J()) {
                break;
            }
            if (!z6) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7570n;
                m8839v2 = AbstractC2585c.m8839v(j11, true);
                atomicLongFieldUpdater2.compareAndSet(this, j10, m8839v2);
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater3 = f7570n;
        do {
            j9 = atomicLongFieldUpdater3.get(this);
            m8839v3 = AbstractC2585c.m8839v(j9 & 4611686018427387903L, false);
        } while (!atomicLongFieldUpdater3.compareAndSet(this, j9, m8839v3));
    }

    /* renamed from: R */
    public final long m8762R() {
        return f7568e.get(this);
    }

    /* renamed from: S */
    public final Throwable m8763S() {
        Throwable m8755L = m8755L();
        return m8755L == null ? new C2596n("Channel was closed") : m8755L;
    }

    /* renamed from: V */
    public final long m8764V() {
        return f7567d.get(this) & 1152921504606846975L;
    }

    /* renamed from: X */
    public final boolean m8765X() {
        while (true) {
            C2592j c2592j = (C2592j) f7572p.get(this);
            long m8762R = m8762R();
            if (m8764V() <= m8762R) {
                return false;
            }
            int i7 = AbstractC2585c.f7586b;
            long j7 = m8762R / i7;
            if (c2592j.f8806c == j7 || (c2592j = m8747G(j7, c2592j)) != null) {
                c2592j.m10312c();
                if (m8769b0(c2592j, (int) (m8762R % i7), m8762R)) {
                    return true;
                }
                f7568e.compareAndSet(this, m8762R, 1 + m8762R);
            } else if (((C2592j) f7572p.get(this)).f8806c < j7) {
                return false;
            }
        }
    }

    /* renamed from: Y */
    public final void m8766Y(long j7) {
        if ((f7570n.addAndGet(this, j7) & 4611686018427387904L) != 0) {
            while ((f7570n.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* renamed from: a0 */
    public final void m8767a0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7575s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, obj, obj == null ? AbstractC2585c.f7601q : AbstractC2585c.f7602r));
        if (obj == null) {
            return;
        }
        ((InterfaceC0800l) obj).invoke(m8755L());
    }

    @Override // p146U5.InterfaceC2601s
    /* renamed from: b */
    public Object mo8768b(InterfaceC7157e interfaceC7157e) {
        return m8735v0(this, interfaceC7157e);
    }

    /* renamed from: b0 */
    public final boolean m8769b0(C2592j c2592j, int i7, long j7) {
        Object m8860B;
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2846G c2846g6;
        C2846G c2846g7;
        do {
            m8860B = c2592j.m8860B(i7);
            if (m8860B != null) {
                c2846g2 = AbstractC2585c.f7589e;
                if (m8860B != c2846g2) {
                    if (m8860B == AbstractC2585c.f7588d) {
                        return true;
                    }
                    c2846g3 = AbstractC2585c.f7594j;
                    if (m8860B == c2846g3 || m8860B == AbstractC2585c.m8843z()) {
                        return false;
                    }
                    c2846g4 = AbstractC2585c.f7593i;
                    if (m8860B == c2846g4) {
                        return false;
                    }
                    c2846g5 = AbstractC2585c.f7592h;
                    if (m8860B == c2846g5) {
                        return false;
                    }
                    c2846g6 = AbstractC2585c.f7591g;
                    if (m8860B == c2846g6) {
                        return true;
                    }
                    c2846g7 = AbstractC2585c.f7590f;
                    return m8860B != c2846g7 && j7 == m8762R();
                }
            }
            c2846g = AbstractC2585c.f7592h;
        } while (!c2592j.m8868v(i7, m8860B, c2846g));
        m8743E();
        return false;
    }

    /* renamed from: c0 */
    public final boolean m8770c0(long j7, boolean z6) {
        int i7 = (int) (j7 >> 60);
        if (i7 == 0 || i7 == 1) {
            return false;
        }
        if (i7 == 2) {
            m8738B(j7 & 1152921504606846975L);
            if (z6 && m8765X()) {
                return false;
            }
        } else {
            if (i7 != 3) {
                throw new IllegalStateException(("unexpected close status: " + i7).toString());
            }
            m8736A(j7 & 1152921504606846975L);
        }
        return true;
    }

    @Override // p146U5.InterfaceC2601s
    public final void cancel(CancellationException cancellationException) {
        m8796w(cancellationException);
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: d */
    public Object mo8771d(Object obj, InterfaceC7157e interfaceC7157e) {
        return m8710B0(this, obj, interfaceC7157e);
    }

    /* renamed from: d0 */
    public boolean m8772d0() {
        return m8774e0(f7567d.get(this));
    }

    @Override // p146U5.InterfaceC2601s
    /* renamed from: e */
    public Object mo8773e() {
        Object obj;
        C2592j c2592j;
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        long j7 = f7568e.get(this);
        long j8 = f7567d.get(this);
        if (m8774e0(j8)) {
            return AbstractC2590h.f7609a.m8855a(m8755L());
        }
        if (j7 >= (j8 & 1152921504606846975L)) {
            return AbstractC2590h.f7609a.m8856b();
        }
        obj = AbstractC2585c.f7595k;
        C2592j c2592j2 = (C2592j) m8715P().get(this);
        while (!m8772d0()) {
            long andIncrement = m8716Q().getAndIncrement(this);
            int i7 = AbstractC2585c.f7586b;
            long j9 = andIncrement / i7;
            int i8 = (int) (andIncrement % i7);
            if (c2592j2.f8806c != j9) {
                C2592j m8747G = m8747G(j9, c2592j2);
                if (m8747G == null) {
                    continue;
                } else {
                    c2592j = m8747G;
                }
            } else {
                c2592j = c2592j2;
            }
            Object m8753J0 = m8753J0(c2592j, i8, andIncrement, obj);
            c2846g = AbstractC2585c.f7597m;
            if (m8753J0 == c2846g) {
                InterfaceC2366Z0 interfaceC2366Z0 = obj instanceof InterfaceC2366Z0 ? (InterfaceC2366Z0) obj : null;
                if (interfaceC2366Z0 != null) {
                    m8793t0(interfaceC2366Z0, c2592j, i8);
                }
                m8761P0(andIncrement);
                c2592j.m10256t();
                return AbstractC2590h.f7609a.m8856b();
            }
            c2846g2 = AbstractC2585c.f7599o;
            if (m8753J0 != c2846g2) {
                c2846g3 = AbstractC2585c.f7598n;
                if (m8753J0 == c2846g3) {
                    throw new IllegalStateException("unexpected");
                }
                c2592j.m10312c();
                return AbstractC2590h.f7609a.m8857c(m8753J0);
            }
            if (andIncrement < m8764V()) {
                c2592j.m10312c();
            }
            c2592j2 = c2592j;
        }
        return AbstractC2590h.f7609a.m8855a(m8755L());
    }

    /* renamed from: e0 */
    public final boolean m8774e0(long j7) {
        return m8770c0(j7, true);
    }

    /* renamed from: f0 */
    public final boolean m8775f0(long j7) {
        return m8770c0(j7, false);
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: g */
    public void mo8776g(InterfaceC0800l interfaceC0800l) {
        C2846G c2846g;
        C2846G c2846g2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2846G c2846g3;
        C2846G c2846g4;
        if (AbstractC6581b.m27343a(f7575s, this, null, interfaceC0800l)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7575s;
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            c2846g = AbstractC2585c.f7601q;
            if (obj != c2846g) {
                c2846g2 = AbstractC2585c.f7602r;
                if (obj == c2846g2) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f7575s;
            c2846g3 = AbstractC2585c.f7601q;
            c2846g4 = AbstractC2585c.f7602r;
        } while (!AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, c2846g3, c2846g4));
        interfaceC0800l.invoke(m8755L());
    }

    /* renamed from: g0 */
    public boolean mo8777g0() {
        return false;
    }

    /* renamed from: h0 */
    public final boolean m8778h0() {
        long m8752J = m8752J();
        return m8752J == 0 || m8752J == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (p146U5.C2592j) r8.m10317h();
     */
    /* renamed from: i0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m8779i0(p146U5.C2592j r8) {
        /*
            r7 = this;
        L0:
            int r0 = p146U5.AbstractC2585c.f7586b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f8806c
            int r5 = p146U5.AbstractC2585c.f7586b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.m8762R()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.m8860B(r0)
            if (r1 == 0) goto L2c
            X5.G r2 = p146U5.AbstractC2585c.m8828k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            X5.G r2 = p146U5.AbstractC2585c.f7588d
            if (r1 != r2) goto L39
            return r3
        L2c:
            X5.G r2 = p146U5.AbstractC2585c.m8843z()
            boolean r1 = r8.m8868v(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.m10256t()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            X5.e r8 = r8.m10317h()
            U5.j r8 = (p146U5.C2592j) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.m8779i0(U5.j):long");
    }

    @Override // p146U5.InterfaceC2601s
    public InterfaceC2588f iterator() {
        return new a();
    }

    /* renamed from: j0 */
    public final void m8780j0() {
        long j7;
        long m8840w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7567d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            if (((int) (j7 >> 60)) != 0) {
                return;
            } else {
                m8840w = AbstractC2585c.m8840w(1152921504606846975L & j7, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, m8840w));
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: k */
    public boolean mo8781k(Throwable th) {
        return m8802z(th, false);
    }

    /* renamed from: k0 */
    public final void m8782k0() {
        long j7;
        long m8840w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7567d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            m8840w = AbstractC2585c.m8840w(1152921504606846975L & j7, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, m8840w));
    }

    /* renamed from: l0 */
    public final void m8783l0() {
        long j7;
        long m8840w;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7567d;
        do {
            j7 = atomicLongFieldUpdater.get(this);
            int i7 = (int) (j7 >> 60);
            if (i7 == 0) {
                m8840w = AbstractC2585c.m8840w(j7 & 1152921504606846975L, 2);
            } else if (i7 != 1) {
                return;
            } else {
                m8840w = AbstractC2585c.m8840w(j7 & 1152921504606846975L, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j7, m8840w));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8784m0(long r5, p146U5.C2592j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f8806c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            X5.e r0 = r7.m10315f()
            U5.j r0 = (p146U5.C2592j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.mo10254k()
            if (r5 == 0) goto L22
            X5.e r5 = r7.m10315f()
            U5.j r5 = (p146U5.C2592j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m8712K()
        L26:
            java.lang.Object r6 = r5.get(r4)
            X5.D r6 = (p167X5.AbstractC2843D) r6
            long r0 = r6.f8806c
            long r2 = r7.f8806c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            goto L4b
        L35:
            boolean r0 = r7.m10257u()
            if (r0 != 0) goto L3c
            goto L11
        L3c:
            boolean r0 = p350u.AbstractC6581b.m27343a(r5, r4, r6, r7)
            if (r0 == 0) goto L4c
            boolean r5 = r6.m10255p()
            if (r5 == 0) goto L4b
            r6.m10320n()
        L4b:
            return
        L4c:
            boolean r6 = r7.m10255p()
            if (r6 == 0) goto L26
            r7.m10320n()
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.m8784m0(long, U5.j):void");
    }

    /* renamed from: o0 */
    public final void m8786o0(InterfaceC2394n interfaceC2394n) {
        C6927j.a aVar = C6927j.f24803b;
        interfaceC2394n.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m8759O())));
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return p146U5.AbstractC2590h.f7609a.m8857c(p371w5.C6934q.f24811a);
     */
    @Override // p146U5.InterfaceC2602t
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo8787p(java.lang.Object r15) {
        /*
            r14 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = m8718U()
            long r0 = r0.get(r14)
            boolean r0 = r14.m8742D0(r0)
            if (r0 == 0) goto L15
            U5.h$b r15 = p146U5.AbstractC2590h.f7609a
            java.lang.Object r15 = r15.m8856b()
            return r15
        L15:
            X5.G r8 = p146U5.AbstractC2585c.m8827j()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m8726j()
            java.lang.Object r0 = r0.get(r14)
            U5.j r0 = (p146U5.C2592j) r0
        L23:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = m8727l()
            long r1 = r1.getAndIncrement(r14)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r9 = r1 & r3
            boolean r11 = m8728m(r14, r1)
            int r1 = p146U5.AbstractC2585c.f7586b
            long r2 = (long) r1
            long r2 = r9 / r2
            long r4 = (long) r1
            long r4 = r9 % r4
            int r12 = (int) r4
            long r4 = r0.f8806c
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L5b
            U5.j r1 = m8722c(r14, r2, r0)
            if (r1 != 0) goto L59
            if (r11 == 0) goto L23
        L4d:
            U5.h$b r15 = p146U5.AbstractC2590h.f7609a
            java.lang.Throwable r0 = r14.m8763S()
            java.lang.Object r15 = r15.m8855a(r0)
            goto Lbc
        L59:
            r13 = r1
            goto L5c
        L5b:
            r13 = r0
        L5c:
            r0 = r14
            r1 = r13
            r2 = r12
            r3 = r15
            r4 = r9
            r6 = r8
            r7 = r11
            int r0 = m8734u(r0, r1, r2, r3, r4, r6, r7)
            if (r0 == 0) goto Lb8
            r1 = 1
            if (r0 == r1) goto Laf
            r1 = 2
            if (r0 == r1) goto L92
            r1 = 3
            if (r0 == r1) goto L8a
            r1 = 4
            if (r0 == r1) goto L7e
            r1 = 5
            if (r0 == r1) goto L79
            goto L7c
        L79:
            r13.m10312c()
        L7c:
            r0 = r13
            goto L23
        L7e:
            long r0 = r14.m8762R()
            int r15 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r15 >= 0) goto L4d
            r13.m10312c()
            goto L4d
        L8a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r15.<init>(r0)
            throw r15
        L92:
            if (r11 == 0) goto L98
            r13.m10256t()
            goto L4d
        L98:
            boolean r15 = r8 instanceof p132S5.InterfaceC2366Z0
            if (r15 == 0) goto L9f
            S5.Z0 r8 = (p132S5.InterfaceC2366Z0) r8
            goto La0
        L9f:
            r8 = 0
        La0:
            if (r8 == 0) goto La5
            m8732r(r14, r8, r13, r12)
        La5:
            r13.m10256t()
            U5.h$b r15 = p146U5.AbstractC2590h.f7609a
            java.lang.Object r15 = r15.m8856b()
            goto Lbc
        Laf:
            U5.h$b r15 = p146U5.AbstractC2590h.f7609a
            w5.q r0 = p371w5.C6934q.f24811a
            java.lang.Object r15 = r15.m8857c(r0)
            goto Lbc
        Lb8:
            r13.m10312c()
            goto Laf
        Lbc:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.mo8787p(java.lang.Object):java.lang.Object");
    }

    /* renamed from: p0 */
    public final Object m8788p0(Object obj, InterfaceC7157e interfaceC7157e) {
        C2855P m10398d;
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        InterfaceC0800l interfaceC0800l = this.f7577b;
        if (interfaceC0800l == null || (m10398d = AbstractC2880y.m10398d(interfaceC0800l, obj, null, 2, null)) == null) {
            Throwable m8763S = m8763S();
            C6927j.a aVar = C6927j.f24803b;
            c2396o.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m8763S)));
        } else {
            AbstractC6918a.m28362a(m10398d, m8763S());
            C6927j.a aVar2 = C6927j.f24803b;
            c2396o.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m10398d)));
        }
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    /* renamed from: q0 */
    public final void m8789q0(Object obj, InterfaceC2394n interfaceC2394n) {
        InterfaceC0800l interfaceC0800l = this.f7577b;
        if (interfaceC0800l != null) {
            AbstractC2880y.m10396b(interfaceC0800l, obj, interfaceC2394n.getContext());
        }
        Throwable m8763S = m8763S();
        C6927j.a aVar = C6927j.f24803b;
        interfaceC2394n.resumeWith(C6927j.m28373b(AbstractC6928k.m28381a(m8763S)));
    }

    @Override // p146U5.InterfaceC2602t
    /* renamed from: s */
    public boolean mo8791s() {
        return m8775f0(f7567d.get(this));
    }

    /* renamed from: t0 */
    public final void m8793t0(InterfaceC2366Z0 interfaceC2366Z0, C2592j c2592j, int i7) {
        m8792s0();
        interfaceC2366Z0.mo8056b(c2592j, i7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b8, code lost:
    
        r3 = (p146U5.C2592j) r3.m10315f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        if (r3 != null) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.toString():java.lang.String");
    }

    /* renamed from: u0 */
    public final void m8794u0(InterfaceC2366Z0 interfaceC2366Z0, C2592j c2592j, int i7) {
        interfaceC2366Z0.mo8056b(c2592j, i7 + AbstractC2585c.f7586b);
    }

    /* renamed from: v */
    public final boolean m8795v(long j7) {
        return j7 < m8752J() || j7 < m8762R() + ((long) this.f7576a);
    }

    /* renamed from: w */
    public boolean m8796w(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return m8802z(th, true);
    }

    /* renamed from: w0 */
    public final Object m8797w0(C2592j c2592j, int i7, long j7, InterfaceC7157e interfaceC7157e) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2396o m8174b = AbstractC2400q.m8174b(AbstractC0023b.m74c(interfaceC7157e));
        try {
            Object m8753J0 = m8753J0(c2592j, i7, j7, m8174b);
            c2846g = AbstractC2585c.f7597m;
            if (m8753J0 == c2846g) {
                m8793t0(m8174b, c2592j, i7);
            } else {
                c2846g2 = AbstractC2585c.f7599o;
                InterfaceC0800l interfaceC0800l = null;
                interfaceC0800l = null;
                if (m8753J0 == c2846g2) {
                    if (j7 < m8764V()) {
                        c2592j.m10312c();
                    }
                    C2592j c2592j2 = (C2592j) m8715P().get(this);
                    while (true) {
                        if (m8772d0()) {
                            m8786o0(m8174b);
                            break;
                        }
                        long andIncrement = m8716Q().getAndIncrement(this);
                        int i8 = AbstractC2585c.f7586b;
                        long j8 = andIncrement / i8;
                        int i9 = (int) (andIncrement % i8);
                        if (c2592j2.f8806c != j8) {
                            C2592j m8747G = m8747G(j8, c2592j2);
                            if (m8747G != null) {
                                c2592j2 = m8747G;
                            }
                        }
                        m8753J0 = m8753J0(c2592j2, i9, andIncrement, m8174b);
                        c2846g3 = AbstractC2585c.f7597m;
                        if (m8753J0 == c2846g3) {
                            C2396o c2396o = m8174b instanceof InterfaceC2366Z0 ? m8174b : null;
                            if (c2396o != null) {
                                m8793t0(c2396o, c2592j2, i9);
                            }
                        } else {
                            c2846g4 = AbstractC2585c.f7599o;
                            if (m8753J0 != c2846g4) {
                                c2846g5 = AbstractC2585c.f7598n;
                                if (m8753J0 == c2846g5) {
                                    throw new IllegalStateException("unexpected");
                                }
                                c2592j2.m10312c();
                                InterfaceC0800l interfaceC0800l2 = this.f7577b;
                                if (interfaceC0800l2 != null) {
                                    interfaceC0800l = AbstractC2880y.m10395a(interfaceC0800l2, m8753J0, m8174b.getContext());
                                }
                            } else if (andIncrement < m8764V()) {
                                c2592j2.m10312c();
                            }
                        }
                    }
                } else {
                    c2592j.m10312c();
                    InterfaceC0800l interfaceC0800l3 = this.f7577b;
                    if (interfaceC0800l3 != null) {
                        interfaceC0800l = AbstractC2880y.m10395a(interfaceC0800l3, m8753J0, m8174b.getContext());
                    }
                }
                m8174b.mo8136f(m8753J0, interfaceC0800l);
            }
            Object m8171y = m8174b.m8171y();
            if (m8171y == AbstractC0024c.m76e()) {
                AbstractC0064h.m164c(interfaceC7157e);
            }
            return m8171y;
        } catch (Throwable th) {
            m8174b.m8154M();
            throw th;
        }
    }

    /* renamed from: x */
    public final void m8798x(C2592j c2592j, long j7) {
        C2846G c2846g;
        Object m10339b = AbstractC2868m.m10339b(null, 1, null);
        loop0: while (c2592j != null) {
            for (int i7 = AbstractC2585c.f7586b - 1; -1 < i7; i7--) {
                if ((c2592j.f8806c * AbstractC2585c.f7586b) + i7 < j7) {
                    break loop0;
                }
                while (true) {
                    Object m8860B = c2592j.m8860B(i7);
                    if (m8860B != null) {
                        c2846g = AbstractC2585c.f7589e;
                        if (m8860B != c2846g) {
                            if (!(m8860B instanceof C2603u)) {
                                if (!(m8860B instanceof InterfaceC2366Z0)) {
                                    break;
                                }
                                if (c2592j.m8868v(i7, m8860B, AbstractC2585c.m8843z())) {
                                    m10339b = AbstractC2868m.m10340c(m10339b, m8860B);
                                    c2592j.m8861C(i7, true);
                                    break;
                                }
                            } else {
                                if (c2592j.m8868v(i7, m8860B, AbstractC2585c.m8843z())) {
                                    m10339b = AbstractC2868m.m10340c(m10339b, ((C2603u) m8860B).f7621a);
                                    c2592j.m8861C(i7, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (c2592j.m8868v(i7, m8860B, AbstractC2585c.m8843z())) {
                        c2592j.m10256t();
                        break;
                    }
                }
            }
            c2592j = (C2592j) c2592j.m10317h();
        }
        if (m10339b != null) {
            if (!(m10339b instanceof ArrayList)) {
                m8801y0((InterfaceC2366Z0) m10339b);
                return;
            }
            AbstractC5469l.m23026c(m10339b, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) m10339b;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                m8801y0((InterfaceC2366Z0) arrayList.get(size));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (p146U5.C2592j) r12.m10317h();
     */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8799x0(p146U5.C2592j r12) {
        /*
            r11 = this;
            J5.l r0 = r11.f7577b
            r1 = 0
            r2 = 1
            java.lang.Object r3 = p167X5.AbstractC2868m.m10339b(r1, r2, r1)
        L8:
            int r4 = p146U5.AbstractC2585c.f7586b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f8806c
            int r8 = p146U5.AbstractC2585c.f7586b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.m8860B(r4)
            X5.G r9 = p146U5.AbstractC2585c.m8823f()
            if (r8 == r9) goto Lbb
            X5.G r9 = p146U5.AbstractC2585c.f7588d
            if (r8 != r9) goto L48
            long r9 = r11.m8762R()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            X5.G r9 = p146U5.AbstractC2585c.m8843z()
            boolean r8 = r12.m8868v(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.m8859A(r4)
            X5.P r1 = p167X5.AbstractC2880y.m10397c(r0, r5, r1)
        L40:
            r12.m8869w(r4)
            r12.m10256t()
            goto Laf
        L48:
            X5.G r9 = p146U5.AbstractC2585c.m8828k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof p132S5.InterfaceC2366Z0
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof p146U5.C2603u
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            X5.G r9 = p146U5.AbstractC2585c.m8833p()
            if (r8 == r9) goto Lbb
            X5.G r9 = p146U5.AbstractC2585c.m8834q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            X5.G r9 = p146U5.AbstractC2585c.m8833p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.m8762R()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof p146U5.C2603u
            if (r9 == 0) goto L80
            r9 = r8
            U5.u r9 = (p146U5.C2603u) r9
            S5.Z0 r9 = r9.f7621a
            goto L83
        L80:
            r9 = r8
            S5.Z0 r9 = (p132S5.InterfaceC2366Z0) r9
        L83:
            X5.G r10 = p146U5.AbstractC2585c.m8843z()
            boolean r8 = r12.m8868v(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.m8859A(r4)
            X5.P r1 = p167X5.AbstractC2880y.m10397c(r0, r5, r1)
        L97:
            java.lang.Object r3 = p167X5.AbstractC2868m.m10340c(r3, r9)
            r12.m8869w(r4)
            r12.m10256t()
            goto Laf
        La2:
            X5.G r9 = p146U5.AbstractC2585c.m8843z()
            boolean r8 = r12.m8868v(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.m10256t()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            X5.e r12 = r12.m10317h()
            U5.j r12 = (p146U5.C2592j) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            S5.Z0 r3 = (p132S5.InterfaceC2366Z0) r3
            r11.m8803z0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            kotlin.jvm.internal.AbstractC5469l.m23026c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            S5.Z0 r0 = (p132S5.InterfaceC2366Z0) r0
            r11.m8803z0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p146U5.C2584b.m8799x0(U5.j):void");
    }

    /* renamed from: y */
    public final C2592j m8800y() {
        Object obj = f7573q.get(this);
        C2592j c2592j = (C2592j) f7571o.get(this);
        if (c2592j.f8806c > ((C2592j) obj).f8806c) {
            obj = c2592j;
        }
        C2592j c2592j2 = (C2592j) f7572p.get(this);
        if (c2592j2.f8806c > ((C2592j) obj).f8806c) {
            obj = c2592j2;
        }
        return (C2592j) AbstractC2859d.m10307b((AbstractC2860e) obj);
    }

    /* renamed from: y0 */
    public final void m8801y0(InterfaceC2366Z0 interfaceC2366Z0) {
        m8737A0(interfaceC2366Z0, true);
    }

    /* renamed from: z */
    public boolean m8802z(Throwable th, boolean z6) {
        C2846G c2846g;
        if (z6) {
            m8780j0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7574r;
        c2846g = AbstractC2585c.f7603s;
        boolean m27343a = AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, c2846g, th);
        if (z6) {
            m8782k0();
        } else {
            m8783l0();
        }
        m8739C();
        m8785n0();
        if (m27343a) {
            m8767a0();
        }
        return m27343a;
    }

    /* renamed from: z0 */
    public final void m8803z0(InterfaceC2366Z0 interfaceC2366Z0) {
        m8737A0(interfaceC2366Z0, false);
    }

    /* renamed from: n0 */
    public void m8785n0() {
    }

    /* renamed from: r0 */
    public void m8790r0() {
    }

    /* renamed from: s0 */
    public void m8792s0() {
    }
}
