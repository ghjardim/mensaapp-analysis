package p108P2;

/* renamed from: P2.M4 */
/* loaded from: classes.dex */
public final class RunnableC1551M4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f4824a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4825b;

    public RunnableC1551M4(C1799p5 c1799p5, boolean z6) {
        this.f4824a = z6;
        this.f4825b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f4825b;
        C1460C3 c1460c3 = c1799p5.f5129a;
        boolean m5635o = c1460c3.m5635o();
        boolean m5634n = c1460c3.m5634n();
        boolean z6 = this.f4824a;
        c1460c3.m5631k(z6);
        if (m5634n == z6) {
            c1460c3.mo5624b().m5940v().m5903b("Default data collection state already set to", Boolean.valueOf(z6));
        }
        if (c1460c3.m5635o() == m5635o || c1460c3.m5635o() != c1460c3.m5634n()) {
            c1460c3.mo5624b().m5942x().m5904c("Default data collection is different than actual status", Boolean.valueOf(z6), Boolean.valueOf(m5635o));
        }
        c1799p5.m6169h0();
    }
}
