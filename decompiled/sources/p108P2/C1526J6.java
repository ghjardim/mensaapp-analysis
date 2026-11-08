package p108P2;

import android.os.Bundle;

/* renamed from: P2.J6 */
/* loaded from: classes.dex */
public final class C1526J6 {

    /* renamed from: a */
    public long f4779a;

    /* renamed from: b */
    public long f4780b;

    /* renamed from: c */
    public final AbstractC1438A f4781c;

    /* renamed from: d */
    public final /* synthetic */ C1544L6 f4782d;

    public C1526J6(C1544L6 c1544l6) {
        this.f4782d = c1544l6;
        this.f4781c = new C1517I6(this, c1544l6.f5129a);
        long mo1111b = c1544l6.f5129a.mo5626d().mo1111b();
        this.f4779a = mo1111b;
        this.f4780b = mo1111b;
    }

    /* renamed from: a */
    public final void m5886a() {
        this.f4781c.m5557b();
        C1460C3 c1460c3 = this.f4782d.f5129a;
        long mo1111b = c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5376c1) ? c1460c3.mo5626d().mo1111b() : 0L;
        this.f4779a = mo1111b;
        this.f4780b = mo1111b;
    }

    /* renamed from: b */
    public final void m5887b(long j7) {
        this.f4781c.m5557b();
    }

    /* renamed from: c */
    public final void m5888c(long j7) {
        this.f4782d.mo5762h();
        this.f4781c.m5557b();
        this.f4779a = j7;
        this.f4780b = j7;
    }

    /* renamed from: d */
    public final boolean m5889d(boolean z6, boolean z7, long j7) {
        C1544L6 c1544l6 = this.f4782d;
        c1544l6.mo5762h();
        c1544l6.m6082i();
        if (c1544l6.f5129a.m5635o()) {
            C1460C3 c1460c3 = c1544l6.f5129a;
            c1460c3.m5611H().f5077r.m5980b(c1460c3.mo5626d().mo1110a());
        }
        long j8 = j7 - this.f4779a;
        if (!z6 && j8 < 1000) {
            c1544l6.f5129a.mo5624b().m5940v().m5903b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j8));
            return false;
        }
        if (!z7) {
            j8 = j7 - this.f4780b;
            this.f4780b = j7;
        }
        C1460C3 c1460c32 = c1544l6.f5129a;
        c1460c32.mo5624b().m5940v().m5903b("Recording user engagement, ms", Long.valueOf(j8));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        boolean z8 = !c1460c32.m5605B().m6140R();
        C1460C3 c1460c33 = c1544l6.f5129a;
        C1473D7.m5669B(c1460c33.m5616N().m5883t(z8), bundle, true);
        if (!z7) {
            c1460c33.m5613K().m6185F("auto", "_e", bundle);
        }
        this.f4779a = j7;
        AbstractC1438A abstractC1438A = this.f4781c;
        abstractC1438A.m5557b();
        abstractC1438A.m5559d(((Long) AbstractC1805q2.f5417q0.m6159a(null)).longValue());
        return true;
    }
}
