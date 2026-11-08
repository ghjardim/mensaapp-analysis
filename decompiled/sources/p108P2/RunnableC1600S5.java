package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.S5 */
/* loaded from: classes.dex */
public final class RunnableC1600S5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f4932a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4933b;

    /* renamed from: c */
    public final /* synthetic */ C1891z7 f4934c;

    /* renamed from: d */
    public final /* synthetic */ C1836t6 f4935d;

    public RunnableC1600S5(C1836t6 c1836t6, C1482E7 c1482e7, boolean z6, C1891z7 c1891z7) {
        this.f4932a = c1482e7;
        this.f4933b = z6;
        this.f4934c = c1891z7;
        this.f4935d = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f4935d;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Discarding data. Failed to set user property");
            return;
        }
        C1482E7 c1482e7 = this.f4932a;
        AbstractC3802r.m15129k(c1482e7);
        c1836t6.m6388C(interfaceC1832t2, this.f4933b ? null : this.f4934c, c1482e7);
        c1836t6.m6405T();
    }
}
