package p108P2;

import com.google.android.gms.common.internal.AbstractC3802r;

/* renamed from: P2.h6 */
/* loaded from: classes.dex */
public final class RunnableC1728h6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1482E7 f5149a;

    /* renamed from: b */
    public final /* synthetic */ boolean f5150b;

    /* renamed from: c */
    public final /* synthetic */ C1739j f5151c;

    /* renamed from: d */
    public final /* synthetic */ C1836t6 f5152d;

    public RunnableC1728h6(C1836t6 c1836t6, boolean z6, C1482E7 c1482e7, boolean z7, C1739j c1739j, C1739j c1739j2) {
        this.f5149a = c1482e7;
        this.f5150b = z7;
        this.f5151c = c1739j;
        this.f5152d = c1836t6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1832t2 interfaceC1832t2;
        C1836t6 c1836t6 = this.f5152d;
        interfaceC1832t2 = c1836t6.f5523d;
        if (interfaceC1832t2 == null) {
            c1836t6.f5129a.mo5624b().m5936r().m5902a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        C1482E7 c1482e7 = this.f5149a;
        AbstractC3802r.m15129k(c1482e7);
        c1836t6.m6388C(interfaceC1832t2, this.f5150b ? null : this.f5151c, c1482e7);
        c1836t6.m6405T();
    }
}
