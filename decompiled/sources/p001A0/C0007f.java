package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4295A;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p268k0.AbstractC5400d;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.f */
/* loaded from: classes.dex */
public final class C0007f implements InterfaceC0012k {

    /* renamed from: c */
    public final C7107h f39c;

    /* renamed from: d */
    public InterfaceC0861T f40d;

    /* renamed from: e */
    public int f41e;

    /* renamed from: h */
    public int f44h;

    /* renamed from: i */
    public long f45i;

    /* renamed from: b */
    public final C5357z f38b = new C5357z(AbstractC5400d.f19246a);

    /* renamed from: a */
    public final C5357z f37a = new C5357z();

    /* renamed from: f */
    public long f42f = -9223372036854775807L;

    /* renamed from: g */
    public int f43g = -1;

    public C0007f(C7107h c7107h) {
        this.f39c = c7107h;
    }

    /* renamed from: e */
    public static int m41e(int i7) {
        return i7 == 5 ? 1 : 0;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f42f = j7;
        this.f44h = 0;
        this.f45i = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f40d = mo455b;
        ((InterfaceC0861T) AbstractC5330M.m21747i(mo455b)).mo566e(this.f39c.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        try {
            int i8 = c5357z.m21946e()[0] & 31;
            AbstractC5332a.m21804i(this.f40d);
            if (i8 > 0 && i8 < 24) {
                m43g(c5357z);
            } else if (i8 == 24) {
                m44h(c5357z);
            } else {
                if (i8 != 28) {
                    throw C4295A.m17945c(String.format("RTP H264 packetization mode [%d] not supported.", Integer.valueOf(i8)), null);
                }
                m42f(c5357z, i7);
            }
            if (z6) {
                if (this.f42f == -9223372036854775807L) {
                    this.f42f = j7;
                }
                this.f40d.mo562c(AbstractC0014m.m54a(this.f45i, j7, this.f42f, 90000), this.f41e, this.f44h, 0, null);
                this.f44h = 0;
            }
            this.f43g = i7;
        } catch (IndexOutOfBoundsException e7) {
            throw C4295A.m17945c(null, e7);
        }
    }

    /* renamed from: f */
    public final void m42f(C5357z c5357z, int i7) {
        byte b7 = c5357z.m21946e()[0];
        byte b8 = c5357z.m21946e()[1];
        int i8 = (b7 & 224) | (b8 & 31);
        boolean z6 = (b8 & 128) > 0;
        boolean z7 = (b8 & 64) > 0;
        if (z6) {
            this.f44h += m45i();
            c5357z.m21946e()[1] = (byte) i8;
            this.f37a.m21936Q(c5357z.m21946e());
            this.f37a.m21939T(1);
        } else {
            int m29300b = C7104e.m29300b(this.f43g);
            if (i7 != m29300b) {
                AbstractC5346o.m21867h("RtpH264Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
                return;
            } else {
                this.f37a.m21936Q(c5357z.m21946e());
                this.f37a.m21939T(2);
            }
        }
        int m21942a = this.f37a.m21942a();
        this.f40d.mo564d(this.f37a, m21942a);
        this.f44h += m21942a;
        if (z7) {
            this.f41e = m41e(i8 & 31);
        }
    }

    /* renamed from: g */
    public final void m43g(C5357z c5357z) {
        int m21942a = c5357z.m21942a();
        this.f44h += m45i();
        this.f40d.mo564d(c5357z, m21942a);
        this.f44h += m21942a;
        this.f41e = m41e(c5357z.m21946e()[0] & 31);
    }

    /* renamed from: h */
    public final void m44h(C5357z c5357z) {
        c5357z.m21926G();
        while (c5357z.m21942a() > 4) {
            int m21932M = c5357z.m21932M();
            this.f44h += m45i();
            this.f40d.mo564d(c5357z, m21932M);
            this.f44h += m21932M;
        }
        this.f41e = 0;
    }

    /* renamed from: i */
    public final int m45i() {
        this.f38b.m21939T(0);
        int m21942a = this.f38b.m21942a();
        ((InterfaceC0861T) AbstractC5332a.m21800e(this.f40d)).mo564d(this.f38b, m21942a);
        return m21942a;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
    }
}
