package p253i5;

import p171Y2.AbstractC2932o;
import p237g5.AbstractC4427b;
import p237g5.AbstractC4445k;
import p237g5.C4424Z;
import p237g5.C4426a0;
import p237g5.C4429c;
import p237g5.C4448l0;
import p237g5.C4459r;

/* renamed from: i5.o0 */
/* loaded from: classes2.dex */
public final class C4623o0 extends AbstractC4427b.a {

    /* renamed from: a */
    public final InterfaceC4632t f17148a;

    /* renamed from: b */
    public final C4426a0 f17149b;

    /* renamed from: c */
    public final C4424Z f17150c;

    /* renamed from: d */
    public final C4429c f17151d;

    /* renamed from: f */
    public final a f17153f;

    /* renamed from: g */
    public final AbstractC4445k[] f17154g;

    /* renamed from: i */
    public InterfaceC4628r f17156i;

    /* renamed from: j */
    public boolean f17157j;

    /* renamed from: k */
    public C4549C f17158k;

    /* renamed from: h */
    public final Object f17155h = new Object();

    /* renamed from: e */
    public final C4459r f17152e = C4459r.m19004e();

    /* renamed from: i5.o0$a */
    public interface a {
        /* renamed from: a */
        void mo20018a();
    }

    public C4623o0(InterfaceC4632t interfaceC4632t, C4426a0 c4426a0, C4424Z c4424z, C4429c c4429c, a aVar, AbstractC4445k[] abstractC4445kArr) {
        this.f17148a = interfaceC4632t;
        this.f17149b = c4426a0;
        this.f17150c = c4424z;
        this.f17151d = c4429c;
        this.f17153f = aVar;
        this.f17154g = abstractC4445kArr;
    }

    @Override // p237g5.AbstractC4427b.a
    /* renamed from: a */
    public void mo18845a(C4424Z c4424z) {
        AbstractC2932o.m10579v(!this.f17157j, "apply() or fail() already called");
        AbstractC2932o.m10573p(c4424z, "headers");
        this.f17150c.m18785m(c4424z);
        C4459r m19008b = this.f17152e.m19008b();
        try {
            InterfaceC4628r mo19351g = this.f17148a.mo19351g(this.f17149b, this.f17150c, this.f17151d, this.f17154g);
            this.f17152e.m19010f(m19008b);
            m20057c(mo19351g);
        } catch (Throwable th) {
            this.f17152e.m19010f(m19008b);
            throw th;
        }
    }

    @Override // p237g5.AbstractC4427b.a
    /* renamed from: b */
    public void mo18846b(C4448l0 c4448l0) {
        AbstractC2932o.m10562e(!c4448l0.m18961o(), "Cannot fail with OK status");
        AbstractC2932o.m10579v(!this.f17157j, "apply() or fail() already called");
        m20057c(new C4557G(AbstractC4580S.m19609o(c4448l0), this.f17154g));
    }

    /* renamed from: c */
    public final void m20057c(InterfaceC4628r interfaceC4628r) {
        boolean z6;
        AbstractC2932o.m10579v(!this.f17157j, "already finalized");
        this.f17157j = true;
        synchronized (this.f17155h) {
            try {
                if (this.f17156i == null) {
                    this.f17156i = interfaceC4628r;
                    z6 = true;
                } else {
                    z6 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z6) {
            this.f17153f.mo20018a();
            return;
        }
        AbstractC2932o.m10579v(this.f17158k != null, "delayedStream is null");
        Runnable m19384x = this.f17158k.m19384x(interfaceC4628r);
        if (m19384x != null) {
            m19384x.run();
        }
        this.f17153f.mo20018a();
    }

    /* renamed from: d */
    public InterfaceC4628r m20058d() {
        synchronized (this.f17155h) {
            try {
                InterfaceC4628r interfaceC4628r = this.f17156i;
                if (interfaceC4628r != null) {
                    return interfaceC4628r;
                }
                C4549C c4549c = new C4549C();
                this.f17158k = c4549c;
                this.f17156i = c4549c;
                return c4549c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
