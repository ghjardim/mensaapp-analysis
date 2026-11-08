package p067J3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import p067J3.C0735b0;
import p088M3.C1170l;
import p088M3.C1176r;
import p088M3.C1179u;
import p088M3.InterfaceC1167i;
import p116Q3.AbstractC2133b;

/* renamed from: J3.c0 */
/* loaded from: classes.dex */
public final class C0737c0 {

    /* renamed from: l */
    public static final C0735b0 f2578l;

    /* renamed from: m */
    public static final C0735b0 f2579m;

    /* renamed from: a */
    public final List f2580a;

    /* renamed from: b */
    public List f2581b;

    /* renamed from: c */
    public C0747h0 f2582c;

    /* renamed from: d */
    public C0747h0 f2583d;

    /* renamed from: e */
    public final List f2584e;

    /* renamed from: f */
    public final C1179u f2585f;

    /* renamed from: g */
    public final String f2586g;

    /* renamed from: h */
    public final long f2587h;

    /* renamed from: i */
    public final a f2588i;

    /* renamed from: j */
    public final C0748i f2589j;

    /* renamed from: k */
    public final C0748i f2590k;

    /* renamed from: J3.c0$a */
    public enum a {
        LIMIT_TO_FIRST,
        LIMIT_TO_LAST
    }

    /* renamed from: J3.c0$b */
    public static class b implements Comparator {

        /* renamed from: a */
        public final List f2594a;

        public b(List list) {
            boolean z6;
            Iterator it = list.iterator();
            loop0: while (true) {
                z6 = false;
                while (it.hasNext()) {
                    z6 = (z6 || ((C0735b0) it.next()).m3087c().equals(C1176r.f3773b)) ? true : z6;
                }
            }
            if (!z6) {
                throw new IllegalArgumentException("QueryComparator needs to have a key ordering");
            }
            this.f2594a = list;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(InterfaceC1167i interfaceC1167i, InterfaceC1167i interfaceC1167i2) {
            Iterator it = this.f2594a.iterator();
            while (it.hasNext()) {
                int m3085a = ((C0735b0) it.next()).m3085a(interfaceC1167i, interfaceC1167i2);
                if (m3085a != 0) {
                    return m3085a;
                }
            }
            return 0;
        }
    }

    static {
        C0735b0.a aVar = C0735b0.a.ASCENDING;
        C1176r c1176r = C1176r.f3773b;
        f2578l = C0735b0.m3084d(aVar, c1176r);
        f2579m = C0735b0.m3084d(C0735b0.a.DESCENDING, c1176r);
    }

    public C0737c0(C1179u c1179u, String str, List list, List list2, long j7, a aVar, C0748i c0748i, C0748i c0748i2) {
        this.f2585f = c1179u;
        this.f2586g = str;
        this.f2580a = list2;
        this.f2584e = list;
        this.f2587h = j7;
        this.f2588i = aVar;
        this.f2589j = c0748i;
        this.f2590k = c0748i2;
    }

    /* renamed from: b */
    public static C0737c0 m3090b(C1179u c1179u) {
        return new C0737c0(c1179u, null);
    }

