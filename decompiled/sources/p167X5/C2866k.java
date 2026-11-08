package p167X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import p013B5.InterfaceC0061e;
import p132S5.AbstractC2324E;
import p132S5.AbstractC2328G;
import p132S5.AbstractC2342N;
import p132S5.AbstractC2359W;
import p132S5.AbstractC2377e0;
import p132S5.C2320C;
import p132S5.C2352S0;
import p132S5.C2396o;
import p132S5.InterfaceC2394n;
import p350u.AbstractC6581b;
import p371w5.C6934q;
import p392z5.InterfaceC7157e;
import p392z5.InterfaceC7161i;

/* renamed from: X5.k */
/* loaded from: classes2.dex */
public final class C2866k extends AbstractC2359W implements InterfaceC0061e, InterfaceC7157e {

    /* renamed from: o */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8834o = AtomicReferenceFieldUpdater.newUpdater(C2866k.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* renamed from: d */
    public final AbstractC2328G f8835d;

    /* renamed from: e */
    public final InterfaceC7157e f8836e;

    /* renamed from: f */
    public Object f8837f;

    /* renamed from: n */
    public final Object f8838n;

    public C2866k(AbstractC2328G abstractC2328G, InterfaceC7157e interfaceC7157e) {
        super(-1);
        C2846G c2846g;
        this.f8835d = abstractC2328G;
        this.f8836e = interfaceC7157e;
        c2846g = AbstractC2867l.f8839a;
        this.f8837f = c2846g;
        this.f8838n = AbstractC2850K.m10279b(getContext());
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: a */
    public void mo8040a(Object obj, Throwable th) {
        if (obj instanceof C2320C) {
            ((C2320C) obj).f7026b.invoke(th);
        }
    }

    @Override // p013B5.InterfaceC0061e
    public InterfaceC0061e getCallerFrame() {
        InterfaceC7157e interfaceC7157e = this.f8836e;
        if (interfaceC7157e instanceof InterfaceC0061e) {
            return (InterfaceC0061e) interfaceC7157e;
        }
        return null;
    }

    @Override // p392z5.InterfaceC7157e
    public InterfaceC7161i getContext() {
        return this.f8836e.getContext();
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: h */
    public Object mo8045h() {
        C2846G c2846g;
        Object obj = this.f8837f;
        c2846g = AbstractC2867l.f8839a;
        this.f8837f = c2846g;
        return obj;
    }

    /* renamed from: j */
    public final void m10328j() {
        while (f8834o.get(this) == AbstractC2867l.f8840b) {
        }
    }

    /* renamed from: k */
    public final C2396o m10329k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8834o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f8834o.set(this, AbstractC2867l.f8840b);
                return null;
            }
            if (obj instanceof C2396o) {
                if (AbstractC6581b.m27343a(f8834o, this, obj, AbstractC2867l.f8840b)) {
                    return (C2396o) obj;
                }
            } else if (obj != AbstractC2867l.f8840b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: l */
    public final C2396o m10330l() {
        Object obj = f8834o.get(this);
        if (obj instanceof C2396o) {
            return (C2396o) obj;
        }
        return null;
    }

    /* renamed from: p */
    public final boolean m10331p() {
        return f8834o.get(this) != null;
    }

    /* renamed from: r */
    public final boolean m10332r(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8834o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C2846G c2846g = AbstractC2867l.f8840b;
            if (AbstractC5469l.m23024a(obj, c2846g)) {
                if (AbstractC6581b.m27343a(f8834o, this, c2846g, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC6581b.m27343a(f8834o, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // p392z5.InterfaceC7157e
    public void resumeWith(Object obj) {
        InterfaceC7161i context = this.f8836e.getContext();
        Object m7972d = AbstractC2324E.m7972d(obj, null, 1, null);
        if (this.f8835d.mo7984F(context)) {
            this.f8837f = m7972d;
            this.f7088c = 0;
            this.f8835d.mo7983D(context, this);
            return;
        }
        AbstractC2377e0 m8025b = C2352S0.f7083a.m8025b();
        if (m8025b.m8079d0()) {
            this.f8837f = m7972d;
            this.f7088c = 0;
            m8025b.m8076R(this);
            return;
        }
        m8025b.m8078T(true);
        try {
            InterfaceC7161i context2 = getContext();
            Object m10280c = AbstractC2850K.m10280c(context2, this.f8838n);
            try {
                this.f8836e.resumeWith(obj);
                C6934q c6934q = C6934q.f24811a;
                while (m8025b.m8082l0()) {
                }
            } finally {
                AbstractC2850K.m10278a(context2, m10280c);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* renamed from: s */
    public final void m10333s() {
        m10328j();
        C2396o m10330l = m10330l();
        if (m10330l != null) {
            m10330l.m8167s();
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f8835d + ", " + AbstractC2342N.m8006c(this.f8836e) + ']';
    }

    /* renamed from: u */
    public final Throwable m10334u(InterfaceC2394n interfaceC2394n) {
        C2846G c2846g;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8834o;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            c2846g = AbstractC2867l.f8840b;
            if (obj != c2846g) {
                if (obj instanceof Throwable) {
                    if (AbstractC6581b.m27343a(f8834o, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC6581b.m27343a(f8834o, this, c2846g, interfaceC2394n));
        return null;
    }

    @Override // p132S5.AbstractC2359W
    /* renamed from: c */
    public InterfaceC7157e mo8041c() {
        return this;
    }
}
