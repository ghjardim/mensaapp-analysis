package p256j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: j$.util.concurrent.i */
/* loaded from: classes3.dex */
final class C4976i extends AbstractC4968a implements Iterator, Enumeration {

    /* renamed from: k */
    public final /* synthetic */ int f18217k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4976i(C4979l[] c4979lArr, int i7, int i8, ConcurrentHashMap concurrentHashMap, int i9) {
        super(c4979lArr, i7, i8, concurrentHashMap);
        this.f18217k = i9;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f18217k) {
            case 0:
                C4979l c4979l = this.f18232b;
                if (c4979l == null) {
                    throw new NoSuchElementException();
                }
                this.f18202j = c4979l;
                m21329a();
                return c4979l.f18224b;
            default:
                C4979l c4979l2 = this.f18232b;
                if (c4979l2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = c4979l2.f18225c;
                this.f18202j = c4979l2;
                m21329a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f18217k) {
        }
        return next();
    }
}
