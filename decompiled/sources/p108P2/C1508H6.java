package p108P2;

import android.os.Handler;

/* renamed from: P2.H6 */
/* loaded from: classes.dex */
public final class C1508H6 {

    /* renamed from: a */
    public RunnableC1499G6 f4701a;

    /* renamed from: b */
    public final /* synthetic */ C1544L6 f4702b;

    public C1508H6(C1544L6 c1544l6) {
        this.f4702b = c1544l6;
    }

    /* renamed from: a */
    public final void m5770a(long j7) {
        Handler handler;
        C1544L6 c1544l6 = this.f4702b;
        this.f4701a = new RunnableC1499G6(this, c1544l6.f5129a.mo5626d().mo1110a(), j7);
        handler = c1544l6.f4805c;
        handler.postDelayed(this.f4701a, 2000L);
    }

    /* renamed from: b */
    public final void m5771b() {
        Handler handler;
        C1544L6 c1544l6 = this.f4702b;
        c1544l6.mo5762h();
        RunnableC1499G6 runnableC1499G6 = this.f4701a;
        if (runnableC1499G6 != null) {
            handler = c1544l6.f4805c;
            handler.removeCallbacks(runnableC1499G6);
        }
        C1460C3 c1460c3 = c1544l6.f5129a;
        c1460c3.m5611H().f5080u.m5974a(false);
        c1544l6.m5911s(false);
        if (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5370a1)) {
            C1460C3 c1460c32 = c1544l6.f5129a;
            if (c1460c32.m5613K().m6209d0()) {
                c1460c3.mo5624b().m5940v().m5902a("Retrying trigger URI registration in foreground");
                c1460c32.m5613K().m6188I();
            }
        }
    }
}
