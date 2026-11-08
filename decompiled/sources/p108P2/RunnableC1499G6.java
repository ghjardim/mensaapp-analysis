package p108P2;

/* renamed from: P2.G6 */
/* loaded from: classes.dex */
public final class RunnableC1499G6 implements Runnable {

    /* renamed from: a */
    public final long f4688a;

    /* renamed from: b */
    public final long f4689b;

    /* renamed from: c */
    public final /* synthetic */ C1508H6 f4690c;

    public RunnableC1499G6(C1508H6 c1508h6, long j7, long j8) {
        this.f4690c = c1508h6;
        this.f4688a = j7;
        this.f4689b = j8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4690c.f4702b.f5129a.mo5628f().m6446A(new Runnable() { // from class: P2.F6
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1499G6 runnableC1499G6 = RunnableC1499G6.this;
                C1544L6 c1544l6 = runnableC1499G6.f4690c.f4702b;
                long j7 = runnableC1499G6.f4688a;
                long j8 = runnableC1499G6.f4689b;
                c1544l6.mo5762h();
                C1460C3 c1460c3 = c1544l6.f5129a;
                c1460c3.mo5624b().m5935q().m5902a("Application going to the background");
                c1460c3.m5611H().f5080u.m5974a(true);
                c1544l6.m5911s(true);
                if (!c1460c3.m5605B().m6140R()) {
                    C1526J6 c1526j6 = c1544l6.f4808f;
                    c1526j6.m5889d(false, false, j8);
                    c1526j6.m5887b(j8);
                }
                c1460c3.mo5624b().m5939u().m5903b("Application backgrounded at: timestamp_millis", Long.valueOf(j7));
                C1460C3 c1460c32 = c1544l6.f5129a;
                C1799p5 m5613K = c1460c32.m5613K();
                m5613K.mo5762h();
                C1460C3 c1460c33 = m5613K.f5129a;
                m5613K.m6082i();
                C1836t6 m5617O = c1460c33.m5617O();
                m5617O.mo5762h();
                m5617O.m6082i();
                if (!m5617O.m6402Q() || m5617O.f5129a.m5619Q().m5737y0() >= 242600) {
                    c1460c33.m5617O().m6409l0();
                }
                if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5355T0)) {
                    long m6125C = c1460c3.m5619Q().m5712c0(c1460c3.mo5625c().getPackageName(), c1460c3.m5605B().m6133K()) ? 1000L : c1460c3.m5605B().m6125C(c1460c3.mo5625c().getPackageName(), AbstractC1805q2.f5324E);
                    c1460c3.mo5624b().m5940v().m5903b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(m6125C));
                    c1460c32.m5615M().m6555q(m6125C);
                }
            }
        });
    }
}
