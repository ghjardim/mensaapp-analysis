package p327r0;

import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
import p195b3.AbstractC3521a;
import p232g0.C4327q;
import p259j0.AbstractC5330M;

/* renamed from: r0.k */
/* loaded from: classes.dex */
public abstract class AbstractC6244k {

    /* renamed from: a */
    public final C6242i f22351a;

    /* renamed from: b */
    public final long f22352b;

    /* renamed from: c */
    public final long f22353c;

    /* renamed from: r0.k$a */
    public static abstract class a extends AbstractC6244k {

        /* renamed from: d */
        public final long f22354d;

        /* renamed from: e */
        public final long f22355e;

        /* renamed from: f */
        public final List f22356f;

        /* renamed from: g */
        public final long f22357g;

        /* renamed from: h */
        public final long f22358h;

        /* renamed from: i */
        public final long f22359i;

        public a(C6242i c6242i, long j7, long j8, long j9, long j10, List list, long j11, long j12, long j13) {
            super(c6242i, j7, j8);
            this.f22354d = j9;
            this.f22355e = j10;
            this.f22356f = list;
            this.f22359i = j11;
            this.f22357g = j12;
            this.f22358h = j13;
        }

        /* renamed from: c */
        public long m26097c(long j7, long j8) {
            long mo26101g = mo26101g(j7);
            return mo26101g != -1 ? mo26101g : (int) (m26103i((j8 - this.f22358h) + this.f22359i, j7) - m26098d(j7, j8));
        }

        /* renamed from: d */
        public long m26098d(long j7, long j8) {
            if (mo26101g(j7) == -1) {
                long j9 = this.f22357g;
                if (j9 != -9223372036854775807L) {
                    return Math.max(m26099e(), m26103i((j8 - this.f22358h) - j9, j7));
                }
            }
            return m26099e();
        }

        /* renamed from: e */
        public long m26099e() {
            return this.f22354d;
        }

        /* renamed from: f */
        public long m26100f(long j7, long j8) {
            if (this.f22356f != null) {
                return -9223372036854775807L;
            }
            long m26098d = m26098d(j7, j8) + m26097c(j7, j8);
            return (m26104j(m26098d) + m26102h(m26098d, j7)) - this.f22359i;
        }

        /* renamed from: g */
        public abstract long mo26101g(long j7);

        /* renamed from: h */
        public final long m26102h(long j7, long j8) {
            List list = this.f22356f;
            if (list != null) {
                return (((d) list.get((int) (j7 - this.f22354d))).f22365b * 1000000) / this.f22352b;
            }
            long mo26101g = mo26101g(j8);
            return (mo26101g == -1 || j7 != (m26099e() + mo26101g) - 1) ? (this.f22355e * 1000000) / this.f22352b : j8 - m26104j(j7);
        }

        /* renamed from: i */
        public long m26103i(long j7, long j8) {
            long m26099e = m26099e();
            long mo26101g = mo26101g(j8);
            if (mo26101g == 0) {
                return m26099e;
            }
            if (this.f22356f == null) {
                long j9 = this.f22354d + (j7 / ((this.f22355e * 1000000) / this.f22352b));
                return j9 < m26099e ? m26099e : mo26101g == -1 ? j9 : Math.min(j9, (m26099e + mo26101g) - 1);
            }
            long j10 = (mo26101g + m26099e) - 1;
            long j11 = m26099e;
            while (j11 <= j10) {
                long j12 = ((j10 - j11) / 2) + j11;
                long m26104j = m26104j(j12);
                if (m26104j < j7) {
                    j11 = j12 + 1;
                } else {
                    if (m26104j <= j7) {
                        return j12;
                    }
                    j10 = j12 - 1;
                }
            }
            return j11 == m26099e ? j11 : j10;
        }

        /* renamed from: j */
        public final long m26104j(long j7) {
            List list = this.f22356f;
            return AbstractC5330M.m21718X0(list != null ? ((d) list.get((int) (j7 - this.f22354d))).f22364a - this.f22353c : (j7 - this.f22354d) * this.f22355e, 1000000L, this.f22352b);
        }

        /* renamed from: k */
        public abstract C6242i mo26105k(AbstractC6243j abstractC6243j, long j7);

        /* renamed from: l */
        public boolean mo26106l() {
            return this.f22356f != null;
        }
    }

    /* renamed from: r0.k$b */
    public static final class b extends a {

        /* renamed from: j */
        public final List f22360j;

