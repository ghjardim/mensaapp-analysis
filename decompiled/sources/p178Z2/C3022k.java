package p178Z2;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p171Y2.AbstractC2928k;
import p171Y2.AbstractC2932o;
import p203c3.AbstractC3577g;
import p256j$.util.Objects;

/* renamed from: Z2.k */
/* loaded from: classes.dex */
public class C3022k extends AbstractMap implements Serializable {

    /* renamed from: q */
    public static final Object f9272q = new Object();

    /* renamed from: a */
    public transient Object f9273a;

    /* renamed from: b */
    public transient int[] f9274b;

    /* renamed from: c */
    public transient Object[] f9275c;

    /* renamed from: d */
    public transient Object[] f9276d;

    /* renamed from: e */
    public transient int f9277e;

    /* renamed from: f */
    public transient int f9278f;

    /* renamed from: n */
    public transient Set f9279n;

    /* renamed from: o */
    public transient Set f9280o;

    /* renamed from: p */
    public transient Collection f9281p;

    /* renamed from: Z2.k$a */
    public class a extends e {
        public a() {
            super(C3022k.this, null);
        }

        @Override // p178Z2.C3022k.e
        /* renamed from: c */
        public Object mo10999c(int i7) {
            return C3022k.this.m10970H(i7);
        }
    }

    /* renamed from: Z2.k$b */
    public class b extends e {
        public b() {
            super(C3022k.this, null);
        }

