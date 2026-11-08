package p328r1;

import java.util.Arrays;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p259j0.AbstractC5332a;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p328r1.InterfaceC6259K;

/* renamed from: r1.n */
/* loaded from: classes.dex */
public final class C6275n implements InterfaceC6274m {

    /* renamed from: q */
    public static final double[] f22567q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a */
    public String f22568a;

    /* renamed from: b */
    public InterfaceC0861T f22569b;

    /* renamed from: c */
    public final C6261M f22570c;

    /* renamed from: d */
    public final C5357z f22571d;

    /* renamed from: e */
    public final C6284w f22572e;

    /* renamed from: f */
    public final boolean[] f22573f;

    /* renamed from: g */
    public final a f22574g;

    /* renamed from: h */
    public long f22575h;

    /* renamed from: i */
    public boolean f22576i;

    /* renamed from: j */
    public boolean f22577j;

    /* renamed from: k */
    public long f22578k;

    /* renamed from: l */
    public long f22579l;

    /* renamed from: m */
    public long f22580m;

    /* renamed from: n */
    public long f22581n;

    /* renamed from: o */
    public boolean f22582o;

    /* renamed from: p */
    public boolean f22583p;

    /* renamed from: r1.n$a */
    public static final class a {

        /* renamed from: e */
        public static final byte[] f22584e = {0, 0, 1};

        /* renamed from: a */
        public boolean f22585a;

        /* renamed from: b */
        public int f22586b;

        /* renamed from: c */
        public int f22587c;

        /* renamed from: d */
        public byte[] f22588d;

        public a(int i7) {
            this.f22588d = new byte[i7];
        }

        /* renamed from: a */
        public void m26236a(byte[] bArr, int i7, int i8) {
            if (this.f22585a) {
                int i9 = i8 - i7;
                byte[] bArr2 = this.f22588d;
                int length = bArr2.length;
                int i10 = this.f22586b;
                if (length < i10 + i9) {
                    this.f22588d = Arrays.copyOf(bArr2, (i10 + i9) * 2);
                }
                System.arraycopy(bArr, i7, this.f22588d, this.f22586b, i9);
                this.f22586b += i9;
            }
        }

        /* renamed from: b */
        public boolean m26237b(int i7, int i8) {
            if (this.f22585a) {
                int i9 = this.f22586b - i8;
                this.f22586b = i9;
                if (this.f22587c != 0 || i7 != 181) {
                    this.f22585a = false;
                    return true;
                }
                this.f22587c = i9;
            } else if (i7 == 179) {
                this.f22585a = true;
            }
            byte[] bArr = f22584e;
            m26236a(bArr, 0, bArr.length);
            return false;
        }

        /* renamed from: c */
        public void m26238c() {
            this.f22585a = false;
            this.f22586b = 0;
            this.f22587c = 0;
        }
    }

    public C6275n() {
        this(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair m26235f(p328r1.C6275n.a r8, java.lang.String r9) {
        /*
            byte[] r0 = r8.f22588d
            int r1 = r8.f22586b
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            r1 = 4
            r2 = r0[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 5
            r4 = r0[r3]
            r5 = r4 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r1
            int r5 = r5 >> r1
            r2 = r2 | r5
            r4 = r4 & 15
            int r4 = r4 << 8
            r4 = r4 | r6
            r5 = 7
            r6 = r0[r5]
            r6 = r6 & 240(0xf0, float:3.36E-43)
            int r6 = r6 >> r1
            r7 = 2
            if (r6 == r7) goto L3e
            r7 = 3
            if (r6 == r7) goto L38
            if (r6 == r1) goto L30
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L44
        L30:
            int r1 = r4 * 121
            float r1 = (float) r1
            int r6 = r2 * 100
        L35:
            float r6 = (float) r6
            float r1 = r1 / r6
            goto L44
        L38:
            int r1 = r4 * 16
            float r1 = (float) r1
            int r6 = r2 * 9
            goto L35
        L3e:
            int r1 = r4 * 4
            float r1 = (float) r1
            int r6 = r2 * 3
            goto L35
        L44:
            g0.q$b r6 = new g0.q$b
            r6.<init>()
            g0.q$b r9 = r6.m18250a0(r9)
            java.lang.String r6 = "video/mpeg2"
            g0.q$b r9 = r9.m18264o0(r6)
            g0.q$b r9 = r9.m18271v0(r2)
            g0.q$b r9 = r9.m18248Y(r4)
            g0.q$b r9 = r9.m18260k0(r1)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            g0.q$b r9 = r9.m18251b0(r1)
            g0.q r9 = r9.m18234K()
            r1 = r0[r5]
            r1 = r1 & 15
            int r1 = r1 + (-1)
            if (r1 < 0) goto L98
            double[] r2 = p328r1.C6275n.f22567q
            int r4 = r2.length
            if (r1 >= r4) goto L98
            r1 = r2[r1]
            int r8 = r8.f22587c
            int r8 = r8 + 9
            r8 = r0[r8]
            r0 = r8 & 96
            int r0 = r0 >> r3
            r8 = r8 & 31
            if (r0 == r8) goto L90
            double r3 = (double) r0
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r5
            int r8 = r8 + 1
            double r5 = (double) r8
            double r3 = r3 / r5
            double r1 = r1 * r3
        L90:
            r3 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r3 = r3 / r1
            long r0 = (long) r3
            goto L9a
        L98:
            r0 = 0
        L9a:
            java.lang.Long r8 = java.lang.Long.valueOf(r0)
            android.util.Pair r8 = android.util.Pair.create(r9, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p328r1.C6275n.m26235f(r1.n$a, java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    @Override // p328r1.InterfaceC6274m
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo26186a(p259j0.C5357z r21) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p328r1.C6275n.mo26186a(j0.z):void");
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: b */
    public void mo26187b() {
        AbstractC5400d.m22316a(this.f22573f);
        this.f22574g.m26238c();
        C6284w c6284w = this.f22572e;
        if (c6284w != null) {
            c6284w.m26317d();
        }
        this.f22575h = 0L;
        this.f22576i = false;
        this.f22579l = -9223372036854775807L;
        this.f22581n = -9223372036854775807L;
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: c */
    public void mo26188c(InterfaceC0885t interfaceC0885t, InterfaceC6259K.d dVar) {
        dVar.m26174a();
        this.f22568a = dVar.m26175b();
        this.f22569b = interfaceC0885t.mo455b(dVar.m26176c(), 2);
        C6261M c6261m = this.f22570c;
        if (c6261m != null) {
            c6261m.m26183b(interfaceC0885t, dVar);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: d */
    public void mo26189d(boolean z6) {
        AbstractC5332a.m21804i(this.f22569b);
        if (z6) {
            boolean z7 = this.f22582o;
            this.f22569b.mo562c(this.f22581n, z7 ? 1 : 0, (int) (this.f22575h - this.f22580m), 0, null);
        }
    }

    @Override // p328r1.InterfaceC6274m
    /* renamed from: e */
    public void mo26190e(long j7, int i7) {
        this.f22579l = j7;
    }

    public C6275n(C6261M c6261m) {
        this.f22570c = c6261m;
        this.f22573f = new boolean[4];
        this.f22574g = new a(128);
        if (c6261m != null) {
            this.f22572e = new C6284w(178, 128);
            this.f22571d = new C5357z();
        } else {
            this.f22572e = null;
            this.f22571d = null;
        }
        this.f22579l = -9223372036854775807L;
        this.f22581n = -9223372036854775807L;
    }
}
