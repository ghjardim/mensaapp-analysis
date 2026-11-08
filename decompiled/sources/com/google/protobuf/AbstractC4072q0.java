package com.google.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p207d.AbstractC4094d;
import p256j$.util.DesugarCollections;

/* renamed from: com.google.protobuf.q0 */
/* loaded from: classes.dex */
public abstract class AbstractC4072q0 extends AbstractMap {

    /* renamed from: a */
    public final int f13489a;

    /* renamed from: b */
    public List f13490b;

    /* renamed from: c */
    public Map f13491c;

    /* renamed from: d */
    public boolean f13492d;

    /* renamed from: e */
    public volatile g f13493e;

    /* renamed from: f */
    public Map f13494f;

    /* renamed from: n */
    public volatile c f13495n;

    /* renamed from: com.google.protobuf.q0$a */
    public class a extends AbstractC4072q0 {
        public a(int i7) {
            super(i7, null);
        }

        @Override // com.google.protobuf.AbstractC4072q0
        /* renamed from: p */
        public void mo16896p() {
            if (!m16895o()) {
                if (m16891k() > 0) {
                    AbstractC4094d.m17162a(m16890j(0).getKey());
                    throw null;
                }
                Iterator it = m16893m().iterator();
                if (it.hasNext()) {
                    AbstractC4094d.m17162a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.mo16896p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.m16897r((Comparable) obj, obj2);
        }
    }

    /* renamed from: com.google.protobuf.q0$c */
    public class c extends g {
        public c() {
            super(AbstractC4072q0.this, null);
        }

        @Override // com.google.protobuf.AbstractC4072q0.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(AbstractC4072q0.this, null);
        }

        public /* synthetic */ c(AbstractC4072q0 abstractC4072q0, a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.q0$d */
    public static class d {

        /* renamed from: a */
        public static final Iterator f13500a = new a();

        /* renamed from: b */
        public static final Iterable f13501b = new b();

        /* renamed from: com.google.protobuf.q0$d$a */
        public class a implements Iterator {
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.google.protobuf.q0$d$b */
        public class b implements Iterable {
            @Override // java.lang.Iterable
            public Iterator iterator() {
                return d.f13500a;
            }
        }

        /* renamed from: b */
        public static Iterable m16902b() {
            return f13501b;
        }
    }

    /* renamed from: com.google.protobuf.q0$e */
    public class e implements Map.Entry, Comparable {

        /* renamed from: a */
        public final Comparable f13502a;

        /* renamed from: b */
        public Object f13503b;

        public e(AbstractC4072q0 abstractC4072q0, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return getKey().compareTo(eVar.getKey());
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
            return m16904f(this.f13502a, entry.getKey()) && m16904f(this.f13503b, entry.getValue());
        }

        /* renamed from: f */
        public final boolean m16904f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f13502a;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f13503b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f13502a;
            int hashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f13503b;
            return hashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            AbstractC4072q0.this.m16887g();
            Object obj2 = this.f13503b;
            this.f13503b = obj;
            return obj2;
        }

        public String toString() {
            return this.f13502a + "=" + this.f13503b;
        }

        public e(Comparable comparable, Object obj) {
            this.f13502a = comparable;
            this.f13503b = obj;
        }
    }

    /* renamed from: com.google.protobuf.q0$g */
    public class g extends AbstractSet {
        public g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            AbstractC4072q0.this.m16897r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC4072q0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = AbstractC4072q0.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new f(AbstractC4072q0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            AbstractC4072q0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractC4072q0.this.size();
        }

        public /* synthetic */ g(AbstractC4072q0 abstractC4072q0, a aVar) {
            this();
        }
    }

    public /* synthetic */ AbstractC4072q0(int i7, a aVar) {
        this(i7);
    }

    /* renamed from: q */
    public static AbstractC4072q0 m16885q(int i7) {
        return new a(i7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m16887g();
        if (!this.f13490b.isEmpty()) {
            this.f13490b.clear();
        }
        if (this.f13491c.isEmpty()) {
            return;
        }
        this.f13491c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m16886f(comparable) >= 0 || this.f13491c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f13493e == null) {
            this.f13493e = new g(this, null);
        }
        return this.f13493e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC4072q0)) {
            return super.equals(obj);
        }
        AbstractC4072q0 abstractC4072q0 = (AbstractC4072q0) obj;
        int size = size();
        if (size != abstractC4072q0.size()) {
            return false;
        }
        int m16891k = m16891k();
        if (m16891k != abstractC4072q0.m16891k()) {
            return entrySet().equals(abstractC4072q0.entrySet());
        }
        for (int i7 = 0; i7 < m16891k; i7++) {
            if (!m16890j(i7).equals(abstractC4072q0.m16890j(i7))) {
                return false;
            }
        }
        if (m16891k != size) {
            return this.f13491c.equals(abstractC4072q0.f13491c);
        }
        return true;
    }

