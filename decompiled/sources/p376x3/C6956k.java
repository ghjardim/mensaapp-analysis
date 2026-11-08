package p376x3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p376x3.AbstractC6948c;
import p376x3.InterfaceC6953h;

/* renamed from: x3.k */
/* loaded from: classes.dex */
public class C6956k extends AbstractC6948c {

    /* renamed from: a */
    public InterfaceC6953h f24873a;

    /* renamed from: b */
    public Comparator f24874b;

    /* renamed from: l */
    public static C6956k m28496l(List list, Map map, AbstractC6948c.a.InterfaceC7243a interfaceC7243a, Comparator comparator) {
        return b.m28499b(list, map, interfaceC7243a, comparator);
    }

    /* renamed from: m */
    public static C6956k m28497m(Map map, Comparator comparator) {
        return b.m28499b(new ArrayList(map.keySet()), map, AbstractC6948c.a.m28466d(), comparator);
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: a */
    public boolean mo28450a(Object obj) {
        return m28498n(obj) != null;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: b */
    public Object mo28451b(Object obj) {
        InterfaceC6953h m28498n = m28498n(obj);
        if (m28498n != null) {
            return m28498n.getValue();
        }
        return null;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: e */
    public Comparator mo28452e() {
        return this.f24874b;
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: f */
    public Object mo28453f() {
        return this.f24873a.mo28486h().getKey();
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: g */
    public Object mo28454g() {
        return this.f24873a.mo28485g().getKey();
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: h */
    public AbstractC6948c mo28455h(Object obj, Object obj2) {
        return new C6956k(this.f24873a.mo28482c(obj, obj2, this.f24874b).mo28480a(null, null, InterfaceC6953h.a.BLACK, null, null), this.f24874b);
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: i */
    public Iterator mo28456i(Object obj) {
        return new C6949d(this.f24873a, obj, this.f24874b, false);
    }

    @Override // p376x3.AbstractC6948c
    public int indexOf(Object obj) {
        InterfaceC6953h interfaceC6953h = this.f24873a;
        int i7 = 0;
        while (!interfaceC6953h.isEmpty()) {
            int compare = this.f24874b.compare(obj, interfaceC6953h.getKey());
            if (compare == 0) {
                return i7 + interfaceC6953h.mo28481b().size();
            }
            if (compare < 0) {
                interfaceC6953h = interfaceC6953h.mo28481b();
            } else {
                i7 += interfaceC6953h.mo28481b().size() + 1;
                interfaceC6953h = interfaceC6953h.mo28484f();
            }
        }
        return -1;
    }

    @Override // p376x3.AbstractC6948c
    public boolean isEmpty() {
        return this.f24873a.isEmpty();
    }

    @Override // p376x3.AbstractC6948c, java.lang.Iterable
    public Iterator iterator() {
        return new C6949d(this.f24873a, null, this.f24874b, false);
    }

    @Override // p376x3.AbstractC6948c
    /* renamed from: k */
    public AbstractC6948c mo28457k(Object obj) {
        return !mo28450a(obj) ? this : new C6956k(this.f24873a.mo28483d(obj, this.f24874b).mo28480a(null, null, InterfaceC6953h.a.BLACK, null, null), this.f24874b);
    }

    /* renamed from: n */
    public final InterfaceC6953h m28498n(Object obj) {
        InterfaceC6953h interfaceC6953h = this.f24873a;
        while (!interfaceC6953h.isEmpty()) {
            int compare = this.f24874b.compare(obj, interfaceC6953h.getKey());
            if (compare < 0) {
                interfaceC6953h = interfaceC6953h.mo28481b();
            } else {
                if (compare == 0) {
                    return interfaceC6953h;
                }
                interfaceC6953h = interfaceC6953h.mo28484f();
            }
        }
        return null;
    }

    @Override // p376x3.AbstractC6948c
    public int size() {
        return this.f24873a.size();
    }

    public C6956k(InterfaceC6953h interfaceC6953h, Comparator comparator) {
        this.f24873a = interfaceC6953h;
        this.f24874b = comparator;
    }

    /* renamed from: x3.k$b */
    public static class b {

        /* renamed from: a */
        public final List f24875a;

        /* renamed from: b */
        public final Map f24876b;

        /* renamed from: c */
        public final AbstractC6948c.a.InterfaceC7243a f24877c;

        /* renamed from: d */
        public AbstractC6955j f24878d;

        /* renamed from: e */
        public AbstractC6955j f24879e;

        /* renamed from: x3.k$b$b, reason: collision with other inner class name */
        public static class C7245b {

            /* renamed from: a */
            public boolean f24884a;

            /* renamed from: b */
            public int f24885b;
        }

        public b(List list, Map map, AbstractC6948c.a.InterfaceC7243a interfaceC7243a) {
            this.f24875a = list;
            this.f24876b = map;
            this.f24877c = interfaceC7243a;
        }

        /* renamed from: b */
        public static C6956k m28499b(List list, Map map, AbstractC6948c.a.InterfaceC7243a interfaceC7243a, Comparator comparator) {
            b bVar = new b(list, map, interfaceC7243a);
            Collections.sort(list, comparator);
            Iterator it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C7245b c7245b = (C7245b) it.next();
                int i7 = c7245b.f24885b;
                size -= i7;
                if (c7245b.f24884a) {
                    bVar.m28501c(InterfaceC6953h.a.BLACK, i7, size);
                } else {
                    bVar.m28501c(InterfaceC6953h.a.BLACK, i7, size);
                    int i8 = c7245b.f24885b;
                    size -= i8;
                    bVar.m28501c(InterfaceC6953h.a.RED, i8, size);
                }
            }
            InterfaceC6953h interfaceC6953h = bVar.f24878d;
            if (interfaceC6953h == null) {
                interfaceC6953h = C6952g.m28479i();
            }
            return new C6956k(interfaceC6953h, comparator);
        }

        /* renamed from: a */
        public final InterfaceC6953h m28500a(int i7, int i8) {
            if (i8 == 0) {
                return C6952g.m28479i();
            }
            if (i8 == 1) {
                Object obj = this.f24875a.get(i7);
                return new C6951f(obj, m28502d(obj), null, null);
            }
            int i9 = i8 / 2;
            int i10 = i7 + i9;
            InterfaceC6953h m28500a = m28500a(i7, i9);
            InterfaceC6953h m28500a2 = m28500a(i10 + 1, i9);
            Object obj2 = this.f24875a.get(i10);
            return new C6951f(obj2, m28502d(obj2), m28500a, m28500a2);
        }

        /* renamed from: c */
        public final void m28501c(InterfaceC6953h.a aVar, int i7, int i8) {
            InterfaceC6953h m28500a = m28500a(i8 + 1, i7 - 1);
            Object obj = this.f24875a.get(i8);
            AbstractC6955j c6954i = aVar == InterfaceC6953h.a.RED ? new C6954i(obj, m28502d(obj), null, m28500a) : new C6951f(obj, m28502d(obj), null, m28500a);
            if (this.f24878d == null) {
                this.f24878d = c6954i;
                this.f24879e = c6954i;
            } else {
                this.f24879e.mo28478t(c6954i);
                this.f24879e = c6954i;
            }
        }

        /* renamed from: d */
        public final Object m28502d(Object obj) {
            return this.f24876b.get(this.f24877c.mo28462a(obj));
        }

        /* renamed from: x3.k$b$a */
        public static class a implements Iterable {

            /* renamed from: a */
            public long f24880a;

            /* renamed from: b */
            public final int f24881b;

            public a(int i7) {
                int i8 = i7 + 1;
                int floor = (int) Math.floor(Math.log(i8) / Math.log(2.0d));
                this.f24881b = floor;
                this.f24880a = (((long) Math.pow(2.0d, floor)) - 1) & i8;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return new C7244a();
            }

            /* renamed from: x3.k$b$a$a, reason: collision with other inner class name */
            public class C7244a implements Iterator {

                /* renamed from: a */
                public int f24882a;

                public C7244a() {
                    this.f24882a = a.this.f24881b - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public C7245b next() {
                    long j7 = a.this.f24880a & (1 << this.f24882a);
                    C7245b c7245b = new C7245b();
                    c7245b.f24884a = j7 == 0;
                    c7245b.f24885b = (int) Math.pow(2.0d, this.f24882a);
                    this.f24882a--;
                    return c7245b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f24882a >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }
        }
    }
}
