package p256j$.util;

import java.util.Comparator;
import java.util.SortedMap;

/* renamed from: j$.util.x */
/* loaded from: classes3.dex */
final class C5313x extends C5308u implements SortedMap {
    private static final long serialVersionUID = -8806743815996713206L;

    /* renamed from: e */
    private final SortedMap f18757e;

    C5313x(SortedMap sortedMap) {
        super(sortedMap);
        this.f18757e = sortedMap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.f18757e.comparator();
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return new C5313x(this.f18757e.subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return new C5313x(this.f18757e.headMap(obj));
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return new C5313x(this.f18757e.tailMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.f18757e.firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.f18757e.lastKey();
    }
}
