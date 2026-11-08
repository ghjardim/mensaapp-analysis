package p256j$.util;

import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import p256j$.util.Map;
import p256j$.util.concurrent.AbstractC4988u;
import p256j$.util.concurrent.C4987t;
import p256j$.util.concurrent.InterfaceC4989v;

/* renamed from: j$.util.j */
/* loaded from: classes3.dex */
final class C5013j implements Map, Serializable, Map {
    private static final long serialVersionUID = 1978198479659022715L;

    /* renamed from: a */
    private final Map f18290a;

    /* renamed from: b */
    final Object f18291b = this;

    /* renamed from: c */
    private transient Set f18292c;

    /* renamed from: d */
    private transient Set f18293d;

    /* renamed from: e */
    private transient Collection f18294e;

    C5013j(Map map) {
        this.f18290a = (Map) Objects.requireNonNull(map);
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.f18291b) {
            size = this.f18290a.size();
        }
        return size;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f18291b) {
            isEmpty = this.f18290a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f18291b) {
            containsKey = this.f18290a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f18291b) {
            containsValue = this.f18290a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f18291b) {
            obj2 = this.f18290a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f18291b) {
            put = this.f18290a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f18291b) {
            remove = this.f18290a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.f18291b) {
            this.f18290a.putAll(map);
        }
    }

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.f18291b) {
            this.f18290a.clear();
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f18291b) {
            try {
                if (this.f18292c == null) {
                    this.f18292c = new C5017l(this.f18290a.keySet(), this.f18291b);
                }
                set = this.f18292c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f18291b) {
            try {
                if (this.f18293d == null) {
                    this.f18293d = new C5017l(this.f18290a.entrySet(), this.f18291b);
                }
                set = this.f18293d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.f18291b) {
            try {
                if (this.f18294e == null) {
                    this.f18294e = new C5009h(this.f18290a.values(), this.f18291b);
                }
                collection = this.f18294e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f18291b) {
            equals = this.f18290a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f18291b) {
            hashCode = this.f18290a.hashCode();
        }
        return hashCode;
    }

    public final String toString() {
        String obj;
        synchronized (this.f18291b) {
            obj = this.f18290a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object orDefault;
        synchronized (this.f18291b) {
            orDefault = Map.EL.getOrDefault(this.f18290a, obj, obj2);
        }
        return orDefault;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f18291b) {
            Map.EL.m21275a(this.f18290a, biConsumer);
        }
    }

    @Override // java.util.Map, p256j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f18291b) {
            java.util.Map map = this.f18290a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                C4987t c4987t = new C4987t(0, concurrentMap, biFunction);
                if (concurrentMap instanceof InterfaceC4989v) {
                    ((InterfaceC4989v) concurrentMap).forEach(c4987t);
                } else {
                    AbstractC4988u.m21339a(concurrentMap, c4987t);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object m21276b;
        synchronized (this.f18291b) {
            m21276b = Map.EL.m21276b(this.f18290a, obj, obj2);
        }
        return m21276b;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final boolean remove(Object obj, Object obj2) {
        boolean remove;
        synchronized (this.f18291b) {
            java.util.Map map = this.f18290a;
            remove = map instanceof Map ? ((Map) map).remove(obj, obj2) : Map.CC.$default$remove(map, obj, obj2);
        }
        return remove;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean replace;
        synchronized (this.f18291b) {
            java.util.Map map = this.f18290a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2, obj3) : Map.CC.$default$replace(map, obj, obj2, obj3);
        }
        return replace;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        Object replace;
        synchronized (this.f18291b) {
            java.util.Map map = this.f18290a;
            replace = map instanceof Map ? ((Map) map).replace(obj, obj2) : Map.CC.$default$replace(map, obj, obj2);
        }
        return replace;
    }

    @Override // java.util.Map, p256j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object computeIfAbsent;
        synchronized (this.f18291b) {
            computeIfAbsent = Map.EL.computeIfAbsent(this.f18290a, obj, function);
        }
        return computeIfAbsent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0032, code lost:
    
        r5 = r3;
     */
    @Override // java.util.Map, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r5, java.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f18291b
            monitor-enter(r0)
            java.util.Map r1 = r4.f18290a     // Catch: java.lang.Throwable -> L3c
            boolean r2 = r1 instanceof p256j$.util.Map     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L10
            j$.util.Map r1 = (p256j$.util.Map) r1     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r5 = r1.computeIfPresent(r5, r6)     // Catch: java.lang.Throwable -> L3c
            goto L3a
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L36
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L3c
            p256j$.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L3c
        L19:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L34
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L2c
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
            goto L32
        L2c:
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L3c
            if (r2 == 0) goto L19
        L32:
            r5 = r3
            goto L3a
        L34:
            r5 = 0
            goto L3a
        L36:
            java.lang.Object r5 = p256j$.util.Map.CC.$default$computeIfPresent(r1, r5, r6)     // Catch: java.lang.Throwable -> L3c
        L3a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            return r5
        L3c:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.C5013j.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        r5 = r3;
     */
    @Override // java.util.Map, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r5, java.util.function.BiFunction r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f18291b
            monitor-enter(r0)
            java.util.Map r1 = r4.f18290a     // Catch: java.lang.Throwable -> L41
            boolean r2 = r1 instanceof p256j$.util.Map     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L10
            j$.util.Map r1 = (p256j$.util.Map) r1     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r1.compute(r5, r6)     // Catch: java.lang.Throwable -> L41
            goto L3f
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L3b
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L41
        L16:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L41
        L1a:
            java.lang.Object r3 = r6.apply(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L31
            if (r2 == 0) goto L2a
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L28:
            r5 = r3
            goto L3f
        L2a:
            java.lang.Object r2 = r1.putIfAbsent(r5, r3)     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L1a
            goto L28
        L31:
            if (r2 == 0) goto L39
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L16
        L39:
            r5 = 0
            goto L3f
        L3b:
            java.lang.Object r5 = p256j$.util.Map.CC.$default$compute(r1, r5, r6)     // Catch: java.lang.Throwable -> L41
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            return r5
        L41:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.C5013j.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0022, code lost:
    
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0026, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r1.remove(r5, r2) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0036, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002c, code lost:
    
        if (r1.replace(r5, r2, r3) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002e, code lost:
    
        r6 = r3;
     */
    @Override // java.util.Map, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, java.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f18291b
            monitor-enter(r0)
            java.util.Map r1 = r4.f18290a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof p256j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (p256j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            p256j$.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            p256j$.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = p256j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.C5013j.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f18291b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
