package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.J1 */
/* loaded from: classes3.dex */
final class C5080J1 extends AbstractC5149X1 implements InterfaceC5144W1, InterfaceC5249o2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f18405b;

    /* renamed from: c */
    final /* synthetic */ ObjDoubleConsumer f18406c;

    /* renamed from: d */
    final /* synthetic */ C5256q f18407d;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18515a = this.f18407d.apply(this.f18515a, ((C5080J1) interfaceC5144W1).f18515a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18515a = this.f18405b.get();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        this.f18406c.accept(this.f18515a, d7);
    }

    C5080J1(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C5256q c5256q) {
        this.f18405b = supplier;
        this.f18406c = objDoubleConsumer;
        this.f18407d = c5256q;
    }
}