    /* renamed from: A */
    public C0737c0 m3091A(C0735b0 c0735b0) {
        AbstractC2133b.m7217d(!m3112r(), "No ordering is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f2580a);
        arrayList.add(c0735b0);
        return new C0737c0(this.f2585f, this.f2586g, this.f2584e, arrayList, this.f2587h, this.f2588i, this.f2589j, this.f2590k);
    }

    /* renamed from: B */
    public C0737c0 m3092B(C0748i c0748i) {
        return new C0737c0(this.f2585f, this.f2586g, this.f2584e, this.f2580a, this.f2587h, this.f2588i, c0748i, this.f2590k);
    }

    /* renamed from: C */
    public synchronized C0747h0 m3093C() {
        try {
            if (this.f2583d == null) {
                this.f2583d = m3095E(this.f2580a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2583d;
    }

    /* renamed from: D */
    public synchronized C0747h0 m3094D() {
        try {
            if (this.f2582c == null) {
                this.f2582c = m3095E(m3107m());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2582c;
    }

    /* renamed from: E */
    public final synchronized C0747h0 m3095E(List list) {
        if (this.f2588i == a.LIMIT_TO_FIRST) {
            return new C0747h0(m3108n(), m3100f(), m3103i(), list, this.f2587h, m3109o(), m3101g());
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0735b0 c0735b0 = (C0735b0) it.next();
            C0735b0.a m3086b = c0735b0.m3086b();
            C0735b0.a aVar = C0735b0.a.DESCENDING;
            if (m3086b == aVar) {
                aVar = C0735b0.a.ASCENDING;
            }
            arrayList.add(C0735b0.m3084d(aVar, c0735b0.m3087c()));
        }
        C0748i c0748i = this.f2590k;
        C0748i c0748i2 = c0748i != null ? new C0748i(c0748i.m3199b(), this.f2590k.m3200c()) : null;
        C0748i c0748i3 = this.f2589j;
        return new C0747h0(m3108n(), m3100f(), m3103i(), arrayList, this.f2587h, c0748i2, c0748i3 != null ? new C0748i(c0748i3.m3199b(), this.f2589j.m3200c()) : null);
    }

    /* renamed from: a */
    public C0737c0 m3096a(C1179u c1179u) {
        return new C0737c0(c1179u, null, this.f2584e, this.f2580a, this.f2587h, this.f2588i, this.f2589j, this.f2590k);
    }

    /* renamed from: c */
    public Comparator m3097c() {
        return new b(m3107m());
    }

    /* renamed from: d */
    public C0737c0 m3098d(C0748i c0748i) {
        return new C0737c0(this.f2585f, this.f2586g, this.f2584e, this.f2580a, this.f2587h, this.f2588i, this.f2589j, c0748i);
    }

    /* renamed from: e */
    public C0737c0 m3099e(AbstractC0764q abstractC0764q) {
        AbstractC2133b.m7217d(!m3112r(), "No filter is allowed for document query", new Object[0]);
        ArrayList arrayList = new ArrayList(this.f2584e);
        arrayList.add(abstractC0764q);
        return new C0737c0(this.f2585f, this.f2586g, arrayList, this.f2580a, this.f2587h, this.f2588i, this.f2589j, this.f2590k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0737c0.class != obj.getClass()) {
            return false;
        }
        C0737c0 c0737c0 = (C0737c0) obj;
        if (this.f2588i != c0737c0.f2588i) {
            return false;
        }
        return m3094D().equals(c0737c0.m3094D());
    }

    /* renamed from: f */
    public String m3100f() {
        return this.f2586g;
    }

    /* renamed from: g */
    public C0748i m3101g() {
        return this.f2590k;
    }

    /* renamed from: h */
    public List m3102h() {
        return this.f2580a;
    }

    public int hashCode() {
        return (m3094D().hashCode() * 31) + this.f2588i.hashCode();
    }

    /* renamed from: i */
    public List m3103i() {
        return this.f2584e;
    }

    /* renamed from: j */
    public SortedSet m3104j() {
        TreeSet treeSet = new TreeSet();
        Iterator it = m3103i().iterator();
        while (it.hasNext()) {
            for (C0762p c0762p : ((AbstractC0764q) it.next()).mo3222c()) {
                if (c0762p.m3273i()) {
                    treeSet.add(c0762p.m3270f());
                }
            }
        }
        return treeSet;
    }

    /* renamed from: k */
    public long m3105k() {
        return this.f2587h;
    }

    /* renamed from: l */
    public a m3106l() {
        return this.f2588i;
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* renamed from: m */
    public synchronized java.util.List m3107m() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r0 = r6.f2581b     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L9b
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2e
            r0.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.List r2 = r6.f2580a     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L15:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            J3.b0 r3 = (p067J3.C0735b0) r3     // Catch: java.lang.Throwable -> L2e
            r0.add(r3)     // Catch: java.lang.Throwable -> L2e
            M3.r r3 = r3.f2571b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.mo4464g()     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            goto L15
        L2e:
            r0 = move-exception
            goto L9f
        L30:
            java.util.List r2 = r6.f2580a     // Catch: java.lang.Throwable -> L2e
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L2e
            if (r2 <= 0) goto L4b
            java.util.List r2 = r6.f2580a     // Catch: java.lang.Throwable -> L2e
            int r3 = r2.size()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + (-1)
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L2e
            J3.b0 r2 = (p067J3.C0735b0) r2     // Catch: java.lang.Throwable -> L2e
            J3.b0$a r2 = r2.m3086b()     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L4b:
            J3.b0$a r2 = p067J3.C0735b0.a.ASCENDING     // Catch: java.lang.Throwable -> L2e
        L4d:
            java.util.SortedSet r3 = r6.m3104j()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2e
        L55:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2e
            M3.r r4 = (p088M3.C1176r) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r5 = r4.mo4464g()     // Catch: java.lang.Throwable -> L2e
            boolean r5 = r1.contains(r5)     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            boolean r5 = r4.m4537x()     // Catch: java.lang.Throwable -> L2e
            if (r5 != 0) goto L55
            J3.b0 r4 = p067J3.C0735b0.m3084d(r2, r4)     // Catch: java.lang.Throwable -> L2e
            r0.add(r4)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L79:
            M3.r r3 = p088M3.C1176r.f3773b     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.mo4464g()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L95
            J3.b0$a r1 = p067J3.C0735b0.a.ASCENDING     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L90
            J3.b0 r1 = p067J3.C0737c0.f2578l     // Catch: java.lang.Throwable -> L2e
            goto L92
        L90:
            J3.b0 r1 = p067J3.C0737c0.f2579m     // Catch: java.lang.Throwable -> L2e
        L92:
            r0.add(r1)     // Catch: java.lang.Throwable -> L2e
        L95:
            java.util.List r0 = p256j$.util.DesugarCollections.unmodifiableList(r0)     // Catch: java.lang.Throwable -> L2e
            r6.f2581b = r0     // Catch: java.lang.Throwable -> L2e
        L9b:
            java.util.List r0 = r6.f2581b     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r6)
            return r0
        L9f:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p067J3.C0737c0.m3107m():java.util.List");
    }

    /* renamed from: n */
    public C1179u m3108n() {
        return this.f2585f;
    }

    /* renamed from: o */
    public C0748i m3109o() {
        return this.f2589j;
    }

    /* renamed from: p */
    public boolean m3110p() {
        return this.f2587h != -1;
    }

    /* renamed from: q */
    public boolean m3111q() {
        return this.f2586g != null;
    }

    /* renamed from: r */
    public boolean m3112r() {
        return C1170l.m4500q(this.f2585f) && this.f2586g == null && this.f2584e.isEmpty();
    }

    /* renamed from: s */
    public C0737c0 m3113s(long j7) {
        return new C0737c0(this.f2585f, this.f2586g, this.f2584e, this.f2580a, j7, a.LIMIT_TO_FIRST, this.f2589j, this.f2590k);
    }

    /* renamed from: t */
    public C0737c0 m3114t(long j7) {
        return new C0737c0(this.f2585f, this.f2586g, this.f2584e, this.f2580a, j7, a.LIMIT_TO_LAST, this.f2589j, this.f2590k);
    }

    public String toString() {
        return "Query(target=" + m3094D().toString() + ";limitType=" + this.f2588i.toString() + ")";
    }

    /* renamed from: u */
    public boolean m3115u(InterfaceC1167i interfaceC1167i) {
        return interfaceC1167i.mo4482c() && m3120z(interfaceC1167i) && m3119y(interfaceC1167i) && m3118x(interfaceC1167i) && m3117w(interfaceC1167i);
    }

    /* renamed from: v */
    public boolean m3116v() {
        if (this.f2584e.isEmpty() && this.f2587h == -1 && this.f2589j == null && this.f2590k == null) {
            return m3102h().isEmpty() || (m3102h().size() == 1 && ((C0735b0) m3102h().get(0)).f2571b.m4537x());
        }
        return false;
    }

    /* renamed from: w */
    public final boolean m3117w(InterfaceC1167i interfaceC1167i) {
        C0748i c0748i = this.f2589j;
        if (c0748i != null && !c0748i.m3203f(m3107m(), interfaceC1167i)) {
            return false;
        }
        C0748i c0748i2 = this.f2590k;
        return c0748i2 == null || c0748i2.m3202e(m3107m(), interfaceC1167i);
    }

    /* renamed from: x */
    public final boolean m3118x(InterfaceC1167i interfaceC1167i) {
        Iterator it = this.f2584e.iterator();
        while (it.hasNext()) {
            if (!((AbstractC0764q) it.next()).mo3063d(interfaceC1167i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: y */
    public final boolean m3119y(InterfaceC1167i interfaceC1167i) {
        for (C0735b0 c0735b0 : m3107m()) {
            if (!c0735b0.m3087c().equals(C1176r.f3773b) && interfaceC1167i.mo4485f(c0735b0.f2571b) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m3120z(InterfaceC1167i interfaceC1167i) {
        C1179u m4505o = interfaceC1167i.getKey().m4505o();
        return this.f2586g != null ? interfaceC1167i.getKey().m4506p(this.f2586g) && this.f2585f.m4470p(m4505o) : C1170l.m4500q(this.f2585f) ? this.f2585f.equals(m4505o) : this.f2585f.m4470p(m4505o) && this.f2585f.m4471q() == m4505o.m4471q() - 1;
    }

    public C0737c0(C1179u c1179u, String str) {
        this(c1179u, str, Collections.emptyList(), Collections.emptyList(), -1L, a.LIMIT_TO_FIRST, null, null);
    }
}
