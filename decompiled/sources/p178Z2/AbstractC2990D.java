package p178Z2;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2924g;
import p203c3.AbstractC3577g;

/* renamed from: Z2.D */
/* loaded from: classes.dex */
public abstract class AbstractC2990D {

    /* renamed from: Z2.D$a */
    public static class a extends AbstractList implements RandomAccess, Serializable {

        /* renamed from: a */
        public final List f9163a;

        /* renamed from: b */
        public final InterfaceC2924g f9164b;

        /* renamed from: Z2.D$a$a, reason: collision with other inner class name */
        public class C7192a extends AbstractC3009X {
            public C7192a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p178Z2.AbstractC3008W
            /* renamed from: a */
            public Object mo10792a(Object obj) {
                return a.this.f9164b.apply(obj);
            }
        }

        public a(List list, InterfaceC2924g interfaceC2924g) {
            this.f9163a = (List) AbstractC2932o.m10572o(list);
            this.f9164b = (InterfaceC2924g) AbstractC2932o.m10572o(interfaceC2924g);
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i7) {
            return this.f9164b.apply(this.f9163a.get(i7));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.f9163a.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i7) {
            return new C7192a(this.f9163a.listIterator(i7));
        }

        @Override // java.util.AbstractList, java.util.List
        public Object remove(int i7) {
            return this.f9164b.apply(this.f9163a.remove(i7));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i7, int i8) {
            this.f9163a.subList(i7, i8).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9163a.size();
        }
    }

    /* renamed from: Z2.D$b */
    public static class b extends AbstractSequentialList implements Serializable {

        /* renamed from: a */
        public final List f9166a;

        /* renamed from: b */
        public final InterfaceC2924g f9167b;

        /* renamed from: Z2.D$b$a */
        public class a extends AbstractC3009X {
            public a(ListIterator listIterator) {
                super(listIterator);
            }

            @Override // p178Z2.AbstractC3008W
            /* renamed from: a */
            public Object mo10792a(Object obj) {
                return b.this.f9167b.apply(obj);
            }
        }

        public b(List list, InterfaceC2924g interfaceC2924g) {
            this.f9166a = (List) AbstractC2932o.m10572o(list);
            this.f9167b = (InterfaceC2924g) AbstractC2932o.m10572o(interfaceC2924g);
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator listIterator(int i7) {
            return new a(this.f9166a.listIterator(i7));
        }

        @Override // java.util.AbstractList
        public void removeRange(int i7, int i8) {
            this.f9166a.subList(i7, i8).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9166a.size();
        }
    }

    /* renamed from: a */
    public static List m10781a(Iterable iterable) {
        return (List) iterable;
    }

    /* renamed from: b */
    public static int m10782b(int i7) {
        AbstractC3020i.m10943b(i7, "arraySize");
        return AbstractC3577g.m14430m(i7 + 5 + (i7 / 10));
    }

    /* renamed from: c */
    public static boolean m10783c(List list, Object obj) {
        if (obj == AbstractC2932o.m10572o(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return AbstractC2988B.m10763e(list.iterator(), list2.iterator());
        }
        for (int i7 = 0; i7 < size; i7++) {
            if (!AbstractC2928k.m10550a(list.get(i7), list2.get(i7))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static int m10784d(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10785e(list, obj);
        }
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (AbstractC2928k.m10550a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static int m10785e(List list, Object obj) {
        int size = list.size();
        int i7 = 0;
        if (obj == null) {
            while (i7 < size) {
                if (list.get(i7) == null) {
                    return i7;
                }
                i7++;
            }
            return -1;
        }
        while (i7 < size) {
            if (obj.equals(list.get(i7))) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    /* renamed from: f */
    public static int m10786f(List list, Object obj) {
        if (list instanceof RandomAccess) {
            return m10787g(list, obj);
        }
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (AbstractC2928k.m10550a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* renamed from: g */
    public static int m10787g(List list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static ArrayList m10788h() {
        return new ArrayList();
    }

    /* renamed from: i */
    public static ArrayList m10789i(Iterator it) {
        ArrayList m10788h = m10788h();
        AbstractC2988B.m10759a(m10788h, it);
        return m10788h;
    }

    /* renamed from: j */
    public static ArrayList m10790j(Object... objArr) {
        AbstractC2932o.m10572o(objArr);
        ArrayList arrayList = new ArrayList(m10782b(objArr.length));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* renamed from: k */
    public static List m10791k(List list, InterfaceC2924g interfaceC2924g) {
        return list instanceof RandomAccess ? new a(list, interfaceC2924g) : new b(list, interfaceC2924g);
    }
}
