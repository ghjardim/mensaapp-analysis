package p256j$.util.stream;

import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.u1 */
/* loaded from: classes3.dex */
final class C5278u1 extends AbstractC5298y1 implements InterfaceC5249o2 {

    /* renamed from: h */
    private final double[] f18707h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21462p((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5249o2
    /* renamed from: p */
    public final /* synthetic */ void mo21462p(Double d7) {
        AbstractC5034A0.m21399e(this, d7);
    }

    C5278u1(Spliterator spliterator, AbstractC5168b abstractC5168b, double[] dArr) {
        super(spliterator, abstractC5168b, dArr.length);
        this.f18707h = dArr;
    }

    C5278u1(C5278u1 c5278u1, Spliterator spliterator, long j7, long j8) {
        super(c5278u1, spliterator, j7, j8, c5278u1.f18707h.length);
        this.f18707h = c5278u1.f18707h;
    }

    @Override // p256j$.util.stream.AbstractC5298y1
    /* renamed from: b */
    final AbstractC5298y1 mo21602b(Spliterator spliterator, long j7, long j8) {
        return new C5278u1(this, spliterator, j7, j8);
    }

    @Override // p256j$.util.stream.AbstractC5298y1, p256j$.util.stream.InterfaceC5264r2
    public final void accept(double d7) {
        int i7 = this.f18740f;
        if (i7 >= this.f18741g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18740f));
        }
        double[] dArr = this.f18707h;
        this.f18740f = i7 + 1;
        dArr[i7] = d7;
    }
}
