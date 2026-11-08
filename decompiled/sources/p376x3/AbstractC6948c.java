package p376x3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p376x3.AbstractC6948c;

/* renamed from: x3.c */
/* loaded from: classes.dex */
public abstract class AbstractC6948c implements Iterable {
    /* renamed from: a */
    public abstract boolean mo28450a(Object obj);

    /* renamed from: b */
    public abstract Object mo28451b(Object obj);

    /* renamed from: e */
    public abstract Comparator mo28452e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC6948c)) {
            return false;
        }
        AbstractC6948c abstractC6948c = (AbstractC6948c) obj;
        if (!mo28452e().equals(abstractC6948c.mo28452e()) || size() != abstractC6948c.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = abstractC6948c.iterator();
        while (it.hasNext()) {
            if (!((Map.Entry) it.next()).equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Object mo28453f();

    /* renamed from: g */
    public abstract Object mo28454g();

    /* renamed from: h */
    public abstract AbstractC6948c mo28455h(Object obj, Object obj2);

    public int hashCode() {
        int hashCode = mo28452e().hashCode();
        Iterator it = iterator();
        while (it.hasNext()) {
            hashCode = (hashCode * 31) + ((Map.Entry) it.next()).hashCode();
        }
        return hashCode;
    }

    /* renamed from: i */
    public abstract Iterator mo28456i(Object obj);

    public abstract int indexOf(Object obj);

    public abstract boolean isEmpty();

    @Override // java.lang.Iterable
    public abstract Iterator iterator();

    /* renamed from: k */
    public abstract AbstractC6948c mo28457k(Object obj);

    public abstract int size();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{");
        Iterator it = iterator();
        boolean z6 = true;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z6) {
                z6 = false;
            } else {
                sb.append(", ");
            }
            sb.append("(");
            sb.append(entry.getKey());
            sb.append("=>");
            sb.append(entry.getValue());
            sb.append(")");
        }
        sb.append("};");
        return sb.toString();
    }

    /* renamed from: x3.c$a */
    public static class a {

        /* renamed from: a */
        public static final InterfaceC7243a f24859a = new InterfaceC7243a() { // from class: x3.b
            @Override // p376x3.AbstractC6948c.a.InterfaceC7243a
            /* renamed from: a */
            public final Object mo28462a(Object obj) {
                Object m28467e;
                m28467e = AbstractC6948c.a.m28467e(obj);
                return m28467e;
            }
        };

        /* renamed from: x3.c$a$a, reason: collision with other inner class name */
        public interface InterfaceC7243a {
            /* renamed from: a */
            Object mo28462a(Object obj);
        }

        /* renamed from: b */
        public static AbstractC6948c m28464b(List list, Map map, InterfaceC7243a interfaceC7243a, Comparator comparator) {
            return list.size() < 25 ? C6946a.m28447o(list, map, interfaceC7243a, comparator) : C6956k.m28496l(list, map, interfaceC7243a, comparator);
        }

        /* renamed from: c */
        public static AbstractC6948c m28465c(Comparator comparator) {
            return new C6946a(comparator);
        }

        /* renamed from: d */
        public static InterfaceC7243a m28466d() {
            return f24859a;
        }

        /* renamed from: e */
        public static /* synthetic */ Object m28467e(Object obj) {
            return obj;
        }
    }
}
