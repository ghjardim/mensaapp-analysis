package p078L0;

import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: L0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0870e {

    /* renamed from: a */
    public final a f3020a;

    /* renamed from: b */
    public final f f3021b;

    /* renamed from: c */
    public c f3022c;

    /* renamed from: d */
    public final int f3023d;

    /* renamed from: L0.e$a */
    public static class a implements InterfaceC0855M {

        /* renamed from: a */
        public final d f3024a;

        /* renamed from: b */
        public final long f3025b;

        /* renamed from: c */
        public final long f3026c;

        /* renamed from: d */
        public final long f3027d;

        /* renamed from: e */
        public final long f3028e;

        /* renamed from: f */
        public final long f3029f;

        /* renamed from: g */
        public final long f3030g;

        public a(d dVar, long j7, long j8, long j9, long j10, long j11, long j12) {
            this.f3024a = dVar;
            this.f3025b = j7;
            this.f3026c = j8;
            this.f3027d = j9;
            this.f3028e = j10;
            this.f3029f = j11;
            this.f3030g = j12;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: f */
        public boolean mo3499f() {
            return true;
        }

        /* renamed from: i */
        public long m3621i(long j7) {
            return this.f3024a.mo3622a(j7);
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: j */
        public InterfaceC0855M.a mo3500j(long j7) {
            return new InterfaceC0855M.a(new C0856N(j7, c.m3630h(this.f3024a.mo3622a(j7), this.f3026c, this.f3027d, this.f3028e, this.f3029f, this.f3030g)));
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: l */
        public long mo474l() {
            return this.f3025b;
        }
    }

    /* renamed from: L0.e$c */
    public static class c {

        /* renamed from: a */
        public final long f3031a;

        /* renamed from: b */
        public final long f3032b;

        /* renamed from: c */
        public final long f3033c;

        /* renamed from: d */
        public long f3034d;

        /* renamed from: e */
        public long f3035e;

        /* renamed from: f */
        public long f3036f;

        /* renamed from: g */
        public long f3037g;

        /* renamed from: h */
        public long f3038h;

        public c(long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
            this.f3031a = j7;
            this.f3032b = j8;
            this.f3034d = j9;
            this.f3035e = j10;
            this.f3036f = j11;
            this.f3037g = j12;
            this.f3033c = j13;
            this.f3038h = m3630h(j8, j9, j10, j11, j12, j13);
        }

        /* renamed from: h */
        public static long m3630h(long j7, long j8, long j9, long j10, long j11, long j12) {
            if (j10 + 1 >= j11 || j8 + 1 >= j9) {
                return j10;
            }
            long j13 = (long) ((j7 - j8) * ((j11 - j10) / (j9 - j8)));
            return AbstractC5330M.m21768q(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
        }

        /* renamed from: i */
        public final long m3631i() {
            return this.f3037g;
        }

        /* renamed from: j */
        public final long m3632j() {
            return this.f3036f;
        }

        /* renamed from: k */
        public final long m3633k() {
            return this.f3038h;
        }

        /* renamed from: l */
        public final long m3634l() {
            return this.f3031a;
        }

        /* renamed from: m */
        public final long m3635m() {
            return this.f3032b;
        }

        /* renamed from: n */
        public final void m3636n() {
            this.f3038h = m3630h(this.f3032b, this.f3034d, this.f3035e, this.f3036f, this.f3037g, this.f3033c);
        }

        /* renamed from: o */
        public final void m3637o(long j7, long j8) {
            this.f3035e = j7;
            this.f3037g = j8;
            m3636n();
        }

        /* renamed from: p */
        public final void m3638p(long j7, long j8) {
            this.f3034d = j7;
            this.f3036f = j8;
            m3636n();
        }
    }

    /* renamed from: L0.e$d */
    public interface d {
        /* renamed from: a */
        long mo3622a(long j7);
    }

    /* renamed from: L0.e$e */
    public static final class e {

        /* renamed from: d */
        public static final e f3039d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a */
        public final int f3040a;

        /* renamed from: b */
        public final long f3041b;

        /* renamed from: c */
        public final long f3042c;

        public e(int i7, long j7, long j8) {
            this.f3040a = i7;
            this.f3041b = j7;
            this.f3042c = j8;
        }

        /* renamed from: d */
        public static e m3642d(long j7, long j8) {
            return new e(-1, j7, j8);
        }

        /* renamed from: e */
        public static e m3643e(long j7) {
            return new e(0, -9223372036854775807L, j7);
        }

        /* renamed from: f */
        public static e m3644f(long j7, long j8) {
            return new e(-2, j7, j8);
        }
    }

    /* renamed from: L0.e$f */
    public interface f {
        /* renamed from: a */
        e mo3645a(InterfaceC0884s interfaceC0884s, long j7);

        /* renamed from: b */
        void mo3646b();
    }

    public AbstractC0870e(d dVar, f fVar, long j7, long j8, long j9, long j10, long j11, long j12, int i7) {
        this.f3021b = fVar;
        this.f3023d = i7;
        this.f3020a = new a(dVar, j7, j8, j9, j10, j11, j12);
    }

    /* renamed from: a */
    public c m3607a(long j7) {
        return new c(j7, this.f3020a.m3621i(j7), this.f3020a.f3026c, this.f3020a.f3027d, this.f3020a.f3028e, this.f3020a.f3029f, this.f3020a.f3030g);
    }

    /* renamed from: b */
    public final InterfaceC0855M m3608b() {
        return this.f3020a;
    }

    /* renamed from: c */
    public int m3609c(InterfaceC0884s interfaceC0884s, C0854L c0854l) {
        while (true) {
            c cVar = (c) AbstractC5332a.m21804i(this.f3022c);
            long m3632j = cVar.m3632j();
            long m3631i = cVar.m3631i();
            long m3633k = cVar.m3633k();
            if (m3631i - m3632j <= this.f3023d) {
                m3611e(false, m3632j);
                return m3613g(interfaceC0884s, m3632j, c0854l);
            }
            if (!m3615i(interfaceC0884s, m3633k)) {
                return m3613g(interfaceC0884s, m3633k, c0854l);
            }
            interfaceC0884s.mo3518p();
            e mo3645a = this.f3021b.mo3645a(interfaceC0884s, cVar.m3635m());
            int i7 = mo3645a.f3040a;
            if (i7 == -3) {
                m3611e(false, m3633k);
                return m3613g(interfaceC0884s, m3633k, c0854l);
            }
            if (i7 == -2) {
                cVar.m3638p(mo3645a.f3041b, mo3645a.f3042c);
            } else {
                if (i7 != -1) {
                    if (i7 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    m3615i(interfaceC0884s, mo3645a.f3042c);
                    m3611e(true, mo3645a.f3042c);
                    return m3613g(interfaceC0884s, mo3645a.f3042c, c0854l);
                }
                cVar.m3637o(mo3645a.f3041b, mo3645a.f3042c);
            }
        }
    }

    /* renamed from: d */
    public final boolean m3610d() {
        return this.f3022c != null;
    }

    /* renamed from: e */
    public final void m3611e(boolean z6, long j7) {
        this.f3022c = null;
        this.f3021b.mo3646b();
        m3612f(z6, j7);
    }

    /* renamed from: g */
    public final int m3613g(InterfaceC0884s interfaceC0884s, long j7, C0854L c0854l) {
        if (j7 == interfaceC0884s.mo3522u()) {
            return 0;
        }
        c0854l.f2935a = j7;
        return 1;
    }

    /* renamed from: h */
    public final void m3614h(long j7) {
        c cVar = this.f3022c;
        if (cVar == null || cVar.m3634l() != j7) {
            this.f3022c = m3607a(j7);
        }
    }

    /* renamed from: i */
    public final boolean m3615i(InterfaceC0884s interfaceC0884s, long j7) {
        long mo3522u = j7 - interfaceC0884s.mo3522u();
        if (mo3522u < 0 || mo3522u > 262144) {
            return false;
        }
        interfaceC0884s.mo3519q((int) mo3522u);
        return true;
    }

    /* renamed from: L0.e$b */
    public static final class b implements d {
        @Override // p078L0.AbstractC0870e.d
        /* renamed from: a */
        public long mo3622a(long j7) {
            return j7;
        }
    }

    /* renamed from: f */
    public void m3612f(boolean z6, long j7) {
    }
}
