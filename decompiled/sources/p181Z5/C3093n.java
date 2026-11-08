package p181Z5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C5480w;
import p146U5.AbstractC2591i;
import p350u.AbstractC6581b;

/* renamed from: Z5.n */
/* loaded from: classes2.dex */
public final class C3093n {

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9566b = AtomicReferenceFieldUpdater.newUpdater(C3093n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9567c = AtomicIntegerFieldUpdater.newUpdater(C3093n.class, "producerIndex$volatile");

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9568d = AtomicIntegerFieldUpdater.newUpdater(C3093n.class, "consumerIndex$volatile");

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f9569e = AtomicIntegerFieldUpdater.newUpdater(C3093n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a */
    public final AtomicReferenceArray f9570a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* renamed from: a */
    public final AbstractRunnableC3087h m11294a(AbstractRunnableC3087h abstractRunnableC3087h, boolean z6) {
        if (z6) {
            return m11295b(abstractRunnableC3087h);
        }
        AbstractRunnableC3087h abstractRunnableC3087h2 = (AbstractRunnableC3087h) f9566b.getAndSet(this, abstractRunnableC3087h);
        if (abstractRunnableC3087h2 == null) {
            return null;
        }
        return m11295b(abstractRunnableC3087h2);
    }

    /* renamed from: b */
    public final AbstractRunnableC3087h m11295b(AbstractRunnableC3087h abstractRunnableC3087h) {
        if (m11297e() == 127) {
            return abstractRunnableC3087h;
        }
        if (abstractRunnableC3087h.f9554b.mo11289b() == 1) {
            f9569e.incrementAndGet(this);
        }
        int i7 = f9567c.get(this) & 127;
        while (this.f9570a.get(i7) != null) {
            Thread.yield();
        }
        this.f9570a.lazySet(i7, abstractRunnableC3087h);
        f9567c.incrementAndGet(this);
        return null;
    }

    /* renamed from: c */
    public final void m11296c(AbstractRunnableC3087h abstractRunnableC3087h) {
        if (abstractRunnableC3087h == null || abstractRunnableC3087h.f9554b.mo11289b() != 1) {
            return;
        }
        f9569e.decrementAndGet(this);
    }

    /* renamed from: e */
    public final int m11297e() {
        return f9567c.get(this) - f9568d.get(this);
    }

    /* renamed from: i */
    public final int m11298i() {
        return f9566b.get(this) != null ? m11297e() + 1 : m11297e();
    }

    /* renamed from: j */
    public final void m11299j(C3083d c3083d) {
        AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) f9566b.getAndSet(this, null);
        if (abstractRunnableC3087h != null) {
            c3083d.m10367a(abstractRunnableC3087h);
        }
        while (m11303n(c3083d)) {
        }
    }

    /* renamed from: k */
    public final AbstractRunnableC3087h m11300k() {
        AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) f9566b.getAndSet(this, null);
        return abstractRunnableC3087h == null ? m11302m() : abstractRunnableC3087h;
    }

    /* renamed from: l */
    public final AbstractRunnableC3087h m11301l() {
        return m11304o(true);
    }

    /* renamed from: m */
    public final AbstractRunnableC3087h m11302m() {
        AbstractRunnableC3087h abstractRunnableC3087h;
        while (true) {
            int i7 = f9568d.get(this);
            if (i7 - f9567c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (f9568d.compareAndSet(this, i7, i7 + 1) && (abstractRunnableC3087h = (AbstractRunnableC3087h) this.f9570a.getAndSet(i8, null)) != null) {
                m11296c(abstractRunnableC3087h);
                return abstractRunnableC3087h;
            }
        }
    }

    /* renamed from: n */
    public final boolean m11303n(C3083d c3083d) {
        AbstractRunnableC3087h m11302m = m11302m();
        if (m11302m == null) {
            return false;
        }
        c3083d.m10367a(m11302m);
        return true;
    }

    /* renamed from: o */
    public final AbstractRunnableC3087h m11304o(boolean z6) {
        AbstractRunnableC3087h abstractRunnableC3087h;
        do {
            abstractRunnableC3087h = (AbstractRunnableC3087h) f9566b.get(this);
            if (abstractRunnableC3087h != null) {
                if ((abstractRunnableC3087h.f9554b.mo11289b() == 1) == z6) {
                }
            }
            int i7 = f9568d.get(this);
            int i8 = f9567c.get(this);
            while (i7 != i8) {
                if (z6 && f9569e.get(this) == 0) {
                    return null;
                }
                i8--;
                AbstractRunnableC3087h m11306q = m11306q(i8, z6);
                if (m11306q != null) {
                    return m11306q;
                }
            }
            return null;
        } while (!AbstractC6581b.m27343a(f9566b, this, abstractRunnableC3087h, null));
        return abstractRunnableC3087h;
    }

    /* renamed from: p */
    public final AbstractRunnableC3087h m11305p(int i7) {
        int i8 = f9568d.get(this);
        int i9 = f9567c.get(this);
        boolean z6 = i7 == 1;
        while (i8 != i9) {
            if (z6 && f9569e.get(this) == 0) {
                return null;
            }
            int i10 = i8 + 1;
            AbstractRunnableC3087h m11306q = m11306q(i8, z6);
            if (m11306q != null) {
                return m11306q;
            }
            i8 = i10;
        }
        return null;
    }

    /* renamed from: q */
    public final AbstractRunnableC3087h m11306q(int i7, boolean z6) {
        int i8 = i7 & 127;
        AbstractRunnableC3087h abstractRunnableC3087h = (AbstractRunnableC3087h) this.f9570a.get(i8);
        if (abstractRunnableC3087h != null) {
            if ((abstractRunnableC3087h.f9554b.mo11289b() == 1) == z6 && AbstractC2591i.m8858a(this.f9570a, i8, abstractRunnableC3087h, null)) {
                if (z6) {
                    f9569e.decrementAndGet(this);
                }
                return abstractRunnableC3087h;
            }
        }
        return null;
    }

    /* renamed from: r */
    public final long m11307r(int i7, C5480w c5480w) {
        AbstractRunnableC3087h m11302m = i7 == 3 ? m11302m() : m11305p(i7);
        if (m11302m == null) {
            return m11308s(i7, c5480w);
        }
        c5480w.f19710a = m11302m;
        return -1L;
    }

    /* renamed from: s */
    public final long m11308s(int i7, C5480w c5480w) {
        AbstractRunnableC3087h abstractRunnableC3087h;
        do {
            abstractRunnableC3087h = (AbstractRunnableC3087h) f9566b.get(this);
            if (abstractRunnableC3087h == null) {
                return -2L;
            }
            if (((abstractRunnableC3087h.f9554b.mo11289b() != 1 ? 2 : 1) & i7) == 0) {
                return -2L;
            }
            long mo11285a = AbstractC3091l.f9562f.mo11285a() - abstractRunnableC3087h.f9553a;
            long j7 = AbstractC3091l.f9558b;
            if (mo11285a < j7) {
                return j7 - mo11285a;
            }
        } while (!AbstractC6581b.m27343a(f9566b, this, abstractRunnableC3087h, null));
        c5480w.f19710a = abstractRunnableC3087h;
        return -1L;
    }
}
