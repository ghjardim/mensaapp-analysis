package p178Z2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p178Z2.AbstractC2995I;

/* renamed from: Z2.f */
/* loaded from: classes.dex */
public abstract class AbstractC3017f implements InterfaceC2993G {

    /* renamed from: a */
    public transient Collection f9262a;

    /* renamed from: b */
    public transient Set f9263b;

    /* renamed from: c */
    public transient Collection f9264c;

    /* renamed from: d */
    public transient Map f9265d;

    /* renamed from: Z2.f$a */
    public class a extends AbstractC2995I.b {
        public a() {
        }

        @Override // p178Z2.AbstractC2995I.b
        /* renamed from: a */
        public InterfaceC2993G mo10833a() {
            return AbstractC3017f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3017f.this.mo10903i();
        }
    }

    /* renamed from: Z2.f$b */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC3017f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC3017f.this.mo10941d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC3017f.this.mo10904j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC3017f.this.size();
        }
    }

    @Override // p178Z2.InterfaceC2993G
    /* renamed from: a */
    public Collection mo10815a() {
        Collection collection = this.f9262a;
        if (collection != null) {
            return collection;
        }
        Collection mo10901f = mo10901f();
        this.f9262a = mo10901f;
        return mo10901f;
    }

    @Override // p178Z2.InterfaceC2993G
    /* renamed from: b */
    public Map mo10816b() {
        Map map = this.f9265d;
        if (map != null) {
            return map;
        }
        Map mo10830e = mo10830e();
        this.f9265d = mo10830e;
        return mo10830e;
    }

    @Override // p178Z2.InterfaceC2993G
    /* renamed from: c */
    public boolean mo10817c(Object obj, Object obj2) {
        Collection collection = (Collection) mo10816b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    /* renamed from: d */
    public boolean mo10941d(Object obj) {
        Iterator it = mo10816b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract Map mo10830e();

    public boolean equals(Object obj) {
        return AbstractC2995I.m10827a(this, obj);
    }

    /* renamed from: f */
    public abstract Collection mo10901f();

    /* renamed from: g */
    public abstract Set mo10831g();

    /* renamed from: h */
    public abstract Collection mo10902h();

    public int hashCode() {
        return mo10816b().hashCode();
    }

    /* renamed from: i */
    public abstract Iterator mo10903i();

    /* renamed from: j */
    public abstract Iterator mo10904j();

    @Override // p178Z2.InterfaceC2993G
    public Set keySet() {
        Set set = this.f9263b;
        if (set != null) {
            return set;
        }
        Set mo10831g = mo10831g();
        this.f9263b = mo10831g;
        return mo10831g;
    }

    @Override // p178Z2.InterfaceC2993G
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) mo10816b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return mo10816b().toString();
    }

    @Override // p178Z2.InterfaceC2993G
    public Collection values() {
        Collection collection = this.f9264c;
        if (collection != null) {
            return collection;
        }
        Collection mo10902h = mo10902h();
        this.f9264c = mo10902h;
        return mo10902h;
    }
}
