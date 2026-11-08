package p108P2;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: P2.V4 */
/* loaded from: classes.dex */
public final class RunnableC1623V4 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f4962a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4963b;

    public RunnableC1623V4(C1799p5 c1799p5, long j7) {
        this.f4962a = j7;
        this.f4963b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f4963b;
        c1799p5.mo5762h();
        c1799p5.m6082i();
        C1460C3 c1460c3 = c1799p5.f5129a;
        c1460c3.mo5624b().m5935q().m5902a("Resetting analytics data (FE)");
        C1460C3 c1460c32 = c1799p5.f5129a;
        C1544L6 m5618P = c1460c32.m5618P();
        m5618P.mo5762h();
        m5618P.f4808f.m5886a();
        c1460c32.m5607D().m5573x();
        boolean z6 = !c1799p5.f5129a.m5635o();
        C1680c3 m5611H = c1460c3.m5611H();
        m5611H.f5066g.m5980b(this.f4962a);
        C1460C3 c1460c33 = m5611H.f5129a;
        if (!TextUtils.isEmpty(c1460c33.m5611H().f5083x.m5986a())) {
            m5611H.f5083x.m5987b(null);
        }
        m5611H.f5077r.m5980b(0L);
        m5611H.f5078s.m5980b(0L);
        if (!c1460c33.m5605B().m6141i()) {
            m5611H.m6012y(z6);
        }
        m5611H.f5084y.m5987b(null);
        m5611H.f5085z.m5980b(0L);
        m5611H.f5061A.m5978b(null);
        c1460c32.m5617O().m6387B();
        c1460c32.m5618P().f4807e.m5894a();
        c1799p5.f5307s = z6;
        c1460c32.m5617O().m6414s(new AtomicReference());
    }
}
