package p108P2;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: P2.G */
/* loaded from: classes.dex */
public final class C1492G implements Iterator {

    /* renamed from: a */
    public final Iterator f4679a;

    /* renamed from: b */
    public final /* synthetic */ C1501H f4680b;

    public C1492G(C1501H c1501h) {
        Bundle bundle;
        this.f4680b = c1501h;
        bundle = c1501h.f4692a;
        this.f4679a = bundle.keySet().iterator();
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f4679a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f4679a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
