package p167X5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC5469l;
import kotlin.jvm.internal.AbstractC5473p;
import p132S5.AbstractC2342N;
import p350u.AbstractC6581b;

/* renamed from: X5.r */
/* loaded from: classes2.dex */
public class C2873r {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8850a = AtomicReferenceFieldUpdater.newUpdater(C2873r.class, Object.class, "_next$volatile");

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8851b = AtomicReferenceFieldUpdater.newUpdater(C2873r.class, Object.class, "_prev$volatile");

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f8852c = AtomicReferenceFieldUpdater.newUpdater(C2873r.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: X5.r$a */
    public static abstract class a extends AbstractC2857b {

        /* renamed from: b */
        public final C2873r f8853b;

        /* renamed from: c */
        public C2873r f8854c;

        public a(C2873r c2873r) {
            this.f8853b = c2873r;
        }

        @Override // p167X5.AbstractC2857b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void mo10303b(C2873r c2873r, Object obj) {
            boolean z6 = obj == null;
            C2873r c2873r2 = z6 ? this.f8853b : this.f8854c;
            if (c2873r2 != null && AbstractC6581b.m27343a(C2873r.m10351n(), c2873r, this, c2873r2) && z6) {
                C2873r c2873r3 = this.f8853b;
                C2873r c2873r4 = this.f8854c;
                AbstractC5469l.m23025b(c2873r4);
                c2873r3.m10357j(c2873r4);
            }
        }
    }

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m10351n() {
        return f8850a;
    }

    /* renamed from: g */
    public final boolean m10354g(C2873r c2873r) {
        f8851b.set(c2873r, this);
        f8850a.set(c2873r, this);
        while (m10358k() == this) {
            if (AbstractC6581b.m27343a(f8850a, this, this, c2873r)) {
                c2873r.m10357j(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        if (p350u.AbstractC6581b.m27343a(p167X5.C2873r.f8850a, r3, r2, ((p167X5.C2840A) r4).f8803a) != false) goto L26;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p167X5.C2873r m10355h(p167X5.AbstractC2881z r8) {
        /*
            r7 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m10352o()
            java.lang.Object r0 = r0.get(r7)
            X5.r r0 = (p167X5.C2873r) r0
            r1 = 0
            r2 = r0
        Lc:
            r3 = r1
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m10351n()
            java.lang.Object r4 = r4.get(r2)
            if (r4 != r7) goto L26
            if (r0 != r2) goto L1a
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m10352o()
            boolean r0 = p350u.AbstractC6581b.m27343a(r1, r7, r0, r2)
            if (r0 != 0) goto L25
            goto L0
        L25:
            return r2
        L26:
            boolean r5 = r7.mo10347q()
            if (r5 == 0) goto L2d
            return r1
        L2d:
            if (r4 != r8) goto L30
            return r2
        L30:
            boolean r5 = r4 instanceof p167X5.AbstractC2881z
            if (r5 == 0) goto L3a
            X5.z r4 = (p167X5.AbstractC2881z) r4
            r4.mo10302a(r2)
            goto L0
        L3a:
            boolean r5 = r4 instanceof p167X5.C2840A
            if (r5 == 0) goto L5c
            if (r3 == 0) goto L51
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = m10351n()
            X5.A r4 = (p167X5.C2840A) r4
            X5.r r4 = r4.f8803a
            boolean r2 = p350u.AbstractC6581b.m27343a(r5, r3, r2, r4)
            if (r2 != 0) goto L4f
            goto L0
        L4f:
            r2 = r3
            goto Lc
        L51:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m10352o()
            java.lang.Object r2 = r4.get(r2)
            X5.r r2 = (p167X5.C2873r) r2
            goto Ld
        L5c:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.AbstractC5469l.m23026c(r4, r3)
            r3 = r4
            X5.r r3 = (p167X5.C2873r) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: p167X5.C2873r.m10355h(X5.z):X5.r");
    }

    /* renamed from: i */
    public final C2873r m10356i(C2873r c2873r) {
        while (c2873r.mo10347q()) {
            c2873r = (C2873r) f8851b.get(c2873r);
        }
        return c2873r;
    }

    /* renamed from: j */
    public final void m10357j(C2873r c2873r) {
        C2873r c2873r2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8851b;
        do {
            c2873r2 = (C2873r) atomicReferenceFieldUpdater.get(c2873r);
            if (m10358k() != c2873r) {
                return;
            }
        } while (!AbstractC6581b.m27343a(f8851b, c2873r, c2873r2, this));
        if (mo10347q()) {
            c2873r.m10355h(null);
        }
    }

    /* renamed from: k */
    public final Object m10358k() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8850a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof AbstractC2881z)) {
                return obj;
            }
            ((AbstractC2881z) obj).mo10302a(this);
        }
    }

    /* renamed from: l */
    public final C2873r m10359l() {
        C2873r c2873r;
        Object m10358k = m10358k();
        C2840A c2840a = m10358k instanceof C2840A ? (C2840A) m10358k : null;
        if (c2840a != null && (c2873r = c2840a.f8803a) != null) {
            return c2873r;
        }
        AbstractC5469l.m23026c(m10358k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (C2873r) m10358k;
    }

    /* renamed from: m */
    public final C2873r m10360m() {
        C2873r m10355h = m10355h(null);
        return m10355h == null ? m10356i((C2873r) f8851b.get(this)) : m10355h;
    }

    /* renamed from: q */
    public boolean mo10347q() {
        return m10358k() instanceof C2840A;
    }

    /* renamed from: r */
    public boolean m10361r() {
        return m10362s() == null;
    }

    /* renamed from: s */
    public final C2873r m10362s() {
        Object m10358k;
        C2873r c2873r;
        do {
            m10358k = m10358k();
            if (m10358k instanceof C2840A) {
                return ((C2840A) m10358k).f8803a;
            }
            if (m10358k == this) {
                return (C2873r) m10358k;
            }
            AbstractC5469l.m23026c(m10358k, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            c2873r = (C2873r) m10358k;
        } while (!AbstractC6581b.m27343a(f8850a, this, m10358k, c2873r.m10363t()));
        c2873r.m10355h(null);
        return null;
    }

    /* renamed from: t */
    public final C2840A m10363t() {
        C2840A c2840a = (C2840A) f8852c.get(this);
        if (c2840a != null) {
            return c2840a;
        }
        C2840A c2840a2 = new C2840A(this);
        f8852c.set(this, c2840a2);
        return c2840a2;
    }

    public String toString() {
        return new AbstractC5473p(this) { // from class: X5.r.b
            @Override // p111P5.InterfaceC1973g
            public Object get() {
                return AbstractC2342N.m8004a(this.receiver);
            }
        } + '@' + AbstractC2342N.m8005b(this);
    }

    /* renamed from: u */
    public final int m10364u(C2873r c2873r, C2873r c2873r2, a aVar) {
        f8851b.set(c2873r, this);
        f8850a.set(c2873r, c2873r2);
        aVar.f8854c = c2873r2;
        if (AbstractC6581b.m27343a(f8850a, this, c2873r2, aVar)) {
            return aVar.mo10302a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
