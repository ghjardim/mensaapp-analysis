package p116Q3;

import java.util.Date;
import p116Q3.C2138g;

/* renamed from: Q3.r */
/* loaded from: classes.dex */
public class C2149r {

    /* renamed from: a */
    public final C2138g f6512a;

    /* renamed from: b */
    public final C2138g.d f6513b;

    /* renamed from: c */
    public final long f6514c;

    /* renamed from: d */
    public final double f6515d;

    /* renamed from: e */
    public final long f6516e;

    /* renamed from: f */
    public long f6517f;

    /* renamed from: g */
    public long f6518g;

    /* renamed from: h */
    public long f6519h;

    /* renamed from: i */
    public C2138g.b f6520i;

    public C2149r(C2138g c2138g, C2138g.d dVar, long j7, double d7, long j8) {
        this.f6512a = c2138g;
        this.f6513b = dVar;
        this.f6514c = j7;
        this.f6515d = d7;
        this.f6516e = j8;
        this.f6517f = j8;
        this.f6519h = new Date().getTime();
        m7301f();
    }

    /* renamed from: b */
    public void m7297b(final Runnable runnable) {
        m7298c();
        long m7299d = this.f6518g + m7299d();
        long max = Math.max(0L, new Date().getTime() - this.f6519h);
        long max2 = Math.max(0L, m7299d - max);
        if (this.f6518g > 0) {
            AbstractC2155x.m7309a(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(max2), Long.valueOf(this.f6518g), Long.valueOf(m7299d), Long.valueOf(max));
        }
        this.f6520i = this.f6512a.m7233k(this.f6513b, max2, new Runnable() { // from class: Q3.q
            @Override // java.lang.Runnable
            public final void run() {
                C2149r.this.m7300e(runnable);
            }
        });
        long j7 = (long) (this.f6518g * this.f6515d);
        this.f6518g = j7;
        long j8 = this.f6514c;
        if (j7 < j8) {
            this.f6518g = j8;
        } else {
            long j9 = this.f6517f;
            if (j7 > j9) {
                this.f6518g = j9;
            }
        }
        this.f6517f = this.f6516e;
    }

    /* renamed from: c */
    public void m7298c() {
        C2138g.b bVar = this.f6520i;
        if (bVar != null) {
            bVar.m7245c();
            this.f6520i = null;
        }
    }

    /* renamed from: d */
    public final long m7299d() {
        return (long) ((Math.random() - 0.5d) * this.f6518g);
    }

    /* renamed from: e */
    public final /* synthetic */ void m7300e(Runnable runnable) {
        this.f6519h = new Date().getTime();
        runnable.run();
    }

    /* renamed from: f */
    public void m7301f() {
        this.f6518g = 0L;
    }

    /* renamed from: g */
    public void m7302g() {
        this.f6518g = this.f6517f;
    }

    /* renamed from: h */
    public void m7303h(long j7) {
        this.f6517f = j7;
    }

    public C2149r(C2138g c2138g, C2138g.d dVar) {
        this(c2138g, dVar, 1000L, 1.5d, 60000L);
    }
}
