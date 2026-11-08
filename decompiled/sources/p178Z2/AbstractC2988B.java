package p178Z2;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2933p;

/* renamed from: Z2.B */
/* loaded from: classes.dex */
public abstract class AbstractC2988B {

    /* renamed from: Z2.B$a */
    public class a extends AbstractC3013b {

        /* renamed from: c */
        public final /* synthetic */ Iterator f9155c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC2933p f9156d;

        public a(Iterator it, InterfaceC2933p interfaceC2933p) {
            this.f9155c = it;
            this.f9156d = interfaceC2933p;
        }

        @Override // p178Z2.AbstractC3013b
        /* renamed from: a */
        public Object mo10778a() {
            while (this.f9155c.hasNext()) {
                Object next = this.f9155c.next();
                if (this.f9156d.apply(next)) {
                    return next;
                }
            }
            return m10887c();
        }
    }

    /* renamed from: Z2.B$b */
    public static final class b extends AbstractC3012a {

        /* renamed from: d */
        public static final AbstractC3011Z f9157d = new b(new Object[0], 0);

        /* renamed from: c */
        public final Object[] f9158c;

        public b(Object[] objArr, int i7) {
            super(objArr.length, i7);
            this.f9158c = objArr;
        }

        @Override // p178Z2.AbstractC3012a
        /* renamed from: a */
        public Object mo10779a(int i7) {
            return this.f9158c[i7];
        }
    }

    /* renamed from: Z2.B$c */
    public enum c implements Iterator {
        INSTANCE;

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
            AbstractC3020i.m10944c(false);
        }
    }

    /* renamed from: Z2.B$d */
    public static final class d extends AbstractC3010Y {

        /* renamed from: b */
        public static final Object f9161b = new Object();

        /* renamed from: a */
        public Object f9162a;

        public d(Object obj) {
            this.f9162a = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9162a != f9161b;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object obj = this.f9162a;
            Object obj2 = f9161b;
            if (obj == obj2) {
                throw new NoSuchElementException();
            }
            this.f9162a = obj2;
            return obj;
        }
    }

    /* renamed from: a */
    public static boolean m10759a(Collection collection, Iterator it) {
        AbstractC2932o.m10572o(collection);
        AbstractC2932o.m10572o(it);
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= collection.add(it.next());
        }
        return z6;
    }

    /* renamed from: b */
    public static boolean m10760b(Iterator it, InterfaceC2933p interfaceC2933p) {
        return m10773o(it, interfaceC2933p) != -1;
    }

    /* renamed from: c */
    public static void m10761c(Iterator it) {
        AbstractC2932o.m10572o(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    /* renamed from: d */
    public static boolean m10762d(Iterator it, Object obj) {
        if (obj == null) {
            while (it.hasNext()) {
                if (it.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m10763e(Iterator it, Iterator it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !AbstractC2928k.m10550a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    /* renamed from: f */
    public static AbstractC3010Y m10764f() {
        return m10765g();
    }

    /* renamed from: g */
    public static AbstractC3011Z m10765g() {
        return b.f9157d;
    }

    /* renamed from: h */
    public static Iterator m10766h() {
        return c.INSTANCE;
    }

    /* renamed from: i */
    public static AbstractC3010Y m10767i(Iterator it, InterfaceC2933p interfaceC2933p) {
        AbstractC2932o.m10572o(it);
        AbstractC2932o.m10572o(interfaceC2933p);
        return new a(it, interfaceC2933p);
    }

    /* renamed from: j */
    public static Object m10768j(Iterator it, InterfaceC2933p interfaceC2933p) {
        AbstractC2932o.m10572o(it);
        AbstractC2932o.m10572o(interfaceC2933p);
        while (it.hasNext()) {
            Object next = it.next();
            if (interfaceC2933p.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: k */
    public static Object m10769k(Iterator it) {
        Object next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    /* renamed from: l */
    public static Object m10770l(Iterator it, Object obj) {
        return it.hasNext() ? m10769k(it) : obj;
    }

    /* renamed from: m */
    public static Object m10771m(Iterator it, Object obj) {
        return it.hasNext() ? it.next() : obj;
    }

    /* renamed from: n */
    public static Object m10772n(Iterator it) {
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i7 = 0; i7 < 4 && it.hasNext(); i7++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: o */
    public static int m10773o(Iterator it, InterfaceC2933p interfaceC2933p) {
        AbstractC2932o.m10573p(interfaceC2933p, "predicate");
        int i7 = 0;
        while (it.hasNext()) {
            if (interfaceC2933p.apply(it.next())) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: p */
    public static Object m10774p(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    /* renamed from: q */
    public static boolean m10775q(Iterator it, Collection collection) {
        AbstractC2932o.m10572o(collection);
        boolean z6 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: r */
    public static boolean m10776r(Iterator it, InterfaceC2933p interfaceC2933p) {
        AbstractC2932o.m10572o(interfaceC2933p);
        boolean z6 = false;
        while (it.hasNext()) {
            if (interfaceC2933p.apply(it.next())) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    /* renamed from: s */
    public static AbstractC3010Y m10777s(Object obj) {
        return new d(obj);
    }
}
