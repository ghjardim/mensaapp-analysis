package p029E0;

import p029E0.InterfaceC0213f;
import p078L0.C0875j;
import p078L0.InterfaceC0861T;
import p232g0.AbstractC4336z;
import p232g0.C4327q;
import p259j0.C5357z;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;

/* renamed from: E0.j */
/* loaded from: classes.dex */
public class C0217j extends AbstractC0208a {

    /* renamed from: o */
    public final int f911o;

    /* renamed from: p */
    public final long f912p;

    /* renamed from: q */
    public final InterfaceC0213f f913q;

    /* renamed from: r */
    public long f914r;

    /* renamed from: s */
    public volatile boolean f915s;

    /* renamed from: t */
    public boolean f916t;

    public C0217j(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, long j7, long j8, long j9, long j10, long j11, int i8, long j12, InterfaceC0213f interfaceC0213f) {
        super(interfaceC5493g, c5497k, c4327q, i7, obj, j7, j8, j9, j10, j11);
        this.f911o = i8;
        this.f912p = j12;
        this.f913q = interfaceC0213f;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public final void mo481b() {
        C0210c m850j = m850j();
        if (this.f914r == 0) {
            m850j.m858c(this.f912p);
            InterfaceC0213f interfaceC0213f = this.f913q;
            InterfaceC0213f.b m914l = m914l(m850j);
            long j7 = this.f843k;
            long j8 = j7 == -9223372036854775807L ? -9223372036854775807L : j7 - this.f912p;
            long j9 = this.f844l;
            interfaceC0213f.mo860c(m914l, j8, j9 == -9223372036854775807L ? -9223372036854775807L : j9 - this.f912p);
        }
        try {
            C5497k m23084e = this.f873b.m23084e(this.f914r);
            C5510x c5510x = this.f880i;
            C0875j c0875j = new C0875j(c5510x, m23084e.f19787g, c5510x.mo714o(m23084e));
            do {
                try {
                    if (this.f915s) {
                        break;
                    }
                } finally {
                    this.f914r = c0875j.mo3522u() - this.f873b.f19787g;
                }
            } while (this.f913q.mo859a(c0875j));
            m915m(m850j);
            this.f914r = c0875j.mo3522u() - this.f873b.f19787g;
            AbstractC5496j.m23079a(this.f880i);
            this.f916t = !this.f915s;
        } catch (Throwable th) {
            AbstractC5496j.m23079a(this.f880i);
            throw th;
        }
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public final void mo482c() {
        this.f915s = true;
    }

    @Override // p029E0.AbstractC0220m
    /* renamed from: g */
    public long mo912g() {
        return this.f923j + this.f911o;
    }

    @Override // p029E0.AbstractC0220m
    /* renamed from: h */
    public boolean mo913h() {
        return this.f916t;
    }

    /* renamed from: m */
    public final void m915m(C0210c c0210c) {
        if (AbstractC4336z.m18423p(this.f875d.f15137m)) {
            C4327q c4327q = this.f875d;
            int i7 = c4327q.f15121I;
            if ((i7 <= 1 && c4327q.f15122J <= 1) || i7 == -1 || c4327q.f15122J == -1) {
                return;
            }
            InterfaceC0861T mo857b = c0210c.mo857b(0, 4);
            C4327q c4327q2 = this.f875d;
            int i8 = c4327q2.f15122J * c4327q2.f15121I;
            long j7 = (this.f879h - this.f878g) / i8;
            for (int i9 = 1; i9 < i8; i9++) {
                mo857b.mo564d(new C5357z(), 0);
                mo857b.mo562c(i9 * j7, 0, 0, 0, null);
            }
        }
    }

    /* renamed from: l */
    public InterfaceC0213f.b m914l(C0210c c0210c) {
        return c0210c;
    }
}
