package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.e1 */
/* loaded from: classes3.dex */
final class C5188e1 extends AbstractC5200g1 implements InterfaceC5084K0 {
    @Override // p256j$.util.stream.InterfaceC5094M0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5034A0.m21414s(this, consumer);
    }

    @Override // p256j$.util.stream.AbstractC5200g1, p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21417v(this, j7, j8);
    }

    @Override // p256j$.util.stream.AbstractC5200g1, p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC5094M0 mo21478b(int i7) {
        mo21478b(i7);
        throw null;
    }

    @Override // p256j$.util.stream.AbstractC5200g1, p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final InterfaceC5089L0 mo21478b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final /* synthetic */ void mo21484i(Object[] objArr, int i7) {
        AbstractC5034A0.m21411p(this, (Long[]) objArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Spliterators.m21284d();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final InterfaceC4999f0 spliterator() {
        return Spliterators.m21284d();
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        long[] jArr;
        jArr = AbstractC5034A0.f18332f;
        return jArr;
    }
}