        @Override // p178Z2.C3022k.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry mo10999c(int i7) {
            return C3022k.this.new g(i7);
        }
    }

    /* renamed from: Z2.k$c */
    public class c extends e {
        public c() {
            super(C3022k.this, null);
        }

        @Override // p178Z2.C3022k.e
        /* renamed from: c */
        public Object mo10999c(int i7) {
            return C3022k.this.m10986X(i7);
        }
    }

    /* renamed from: Z2.k$d */
    public class d extends AbstractSet {
        public d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3022k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map m10996x = C3022k.this.m10996x();
            if (m10996x != null) {
                return m10996x.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int m10967E = C3022k.this.m10967E(entry.getKey());
            return m10967E != -1 && AbstractC2928k.m10550a(C3022k.this.m10986X(m10967E), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3022k.this.m10998z();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map m10996x = C3022k.this.m10996x();
            if (m10996x != null) {
                return m10996x.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (C3022k.this.m10973K()) {
                return false;
            }
            int m10965C = C3022k.this.m10965C();
            int m11009f = AbstractC3023l.m11009f(entry.getKey(), entry.getValue(), m10965C, C3022k.this.m10977O(), C3022k.this.m10975M(), C3022k.this.m10976N(), C3022k.this.m10978P());
            if (m11009f == -1) {
                return false;
            }
            C3022k.this.m10972J(m11009f, m10965C);
            C3022k.m10952e(C3022k.this);
            C3022k.this.m10966D();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3022k.this.size();
        }
    }

    /* renamed from: Z2.k$f */
    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            C3022k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return C3022k.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3022k.this.m10971I();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map m10996x = C3022k.this.m10996x();
            return m10996x != null ? m10996x.keySet().remove(obj) : C3022k.this.m10974L(obj) != C3022k.f9272q;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3022k.this.size();
        }
    }

    /* renamed from: Z2.k$g */
    public final class g extends AbstractC3016e {

        /* renamed from: a */
        public final Object f9291a;

        /* renamed from: b */
        public int f9292b;

        public g(int i7) {
            this.f9291a = C3022k.this.m10970H(i7);
            this.f9292b = i7;
        }

        /* renamed from: a */
        public final void m11003a() {
            int i7 = this.f9292b;
            if (i7 == -1 || i7 >= C3022k.this.size() || !AbstractC2928k.m10550a(this.f9291a, C3022k.this.m10970H(this.f9292b))) {
                this.f9292b = C3022k.this.m10967E(this.f9291a);
            }
        }

        @Override // p178Z2.AbstractC3016e, java.util.Map.Entry
        public Object getKey() {
            return this.f9291a;
        }

        @Override // p178Z2.AbstractC3016e, java.util.Map.Entry
        public Object getValue() {
            Map m10996x = C3022k.this.m10996x();
            if (m10996x != null) {
                return AbstractC2997K.m10836a(m10996x.get(this.f9291a));
            }
            m11003a();
            int i7 = this.f9292b;
            return i7 == -1 ? AbstractC2997K.m10837b() : C3022k.this.m10986X(i7);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            Map m10996x = C3022k.this.m10996x();
            if (m10996x != null) {
                return AbstractC2997K.m10836a(m10996x.put(this.f9291a, obj));
            }
            m11003a();
            int i7 = this.f9292b;
            if (i7 == -1) {
                C3022k.this.put(this.f9291a, obj);
                return AbstractC2997K.m10837b();
            }
            Object m10986X = C3022k.this.m10986X(i7);
            C3022k.this.m10985W(this.f9292b, obj);
            return m10986X;
        }
    }

    /* renamed from: Z2.k$h */
    public class h extends AbstractCollection {
        public h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            C3022k.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3022k.this.m10987Y();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return C3022k.this.size();
        }
    }

    public C3022k() {
        m10968F(3);
    }

    /* renamed from: e */
    public static /* synthetic */ int m10952e(C3022k c3022k) {
        int i7 = c3022k.f9278f;
        c3022k.f9278f = i7 - 1;
        return i7;
    }

    /* renamed from: r */
    public static C3022k m10961r() {
        return new C3022k();
    }

    /* renamed from: w */
    public static C3022k m10962w(int i7) {
        return new C3022k(i7);
    }

    /* renamed from: A */
    public int m10963A() {
        return isEmpty() ? -1 : 0;
    }

    /* renamed from: B */
    public int m10964B(int i7) {
        int i8 = i7 + 1;
        if (i8 < this.f9278f) {
            return i8;
        }
        return -1;
    }

    /* renamed from: C */
    public final int m10965C() {
        return (1 << (this.f9277e & 31)) - 1;
    }

    /* renamed from: D */
    public void m10966D() {
        this.f9277e += 32;
    }

    /* renamed from: E */
    public final int m10967E(Object obj) {
        if (m10973K()) {
            return -1;
        }
        int m11033c = AbstractC3030s.m11033c(obj);
        int m10965C = m10965C();
        int m11011h = AbstractC3023l.m11011h(m10977O(), m11033c & m10965C);
        if (m11011h == 0) {
            return -1;
        }
        int m11005b = AbstractC3023l.m11005b(m11033c, m10965C);
        do {
            int i7 = m11011h - 1;
            int m10997y = m10997y(i7);
            if (AbstractC3023l.m11005b(m10997y, m10965C) == m11005b && AbstractC2928k.m10550a(obj, m10970H(i7))) {
                return i7;
            }
            m11011h = AbstractC3023l.m11006c(m10997y, m10965C);
        } while (m11011h != 0);
        return -1;
    }

    /* renamed from: F */
    public void m10968F(int i7) {
        AbstractC2932o.m10562e(i7 >= 0, "Expected size must be >= 0");
        this.f9277e = AbstractC3577g.m14423f(i7, 1, 1073741823);
    }

    /* renamed from: G */
    public void m10969G(int i7, Object obj, Object obj2, int i8, int i9) {
        m10982T(i7, AbstractC3023l.m11007d(i8, 0, i9));
        m10984V(i7, obj);
        m10985W(i7, obj2);
    }

    /* renamed from: H */
    public final Object m10970H(int i7) {
        return m10976N()[i7];
    }

    /* renamed from: I */
    public Iterator m10971I() {
        Map m10996x = m10996x();
        return m10996x != null ? m10996x.keySet().iterator() : new a();
    }

    /* renamed from: J */
    public void m10972J(int i7, int i8) {
        Object m10977O = m10977O();
        int[] m10975M = m10975M();
        Object[] m10976N = m10976N();
        Object[] m10978P = m10978P();
        int size = size();
        int i9 = size - 1;
        if (i7 >= i9) {
            m10976N[i7] = null;
            m10978P[i7] = null;
            m10975M[i7] = 0;
            return;
        }
        Object obj = m10976N[i9];
        m10976N[i7] = obj;
        m10978P[i7] = m10978P[i9];
        m10976N[i9] = null;
        m10978P[i9] = null;
        m10975M[i7] = m10975M[i9];
        m10975M[i9] = 0;
        int m11033c = AbstractC3030s.m11033c(obj) & i8;
        int m11011h = AbstractC3023l.m11011h(m10977O, m11033c);
        if (m11011h == size) {
            AbstractC3023l.m11012i(m10977O, m11033c, i7 + 1);
            return;
        }
        while (true) {
            int i10 = m11011h - 1;
            int i11 = m10975M[i10];
            int m11006c = AbstractC3023l.m11006c(i11, i8);
            if (m11006c == size) {
                m10975M[i10] = AbstractC3023l.m11007d(i11, i7 + 1, i8);
                return;
            }
            m11011h = m11006c;
        }
    }

    /* renamed from: K */
    public boolean m10973K() {
        return this.f9273a == null;
    }

    /* renamed from: L */
    public final Object m10974L(Object obj) {
        if (m10973K()) {
            return f9272q;
        }
        int m10965C = m10965C();
        int m11009f = AbstractC3023l.m11009f(obj, null, m10965C, m10977O(), m10975M(), m10976N(), null);
        if (m11009f == -1) {
            return f9272q;
        }
        Object m10986X = m10986X(m11009f);
        m10972J(m11009f, m10965C);
        this.f9278f--;
        m10966D();
        return m10986X;
    }

    /* renamed from: M */
    public final int[] m10975M() {
        int[] iArr = this.f9274b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* renamed from: N */
    public final Object[] m10976N() {
        Object[] objArr = this.f9275c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: O */
    public final Object m10977O() {
        Object obj = this.f9273a;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* renamed from: P */
    public final Object[] m10978P() {
        Object[] objArr = this.f9276d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    /* renamed from: Q */
    public void m10979Q(int i7) {
        this.f9274b = Arrays.copyOf(m10975M(), i7);
        this.f9275c = Arrays.copyOf(m10976N(), i7);
        this.f9276d = Arrays.copyOf(m10978P(), i7);
    }

    /* renamed from: R */
    public final void m10980R(int i7) {
        int min;
        int length = m10975M().length;
        if (i7 <= length || (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        m10979Q(min);
    }

    /* renamed from: S */
    public final int m10981S(int i7, int i8, int i9, int i10) {
        Object m11004a = AbstractC3023l.m11004a(i8);
        int i11 = i8 - 1;
        if (i10 != 0) {
            AbstractC3023l.m11012i(m11004a, i9 & i11, i10 + 1);
        }
        Object m10977O = m10977O();
        int[] m10975M = m10975M();
        for (int i12 = 0; i12 <= i7; i12++) {
            int m11011h = AbstractC3023l.m11011h(m10977O, i12);
            while (m11011h != 0) {
                int i13 = m11011h - 1;
                int i14 = m10975M[i13];
                int m11005b = AbstractC3023l.m11005b(i14, i7) | i12;
                int i15 = m11005b & i11;
                int m11011h2 = AbstractC3023l.m11011h(m11004a, i15);
                AbstractC3023l.m11012i(m11004a, i15, m11011h);
                m10975M[i13] = AbstractC3023l.m11007d(m11005b, m11011h2, i11);
                m11011h = AbstractC3023l.m11006c(i14, i7);
            }
        }
        this.f9273a = m11004a;
        m10983U(i11);
        return i11;
    }

    /* renamed from: T */
    public final void m10982T(int i7, int i8) {
        m10975M()[i7] = i8;
    }

    /* renamed from: U */
    public final void m10983U(int i7) {
        this.f9277e = AbstractC3023l.m11007d(this.f9277e, 32 - Integer.numberOfLeadingZeros(i7), 31);
    }

    /* renamed from: V */
    public final void m10984V(int i7, Object obj) {
        m10976N()[i7] = obj;
    }

    /* renamed from: W */
    public final void m10985W(int i7, Object obj) {
        m10978P()[i7] = obj;
    }

    /* renamed from: X */
    public final Object m10986X(int i7) {
        return m10978P()[i7];
    }

    /* renamed from: Y */
    public Iterator m10987Y() {
        Map m10996x = m10996x();
        return m10996x != null ? m10996x.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (m10973K()) {
            return;
        }
        m10966D();
        Map m10996x = m10996x();
        if (m10996x != null) {
            this.f9277e = AbstractC3577g.m14423f(size(), 3, 1073741823);
            m10996x.clear();
            this.f9273a = null;
            this.f9278f = 0;
            return;
        }
        Arrays.fill(m10976N(), 0, this.f9278f, (Object) null);
        Arrays.fill(m10978P(), 0, this.f9278f, (Object) null);
        AbstractC3023l.m11010g(m10977O());
        Arrays.fill(m10975M(), 0, this.f9278f, 0);
        this.f9278f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map m10996x = m10996x();
        return m10996x != null ? m10996x.containsKey(obj) : m10967E(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        Map m10996x = m10996x();
        if (m10996x != null) {
            return m10996x.containsValue(obj);
        }
        for (int i7 = 0; i7 < this.f9278f; i7++) {
            if (AbstractC2928k.m10550a(obj, m10986X(i7))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        Set set = this.f9280o;
        if (set != null) {
            return set;
        }
        Set m10992s = m10992s();
        this.f9280o = m10992s;
        return m10992s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Map m10996x = m10996x();
        if (m10996x != null) {
            return m10996x.get(obj);
        }
        int m10967E = m10967E(obj);
        if (m10967E == -1) {
            return null;
        }
        m10988n(m10967E);
        return m10986X(m10967E);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        Set set = this.f9279n;
        if (set != null) {
            return set;
        }
        Set m10994u = m10994u();
        this.f9279n = m10994u;
        return m10994u;
    }

    /* renamed from: o */
    public int m10989o(int i7, int i8) {
        return i7 - 1;
    }

    /* renamed from: p */
    public int m10990p() {
        AbstractC2932o.m10579v(m10973K(), "Arrays already allocated");
        int i7 = this.f9277e;
        int m11013j = AbstractC3023l.m11013j(i7);
        this.f9273a = AbstractC3023l.m11004a(m11013j);
        m10983U(m11013j - 1);
        this.f9274b = new int[i7];
        this.f9275c = new Object[i7];
        this.f9276d = new Object[i7];
        return i7;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        int m10981S;
        int i7;
        if (m10973K()) {
            m10990p();
        }
        Map m10996x = m10996x();
        if (m10996x != null) {
            return m10996x.put(obj, obj2);
        }
        int[] m10975M = m10975M();
        Object[] m10976N = m10976N();
        Object[] m10978P = m10978P();
        int i8 = this.f9278f;
        int i9 = i8 + 1;
        int m11033c = AbstractC3030s.m11033c(obj);
        int m10965C = m10965C();
        int i10 = m11033c & m10965C;
        int m11011h = AbstractC3023l.m11011h(m10977O(), i10);
        if (m11011h != 0) {
            int m11005b = AbstractC3023l.m11005b(m11033c, m10965C);
            int i11 = 0;
            while (true) {
                int i12 = m11011h - 1;
                int i13 = m10975M[i12];
                if (AbstractC3023l.m11005b(i13, m10965C) == m11005b && AbstractC2928k.m10550a(obj, m10976N[i12])) {
                    Object obj3 = m10978P[i12];
                    m10978P[i12] = obj2;
                    m10988n(i12);
                    return obj3;
                }
                int m11006c = AbstractC3023l.m11006c(i13, m10965C);
                i11++;
                if (m11006c != 0) {
                    m11011h = m11006c;
                } else {
                    if (i11 >= 9) {
                        return m10991q().put(obj, obj2);
                    }
                    if (i9 > m10965C) {
                        m10981S = m10981S(m10965C, AbstractC3023l.m11008e(m10965C), m11033c, i8);
                    } else {
                        m10975M[i12] = AbstractC3023l.m11007d(i13, i9, m10965C);
                    }
                }
            }
        } else if (i9 > m10965C) {
            m10981S = m10981S(m10965C, AbstractC3023l.m11008e(m10965C), m11033c, i8);
            i7 = m10981S;
        } else {
            AbstractC3023l.m11012i(m10977O(), i10, i9);
            i7 = m10965C;
        }
        m10980R(i9);
        m10969G(i8, obj, obj2, m11033c, i7);
        this.f9278f = i9;
        m10966D();
        return null;
    }

    /* renamed from: q */
    public Map m10991q() {
        Map m10993t = m10993t(m10965C() + 1);
        int m10963A = m10963A();
        while (m10963A >= 0) {
            m10993t.put(m10970H(m10963A), m10986X(m10963A));
            m10963A = m10964B(m10963A);
        }
        this.f9273a = m10993t;
        this.f9274b = null;
        this.f9275c = null;
        this.f9276d = null;
        m10966D();
        return m10993t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Map m10996x = m10996x();
        if (m10996x != null) {
            return m10996x.remove(obj);
        }
        Object m10974L = m10974L(obj);
        if (m10974L == f9272q) {
            return null;
        }
        return m10974L;
    }

    /* renamed from: s */
    public Set m10992s() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map m10996x = m10996x();
        return m10996x != null ? m10996x.size() : this.f9278f;
    }

    /* renamed from: t */
    public Map m10993t(int i7) {
        return new LinkedHashMap(i7, 1.0f);
    }

    /* renamed from: u */
    public Set m10994u() {
        return new f();
    }

    /* renamed from: v */
    public Collection m10995v() {
        return new h();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection values() {
        Collection collection = this.f9281p;
        if (collection != null) {
            return collection;
        }
        Collection m10995v = m10995v();
        this.f9281p = m10995v;
        return m10995v;
    }

    /* renamed from: x */
    public Map m10996x() {
        Object obj = this.f9273a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* renamed from: y */
    public final int m10997y(int i7) {
        return m10975M()[i7];
    }

    /* renamed from: z */
    public Iterator m10998z() {
        Map m10996x = m10996x();
        return m10996x != null ? m10996x.entrySet().iterator() : new b();
    }

    public C3022k(int i7) {
        m10968F(i7);
    }

    /* renamed from: Z2.k$e */
    public abstract class e implements Iterator {

        /* renamed from: a */
        public int f9286a;

        /* renamed from: b */
        public int f9287b;

        /* renamed from: c */
        public int f9288c;

        public e() {
            this.f9286a = C3022k.this.f9277e;
            this.f9287b = C3022k.this.m10963A();
            this.f9288c = -1;
        }

        /* renamed from: a */
        public final void m11001a() {
            if (C3022k.this.f9277e != this.f9286a) {
                throw new ConcurrentModificationException();
            }
        }

        /* renamed from: c */
        public abstract Object mo10999c(int i7);

        /* renamed from: d */
        public void m11002d() {
            this.f9286a += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f9287b >= 0;
        }

        @Override // java.util.Iterator
        public Object next() {
            m11001a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i7 = this.f9287b;
            this.f9288c = i7;
            Object mo10999c = mo10999c(i7);
            this.f9287b = C3022k.this.m10964B(this.f9287b);
            return mo10999c;
        }

        @Override // java.util.Iterator
        public void remove() {
            m11001a();
            AbstractC3020i.m10944c(this.f9288c >= 0);
            m11002d();
            C3022k c3022k = C3022k.this;
            c3022k.remove(c3022k.m10970H(this.f9288c));
            this.f9287b = C3022k.this.m10989o(this.f9287b, this.f9288c);
            this.f9288c = -1;
        }

        public /* synthetic */ e(C3022k c3022k, a aVar) {
            this();
        }
    }

    /* renamed from: n */
    public void m10988n(int i7) {
    }
}
