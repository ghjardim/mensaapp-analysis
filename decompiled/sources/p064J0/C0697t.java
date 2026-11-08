package p064J0;

import p064J0.C0694q;
import p232g0.C4310P;
import p259j0.AbstractC5332a;
import p259j0.C5321D;
import p259j0.C5348q;

/* renamed from: J0.t */
/* loaded from: classes.dex */
public final class C0697t {

    /* renamed from: a */
    public final a f2444a;

    /* renamed from: b */
    public final C0694q f2445b;

    /* renamed from: g */
    public C4310P f2450g;

    /* renamed from: i */
    public long f2452i;

    /* renamed from: c */
    public final C0694q.a f2446c = new C0694q.a();

    /* renamed from: d */
    public final C5321D f2447d = new C5321D();

    /* renamed from: e */
    public final C5321D f2448e = new C5321D();

    /* renamed from: f */
    public final C5348q f2449f = new C5348q();

    /* renamed from: h */
    public C4310P f2451h = C4310P.f14967e;

    /* renamed from: j */
    public long f2453j = -9223372036854775807L;

    /* renamed from: J0.t$a */
    public interface a {
        /* renamed from: a */
        void mo2789a(C4310P c4310p);

        /* renamed from: b */
        void mo2790b(long j7, long j8, long j9, boolean z6);

        /* renamed from: c */
        void mo2791c();
    }

    public C0697t(a aVar, C0694q c0694q) {
        this.f2444a = aVar;
        this.f2445b = c0694q;
    }

    /* renamed from: c */
    public static Object m2976c(C5321D c5321d) {
        AbstractC5332a.m21796a(c5321d.m21646k() > 0);
        while (c5321d.m21646k() > 1) {
            c5321d.m21643h();
        }
        return AbstractC5332a.m21800e(c5321d.m21643h());
    }

    /* renamed from: a */
    public final void m2977a() {
        AbstractC5332a.m21804i(Long.valueOf(this.f2449f.m21879d()));
        this.f2444a.mo2791c();
    }

    /* renamed from: b */
    public void m2978b() {
        this.f2449f.m21876a();
        this.f2453j = -9223372036854775807L;
        if (this.f2448e.m21646k() > 0) {
            Long l7 = (Long) m2976c(this.f2448e);
            l7.longValue();
            this.f2448e.m21637a(0L, l7);
        }
        if (this.f2450g != null) {
            this.f2447d.m21639c();
        } else if (this.f2447d.m21646k() > 0) {
            this.f2450g = (C4310P) m2976c(this.f2447d);
        }
    }

    /* renamed from: d */
    public boolean m2979d(long j7) {
        long j8 = this.f2453j;
        return j8 != -9223372036854775807L && j8 >= j7;
    }

    /* renamed from: e */
    public boolean m2980e() {
        return this.f2445b.m2923d(true);
    }

    /* renamed from: f */
    public final boolean m2981f(long j7) {
        Long l7 = (Long) this.f2448e.m21644i(j7);
        if (l7 == null || l7.longValue() == this.f2452i) {
            return false;
        }
        this.f2452i = l7.longValue();
        return true;
    }

    /* renamed from: g */
    public final boolean m2982g(long j7) {
        C4310P c4310p = (C4310P) this.f2447d.m21644i(j7);
        if (c4310p == null || c4310p.equals(C4310P.f14967e) || c4310p.equals(this.f2451h)) {
            return false;
        }
        this.f2451h = c4310p;
        return true;
    }

    /* renamed from: h */
    public void m2983h(long j7, long j8) {
        while (!this.f2449f.m21878c()) {
            long m21877b = this.f2449f.m21877b();
            if (m2981f(m21877b)) {
                this.f2445b.m2929j();
            }
            int m2922c = this.f2445b.m2922c(m21877b, j7, j8, this.f2452i, false, this.f2446c);
            if (m2922c == 0 || m2922c == 1) {
                this.f2453j = m21877b;
                m2984i(m2922c == 0);
            } else if (m2922c != 2 && m2922c != 3 && m2922c != 4) {
                if (m2922c != 5) {
                    throw new IllegalStateException(String.valueOf(m2922c));
                }
                return;
            } else {
                this.f2453j = m21877b;
                m2977a();
            }
        }
    }

    /* renamed from: i */
    public final void m2984i(boolean z6) {
        long longValue = ((Long) AbstractC5332a.m21804i(Long.valueOf(this.f2449f.m21879d()))).longValue();
        if (m2982g(longValue)) {
            this.f2444a.mo2789a(this.f2451h);
        }
        this.f2444a.mo2790b(z6 ? -1L : this.f2446c.m2945g(), longValue, this.f2452i, this.f2445b.m2928i());
    }

    /* renamed from: j */
    public void m2985j(float f7) {
        AbstractC5332a.m21796a(f7 > 0.0f);
        this.f2445b.m2937r(f7);
    }
}
