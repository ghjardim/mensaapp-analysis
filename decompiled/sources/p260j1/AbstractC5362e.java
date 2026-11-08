package p260j1;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p249i1.AbstractC4526q;
import p249i1.C4525p;
import p249i1.InterfaceC4520k;
import p249i1.InterfaceC4521l;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p260j1.AbstractC5362e;
import p284m0.AbstractC5562j;

/* renamed from: j1.e */
/* loaded from: classes.dex */
public abstract class AbstractC5362e implements InterfaceC4521l {

    /* renamed from: a */
    public final ArrayDeque f18978a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f18979b;

    /* renamed from: c */
    public final PriorityQueue f18980c;

    /* renamed from: d */
    public b f18981d;

    /* renamed from: e */
    public long f18982e;

    /* renamed from: f */
    public long f18983f;

    /* renamed from: g */
    public long f18984g;

    /* renamed from: j1.e$b */
    public static final class b extends C4525p implements Comparable {

        /* renamed from: r */
        public long f18985r;

        public b() {
        }

        @Override // java.lang.Comparable
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            if (m23275m() != bVar.m23275m()) {
                return m23275m() ? 1 : -1;
            }
            long j7 = this.f20079f - bVar.f20079f;
            if (j7 == 0) {
                j7 = this.f18985r - bVar.f18985r;
                if (j7 == 0) {
                    return 0;
                }
            }
            return j7 > 0 ? 1 : -1;
        }
    }

    /* renamed from: j1.e$c */
    public static final class c extends AbstractC4526q {

        /* renamed from: n */
        public AbstractC5562j.a f18986n;

        public c(AbstractC5562j.a aVar) {
            this.f18986n = aVar;
        }

        @Override // p284m0.AbstractC5562j
        /* renamed from: r */
        public final void mo19242r() {
            this.f18986n.mo22057a(this);
        }
    }

    public AbstractC5362e() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f18978a.add(new b());
        }
        this.f18979b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            this.f18979b.add(new c(new AbstractC5562j.a() { // from class: j1.d
                @Override // p284m0.AbstractC5562j.a
                /* renamed from: a */
                public final void mo22057a(AbstractC5562j abstractC5562j) {
                    AbstractC5362e.this.m22064p((AbstractC5362e.c) abstractC5562j);
                }
            }));
        }
        this.f18980c = new PriorityQueue();
        this.f18984g = -9223372036854775807L;
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: b */
    public final void mo22058b(long j7) {
        this.f18984g = j7;
    }

    @Override // p249i1.InterfaceC4521l
    /* renamed from: c */
    public void mo19235c(long j7) {
        this.f18982e = j7;
    }

    @Override // p284m0.InterfaceC5559g
    public void flush() {
        this.f18983f = 0L;
        this.f18982e = 0L;
        while (!this.f18980c.isEmpty()) {
            m22063o((b) AbstractC5330M.m21747i((b) this.f18980c.poll()));
        }
        b bVar = this.f18981d;
        if (bVar != null) {
            m22063o(bVar);
            this.f18981d = null;
        }
    }

    /* renamed from: g */
    public abstract InterfaceC4520k mo21994g();

    /* renamed from: h */
    public abstract void mo21995h(C4525p c4525p);

    @Override // p284m0.InterfaceC5559g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public C4525p mo22059e() {
        AbstractC5332a.m21802g(this.f18981d == null);
        if (this.f18978a.isEmpty()) {
            return null;
        }
        b bVar = (b) this.f18978a.pollFirst();
        this.f18981d = bVar;
        return bVar;
    }

    @Override // p284m0.InterfaceC5559g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public AbstractC4526q mo21993a() {
        if (this.f18979b.isEmpty()) {
            return null;
        }
        while (!this.f18980c.isEmpty() && ((b) AbstractC5330M.m21747i((b) this.f18980c.peek())).f20079f <= this.f18982e) {
            b bVar = (b) AbstractC5330M.m21747i((b) this.f18980c.poll());
            if (bVar.m23275m()) {
                AbstractC4526q abstractC4526q = (AbstractC4526q) AbstractC5330M.m21747i((AbstractC4526q) this.f18979b.pollFirst());
                abstractC4526q.m23272i(4);
                m22063o(bVar);
                return abstractC4526q;
            }
            mo21995h(bVar);
            if (mo21998m()) {
                InterfaceC4520k mo21994g = mo21994g();
                AbstractC4526q abstractC4526q2 = (AbstractC4526q) AbstractC5330M.m21747i((AbstractC4526q) this.f18979b.pollFirst());
                abstractC4526q2.m19254s(bVar.f20079f, mo21994g, Long.MAX_VALUE);
                m22063o(bVar);
                return abstractC4526q2;
            }
            m22063o(bVar);
        }
        return null;
    }

    /* renamed from: k */
    public final AbstractC4526q m22061k() {
        return (AbstractC4526q) this.f18979b.pollFirst();
    }

    /* renamed from: l */
    public final long m22062l() {
        return this.f18982e;
    }

    /* renamed from: m */
    public abstract boolean mo21998m();

    @Override // p284m0.InterfaceC5559g
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22060f(C4525p c4525p) {
        AbstractC5332a.m21796a(c4525p == this.f18981d);
        b bVar = (b) c4525p;
        long j7 = this.f18984g;
        if (j7 == -9223372036854775807L || bVar.f20079f >= j7) {
            long j8 = this.f18983f;
            this.f18983f = 1 + j8;
            bVar.f18985r = j8;
            this.f18980c.add(bVar);
        } else {
            m22063o(bVar);
        }
        this.f18981d = null;
    }

    /* renamed from: o */
    public final void m22063o(b bVar) {
        bVar.mo19253j();
        this.f18978a.add(bVar);
    }

    /* renamed from: p */
    public void m22064p(AbstractC4526q abstractC4526q) {
        abstractC4526q.mo19253j();
        this.f18979b.add(abstractC4526q);
    }

    @Override // p284m0.InterfaceC5559g
    public void release() {
    }
}
