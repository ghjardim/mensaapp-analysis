package p132S5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5457A;
import kotlin.jvm.internal.AbstractC5467j;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.C5480w;
import p006A5.AbstractC0023b;
import p006A5.AbstractC0024c;
import p013B5.AbstractC0064h;
import p013B5.AbstractC0067k;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p069J5.InterfaceC0805q;
import p118Q5.AbstractC2212e;
import p118Q5.AbstractC2213f;
import p118Q5.InterfaceC2210c;
import p132S5.InterfaceC2403r0;
import p132S5.InterfaceC2409u0;
import p167X5.AbstractC2872q;
import p167X5.AbstractC2881z;
import p167X5.C2846G;
import p167X5.C2873r;
import p189a6.C3181b;
import p189a6.C3183d;
import p189a6.InterfaceC3180a;
import p189a6.InterfaceC3182c;
import p189a6.InterfaceC3184e;
import p207d.AbstractC4094d;
import p350u.AbstractC6581b;
import p371w5.AbstractC6918a;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.C0 */
/* loaded from: classes2.dex */
public class C2321C0 implements InterfaceC2409u0, InterfaceC2410v, InterfaceC2337K0 {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7027a = AtomicReferenceFieldUpdater.newUpdater(C2321C0.class, Object.class, "_state$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7028b = AtomicReferenceFieldUpdater.newUpdater(C2321C0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: S5.C0$a */
    public static final class a extends C2396o {

        /* renamed from: p */
        public final C2321C0 f7029p;

        public a(InterfaceC7157e interfaceC7157e, C2321C0 c2321c0) {
            super(interfaceC7157e, 1);
            this.f7029p = c2321c0;
        }

        @Override // p132S5.C2396o
        /* renamed from: K */
        public String mo7938K() {
            return "AwaitContinuation";
        }

        @Override // p132S5.C2396o
        /* renamed from: w */
        public Throwable mo7939w(InterfaceC2409u0 interfaceC2409u0) {
            Throwable m7947e;
            Object m7914b0 = this.f7029p.m7914b0();
            return (!(m7914b0 instanceof c) || (m7947e = ((c) m7914b0).m7947e()) == null) ? m7914b0 instanceof C2318B ? ((C2318B) m7914b0).f7023a : interfaceC2409u0.getCancellationException() : m7947e;
        }
    }

    /* renamed from: S5.C0$b */
    public static final class b extends AbstractC2319B0 {

        /* renamed from: e */
        public final C2321C0 f7030e;

        /* renamed from: f */
        public final c f7031f;

        /* renamed from: n */
        public final C2408u f7032n;

        /* renamed from: o */
        public final Object f7033o;

        public b(C2321C0 c2321c0, c cVar, C2408u c2408u, Object obj) {
            this.f7030e = c2321c0;
            this.f7031f = cVar;
            this.f7032n = c2408u;
            this.f7033o = obj;
        }

        @Override // p132S5.InterfaceC2403r0
        /* renamed from: a */
        public void mo7940a(Throwable th) {
            this.f7030e.m7902P(this.f7031f, this.f7032n, this.f7033o);
        }
    }

    /* renamed from: S5.C0$c */
    public static final class c implements InterfaceC2399p0 {

        /* renamed from: b */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f7034b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7035c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f7036d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a */
        public final C2331H0 f7037a;

        public c(C2331H0 c2331h0, boolean z6, Throwable th) {
            this.f7037a = c2331h0;
            this._isCompleting$volatile = z6 ? 1 : 0;
            this._rootCause$volatile = th;
        }

        /* renamed from: a */
        public final void m7944a(Throwable th) {
            Throwable m7947e = m7947e();
            if (m7947e == null) {
                m7954o(th);
                return;
            }
            if (th == m7947e) {
                return;
            }
            Object m7946d = m7946d();
            if (m7946d == null) {
                m7953n(th);
                return;
            }
            if (m7946d instanceof Throwable) {
                if (th == m7946d) {
                    return;
                }
                ArrayList m7945b = m7945b();
                m7945b.add(m7946d);
                m7945b.add(th);
                m7953n(m7945b);
                return;
            }
            if (m7946d instanceof ArrayList) {
                ((ArrayList) m7946d).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + m7946d).toString());
        }

        /* renamed from: b */
        public final ArrayList m7945b() {
            return new ArrayList(4);
        }

        @Override // p132S5.InterfaceC2399p0
        /* renamed from: c */
        public C2331H0 mo7865c() {
            return this.f7037a;
        }

        /* renamed from: d */
        public final Object m7946d() {
            return f7036d.get(this);
        }

        /* renamed from: e */
        public final Throwable m7947e() {
            return (Throwable) f7035c.get(this);
        }

        /* renamed from: i */
        public final boolean m7948i() {
            return m7947e() != null;
        }

        @Override // p132S5.InterfaceC2399p0
        public boolean isActive() {
            return m7947e() == null;
        }

        /* renamed from: j */
        public final boolean m7949j() {
            return f7034b.get(this) != 0;
        }

        /* renamed from: k */
        public final boolean m7950k() {
            C2846G c2846g;
            Object m7946d = m7946d();
            c2846g = AbstractC2323D0.f7054e;
            return m7946d == c2846g;
        }

        /* renamed from: l */
        public final List m7951l(Throwable th) {
            ArrayList arrayList;
            C2846G c2846g;
            Object m7946d = m7946d();
            if (m7946d == null) {
                arrayList = m7945b();
            } else if (m7946d instanceof Throwable) {
                ArrayList m7945b = m7945b();
                m7945b.add(m7946d);
                arrayList = m7945b;
            } else {
                if (!(m7946d instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + m7946d).toString());
                }
                arrayList = (ArrayList) m7946d;
            }
            Throwable m7947e = m7947e();
            if (m7947e != null) {
                arrayList.add(0, m7947e);
            }
            if (th != null && !AbstractC5469l.m23024a(th, m7947e)) {
                arrayList.add(th);
            }
            c2846g = AbstractC2323D0.f7054e;
            m7953n(c2846g);
            return arrayList;
        }

