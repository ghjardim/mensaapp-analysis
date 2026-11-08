package p256j$.util.stream;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import p256j$.util.Collection;
import p256j$.util.Spliterator;

/* renamed from: j$.util.stream.Q0 */
/* loaded from: classes3.dex */
final class C5114Q0 implements InterfaceC5094M0 {

    /* renamed from: a */
    private final Collection f18452a;

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

    C5114Q0(Collection collection) {
        this.f18452a = collection;
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final Spliterator spliterator() {
        return Collection.EL.stream(this.f18452a).spliterator();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: i */
    public final void mo21484i(Object[] objArr, int i7) {
        Iterator it = this.f18452a.iterator();
        while (it.hasNext()) {
            objArr[i7] = it.next();
            i7++;
        }
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    /* renamed from: o */
    public final Object[] mo21485o(IntFunction intFunction) {
        java.util.Collection collection = this.f18452a;
        return collection.toArray((Object[]) intFunction.apply(collection.size()));
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final long count() {
        return this.f18452a.size();
    }

    @Override // p256j$.util.stream.InterfaceC5094M0
    public final void forEach(Consumer consumer) {
        Collection.EL.m21259a(this.f18452a, consumer);
    }

    public final String toString() {
        java.util.Collection collection = this.f18452a;
        return String.format("CollectionNode[%d][%s]", Integer.valueOf(collection.size()), collection);
    }
}
