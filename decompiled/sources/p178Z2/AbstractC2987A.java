package p178Z2;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2933p;

/* renamed from: Z2.A */
/* loaded from: classes.dex */
public abstract class AbstractC2987A {
    /* renamed from: a */
    public static boolean m10748a(Iterable iterable, InterfaceC2933p interfaceC2933p) {
        return AbstractC2988B.m10760b(iterable.iterator(), interfaceC2933p);
    }

    /* renamed from: b */
    public static Collection m10749b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : AbstractC2990D.m10789i(iterable.iterator());
    }

    /* renamed from: c */
    public static Object m10750c(Iterable iterable, Object obj) {
        return AbstractC2988B.m10771m(iterable.iterator(), obj);
    }

    /* renamed from: d */
    public static Object m10751d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return AbstractC2988B.m10769k(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return m10753f(list);
    }

    /* renamed from: e */
    public static Object m10752e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return m10753f(AbstractC2990D.m10781a(iterable));
            }
        }
        return AbstractC2988B.m10770l(iterable.iterator(), obj);
    }

    /* renamed from: f */
    public static Object m10753f(List list) {
        return list.get(list.size() - 1);
    }

    /* renamed from: g */
    public static Object m10754g(Iterable iterable) {
        return AbstractC2988B.m10772n(iterable.iterator());
    }

    /* renamed from: h */
    public static boolean m10755h(Iterable iterable, InterfaceC2933p interfaceC2933p) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? m10756i((List) iterable, (InterfaceC2933p) AbstractC2932o.m10572o(interfaceC2933p)) : AbstractC2988B.m10776r(iterable.iterator(), interfaceC2933p);
    }

    /* renamed from: i */
    public static boolean m10756i(List list, InterfaceC2933p interfaceC2933p) {
        int i7 = 0;
        int i8 = 0;
        while (i7 < list.size()) {
            Object obj = list.get(i7);
            if (!interfaceC2933p.apply(obj)) {
                if (i7 > i8) {
                    try {
                        list.set(i8, obj);
                    } catch (IllegalArgumentException unused) {
                        m10757j(list, interfaceC2933p, i8, i7);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        m10757j(list, interfaceC2933p, i8, i7);
                        return true;
                    }
                }
                i8++;
            }
            i7++;
        }
        list.subList(i8, list.size()).clear();
        return i7 != i8;
    }

    /* renamed from: j */
    public static void m10757j(List list, InterfaceC2933p interfaceC2933p, int i7, int i8) {
        for (int size = list.size() - 1; size > i8; size--) {
            if (interfaceC2933p.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i9 = i8 - 1; i9 >= i7; i9--) {
            list.remove(i9);
        }
    }

    /* renamed from: k */
    public static Object[] m10758k(Iterable iterable) {
        return m10749b(iterable).toArray();
    }
}
