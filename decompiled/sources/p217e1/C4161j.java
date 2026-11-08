package p217e1;

import p078L0.AbstractC0851I;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: e1.j */
/* loaded from: classes.dex */
public final class C4161j implements InterfaceC4158g {

    /* renamed from: a */
    public final long f13960a;

    /* renamed from: b */
    public final int f13961b;

    /* renamed from: c */
    public final long f13962c;

    /* renamed from: d */
    public final int f13963d;

    /* renamed from: e */
    public final long f13964e;

    /* renamed from: f */
    public final long f13965f;

    /* renamed from: g */
    public final long[] f13966g;

    public C4161j(long j7, int i7, long j8, int i8) {
        this(j7, i7, j8, i8, -1L, null);
    }

    /* renamed from: a */
    public static C4161j m17485a(C4160i c4160i, long j7) {
        long[] jArr;
        long m17484a = c4160i.m17484a();
        if (m17484a == -9223372036854775807L) {
            return null;
        }
        long j8 = c4160i.f13956c;
        if (j8 == -1 || (jArr = c4160i.f13959f) == null) {
            AbstractC0851I.a aVar = c4160i.f13954a;
            return new C4161j(j7, aVar.f2930c, m17484a, aVar.f2933f);
        }
        AbstractC0851I.a aVar2 = c4160i.f13954a;
        return new C4161j(j7, aVar2.f2930c, m17484a, aVar2.f2933f, j8, jArr);
    }

    /* renamed from: b */
    public final long m17486b(int i7) {
        return (this.f13962c * i7) / 100;
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: c */
    public long mo17455c(long j7) {
        long j8 = j7 - this.f13960a;
        if (!mo3499f() || j8 <= this.f13961b) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC5332a.m21804i(this.f13966g);
        double d7 = (j8 * 256.0d) / this.f13964e;
        int m21744h = AbstractC5330M.m21744h(jArr, (long) d7, true, true);
        long m17486b = m17486b(m21744h);
        long j9 = jArr[m21744h];
        int i7 = m21744h + 1;
        long m17486b2 = m17486b(i7);
        return m17486b + Math.round((j9 == (m21744h == 99 ? 256L : jArr[i7]) ? 0.0d : (d7 - j9) / (r0 - j9)) * (m17486b2 - m17486b));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: e */
    public long mo17456e() {
        return this.f13965f;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: f */
    public boolean mo3499f() {
        return this.f13966g != null;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: j */
    public InterfaceC0855M.a mo3500j(long j7) {
        if (!mo3499f()) {
            return new InterfaceC0855M.a(new C0856N(0L, this.f13960a + this.f13961b));
        }
        long m21768q = AbstractC5330M.m21768q(j7, 0L, this.f13962c);
        double d7 = (m21768q * 100.0d) / this.f13962c;
        double d8 = 0.0d;
        if (d7 > 0.0d) {
            if (d7 >= 100.0d) {
                d8 = 256.0d;
            } else {
                int i7 = (int) d7;
                double d9 = ((long[]) AbstractC5332a.m21804i(this.f13966g))[i7];
                d8 = d9 + ((d7 - i7) * ((i7 == 99 ? 256.0d : r3[i7 + 1]) - d9));
            }
        }
        return new InterfaceC0855M.a(new C0856N(m21768q, this.f13960a + AbstractC5330M.m21768q(Math.round((d8 / 256.0d) * this.f13964e), this.f13961b, this.f13964e - 1)));
    }

    @Override // p217e1.InterfaceC4158g
    /* renamed from: k */
    public int mo17457k() {
        return this.f13963d;
    }

    @Override // p078L0.InterfaceC0855M
    /* renamed from: l */
    public long mo474l() {
        return this.f13962c;
    }

    public C4161j(long j7, int i7, long j8, int i8, long j9, long[] jArr) {
        this.f13960a = j7;
        this.f13961b = i7;
        this.f13962c = j8;
        this.f13963d = i8;
        this.f13964e = j9;
        this.f13966g = jArr;
        this.f13965f = j9 != -1 ? j7 + j9 : -1L;
    }
}
