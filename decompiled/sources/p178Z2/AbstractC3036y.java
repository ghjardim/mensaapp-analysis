package p178Z2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p256j$.util.Objects;

/* renamed from: Z2.y */
/* loaded from: classes.dex */
public abstract class AbstractC3036y extends AbstractC3018g implements Serializable {

    /* renamed from: e */
    public final transient AbstractC3035x f9325e;

    /* renamed from: f */
    public final transient int f9326f;

    /* renamed from: Z2.y$a */
    public class a extends AbstractC3010Y {

        /* renamed from: a */
        public final Iterator f9327a;

        /* renamed from: b */
        public Object f9328b = null;

        /* renamed from: c */
        public Iterator f9329c = AbstractC2988B.m10764f();

        public a() {
            this.f9327a = AbstractC3036y.this.f9325e.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!this.f9329c.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f9327a.next();
                this.f9328b = entry.getKey();
                this.f9329c = ((AbstractC3031t) entry.getValue()).iterator();
            }
            Object obj = this.f9328b;
            Objects.requireNonNull(obj);
            return AbstractC2992F.m10796d(obj, this.f9329c.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9329c.hasNext() || this.f9327a.hasNext();
        }
    }

    /* renamed from: Z2.y$b */
    public class b extends AbstractC3010Y {

        /* renamed from: a */
        public Iterator f9331a;

        /* renamed from: b */
        public Iterator f9332b = AbstractC2988B.m10764f();

        public b() {
            this.f9331a = AbstractC3036y.this.f9325e.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9332b.hasNext() || this.f9331a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f9332b.hasNext()) {
                this.f9332b = ((AbstractC3031t) this.f9331a.next()).iterator();
            }
            return this.f9332b.next();
        }
    }

    /* renamed from: Z2.y$c */
    public static class c {

        /* renamed from: a */
        public final Map f9334a = AbstractC3000N.m10851d();

        /* renamed from: b */
        public Comparator f9335b;

        /* renamed from: c */
        public Comparator f9336c;

        /* renamed from: a */
        public AbstractC3036y m11099a() {
            Collection entrySet = this.f9334a.entrySet();
            Comparator comparator = this.f9335b;
            if (comparator != null) {
                entrySet = AbstractC2999M.m10842b(comparator).m10846e().m10845c(entrySet);
            }
            return C3034w.m11064s(entrySet, this.f9336c);
        }

        /* renamed from: b */
        public Collection m11100b() {
            return new ArrayList();
        }

        /* renamed from: c */
        public c m11101c(Object obj, Object obj2) {
            AbstractC3020i.m10942a(obj, obj2);
            Collection collection = (Collection) this.f9334a.get(obj);
            if (collection == null) {
                Map map = this.f9334a;
                Collection m11100b = m11100b();
                map.put(obj, m11100b);
                collection = m11100b;
            }
            collection.add(obj2);
            return this;
        }
    }

    /* renamed from: Z2.y$d */
    public static class d extends AbstractC3031t {

        /* renamed from: b */
        public final AbstractC3036y f9337b;

        public d(AbstractC3036y abstractC3036y) {
            this.f9337b = abstractC3036y;
        }

        @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f9337b.mo10817c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: i */
        public AbstractC3010Y iterator() {
            return this.f9337b.mo10903i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f9337b.size();
        }
    }

    /* renamed from: Z2.y$e */
    public static final class e extends AbstractC3031t {

        /* renamed from: b */
        public final transient AbstractC3036y f9338b;

        public e(AbstractC3036y abstractC3036y) {
            this.f9338b = abstractC3036y;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: b */
        public int mo10852b(Object[] objArr, int i7) {
            AbstractC3010Y it = this.f9338b.f9325e.values().iterator();
            while (it.hasNext()) {
                i7 = ((AbstractC3031t) it.next()).mo10852b(objArr, i7);
            }
            return i7;
        }

        @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9338b.mo10941d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: i */
        public AbstractC3010Y iterator() {
            return this.f9338b.mo10904j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f9338b.size();
        }
    }

    public AbstractC3036y(AbstractC3035x abstractC3035x, int i7) {
        this.f9325e = abstractC3035x;
        this.f9326f = i7;
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: c */
    public /* bridge */ /* synthetic */ boolean mo10817c(Object obj, Object obj2) {
        return super.mo10817c(obj, obj2);
    }

    @Override // p178Z2.InterfaceC2993G
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: d */
    public boolean mo10941d(Object obj) {
        return obj != null && super.mo10941d(obj);
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: e */
    public Map mo10830e() {
        throw new AssertionError("should never be called");
    }

    @Override // p178Z2.AbstractC3017f
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: g */
    public Set mo10831g() {
        throw new AssertionError("unreachable");
    }

    @Override // p178Z2.AbstractC3017f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public AbstractC3035x mo10816b() {
        return this.f9325e;
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public AbstractC3031t mo10901f() {
        return new d(this);
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public AbstractC3031t mo10902h() {
        return new e(this);
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC3031t mo10815a() {
        return (AbstractC3031t) super.mo10815a();
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public AbstractC3010Y mo10903i() {
        return new a();
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC3037z keySet() {
        return this.f9325e.keySet();
    }

    @Override // p178Z2.InterfaceC2993G
    public final boolean put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p178Z2.AbstractC3017f
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public AbstractC3010Y mo10904j() {
        return new b();
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public AbstractC3031t values() {
        return (AbstractC3031t) super.values();
    }

    @Override // p178Z2.AbstractC3017f, p178Z2.InterfaceC2993G
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // p178Z2.InterfaceC2993G
    public int size() {
        return this.f9326f;
    }

    @Override // p178Z2.AbstractC3017f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
