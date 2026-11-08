package p256j$.util;

import java.util.List;
import java.util.RandomAccess;

/* renamed from: j$.util.v */
/* loaded from: classes3.dex */
final class C5310v extends C5025p implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // p256j$.util.C5025p, java.util.List
    public final List subList(int i7, int i8) {
        return new C5310v(this.f18313b.subList(i7, i8));
    }

    private Object writeReplace() {
        return new C5025p(this.f18313b);
    }
}
