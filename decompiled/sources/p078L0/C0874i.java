package p078L0;

import p078L0.InterfaceC0855M;

/* renamed from: L0.i */
/* loaded from: classes.dex */
public class C0874i implements InterfaceC0855M {

    /* renamed from: a */
    public final long f3049a;

    /* renamed from: b */
    public final long f3050b;

    /* renamed from: c */
    public final int f3051c;

    /* renamed from: d */
    public final long f3052d;

    /* renamed from: e */
    public final int f3053e;

    /* renamed from: f */
    public final long f3054f;

    /* renamed from: g */
    public final boolean f3055g;

    public C0874i(long j7, long j8, int i7, int i8, boolean z6) {
        this.f3049a = j7;
        this.f3050b = j8;
        this.f3051c = i8 == -1 ? 1 : i8;
        this.f3053e = i7;
        this.f3055g = z6;
        if (j7 == -1) {
            this.f3052d = -1L;
            this.f3054f = -9223372036854775807L;
        } else {
            this.f3052d = j7 - j8;
            this.f3054f = m3652d(j7, j8, i7);
        }
    }

    /* renamed from: d */
    public static long m3652d(long j7, long j8, int i7) {
        return (Math.max(0L, j7 - j8) * 8000000) / i7;
    }

    /* renamed from: a */
    public final long m3653a(long j7) {
        int i7 = this.f3051c;
        long j8 = (((j7 * this.f3053e) / 8000000) / i7) * i7;
        long j9 = this.f3052d;
        if (j9 != -1) {
            j8 = Math.min(j8, j9 - i7);
        }
        return this.f3050b + Math.max(j8, 0L);
    }

    /* renamed from: b */
    public long m3654b(long j7) {
        return m3652d(j7, this.f3050b, this.f3053e);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return this.f3052d != -1 || this.f3055g;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        if (this.f3052d == -1 && !this.f3055g) {
            return new InterfaceC0855M.a(new C0856N(0L, this.f3050b));
        }
        long m3653a = m3653a(j7);
        long m3654b = m3654b(m3653a);
        C0856N c0856n = new C0856N(m3654b, m3653a);
        if (this.f3052d != -1 && m3654b < j7) {
            int i7 = this.f3051c;
            if (i7 + m3653a < this.f3049a) {
                long j8 = m3653a + i7;
                return new InterfaceC0855M.a(c0856n, new C0856N(m3654b(j8), j8));
            }
        }
        return new InterfaceC0855M.a(c0856n);
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f3054f;
    }
}
