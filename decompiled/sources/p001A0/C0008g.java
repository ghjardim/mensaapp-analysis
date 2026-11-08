package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p387z0.C7107h;

/* renamed from: A0.g */
/* loaded from: classes.dex */
public final class C0008g implements InterfaceC0012k {

    /* renamed from: c */
    public final C7107h f48c;

    /* renamed from: d */
    public InterfaceC0861T f49d;

    /* renamed from: e */
    public int f50e;

    /* renamed from: h */
    public int f53h;

    /* renamed from: i */
    public long f54i;

    /* renamed from: a */
    public final C5357z f46a = new C5357z();

    /* renamed from: b */
    public final C5357z f47b = new C5357z(AbstractC5400d.f19246a);

    /* renamed from: f */
    public long f51f = -9223372036854775807L;

    /* renamed from: g */
    public int f52g = -1;

    public C0008g(C7107h c7107h) {
        this.f48c = c7107h;
    }

    /* renamed from: e */
    private static int m46e(int i7) {
        return (i7 == 19 || i7 == 20) ? 1 : 0;
    }

    /* renamed from: f */
    private void m47f(C5357z c5357z, int i7) {
        if (c5357z.m21946e().length < 3) {
            throw C4295A.m17945c("Malformed FU header.", null);
        }
        int i8 = c5357z.m21946e()[1] & 7;
        byte b7 = c5357z.m21946e()[2];
        int i9 = b7 & 63;
        boolean z6 = (b7 & 128) > 0;
        boolean z7 = (b7 & 64) > 0;
        if (z6) {
            this.f53h += m49h();
            c5357z.m21946e()[1] = (byte) ((i9 << 1) & 127);
            c5357z.m21946e()[2] = (byte) i8;
            this.f46a.m21936Q(c5357z.m21946e());
            this.f46a.m21939T(1);
        } else {
            int i10 = (this.f52g + 1) % 65535;
            if (i7 != i10) {
                AbstractC5346o.m21867h("RtpH265Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(i10), Integer.valueOf(i7)));
                return;
            } else {
                this.f46a.m21936Q(c5357z.m21946e());
                this.f46a.m21939T(3);
            }
        }
        int m21942a = this.f46a.m21942a();
        this.f49d.mo564d(this.f46a, m21942a);
        this.f53h += m21942a;
        if (z7) {
            this.f50e = m46e(i9);
        }
    }

    /* renamed from: g */
    private void m48g(C5357z c5357z) {
        int m21942a = c5357z.m21942a();
        this.f53h += m49h();
        this.f49d.mo564d(c5357z, m21942a);
        this.f53h += m21942a;
        this.f50e = m46e((c5357z.m21946e()[0] >> 1) & 63);
    }

    /* renamed from: h */
    private int m49h() {
        this.f47b.m21939T(0);
        int m21942a = this.f47b.m21942a();
        ((InterfaceC0861T) AbstractC5332a.m21800e(this.f49d)).mo564d(this.f47b, m21942a);
        return m21942a;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f51f = j7;
        this.f53h = 0;
        this.f54i = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f49d = mo455b;
        mo455b.mo566e(this.f48c.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        if (c5357z.m21946e().length == 0) {
            throw C4295A.m17945c("Empty RTP data packet.", null);
        }
        int i8 = (c5357z.m21946e()[0] >> 1) & 63;
        AbstractC5332a.m21804i(this.f49d);
        if (i8 >= 0 && i8 < 48) {
            m48g(c5357z);
        } else {
            if (i8 == 48) {
                throw new UnsupportedOperationException("need to implement processAggregationPacket");
            }
            if (i8 != 49) {
                throw C4295A.m17945c(String.format("RTP H265 payload type [%d] not supported.", Integer.valueOf(i8)), null);
            }
            m47f(c5357z, i7);
        }
        if (z6) {
            if (this.f51f == -9223372036854775807L) {
                this.f51f = j7;
            }
            this.f49d.mo562c(AbstractC0014m.m54a(this.f54i, j7, this.f51f, 90000), this.f50e, this.f53h, 0, null);
            this.f53h = 0;
        }
        this.f52g = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
    }
}
