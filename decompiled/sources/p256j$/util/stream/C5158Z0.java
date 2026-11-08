package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.Z0 */
/* loaded from: classes3.dex */
class C5158Z0 implements InterfaceC5064G0 {

    /* renamed from: a */
    final double[] f18521a;

    /* renamed from: b */
    int f18522b;

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
    /* renamed from: o */
    public final /* synthetic */ Object[] mo21485o(IntFunction intFunction) {
        return AbstractC5034A0.m21408m(this, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: q */
    public final /* synthetic */ int mo21486q() {
        return 0;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ InterfaceC5094M0 mo21478b(int i7) {
        mo21478b(i7);
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5089L0, p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final InterfaceC5089L0 mo21478b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final /* synthetic */ void mo21484i(Object[] objArr, int i7) {
        AbstractC5034A0.m21409n(this, (Double[]) objArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: e */
    public final void mo21481e(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i7 = 0; i7 < this.f18522b; i7++) {
            doubleConsumer.accept(this.f18521a[i7]);
        }
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: r */
    public final void mo21482r(int i7, Object obj) {
        int i8 = this.f18522b;
        System.arraycopy(this.f18521a, 0, (double[]) obj, i7, i8);
    }

    C5158Z0(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18521a = new double[(int) j7];
        this.f18522b = 0;
    }

    C5158Z0(double[] dArr) {
        this.f18521a = dArr;
        this.f18522b = dArr.length;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Spliterators.m21290j(this.f18521a, 0, this.f18522b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0, p256j$.util.stream.InterfaceC5094M0
    public final InterfaceC4999f0 spliterator() {
        return Spliterators.m21290j(this.f18521a, 0, this.f18522b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        double[] dArr = this.f18521a;
        int length = dArr.length;
        int i7 = this.f18522b;
        return length == i7 ? dArr : Arrays.copyOf(dArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18522b;
    }

    public String toString() {
        double[] dArr = this.f18521a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.f18522b), Arrays.toString(dArr));
    }
}
