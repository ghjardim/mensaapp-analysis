package p108P2;

import android.content.SharedPreferences;

/* renamed from: P2.h5 */
/* loaded from: classes.dex */
public final class RunnableC1727h5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1456C f5147a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f5148b;

    public RunnableC1727h5(C1799p5 c1799p5, C1456C c1456c) {
        this.f5147a = c1456c;
        this.f5148b = c1799p5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1799p5 c1799p5 = this.f5148b;
        C1460C3 c1460c3 = c1799p5.f5129a;
        C1680c3 m5611H = c1460c3.m5611H();
        C1460C3 c1460c32 = m5611H.f5129a;
        m5611H.mo5762h();
        C1456C m6006s = m5611H.m6006s();
        C1456C c1456c = this.f5147a;
        if (!C1771m4.m6106s(c1456c.m5588a(), m6006s.m5588a())) {
            c1460c3.mo5624b().m5939u().m5903b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c1456c.m5588a()));
            return;
        }
        SharedPreferences.Editor edit = m5611H.m6003p().edit();
        edit.putString("dma_consent_settings", c1456c.m5593j());
        edit.apply();
        c1460c3.mo5624b().m5940v().m5903b("Setting DMA consent(FE)", c1456c);
        C1460C3 c1460c33 = c1799p5.f5129a;
        if (c1460c33.m5617O().m6401P()) {
            c1460c33.m5617O().m6393H();
        } else {
            c1460c33.m5617O().m6390E(false);
        }
    }
}
