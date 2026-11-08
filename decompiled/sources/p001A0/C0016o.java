package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.o */
/* loaded from: classes.dex */
public final class C0016o implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f92a;

    /* renamed from: b */
    public InterfaceC0861T f93b;

    /* renamed from: j */
    public boolean f101j;

    /* renamed from: k */
    public boolean f102k;

    /* renamed from: l */
    public boolean f103l;

    /* renamed from: c */
    public long f94c = -9223372036854775807L;

    /* renamed from: f */
    public int f97f = -1;

    /* renamed from: g */
    public long f98g = -9223372036854775807L;

    /* renamed from: d */
    public long f95d = 0;

    /* renamed from: e */
    public int f96e = -1;

    /* renamed from: h */
    public int f99h = -1;

    /* renamed from: i */
    public int f100i = -1;

    public C0016o(C7107h c7107h) {
        this.f92a = c7107h;
    }

    /* renamed from: e */
    private void m57e() {
        InterfaceC0861T interfaceC0861T = (InterfaceC0861T) AbstractC5332a.m21800e(this.f93b);
        long j7 = this.f98g;
        boolean z6 = this.f103l;
        interfaceC0861T.mo562c(j7, z6 ? 1 : 0, this.f97f, 0, null);
        this.f97f = -1;
        this.f98g = -9223372036854775807L;
        this.f101j = false;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f94c = j7;
        this.f97f = -1;
        this.f95d = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f93b = mo455b;
        mo455b.mo566e(this.f92a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        int i8;
        int i9;
        AbstractC5332a.m21804i(this.f93b);
        if (m58f(c5357z, i7)) {
            if (this.f97f == -1 && this.f101j) {
                this.f103l = (c5357z.m21951j() & 4) == 0;
            }
            if (!this.f102k && (i8 = this.f99h) != -1 && (i9 = this.f100i) != -1) {
                C4327q c4327q = this.f92a.f25275c;
                if (i8 != c4327q.f15144t || i9 != c4327q.f15145u) {
                    this.f93b.mo566e(c4327q.m18193a().m18271v0(this.f99h).m18248Y(this.f100i).m18234K());
                }
                this.f102k = true;
            }
            int m21942a = c5357z.m21942a();
            this.f93b.mo564d(c5357z, m21942a);
            int i10 = this.f97f;
            if (i10 == -1) {
                this.f97f = m21942a;
            } else {
                this.f97f = i10 + m21942a;
            }
            this.f98g = AbstractC0014m.m54a(this.f95d, j7, this.f94c, 90000);
            if (z6) {
                m57e();
            }
            this.f96e = i7;
        }
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        AbstractC5332a.m21802g(this.f94c == -9223372036854775807L);
        this.f94c = j7;
    }

    /* renamed from: f */
    public final boolean m58f(C5357z c5357z, int i7) {
        int m21926G = c5357z.m21926G();
        if ((m21926G & 8) == 8) {
            if (this.f101j && this.f97f > 0) {
                m57e();
            }
            this.f101j = true;
        } else {
            if (!this.f101j) {
                AbstractC5346o.m21867h("RtpVp9Reader", "First payload octet of the RTP packet is not the beginning of a new VP9 partition, Dropping current packet.");
                return false;
            }
            int m29300b = C7104e.m29300b(this.f96e);
            if (i7 < m29300b) {
                AbstractC5346o.m21867h("RtpVp9Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
                return false;
            }
        }
        if ((m21926G & 128) != 0 && (c5357z.m21926G() & 128) != 0 && c5357z.m21942a() < 1) {
            return false;
        }
        int i8 = m21926G & 16;
        AbstractC5332a.m21797b(i8 == 0, "VP9 flexible mode is not supported.");
        if ((m21926G & 32) != 0) {
            c5357z.m21940U(1);
            if (c5357z.m21942a() < 1) {
                return false;
            }
            if (i8 == 0) {
                c5357z.m21940U(1);
            }
        }
        if ((m21926G & 2) != 0) {
            int m21926G2 = c5357z.m21926G();
            int i9 = (m21926G2 >> 5) & 7;
            if ((m21926G2 & 16) != 0) {
                int i10 = i9 + 1;
                if (c5357z.m21942a() < i10 * 4) {
                    return false;
                }
                for (int i11 = 0; i11 < i10; i11++) {
                    this.f99h = c5357z.m21932M();
                    this.f100i = c5357z.m21932M();
                }
            }
            if ((m21926G2 & 8) != 0) {
                int m21926G3 = c5357z.m21926G();
                if (c5357z.m21942a() < m21926G3) {
                    return false;
                }
                for (int i12 = 0; i12 < m21926G3; i12++) {
                    int m21932M = (c5357z.m21932M() & 12) >> 2;
                    if (c5357z.m21942a() < m21932M) {
                        return false;
                    }
                    c5357z.m21940U(m21932M);
                }
            }
        }
        return true;
    }
}
