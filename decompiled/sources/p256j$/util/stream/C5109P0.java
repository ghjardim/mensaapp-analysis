package p256j$.util.stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.Spliterator;
import p256j$.util.Spliterators;

/* renamed from: j$.util.stream.P0 */
/* loaded from: classes3.dex */
class C5109P0 implements InterfaceC5094M0 {

    /* renamed from: a */
    final Object[] f18443a;

    /* renamed from: b */
    int f18444b;

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21418w(this, j7, j8, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: q */
    public final /* synthetic */ int mo21486q() {
        return 0;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: b */
    public final InterfaceC5094M0 mo21478b(int i7) {
        throw new IndexOutOfBoundsException();
    }

    C5109P0(long j7, IntFunction intFunction) {
        if (j7 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f18443a = (Object[]) intFunction.apply((int) j7);
        this.f18444b = 0;
    }

    C5109P0(Object[] objArr) {
        this.f18443a = objArr;
        this.f18444b = objArr.length;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Spliterators.m21293m(this.f18443a, 0, this.f18444b);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final void mo21484i(Object[] objArr, int i7) {
        System.arraycopy(this.f18443a, 0, objArr, i7, this.f18444b);
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: o */
    public final Object[] mo21485o(IntFunction intFunction) {
        Object[] objArr = this.f18443a;
        if (objArr.length == this.f18444b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18444b;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final void forEach(Consumer consumer) {
        for (int i7 = 0; i7 < this.f18444b; i7++) {
            consumer.m21477p(this.f18443a[i7]);
        }
    }

    public String toString() {
        Object[] objArr = this.f18443a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.f18444b), Arrays.toString(objArr));
    }
}
