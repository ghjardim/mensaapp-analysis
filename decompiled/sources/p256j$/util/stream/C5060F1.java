package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.F1 */
/* loaded from: classes3.dex */
final class C5060F1 implements InterfaceC5144W1, InterfaceC5249o2 {

    /* renamed from: a */
    private double f18370a;

    /* renamed from: b */
    final /* synthetic */ double f18371b;

    /* renamed from: c */
    final /* synthetic */ DoubleBinaryOperator f18372c;

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

    C5060F1(double d7, DoubleBinaryOperator doubleBinaryOperator) {
        this.f18371b = d7;
        this.f18372c = doubleBinaryOperator;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        accept(((C5060F1) interfaceC5144W1).f18370a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18370a = this.f18371b;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        this.f18370a = this.f18372c.applyAsDouble(this.f18370a, d7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Double.valueOf(this.f18370a);
    }
}
