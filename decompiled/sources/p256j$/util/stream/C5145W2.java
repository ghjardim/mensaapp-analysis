package p256j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.W2 */
/* loaded from: classes3.dex */
class C5145W2 extends AbstractC5166a3 implements IntConsumer {
    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return AbstractC4815a.m20866d(this, intConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: s */
    protected final void mo21503s(Object obj, int i7, int i8, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i7 < i8) {
            intConsumer.accept(iArr[i7]);
            i7++;
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: t */
    protected final int mo21504t(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            mo21481e((IntConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            AbstractC4994d.m21344b((C5140V2) spliterator(), consumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: w */
    protected final Object[] mo21505w() {
        return new int[8][];
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: c */
    public final Object mo21502c(int i7) {
        return new int[i7];
    }

    @Override // java.util.function.IntConsumer
    public void accept(int i7) {
        m21511x();
        int[] iArr = (int[]) this.f18532e;
        int i8 = this.f18556b;
        this.f18556b = i8 + 1;
        iArr[i8] = i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m21287g(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5166a3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC4960Z spliterator() {
        return new C5140V2(this, 0, this.f18557c, 0, this.f18556b);
    }

    public final String toString() {
        int[] iArr = (int[]) mo21480d();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18557c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f18557c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }
}
