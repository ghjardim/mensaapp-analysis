package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;

/* renamed from: j$.util.stream.Y1 */
/* loaded from: classes3.dex */
final class C5154Y1 extends AbstractC5177c2 implements InterfaceC5249o2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    @Override // p256j$.util.stream.AbstractC5149X1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.f18552b);
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18552b += ((AbstractC5177c2) interfaceC5144W1).f18552b;
    }

    @Override // p256j$.util.stream.AbstractC5177c2, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        this.f18552b++;
    }
}
