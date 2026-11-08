package p132S5;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p006A5.AbstractC0024c;
import p013B5.InterfaceC0061e;
import p069J5.InterfaceC0800l;
import p132S5.InterfaceC2392m;
import p167X5.AbstractC2843D;
import p167X5.C2846G;
import p167X5.C2866k;
import p350u.AbstractC6581b;
import p371w5.C6920c;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: S5.o */
/* loaded from: classes2.dex */
public class C2396o extends AbstractC2359W implements InterfaceC2394n, InterfaceC0061e, InterfaceC2366Z0 {

    /* renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7142f = AtomicIntegerFieldUpdater.newUpdater(C2396o.class, "_decisionAndIndex$volatile");

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7143n = AtomicReferenceFieldUpdater.newUpdater(C2396o.class, Object.class, "_state$volatile");

    /* renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7144o = AtomicReferenceFieldUpdater.newUpdater(C2396o.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d */
    public final InterfaceC7157e f7145d;

    /* renamed from: e */
    public final InterfaceC7161i f7146e;

    public C2396o(InterfaceC7157e interfaceC7157e, int i7) {
        super(i7);
        this.f7145d = interfaceC7157e;
        this.f7146e = interfaceC7157e.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2374d.f7101a;
    }

    /* renamed from: P */
    public static /* synthetic */ void m8145P(C2396o c2396o, Object obj, int i7, InterfaceC0800l interfaceC0800l, int i8, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i8 & 4) != 0) {
            interfaceC0800l = null;
        }
        c2396o.m8156O(obj, i7, interfaceC0800l);
    }

    /* renamed from: A */
    public final String m8146A() {
        Object m8172z = m8172z();
        return m8172z instanceof InterfaceC2335J0 ? "Active" : m8172z instanceof C2402r ? "Cancelled" : "Completed";
    }

    /* renamed from: E */
    public void m8147E() {
        InterfaceC2368a0 m8148F = m8148F();
        if (m8148F != null && isCompleted()) {
            m8148F.mo7864b();
            f7144o.set(this, C2333I0.f7067a);
        }
    }

    /* renamed from: F */
    public final InterfaceC2368a0 m8148F() {
        InterfaceC2409u0 interfaceC2409u0 = (InterfaceC2409u0) getContext().get(InterfaceC2409u0.f7157j);
        if (interfaceC2409u0 == null) {
            return null;
        }
        InterfaceC2368a0 m7859k = AbstractC2317A0.m7859k(interfaceC2409u0, true, false, new C2404s(this), 2, null);
        AbstractC6581b.m27343a(f7144o, this, null, m7859k);
        return m7859k;
    }

    /* renamed from: G */
    public final void m8149G(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7143n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C2374d)) {
                if (obj2 instanceof InterfaceC2392m ? true : obj2 instanceof AbstractC2843D) {
                    m8152J(obj, obj2);
                } else {
                    if (obj2 instanceof C2318B) {
                        C2318B c2318b = (C2318B) obj2;
                        if (!c2318b.m7863c()) {
                            m8152J(obj, obj2);
                        }
                        if (obj2 instanceof C2402r) {
                            if (!(obj2 instanceof C2318B)) {
                                c2318b = null;
                            }
                            Throwable th = c2318b != null ? c2318b.f7023a : null;
                            if (obj instanceof InterfaceC2392m) {
                                m8162k((InterfaceC2392m) obj, th);
                                return;
                            } else {
                                AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                m8164m((AbstractC2843D) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C2316A) {
                        C2316A c2316a = (C2316A) obj2;
                        if (c2316a.f7018b != null) {
                            m8152J(obj, obj2);
                        }
                        if (obj instanceof AbstractC2843D) {
                            return;
                        }
                        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        InterfaceC2392m interfaceC2392m = (InterfaceC2392m) obj;
                        if (c2316a.m7847c()) {
                            m8162k(interfaceC2392m, c2316a.f7021e);
                            return;
                        } else {
                            if (AbstractC6581b.m27343a(f7143n, this, obj2, C2316A.m7845b(c2316a, null, interfaceC2392m, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof AbstractC2843D) {
                            return;
                        }
                        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractC6581b.m27343a(f7143n, this, obj2, new C2316A(obj2, (InterfaceC2392m) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (AbstractC6581b.m27343a(f7143n, this, obj2, obj)) {
                return;
            }
        }
    }

    /* renamed from: H */
    public final void m8150H(InterfaceC2392m interfaceC2392m) {
        m8149G(interfaceC2392m);
    }

    /* renamed from: I */
    public final boolean m8151I() {
        if (AbstractC2361X.m8048c(this.f7088c)) {
            InterfaceC7157e interfaceC7157e = this.f7145d;
            AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C2866k) interfaceC7157e).m10331p()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final void m8152J(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* renamed from: K */
    public String mo7938K() {
        return "CancellableContinuation";
    }

    /* renamed from: L */
    public final void m8153L(Throwable th) {
        if (m8166r(th)) {
            return;
        }
        m8165p(th);
        m8168u();
    }

    /* renamed from: M */
    public final void m8154M() {
        Throwable m10334u;
        InterfaceC7157e interfaceC7157e = this.f7145d;
        C2866k c2866k = interfaceC7157e instanceof C2866k ? (C2866k) interfaceC7157e : null;
        if (c2866k == null || (m10334u = c2866k.m10334u(this)) == null) {
            return;
        }
        m8167s();
        m8165p(m10334u);
    }

    /* renamed from: N */
    public final boolean m8155N() {
        Object obj = f7143n.get(this);
        if ((obj instanceof C2316A) && ((C2316A) obj).f7020d != null) {
            m8167s();
            return false;
        }
        f7142f.set(this, 536870911);
        f7143n.set(this, C2374d.f7101a);
        return true;
    }

    /* renamed from: O */
    public final void m8156O(Object obj, int i7, InterfaceC0800l interfaceC0800l) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7143n;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof InterfaceC2335J0)) {
                if (obj2 instanceof C2402r) {
                    C2402r c2402r = (C2402r) obj2;
                    if (c2402r.m8177e()) {
                        if (interfaceC0800l != null) {
                            m8163l(interfaceC0800l, c2402r.f7023a);
                            return;
                        }
                        return;
                    }
                }
                m8161j(obj);
                throw new C6920c();
            }
        } while (!AbstractC6581b.m27343a(f7143n, this, obj2, m8157Q((InterfaceC2335J0) obj2, obj, i7, interfaceC0800l, null)));
        m8168u();
        m8169v(i7);
    }

    /* renamed from: Q */
    public final Object m8157Q(InterfaceC2335J0 interfaceC2335J0, Object obj, int i7, InterfaceC0800l interfaceC0800l, Object obj2) {
        if (obj instanceof C2318B) {
            return obj;
        }
        if (!AbstractC2361X.m8047b(i7) && obj2 == null) {
            return obj;
        }
        if (interfaceC0800l == null && !(interfaceC2335J0 instanceof InterfaceC2392m) && obj2 == null) {
            return obj;
        }
        return new C2316A(obj, interfaceC2335J0 instanceof InterfaceC2392m ? (InterfaceC2392m) interfaceC2335J0 : null, interfaceC0800l, obj2, null, 16, null);
    }

    /* renamed from: R */
    public final boolean m8158R() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7142f;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7142f.compareAndSet(this, i7, 1073741824 + (536870911 & i7)));
        return true;
    }

    /* renamed from: S */
    public final C2846G m8159S(Object obj, Object obj2, InterfaceC0800l interfaceC0800l) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7143n;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC2335J0)) {
                if ((obj3 instanceof C2316A) && obj2 != null && ((C2316A) obj3).f7020d == obj2) {
                    return AbstractC2398p.f7148a;
                }
                return null;
            }
        } while (!AbstractC6581b.m27343a(f7143n, this, obj3, m8157Q((InterfaceC2335J0) obj3, obj, this.f7088c, interfaceC0800l, obj2)));
        m8168u();
        return AbstractC2398p.f7148a;
    }

    /* renamed from: T */
    public final boolean m8160T() {
        int i7;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7142f;
        do {
            i7 = atomicIntegerFieldUpdater.get(this);
            int i8 = i7 >> 29;
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7142f.compareAndSet(this, i7, 536870912 + (536870911 & i7)));
        return true;
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: a */
    public void mo8040a(Object obj, Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7143n;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof InterfaceC2335J0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C2318B) {
                return;
            }
            if (obj2 instanceof C2316A) {
                C2316A c2316a = (C2316A) obj2;
                if (c2316a.m7847c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                if (AbstractC6581b.m27343a(f7143n, this, obj2, C2316A.m7845b(c2316a, null, null, null, null, th, 15, null))) {
                    c2316a.m7848d(this, th);
                    return;
                }
            } else if (AbstractC6581b.m27343a(f7143n, this, obj2, new C2316A(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // p132S5.InterfaceC2366Z0
    /* renamed from: b */
    public void mo8056b(AbstractC2843D abstractC2843D, int i7) {
        int i8;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7142f;
        do {
            i8 = atomicIntegerFieldUpdater.get(this);
            if ((i8 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, ((i8 >> 29) << 29) + i7));
        m8149G(abstractC2843D);
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: c */
    public final InterfaceC7157e mo8041c() {
        return this.f7145d;
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: d */
    public Throwable mo8042d(Object obj) {
        Throwable mo8042d = super.mo8042d(obj);
        if (mo8042d != null) {
            return mo8042d;
        }
        return null;
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: e */
    public Object mo8043e(Object obj) {
        return obj instanceof C2316A ? ((C2316A) obj).f7017a : obj;
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: f */
    public void mo8136f(Object obj, InterfaceC0800l interfaceC0800l) {
        m8156O(obj, this.f7088c, interfaceC0800l);
    }

    @Override // p013B5.InterfaceC0061e
    public InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.f7145d;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        return this.f7146e;
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: h */
    public Object mo8045h() {
        return m8172z();
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: i */
    public Object mo8137i(Throwable th) {
        return m8159S(new C2318B(th, false, 2, null), null, null);
    }

    @Override // p132S5.InterfaceC2394n
    public boolean isCompleted() {
        return !(m8172z() instanceof InterfaceC2335J0);
    }

    /* renamed from: j */
    public final Void m8161j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: k */
    public final void m8162k(InterfaceC2392m interfaceC2392m, Throwable th) {
        try {
            interfaceC2392m.mo8060a(th);
        } catch (Throwable th2) {
            AbstractC2332I.m7992a(getContext(), new C2322D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: l */
    public final void m8163l(InterfaceC0800l interfaceC0800l, Throwable th) {
        try {
            interfaceC0800l.invoke(th);
        } catch (Throwable th2) {
            AbstractC2332I.m7992a(getContext(), new C2322D("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: m */
    public final void m8164m(AbstractC2843D abstractC2843D, Throwable th) {
        int i7 = f7142f.get(this) & 536870911;
        if (i7 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            abstractC2843D.mo8867s(i7, th, getContext());
        } catch (Throwable th2) {
            AbstractC2332I.m7992a(getContext(), new C2322D("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: n */
    public void mo8138n(AbstractC2328G abstractC2328G, Object obj) {
        InterfaceC7157e interfaceC7157e = this.f7145d;
        C2866k c2866k = interfaceC7157e instanceof C2866k ? (C2866k) interfaceC7157e : null;
        m8145P(this, obj, (c2866k != null ? c2866k.f8835d : null) == abstractC2328G ? 4 : this.f7088c, null, 4, null);
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: o */
    public void mo8139o(InterfaceC0800l interfaceC0800l) {
        AbstractC2400q.m8175c(this, new InterfaceC2392m.a(interfaceC0800l));
    }

    /* renamed from: p */
    public boolean m8165p(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7143n;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2335J0)) {
                return false;
            }
        } while (!AbstractC6581b.m27343a(f7143n, this, obj, new C2402r(this, th, (obj instanceof InterfaceC2392m) || (obj instanceof AbstractC2843D))));
        InterfaceC2335J0 interfaceC2335J0 = (InterfaceC2335J0) obj;
        if (interfaceC2335J0 instanceof InterfaceC2392m) {
            m8162k((InterfaceC2392m) obj, th);
        } else if (interfaceC2335J0 instanceof AbstractC2843D) {
            m8164m((AbstractC2843D) obj, th);
        }
        m8168u();
        m8169v(this.f7088c);
        return true;
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: q */
    public Object mo8140q(Object obj, Object obj2, InterfaceC0800l interfaceC0800l) {
        return m8159S(obj, obj2, interfaceC0800l);
    }

    /* renamed from: r */
    public final boolean m8166r(Throwable th) {
        if (!m8151I()) {
            return false;
        }
        InterfaceC7157e interfaceC7157e = this.f7145d;
        AbstractC5469l.m23026c(interfaceC7157e, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C2866k) interfaceC7157e).m10332r(th);
    }

    @Override // p392z5.InterfaceC7157e
    public void resumeWith(Object obj) {
        m8145P(this, AbstractC2324E.m7971c(obj, this), this.f7088c, null, 4, null);
    }

    /* renamed from: s */
    public final void m8167s() {
        InterfaceC2368a0 m8170x = m8170x();
        if (m8170x == null) {
            return;
        }
        m8170x.mo7864b();
        f7144o.set(this, C2333I0.f7067a);
    }

    @Override // p132S5.InterfaceC2394n
    /* renamed from: t */
    public void mo8141t(Object obj) {
        m8169v(this.f7088c);
    }

    public String toString() {
        return mo7938K() + '(' + AbstractC2342N.m8006c(this.f7145d) + "){" + m8146A() + "}@" + AbstractC2342N.m8005b(this);
    }

    /* renamed from: u */
    public final void m8168u() {
        if (m8151I()) {
            return;
        }
        m8167s();
    }

    /* renamed from: v */
    public final void m8169v(int i7) {
        if (m8158R()) {
            return;
        }
        AbstractC2361X.m8046a(this, i7);
    }

    /* renamed from: w */
    public Throwable mo7939w(InterfaceC2409u0 interfaceC2409u0) {
        return interfaceC2409u0.getCancellationException();
    }

    /* renamed from: x */
    public final InterfaceC2368a0 m8170x() {
        return (InterfaceC2368a0) f7144o.get(this);
    }

    /* renamed from: y */
    public final Object m8171y() {
        InterfaceC2409u0 interfaceC2409u0;
        boolean m8151I = m8151I();
        if (m8160T()) {
            if (m8170x() == null) {
                m8148F();
            }
            if (m8151I) {
                m8154M();
            }
            return AbstractC0024c.m76e();
        }
        if (m8151I) {
            m8154M();
        }
        Object m8172z = m8172z();
        if (m8172z instanceof C2318B) {
            throw ((C2318B) m8172z).f7023a;
        }
        if (!AbstractC2361X.m8047b(this.f7088c) || (interfaceC2409u0 = (InterfaceC2409u0) getContext().get(InterfaceC2409u0.f7157j)) == null || interfaceC2409u0.isActive()) {
            return mo8043e(m8172z);
        }
        CancellationException cancellationException = interfaceC2409u0.getCancellationException();
        mo8040a(m8172z, cancellationException);
        throw cancellationException;
    }

    /* renamed from: z */
    public final Object m8172z() {
        return f7143n.get(this);
    }
}
