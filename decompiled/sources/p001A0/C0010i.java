package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p203c3.AbstractC3572b;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.i */
/* loaded from: classes.dex */
public final class C0010i implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f63a;

    /* renamed from: b */
    public InterfaceC0861T f64b;

    /* renamed from: c */
    public int f65c;

    /* renamed from: d */
    public long f66d = -9223372036854775807L;

    /* renamed from: e */
    public int f67e = -1;

    /* renamed from: f */
    public long f68f;

    /* renamed from: g */
    public int f69g;

    public C0010i(C7107h c7107h) {
        this.f63a = c7107h;
    }

    /* renamed from: e */
    public static int m52e(C5357z c5357z) {
        int m14408a = AbstractC3572b.m14408a(c5357z.m21946e(), new byte[]{0, 0, 1, -74});
        if (m14408a == -1) {
            return 0;
        }
        c5357z.m21939T(m14408a + 4);
        return (c5357z.m21951j() >> 6) == 0 ? 1 : 0;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f66d = j7;
        this.f68f = j8;
        this.f69g = 0;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 2);
        this.f64b = mo455b;
        ((InterfaceC0861T) AbstractC5330M.m21747i(mo455b)).mo566e(this.f63a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        int m29300b;
        AbstractC5332a.m21804i(this.f64b);
        int i8 = this.f67e;
        if (i8 != -1 && i7 != (m29300b = C7104e.m29300b(i8))) {
            AbstractC5346o.m21867h("RtpMpeg4Reader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d. Dropping packet.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
        }
        int m21942a = c5357z.m21942a();
        this.f64b.mo564d(c5357z, m21942a);
        if (this.f69g == 0) {
            this.f65c = m52e(c5357z);
        }
        this.f69g += m21942a;
        if (z6) {
            if (this.f66d == -9223372036854775807L) {
                this.f66d = j7;
            }
            this.f64b.mo562c(AbstractC0014m.m54a(this.f68f, j7, this.f66d, 90000), this.f65c, this.f69g, 0, null);
            this.f69g = 0;
        }
        this.f67e = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
    }
}