        public b(C6242i c6242i, long j7, long j8, long j9, long j10, List list, long j11, List list2, long j12, long j13) {
            super(c6242i, j7, j8, j9, j10, list, j11, j12, j13);
            this.f22360j = list2;
        }

        @Override // p327r0.AbstractC6244k.a
        /* renamed from: g */
        public long mo26101g(long j7) {
            return this.f22360j.size();
        }

        @Override // p327r0.AbstractC6244k.a
        /* renamed from: k */
        public C6242i mo26105k(AbstractC6243j abstractC6243j, long j7) {
            return (C6242i) this.f22360j.get((int) (j7 - this.f22354d));
        }

        @Override // p327r0.AbstractC6244k.a
        /* renamed from: l */
        public boolean mo26106l() {
            return true;
        }
    }

    /* renamed from: r0.k$c */
    public static final class c extends a {

        /* renamed from: j */
        public final C6247n f22361j;

        /* renamed from: k */
        public final C6247n f22362k;

        /* renamed from: l */
        public final long f22363l;

        public c(C6242i c6242i, long j7, long j8, long j9, long j10, long j11, List list, long j12, C6247n c6247n, C6247n c6247n2, long j13, long j14) {
            super(c6242i, j7, j8, j9, j11, list, j12, j13, j14);
            this.f22361j = c6247n;
            this.f22362k = c6247n2;
            this.f22363l = j10;
        }

        @Override // p327r0.AbstractC6244k
        /* renamed from: a */
        public C6242i mo26095a(AbstractC6243j abstractC6243j) {
            C6247n c6247n = this.f22361j;
            if (c6247n == null) {
                return super.mo26095a(abstractC6243j);
            }
            C4327q c4327q = abstractC6243j.f22338b;
            return new C6242i(c6247n.m26110a(c4327q.f15125a, 0L, c4327q.f15133i, 0L), 0L, -1L);
        }

        @Override // p327r0.AbstractC6244k.a
        /* renamed from: g */
        public long mo26101g(long j7) {
            if (this.f22356f != null) {
                return r0.size();
            }
            long j8 = this.f22363l;
            if (j8 != -1) {
                return (j8 - this.f22354d) + 1;
            }
            if (j7 != -9223372036854775807L) {
                return AbstractC3521a.m14152a(BigInteger.valueOf(j7).multiply(BigInteger.valueOf(this.f22352b)), BigInteger.valueOf(this.f22355e).multiply(BigInteger.valueOf(1000000L)), RoundingMode.CEILING).longValue();
            }
            return -1L;
        }

        @Override // p327r0.AbstractC6244k.a
        /* renamed from: k */
        public C6242i mo26105k(AbstractC6243j abstractC6243j, long j7) {
            List list = this.f22356f;
            long j8 = list != null ? ((d) list.get((int) (j7 - this.f22354d))).f22364a : (j7 - this.f22354d) * this.f22355e;
            C6247n c6247n = this.f22362k;
            C4327q c4327q = abstractC6243j.f22338b;
            return new C6242i(c6247n.m26110a(c4327q.f15125a, j7, c4327q.f15133i, j8), 0L, -1L);
        }
    }

    /* renamed from: r0.k$d */
    public static final class d {

        /* renamed from: a */
        public final long f22364a;

        /* renamed from: b */
        public final long f22365b;

        public d(long j7, long j8) {
            this.f22364a = j7;
            this.f22365b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22364a == dVar.f22364a && this.f22365b == dVar.f22365b;
        }

        public int hashCode() {
            return (((int) this.f22364a) * 31) + ((int) this.f22365b);
        }
    }

    public AbstractC6244k(C6242i c6242i, long j7, long j8) {
        this.f22351a = c6242i;
        this.f22352b = j7;
        this.f22353c = j8;
    }

    /* renamed from: a */
    public C6242i mo26095a(AbstractC6243j abstractC6243j) {
        return this.f22351a;
    }

    /* renamed from: b */
    public long m26096b() {
        return AbstractC5330M.m21718X0(this.f22353c, 1000000L, this.f22352b);
    }

    /* renamed from: r0.k$e */
    public static class e extends AbstractC6244k {

        /* renamed from: d */
        public final long f22366d;

        /* renamed from: e */
        public final long f22367e;

        public e(C6242i c6242i, long j7, long j8, long j9, long j10) {
            super(c6242i, j7, j8);
            this.f22366d = j9;
            this.f22367e = j10;
        }

        /* renamed from: c */
        public C6242i m26107c() {
            long j7 = this.f22367e;
            if (j7 <= 0) {
                return null;
            }
            return new C6242i(null, this.f22366d, j7);
        }

        public e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}
