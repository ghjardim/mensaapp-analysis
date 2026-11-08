package p256j$.util.stream;

import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.x1 */
/* loaded from: classes3.dex */
final class C5293x1 extends AbstractC5298y1 {

    /* renamed from: h */
    private final Object[] f18728h;

    C5293x1(Spliterator spliterator, AbstractC5168b abstractC5168b, Object[] objArr) {
        super(spliterator, abstractC5168b, objArr.length);
        this.f18728h = objArr;
    }

    C5293x1(C5293x1 c5293x1, Spliterator spliterator, long j7, long j8) {
        super(c5293x1, spliterator, j7, j8, c5293x1.f18728h.length);
        this.f18728h = c5293x1.f18728h;
    }

    @Override // p256j$.util.stream.AbstractC5298y1
    /* renamed from: b */
    final AbstractC5298y1 mo21602b(Spliterator spliterator, long j7, long j8) {
        return new C5293x1(this, spliterator, j7, j8);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i7 = this.f18740f;
        if (i7 >= this.f18741g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f18740f));
        }
        Object[] objArr = this.f18728h;
        this.f18740f = i7 + 1;
        objArr[i7] = obj;
    }
}
