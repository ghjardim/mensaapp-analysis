package p178Z2;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: Z2.q */
/* loaded from: classes.dex */
public abstract class AbstractC3028q extends AbstractC3029r implements Map {
    /* renamed from: b */
    public abstract Map mo11026b();

    /* renamed from: c */
    public boolean m11027c(Object obj) {
        return AbstractC2992F.m10794b(this, obj);
    }

    @Override // java.util.Map
    public void clear() {
        mo11026b().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return mo11026b().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return mo11026b().containsValue(obj);
    }

    /* renamed from: d */
    public boolean m11028d(Object obj) {
        return AbstractC2992F.m10795c(this, obj);
    }

    /* renamed from: e */
    public int m11029e() {
        return AbstractC3006U.m10877d(entrySet());
    }

    @Override // java.util.Map
    public Set entrySet() {
        return mo11026b().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || mo11026b().equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return mo11026b().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return mo11026b().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mo11026b().isEmpty();
    }

    @Override // java.util.Map
    public Set keySet() {
        return mo11026b().keySet();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return mo11026b().put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        mo11026b().putAll(map);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return mo11026b().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return mo11026b().size();
    }

    @Override // java.util.Map
    public Collection values() {
        return mo11026b().values();
    }
}
