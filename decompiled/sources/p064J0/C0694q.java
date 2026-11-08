package p064J0;

import android.content.Context;
import android.view.Surface;
import p259j0.AbstractC5330M;
import p259j0.InterfaceC5334c;

/* renamed from: J0.q */
/* loaded from: classes.dex */
public final class C0694q {

    /* renamed from: a */
    public final b f2405a;

    /* renamed from: b */
    public final C0696s f2406b;

    /* renamed from: c */
    public final long f2407c;

    /* renamed from: d */
    public boolean f2408d;

    /* renamed from: g */
    public long f2411g;

    /* renamed from: j */
    public boolean f2414j;

    /* renamed from: e */
    public int f2409e = 0;

    /* renamed from: f */
    public long f2410f = -9223372036854775807L;

    /* renamed from: h */
    public long f2412h = -9223372036854775807L;

    /* renamed from: i */
    public long f2413i = -9223372036854775807L;

    /* renamed from: k */
    public float f2415k = 1.0f;

    /* renamed from: l */
    public InterfaceC5334c f2416l = InterfaceC5334c.f18817a;

    /* renamed from: J0.q$a */
    public static class a {

        /* renamed from: a */
        public long f2417a = -9223372036854775807L;

        /* renamed from: b */
        public long f2418b = -9223372036854775807L;

        /* renamed from: f */
        public long m2944f() {
            return this.f2417a;
        }

        /* renamed from: g */
        public long m2945g() {
            return this.f2418b;
        }

        /* renamed from: h */
        public final void m2946h() {
            this.f2417a = -9223372036854775807L;
            this.f2418b = -9223372036854775807L;
        }
    }

    /* renamed from: J0.q$b */
    public interface b {
        /* renamed from: E */
        boolean mo2842E(long j7, long j8);

        /* renamed from: m */
        boolean mo2882m(long j7, long j8, long j9, boolean z6, boolean z7);

        /* renamed from: w */
        boolean mo2900w(long j7, long j8, boolean z6);
    }

    public C0694q(Context context, b bVar, long j7) {
        this.f2405a = bVar;
        this.f2407c = j7;
        this.f2406b = new C0696s(context);
    }

    /* renamed from: a */
    public void m2920a() {
        if (this.f2409e == 0) {
            this.f2409e = 1;
        }
    }

    /* renamed from: b */
    public final long m2921b(long j7, long j8, long j9) {
        long j10 = (long) ((j9 - j7) / this.f2415k);
        return this.f2408d ? j10 - (AbstractC5330M.m21692K0(this.f2416l.mo21613b()) - j8) : j10;
    }

    /* renamed from: c */
    public int m2922c(long j7, long j8, long j9, long j10, boolean z6, a aVar) {
        aVar.m2946h();
        if (this.f2410f == -9223372036854775807L) {
            this.f2410f = j8;
        }
        if (this.f2412h != j7) {
            this.f2406b.m2955h(j7);
            this.f2412h = j7;
        }
        aVar.f2417a = m2921b(j8, j9, j7);
        boolean z7 = false;
        if (m2938s(j8, aVar.f2417a, j10)) {
            return 0;
        }
        if (!this.f2408d || j8 == this.f2410f) {
            return 5;
        }
        long mo21614c = this.f2416l.mo21614c();
        aVar.f2418b = this.f2406b.m2951b((aVar.f2417a * 1000) + mo21614c);
        aVar.f2417a = (aVar.f2418b - mo21614c) / 1000;
        if (this.f2413i != -9223372036854775807L && !this.f2414j) {
            z7 = true;
        }
        if (this.f2405a.mo2882m(aVar.f2417a, j8, j9, z6, z7)) {
            return 4;
        }
        return this.f2405a.mo2900w(aVar.f2417a, j9, z6) ? z7 ? 3 : 2 : aVar.f2417a > 50000 ? 5 : 1;
    }

    /* renamed from: d */
    public boolean m2923d(boolean z6) {
        if (z6 && this.f2409e == 3) {
            this.f2413i = -9223372036854775807L;
            return true;
        }
        if (this.f2413i == -9223372036854775807L) {
            return false;
        }
        if (this.f2416l.mo21613b() < this.f2413i) {
            return true;
        }
        this.f2413i = -9223372036854775807L;
        return false;
    }

    /* renamed from: e */
    public void m2924e(boolean z6) {
        this.f2414j = z6;
        this.f2413i = this.f2407c > 0 ? this.f2416l.mo21613b() + this.f2407c : -9223372036854775807L;
    }

    /* renamed from: f */
    public final void m2925f(int i7) {
        this.f2409e = Math.min(this.f2409e, i7);
    }

    /* renamed from: g */
    public void m2926g() {
        m2925f(0);
    }

    /* renamed from: h */
    public void m2927h(boolean z6) {
        this.f2409e = z6 ? 1 : 0;
    }

    /* renamed from: i */
    public boolean m2928i() {
        boolean z6 = this.f2409e != 3;
        this.f2409e = 3;
        this.f2411g = AbstractC5330M.m21692K0(this.f2416l.mo21613b());
        return z6;
    }

    /* renamed from: j */
    public void m2929j() {
        m2925f(2);
    }

    /* renamed from: k */
    public void m2930k() {
        this.f2408d = true;
        this.f2411g = AbstractC5330M.m21692K0(this.f2416l.mo21613b());
        this.f2406b.m2958k();
    }

    /* renamed from: l */
    public void m2931l() {
        this.f2408d = false;
        this.f2413i = -9223372036854775807L;
        this.f2406b.m2959l();
    }

    /* renamed from: m */
    public void m2932m() {
        this.f2406b.m2957j();
        this.f2412h = -9223372036854775807L;
        this.f2410f = -9223372036854775807L;
        m2925f(1);
        this.f2413i = -9223372036854775807L;
    }

    /* renamed from: n */
    public void m2933n(int i7) {
        this.f2406b.m2962o(i7);
    }

    /* renamed from: o */
    public void m2934o(InterfaceC5334c interfaceC5334c) {
        this.f2416l = interfaceC5334c;
    }

    /* renamed from: p */
    public void m2935p(float f7) {
        this.f2406b.m2954g(f7);
    }

    /* renamed from: q */
    public void m2936q(Surface surface) {
        this.f2406b.m2960m(surface);
        m2925f(1);
    }

    /* renamed from: r */
    public void m2937r(float f7) {
        if (f7 == this.f2415k) {
            return;
        }
        this.f2415k = f7;
        this.f2406b.m2956i(f7);
    }

    /* renamed from: s */
    public final boolean m2938s(long j7, long j8, long j9) {
        if (this.f2413i != -9223372036854775807L && !this.f2414j) {
            return false;
        }
        int i7 = this.f2409e;
        if (i7 == 0) {
            return this.f2408d;
        }
        if (i7 == 1) {
            return true;
        }
        if (i7 == 2) {
            return j7 >= j9;
        }
        if (i7 == 3) {
            return this.f2408d && this.f2405a.mo2842E(j8, AbstractC5330M.m21692K0(this.f2416l.mo21613b()) - this.f2411g);
        }
        throw new IllegalStateException();
    }
}
