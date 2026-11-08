package p256j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.k */
/* loaded from: classes3.dex */
final class C4978k implements Map.Entry {

    /* renamed from: a */
    final Object f18220a;

    /* renamed from: b */
    Object f18221b;

    /* renamed from: c */
    final ConcurrentHashMap f18222c;

    C4978k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f18220a = obj;
        this.f18221b = obj2;
        this.f18222c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f18220a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f18221b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f18220a.hashCode() ^ this.f18221b.hashCode();
    }

    public final String toString() {
        return AbstractC4988u.m21340b(this.f18220a, this.f18221b);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f18220a) || key.equals(obj2)) && (value == (obj3 = this.f18221b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f18221b;
        this.f18221b = obj;
        this.f18222c.put(this.f18220a, obj);
        return obj2;
    }
}
