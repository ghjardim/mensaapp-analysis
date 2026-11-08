package p029E0;

import com.google.android.gms.common.api.C3643a;
import p078L0.C0875j;
import p078L0.InterfaceC0861T;
import p232g0.C4327q;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.InterfaceC5493g;

/* renamed from: E0.o */
/* loaded from: classes.dex */
public final class C0222o extends AbstractC0208a {

    /* renamed from: o */
    public final int f925o;

    /* renamed from: p */
    public final C4327q f926p;

    /* renamed from: q */
    public long f927q;

    /* renamed from: r */
    public boolean f928r;

    public C0222o(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, long j7, long j8, long j9, int i8, C4327q c4327q2) {
        super(interfaceC5493g, c5497k, c4327q, i7, obj, j7, j8, -9223372036854775807L, -9223372036854775807L, j9);
        this.f925o = i8;
        this.f926p = c4327q2;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public void mo481b() {
        C0210c m850j = m850j();
        m850j.m858c(0L);
        InterfaceC0861T mo857b = m850j.mo857b(0, this.f925o);
        mo857b.mo566e(this.f926p);
        try {
            long mo714o = this.f880i.mo714o(this.f873b.m23084e(this.f927q));
            if (mo714o != -1) {
                mo714o += this.f927q;
            }
            C0875j c0875j = new C0875j(this.f880i, this.f927q, mo714o);
            for (int i7 = 0; i7 != -1; i7 = mo857b.mo558a(c0875j, C3643a.e.API_PRIORITY_OTHER, true)) {
                this.f927q += i7;
            }
            mo857b.mo562c(this.f878g, 1, (int) this.f927q, 0, null);
            AbstractC5496j.m23079a(this.f880i);
            this.f928r = true;
        } catch (Throwable th) {
            AbstractC5496j.m23079a(this.f880i);
            throw th;
        }
    }

    @Override // p029E0.AbstractC0220m
    /* renamed from: h */
    public boolean mo913h() {
        return this.f928r;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public void mo482c() {
    }
}
