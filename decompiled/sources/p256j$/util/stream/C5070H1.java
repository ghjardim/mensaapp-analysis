package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.C4938C;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.H1 */
/* loaded from: classes3.dex */
final class C5070H1 implements InterfaceC5144W1, InterfaceC5249o2 {

    /* renamed from: a */
    private boolean f18387a;

    /* renamed from: b */
    private double f18388b;

    /* renamed from: c */
    final /* synthetic */ DoubleBinaryOperator f18389c;

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

    C5070H1(DoubleBinaryOperator doubleBinaryOperator) {
        this.f18389c = doubleBinaryOperator;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        C5070H1 c5070h1 = (C5070H1) interfaceC5144W1;
        if (c5070h1.f18387a) {
            return;
        }
        accept(c5070h1.f18388b);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18387a = true;
        this.f18388b = 0.0d;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        if (this.f18387a) {
            this.f18387a = false;
            this.f18388b = d7;
        } else {
            this.f18388b = this.f18389c.applyAsDouble(this.f18388b, d7);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18387a ? C4938C.m21255a() : C4938C.m21256d(this.f18388b);
    }
}
