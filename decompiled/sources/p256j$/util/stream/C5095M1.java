package p256j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import p256j$.util.Optional;
import p256j$.util.function.Consumer$CC;

/* renamed from: j$.util.stream.M1 */
/* loaded from: classes3.dex */
final class C5095M1 implements InterfaceC5144W1 {

    /* renamed from: a */
    private boolean f18420a;

    /* renamed from: b */
    private Object f18421b;

    /* renamed from: c */
    final /* synthetic */ BinaryOperator f18422c;

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

    C5095M1(BinaryOperator binaryOperator) {
        this.f18422c = binaryOperator;
    }

    @Override // p256j$.util.stream.InterfaceC5144W1
    /* renamed from: g */
    public final void mo21457g(InterfaceC5144W1 interfaceC5144W1) {
        C5095M1 c5095m1 = (C5095M1) interfaceC5144W1;
        if (c5095m1.f18420a) {
            return;
        }
        m21477p(c5095m1.f18421b);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        this.f18420a = true;
        this.f18421b = null;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void m21477p(Object obj) {
        if (this.f18420a) {
            this.f18420a = false;
            this.f18421b = obj;
        } else {
            this.f18421b = this.f18422c.apply(this.f18421b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.f18420a ? Optional.m21278a() : Optional.m21279b(this.f18421b);
    }
}