        /* renamed from: m */
        public final void m7952m(boolean z6) {
            f7034b.set(this, z6 ? 1 : 0);
        }

        /* renamed from: n */
        public final void m7953n(Object obj) {
            f7036d.set(this, obj);
        }

        /* renamed from: o */
        public final void m7954o(Throwable th) {
            f7035c.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + m7948i() + ", completing=" + m7949j() + ", rootCause=" + m7947e() + ", exceptions=" + m7946d() + ", list=" + mo7865c() + ']';
        }
    }

    /* renamed from: S5.C0$d */
    public final class d extends AbstractC2319B0 {
        public d(InterfaceC3184e interfaceC3184e) {
        }

        @Override // p132S5.InterfaceC2403r0
        /* renamed from: a */
        public void mo7940a(Throwable th) {
            Object m7914b0 = C2321C0.this.m7914b0();
            if (!(m7914b0 instanceof C2318B)) {
                AbstractC2323D0.m7968h(m7914b0);
            }
            throw null;
        }
    }

    /* renamed from: S5.C0$e */
    public final class e extends AbstractC2319B0 {
        public e(InterfaceC3184e interfaceC3184e) {
        }

        @Override // p132S5.InterfaceC2403r0
        /* renamed from: a */
        public void mo7940a(Throwable th) {
            C6934q c6934q = C6934q.f24811a;
            throw null;
        }
    }

    /* renamed from: S5.C0$f */
    public static final class f extends C2873r.a {

        /* renamed from: d */
        public final /* synthetic */ C2321C0 f7040d;

        /* renamed from: e */
        public final /* synthetic */ Object f7041e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C2873r c2873r, C2321C0 c2321c0, Object obj) {
            super(c2873r);
            this.f7040d = c2321c0;
            this.f7041e = obj;
        }

        @Override // p167X5.AbstractC2857b
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Object mo7955e(C2873r c2873r) {
            if (this.f7040d.m7914b0() == this.f7041e) {
                return null;
            }
            return AbstractC2872q.m10348a();
        }
    }

    /* renamed from: S5.C0$g */
    public static final class g extends AbstractC0067k implements InterfaceC0804p {

        /* renamed from: b */
        public Object f7042b;

        /* renamed from: c */
        public Object f7043c;

        /* renamed from: d */
        public int f7044d;

        /* renamed from: e */
        public /* synthetic */ Object f7045e;

        public g(InterfaceC7157e interfaceC7157e) {
            super(2, interfaceC7157e);
        }

        @Override // p069J5.InterfaceC0804p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2212e abstractC2212e, InterfaceC7157e interfaceC7157e) {
            return ((g) create(abstractC2212e, interfaceC7157e)).invokeSuspend(C6934q.f24811a);
        }

        @Override // p013B5.AbstractC0057a
        public final InterfaceC7157e create(Object obj, InterfaceC7157e interfaceC7157e) {
            g gVar = C2321C0.this.new g(interfaceC7157e);
            gVar.f7045e = obj;
            return gVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // p013B5.AbstractC0057a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p006A5.AbstractC0024c.m76e()
                int r1 = r6.f7044d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.f7043c
                X5.r r1 = (p167X5.C2873r) r1
                java.lang.Object r3 = r6.f7042b
                X5.p r3 = (p167X5.AbstractC2871p) r3
                java.lang.Object r4 = r6.f7045e
                Q5.e r4 = (p118Q5.AbstractC2212e) r4
                p371w5.AbstractC6928k.m28382b(r7)
                goto L81
            L1e:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L26:
                p371w5.AbstractC6928k.m28382b(r7)
                goto L86
            L2a:
                p371w5.AbstractC6928k.m28382b(r7)
                java.lang.Object r7 = r6.f7045e
                Q5.e r7 = (p118Q5.AbstractC2212e) r7
                S5.C0 r1 = p132S5.C2321C0.this
                java.lang.Object r1 = r1.m7914b0()
                boolean r4 = r1 instanceof p132S5.C2408u
                if (r4 == 0) goto L48
                S5.u r1 = (p132S5.C2408u) r1
                S5.v r1 = r1.f7156e
                r6.f7044d = r3
                java.lang.Object r7 = r7.mo7611a(r1, r6)
                if (r7 != r0) goto L86
                return r0
            L48:
                boolean r3 = r1 instanceof p132S5.InterfaceC2399p0
                if (r3 == 0) goto L86
                S5.p0 r1 = (p132S5.InterfaceC2399p0) r1
                S5.H0 r1 = r1.mo7865c()
                if (r1 == 0) goto L86
                java.lang.Object r3 = r1.m10358k()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                kotlin.jvm.internal.AbstractC5469l.m23026c(r3, r4)
                X5.r r3 = (p167X5.C2873r) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L63:
                boolean r7 = kotlin.jvm.internal.AbstractC5469l.m23024a(r1, r3)
                if (r7 != 0) goto L86
                boolean r7 = r1 instanceof p132S5.C2408u
                if (r7 == 0) goto L81
                r7 = r1
                S5.u r7 = (p132S5.C2408u) r7
                S5.v r7 = r7.f7156e
                r6.f7045e = r4
                r6.f7042b = r3
                r6.f7043c = r1
                r6.f7044d = r2
                java.lang.Object r7 = r4.mo7611a(r7, r6)
                if (r7 != r0) goto L81
                return r0
            L81:
                X5.r r1 = r1.m10359l()
                goto L63
            L86:
                w5.q r7 = p371w5.C6934q.f24811a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p132S5.C2321C0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: S5.C0$h */
    public /* synthetic */ class h extends AbstractC5467j implements InterfaceC0805q {

        /* renamed from: a */
        public static final h f7047a = new h();

        public h() {
            super(3, C2321C0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3350c(Object obj, Object obj2, Object obj3) {
            AbstractC4094d.m17162a(obj2);
            m7958f((C2321C0) obj, null, obj3);
            return C6934q.f24811a;
        }

        /* renamed from: f */
        public final void m7958f(C2321C0 c2321c0, InterfaceC3184e interfaceC3184e, Object obj) {
            c2321c0.m7931u0(interfaceC3184e, obj);
        }
    }

    /* renamed from: S5.C0$i */
    public /* synthetic */ class i extends AbstractC5467j implements InterfaceC0805q {

        /* renamed from: a */
        public static final i f7048a = new i();

        public i() {
            super(3, C2321C0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object mo3350c(C2321C0 c2321c0, Object obj, Object obj2) {
            return c2321c0.m7930t0(obj, obj2);
        }
    }

    /* renamed from: S5.C0$j */
    public /* synthetic */ class j extends AbstractC5467j implements InterfaceC0805q {

        /* renamed from: a */
        public static final j f7049a = new j();

        public j() {
            super(3, C2321C0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // p069J5.InterfaceC0805q
        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo3350c(Object obj, Object obj2, Object obj3) {
            AbstractC4094d.m17162a(obj2);
            m7960f((C2321C0) obj, null, obj3);
            return C6934q.f24811a;
        }

        /* renamed from: f */
        public final void m7960f(C2321C0 c2321c0, InterfaceC3184e interfaceC3184e, Object obj) {
            c2321c0.m7876A0(interfaceC3184e, obj);
        }
    }

    public C2321C0(boolean z6) {
        this._state$volatile = z6 ? AbstractC2323D0.f7056g : AbstractC2323D0.f7055f;
    }

    /* renamed from: G0 */
    public static /* synthetic */ CancellationException m7869G0(C2321C0 c2321c0, Throwable th, String str, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i7 & 1) != 0) {
            str = null;
        }
        return c2321c0.m7886F0(th, str);
    }

    /* renamed from: A0 */
    public final void m7876A0(InterfaceC3184e interfaceC3184e, Object obj) {
        if (m7920j0()) {
            interfaceC3184e.m11595a(AbstractC2317A0.m7859k(this, false, false, new e(interfaceC3184e), 3, null));
        } else {
            interfaceC3184e.m11596b(C6934q.f24811a);
        }
    }

    /* renamed from: B */
    public final boolean m7877B(Object obj, C2331H0 c2331h0, AbstractC2319B0 abstractC2319B0) {
        int m10364u;
        f fVar = new f(abstractC2319B0, this, obj);
        do {
            m10364u = c2331h0.m10360m().m10364u(abstractC2319B0, c2331h0, fVar);
            if (m10364u == 1) {
                return true;
            }
        } while (m10364u != 2);
        return false;
    }

    /* renamed from: B0 */
    public final void m7878B0(AbstractC2319B0 abstractC2319B0) {
        Object m7914b0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2375d0 c2375d0;
        do {
            m7914b0 = m7914b0();
            if (!(m7914b0 instanceof AbstractC2319B0)) {
                if (!(m7914b0 instanceof InterfaceC2399p0) || ((InterfaceC2399p0) m7914b0).mo7865c() == null) {
                    return;
                }
                abstractC2319B0.m10361r();
                return;
            }
            if (m7914b0 != abstractC2319B0) {
                return;
            }
            atomicReferenceFieldUpdater = f7027a;
            c2375d0 = AbstractC2323D0.f7056g;
        } while (!AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, m7914b0, c2375d0));
    }

    @Override // p132S5.InterfaceC2410v
    /* renamed from: C */
    public final void mo7879C(InterfaceC2337K0 interfaceC2337K0) {
        m7890I(interfaceC2337K0);
    }

    /* renamed from: C0 */
    public final void m7880C0(InterfaceC2406t interfaceC2406t) {
        f7028b.set(this, interfaceC2406t);
    }

    /* renamed from: D */
    public final void m7881D(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC6918a.m28362a(th, th2);
            }
        }
    }

    /* renamed from: D0 */
    public final int m7882D0(Object obj) {
        C2375d0 c2375d0;
        if (!(obj instanceof C2375d0)) {
            if (!(obj instanceof C2397o0)) {
                return 0;
            }
            if (!AbstractC6581b.m27343a(f7027a, this, obj, ((C2397o0) obj).mo7865c())) {
                return -1;
            }
            mo7935x0();
            return 1;
        }
        if (((C2375d0) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7027a;
        c2375d0 = AbstractC2323D0.f7056g;
        if (!AbstractC6581b.m27343a(atomicReferenceFieldUpdater, this, obj, c2375d0)) {
            return -1;
        }
        mo7935x0();
        return 1;
    }

    /* renamed from: E0 */
    public final String m7884E0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC2399p0 ? ((InterfaceC2399p0) obj).isActive() ? "Active" : "New" : obj instanceof C2318B ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.m7948i() ? "Cancelling" : cVar.m7949j() ? "Completing" : "Active";
    }

    /* renamed from: F */
    public final Object m7885F(InterfaceC7157e interfaceC7157e) {
        Object m7914b0;
        do {
            m7914b0 = m7914b0();
            if (!(m7914b0 instanceof InterfaceC2399p0)) {
                if (m7914b0 instanceof C2318B) {
                    throw ((C2318B) m7914b0).f7023a;
                }
                return AbstractC2323D0.m7968h(m7914b0);
            }
        } while (m7882D0(m7914b0) < 0);
        return m7887G(interfaceC7157e);
    }

    /* renamed from: F0 */
    public final CancellationException m7886F0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo7898M();
            }
            cancellationException = new C2411v0(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: G */
    public final Object m7887G(InterfaceC7157e interfaceC7157e) {
        a aVar = new a(AbstractC0023b.m74c(interfaceC7157e), this);
        aVar.m8147E();
        AbstractC2400q.m8173a(aVar, AbstractC2317A0.m7859k(this, false, false, new C2339L0(aVar), 3, null));
        Object m8171y = aVar.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y;
    }

    /* renamed from: H */
    public final boolean m7888H(Throwable th) {
        return m7890I(th);
    }

    /* renamed from: H0 */
    public final String m7889H0() {
        return mo7926p0() + '{' + m7884E0(m7914b0()) + '}';
    }

    /* renamed from: I */
    public final boolean m7890I(Object obj) {
        Object obj2;
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        obj2 = AbstractC2323D0.f7050a;
        if (mo7911Y() && (obj2 = m7894K(obj)) == AbstractC2323D0.f7051b) {
            return true;
        }
        c2846g = AbstractC2323D0.f7050a;
        if (obj2 == c2846g) {
            obj2 = m7922l0(obj);
        }
        c2846g2 = AbstractC2323D0.f7050a;
        if (obj2 == c2846g2 || obj2 == AbstractC2323D0.f7051b) {
            return true;
        }
        c2846g3 = AbstractC2323D0.f7053d;
        if (obj2 == c2846g3) {
            return false;
        }
        mo7883E(obj2);
        return true;
    }

    /* renamed from: I0 */
    public final boolean m7891I0(InterfaceC2399p0 interfaceC2399p0, Object obj) {
        if (!AbstractC6581b.m27343a(f7027a, this, interfaceC2399p0, AbstractC2323D0.m7967g(obj))) {
            return false;
        }
        m7932v0(null);
        mo7934w0(obj);
        m7901O(interfaceC2399p0, obj);
        return true;
    }

    /* renamed from: J */
    public void mo7892J(Throwable th) {
        m7890I(th);
    }

    /* renamed from: J0 */
    public final boolean m7893J0(InterfaceC2399p0 interfaceC2399p0, Throwable th) {
        C2331H0 m7912Z = m7912Z(interfaceC2399p0);
        if (m7912Z == null) {
            return false;
        }
        if (!AbstractC6581b.m27343a(f7027a, this, interfaceC2399p0, new c(m7912Z, false, th))) {
            return false;
        }
        m7928r0(m7912Z, th);
        return true;
    }

    /* renamed from: K */
    public final Object m7894K(Object obj) {
        C2846G c2846g;
        Object m7895K0;
        C2846G c2846g2;
        do {
            Object m7914b0 = m7914b0();
            if (!(m7914b0 instanceof InterfaceC2399p0) || ((m7914b0 instanceof c) && ((c) m7914b0).m7949j())) {
                c2846g = AbstractC2323D0.f7050a;
                return c2846g;
            }
            m7895K0 = m7895K0(m7914b0, new C2318B(m7903Q(obj), false, 2, null));
            c2846g2 = AbstractC2323D0.f7052c;
        } while (m7895K0 == c2846g2);
        return m7895K0;
    }

    /* renamed from: K0 */
    public final Object m7895K0(Object obj, Object obj2) {
        C2846G c2846g;
        C2846G c2846g2;
        if (!(obj instanceof InterfaceC2399p0)) {
            c2846g2 = AbstractC2323D0.f7050a;
            return c2846g2;
        }
        if ((!(obj instanceof C2375d0) && !(obj instanceof AbstractC2319B0)) || (obj instanceof C2408u) || (obj2 instanceof C2318B)) {
            return m7897L0((InterfaceC2399p0) obj, obj2);
        }
        if (m7891I0((InterfaceC2399p0) obj, obj2)) {
            return obj2;
        }
        c2846g = AbstractC2323D0.f7052c;
        return c2846g;
    }

    /* renamed from: L */
    public final boolean m7896L(Throwable th) {
        if (mo7919i0()) {
            return true;
        }
        boolean z6 = th instanceof CancellationException;
        InterfaceC2406t m7913a0 = m7913a0();
        return (m7913a0 == null || m7913a0 == C2333I0.f7067a) ? z6 : m7913a0.mo7994f(th) || z6;
    }

    /* renamed from: L0 */
    public final Object m7897L0(InterfaceC2399p0 interfaceC2399p0, Object obj) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2331H0 m7912Z = m7912Z(interfaceC2399p0);
        if (m7912Z == null) {
            c2846g3 = AbstractC2323D0.f7052c;
            return c2846g3;
        }
        c cVar = interfaceC2399p0 instanceof c ? (c) interfaceC2399p0 : null;
        if (cVar == null) {
            cVar = new c(m7912Z, false, null);
        }
        C5480w c5480w = new C5480w();
        synchronized (cVar) {
            if (cVar.m7949j()) {
                c2846g2 = AbstractC2323D0.f7050a;
                return c2846g2;
            }
            cVar.m7952m(true);
            if (cVar != interfaceC2399p0 && !AbstractC6581b.m27343a(f7027a, this, interfaceC2399p0, cVar)) {
                c2846g = AbstractC2323D0.f7052c;
                return c2846g;
            }
            boolean m7948i = cVar.m7948i();
            C2318B c2318b = obj instanceof C2318B ? (C2318B) obj : null;
            if (c2318b != null) {
                cVar.m7944a(c2318b.f7023a);
            }
            Throwable m7947e = m7948i ? null : cVar.m7947e();
            c5480w.f19710a = m7947e;
            C6934q c6934q = C6934q.f24811a;
            if (m7947e != null) {
                m7928r0(m7912Z, m7947e);
            }
            C2408u m7905S = m7905S(interfaceC2399p0);
            return (m7905S == null || !m7899M0(cVar, m7905S, obj)) ? m7904R(cVar, obj) : AbstractC2323D0.f7051b;
        }
    }

    /* renamed from: M */
    public String mo7898M() {
        return "Job was cancelled";
    }

    /* renamed from: M0 */
    public final boolean m7899M0(c cVar, C2408u c2408u, Object obj) {
        while (AbstractC2317A0.m7859k(c2408u.f7156e, false, false, new b(this, cVar, c2408u, obj), 1, null) == C2333I0.f7067a) {
            c2408u = m7927q0(c2408u);
            if (c2408u == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public boolean mo7900N(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m7890I(th) && mo7909W();
    }

    /* renamed from: O */
    public final void m7901O(InterfaceC2399p0 interfaceC2399p0, Object obj) {
        InterfaceC2406t m7913a0 = m7913a0();
        if (m7913a0 != null) {
            m7913a0.mo7864b();
            m7880C0(C2333I0.f7067a);
        }
        C2318B c2318b = obj instanceof C2318B ? (C2318B) obj : null;
        Throwable th = c2318b != null ? c2318b.f7023a : null;
        if (!(interfaceC2399p0 instanceof AbstractC2319B0)) {
            C2331H0 mo7865c = interfaceC2399p0.mo7865c();
            if (mo7865c != null) {
                m7929s0(mo7865c, th);
                return;
            }
            return;
        }
        try {
            ((AbstractC2319B0) interfaceC2399p0).mo7940a(th);
        } catch (Throwable th2) {
            mo7916f0(new C2322D("Exception in completion handler " + interfaceC2399p0 + " for " + this, th2));
        }
    }

    /* renamed from: P */
    public final void m7902P(c cVar, C2408u c2408u, Object obj) {
        C2408u m7927q0 = m7927q0(c2408u);
        if (m7927q0 == null || !m7899M0(cVar, m7927q0, obj)) {
            mo7883E(m7904R(cVar, obj));
        }
    }

    /* renamed from: Q */
    public final Throwable m7903Q(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C2411v0(mo7898M(), null, this) : th;
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((InterfaceC2337K0) obj).mo7933w();
    }

    /* renamed from: R */
    public final Object m7904R(c cVar, Object obj) {
        boolean m7948i;
        Throwable m7908V;
        C2318B c2318b = obj instanceof C2318B ? (C2318B) obj : null;
        Throwable th = c2318b != null ? c2318b.f7023a : null;
        synchronized (cVar) {
            m7948i = cVar.m7948i();
            List m7951l = cVar.m7951l(th);
            m7908V = m7908V(cVar, m7951l);
            if (m7908V != null) {
                m7881D(m7908V, m7951l);
            }
        }
        if (m7908V != null && m7908V != th) {
            obj = new C2318B(m7908V, false, 2, null);
        }
        if (m7908V != null && (m7896L(m7908V) || mo7915e0(m7908V))) {
            AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C2318B) obj).m7863c();
        }
        if (!m7948i) {
            m7932v0(m7908V);
        }
        mo7934w0(obj);
        AbstractC6581b.m27343a(f7027a, this, cVar, AbstractC2323D0.m7967g(obj));
        m7901O(cVar, obj);
        return obj;
    }

    /* renamed from: S */
    public final C2408u m7905S(InterfaceC2399p0 interfaceC2399p0) {
        C2408u c2408u = interfaceC2399p0 instanceof C2408u ? (C2408u) interfaceC2399p0 : null;
        if (c2408u != null) {
            return c2408u;
        }
        C2331H0 mo7865c = interfaceC2399p0.mo7865c();
        if (mo7865c != null) {
            return m7927q0(mo7865c);
        }
        return null;
    }

    /* renamed from: T */
    public final Object m7906T() {
        Object m7914b0 = m7914b0();
        if (m7914b0 instanceof InterfaceC2399p0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (m7914b0 instanceof C2318B) {
            throw ((C2318B) m7914b0).f7023a;
        }
        return AbstractC2323D0.m7968h(m7914b0);
    }

    /* renamed from: U */
    public final Throwable m7907U(Object obj) {
        C2318B c2318b = obj instanceof C2318B ? (C2318B) obj : null;
        if (c2318b != null) {
            return c2318b.f7023a;
        }
        return null;
    }

    /* renamed from: V */
    public final Throwable m7908V(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.m7948i()) {
                return new C2411v0(mo7898M(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) list.get(0);
        if (th2 instanceof C2354T0) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof C2354T0)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* renamed from: W */
    public boolean mo7909W() {
        return true;
    }

    /* renamed from: X */
    public final InterfaceC3182c m7910X() {
        h hVar = h.f7047a;
        AbstractC5469l.m23026c(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        InterfaceC0805q interfaceC0805q = (InterfaceC0805q) AbstractC5457A.m23004b(hVar, 3);
        i iVar = i.f7048a;
        AbstractC5469l.m23026c(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C3183d(this, interfaceC0805q, (InterfaceC0805q) AbstractC5457A.m23004b(iVar, 3), null, 8, null);
    }

    /* renamed from: Y */
    public boolean mo7911Y() {
        return false;
    }

    /* renamed from: Z */
    public final C2331H0 m7912Z(InterfaceC2399p0 interfaceC2399p0) {
        C2331H0 mo7865c = interfaceC2399p0.mo7865c();
        if (mo7865c != null) {
            return mo7865c;
        }
        if (interfaceC2399p0 instanceof C2375d0) {
            return new C2331H0();
        }
        if (interfaceC2399p0 instanceof AbstractC2319B0) {
            m7937z0((AbstractC2319B0) interfaceC2399p0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC2399p0).toString());
    }

    /* renamed from: a0 */
    public final InterfaceC2406t m7913a0() {
        return (InterfaceC2406t) f7028b.get(this);
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2406t attachChild(InterfaceC2410v interfaceC2410v) {
        InterfaceC2368a0 m7859k = AbstractC2317A0.m7859k(this, true, false, new C2408u(interfaceC2410v), 2, null);
        AbstractC5469l.m23026c(m7859k, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (InterfaceC2406t) m7859k;
    }

    /* renamed from: b0 */
    public final Object m7914b0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7027a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2881z)) {
                return obj;
            }
            ((AbstractC2881z) obj).mo10302a(this);
        }
    }

    @Override // p132S5.InterfaceC2409u0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    /* renamed from: e0 */
    public boolean mo7915e0(Throwable th) {
        return false;
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public Object fold(Object obj, InterfaceC0804p interfaceC0804p) {
        return InterfaceC2409u0.a.m8181c(this, obj, interfaceC0804p);
    }

    /* renamed from: g0 */
    public final void m7917g0(InterfaceC2409u0 interfaceC2409u0) {
        if (interfaceC2409u0 == null) {
            m7880C0(C2333I0.f7067a);
            return;
        }
        interfaceC2409u0.start();
        InterfaceC2406t attachChild = interfaceC2409u0.attachChild(this);
        m7880C0(attachChild);
        if (isCompleted()) {
            attachChild.mo7864b();
            m7880C0(C2333I0.f7067a);
        }
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i.b get(InterfaceC7161i.c cVar) {
        return InterfaceC2409u0.a.m8182d(this, cVar);
    }

    @Override // p132S5.InterfaceC2409u0
    public final CancellationException getCancellationException() {
        Object m7914b0 = m7914b0();
        if (!(m7914b0 instanceof c)) {
            if (m7914b0 instanceof InterfaceC2399p0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (m7914b0 instanceof C2318B) {
                return m7869G0(this, ((C2318B) m7914b0).f7023a, null, 1, null);
            }
            return new C2411v0(AbstractC2342N.m8004a(this) + " has completed normally", null, this);
        }
        Throwable m7947e = ((c) m7914b0).m7947e();
        if (m7947e != null) {
            CancellationException m7886F0 = m7886F0(m7947e, AbstractC2342N.m8004a(this) + " is cancelling");
            if (m7886F0 != null) {
                return m7886F0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2210c getChildren() {
        return AbstractC2213f.m7616b(new g(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object m7914b0 = m7914b0();
        if (m7914b0 instanceof InterfaceC2399p0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return m7907U(m7914b0);
    }

    @Override // p392z5.InterfaceC7161i.b
    public final InterfaceC7161i.c getKey() {
        return InterfaceC2409u0.f7157j;
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC3180a getOnJoin() {
        j jVar = j.f7049a;
        AbstractC5469l.m23026c(jVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C3181b(this, (InterfaceC0805q) AbstractC5457A.m23004b(jVar, 3), null, 4, null);
    }

    @Override // p132S5.InterfaceC2409u0
    public InterfaceC2409u0 getParent() {
        InterfaceC2406t m7913a0 = m7913a0();
        if (m7913a0 != null) {
            return m7913a0.getParent();
        }
        return null;
    }

    /* renamed from: h0 */
    public final InterfaceC2368a0 m7918h0(boolean z6, boolean z7, InterfaceC2403r0 interfaceC2403r0) {
        AbstractC2319B0 m7925o0 = m7925o0(interfaceC2403r0, z6);
        while (true) {
            Object m7914b0 = m7914b0();
            if (m7914b0 instanceof C2375d0) {
                C2375d0 c2375d0 = (C2375d0) m7914b0;
                if (!c2375d0.isActive()) {
                    m7936y0(c2375d0);
                } else if (AbstractC6581b.m27343a(f7027a, this, m7914b0, m7925o0)) {
                    return m7925o0;
                }
            } else {
                if (!(m7914b0 instanceof InterfaceC2399p0)) {
                    if (z7) {
                        C2318B c2318b = m7914b0 instanceof C2318B ? (C2318B) m7914b0 : null;
                        interfaceC2403r0.mo7940a(c2318b != null ? c2318b.f7023a : null);
                    }
                    return C2333I0.f7067a;
                }
                C2331H0 mo7865c = ((InterfaceC2399p0) m7914b0).mo7865c();
                if (mo7865c == null) {
                    AbstractC5469l.m23026c(m7914b0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m7937z0((AbstractC2319B0) m7914b0);
                } else {
                    InterfaceC2368a0 interfaceC2368a0 = C2333I0.f7067a;
                    if (z6 && (m7914b0 instanceof c)) {
                        synchronized (m7914b0) {
                            try {
                                r3 = ((c) m7914b0).m7947e();
                                if (r3 != null) {
                                    if ((interfaceC2403r0 instanceof C2408u) && !((c) m7914b0).m7949j()) {
                                    }
                                    C6934q c6934q = C6934q.f24811a;
                                }
                                if (m7877B(m7914b0, mo7865c, m7925o0)) {
                                    if (r3 == null) {
                                        return m7925o0;
                                    }
                                    interfaceC2368a0 = m7925o0;
                                    C6934q c6934q2 = C6934q.f24811a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z7) {
                            interfaceC2403r0.mo7940a(r3);
                        }
                        return interfaceC2368a0;
                    }
                    if (m7877B(m7914b0, mo7865c, m7925o0)) {
                        return m7925o0;
                    }
                }
            }
        }
    }

    /* renamed from: i0 */
    public boolean mo7919i0() {
        return false;
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2368a0 invokeOnCompletion(InterfaceC0800l interfaceC0800l) {
        return m7918h0(false, true, new InterfaceC2403r0.a(interfaceC0800l));
    }

    @Override // p132S5.InterfaceC2409u0
    public boolean isActive() {
        Object m7914b0 = m7914b0();
        return (m7914b0 instanceof InterfaceC2399p0) && ((InterfaceC2399p0) m7914b0).isActive();
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean isCancelled() {
        Object m7914b0 = m7914b0();
        return (m7914b0 instanceof C2318B) || ((m7914b0 instanceof c) && ((c) m7914b0).m7948i());
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean isCompleted() {
        return !(m7914b0() instanceof InterfaceC2399p0);
    }

    /* renamed from: j0 */
    public final boolean m7920j0() {
        Object m7914b0;
        do {
            m7914b0 = m7914b0();
            if (!(m7914b0 instanceof InterfaceC2399p0)) {
                return false;
            }
        } while (m7882D0(m7914b0) < 0);
        return true;
    }

    @Override // p132S5.InterfaceC2409u0
    public final Object join(InterfaceC7157e interfaceC7157e) {
        if (m7920j0()) {
            Object m7921k0 = m7921k0(interfaceC7157e);
            return m7921k0 == AbstractC0024c.m76e() ? m7921k0 : C6934q.f24811a;
        }
        AbstractC2417y0.m8200i(interfaceC7157e.getContext());
        return C6934q.f24811a;
    }

    /* renamed from: k0 */
    public final Object m7921k0(InterfaceC7157e interfaceC7157e) {
        C2396o c2396o = new C2396o(AbstractC0023b.m74c(interfaceC7157e), 1);
        c2396o.m8147E();
        AbstractC2400q.m8173a(c2396o, AbstractC2317A0.m7859k(this, false, false, new C2341M0(c2396o), 3, null));
        Object m8171y = c2396o.m8171y();
        if (m8171y == AbstractC0024c.m76e()) {
            AbstractC0064h.m164c(interfaceC7157e);
        }
        return m8171y == AbstractC0024c.m76e() ? m8171y : C6934q.f24811a;
    }

    /* renamed from: l0 */
    public final Object m7922l0(Object obj) {
        C2846G c2846g;
        C2846G c2846g2;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C2846G c2846g6;
        Throwable th = null;
        while (true) {
            Object m7914b0 = m7914b0();
            if (m7914b0 instanceof c) {
                synchronized (m7914b0) {
                    if (((c) m7914b0).m7950k()) {
                        c2846g2 = AbstractC2323D0.f7053d;
                        return c2846g2;
                    }
                    boolean m7948i = ((c) m7914b0).m7948i();
                    if (obj != null || !m7948i) {
                        if (th == null) {
                            th = m7903Q(obj);
                        }
                        ((c) m7914b0).m7944a(th);
                    }
                    Throwable m7947e = m7948i ? null : ((c) m7914b0).m7947e();
                    if (m7947e != null) {
                        m7928r0(((c) m7914b0).mo7865c(), m7947e);
                    }
                    c2846g = AbstractC2323D0.f7050a;
                    return c2846g;
                }
            }
            if (!(m7914b0 instanceof InterfaceC2399p0)) {
                c2846g3 = AbstractC2323D0.f7053d;
                return c2846g3;
            }
            if (th == null) {
                th = m7903Q(obj);
            }
            InterfaceC2399p0 interfaceC2399p0 = (InterfaceC2399p0) m7914b0;
            if (!interfaceC2399p0.isActive()) {
                Object m7895K0 = m7895K0(m7914b0, new C2318B(th, false, 2, null));
                c2846g5 = AbstractC2323D0.f7050a;
                if (m7895K0 == c2846g5) {
                    throw new IllegalStateException(("Cannot happen in " + m7914b0).toString());
                }
                c2846g6 = AbstractC2323D0.f7052c;
                if (m7895K0 != c2846g6) {
                    return m7895K0;
                }
            } else if (m7893J0(interfaceC2399p0, th)) {
                c2846g4 = AbstractC2323D0.f7050a;
                return c2846g4;
            }
        }
    }

    /* renamed from: m0 */
    public final boolean m7923m0(Object obj) {
        Object m7895K0;
        C2846G c2846g;
        C2846G c2846g2;
        do {
            m7895K0 = m7895K0(m7914b0(), obj);
            c2846g = AbstractC2323D0.f7050a;
            if (m7895K0 == c2846g) {
                return false;
            }
            if (m7895K0 == AbstractC2323D0.f7051b) {
                return true;
            }
            c2846g2 = AbstractC2323D0.f7052c;
        } while (m7895K0 == c2846g2);
        mo7883E(m7895K0);
        return true;
    }

    @Override // p392z5.InterfaceC7161i.b, p392z5.InterfaceC7161i
    public InterfaceC7161i minusKey(InterfaceC7161i.c cVar) {
        return InterfaceC2409u0.a.m8183e(this, cVar);
    }

    /* renamed from: n0 */
    public final Object m7924n0(Object obj) {
        Object m7895K0;
        C2846G c2846g;
        C2846G c2846g2;
        do {
            m7895K0 = m7895K0(m7914b0(), obj);
            c2846g = AbstractC2323D0.f7050a;
            if (m7895K0 == c2846g) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m7907U(obj));
            }
            c2846g2 = AbstractC2323D0.f7052c;
        } while (m7895K0 == c2846g2);
        return m7895K0;
    }

    /* renamed from: o0 */
    public final AbstractC2319B0 m7925o0(InterfaceC2403r0 interfaceC2403r0, boolean z6) {
        AbstractC2319B0 abstractC2319B0;
        if (z6) {
            abstractC2319B0 = interfaceC2403r0 instanceof AbstractC2413w0 ? (AbstractC2413w0) interfaceC2403r0 : null;
            if (abstractC2319B0 == null) {
                abstractC2319B0 = new C2405s0(interfaceC2403r0);
            }
        } else {
            abstractC2319B0 = interfaceC2403r0 instanceof AbstractC2319B0 ? (AbstractC2319B0) interfaceC2403r0 : null;
            if (abstractC2319B0 == null) {
                abstractC2319B0 = new C2407t0(interfaceC2403r0);
            }
        }
        abstractC2319B0.m7867w(this);
        return abstractC2319B0;
    }

    /* renamed from: p0 */
    public String mo7926p0() {
        return AbstractC2342N.m8004a(this);
    }

    @Override // p132S5.InterfaceC2409u0
    public InterfaceC2409u0 plus(InterfaceC2409u0 interfaceC2409u0) {
        return InterfaceC2409u0.a.m8184f(this, interfaceC2409u0);
    }

    /* renamed from: q0 */
    public final C2408u m7927q0(C2873r c2873r) {
        while (c2873r.mo10347q()) {
            c2873r = c2873r.m10360m();
        }
        while (true) {
            c2873r = c2873r.m10359l();
            if (!c2873r.mo10347q()) {
                if (c2873r instanceof C2408u) {
                    return (C2408u) c2873r;
                }
                if (c2873r instanceof C2331H0) {
                    return null;
                }
            }
        }
    }

    /* renamed from: r0 */
    public final void m7928r0(C2331H0 c2331h0, Throwable th) {
        m7932v0(th);
        Object m10358k = c2331h0.m10358k();
        AbstractC5469l.m23026c(m10358k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2322D c2322d = null;
        for (C2873r c2873r = (C2873r) m10358k; !AbstractC5469l.m23024a(c2873r, c2331h0); c2873r = c2873r.m10359l()) {
            if (c2873r instanceof AbstractC2413w0) {
                AbstractC2319B0 abstractC2319B0 = (AbstractC2319B0) c2873r;
                try {
                    abstractC2319B0.mo7940a(th);
                } catch (Throwable th2) {
                    if (c2322d != null) {
                        AbstractC6918a.m28362a(c2322d, th2);
                    } else {
                        c2322d = new C2322D("Exception in completion handler " + abstractC2319B0 + " for " + this, th2);
                        C6934q c6934q = C6934q.f24811a;
                    }
                }
            }
        }
        if (c2322d != null) {
            mo7916f0(c2322d);
        }
        m7896L(th);
    }

    /* renamed from: s0 */
    public final void m7929s0(C2331H0 c2331h0, Throwable th) {
        Object m10358k = c2331h0.m10358k();
        AbstractC5469l.m23026c(m10358k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C2322D c2322d = null;
        for (C2873r c2873r = (C2873r) m10358k; !AbstractC5469l.m23024a(c2873r, c2331h0); c2873r = c2873r.m10359l()) {
            if (c2873r instanceof AbstractC2319B0) {
                AbstractC2319B0 abstractC2319B0 = (AbstractC2319B0) c2873r;
                try {
                    abstractC2319B0.mo7940a(th);
                } catch (Throwable th2) {
                    if (c2322d != null) {
                        AbstractC6918a.m28362a(c2322d, th2);
                    } else {
                        c2322d = new C2322D("Exception in completion handler " + abstractC2319B0 + " for " + this, th2);
                        C6934q c6934q = C6934q.f24811a;
                    }
                }
            }
        }
        if (c2322d != null) {
            mo7916f0(c2322d);
        }
    }

    @Override // p132S5.InterfaceC2409u0
    public final boolean start() {
        int m7882D0;
        do {
            m7882D0 = m7882D0(m7914b0());
            if (m7882D0 == 0) {
                return false;
            }
        } while (m7882D0 != 1);
        return true;
    }

    /* renamed from: t0 */
    public final Object m7930t0(Object obj, Object obj2) {
        if (obj2 instanceof C2318B) {
            throw ((C2318B) obj2).f7023a;
        }
        return obj2;
    }

    public String toString() {
        return m7889H0() + '@' + AbstractC2342N.m8005b(this);
    }

    /* renamed from: u0 */
    public final void m7931u0(InterfaceC3184e interfaceC3184e, Object obj) {
        Object m7914b0;
        do {
            m7914b0 = m7914b0();
            if (!(m7914b0 instanceof InterfaceC2399p0)) {
                if (!(m7914b0 instanceof C2318B)) {
                    m7914b0 = AbstractC2323D0.m7968h(m7914b0);
                }
                interfaceC3184e.m11596b(m7914b0);
                return;
            }
        } while (m7882D0(m7914b0) < 0);
        interfaceC3184e.m11595a(AbstractC2317A0.m7859k(this, false, false, new d(interfaceC3184e), 3, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // p132S5.InterfaceC2337K0
    /* renamed from: w */
    public CancellationException mo7933w() {
        CancellationException cancellationException;
        Object m7914b0 = m7914b0();
        if (m7914b0 instanceof c) {
            cancellationException = ((c) m7914b0).m7947e();
        } else if (m7914b0 instanceof C2318B) {
            cancellationException = ((C2318B) m7914b0).f7023a;
        } else {
            if (m7914b0 instanceof InterfaceC2399p0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + m7914b0).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new C2411v0("Parent job is " + m7884E0(m7914b0), cancellationException, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [S5.o0] */
    /* renamed from: y0 */
    public final void m7936y0(C2375d0 c2375d0) {
        C2331H0 c2331h0 = new C2331H0();
        if (!c2375d0.isActive()) {
            c2331h0 = new C2397o0(c2331h0);
        }
        AbstractC6581b.m27343a(f7027a, this, c2375d0, c2331h0);
    }

    /* renamed from: z0 */
    public final void m7937z0(AbstractC2319B0 abstractC2319B0) {
        abstractC2319B0.m10354g(new C2331H0());
        AbstractC6581b.m27343a(f7027a, this, abstractC2319B0, abstractC2319B0.m10359l());
    }

    @Override // p132S5.InterfaceC2409u0
    public /* synthetic */ boolean cancel(Throwable th) {
        Throwable c2411v0;
        if (th == null || (c2411v0 = m7869G0(this, th, null, 1, null)) == null) {
            c2411v0 = new C2411v0(mo7898M(), null, this);
        }
        mo7892J(c2411v0);
        return true;
    }

    @Override // p392z5.InterfaceC7161i
    public InterfaceC7161i plus(InterfaceC7161i interfaceC7161i) {
        return InterfaceC2409u0.a.m8185g(this, interfaceC7161i);
    }

    @Override // p132S5.InterfaceC2409u0
    public final InterfaceC2368a0 invokeOnCompletion(boolean z6, boolean z7, InterfaceC0800l interfaceC0800l) {
        return m7918h0(z6, z7, new InterfaceC2403r0.a(interfaceC0800l));
    }

    @Override // p132S5.InterfaceC2409u0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C2411v0(mo7898M(), null, this);
        }
        mo7892J(cancellationException);
    }

    /* renamed from: x0 */
    public void mo7935x0() {
    }

    /* renamed from: E */
    public void mo7883E(Object obj) {
    }

    /* renamed from: f0 */
    public void mo7916f0(Throwable th) {
        throw th;
    }

    /* renamed from: v0 */
    public void m7932v0(Throwable th) {
    }

    /* renamed from: w0 */
    public void mo7934w0(Object obj) {
    }
}
