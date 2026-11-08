package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.T1 */
/* loaded from: classes3.dex */
final class C5129T1 extends AbstractC5149X1 implements InterfaceC5144W1, InterfaceC5254p2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f18495b;

    /* renamed from: c */
    final /* synthetic */ ObjIntConsumer f18496c;

    /* renamed from: d */
    final /* synthetic */ C5256q f18497d;

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
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
        mo21487m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final /* synthetic */ void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        AbstractC5034A0.m21402g(this, num);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        this.f18515a = this.f18497d.apply(this.f18515a, ((C5129T1) interfaceC5144W1).f18515a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18515a = this.f18495b.get();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        this.f18496c.accept(this.f18515a, i7);
    }

    C5129T1(Supplier supplier, ObjIntConsumer objIntConsumer, C5256q c5256q) {
        this.f18495b = supplier;
        this.f18496c = objIntConsumer;
        this.f18497d = c5256q;
    }
}
