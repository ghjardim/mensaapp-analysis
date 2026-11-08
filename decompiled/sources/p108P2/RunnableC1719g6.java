package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.g6 */
/* loaded from: classes.dex */
public final class RunnableC1719g6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5137a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5138b;

    /* renamed from: c */
    public final /* synthetic */ C1519J f5139c;

    /* renamed from: d */
    public final /* synthetic */ C1836t6 f5140d;

    public RunnableC1719g6(C1836t6 c1836t6, boolean z6, C1482E7 c1482e7, boolean z7, C1519J c1519j, String str) {
        this.f5137a = c1482e7;
        this.f5138b = z7;
        this.f5139c = c1519j;
        this.f5140d = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5140d;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Discarding data. Failed to send event to service");
            return;
        }
        C1482E7 c1482e7 = this.f5137a;
        AbstractC3802r.m15129k(c1482e7);
        c1836t6.m6388C(interfaceC1832t2, this.f5138b ? null : this.f5139c, c1482e7);
        c1836t6.m6405T();
    }
}
