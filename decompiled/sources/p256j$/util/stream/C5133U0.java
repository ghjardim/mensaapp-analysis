package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.U0 */
/* loaded from: classes3.dex */
final class C5133U0 extends AbstractC5148X0 implements InterfaceC5064G0 {
    @Override // p256j$.util.stream.InterfaceC5094M0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5034A0.m21412q(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21415t(this, j7, j8);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final /* synthetic */ void mo21484i(Object[] objArr, int i7) {
        AbstractC5034A0.m21409n(this, (Double[]) objArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: c */
    public final Object mo21479c(int i7) {
        return new double[i7];
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return new C5230l1(this);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final InterfaceC4999f0 spliterator() {
        return new C5230l1(this);
    }
}
