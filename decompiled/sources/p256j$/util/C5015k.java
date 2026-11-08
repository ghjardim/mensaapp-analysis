package p256j$.util;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: j$.util.k */
/* loaded from: classes3.dex */
final class C5015k extends C5011i implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // p256j$.util.C5011i, java.util.List
    public final List subList(int i7, int i8) {
        C5015k c5015k;
        synchronized (this.f18282b) {
            c5015k = new C5015k(this.f18286c.subList(i7, i8), this.f18282b);
        }
        return c5015k;
    }

    private Object writeReplace() {
        return new C5011i(this.f18286c);
    }
}
