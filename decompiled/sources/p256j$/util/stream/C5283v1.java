package p256j$.util.stream;

import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.v1 */
/* loaded from: classes3.dex */
final class C5283v1 extends AbstractC5298y1 implements InterfaceC5254p2 {

    /* renamed from: h */
    private final int[] f18712h;

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void m21477p(Object obj) {
        mo21487m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.InterfaceC5254p2
    /* renamed from: m */
    public final /* synthetic */ void mo21487m(Integer num) {
        AbstractC5034A0.m21402g(this, num);
    }

    C5283v1(Spliterator spliterator, AbstractC5168b abstractC5168b, int[] iArr) {
        super(spliterator, abstractC5168b, iArr.length);
        this.f18712h = iArr;
    }

    C5283v1(C5283v1 c5283v1, Spliterator spliterator, long j7, long j8) {
        super(c5283v1, spliterator, j7, j8, c5283v1.f18712h.length);
        this.f18712h = c5283v1.f18712h;
    }

    @Override // p256j$.util.stream.AbstractC5298y1
    /* renamed from: b */
    final AbstractC5298y1 mo21602b(Spliterator spliterator, long j7, long j8) {
        return new C5283v1(this, spliterator, j7, j8);
    }

    @Override // p256j$.util.stream.AbstractC5298y1, p256j$.util.stream.InterfaceC5264r2
    public final void accept(int i7) {
        int i8 = this.f18740f;
        if (i8 >= this.f18741g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18740f));
        }
        int[] iArr = this.f18712h;
        this.f18740f = i8 + 1;
        iArr[i8] = i7;
    }
}
