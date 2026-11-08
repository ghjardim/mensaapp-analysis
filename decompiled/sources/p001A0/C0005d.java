package p001A0;

import p078L0.InterfaceC0861T;
import p078L0.InterfaceC0885t;
import p259j0.AbstractC5330M;
import p259j0.AbstractC5332a;
import p259j0.AbstractC5346o;
import p259j0.C5357z;
import p387z0.C7104e;
import p387z0.C7107h;

/* renamed from: A0.d */
/* loaded from: classes.dex */
public final class C0005d implements InterfaceC0012k {

    /* renamed from: h */
    public static final int[] f16h = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: i */
    public static final int[] f17i = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: a */
    public final C7107h f18a;

    /* renamed from: b */
    public final boolean f19b;

    /* renamed from: c */
    public final int f20c;

    /* renamed from: d */
    public InterfaceC0861T f21d;

    /* renamed from: e */
    public long f22e = -9223372036854775807L;

    /* renamed from: g */
    public int f24g = -1;

    /* renamed from: f */
    public long f23f = 0;

    public C0005d(C7107h c7107h) {
        this.f18a = c7107h;
        this.f19b = "audio/amr-wb".equals(AbstractC5332a.m21800e(c7107h.f25275c.f15138n));
        this.f20c = c7107h.f25274b;
    }

    /* renamed from: e */
    public static int m38e(int i7, boolean z6) {
        boolean z7 = (i7 >= 0 && i7 <= 8) || i7 == 15;
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(z6 ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i7);
        AbstractC5332a.m21797b(z7, sb.toString());
        return z6 ? f17i[i7] : f16h[i7];
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: a */
    public void mo29a(long j7, long j8) {
        this.f22e = j7;
        this.f23f = j8;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: b */
    public void mo30b(InterfaceC0885t interfaceC0885t, int i7) {
        InterfaceC0861T mo455b = interfaceC0885t.mo455b(i7, 1);
        this.f21d = mo455b;
        mo455b.mo566e(this.f18a.f25275c);
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: c */
    public void mo31c(C5357z c5357z, long j7, int i7, boolean z6) {
        int m29300b;
        AbstractC5332a.m21804i(this.f21d);
        int i8 = this.f24g;
        if (i8 != -1 && i7 != (m29300b = C7104e.m29300b(i8))) {
            AbstractC5346o.m21867h("RtpAmrReader", AbstractC5330M.m21685H("Received RTP packet with unexpected sequence number. Expected: %d; received: %d.", Integer.valueOf(m29300b), Integer.valueOf(i7)));
        }
        c5357z.m21940U(1);
        int m38e = m38e((c5357z.m21951j() >> 3) & 15, this.f19b);
        int m21942a = c5357z.m21942a();
        AbstractC5332a.m21797b(m21942a == m38e, "compound payload not supported currently");
        this.f21d.mo564d(c5357z, m21942a);
        this.f21d.mo562c(AbstractC0014m.m54a(this.f23f, j7, this.f22e, this.f20c), 1, m21942a, 0, null);
        this.f24g = i7;
    }

    @Override // p001A0.InterfaceC0012k
    /* renamed from: d */
    public void mo32d(long j7, int i7) {
        this.f22e = j7;
    }
}
