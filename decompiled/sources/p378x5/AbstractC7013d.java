package p378x5;

import com.google.android.gms.common.api.C3643a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;

/* renamed from: x5.d */
/* loaded from: classes2.dex */
public abstract class AbstractC7013d extends AbstractC7011b implements List, InterfaceC0834a {

    /* renamed from: a */
    public static final a f25070a = new a(null);

    /* renamed from: x5.d$a */
    public static final class a {
        public /* synthetic */ a(AbstractC5464g abstractC5464g) {
            this();
        }

        /* renamed from: a */
        public final void m28767a(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("startIndex: " + i7 + ", endIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("startIndex: " + i7 + " > endIndex: " + i8);
        }

        /* renamed from: b */
        public final void m28768b(int i7, int i8) {
            if (i7 < 0 || i7 >= i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        /* renamed from: c */
        public final void m28769c(int i7, int i8) {
            if (i7 < 0 || i7 > i8) {
                throw new IndexOutOfBoundsException("index: " + i7 + ", size: " + i8);
            }
        }

        /* renamed from: d */
        public final void m28770d(int i7, int i8, int i9) {
            if (i7 < 0 || i8 > i9) {
                throw new IndexOutOfBoundsException("fromIndex: " + i7 + ", toIndex: " + i8 + ", size: " + i9);
            }
            if (i7 <= i8) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i7 + " > toIndex: " + i8);
        }

        /* renamed from: e */
        public final int m28771e(int i7, int i8) {
            int i9 = i7 + (i7 >> 1);
            if (i9 - i8 < 0) {
                i9 = i8;
            }
            if (i9 - 2147483639 <= 0) {
                return i9;
            }
            if (i8 > 2147483639) {
                return C3643a.e.API_PRIORITY_OTHER;
            }
            return 2147483639;
        }

        /* renamed from: f */
        public final boolean m28772f(Collection c7, Collection other) {
            AbstractC5469l.m23028e(c7, "c");
            AbstractC5469l.m23028e(other, "other");
            if (c7.size() != other.size()) {
                return false;
            }
            Iterator it = other.iterator();
            Iterator it2 = c7.iterator();
            while (it2.hasNext()) {
                if (!AbstractC5469l.m23024a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: g */
        public final int m28773g(Collection c7) {
            AbstractC5469l.m23028e(c7, "c");
            Iterator it = c7.iterator();
            int i7 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i7 = (i7 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i7;
        }

        public a() {
        }
    }

    /* renamed from: x5.d$b */
    public class b implements Iterator, InterfaceC0834a {

        /* renamed from: a */
        public int f25071a;

        public b() {
        }

        /* renamed from: a */
        public final int m28774a() {
            return this.f25071a;
        }

        /* renamed from: c */
        public final void m28775c(int i7) {
            this.f25071a = i7;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25071a < AbstractC7013d.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC7013d abstractC7013d = AbstractC7013d.this;
            int i7 = this.f25071a;
            this.f25071a = i7 + 1;
            return abstractC7013d.get(i7);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: x5.d$c */
    public class c extends b implements ListIterator, InterfaceC0834a {
        public c(int i7) {
            super();
            AbstractC7013d.f25070a.m28769c(i7, AbstractC7013d.this.size());
            m28775c(i7);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return m28774a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return m28774a();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC7013d abstractC7013d = AbstractC7013d.this;
            m28775c(m28774a() - 1);
            return abstractC7013d.get(m28774a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return m28774a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: x5.d$d */
    public static final class d extends AbstractC7013d implements RandomAccess {

        /* renamed from: b */
        public final AbstractC7013d f25074b;

        /* renamed from: c */
        public final int f25075c;

        /* renamed from: d */
        public int f25076d;

        public d(AbstractC7013d list, int i7, int i8) {
            AbstractC5469l.m23028e(list, "list");
            this.f25074b = list;
            this.f25075c = i7;
            AbstractC7013d.f25070a.m28770d(i7, i8, list.size());
            this.f25076d = i8 - i7;
        }

        @Override // p378x5.AbstractC7011b
        /* renamed from: b */
        public int mo240b() {
            return this.f25076d;
        }

        @Override // p378x5.AbstractC7013d, java.util.List
        public Object get(int i7) {
            AbstractC7013d.f25070a.m28768b(i7, this.f25076d);
            return this.f25074b.get(this.f25075c + i7);
        }
    }

    @Override // java.util.List
    public void add(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i7, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f25070a.m28772f(this, (Collection) obj);
        }
        return false;
    }

    public abstract Object get(int i7);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f25070a.m28773g(this);
    }

    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (AbstractC5469l.m23024a(it.next(), obj)) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (AbstractC5469l.m23024a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new c(0);
    }

    @Override // java.util.List
    public Object remove(int i7) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i7, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i7, int i8) {
        return new d(this, i7, i8);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i7) {
        return new c(i7);
    }
}
