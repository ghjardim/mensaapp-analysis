package p334s;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC5464g;
import kotlin.jvm.internal.AbstractC5469l;
import p076K5.InterfaceC0834a;
import p342t.AbstractC6404a;
import p378x5.AbstractC7019j;
import p378x5.AbstractC7032w;

/* renamed from: s.b */
/* loaded from: classes.dex */
public final class C6309b implements Collection, Set, InterfaceC0834a {

    /* renamed from: a */
    public int[] f22861a;

    /* renamed from: b */
    public Object[] f22862b;

    /* renamed from: c */
    public int f22863c;

    /* renamed from: s.b$a */
    public final class a extends AbstractC6314g {
        public a() {
            super(C6309b.this.m26421g());
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: a */
        public Object mo26414a(int i7) {
            return C6309b.this.m26426m(i7);
        }

        @Override // p334s.AbstractC6314g
        /* renamed from: c */
        public void mo26415c(int i7) {
            C6309b.this.m26422h(i7);
        }
    }

    public C6309b() {
        this(0, 1, null);
    }

    /* renamed from: a */
    public final void m26417a(int i7) {
        int m26421g = m26421g();
        if (m26419e().length < i7) {
            int[] m26419e = m26419e();
            Object[] m26418b = m26418b();
            AbstractC6311d.m26428a(this, i7);
            if (m26421g() > 0) {
                AbstractC7019j.m28799i(m26419e, m26419e(), 0, 0, m26421g(), 6, null);
                AbstractC7019j.m28800j(m26418b, m26418b(), 0, 0, m26421g(), 6, null);
            }
        }
        if (m26421g() != m26421g) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i7;
        int m26430c;
        int m26421g = m26421g();
        if (obj == null) {
            m26430c = AbstractC6311d.m26431d(this);
            i7 = 0;
        } else {
            int hashCode = obj.hashCode();
            i7 = hashCode;
            m26430c = AbstractC6311d.m26430c(this, obj, hashCode);
        }
        if (m26430c >= 0) {
            return false;
        }
        int i8 = ~m26430c;
        if (m26421g >= m26419e().length) {
            int i9 = 8;
            if (m26421g >= 8) {
                i9 = (m26421g >> 1) + m26421g;
            } else if (m26421g < 4) {
                i9 = 4;
            }
            int[] m26419e = m26419e();
            Object[] m26418b = m26418b();
            AbstractC6311d.m26428a(this, i9);
            if (m26421g != m26421g()) {
                throw new ConcurrentModificationException();
            }
            if (!(m26419e().length == 0)) {
                AbstractC7019j.m28799i(m26419e, m26419e(), 0, 0, m26419e.length, 6, null);
                AbstractC7019j.m28800j(m26418b, m26418b(), 0, 0, m26418b.length, 6, null);
            }
        }
        if (i8 < m26421g) {
            int i10 = i8 + 1;
            AbstractC7019j.m28795e(m26419e(), m26419e(), i10, i8, m26421g);
            AbstractC7019j.m28797g(m26418b(), m26418b(), i10, i8, m26421g);
        }
        if (m26421g != m26421g() || i8 >= m26419e().length) {
            throw new ConcurrentModificationException();
        }
        m26419e()[i8] = i7;
        m26418b()[i8] = obj;
        m26425l(m26421g() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        m26417a(m26421g() + elements.size());
        Iterator it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= add(it.next());
        }
        return z6;
    }

