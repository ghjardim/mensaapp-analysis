package p256j$.util.concurrent;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j$.util.concurrent.d */
/* loaded from: classes3.dex */
final class C4971d extends AbstractC4968a implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        C4979l c4979l = this.f18232b;
        if (c4979l == null) {
            throw new NoSuchElementException();
        }
        Object obj = c4979l.f18224b;
        Object obj2 = c4979l.f18225c;
        this.f18202j = c4979l;
        m21329a();
        return new C4978k(obj, obj2, this.f18201i);
    }
}
