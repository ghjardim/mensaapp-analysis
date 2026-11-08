package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.Q1 */
/* loaded from: classes3.dex */
final class C5115Q1 implements InterfaceC5144W1, InterfaceC5254p2 {

    /* renamed from: a */
    private int f18453a;

    /* renamed from: b */
    final /* synthetic */ int f18454b;

    /* renamed from: c */
    final /* synthetic */ IntBinaryOperator f18455c;

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

    C5115Q1(int i7, IntBinaryOperator intBinaryOperator) {
        this.f18454b = i7;
        this.f18455c = intBinaryOperator;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        accept(((C5115Q1) interfaceC5144W1).f18453a);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18453a = this.f18454b;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        this.f18453a = this.f18455c.applyAsInt(this.f18453a, i7);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.f18453a);
    }
}
