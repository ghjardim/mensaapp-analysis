package p256j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.Objects;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.Y0 */
/* loaded from: classes3.dex */
final class C5153Y0 extends AbstractC5104O0 {
    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return new C5253p1(this);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final void mo21484i(Object[] objArr, int i7) {
        Objects.requireNonNull(objArr);
        InterfaceC5094M0 interfaceC5094M0 = this.f18433a;
        interfaceC5094M0.mo21484i(objArr, i7);
        this.f18434b.mo21484i(objArr, i7 + ((int) interfaceC5094M0.count()));
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: o */
    public final Object[] mo21485o(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        mo21484i(objArr, 0);
        return objArr;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final void forEach(Consumer consumer) {
        this.f18433a.forEach(consumer);
        this.f18434b.forEach(consumer);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        if (j7 == 0 && j8 == count()) {
            return this;
        }
        long count = this.f18433a.count();
        if (j7 >= count) {
            return this.f18434b.mo21483h(j7 - count, j8 - count, intFunction);
        }
        if (j8 > count) {
            return AbstractC5034A0.m21376I(EnumC5202g3.REFERENCE, this.f18433a.mo21483h(j7, count, intFunction), this.f18434b.mo21483h(0L, j8 - count, intFunction));
        }
        return this.f18433a.mo21483h(j7, j8, intFunction);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.f18433a, this.f18434b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
