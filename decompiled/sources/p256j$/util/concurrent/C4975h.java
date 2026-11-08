package p256j$.util.concurrent;

/* renamed from: j$.util.concurrent.h */
/* loaded from: classes3.dex */
final class C4975h extends C4979l {

    /* renamed from: e */
    final C4979l[] f18216e;

    C4975h(C4979l[] c4979lArr) {
        super(-1, null, null);
        this.f18216e = c4979lArr;
    }

    @Override // p256j$.util.concurrent.C4979l
    /* renamed from: a */
    final C4979l mo21328a(int i7, Object obj) {
        int length;
        C4979l m21309k;
        Object obj2;
        C4979l[] c4979lArr = this.f18216e;
        loop0: while (obj != null && c4979lArr != null && (length = c4979lArr.length) != 0 && (m21309k = ConcurrentHashMap.m21309k(c4979lArr, (length - 1) & i7)) != null) {
            do {
                int i8 = m21309k.f18223a;
                if (i8 == i7 && ((obj2 = m21309k.f18224b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return m21309k;
                }
                if (i8 < 0) {
                    if (m21309k instanceof C4975h) {
                        c4979lArr = ((C4975h) m21309k).f18216e;
                    } else {
                        return m21309k.mo21328a(i7, obj);
                    }
                } else {
                    m21309k = m21309k.f18226d;
                }
            } while (m21309k != null);
        }
        return null;
    }
}
