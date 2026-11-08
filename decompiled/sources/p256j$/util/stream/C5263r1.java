package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.r1 */
/* loaded from: classes3.dex */
class C5263r1 implements InterfaceC5084K0 {

    /* renamed from: a */
    final long[] f18689a;

    /* renamed from: b */
    int f18690b;

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC5034A0.m21414s(this, consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21417v(this, j7, j8);
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
        AbstractC5034A0.m21411p(this, (Long[]) objArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: e */
    public final void mo21481e(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i7 = 0; i7 < this.f18690b; i7++) {
            longConsumer.accept(this.f18689a[i7]);
        }
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: r */
    public final void mo21482r(int i7, Object obj) {
        int i8 = this.f18690b;
        System.arraycopy(this.f18689a, 0, (long[]) obj, i7, i8);
    }

    C5263r1(long j7) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18689a = new long[(int) j7];
        this.f18690b = 0;
    }

    C5263r1(long[] jArr) {
        this.f18689a = jArr;
        this.f18690b = jArr.length;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Spliterators.m21292l(this.f18689a, 0, this.f18690b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0, p256j$.util.stream.InterfaceC5094M0
    public final InterfaceC4999f0 spliterator() {
        return Spliterators.m21292l(this.f18689a, 0, this.f18690b);
    }

    @Override // p256j$.util.stream.InterfaceC5089L0
    /* renamed from: d */
    public final Object mo21480d() {
        long[] jArr = this.f18689a;
        int length = jArr.length;
        int i7 = this.f18690b;
        return length == i7 ? jArr : Arrays.copyOf(jArr, i7);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18690b;
    }

    public String toString() {
        long[] jArr = this.f18689a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.f18690b), Arrays.toString(jArr));
    }
}