    /* renamed from: f */
    public final int m16886f(Comparable comparable) {
        int i7;
        int size = this.f13490b.size();
        int i8 = size - 1;
        if (i8 >= 0) {
            int compareTo = comparable.compareTo(((e) this.f13490b.get(i8)).getKey());
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
            int compareTo2 = comparable.compareTo(((e) this.f13490b.get(i10)).getKey());
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
    public final void m16887g() {
        if (this.f13492d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int m16886f = m16886f(comparable);
        return m16886f >= 0 ? ((e) this.f13490b.get(m16886f)).getValue() : this.f13491c.get(comparable);
    }

    /* renamed from: h */
    public Set m16888h() {
        if (this.f13495n == null) {
            this.f13495n = new c(this, null);
        }
        return this.f13495n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m16891k = m16891k();
        int i7 = 0;
        for (int i8 = 0; i8 < m16891k; i8++) {
            i7 += ((e) this.f13490b.get(i8)).hashCode();
        }
        return m16892l() > 0 ? i7 + this.f13491c.hashCode() : i7;
    }

    /* renamed from: i */
    public final void m16889i() {
        m16887g();
        if (!this.f13490b.isEmpty() || (this.f13490b instanceof ArrayList)) {
            return;
        }
        this.f13490b = new ArrayList(this.f13489a);
    }

    /* renamed from: j */
    public Map.Entry m16890j(int i7) {
        return (Map.Entry) this.f13490b.get(i7);
    }

    /* renamed from: k */
    public int m16891k() {
        return this.f13490b.size();
    }

    /* renamed from: l */
    public int m16892l() {
        return this.f13491c.size();
    }

    /* renamed from: m */
    public Iterable m16893m() {
        return this.f13491c.isEmpty() ? d.m16902b() : this.f13491c.entrySet();
    }

    /* renamed from: n */
    public final SortedMap m16894n() {
        m16887g();
        if (this.f13491c.isEmpty() && !(this.f13491c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13491c = treeMap;
            this.f13494f = treeMap.descendingMap();
        }
        return (SortedMap) this.f13491c;
    }

    /* renamed from: o */
    public boolean m16895o() {
        return this.f13492d;
    }

    /* renamed from: p */
    public void mo16896p() {
        if (this.f13492d) {
            return;
        }
        this.f13491c = this.f13491c.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f13491c);
        this.f13494f = this.f13494f.isEmpty() ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(this.f13494f);
        this.f13492d = true;
    }

    /* renamed from: r */
    public Object m16897r(Comparable comparable, Object obj) {
        m16887g();
        int m16886f = m16886f(comparable);
        if (m16886f >= 0) {
            return ((e) this.f13490b.get(m16886f)).setValue(obj);
        }
        m16889i();
        int i7 = -(m16886f + 1);
        if (i7 >= this.f13489a) {
            return m16894n().put(comparable, obj);
        }
        int size = this.f13490b.size();
        int i8 = this.f13489a;
        if (size == i8) {
            e eVar = (e) this.f13490b.remove(i8 - 1);
            m16894n().put(eVar.getKey(), eVar.getValue());
        }
        this.f13490b.add(i7, new e(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m16887g();
        Comparable comparable = (Comparable) obj;
        int m16886f = m16886f(comparable);
        if (m16886f >= 0) {
            return m16898s(m16886f);
        }
        if (this.f13491c.isEmpty()) {
            return null;
        }
        return this.f13491c.remove(comparable);
    }

    /* renamed from: s */
    public final Object m16898s(int i7) {
        m16887g();
        Object value = ((e) this.f13490b.remove(i7)).getValue();
        if (!this.f13491c.isEmpty()) {
            Iterator it = m16894n().entrySet().iterator();
            this.f13490b.add(new e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13490b.size() + this.f13491c.size();
    }

    /* renamed from: com.google.protobuf.q0$b */
    public class b implements Iterator {

        /* renamed from: a */
        public int f13496a;

        /* renamed from: b */
        public Iterator f13497b;

        public b() {
            this.f13496a = AbstractC4072q0.this.f13490b.size();
        }

        /* renamed from: a */
        public final Iterator m16899a() {
            if (this.f13497b == null) {
                this.f13497b = AbstractC4072q0.this.f13494f.entrySet().iterator();
            }
            return this.f13497b;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (m16899a().hasNext()) {
                return (Map.Entry) m16899a().next();
            }
            List list = AbstractC4072q0.this.f13490b;
            int i7 = this.f13496a - 1;
            this.f13496a = i7;
            return (Map.Entry) list.get(i7);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i7 = this.f13496a;
            return (i7 > 0 && i7 <= AbstractC4072q0.this.f13490b.size()) || m16899a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(AbstractC4072q0 abstractC4072q0, a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.q0$f */
    public class f implements Iterator {

        /* renamed from: a */
        public int f13505a;

        /* renamed from: b */
        public boolean f13506b;

        /* renamed from: c */
        public Iterator f13507c;

        public f() {
            this.f13505a = -1;
        }

        /* renamed from: a */
        public final Iterator m16906a() {
            if (this.f13507c == null) {
                this.f13507c = AbstractC4072q0.this.f13491c.entrySet().iterator();
            }
            return this.f13507c;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f13506b = true;
            int i7 = this.f13505a + 1;
            this.f13505a = i7;
            return i7 < AbstractC4072q0.this.f13490b.size() ? (Map.Entry) AbstractC4072q0.this.f13490b.get(this.f13505a) : (Map.Entry) m16906a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13505a + 1 >= AbstractC4072q0.this.f13490b.size()) {
                return !AbstractC4072q0.this.f13491c.isEmpty() && m16906a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f13506b) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f13506b = false;
            AbstractC4072q0.this.m16887g();
            if (this.f13505a >= AbstractC4072q0.this.f13490b.size()) {
                m16906a().remove();
                return;
            }
            AbstractC4072q0 abstractC4072q0 = AbstractC4072q0.this;
            int i7 = this.f13505a;
            this.f13505a = i7 - 1;
            abstractC4072q0.m16898s(i7);
        }

        public /* synthetic */ f(AbstractC4072q0 abstractC4072q0, a aVar) {
            this();
        }
    }

    public AbstractC4072q0(int i7) {
        this.f13489a = i7;
        this.f13490b = Collections.emptyList();
        this.f13491c = Collections.emptyMap();
        this.f13494f = Collections.emptyMap();
    }
}
