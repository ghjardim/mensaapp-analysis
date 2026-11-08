package p256j$.util.stream;

import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import p256j$.util.AbstractC4994d;
import p256j$.util.InterfaceC4957W;
import p256j$.util.InterfaceC4960Z;
import p256j$.util.InterfaceC4966c0;
import p256j$.util.InterfaceC4999f0;
import p256j$.util.Objects;

/* renamed from: j$.util.stream.Z2 */
/* loaded from: classes3.dex */
abstract class AbstractC5160Z2 implements InterfaceC4999f0 {

    /* renamed from: a */
    int f18523a;

    /* renamed from: b */
    final int f18524b;

    /* renamed from: c */
    int f18525c;

    /* renamed from: d */
    final int f18526d;

    /* renamed from: e */
    Object f18527e;

    /* renamed from: f */
    final /* synthetic */ AbstractC5166a3 f18528f;

    /* renamed from: a */
    abstract void mo21499a(int i7, Object obj, Object obj2);

    /* renamed from: b */
    abstract InterfaceC4999f0 mo21500b(Object obj, int i7, int i8);

    /* renamed from: c */
    abstract InterfaceC4999f0 mo21501c(int i7, int i8, int i9, int i10);

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

    @Override // p256j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    AbstractC5160Z2(AbstractC5166a3 abstractC5166a3, int i7, int i8, int i9, int i10) {
        this.f18528f = abstractC5166a3;
        this.f18523a = i7;
        this.f18524b = i8;
        this.f18525c = i9;
        this.f18526d = i10;
        Object[] objArr = abstractC5166a3.f18533f;
        this.f18527e = objArr == null ? abstractC5166a3.f18532e : objArr[i7];
    }

    @Override // p256j$.util.Spliterator
    public final long estimateSize() {
        int i7 = this.f18523a;
        int i8 = this.f18526d;
        int i9 = this.f18524b;
        if (i7 == i9) {
            return i8 - this.f18525c;
        }
        long[] jArr = this.f18528f.f18558d;
        return ((jArr[i9] + i8) - jArr[i7]) - this.f18525c;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        int i7 = this.f18523a;
        int i8 = this.f18524b;
        if (i7 >= i8 && (i7 != i8 || this.f18525c >= this.f18526d)) {
            return false;
        }
        Object obj2 = this.f18527e;
        int i9 = this.f18525c;
        this.f18525c = i9 + 1;
        mo21499a(i9, obj2, obj);
        int i10 = this.f18525c;
        Object obj3 = this.f18527e;
        AbstractC5166a3 abstractC5166a3 = this.f18528f;
        if (i10 == abstractC5166a3.mo21504t(obj3)) {
            this.f18525c = 0;
            int i11 = this.f18523a + 1;
            this.f18523a = i11;
            Object[] objArr = abstractC5166a3.f18533f;
            if (objArr != null && i11 <= i8) {
                this.f18527e = objArr[i11];
            }
        }
        return true;
    }

    @Override // p256j$.util.InterfaceC4999f0
    public final void forEachRemaining(Object obj) {
        AbstractC5166a3 abstractC5166a3;
        Objects.requireNonNull(obj);
        int i7 = this.f18523a;
        int i8 = this.f18526d;
        int i9 = this.f18524b;
        if (i7 < i9 || (i7 == i9 && this.f18525c < i8)) {
            int i10 = this.f18525c;
            while (true) {
                abstractC5166a3 = this.f18528f;
                if (i7 >= i9) {
                    break;
                }
                Object obj2 = abstractC5166a3.f18533f[i7];
                abstractC5166a3.mo21503s(obj2, i10, abstractC5166a3.mo21504t(obj2), obj);
                i7++;
                i10 = 0;
            }
            abstractC5166a3.mo21503s(this.f18523a == i9 ? this.f18527e : abstractC5166a3.f18533f[i9], i10, i8, obj);
            this.f18523a = i9;
            this.f18525c = i8;
        }
    }

    @Override // p256j$.util.Spliterator
    public final InterfaceC4999f0 trySplit() {
        int i7 = this.f18523a;
        int i8 = this.f18524b;
        if (i7 < i8) {
            int i9 = i8 - 1;
            int i10 = this.f18525c;
            AbstractC5166a3 abstractC5166a3 = this.f18528f;
            InterfaceC4999f0 mo21501c = mo21501c(i7, i9, i10, abstractC5166a3.mo21504t(abstractC5166a3.f18533f[i9]));
            this.f18523a = i8;
            this.f18525c = 0;
            this.f18527e = abstractC5166a3.f18533f[i8];
            return mo21501c;
        }
        if (i7 != i8) {
            return null;
        }
        int i11 = this.f18525c;
        int i12 = (this.f18526d - i11) / 2;
        if (i12 == 0) {
            return null;
        }
        InterfaceC4999f0 mo21500b = mo21500b(this.f18527e, i11, i12);
        this.f18525c += i12;
        return mo21500b;
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4960Z trySplit() {
        return (InterfaceC4960Z) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4966c0 trySplit() {
        return (InterfaceC4966c0) trySplit();
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    @Override // p256j$.util.InterfaceC4999f0, p256j$.util.Spliterator
    public /* bridge */ /* synthetic */ InterfaceC4957W trySplit() {
        return (InterfaceC4957W) trySplit();
    }
}
