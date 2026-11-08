package p001A0;

import java.util.List;
import p078L0.AbstractC0853K;
import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p232g0.C4327q;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.j */
/* loaded from: classes.dex */
public final class C0011j implements InterfaceC0012k {

    /* renamed from: a */
    public final C7107h f70a;

    /* renamed from: b */
    public InterfaceC0861T f71b;

    /* renamed from: d */
    public long f73d;

    /* renamed from: f */
    public boolean f75f;

    /* renamed from: g */
    public boolean f76g;

    /* renamed from: c */
    public long f72c = -1;

    /* renamed from: e */
    public int f74e = -1;

    public C0011j(C7107h c7107h) {
        this.f70a = c7107h;
    }

    /* renamed from: e */
    public static void m53e(C5357z c5357z) {
        int m21947f = c5357z.m21947f();
        AbstractC5332a.m21797b(c5357z.m21948g() > 18, "ID Header has insufficient data");
        AbstractC5332a.m21797b(c5357z.m21923D(8).equals("OpusHead"), "ID Header missing");
        AbstractC5332a.m21797b(c5357z.m21926G() == 1, "version number must always be 1");
        c5357z.m21939T(m21947f);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f72c = j7;
        this.f73d = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 1);
        this.f71b = mo455b;
        mo455b.mo566e(this.f70a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        AbstractC5332a.m21804i(this.f71b);
        if (!this.f75f) {
            m53e(c5357z);
            List m3542a = AbstractC0853K.m3542a(c5357z.m21946e());
            C4327q.b m18193a = this.f70a.f25275c.m18193a();
            m18193a.m18251b0(m3542a);
            this.f71b.mo566e(m18193a.m18234K());
            this.f75f = true;
        } else if (this.f76g) {
            int m29300b = C7104e.m29300b(this.f74e);
            if (i7 != m29300b) {
                AbstractC5346o.m21867h("RtpOpusReader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
            }
            int m21942a = c5357z.m21942a();
            this.f71b.mo564d(c5357z, m21942a);
            this.f71b.mo562c(AbstractC0014m.m54a(this.f73d, j7, this.f72c, 48000), 1, m21942a, 0, null);
        } else {
            AbstractC5332a.m21797b(c5357z.m21948g() >= 8, "Comment Header has insufficient data");
            AbstractC5332a.m21797b(c5357z.m21923D(8).equals("OpusTags"), "Comment Header should follow ID Header");
            this.f76g = true;
        }
        this.f74e = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        this.f72c = j7;
    }
}
