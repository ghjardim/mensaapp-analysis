package p256j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.z1 */
/* loaded from: classes3.dex */
final class C5303z1 extends C5172b3 implements InterfaceC5094M0, InterfaceC5054E0 {
    @Override // p256j$.util.stream.InterfaceC5054E0
    /* renamed from: a */
    public final InterfaceC5094M0 mo21444a() {
        return this;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(double d7) {
        AbstractC5034A0.m21394a();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    public final /* synthetic */ void accept(int i7) {
        AbstractC5034A0.m21406k();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5264r2, p256j$.util.stream.InterfaceC5259q2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j7) {
        AbstractC5034A0.m21407l();
        throw null;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: h */
    public final /* synthetic */ InterfaceC5094M0 mo21483h(long j7, long j8, IntFunction intFunction) {
        return AbstractC5034A0.m21418w(this, j7, j8, intFunction);
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: k */
    public final void mo21459k() {
    }

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: n */
    public final /* synthetic */ boolean mo21455n() {
        return false;
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

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final void mo21484i(Object[] objArr, int i7) {
        long j7 = i7;
        long count = count() + j7;
        if (count > objArr.length || count < j7) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f18557c == 0) {
            System.arraycopy(this.f18547e, 0, objArr, i7, this.f18556b);
            return;
        }
        for (int i8 = 0; i8 < this.f18557c; i8++) {
            Object[] objArr2 = this.f18548f[i8];
            System.arraycopy(objArr2, 0, objArr, i7, objArr2.length);
            i7 += this.f18548f[i8].length;
        }
        int i9 = this.f18556b;
        if (i9 > 0) {
            System.arraycopy(this.f18547e, 0, objArr, i7, i9);
        }
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

    @Override // p256j$.util.stream.InterfaceC5264r2
    /* renamed from: l */
    public final void mo21460l(long j7) {
        clear();
        m21538s(j7);
    }
}
