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

/* renamed from: A0.e */
/* loaded from: classes.dex */
public final class C0006e implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f25a;

    /* renamed from: b */
    public InterfaceC0861T f26b;

    /* renamed from: d */
    public int f28d;

    /* renamed from: f */
    public int f30f;

    /* renamed from: g */
    public int f31g;

    /* renamed from: h */
    public boolean f32h;

    /* renamed from: i */
    public boolean f33i;

    /* renamed from: j */
    public long f34j;

    /* renamed from: k */
    public long f35k;

    /* renamed from: l */
    public boolean f36l;

    /* renamed from: c */
    public long f27c = -9223372036854775807L;

    /* renamed from: e */
    public int f29e = -1;

    public C0006e(C7107h c7107h) {
        this.f25a = c7107h;
    }

    /* renamed from: e */
    private void m39e() {
        InterfaceC0861T interfaceC0861T = (InterfaceC0861T) AbstractC5332a.m21800e(this.f26b);
        long j7 = this.f35k;
        boolean z6 = this.f32h;
        interfaceC0861T.mo562c(j7, z6 ? 1 : 0, this.f28d, 0, null);
        this.f28d = 0;
        this.f35k = -9223372036854775807L;
        this.f32h = false;
        this.f36l = false;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f27c = j7;
        this.f28d = 0;
        this.f34j = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f26b = mo455b;
        mo455b.mo566e(this.f25a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        AbstractC5332a.m21804i(this.f26b);
        int m21947f = c5357z.m21947f();
        int m21932M = c5357z.m21932M();
        boolean z7 = (m21932M & 1024) > 0;
        if ((m21932M & 512) != 0 || (m21932M & 504) != 0 || (m21932M & 7) != 0) {
            AbstractC5346o.m21867h("RtpH263Reader", "Dropping packet: video reduncancy coding is not supported, packet header VRC, or PLEN or PEBIT is non-zero");
            return;
        }
        if (z7) {
            if (this.f36l && this.f28d > 0) {
                m39e();
            }
            this.f36l = true;
            if ((c5357z.m21951j() & 252) < 128) {
                AbstractC5346o.m21867h("RtpH263Reader", "Picture start Code (PSC) missing, dropping packet.");
                return;
            } else {
                c5357z.m21946e()[m21947f] = 0;
                c5357z.m21946e()[m21947f + 1] = 0;
                c5357z.m21939T(m21947f);
            }
        } else {
            if (!this.f36l) {
                AbstractC5346o.m21867h("RtpH263Reader", "First payload octet of the H263 packet is not the beginning of a new H263 partition, Dropping current packet.");
                return;
            }
            int m29300b = C7104e.m29300b(this.f29e);
            if (i7 < m29300b) {
                AbstractC5346o.m21867h("RtpH263Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
                return;
            }
        }
        if (this.f28d == 0) {
            m40f(c5357z, this.f33i);
            if (!this.f33i && this.f32h) {
                int i8 = this.f30f;
                C4327q c4327q = this.f25a.f25275c;
                if (i8 != c4327q.f15144t || this.f31g != c4327q.f15145u) {
                    this.f26b.mo566e(c4327q.m18193a().m18271v0(this.f30f).m18248Y(this.f31g).m18234K());
                }
                this.f33i = true;
            }
        }
        int m21942a = c5357z.m21942a();
        this.f26b.mo564d(c5357z, m21942a);
        this.f28d += m21942a;
        this.f35k = AbstractC0014m.m54a(this.f34j, j7, this.f27c, 90000);
        if (z6) {
            m39e();
        }
        this.f29e = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        AbstractC5332a.m21802g(this.f27c == -9223372036854775807L);
        this.f27c = j7;
    }

    /* renamed from: f */
    public final void m40f(C5357z c5357z, boolean z6) {
        int m21947f = c5357z.m21947f();
        if (((c5357z.m21928I() >> 10) & 63) != 32) {
            c5357z.m21939T(m21947f);
            this.f32h = false;
            return;
        }
        int m21951j = c5357z.m21951j();
        int i7 = (m21951j >> 1) & 1;
        if (!z6 && i7 == 0) {
            int i8 = (m21951j >> 2) & 7;
            if (i8 == 1) {
                this.f30f = 128;
                this.f31g = 96;
            } else {
                int i9 = i8 - 2;
                this.f30f = 176 << i9;
                this.f31g = 144 << i9;
            }
        }
        c5357z.m21939T(m21947f);
        this.f32h = i7 == 0;
    }
}
