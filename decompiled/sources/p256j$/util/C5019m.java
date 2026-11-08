package p256j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.m */
/* loaded from: classes3.dex */
final class C5019m implements Iterator, InterfaceC4936A {

    /* renamed from: a */
    public final /* synthetic */ int f18305a = 0;

    /* renamed from: b */
    private final Iterator f18306b;

    public C5019m(C5021n c5021n) {
        this.f18306b = c5021n.f18311a.iterator();
    }

    @Override // java.util.Iterator, p256j$.util.InterfaceC4936A
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f18305a) {
            case 0:
                AbstractC4994d.m21359q(this.f18306b, consumer);
                break;
            default:
                AbstractC4994d.m21359q(this.f18306b, new C5027q(consumer));
                break;
        }
    }

    public C5019m(C5306t c5306t) {
        this.f18306b = c5306t.f18311a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f18305a) {
        }
        return this.f18306b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18305a) {
            case 0:
                return this.f18306b.next();
            default:
                return new C5029r((Map.Entry) this.f18306b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f18305a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
