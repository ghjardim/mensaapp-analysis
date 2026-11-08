package p256j$.util.concurrent;

/* renamed from: j$.util.concurrent.a */
/* loaded from: classes3.dex */
abstract class AbstractC4968a extends C4983p {

    /* renamed from: i */
    final ConcurrentHashMap f18201i;

    /* renamed from: j */
    C4979l f18202j;

    AbstractC4968a(C4979l[] c4979lArr, int i7, int i8, ConcurrentHashMap concurrentHashMap) {
        super(c4979lArr, i7, 0, i8);
        this.f18201i = concurrentHashMap;
        m21329a();
    }

    public final boolean hasNext() {
        return this.f18232b != null;
    }

    public final boolean hasMoreElements() {
        return this.f18232b != null;
    }

    public final void remove() {
        C4979l c4979l = this.f18202j;
        if (c4979l == null) {
            throw new IllegalStateException();
        }
        this.f18202j = null;
        this.f18201i.m21317g(c4979l.f18224b, null, null);
    }
}
