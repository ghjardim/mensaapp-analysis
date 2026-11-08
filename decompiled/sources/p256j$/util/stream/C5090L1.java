package p256j$.util.stream;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.L1 */
/* loaded from: classes3.dex */
final class C5090L1 extends AbstractC5149X1 implements InterfaceC5144W1 {

    /* renamed from: b */
    final /* synthetic */ Object f18416b;

    /* renamed from: c */
    final /* synthetic */ BiFunction f18417c;

    /* renamed from: d */
    final /* synthetic */ BinaryOperator f18418d;

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
        this.f18515a = this.f18418d.apply(this.f18515a, ((C5090L1) interfaceC5144W1).f18515a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18515a = this.f18416b;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        this.f18515a = this.f18417c.apply(this.f18515a, obj);
    }

    C5090L1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.f18416b = obj;
        this.f18417c = biFunction;
        this.f18418d = binaryOperator;
    }
}