    /* renamed from: b */
    public final Object[] m26418b() {
        return this.f22862b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (m26421g() != 0) {
            m26424k(AbstractC6404a.f23126a);
            m26423i(AbstractC6404a.f23128c);
            m26425l(0);
        }
        if (m26421g() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final int[] m26419e() {
        return this.f22861a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int m26421g = m26421g();
                for (int i7 = 0; i7 < m26421g; i7++) {
                    if (((Set) obj).contains(m26426m(i7))) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: f */
    public int m26420f() {
        return this.f22863c;
    }

    /* renamed from: g */
    public final int m26421g() {
        return this.f22863c;
    }

    /* renamed from: h */
    public final Object m26422h(int i7) {
        int m26421g = m26421g();
        Object obj = m26418b()[i7];
        if (m26421g <= 1) {
            clear();
        } else {
            int i8 = m26421g - 1;
            if (m26419e().length <= 8 || m26421g() >= m26419e().length / 3) {
                if (i7 < i8) {
                    int i9 = i7 + 1;
                    AbstractC7019j.m28795e(m26419e(), m26419e(), i7, i9, m26421g);
                    AbstractC7019j.m28797g(m26418b(), m26418b(), i7, i9, m26421g);
                }
                m26418b()[i8] = null;
            } else {
                int m26421g2 = m26421g() > 8 ? m26421g() + (m26421g() >> 1) : 8;
                int[] m26419e = m26419e();
                Object[] m26418b = m26418b();
                AbstractC6311d.m26428a(this, m26421g2);
                if (i7 > 0) {
                    AbstractC7019j.m28799i(m26419e, m26419e(), 0, 0, i7, 6, null);
                    AbstractC7019j.m28800j(m26418b, m26418b(), 0, 0, i7, 6, null);
                }
                if (i7 < i8) {
                    int i10 = i7 + 1;
                    AbstractC7019j.m28795e(m26419e, m26419e(), i7, i10, m26421g);
                    AbstractC7019j.m28797g(m26418b, m26418b(), i7, i10, m26421g);
                }
            }
            if (m26421g != m26421g()) {
                throw new ConcurrentModificationException();
            }
            m26425l(i8);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] m26419e = m26419e();
        int m26421g = m26421g();
        int i7 = 0;
        for (int i8 = 0; i8 < m26421g; i8++) {
            i7 += m26419e[i8];
        }
        return i7;
    }

    /* renamed from: i */
    public final void m26423i(Object[] objArr) {
        AbstractC5469l.m23028e(objArr, "<set-?>");
        this.f22862b = objArr;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC6311d.m26431d(this) : AbstractC6311d.m26430c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return m26421g() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public final void m26424k(int[] iArr) {
        AbstractC5469l.m23028e(iArr, "<set-?>");
        this.f22861a = iArr;
    }

    /* renamed from: l */
    public final void m26425l(int i7) {
        this.f22863c = i7;
    }

    /* renamed from: m */
    public final Object m26426m(int i7) {
        return m26418b()[i7];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        m26422h(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        Iterator it = elements.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            z6 |= remove(it.next());
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC5469l.m23028e(elements, "elements");
        boolean z6 = false;
        for (int m26421g = m26421g() - 1; -1 < m26421g; m26421g--) {
            if (!AbstractC7032w.m28896u(elements, m26418b()[m26421g])) {
                m26422h(m26421g);
                z6 = true;
            }
        }
        return z6;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return m26420f();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC7019j.m28802l(this.f22862b, 0, this.f22863c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(m26421g() * 14);
        sb.append('{');
        int m26421g = m26421g();
        for (int i7 = 0; i7 < m26421g; i7++) {
            if (i7 > 0) {
                sb.append(", ");
            }
            Object m26426m = m26426m(i7);
            if (m26426m != this) {
                sb.append(m26426m);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC5469l.m23027d(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public C6309b(int i7) {
        this.f22861a = AbstractC6404a.f23126a;
        this.f22862b = AbstractC6404a.f23128c;
        if (i7 > 0) {
            AbstractC6311d.m26428a(this, i7);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        AbstractC5469l.m23028e(array, "array");
        Object[] result = AbstractC6310c.m26427a(array, this.f22863c);
        AbstractC7019j.m28797g(this.f22862b, result, 0, 0, this.f22863c);
        AbstractC5469l.m23027d(result, "result");
        return result;
    }

    public /* synthetic */ C6309b(int i7, int i8, AbstractC5464g abstractC5464g) {
        this((i8 & 1) != 0 ? 0 : i7);
    }
}
