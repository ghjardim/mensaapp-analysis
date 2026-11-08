package p256j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.O1 */
/* loaded from: classes3.dex */
final class C5105O1 extends AbstractC5149X1 implements InterfaceC5144W1 {

    /* renamed from: b */
    final /* synthetic */ Supplier f18436b;

    /* renamed from: c */
    final /* synthetic */ BiConsumer f18437c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f18438d;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
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

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18515a = this.f18438d.apply(this.f18515a, ((C5105O1) interfaceC5144W1).f18515a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18515a = this.f18436b.get();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        this.f18437c.accept(this.f18515a, obj);
    }

    C5105O1(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator) {
        this.f18436b = supplier;
        this.f18437c = biConsumer;
        this.f18438d = binaryOperator;
    }
}
