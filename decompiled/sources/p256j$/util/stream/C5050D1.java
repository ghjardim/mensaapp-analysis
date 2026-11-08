package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.D1 */
/* loaded from: classes3.dex */
final class C5050D1 extends AbstractC5149X1 implements InterfaceC5144W1, InterfaceC5259q2 {

    /* renamed from: b */
    final /* synthetic */ Supplier f18357b;

    /* renamed from: c */
    final /* synthetic */ ObjLongConsumer f18358c;

    /* renamed from: d */
    final /* synthetic */ C5256q f18359d;

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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
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
        this.f18515a = this.f18359d.apply(this.f18515a, ((C5050D1) interfaceC5144W1).f18515a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18515a = this.f18357b.get();
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        this.f18358c.accept(this.f18515a, j7);
    }

    C5050D1(Supplier supplier, ObjLongConsumer objLongConsumer, C5256q c5256q) {
        this.f18357b = supplier;
        this.f18358c = objLongConsumer;
        this.f18359d = c5256q;
    }
}
