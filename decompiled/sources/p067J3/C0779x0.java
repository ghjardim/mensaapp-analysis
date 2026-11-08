package p067J3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p067J3.C0728W;
import p067J3.C0756m;
import p067J3.C0783z0;
import p088M3.C1170l;
import p088M3.C1172n;
import p088M3.InterfaceC1167i;
import p109P3.C1914X;
import p116Q3.AbstractC2131I;
import p116Q3.AbstractC2133b;
import p376x3.AbstractC6948c;
import p376x3.C6950e;

/* renamed from: J3.x0 */
/* loaded from: classes.dex */
public class C0779x0 {

    /* renamed from: a */
    public final C0737c0 f2769a;

    /* renamed from: c */
    public boolean f2771c;

    /* renamed from: d */
    public C1172n f2772d;

    /* renamed from: e */
    public C6950e f2773e;

    /* renamed from: b */
    public C0783z0.a f2770b = C0783z0.a.NONE;

    /* renamed from: f */
    public C6950e f2774f = C1170l.m4496h();

    /* renamed from: g */
    public C6950e f2775g = C1170l.m4496h();

    /* renamed from: J3.x0$a */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2776a;

        static {
            int[] iArr = new int[C0756m.a.values().length];
            f2776a = iArr;
            try {
                iArr[C0756m.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2776a[C0756m.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2776a[C0756m.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2776a[C0756m.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: J3.x0$b */
    public static class b {

        /* renamed from: a */
        public final C1172n f2777a;

        /* renamed from: b */
        public final C0758n f2778b;

        /* renamed from: c */
        public final boolean f2779c;

        /* renamed from: d */
        public final C6950e f2780d;

        public /* synthetic */ b(C1172n c1172n, C0758n c0758n, C6950e c6950e, boolean z6, a aVar) {
            this(c1172n, c0758n, c6950e, z6);
        }

        /* renamed from: b */
        public boolean m3327b() {
            return this.f2779c;
        }

        public b(C1172n c1172n, C0758n c0758n, C6950e c6950e, boolean z6) {
            this.f2777a = c1172n;
            this.f2778b = c0758n;
            this.f2780d = c6950e;
            this.f2779c = z6;
        }
    }

    public C0779x0(C0737c0 c0737c0, C6950e c6950e) {
        this.f2769a = c0737c0;
        this.f2772d = C1172n.m4508e(c0737c0.m3097c());
        this.f2773e = c6950e;
    }

    /* renamed from: g */
    public static int m3312g(C0756m c0756m) {
        int i7 = a.f2776a[c0756m.m3252c().ordinal()];
        int i8 = 1;
        if (i7 != 1) {
            i8 = 2;
            if (i7 != 2 && i7 != 3) {
                if (i7 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + c0756m.m3252c());
            }
        }
        return i8;
    }

    /* renamed from: b */
    public C0781y0 m3313b(b bVar) {
        return m3314c(bVar, null);
    }

    /* renamed from: c */
    public C0781y0 m3314c(b bVar, C1914X c1914x) {
        return m3315d(bVar, c1914x, false);
    }

    /* renamed from: d */
    public C0781y0 m3315d(b bVar, C1914X c1914x, boolean z6) {
        C0783z0 c0783z0;
        AbstractC2133b.m7217d(!bVar.f2779c, "Cannot apply changes that need a refill", new Object[0]);
        C1172n c1172n = this.f2772d;
        this.f2772d = bVar.f2777a;
        this.f2775g = bVar.f2780d;
        List m3255b = bVar.f2778b.m3255b();
        Collections.sort(m3255b, new Comparator() { // from class: J3.w0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m3322l;
                m3322l = C0779x0.this.m3322l((C0756m) obj, (C0756m) obj2);
                return m3322l;
            }
        });
        m3317f(c1914x);
        List emptyList = z6 ? Collections.emptyList() : m3325o();
        C0783z0.a aVar = (this.f2774f.size() == 0 && this.f2771c && !z6) ? C0783z0.a.SYNCED : C0783z0.a.LOCAL;
        boolean z7 = aVar != this.f2770b;
        this.f2770b = aVar;
        if (m3255b.size() != 0 || z7) {
            c0783z0 = new C0783z0(this.f2769a, bVar.f2777a, c1172n, m3255b, aVar == C0783z0.a.LOCAL, bVar.f2780d, z7, false, (c1914x == null || c1914x.m6759e().isEmpty()) ? false : true);
        } else {
            c0783z0 = null;
        }
        return new C0781y0(c0783z0, emptyList);
    }

    /* renamed from: e */
    public C0781y0 m3316e(EnumC0733a0 enumC0733a0) {
        if (!this.f2771c || enumC0733a0 != EnumC0733a0.OFFLINE) {
            return new C0781y0(null, Collections.emptyList());
        }
        this.f2771c = false;
        return m3313b(new b(this.f2772d, new C0758n(), this.f2775g, false, null));
    }

    /* renamed from: f */
    public final void m3317f(C1914X c1914x) {
        if (c1914x != null) {
            Iterator it = c1914x.m6756b().iterator();
            while (it.hasNext()) {
                this.f2773e = this.f2773e.m28471e((C1170l) it.next());
            }
            Iterator it2 = c1914x.m6757c().iterator();
            while (it2.hasNext()) {
                C1170l c1170l = (C1170l) it2.next();
                AbstractC2133b.m7217d(this.f2773e.contains(c1170l), "Modified document %s not found in view.", c1170l);
            }
            Iterator it3 = c1914x.m6758d().iterator();
            while (it3.hasNext()) {
                this.f2773e = this.f2773e.m28473g((C1170l) it3.next());
            }
            this.f2771c = c1914x.m6760f();
        }
    }

    /* renamed from: h */
    public b m3318h(AbstractC6948c abstractC6948c) {
        return m3319i(abstractC6948c, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f5, code lost:
    
        if (r18.f2769a.m3097c().compare(r6, r4) > 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
    
        if (r18.f2769a.m3097c().compare(r6, r7) < 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0132, code lost:
    
        if (r7 == null) goto L66;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p067J3.C0779x0.b m3319i(p376x3.AbstractC6948c r19, p067J3.C0779x0.b r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067J3.C0779x0.m3319i(x3.c, J3.x0$b):J3.x0$b");
    }

    /* renamed from: j */
    public C0783z0.a m3320j() {
        return this.f2770b;
    }

    /* renamed from: k */
    public C6950e m3321k() {
        return this.f2773e;
    }

    /* renamed from: l */
    public final /* synthetic */ int m3322l(C0756m c0756m, C0756m c0756m2) {
        int m7197l = AbstractC2131I.m7197l(m3312g(c0756m), m3312g(c0756m2));
        return m7197l != 0 ? m7197l : this.f2769a.m3097c().compare(c0756m.m3251b(), c0756m2.m3251b());
    }

    /* renamed from: m */
    public final boolean m3323m(C1170l c1170l) {
        InterfaceC1167i m4511f;
        return (this.f2773e.contains(c1170l) || (m4511f = this.f2772d.m4511f(c1170l)) == null || m4511f.mo4484e()) ? false : true;
    }

    /* renamed from: n */
    public final boolean m3324n(InterfaceC1167i interfaceC1167i, InterfaceC1167i interfaceC1167i2) {
        return interfaceC1167i.mo4484e() && interfaceC1167i2.mo4483d() && !interfaceC1167i2.mo4484e();
    }

    /* renamed from: o */
    public final List m3325o() {
        if (!this.f2771c) {
            return Collections.emptyList();
        }
        C6950e c6950e = this.f2774f;
        this.f2774f = C1170l.m4496h();
        Iterator it = this.f2772d.iterator();
        while (it.hasNext()) {
            InterfaceC1167i interfaceC1167i = (InterfaceC1167i) it.next();
            if (m3323m(interfaceC1167i.getKey())) {
                this.f2774f = this.f2774f.m28471e(interfaceC1167i.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(c6950e.size() + this.f2774f.size());
        Iterator it2 = c6950e.iterator();
        while (it2.hasNext()) {
            C1170l c1170l = (C1170l) it2.next();
            if (!this.f2774f.contains(c1170l)) {
                arrayList.add(new C0728W(C0728W.a.REMOVED, c1170l));
            }
        }
        Iterator it3 = this.f2774f.iterator();
        while (it3.hasNext()) {
            C1170l c1170l2 = (C1170l) it3.next();
            if (!c6950e.contains(c1170l2)) {
                arrayList.add(new C0728W(C0728W.a.ADDED, c1170l2));
            }
        }
        return arrayList;
    }
}
