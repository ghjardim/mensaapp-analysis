package p108P2;

import p256j$.util.Objects;

/* renamed from: P2.I4 */
/* loaded from: classes.dex */
public final class C1515I4 extends AbstractC1438A {

    /* renamed from: e */
    public final /* synthetic */ C1799p5 f4754e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1515I4(C1799p5 c1799p5, InterfaceC1726h4 interfaceC1726h4) {
        super(interfaceC1726h4);
        this.f4754e = c1799p5;
    }

    @Override // p108P2.AbstractC1438A
    /* renamed from: c */
    public final void mo5558c() {
        final C1799p5 m5613K = this.f4754e.f5129a.m5613K();
        Objects.requireNonNull(m5613K);
        new Thread(new Runnable() { // from class: P2.H4
            @Override // java.lang.Runnable
            public final void run() {
                C1799p5.this.m6228z();
            }
        }).start();
    }
}
