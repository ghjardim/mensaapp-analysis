package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.i1 */
/* loaded from: classes3.dex */
class C5212i1 implements InterfaceC5074I0 {

    /* renamed from: a */
    final int[] f18628a;

    /* renamed from: b */
    int f18629b;

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5034A0.m21413r(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21416u(this, j7, j8);
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
        AbstractC5034A0.m21410o(this, (Integer[]) objArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: e */
    public final void mo21481e(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i7 = 0; i7 < this.f18629b; i7++) {
            intConsumer.accept(this.f18628a[i7]);
        }
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: r */
    public final void mo21482r(int i7, Object obj) {
        int i8 = this.f18629b;
        System.arraycopy(this.f18628a, 0, (int[]) obj, i7, i8);
    }

    C5212i1(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18628a = new int[(int) j7];
        this.f18629b = 0;
    }

    C5212i1(int[] iArr) {
        this.f18628a = iArr;
        this.f18629b = iArr.length;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Spliterators.m21291k(this.f18628a, 0, this.f18629b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0, p256j$.util.stream.InterfaceC5094M0
    public final InterfaceC4999f0 spliterator() {
        return Spliterators.m21291k(this.f18628a, 0, this.f18629b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        int[] iArr = this.f18628a;
        int length = iArr.length;
        int i7 = this.f18629b;
        return length == i7 ? iArr : Arrays.copyOf(iArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18629b;
    }

    public String toString() {
        int[] iArr = this.f18628a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.f18629b), Arrays.toString(iArr));
    }
}
