package p256j$.util.stream;

import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.w1 */
/* loaded from: classes3.dex */
final class C5288w1 extends AbstractC5298y1 implements InterfaceC5259q2 {

    /* renamed from: h */
    private final long[] f18718h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21458j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5259q2
    /* renamed from: j */
    public final /* synthetic */ void mo21458j(Long l7) {
        AbstractC5034A0.m21404i(this, l7);
    }

    C5288w1(Spliterator spliterator, AbstractC5168b abstractC5168b, long[] jArr) {
        super(spliterator, abstractC5168b, jArr.length);
        this.f18718h = jArr;
    }

    C5288w1(C5288w1 c5288w1, Spliterator spliterator, long j7, long j8) {
        super(c5288w1, spliterator, j7, j8, c5288w1.f18718h.length);
        this.f18718h = c5288w1.f18718h;
    }

    @Override // p256j$.util.stream.AbstractC5298y1
    /* renamed from: b */
    final AbstractC5298y1 mo21602b(Spliterator spliterator, long j7, long j8) {
        return new C5288w1(this, spliterator, j7, j8);
    }

    @Override // p256j$.util.stream.AbstractC5298y1, p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final void accept(long j7) {
        int i7 = this.f18740f;
        if (i7 >= this.f18741g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18740f));
        }
        long[] jArr = this.f18718h;
        this.f18740f = i7 + 1;
        jArr[i7] = j7;
    }
}
