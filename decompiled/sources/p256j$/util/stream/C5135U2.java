package p256j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.U2 */
/* loaded from: classes3.dex */
class C5135U2 extends AbstractC5166a3 implements DoubleConsumer {
    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC4815a.m20865c(this, doubleConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: s */
    protected final void mo21503s(Object obj, int i7, int i8, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i7 < i8) {
            doubleConsumer.accept(dArr[i7]);
            i7++;
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: t */
    protected final int mo21504t(Object obj) {
        return ((double[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            mo21481e((DoubleConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            AbstractC4994d.m21343a((C5130T2) spliterator(), consumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: w */
    protected final Object[] mo21505w() {
        return new double[8][];
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: c */
    public final Object mo21502c(int i7) {
        return new double[i7];
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d7) {
        m21511x();
        double[] dArr = (double[]) this.f18532e;
        int i7 = this.f18556b;
        this.f18556b = i7 + 1;
        dArr[i7] = d7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m21286f(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5166a3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC4957W spliterator() {
        return new C5130T2(this, 0, this.f18557c, 0, this.f18556b);
    }

    public final String toString() {
        double[] dArr = (double[]) mo21480d();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18557c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f18557c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }
}
