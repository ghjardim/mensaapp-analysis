package p256j$.util.concurrent;

/* renamed from: j$.util.concurrent.r */
/* loaded from: classes3.dex */
final class C4985r extends C4979l {

    /* renamed from: e */
    C4985r f18244e;

    /* renamed from: f */
    C4985r f18245f;

    /* renamed from: g */
    C4985r f18246g;

    /* renamed from: h */
    C4985r f18247h;

    /* renamed from: i */
    boolean f18248i;

    C4985r(int i7, Object obj, Object obj2, C4979l c4979l, C4985r c4985r) {
        super(i7, obj, obj2, c4979l);
        this.f18244e = c4985r;
    }

    @Override // p256j$.util.concurrent.C4979l
    /* renamed from: a */
    final C4979l mo21328a(int i7, Object obj) {
        return m21338b(i7, obj, null);
    }

    /* renamed from: b */
    final C4985r m21338b(int i7, Object obj, Class cls) {
        if (obj == null) {
            return null;
        }
        C4985r c4985r = this;
        do {
            C4985r c4985r2 = c4985r.f18245f;
            C4985r c4985r3 = c4985r.f18246g;
            int i8 = c4985r.f18223a;
            if (i8 <= i7) {
                if (i8 >= i7) {
                    Object obj2 = c4985r.f18224b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c4985r;
                    }
                    if (c4985r2 != null) {
                        if (c4985r3 != null) {
                            if (cls != null || (cls = ConcurrentHashMap.m21305c(obj)) != null) {
                                int i9 = ConcurrentHashMap.f18178g;
                                int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                if (compareTo != 0) {
                                    if (compareTo >= 0) {
                                        c4985r2 = c4985r3;
                                    }
                                }
                            }
                            C4985r m21338b = c4985r3.m21338b(i7, obj, cls);
                            if (m21338b != null) {
                                return m21338b;
                            }
                        }
                    }
                }
                c4985r = c4985r3;
            }
            c4985r = c4985r2;
        } while (c4985r != null);
        return null;
    }
}
