package p233g1;

import java.io.EOFException;
import java.io.IOException;
import java.math.BigInteger;
import org.apache.tika.pipes.PipesConfigBase;
import p078L0.AbstractC0886u;
import p078L0.C0856N;
import p078L0.InterfaceC0855M;
import p078L0.InterfaceC0884s;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;

/* renamed from: g1.a */
/* loaded from: classes.dex */
public final class C4337a implements InterfaceC4343g {

    /* renamed from: a */
    public final C4342f f15438a;

    /* renamed from: b */
    public final long f15439b;

    /* renamed from: c */
    public final long f15440c;

    /* renamed from: d */
    public final AbstractC4345i f15441d;

    /* renamed from: e */
    public int f15442e;

    /* renamed from: f */
    public long f15443f;

    /* renamed from: g */
    public long f15444g;

    /* renamed from: h */
    public long f15445h;

    /* renamed from: i */
    public long f15446i;

    /* renamed from: j */
    public long f15447j;

    /* renamed from: k */
    public long f15448k;

    /* renamed from: l */
    public long f15449l;

    /* renamed from: g1.a$b */
    public final class b implements InterfaceC0855M {
        public b() {
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: f */
        public boolean mo3499f() {
            return true;
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: j */
        public InterfaceC0855M.a mo3500j(long j7) {
            return new InterfaceC0855M.a(new C0856N(j7, AbstractC5330M.m21768q((C4337a.this.f15439b + BigInteger.valueOf(C4337a.this.f15441d.m18465c(j7)).multiply(BigInteger.valueOf(C4337a.this.f15440c - C4337a.this.f15439b)).divide(BigInteger.valueOf(C4337a.this.f15443f)).longValue()) - 30000, C4337a.this.f15439b, C4337a.this.f15440c - 1)));
        }

        @Override // p078L0.InterfaceC0855M
        /* renamed from: l */
        public long mo474l() {
            return C4337a.this.f15441d.m18464b(C4337a.this.f15443f);
        }
    }

    public C4337a(AbstractC4345i abstractC4345i, long j7, long j8, long j9, long j10, boolean z6) {
        AbstractC5332a.m21796a(j7 >= 0 && j8 > j7);
        this.f15441d = abstractC4345i;
        this.f15439b = j7;
        this.f15440c = j8;
        if (j9 == j8 - j7 || z6) {
            this.f15443f = j10;
            this.f15442e = 4;
        } else {
            this.f15442e = 0;
        }
        this.f15438a = new C4342f();
    }

    @Override // p233g1.InterfaceC4343g
    /* renamed from: a */
    public long mo18433a(InterfaceC0884s interfaceC0884s) {
        int i7 = this.f15442e;
        if (i7 == 0) {
            long mo3522u = interfaceC0884s.mo3522u();
            this.f15444g = mo3522u;
            this.f15442e = 1;
            long j7 = this.f15440c - 65307;
            if (j7 > mo3522u) {
                return j7;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                long m18437i = m18437i(interfaceC0884s);
                if (m18437i != -1) {
                    return m18437i;
                }
                this.f15442e = 3;
            } else if (i7 != 3) {
                if (i7 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            m18439k(interfaceC0884s);
            this.f15442e = 4;
            return -(this.f15448k + 2);
        }
        this.f15443f = m18438j(interfaceC0884s);
        this.f15442e = 4;
        return this.f15444g;
    }

    @Override // p233g1.InterfaceC4343g
    /* renamed from: c */
    public void mo18435c(long j7) {
        this.f15445h = AbstractC5330M.m21768q(j7, 0L, this.f15443f - 1);
        this.f15442e = 2;
        this.f15446i = this.f15439b;
        this.f15447j = this.f15440c;
        this.f15448k = 0L;
        this.f15449l = this.f15443f;
    }

    @Override // p233g1.InterfaceC4343g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public b mo18434b() {
        if (this.f15443f != 0) {
            return new b();
        }
        return null;
    }

    /* renamed from: i */
    public final long m18437i(InterfaceC0884s interfaceC0884s) {
        if (this.f15446i == this.f15447j) {
            return -1L;
        }
        long mo3522u = interfaceC0884s.mo3522u();
        if (!this.f15438a.m18460d(interfaceC0884s, this.f15447j)) {
            long j7 = this.f15446i;
            if (j7 != mo3522u) {
                return j7;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f15438a.m18457a(interfaceC0884s, false);
        interfaceC0884s.mo3518p();
        long j8 = this.f15445h;
        C4342f c4342f = this.f15438a;
        long j9 = c4342f.f15468c;
        long j10 = j8 - j9;
        int i7 = c4342f.f15473h + c4342f.f15474i;
        if (0 <= j10 && j10 < 72000) {
            return -1L;
        }
        if (j10 < 0) {
            this.f15447j = mo3522u;
            this.f15449l = j9;
        } else {
            this.f15446i = interfaceC0884s.mo3522u() + i7;
            this.f15448k = this.f15438a.f15468c;
        }
        long j11 = this.f15447j;
        long j12 = this.f15446i;
        if (j11 - j12 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH) {
            this.f15447j = j12;
            return j12;
        }
        long mo3522u2 = interfaceC0884s.mo3522u() - (i7 * (j10 <= 0 ? 2L : 1L));
        long j13 = this.f15447j;
        long j14 = this.f15446i;
        return AbstractC5330M.m21768q(mo3522u2 + ((j10 * (j13 - j14)) / (this.f15449l - this.f15448k)), j14, j13 - 1);
    }

    /* renamed from: j */
    public long m18438j(InterfaceC0884s interfaceC0884s) {
        this.f15438a.m18458b();
        if (!this.f15438a.m18459c(interfaceC0884s)) {
            throw new EOFException();
        }
        this.f15438a.m18457a(interfaceC0884s, false);
        C4342f c4342f = this.f15438a;
        interfaceC0884s.mo3519q(c4342f.f15473h + c4342f.f15474i);
        long j7 = this.f15438a.f15468c;
        while (true) {
            C4342f c4342f2 = this.f15438a;
            if ((c4342f2.f15467b & 4) == 4 || !c4342f2.m18459c(interfaceC0884s) || interfaceC0884s.mo3522u() >= this.f15440c || !this.f15438a.m18457a(interfaceC0884s, true)) {
                break;
            }
            C4342f c4342f3 = this.f15438a;
            if (!AbstractC0886u.m3693e(interfaceC0884s, c4342f3.f15473h + c4342f3.f15474i)) {
                break;
            }
            j7 = this.f15438a.f15468c;
        }
        return j7;
    }

    /* renamed from: k */
    public final void m18439k(InterfaceC0884s interfaceC0884s) {
        while (true) {
            this.f15438a.m18459c(interfaceC0884s);
            this.f15438a.m18457a(interfaceC0884s, false);
            C4342f c4342f = this.f15438a;
            if (c4342f.f15468c > this.f15445h) {
                interfaceC0884s.mo3518p();
                return;
            } else {
                interfaceC0884s.mo3519q(c4342f.f15473h + c4342f.f15474i);
                this.f15446i = interfaceC0884s.mo3522u();
                this.f15448k = this.f15438a.f15468c;
            }
        }
    }
}
