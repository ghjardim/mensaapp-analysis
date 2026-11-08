package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.Objects;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.S2 */
/* loaded from: classes3.dex */
final class C5125S2 implements Spliterator {

    /* renamed from: a */
    int f18479a;

    /* renamed from: b */
    final int f18480b;

    /* renamed from: c */
    int f18481c;

    /* renamed from: d */
    final int f18482d;

    /* renamed from: e */
    Object[] f18483e;

    /* renamed from: f */
    final /* synthetic */ C5172b3 f18484f;

    @Override // p256j$.util.Spliterator
    public final int characteristics() {
        return 16464;
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return AbstractC4994d.m21346d(this);
    }

    @Override // p256j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i7) {
        return AbstractC4994d.m21347e(this, i7);
    }

    C5125S2(C5172b3 c5172b3, int i7, int i8, int i9, int i10) {
        this.f18484f = c5172b3;
        this.f18479a = i7;
        this.f18480b = i8;
        this.f18481c = i9;
        this.f18482d = i10;
        Object[][] objArr = c5172b3.f18548f;
        this.f18483e = objArr == null ? c5172b3.f18547e : objArr[i7];
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        int i7 = this.f18479a;
        int i8 = this.f18482d;
        int i9 = this.f18480b;
        if (i7 == i9) {
            return i8 - this.f18481c;
        }
        long[] jArr = this.f18484f.f18558d;
        return ((jArr[i9] + i8) - jArr[i7]) - this.f18481c;
    }

    @Override // p256j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        int i7 = this.f18479a;
        int i8 = this.f18480b;
        if (i7 >= i8 && (i7 != i8 || this.f18481c >= this.f18482d)) {
            return false;
        }
        Object[] objArr = this.f18483e;
        int i9 = this.f18481c;
        this.f18481c = i9 + 1;
        consumer.accept(objArr[i9]);
        if (this.f18481c == this.f18483e.length) {
            this.f18481c = 0;
            int i10 = this.f18479a + 1;
            this.f18479a = i10;
            Object[][] objArr2 = this.f18484f.f18548f;
            if (objArr2 != null && i10 <= i8) {
                this.f18483e = objArr2[i10];
            }
        }
        return true;
    }

    @Override // p256j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        C5172b3 c5172b3;
        Objects.requireNonNull(consumer);
        int i7 = this.f18479a;
        int i8 = this.f18482d;
        int i9 = this.f18480b;
        if (i7 < i9 || (i7 == i9 && this.f18481c < i8)) {
            int i10 = this.f18481c;
            while (true) {
                c5172b3 = this.f18484f;
                if (i7 >= i9) {
                    break;
                }
                Object[] objArr = c5172b3.f18548f[i7];
                while (i10 < objArr.length) {
                    consumer.accept(objArr[i10]);
                    i10++;
                }
                i7++;
                i10 = 0;
            }
            Object[] objArr2 = this.f18479a == i9 ? this.f18483e : c5172b3.f18548f[i9];
            while (i10 < i8) {
                consumer.accept(objArr2[i10]);
                i10++;
            }
            this.f18479a = i9;
            this.f18481c = i8;
        }
    }

    @Override // p256j$.util.Spliterator
    public final Spliterator trySplit() {
        int i7 = this.f18479a;
        int i8 = this.f18480b;
        if (i7 < i8) {
            int i9 = i8 - 1;
            int i10 = this.f18481c;
            C5172b3 c5172b3 = this.f18484f;
            C5125S2 c5125s2 = new C5125S2(c5172b3, i7, i9, i10, c5172b3.f18548f[i9].length);
            this.f18479a = i8;
            this.f18481c = 0;
            this.f18483e = c5172b3.f18548f[i8];
            return c5125s2;
        }
        if (i7 != i8) {
            return null;
        }
        int i11 = this.f18481c;
        int i12 = (this.f18482d - i11) / 2;
        if (i12 == 0) {
            return null;
        }
        Spliterator m21293m = Spliterators.m21293m(this.f18483e, i11, i11 + i12);
        this.f18481c += i12;
        return m21293m;
    }

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }
}
