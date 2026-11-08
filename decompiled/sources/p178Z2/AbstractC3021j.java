package p178Z2;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import p171Y2.AbstractC2932o;
import p171Y2.InterfaceC2933p;

/* renamed from: Z2.j */
/* loaded from: classes.dex */
public abstract class AbstractC3021j {

    /* renamed from: Z2.j$a */
    public static class a extends AbstractCollection {

        /* renamed from: a */
        public final Collection f9270a;

        /* renamed from: b */
        public final InterfaceC2933p f9271b;

        public a(Collection collection, InterfaceC2933p interfaceC2933p) {
            this.f9270a = collection;
            this.f9271b = interfaceC2933p;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(Object obj) {
            AbstractC2932o.m10561d(this.f9271b.apply(obj));
            return this.f9270a.add(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AbstractC2932o.m10561d(this.f9271b.apply(it.next()));
            }
            return this.f9270a.addAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC2987A.m10755h(this.f9270a, this.f9271b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (AbstractC3021j.m10947c(this.f9270a, obj)) {
                return this.f9271b.apply(obj);
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC3021j.m10945a(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return !AbstractC2987A.m10748a(this.f9270a, this.f9271b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC2988B.m10767i(this.f9270a.iterator(), this.f9271b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            return contains(obj) && this.f9270a.remove(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection collection) {
            Iterator it = this.f9270a.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f9271b.apply(next) && collection.contains(next)) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection collection) {
            Iterator it = this.f9270a.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f9271b.apply(next) && !collection.contains(next)) {
                    it.remove();
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            Iterator it = this.f9270a.iterator();
            int i7 = 0;
            while (it.hasNext()) {
                if (this.f9271b.apply(it.next())) {
                    i7++;
                }
            }
            return i7;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return AbstractC2990D.m10789i(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC2990D.m10789i(iterator()).toArray(objArr);
        }
    }

    /* renamed from: a */
    public static boolean m10945a(Collection collection, Collection collection2) {
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static StringBuilder m10946b(int i7) {
        AbstractC3020i.m10943b(i7, "size");
        return new StringBuilder((int) Math.min(i7 * 8, 1073741824L));
    }

    /* renamed from: c */
    public static boolean m10947c(Collection collection, Object obj) {
        AbstractC2932o.m10572o(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
