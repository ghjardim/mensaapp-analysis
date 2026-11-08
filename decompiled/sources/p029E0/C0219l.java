package p029E0;

import p029E0.InterfaceC0213f;
import p078L0.C0875j;
import p232g0.C4327q;
import p276l0.AbstractC5496j;
import p276l0.C5497k;
import p276l0.C5510x;
import p276l0.InterfaceC5493g;

/* renamed from: E0.l */
/* loaded from: classes.dex */
public final class C0219l extends AbstractC0212e {

    /* renamed from: j */
    public final InterfaceC0213f f919j;

    /* renamed from: k */
    public InterfaceC0213f.b f920k;

    /* renamed from: l */
    public long f921l;

    /* renamed from: m */
    public volatile boolean f922m;

    public C0219l(InterfaceC5493g interfaceC5493g, C5497k c5497k, C4327q c4327q, int i7, Object obj, InterfaceC0213f interfaceC0213f) {
        super(interfaceC5493g, c5497k, 2, c4327q, i7, obj, -9223372036854775807L, -9223372036854775807L);
        this.f919j = interfaceC0213f;
    }

    @Override // p050H0.C0545n.e
    /* renamed from: b */
    public void mo481b() {
        if (this.f921l == 0) {
            this.f919j.mo860c(this.f920k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C5497k m23084e = this.f873b.m23084e(this.f921l);
            C5510x c5510x = this.f880i;
            C0875j c0875j = new C0875j(c5510x, m23084e.f19787g, c5510x.mo714o(m23084e));
            while (!this.f922m && this.f919j.mo859a(c0875j)) {
                try {
                } finally {
                    this.f921l = c0875j.mo3522u() - this.f873b.f19787g;
                }
            }
        } finally {
            AbstractC5496j.m23079a(this.f880i);
        }
    }

    @Override // p050H0.C0545n.e
    /* renamed from: c */
    public void mo482c() {
        this.f922m = true;
    }

    /* renamed from: g */
    public void m919g(InterfaceC0213f.b bVar) {
        this.f920k = bVar;
    }
}
