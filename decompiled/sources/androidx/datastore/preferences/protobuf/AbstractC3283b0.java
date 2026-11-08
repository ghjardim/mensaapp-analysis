package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p207d.AbstractC4094d;
import p256j$.util.DesugarCollections;

/* renamed from: androidx.datastore.preferences.protobuf.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC3283b0 extends AbstractMap {

    /* renamed from: a */
    public List f10425a;

    /* renamed from: b */
    public Map f10426b;

    /* renamed from: c */
    public boolean f10427c;

    /* renamed from: d */
    public volatile f f10428d;

    /* renamed from: e */
    public Map f10429e;

    /* renamed from: f */
    public volatile c f10430f;

    /* renamed from: androidx.datastore.preferences.protobuf.b0$a */
    public class a extends AbstractC3283b0 {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3283b0
        /* renamed from: p */
        public void mo12311p() {
            if (!m12310o()) {
                if (m12306k() > 0) {
                    AbstractC4094d.m17162a(m12305j(0).getKey());
                    throw null;
                }
                Iterator it = m12308m().iterator();
                if (it.hasNext()) {
                    AbstractC4094d.m17162a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.mo12311p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m12312r((Comparable) obj, obj2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$c */
    public class c extends f {
        public c() {
            super(AbstractC3283b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC3283b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(AbstractC3283b0.this, null);
        }

        public /* synthetic */ c(AbstractC3283b0 abstractC3283b0, a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$d */
    public class d implements Map.Entry, Comparable {

        /* renamed from: a */
        public final Comparable f10435a;

        /* renamed from: b */
        public Object f10436b;

        public d(AbstractC3283b0 abstractC3283b0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m12317f(this.f10435a, entry.getKey()) && m12317f(this.f10436b, entry.getValue());
        }

        /* renamed from: f */
        public final boolean m12317f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f10435a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f10436b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f10435a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f10436b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC3283b0.this.m12302g();
            Object obj2 = this.f10436b;
            this.f10436b = obj;
            return obj2;
        }

        public String toString() {
            return this.f10435a + "=" + this.f10436b;
        }

        public d(Comparable comparable, Object obj) {
            this.f10435a = comparable;
            this.f10436b = obj;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$f */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC3283b0.this.m12312r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC3283b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC3283b0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(AbstractC3283b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC3283b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC3283b0.this.size();
        }

        public /* synthetic */ f(AbstractC3283b0 abstractC3283b0, a aVar) {
            this();
        }
    }

    public /* synthetic */ AbstractC3283b0(a aVar) {
        this();
    }

    /* renamed from: q */
    public static AbstractC3283b0 m12300q() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m12302g();
        if (!this.f10425a.isEmpty()) {
            this.f10425a.clear();
        }
        if (this.f10426b.isEmpty()) {
            return;
        }
        this.f10426b.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m12301f(comparable) >= 0 || this.f10426b.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f10428d == null) {
            this.f10428d = new f(this, null);
        }
        return this.f10428d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC3283b0)) {
            return super.equals(obj);
        }
        AbstractC3283b0 abstractC3283b0 = (AbstractC3283b0) obj;
        int size = size();
        if (size != abstractC3283b0.size()) {
            return false;
        }
        int m12306k = m12306k();
        if (m12306k != abstractC3283b0.m12306k()) {
            return entrySet().equals(abstractC3283b0.entrySet());
        }
        for (int i7 = 0; i7 < m12306k; i7++) {
            if (!m12305j(i7).equals(abstractC3283b0.m12305j(i7))) {
                return false;
            }
        }
        if (m12306k != size) {
            return this.f10426b.equals(abstractC3283b0.f10426b);
        }
        return true;
    }

    /* renamed from: f */
    public final int m12301f(Comparable comparable) {
        int i7;
        int size = this.f10425a.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((d) this.f10425a.get(i8)).getKey());
            if (compareTo > 0) {
                i7 = size + 1;
                return -i7;
            }
            if (compareTo == 0) {
                return i8;
            }
        }
        int i9 = 0;
        while (i9 <= i8) {
            int i10 = (i9 + i8) / 2;
            int compareTo2 = comparable.compareTo(((d) this.f10425a.get(i10)).getKey());
            if (compareTo2 < 0) {
                i8 = i10 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i10;
                }
                i9 = i10 + 1;
            }
        }
        i7 = i9 + 1;
        return -i7;
    }

    /* renamed from: g */
    public final void m12302g() {
        if (this.f10427c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m12301f = m12301f(comparable);
        return m12301f >= 0 ? ((d) this.f10425a.get(m12301f)).getValue() : this.f10426b.get(comparable);
    }

    /* renamed from: h */
    public Set m12303h() {
        if (this.f10430f == null) {
            this.f10430f = new c(this, null);
        }
        return this.f10430f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m12306k = m12306k();
        int i7 = 0;
        for (int i8 = 0; i8 < m12306k; i8++) {
            i7 += ((d) this.f10425a.get(i8)).hashCode();
        }
        return m12307l() > 0 ? i7 + this.f10426b.hashCode() : i7;
    }

    /* renamed from: i */
    public final void m12304i() {
        m12302g();
        if (!this.f10425a.isEmpty() || (this.f10425a instanceof ArrayList)) {
            return;
        }
        this.f10425a = new ArrayList(16);
    }

    /* renamed from: j */
    public Map.Entry m12305j(int i7) {
        return (Map.Entry) this.f10425a.get(i7);
    }

    /* renamed from: k */
    public int m12306k() {
        return this.f10425a.size();
    }

    /* renamed from: l */
    public int m12307l() {
        return this.f10426b.size();
    }

    /* renamed from: m */
    public Iterable m12308m() {
        return this.f10426b.isEmpty() ? Collections.emptySet() : this.f10426b.entrySet();
    }

    /* renamed from: n */
    public final SortedMap m12309n() {
        m12302g();
        if (this.f10426b.isEmpty() && !(this.f10426b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f10426b = treeMap;
            this.f10429e = treeMap.descendingMap();
        }
        return (SortedMap) this.f10426b;
    }

    /* renamed from: o */
    public boolean m12310o() {
        return this.f10427c;
    }

    /* renamed from: p */
    public void mo12311p() {
        if (this.f10427c) {
            return;
        }
        this.f10426b = this.f10426b.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f10426b);
        this.f10429e = this.f10429e.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f10429e);
        this.f10427c = true;
    }

    /* renamed from: r */
    public Object m12312r(Comparable comparable, Object obj) {
        m12302g();
        int m12301f = m12301f(comparable);
        if (m12301f >= 0) {
            return ((d) this.f10425a.get(m12301f)).setValue(obj);
        }
        m12304i();
        int i7 = -(m12301f + 1);
        if (i7 >= 16) {
            return m12309n().put(comparable, obj);
        }
        if (this.f10425a.size() == 16) {
            d dVar = (d) this.f10425a.remove(15);
            m12309n().put(dVar.getKey(), dVar.getValue());
        }
        this.f10425a.add(i7, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m12302g();
        Comparable comparable = (Comparable) obj;
        int m12301f = m12301f(comparable);
        if (m12301f >= 0) {
            return m12313s(m12301f);
        }
        if (this.f10426b.isEmpty()) {
            return null;
        }
        return this.f10426b.remove(comparable);
    }

    /* renamed from: s */
    public final Object m12313s(int i7) {
        m12302g();
        Object value = ((d) this.f10425a.remove(i7)).getValue();
        if (!this.f10426b.isEmpty()) {
            Iterator it = m12309n().entrySet().iterator();
            this.f10425a.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f10425a.size() + this.f10426b.size();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$b */
    public class b implements Iterator {

        /* renamed from: a */
        public int f10431a;

        /* renamed from: b */
        public Iterator f10432b;

        public b() {
            this.f10431a = AbstractC3283b0.this.f10425a.size();
        }

        /* renamed from: a */
        public final Iterator m12314a() {
            if (this.f10432b == null) {
                this.f10432b = AbstractC3283b0.this.f10429e.entrySet().iterator();
            }
            return this.f10432b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (m12314a().hasNext()) {
                return (Map.Entry) m12314a().next();
            }
            List list = AbstractC3283b0.this.f10425a;
            int i7 = this.f10431a - 1;
            this.f10431a = i7;
            return (Map.Entry) list.get(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f10431a;
            return (i7 > 0 && i7 <= AbstractC3283b0.this.f10425a.size()) || m12314a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(AbstractC3283b0 abstractC3283b0, a aVar) {
            this();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.b0$e */
    public class e implements Iterator {

        /* renamed from: a */
        public int f10438a;

        /* renamed from: b */
        public boolean f10439b;

        /* renamed from: c */
        public Iterator f10440c;

        public e() {
            this.f10438a = -1;
        }

        /* renamed from: a */
        public final Iterator m12319a() {
            if (this.f10440c == null) {
                this.f10440c = AbstractC3283b0.this.f10426b.entrySet().iterator();
            }
            return this.f10440c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f10439b = true;
            int i7 = this.f10438a + 1;
            this.f10438a = i7;
            return i7 < AbstractC3283b0.this.f10425a.size() ? (Map.Entry) AbstractC3283b0.this.f10425a.get(this.f10438a) : (Map.Entry) m12319a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10438a + 1 >= AbstractC3283b0.this.f10425a.size()) {
                return !AbstractC3283b0.this.f10426b.isEmpty() && m12319a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10439b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f10439b = false;
            AbstractC3283b0.this.m12302g();
            if (this.f10438a >= AbstractC3283b0.this.f10425a.size()) {
                m12319a().remove();
                return;
            }
            AbstractC3283b0 abstractC3283b0 = AbstractC3283b0.this;
            int i7 = this.f10438a;
            this.f10438a = i7 - 1;
            abstractC3283b0.m12313s(i7);
        }

        public /* synthetic */ e(AbstractC3283b0 abstractC3283b0, a aVar) {
            this();
        }
    }

    public AbstractC3283b0() {
        this.f10425a = Collections.emptyList();
        this.f10426b = Collections.emptyMap();
        this.f10429e = Collections.emptyMap();
    }
}
