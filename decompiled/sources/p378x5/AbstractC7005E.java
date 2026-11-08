package p378x5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC5469l;
import p371w5.C6926i;

/* renamed from: x5.E */
/* loaded from: classes2.dex */
public abstract class AbstractC7005E extends AbstractC7004D {
    /* renamed from: d */
    public static Map m28735d() {
        C7035z c7035z = C7035z.f25086a;
        AbstractC5469l.m23026c(c7035z, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return c7035z;
    }

    /* renamed from: e */
    public static HashMap m28736e(C6926i... pairs) {
        AbstractC5469l.m23028e(pairs, "pairs");
        HashMap hashMap = new HashMap(AbstractC7004D.m28732a(pairs.length));
        m28741j(hashMap, pairs);
        return hashMap;
    }

    /* renamed from: f */
    public static Map m28737f(C6926i... pairs) {
        AbstractC5469l.m23028e(pairs, "pairs");
        return pairs.length > 0 ? m28745n(pairs, new LinkedHashMap(AbstractC7004D.m28732a(pairs.length))) : m28735d();
    }

    /* renamed from: g */
    public static Map m28738g(C6926i... pairs) {
        AbstractC5469l.m23028e(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC7004D.m28732a(pairs.length));
        m28741j(linkedHashMap, pairs);
        return linkedHashMap;
    }

    /* renamed from: h */
    public static final Map m28739h(Map map) {
        AbstractC5469l.m23028e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC7004D.m28734c(map) : m28735d();
    }

    /* renamed from: i */
    public static final void m28740i(Map map, Iterable pairs) {
        AbstractC5469l.m23028e(map, "<this>");
        AbstractC5469l.m23028e(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            C6926i c6926i = (C6926i) it.next();
            map.put(c6926i.m28368a(), c6926i.m28369b());
        }
    }

    /* renamed from: j */
    public static final void m28741j(Map map, C6926i[] pairs) {
        AbstractC5469l.m23028e(map, "<this>");
        AbstractC5469l.m23028e(pairs, "pairs");
        for (C6926i c6926i : pairs) {
            map.put(c6926i.m28368a(), c6926i.m28369b());
        }
    }

    /* renamed from: k */
    public static Map m28742k(Iterable iterable) {
        AbstractC5469l.m23028e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m28739h(m28743l(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m28735d();
        }
        if (size != 1) {
            return m28743l(iterable, new LinkedHashMap(AbstractC7004D.m28732a(collection.size())));
        }
        return AbstractC7004D.m28733b((C6926i) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    /* renamed from: l */
    public static final Map m28743l(Iterable iterable, Map destination) {
        AbstractC5469l.m23028e(iterable, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        m28740i(destination, iterable);
        return destination;
    }

    /* renamed from: m */
    public static Map m28744m(Map map) {
        AbstractC5469l.m23028e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? m28746o(map) : AbstractC7004D.m28734c(map) : m28735d();
    }

    /* renamed from: n */
    public static final Map m28745n(C6926i[] c6926iArr, Map destination) {
        AbstractC5469l.m23028e(c6926iArr, "<this>");
        AbstractC5469l.m23028e(destination, "destination");
        m28741j(destination, c6926iArr);
        return destination;
    }

    /* renamed from: o */
    public static Map m28746o(Map map) {
        AbstractC5469l.m23028e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
