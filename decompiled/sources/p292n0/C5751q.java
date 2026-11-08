package p292n0;

import android.os.SystemClock;
import p203c3.AbstractC3579i;
import p232g0.C4331u;
import p259j0.AbstractC5330M;

/* renamed from: n0.q */
/* loaded from: classes.dex */
public final class C5751q implements InterfaceC5758t0 {

    /* renamed from: a */
    public final float f20830a;

    /* renamed from: b */
    public final float f20831b;

    /* renamed from: c */
    public final long f20832c;

    /* renamed from: d */
    public final float f20833d;

    /* renamed from: e */
    public final long f20834e;

    /* renamed from: f */
    public final long f20835f;

    /* renamed from: g */
    public final float f20836g;

    /* renamed from: h */
    public long f20837h;

    /* renamed from: i */
    public long f20838i;

    /* renamed from: j */
    public long f20839j;

    /* renamed from: k */
    public long f20840k;

    /* renamed from: l */
    public long f20841l;

    /* renamed from: m */
    public long f20842m;

    /* renamed from: n */
    public float f20843n;

    /* renamed from: o */
    public float f20844o;

    /* renamed from: p */
    public float f20845p;

    /* renamed from: q */
    public long f20846q;

    /* renamed from: r */
    public long f20847r;

    /* renamed from: s */
    public long f20848s;

    /* renamed from: n0.q$b */
    public static final class b {

        /* renamed from: a */
        public float f20849a = 0.97f;

        /* renamed from: b */
        public float f20850b = 1.03f;

        /* renamed from: c */
        public long f20851c = 1000;

        /* renamed from: d */
        public float f20852d = 1.0E-7f;

        /* renamed from: e */
        public long f20853e = AbstractC5330M.m21692K0(20);

        /* renamed from: f */
        public long f20854f = AbstractC5330M.m21692K0(500);

        /* renamed from: g */
        public float f20855g = 0.999f;

        /* renamed from: a */
        public C5751q m24188a() {
            return new C5751q(this.f20849a, this.f20850b, this.f20851c, this.f20852d, this.f20853e, this.f20854f, this.f20855g);
        }
    }

    /* renamed from: h */
    public static long m24179h(long j7, long j8, float f7) {
        return (long) ((j7 * f7) + ((1.0f - f7) * j8));
    }

    @Override // p292n0.InterfaceC5758t0
    /* renamed from: a */
    public float mo24180a(long j7, long j8) {
        if (this.f20837h == -9223372036854775807L) {
            return 1.0f;
        }
        m24187i(j7, j8);
        if (this.f20846q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f20846q < this.f20832c) {
            return this.f20845p;
        }
        this.f20846q = SystemClock.elapsedRealtime();
        m24185f(j7);
        long j9 = j7 - this.f20842m;
        if (Math.abs(j9) < this.f20834e) {
            this.f20845p = 1.0f;
        } else {
            this.f20845p = AbstractC5330M.m21764o((this.f20833d * j9) + 1.0f, this.f20844o, this.f20843n);
        }
        return this.f20845p;
    }

    @Override // p292n0.InterfaceC5758t0
    /* renamed from: b */
    public long mo24181b() {
        return this.f20842m;
    }

    @Override // p292n0.InterfaceC5758t0
    /* renamed from: c */
    public void mo24182c() {
        long j7 = this.f20842m;
        if (j7 == -9223372036854775807L) {
            return;
        }
        long j8 = j7 + this.f20835f;
        this.f20842m = j8;
        long j9 = this.f20841l;
        if (j9 != -9223372036854775807L && j8 > j9) {
            this.f20842m = j9;
        }
        this.f20846q = -9223372036854775807L;
    }

