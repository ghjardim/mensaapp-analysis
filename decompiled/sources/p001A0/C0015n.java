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

/* renamed from: A0.n */
/* loaded from: classes.dex */
public final class C0015n implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f82a;

    /* renamed from: b */
    public InterfaceC0861T f83b;

    /* renamed from: c */
    public long f84c = -9223372036854775807L;

    /* renamed from: d */
    public int f85d = -1;

    /* renamed from: e */
    public int f86e = -1;

    /* renamed from: f */
    public long f87f = -9223372036854775807L;

    /* renamed from: g */
    public long f88g = 0;

    /* renamed from: h */
    public boolean f89h;

    /* renamed from: i */
    public boolean f90i;

    /* renamed from: j */
    public boolean f91j;

    public C0015n(C7107h c7107h) {
        this.f82a = c7107h;
    }

    /* renamed from: e */
    private void m55e() {
        InterfaceC0861T interfaceC0861T = (InterfaceC0861T) AbstractC5332a.m21800e(this.f83b);
        long j7 = this.f87f;
        boolean z6 = this.f90i;
        interfaceC0861T.mo562c(j7, z6 ? 1 : 0, this.f86e, 0, null);
        this.f86e = -1;
        this.f87f = -9223372036854775807L;
        this.f89h = false;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f84c = j7;
        this.f86e = -1;
        this.f88g = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f83b = mo455b;
        mo455b.mo566e(this.f82a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        AbstractC5332a.m21804i(this.f83b);
        if (m56f(c5357z, i7)) {
            if (this.f86e == -1 && this.f89h) {
                this.f90i = (c5357z.m21951j() & 1) == 0;
            }
            if (!this.f91j) {
                int m21947f = c5357z.m21947f();
                c5357z.m21939T(m21947f + 6);
                int m21966y = c5357z.m21966y() & 16383;
                int m21966y2 = c5357z.m21966y() & 16383;
                c5357z.m21939T(m21947f);
                C4327q c4327q = this.f82a.f25275c;
                if (m21966y != c4327q.f15144t || m21966y2 != c4327q.f15145u) {
                    this.f83b.mo566e(c4327q.m18193a().m18271v0(m21966y).m18248Y(m21966y2).m18234K());
                }
                this.f91j = true;
            }
            int m21942a = c5357z.m21942a();
            this.f83b.mo564d(c5357z, m21942a);
            int i8 = this.f86e;
            if (i8 == -1) {
                this.f86e = m21942a;
            } else {
                this.f86e = i8 + m21942a;
            }
            this.f87f = AbstractC0014m.m54a(this.f88g, j7, this.f84c, 90000);
            if (z6) {
                m55e();
            }
            this.f85d = i7;
        }
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        AbstractC5332a.m21802g(this.f84c == -9223372036854775807L);
        this.f84c = j7;
    }

    /* renamed from: f */
    public final boolean m56f(C5357z c5357z, int i7) {
        int m21926G = c5357z.m21926G();
        if ((m21926G & 16) == 16 && (m21926G & 7) == 0) {
            if (this.f89h && this.f86e > 0) {
                m55e();
            }
            this.f89h = true;
        } else {
            if (!this.f89h) {
                AbstractC5346o.m21867h("RtpVP8Reader", "RTP packet is not the start of a new VP8 partition, skipping.");
                return false;
            }
            int m29300b = C7104e.m29300b(this.f85d);
            if (i7 < m29300b) {
                AbstractC5346o.m21867h("RtpVP8Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
                return false;
            }
        }
        if ((m21926G & 128) != 0) {
            int m21926G2 = c5357z.m21926G();
            if ((m21926G2 & 128) != 0 && (c5357z.m21926G() & 128) != 0) {
                c5357z.m21940U(1);
            }
            if ((m21926G2 & 64) != 0) {
                c5357z.m21940U(1);
            }
            if ((m21926G2 & 32) != 0 || (m21926G2 & 16) != 0) {
                c5357z.m21940U(1);
            }
        }
        return true;
    }
}
