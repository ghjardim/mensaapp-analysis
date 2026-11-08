package p064J0;

import java.util.Arrays;

/* renamed from: J0.i */
/* loaded from: classes.dex */
public final class C0686i {

    /* renamed from: c */
    public boolean f2339c;

    /* renamed from: d */
    public boolean f2340d;

    /* renamed from: f */
    public int f2342f;

    /* renamed from: a */
    public a f2337a = new a();

    /* renamed from: b */
    public a f2338b = new a();

    /* renamed from: e */
    public long f2341e = -9223372036854775807L;

    /* renamed from: J0.i$a */
    public static final class a {

        /* renamed from: a */
        public long f2343a;

        /* renamed from: b */
        public long f2344b;

        /* renamed from: c */
        public long f2345c;

        /* renamed from: d */
        public long f2346d;

        /* renamed from: e */
        public long f2347e;

        /* renamed from: f */
        public long f2348f;

        /* renamed from: g */
        public final boolean[] f2349g = new boolean[15];

        /* renamed from: h */
        public int f2350h;

        /* renamed from: c */
        public static int m2815c(long j7) {
            return (int) (j7 % 15);
        }

        /* renamed from: a */
        public long m2816a() {
            long j7 = this.f2347e;
            if (j7 == 0) {
                return 0L;
            }
            return this.f2348f / j7;
        }

        /* renamed from: b */
        public long m2817b() {
            return this.f2348f;
        }

        /* renamed from: d */
        public boolean m2818d() {
            long j7 = this.f2346d;
            if (j7 == 0) {
                return false;
            }
            return this.f2349g[m2815c(j7 - 1)];
        }

        /* renamed from: e */
        public boolean m2819e() {
            return this.f2346d > 15 && this.f2350h == 0;
        }

        /* renamed from: f */
        public void m2820f(long j7) {
            long j8 = this.f2346d;
            if (j8 == 0) {
                this.f2343a = j7;
            } else if (j8 == 1) {
                long j9 = j7 - this.f2343a;
                this.f2344b = j9;
                this.f2348f = j9;
                this.f2347e = 1L;
            } else {
                long j10 = j7 - this.f2345c;
                int m2815c = m2815c(j8);
                if (Math.abs(j10 - this.f2344b) <= 1000000) {
                    this.f2347e++;
                    this.f2348f += j10;
                    boolean[] zArr = this.f2349g;
                    if (zArr[m2815c]) {
                        zArr[m2815c] = false;
                        this.f2350h--;
                    }
                } else {
                    boolean[] zArr2 = this.f2349g;
                    if (!zArr2[m2815c]) {
                        zArr2[m2815c] = true;
                        this.f2350h++;
                    }
                }
            }
            this.f2346d++;
            this.f2345c = j7;
        }

        /* renamed from: g */
        public void m2821g() {
            this.f2346d = 0L;
            this.f2347e = 0L;
            this.f2348f = 0L;
            this.f2350h = 0;
            Arrays.fill(this.f2349g, false);
        }
    }

    /* renamed from: a */
    public long m2808a() {
        if (m2812e()) {
            return this.f2337a.m2816a();
        }
        return -9223372036854775807L;
    }

    /* renamed from: b */
    public float m2809b() {
        if (m2812e()) {
            return (float) (1.0E9d / this.f2337a.m2816a());
        }
        return -1.0f;
    }

    /* renamed from: c */
    public int m2810c() {
        return this.f2342f;
    }

    /* renamed from: d */
    public long m2811d() {
        if (m2812e()) {
            return this.f2337a.m2817b();
        }
        return -9223372036854775807L;
    }

    /* renamed from: e */
    public boolean m2812e() {
        return this.f2337a.m2819e();
    }

    /* renamed from: f */
    public void m2813f(long j7) {
        this.f2337a.m2820f(j7);
        if (this.f2337a.m2819e() && !this.f2340d) {
            this.f2339c = false;
        } else if (this.f2341e != -9223372036854775807L) {
            if (!this.f2339c || this.f2338b.m2818d()) {
                this.f2338b.m2821g();
                this.f2338b.m2820f(this.f2341e);
            }
            this.f2339c = true;
            this.f2338b.m2820f(j7);
        }
        if (this.f2339c && this.f2338b.m2819e()) {
            a aVar = this.f2337a;
            this.f2337a = this.f2338b;
            this.f2338b = aVar;
            this.f2339c = false;
            this.f2340d = false;
        }
        this.f2341e = j7;
        this.f2342f = this.f2337a.m2819e() ? 0 : this.f2342f + 1;
    }

    /* renamed from: g */
    public void m2814g() {
        this.f2337a.m2821g();
        this.f2338b.m2821g();
        this.f2339c = false;
        this.f2341e = -9223372036854775807L;
        this.f2342f = 0;
    }
}
