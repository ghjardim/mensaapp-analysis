package p198b6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5467j;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5470m;
import p069J5.InterfaceC0800l;
import p069J5.InterfaceC0804p;
import p132S5.InterfaceC2366Z0;
import p132S5.InterfaceC2394n;
import p146U5.AbstractC2591i;
import p167X5.AbstractC2843D;
import p167X5.AbstractC2844E;
import p167X5.AbstractC2859d;
import p167X5.C2846G;
import p350u.AbstractC6581b;
import p371w5.C6934q;

/* renamed from: b6.d */
/* loaded from: classes2.dex */
public class C3559d {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12004c = AtomicReferenceFieldUpdater.newUpdater(C3559d.class, Object.class, "head$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f12005d = AtomicLongFieldUpdater.newUpdater(C3559d.class, "deqIdx$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f12006e = AtomicReferenceFieldUpdater.newUpdater(C3559d.class, Object.class, "tail$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f12007f = AtomicLongFieldUpdater.newUpdater(C3559d.class, "enqIdx$volatile");

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f12008g = AtomicIntegerFieldUpdater.newUpdater(C3559d.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* renamed from: a */
    public final int f12009a;

    /* renamed from: b */
    public final InterfaceC0800l f12010b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* renamed from: b6.d$a */
    public /* synthetic */ class a extends AbstractC5467j implements InterfaceC0804p {

        /* renamed from: a */
        public static final a f12011a = new a();

        public a() {
            super(2, AbstractC3560e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: f */
        public final C3561f m14370f(long j7, C3561f c3561f) {
            C3561f m14380h;
            m14380h = AbstractC3560e.m14380h(j7, c3561f);
            return m14380h;
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m14370f(((Number) obj).longValue(), (C3561f) obj2);
        }
    }

    /* renamed from: b6.d$b */
    public static final class b extends AbstractC5470m implements InterfaceC0800l {
        public b() {
            super(1);
        }

        /* renamed from: a */
        public final void m14371a(Throwable th) {
            C3559d.this.m14366n();
        }

        @Override // p069J5.InterfaceC0800l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m14371a((Throwable) obj);
            return C6934q.f24811a;
        }
    }

    /* renamed from: b6.d$c */
    public /* synthetic */ class c extends AbstractC5467j implements InterfaceC0804p {

        /* renamed from: a */
        public static final c f12013a = new c();

        public c() {
            super(2, AbstractC3560e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        /* renamed from: f */
        public final C3561f m14372f(long j7, C3561f c3561f) {
            C3561f m14380h;
            m14380h = AbstractC3560e.m14380h(j7, c3561f);
            return m14380h;
        }

        @Override // p069J5.InterfaceC0804p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m14372f(((Number) obj).longValue(), (C3561f) obj2);
        }
    }

    public C3559d(int i7, int i8) {
        this.f12009a = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i7).toString());
        }
        if (i8 < 0 || i8 > i7) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i7).toString());
        }
        C3561f c3561f = new C3561f(0L, null, 2);
        this.head$volatile = c3561f;
        this.tail$volatile = c3561f;
        this._availablePermits$volatile = i7 - i8;
        this.f12010b = new b();
    }

    /* renamed from: d */
    public final void m14361d(InterfaceC2394n interfaceC2394n) {
        while (m14364g() <= 0) {
            AbstractC5469l.m23026c(interfaceC2394n, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (m14362e((InterfaceC2366Z0) interfaceC2394n)) {
                return;
            }
        }
        interfaceC2394n.mo8136f(C6934q.f24811a, this.f12010b);
    }

    /* renamed from: e */
    public final boolean m14362e(InterfaceC2366Z0 interfaceC2366Z0) {
        int i7;
        Object m10308c;
        int i8;
        C2846G c2846g;
        C2846G c2846g2;
        C3561f c3561f = (C3561f) f12006e.get(this);
        long andIncrement = f12007f.getAndIncrement(this);
        a aVar = a.f12011a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12006e;
        i7 = AbstractC3560e.f12019f;
        long j7 = andIncrement / i7;
        loop0: while (true) {
            m10308c = AbstractC2859d.m10308c(c3561f, j7, aVar);
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
        C3561f c3561f2 = (C3561f) AbstractC2844E.m10259b(m10308c);
        i8 = AbstractC3560e.f12019f;
        int i9 = (int) (andIncrement % i8);
        if (AbstractC2591i.m8858a(c3561f2.m14381v(), i9, null, interfaceC2366Z0)) {
            interfaceC2366Z0.mo8056b(c3561f2, i9);
            return true;
        }
        c2846g = AbstractC3560e.f12015b;
        c2846g2 = AbstractC3560e.f12016c;
        if (!AbstractC2591i.m8858a(c3561f2.m14381v(), i9, c2846g, c2846g2)) {
            return false;
        }
        if (interfaceC2366Z0 instanceof InterfaceC2394n) {
            AbstractC5469l.m23026c(interfaceC2366Z0, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC2394n) interfaceC2366Z0).mo8136f(C6934q.f24811a, this.f12010b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + interfaceC2366Z0).toString());
    }

    /* renamed from: f */
    public final void m14363f() {
        int i7;
        do {
            i7 = f12008g.get(this);
            if (i7 <= this.f12009a) {
                return;
            }
        } while (!f12008g.compareAndSet(this, i7, this.f12009a));
    }

    /* renamed from: g */
    public final int m14364g() {
        int andDecrement;
        do {
            andDecrement = f12008g.getAndDecrement(this);
        } while (andDecrement > this.f12009a);
        return andDecrement;
    }

    /* renamed from: h */
    public int m14365h() {
        return Math.max(f12008g.get(this), 0);
    }

    /* renamed from: n */
    public void m14366n() {
        do {
            int andIncrement = f12008g.getAndIncrement(this);
            if (andIncrement >= this.f12009a) {
                m14363f();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f12009a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m14369q());
    }

    /* renamed from: o */
    public boolean m14367o() {
        while (true) {
            int i7 = f12008g.get(this);
            if (i7 > this.f12009a) {
                m14363f();
            } else {
                if (i7 <= 0) {
                    return false;
                }
                if (f12008g.compareAndSet(this, i7, i7 - 1)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: p */
    public final boolean m14368p(Object obj) {
        if (!(obj instanceof InterfaceC2394n)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        AbstractC5469l.m23026c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC2394n interfaceC2394n = (InterfaceC2394n) obj;
        Object mo8140q = interfaceC2394n.mo8140q(C6934q.f24811a, null, this.f12010b);
        if (mo8140q == null) {
            return false;
        }
        interfaceC2394n.mo8141t(mo8140q);
        return true;
    }

    /* renamed from: q */
    public final boolean m14369q() {
        int i7;
        Object m10308c;
        int i8;
        C2846G c2846g;
        C2846G c2846g2;
        int i9;
        C2846G c2846g3;
        C2846G c2846g4;
        C2846G c2846g5;
        C3561f c3561f = (C3561f) f12004c.get(this);
        long andIncrement = f12005d.getAndIncrement(this);
        i7 = AbstractC3560e.f12019f;
        long j7 = andIncrement / i7;
        c cVar = c.f12013a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12004c;
        loop0: while (true) {
            m10308c = AbstractC2859d.m10308c(c3561f, j7, cVar);
            if (AbstractC2844E.m10260c(m10308c)) {
                break;
            }
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
        }
        C3561f c3561f2 = (C3561f) AbstractC2844E.m10259b(m10308c);
        c3561f2.m10312c();
        if (c3561f2.f8806c > j7) {
            return false;
        }
        i8 = AbstractC3560e.f12019f;
        int i10 = (int) (andIncrement % i8);
        c2846g = AbstractC3560e.f12015b;
        Object andSet = c3561f2.m14381v().getAndSet(i10, c2846g);
        if (andSet != null) {
            c2846g2 = AbstractC3560e.f12018e;
            if (andSet == c2846g2) {
                return false;
            }
            return m14368p(andSet);
        }
        i9 = AbstractC3560e.f12014a;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = c3561f2.m14381v().get(i10);
            c2846g5 = AbstractC3560e.f12016c;
            if (obj == c2846g5) {
                return true;
            }
        }
        c2846g3 = AbstractC3560e.f12015b;
        c2846g4 = AbstractC3560e.f12017d;
        return !AbstractC2591i.m8858a(c3561f2.m14381v(), i10, c2846g3, c2846g4);
    }
}