    @Override // p292n0.InterfaceC5758t0
    /* renamed from: d */
    public void mo24183d(C4331u.g gVar) {
        this.f20837h = AbstractC5330M.m21692K0(gVar.f15286a);
        this.f20840k = AbstractC5330M.m21692K0(gVar.f15287b);
        this.f20841l = AbstractC5330M.m21692K0(gVar.f15288c);
        float f7 = gVar.f15289d;
        if (f7 == -3.4028235E38f) {
            f7 = this.f20830a;
        }
        this.f20844o = f7;
        float f8 = gVar.f15290e;
        if (f8 == -3.4028235E38f) {
            f8 = this.f20831b;
        }
        this.f20843n = f8;
        if (f7 == 1.0f && f8 == 1.0f) {
            this.f20837h = -9223372036854775807L;
        }
        m24186g();
    }

    @Override // p292n0.InterfaceC5758t0
    /* renamed from: e */
    public void mo24184e(long j7) {
        this.f20838i = j7;
        m24186g();
    }

    /* renamed from: f */
    public final void m24185f(long j7) {
        long j8 = this.f20847r + (this.f20848s * 3);
        if (this.f20842m > j8) {
            float m21692K0 = AbstractC5330M.m21692K0(this.f20832c);
            this.f20842m = AbstractC3579i.m14439c(j8, this.f20839j, this.f20842m - (((long) ((this.f20845p - 1.0f) * m21692K0)) + ((long) ((this.f20843n - 1.0f) * m21692K0))));
            return;
        }
        long m21768q = AbstractC5330M.m21768q(j7 - ((long) (Math.max(0.0f, this.f20845p - 1.0f) / this.f20833d)), this.f20842m, j8);
        this.f20842m = m21768q;
        long j9 = this.f20841l;
        if (j9 == -9223372036854775807L || m21768q <= j9) {
            return;
        }
        this.f20842m = j9;
    }

    /* renamed from: g */
    public final void m24186g() {
        long j7;
        long j8 = this.f20837h;
        if (j8 != -9223372036854775807L) {
            j7 = this.f20838i;
            if (j7 == -9223372036854775807L) {
                long j9 = this.f20840k;
                if (j9 != -9223372036854775807L && j8 < j9) {
                    j8 = j9;
                }
                j7 = this.f20841l;
                if (j7 == -9223372036854775807L || j8 <= j7) {
                    j7 = j8;
                }
            }
        } else {
            j7 = -9223372036854775807L;
        }
        if (this.f20839j == j7) {
            return;
        }
        this.f20839j = j7;
        this.f20842m = j7;
        this.f20847r = -9223372036854775807L;
        this.f20848s = -9223372036854775807L;
        this.f20846q = -9223372036854775807L;
    }

    /* renamed from: i */
    public final void m24187i(long j7, long j8) {
        long j9 = j7 - j8;
        long j10 = this.f20847r;
        if (j10 == -9223372036854775807L) {
            this.f20847r = j9;
            this.f20848s = 0L;
        } else {
            long max = Math.max(j9, m24179h(j10, j9, this.f20836g));
            this.f20847r = max;
            this.f20848s = m24179h(this.f20848s, Math.abs(j9 - max), this.f20836g);
        }
    }

    public C5751q(float f7, float f8, long j7, float f9, long j8, long j9, float f10) {
        this.f20830a = f7;
        this.f20831b = f8;
        this.f20832c = j7;
        this.f20833d = f9;
        this.f20834e = j8;
        this.f20835f = j9;
        this.f20836g = f10;
        this.f20837h = -9223372036854775807L;
        this.f20838i = -9223372036854775807L;
        this.f20840k = -9223372036854775807L;
        this.f20841l = -9223372036854775807L;
        this.f20844o = f7;
        this.f20843n = f8;
        this.f20845p = 1.0f;
        this.f20846q = -9223372036854775807L;
        this.f20839j = -9223372036854775807L;
        this.f20842m = -9223372036854775807L;
        this.f20847r = -9223372036854775807L;
        this.f20848s = -9223372036854775807L;
    }
}
