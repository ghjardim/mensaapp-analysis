package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.y0 */
/* loaded from: classes.dex */
public class C4088y0 extends AbstractList implements InterfaceC4023J, RandomAccess {

    /* renamed from: a */
    public final InterfaceC4023J f13607a;

    /* renamed from: com.google.protobuf.y0$a */
    public class a implements ListIterator {

        /* renamed from: a */
        public ListIterator f13608a;

        /* renamed from: b */
        public final /* synthetic */ int f13609b;

        public a(int i7) {
            this.f13609b = i7;
            this.f13608a = C4088y0.this.f13607a.listIterator(i7);
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f13608a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f13608a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f13608a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f13608a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f13608a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f13608a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.y0$b */
    public class b implements Iterator {

        /* renamed from: a */
        public Iterator f13611a;

        public b() {
            this.f13611a = C4088y0.this.f13607a.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f13611a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13611a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C4088y0(InterfaceC4023J interfaceC4023J) {
        this.f13607a = interfaceC4023J;
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: K */
    public List mo16257K() {
        return this.f13607a.mo16257K();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String get(int i7) {
        return (String) this.f13607a.get(i7);
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: c0 */
    public InterfaceC4023J mo16259c0() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: l0 */
    public Object mo16264l0(int i7) {
        return this.f13607a.mo16264l0(i7);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i7) {
        return new a(i7);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f13607a.size();
    }

    @Override // com.google.protobuf.InterfaceC4023J
    /* renamed from: v */
    public void mo16265v(AbstractC4055i abstractC4055i) {
        throw new UnsupportedOperationException();
    }
}
