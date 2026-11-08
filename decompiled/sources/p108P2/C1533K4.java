package p108P2;

import android.os.Bundle;
import android.util.SparseArray;
import p211d3.InterfaceC4112b;

/* renamed from: P2.K4 */
/* loaded from: classes.dex */
public final class C1533K4 implements InterfaceC4112b {

    /* renamed from: a */
    public final /* synthetic */ C1593R6 f4792a;

    /* renamed from: b */
    public final /* synthetic */ C1799p5 f4793b;

    public C1533K4(C1799p5 c1799p5, C1593R6 c1593r6) {
        this.f4792a = c1593r6;
        this.f4793b = c1799p5;
    }

    @Override // p211d3.InterfaceC4112b
    /* renamed from: a */
    public final void mo5892a(Throwable th) {
        int i7;
        int i8;
        int i9;
        int i10;
        C1799p5 c1799p5 = this.f4793b;
        c1799p5.mo5762h();
        c1799p5.f5297i = false;
        C1460C3 c1460c3 = c1799p5.f5129a;
        int m6168e0 = (c1460c3.m5605B().m6138P(null, AbstractC1805q2.f5370a1) ? C1799p5.m6168e0(c1799p5, th) : 2) - 1;
        if (m6168e0 == 0) {
            c1460c3.mo5624b().m5941w().m5904c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C1558N2.m5932z(c1799p5.f5129a.m5607D().m5569t()), C1558N2.m5932z(th.toString()));
            c1799p5.f5298j = 1;
            c1799p5.m6224v0().add(this.f4792a);
            return;
        }
        if (m6168e0 != 1) {
            c1460c3.mo5624b().m5936r().m5904c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C1558N2.m5932z(c1799p5.f5129a.m5607D().m5569t()), th);
            m5893b();
            c1799p5.f5298j = 1;
            c1799p5.m6188I();
            return;
        }
        c1799p5.m6224v0().add(this.f4792a);
        i7 = c1799p5.f5298j;
        if (i7 > ((Integer) AbstractC1805q2.f5432w0.m6159a(null)).intValue()) {
            c1799p5.f5298j = 1;
            c1460c3.mo5624b().m5941w().m5904c("registerTriggerAsync failed. May try later. App ID, throwable", C1558N2.m5932z(c1799p5.f5129a.m5607D().m5569t()), C1558N2.m5932z(th.toString()));
            return;
        }
        C1540L2 m5941w = c1460c3.mo5624b().m5941w();
        Object m5932z = C1558N2.m5932z(c1799p5.f5129a.m5607D().m5569t());
        i8 = c1799p5.f5298j;
        m5941w.m5905d("registerTriggerAsync failed. App ID, delay in seconds, throwable", m5932z, C1558N2.m5932z(String.valueOf(i8)), C1558N2.m5932z(th.toString()));
        i9 = c1799p5.f5298j;
        C1799p5.m6177t(c1799p5, i9);
        i10 = c1799p5.f5298j;
        c1799p5.f5298j = i10 + i10;
    }

    /* renamed from: b */
    public final void m5893b() {
        C1460C3 c1460c3 = this.f4793b.f5129a;
        SparseArray m6005r = c1460c3.m5611H().m6005r();
        C1593R6 c1593r6 = this.f4792a;
        m6005r.put(c1593r6.f4922c, Long.valueOf(c1593r6.f4921b));
        C1680c3 m5611H = c1460c3.m5611H();
        int[] iArr = new int[m6005r.size()];
        long[] jArr = new long[m6005r.size()];
        for (int i7 = 0; i7 < m6005r.size(); i7++) {
            iArr[i7] = m6005r.keyAt(i7);
            jArr[i7] = ((Long) m6005r.valueAt(i7)).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        m5611H.f5075p.m5978b(bundle);
    }

    @Override // p211d3.InterfaceC4112b
    public final void onSuccess(Object obj) {
        C1799p5 c1799p5 = this.f4793b;
        c1799p5.mo5762h();
        m5893b();
        c1799p5.f5297i = false;
        c1799p5.f5298j = 1;
        c1799p5.f5129a.mo5624b().m5935q().m5903b("Successfully registered trigger URI", this.f4792a.f4920a);
        c1799p5.m6188I();
    }
}
