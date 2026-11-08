package p256j$.util;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p256j$.util.Map;

/* renamed from: j$.util.u */
/* loaded from: classes3.dex */
class C5308u implements Map, Serializable, Map {
    private static final long serialVersionUID = -1034234728574286014L;

    /* renamed from: a */
    private final Map f18752a;

    /* renamed from: b */
    private transient Set f18753b;

    /* renamed from: c */
    private transient Set f18754c;

    /* renamed from: d */
    private transient Collection f18755d;

    C5308u(Map map) {
        map.getClass();
        this.f18752a = map;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f18752a.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f18752a.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f18752a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f18752a.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f18752a.get(obj);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f18753b == null) {
            this.f18753b = DesugarCollections.unmodifiableSet(this.f18752a.keySet());
        }
        return this.f18753b;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f18754c == null) {
            this.f18754c = new C5306t(this.f18752a.entrySet());
        }
        return this.f18754c;
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f18755d == null) {
            this.f18755d = DesugarCollections.unmodifiableCollection(this.f18752a.values());
        }
        return this.f18755d;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj == this || this.f18752a.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f18752a.hashCode();
    }

    public final String toString() {
        return this.f18752a.toString();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        return Map.EL.getOrDefault(this.f18752a, obj, obj2);
    }

    @Override // java.util.Map, p256j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        Map.EL.m21275a(this.f18752a, biConsumer);
    }

    @Override // java.util.Map, p256j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException();
    }
}
