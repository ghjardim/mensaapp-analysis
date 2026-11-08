package p178Z2;

import com.google.android.gms.common.api.C3643a;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2924g;
import p178Z2.AbstractC3006U;

/* renamed from: Z2.F */
/* loaded from: classes.dex */
public abstract class AbstractC2992F {

    /* renamed from: Z2.F$a */
    public class a extends AbstractC3008W {
        public a(Iterator it) {
            super(it);
        }

        @Override // p178Z2.AbstractC3008W
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Object mo10792a(Map.Entry entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Z2.F$b */
    public static abstract class b implements InterfaceC2924g {

        /* renamed from: a */
        public static final b f9169a = new a("KEY", 0);

        /* renamed from: b */
        public static final b f9170b = new C7193b("VALUE", 1);

        /* renamed from: c */
        public static final /* synthetic */ b[] f9171c = m10807b();

        /* renamed from: Z2.F$b$a */
        public enum a extends b {
            public a(String str, int i7) {
                super(str, i7, null);
            }

            @Override // p171Y2.InterfaceC2924g
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* renamed from: Z2.F$b$b, reason: collision with other inner class name */
        public enum C7193b extends b {
            public C7193b(String str, int i7) {
                super(str, i7, null);
            }

            @Override // p171Y2.InterfaceC2924g
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        public b(String str, int i7) {
        }

        /* renamed from: b */
        public static /* synthetic */ b[] m10807b() {
            return new b[]{f9169a, f9170b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f9171c.clone();
        }

        public /* synthetic */ b(String str, int i7, AbstractC2991E abstractC2991E) {
            this(str, i7);
        }
    }

    /* renamed from: Z2.F$c */
    public static abstract class c extends AbstractC3006U.e {
        /* renamed from: a */
        public abstract Map mo10810a();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            mo10810a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return mo10810a().isEmpty();
        }

        @Override // p178Z2.AbstractC3006U.e, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) AbstractC2932o.m10572o(collection));
            } catch (UnsupportedOperationException unused) {
                return AbstractC3006U.m10883j(this, collection.iterator());
            }
        }

        @Override // p178Z2.AbstractC3006U.e, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) AbstractC2932o.m10572o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10880g = AbstractC3006U.m10880g(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        m10880g.add(((Map.Entry) obj).getKey());
                    }
                }
                return mo10810a().keySet().retainAll(m10880g);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return mo10810a().size();
        }
    }

    /* renamed from: Z2.F$d */
    public static class d extends AbstractC3006U.e {

        /* renamed from: a */
        public final Map f9172a;

        public d(Map map) {
            this.f9172a = (Map) AbstractC2932o.m10572o(map);
        }

        /* renamed from: a */
        public Map m10811a() {
            return this.f9172a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return m10811a().containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return m10811a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m10811a().size();
        }
    }

    /* renamed from: Z2.F$e */
    public static class e extends AbstractCollection {

        /* renamed from: a */
        public final Map f9173a;

        public e(Map map) {
            this.f9173a = (Map) AbstractC2932o.m10572o(map);
        }

        /* renamed from: a */
        public final Map m10812a() {
            return this.f9173a;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            m10812a().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return m10812a().containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return m10812a().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2992F.m10805m(m10812a().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry entry : m10812a().entrySet()) {
                    if (AbstractC2928k.m10550a(obj, entry.getValue())) {
                        m10812a().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            try {
                return super.removeAll((Collection) AbstractC2932o.m10572o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10879f = AbstractC3006U.m10879f();
                for (Map.Entry entry : m10812a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m10879f.add(entry.getKey());
                    }
                }
                return m10812a().keySet().removeAll(m10879f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            try {
                return super.retainAll((Collection) AbstractC2932o.m10572o(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet m10879f = AbstractC3006U.m10879f();
                for (Map.Entry entry : m10812a().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        m10879f.add(entry.getKey());
                    }
                }
                return m10812a().keySet().retainAll(m10879f);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return m10812a().size();
        }
    }

    /* renamed from: Z2.F$f */
    public static abstract class f extends AbstractMap {

        /* renamed from: a */
        public transient Set f9174a;

        /* renamed from: b */
        public transient Collection f9175b;

        /* renamed from: a */
        public abstract Set mo10813a();

        /* renamed from: b */
        public Collection m10814b() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set entrySet() {
            Set set = this.f9174a;
            if (set != null) {
                return set;
            }
            Set mo10813a = mo10813a();
            this.f9174a = mo10813a;
            return mo10813a;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection values() {
            Collection collection = this.f9175b;
            if (collection != null) {
                return collection;
            }
            Collection m10814b = m10814b();
            this.f9175b = m10814b;
            return m10814b;
        }
    }

    /* renamed from: a */
    public static int m10793a(int i7) {
        if (i7 >= 3) {
            return i7 < 1073741824 ? (int) Math.ceil(i7 / 0.75d) : C3643a.e.API_PRIORITY_OTHER;
        }
        AbstractC3020i.m10943b(i7, "expectedSize");
        return i7 + 1;
    }

    /* renamed from: b */
    public static boolean m10794b(Map map, Object obj) {
        return AbstractC2988B.m10762d(m10805m(map.entrySet().iterator()), obj);
    }

    /* renamed from: c */
    public static boolean m10795c(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: d */
    public static Map.Entry m10796d(Object obj, Object obj2) {
        return new C3032u(obj, obj2);
    }

    /* renamed from: e */
    public static InterfaceC2924g m10797e() {
        return b.f9169a;
    }

    /* renamed from: f */
    public static HashMap m10798f(int i7) {
        return new HashMap(m10793a(i7));
    }

    /* renamed from: g */
    public static IdentityHashMap m10799g() {
        return new IdentityHashMap();
    }

    /* renamed from: h */
    public static boolean m10800h(Map map, Object obj) {
        AbstractC2932o.m10572o(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static Object m10801i(Map map, Object obj) {
        AbstractC2932o.m10572o(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static Object m10802j(Map map, Object obj) {
        AbstractC2932o.m10572o(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public static String m10803k(Map map) {
        StringBuilder m10946b = AbstractC3021j.m10946b(map.size());
        m10946b.append('{');
        boolean z6 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z6) {
                m10946b.append(", ");
            }
            m10946b.append(entry.getKey());
            m10946b.append('=');
            m10946b.append(entry.getValue());
            z6 = false;
        }
        m10946b.append('}');
        return m10946b.toString();
    }

    /* renamed from: l */
    public static InterfaceC2924g m10804l() {
        return b.f9170b;
    }

    /* renamed from: m */
    public static Iterator m10805m(Iterator it) {
        return new a(it);
    }
}
