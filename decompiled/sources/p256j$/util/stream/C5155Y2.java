package p256j$.util.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p256j$.com.android.tools.p257r8.AbstractC4815a;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.Y2 */
/* loaded from: classes3.dex */
class C5155Y2 extends AbstractC5166a3 implements LongConsumer {
    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return AbstractC4815a.m20867e(this, longConsumer);
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: s */
    protected final void mo21503s(Object obj, int i7, int i8, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i7 < i8) {
            longConsumer.accept(jArr[i7]);
            i7++;
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: t */
    protected final int mo21504t(Object obj) {
        return ((long[]) obj).length;
    }

    @Override // java.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            mo21481e((LongConsumer) consumer);
        } else {
            if (AbstractC5107O3.f18441a) {
                AbstractC5107O3.m21488a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            AbstractC4994d.m21345c((C5150X2) spliterator(), consumer);
        }
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: w */
    protected final Object[] mo21505w() {
        return new long[8][];
    }

    @Override // p256j$.util.stream.AbstractC5166a3
    /* renamed from: c */
    public final Object mo21502c(int i7) {
        return new long[i7];
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j7) {
        m21511x();
        long[] jArr = (long[]) this.f18532e;
        int i7 = this.f18556b;
        this.f18556b = i7 + 1;
        jArr[i7] = j7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.m21288h(spliterator());
    }

    @Override // p256j$.util.stream.AbstractC5166a3, java.lang.Iterable
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public InterfaceC4966c0 spliterator() {
        return new C5150X2(this, 0, this.f18557c, 0, this.f18556b);
    }

    public final String toString() {
        long[] jArr = (long[]) mo21480d();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18557c), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.f18557c), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }
}
