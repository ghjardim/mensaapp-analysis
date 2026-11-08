package p256j$.util.concurrent;

import com.google.android.gms.common.api.C3643a;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ForkJoinPool;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import p256j$.sun.misc.C4817a;
import p256j$.util.Collection;
import p256j$.util.Spliterator;
import p256j$.util.stream.Stream;

/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC4989v {

    /* renamed from: g */
    static final int f18178g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h */
    private static final C4817a f18179h;

    /* renamed from: i */
    private static final long f18180i;

    /* renamed from: j */
    private static final long f18181j;

    /* renamed from: k */
    private static final long f18182k;

    /* renamed from: l */
    private static final long f18183l;

    /* renamed from: m */
    private static final long f18184m;

    /* renamed from: n */
    private static final int f18185n;

    /* renamed from: o */
    private static final int f18186o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a */
    volatile transient C4979l[] f18187a;

    /* renamed from: b */
    private volatile transient C4979l[] f18188b;
    private volatile transient long baseCount;

    /* renamed from: c */
    private volatile transient C4970c[] f18189c;
    private volatile transient int cellsBusy;

    /* renamed from: d */
    private transient KeySetView f18190d;

    /* renamed from: e */
    private transient C4986s f18191e;

    /* renamed from: f */
    private transient C4972e f18192f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    /* renamed from: i */
    static final int m21308i(int i7) {
        return (i7 ^ (i7 >>> 16)) & C3643a.e.API_PRIORITY_OTHER;
    }

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", C4981n[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        C4817a m20876h = C4817a.m20876h();
        f18179h = m20876h;
        f18180i = m20876h.m20885j(ConcurrentHashMap.class, "sizeCtl");
        f18181j = m20876h.m20885j(ConcurrentHashMap.class, "transferIndex");
        f18182k = m20876h.m20885j(ConcurrentHashMap.class, "baseCount");
        f18183l = m20876h.m20885j(ConcurrentHashMap.class, "cellsBusy");
        f18184m = m20876h.m20885j(C4970c.class, MimeTypesReaderMetKeys.MATCH_VALUE_ATTR);
        f18185n = m20876h.m20878a(C4979l[].class);
        int m20879b = m20876h.m20879b(C4979l[].class);
        if (((m20879b - 1) & m20879b) != 0) {
            throw new ExceptionInInitializerError("array index scale not a power of two");
        }
        f18186o = 31 - Integer.numberOfLeadingZeros(m20879b);
    }

    /* renamed from: l */
    private static final int m21310l(int i7) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i7 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros >= 1073741824) {
            return 1073741824;
        }
        return 1 + numberOfLeadingZeros;
    }

    /* renamed from: c */
    static Class m21305c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    /* renamed from: k */
    static final C4979l m21309k(C4979l[] c4979lArr, int i7) {
        return (C4979l) f18179h.m20884g(c4979lArr, (i7 << f18186o) + f18185n);
    }

    /* renamed from: b */
    static final boolean m21304b(C4979l[] c4979lArr, int i7, C4979l c4979l) {
        return f18179h.m20882e(c4979lArr, (i7 << f18186o) + f18185n, c4979l);
    }

    /* renamed from: h */
    static final void m21307h(C4979l[] c4979lArr, int i7, C4979l c4979l) {
        f18179h.m20887l(c4979lArr, (i7 << f18186o) + f18185n, c4979l);
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i7) {
        this(i7, 0.75f, 1);
    }

    public ConcurrentHashMap(int i7, float f7, int i8) {
        if (f7 <= 0.0f || i7 < 0 || i8 <= 0) {
            throw new IllegalArgumentException();
        }
        long j7 = (long) (((i7 < i8 ? i8 : i7) / f7) + 1.0d);
        this.sizeCtl = j7 >= 1073741824 ? 1073741824 : m21310l((int) j7);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long m21318j = m21318j();
        if (m21318j < 0) {
            return 0;
        }
        return m21318j > 2147483647L ? C3643a.e.API_PRIORITY_OTHER : (int) m21318j;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return m21318j() <= 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        return (V) r1.f18225c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = m21308i(r0)
            j$.util.concurrent.l[] r1 = r4.f18187a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.l r1 = m21309k(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f18223a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f18224b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f18225c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.l r5 = r1.mo21328a(r0, r5)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f18225c
        L36:
            return r2
        L37:
            j$.util.concurrent.l r1 = r1.f18226d
            if (r1 == 0) goto L4e
            int r3 = r1.f18223a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f18224b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f18225c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C4979l[] c4979lArr = this.f18187a;
        if (c4979lArr != null) {
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                Object obj2 = m21329a.f18225c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k7, V v6) {
        return (V) m21316f(k7, v6, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
    
        m21303a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00a5, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final java.lang.Object m21316f(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.m21316f(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m21313o(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            m21316f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) m21317g(obj, null, null);
    }

    /* renamed from: g */
    final Object m21317g(Object obj, Object obj2, Object obj3) {
        int length;
        int i7;
        C4979l m21309k;
        boolean z6;
        Object obj4;
        C4985r m21338b;
        Object obj5;
        int m21308i = m21308i(obj.hashCode());
        C4979l[] c4979lArr = this.f18187a;
        while (true) {
            if (c4979lArr == null || (length = c4979lArr.length) == 0 || (m21309k = m21309k(c4979lArr, (i7 = (length - 1) & m21308i))) == null) {
                break;
            }
            int i8 = m21309k.f18223a;
            if (i8 == -1) {
                c4979lArr = m21315d(c4979lArr, m21309k);
            } else {
                synchronized (m21309k) {
                    try {
                        if (m21309k(c4979lArr, i7) == m21309k) {
                            z6 = true;
                            if (i8 >= 0) {
                                C4979l c4979l = null;
                                C4979l c4979l2 = m21309k;
                                while (true) {
                                    if (c4979l2.f18223a == m21308i && ((obj5 = c4979l2.f18224b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    C4979l c4979l3 = c4979l2.f18226d;
                                    if (c4979l3 == null) {
                                        break;
                                    }
                                    c4979l = c4979l2;
                                    c4979l2 = c4979l3;
                                }
                                obj4 = c4979l2.f18225c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        c4979l2.f18225c = obj2;
                                    } else if (c4979l != null) {
                                        c4979l.f18226d = c4979l2.f18226d;
                                    } else {
                                        m21307h(c4979lArr, i7, c4979l2.f18226d);
                                    }
                                }
                                obj4 = null;
                            } else if (m21309k instanceof C4984q) {
                                C4984q c4984q = (C4984q) m21309k;
                                C4985r c4985r = c4984q.f18241e;
                                if (c4985r != null && (m21338b = c4985r.m21338b(m21308i, obj, null)) != null) {
                                    obj4 = m21338b.f18225c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            m21338b.f18225c = obj2;
                                        } else if (c4984q.m21337f(m21338b)) {
                                            m21307h(c4979lArr, i7, m21314p(c4984q.f18242f));
                                        }
                                    }
                                }
                                obj4 = null;
                            } else if (m21309k instanceof C4980m) {
                                throw new IllegalStateException("Recursive update");
                            }
                        }
                        z6 = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z6) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            m21303a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C4979l m21309k;
        C4979l c4979l;
        C4979l[] c4979lArr = this.f18187a;
        long j7 = 0;
        loop0: while (true) {
            int i7 = 0;
            while (c4979lArr != null && i7 < c4979lArr.length) {
                m21309k = m21309k(c4979lArr, i7);
                if (m21309k == null) {
                    i7++;
                } else {
                    int i8 = m21309k.f18223a;
                    if (i8 == -1) {
                        break;
                    }
                    synchronized (m21309k) {
                        try {
                            if (m21309k(c4979lArr, i7) == m21309k) {
                                if (i8 >= 0) {
                                    c4979l = m21309k;
                                } else {
                                    c4979l = m21309k instanceof C4984q ? ((C4984q) m21309k).f18242f : null;
                                }
                                while (c4979l != null) {
                                    j7--;
                                    c4979l = c4979l.f18226d;
                                }
                                m21307h(c4979lArr, i7, null);
                                i7++;
                            }
                        } finally {
                        }
                    }
                }
            }
            c4979lArr = m21315d(c4979lArr, m21309k);
        }
        if (j7 != 0) {
            m21303a(j7, -1);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        KeySetView keySetView = this.f18190d;
        if (keySetView != null) {
            return keySetView;
        }
        KeySetView keySetView2 = new KeySetView(this, null);
        this.f18190d = keySetView2;
        return keySetView2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C4986s c4986s = this.f18191e;
        if (c4986s != null) {
            return c4986s;
        }
        C4986s c4986s2 = new C4986s(this);
        this.f18191e = c4986s2;
        return c4986s2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C4972e c4972e = this.f18192f;
        if (c4972e != null) {
            return c4972e;
        }
        C4972e c4972e2 = new C4972e(this);
        this.f18192f = c4972e2;
        return c4972e2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        C4979l[] c4979lArr = this.f18187a;
        int i7 = 0;
        if (c4979lArr != null) {
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                i7 += m21329a.f18225c.hashCode() ^ m21329a.f18224b.hashCode();
            }
        }
        return i7;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        C4979l[] c4979lArr = this.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        C4983p c4983p = new C4983p(c4979lArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C4979l m21329a = c4983p.m21329a();
        if (m21329a != null) {
            while (true) {
                Object obj = m21329a.f18224b;
                Object obj2 = m21329a.f18225c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        C4979l[] c4979lArr = this.f18187a;
        int length = c4979lArr == null ? 0 : c4979lArr.length;
        C4983p c4983p = new C4983p(c4979lArr, length, 0, length);
        while (true) {
            C4979l m21329a = c4983p.m21329a();
            if (m21329a != null) {
                Object obj2 = m21329a.f18225c;
                Object obj3 = map.get(m21329a.f18224b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            } else {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (v6 = get(key)) == null || (value != v6 && !value.equals(v6))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i7 = 0;
        int i8 = 1;
        while (i8 < 16) {
            i7++;
            i8 <<= 1;
        }
        int i9 = 32 - i7;
        int i10 = i8 - 1;
        C4981n[] c4981nArr = new C4981n[16];
        for (int i11 = 0; i11 < 16; i11++) {
            c4981nArr[i11] = new C4981n();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", c4981nArr);
        putFields.put("segmentShift", i9);
        putFields.put("segmentMask", i10);
        objectOutputStream.writeFields();
        C4979l[] c4979lArr = this.f18187a;
        if (c4979lArr != null) {
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    break;
                }
                objectOutputStream.writeObject(m21329a.f18224b);
                objectOutputStream.writeObject(m21329a.f18225c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j7;
        boolean z6;
        boolean z7;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j8 = 0;
        long j9 = 0;
        C4979l c4979l = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j7 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j9++;
            c4979l = new C4979l(m21308i(readObject.hashCode()), readObject, readObject2, c4979l);
        }
        if (j9 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j10 = (long) ((j9 / 0.75f) + 1.0d);
        int m21310l = j10 >= 1073741824 ? 1073741824 : m21310l((int) j10);
        C4979l[] c4979lArr = new C4979l[m21310l];
        int i7 = m21310l - 1;
        while (c4979l != null) {
            C4979l c4979l2 = c4979l.f18226d;
            int i8 = c4979l.f18223a;
            int i9 = i8 & i7;
            C4979l m21309k = m21309k(c4979lArr, i9);
            if (m21309k == null) {
                z7 = true;
            } else {
                Object obj2 = c4979l.f18224b;
                if (m21309k.f18223a >= 0) {
                    int i10 = 0;
                    for (C4979l c4979l3 = m21309k; c4979l3 != null; c4979l3 = c4979l3.f18226d) {
                        if (c4979l3.f18223a == i8 && ((obj = c4979l3.f18224b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z6 = false;
                            break;
                        }
                        i10++;
                    }
                    z6 = true;
                    if (!z6 || i10 < 8) {
                        z7 = z6;
                    } else {
                        long j11 = j8 + 1;
                        c4979l.f18226d = m21309k;
                        C4979l c4979l4 = c4979l;
                        C4985r c4985r = null;
                        C4985r c4985r2 = null;
                        while (c4979l4 != null) {
                            long j12 = j11;
                            C4985r c4985r3 = new C4985r(c4979l4.f18223a, c4979l4.f18224b, c4979l4.f18225c, null, null);
                            c4985r3.f18247h = c4985r2;
                            if (c4985r2 == null) {
                                c4985r = c4985r3;
                            } else {
                                c4985r2.f18226d = c4985r3;
                            }
                            c4979l4 = c4979l4.f18226d;
                            c4985r2 = c4985r3;
                            j11 = j12;
                        }
                        m21307h(c4979lArr, i9, new C4984q(c4985r));
                        j8 = j11;
                    }
                } else if (((C4984q) m21309k).m21336e(i8, obj2, c4979l.f18225c) == null) {
                    j8 += j7;
                }
                z7 = false;
            }
            if (z7) {
                j8++;
                c4979l.f18226d = m21309k;
                m21307h(c4979lArr, i9, c4979l);
            }
            j7 = 1;
            c4979l = c4979l2;
        }
        this.f18187a = c4979lArr;
        this.sizeCtl = m21310l - (m21310l >>> 2);
        this.baseCount = j8;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public V putIfAbsent(K k7, V v6) {
        return (V) m21316f(k7, v6, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || m21317g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m21317g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null) {
            throw null;
        }
        if (obj2 == null) {
            throw null;
        }
        return m21317g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v6 = get(obj);
        return v6 == null ? obj2 : v6;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C4979l[] c4979lArr = this.f18187a;
        if (c4979lArr == null) {
            return;
        }
        C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
        while (true) {
            C4979l m21329a = c4983p.m21329a();
            if (m21329a == null) {
                return;
            } else {
                biConsumer.accept(m21329a.f18224b, m21329a.f18225c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C4979l[] c4979lArr = this.f18187a;
        if (c4979lArr == null) {
            return;
        }
        C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
        while (true) {
            C4979l m21329a = c4983p.m21329a();
            if (m21329a == null) {
                return;
            }
            Object obj = m21329a.f18225c;
            Object obj2 = m21329a.f18224b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (m21317g(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f2, code lost:
    
        if (r5 == null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
    
        m21303a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f9, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfAbsent(java.lang.Object r12, java.util.function.Function r13) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, java.util.function.Function):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto Lbd
            if (r15 == 0) goto Lbd
            int r1 = r14.hashCode()
            int r1 = m21308i(r1)
            j$.util.concurrent.l[] r2 = r13.f18187a
            r3 = 0
            r5 = r0
            r4 = r3
        L12:
            if (r2 == 0) goto Lb7
            int r6 = r2.length
            if (r6 != 0) goto L19
            goto Lb7
        L19:
            int r6 = r6 + (-1)
            r6 = r6 & r1
            j$.util.concurrent.l r7 = m21309k(r2, r6)
            if (r7 != 0) goto L24
            goto Lae
        L24:
            int r8 = r7.f18223a
            r9 = -1
            if (r8 != r9) goto L2e
            j$.util.concurrent.l[] r2 = r13.m21315d(r2, r7)
            goto L12
        L2e:
            monitor-enter(r7)
            j$.util.concurrent.l r10 = m21309k(r2, r6)     // Catch: java.lang.Throwable -> L4b
            if (r10 != r7) goto Lab
            if (r8 < 0) goto L70
            r4 = 1
            r10 = r0
            r8 = r7
        L3a:
            int r11 = r8.f18223a     // Catch: java.lang.Throwable -> L4b
            if (r11 != r1) goto L65
            java.lang.Object r11 = r8.f18224b     // Catch: java.lang.Throwable -> L4b
            if (r11 == r14) goto L4e
            if (r11 == 0) goto L65
            boolean r11 = r14.equals(r11)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L65
            goto L4e
        L4b:
            r14 = move-exception
            goto Lb5
        L4e:
            java.lang.Object r5 = r8.f18225c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L59
            r8.f18225c = r5     // Catch: java.lang.Throwable -> L4b
            goto Lab
        L59:
            j$.util.concurrent.l r3 = r8.f18226d     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            r10.f18226d = r3     // Catch: java.lang.Throwable -> L4b
            goto L63
        L60:
            m21307h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L63:
            r3 = r9
            goto Lab
        L65:
            j$.util.concurrent.l r10 = r8.f18226d     // Catch: java.lang.Throwable -> L4b
            if (r10 != 0) goto L6a
            goto Lab
        L6a:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L3a
        L70:
            boolean r8 = r7 instanceof p256j$.util.concurrent.C4984q     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9e
            r4 = r7
            j$.util.concurrent.q r4 = (p256j$.util.concurrent.C4984q) r4     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.r r8 = r4.f18241e     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            j$.util.concurrent.r r8 = r8.m21338b(r1, r14, r0)     // Catch: java.lang.Throwable -> L4b
            if (r8 == 0) goto L9c
            java.lang.Object r5 = r8.f18225c     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch: java.lang.Throwable -> L4b
            if (r5 == 0) goto L8c
            r8.f18225c = r5     // Catch: java.lang.Throwable -> L4b
            goto L9c
        L8c:
            boolean r3 = r4.m21337f(r8)     // Catch: java.lang.Throwable -> L4b
            if (r3 == 0) goto L9b
            j$.util.concurrent.r r3 = r4.f18242f     // Catch: java.lang.Throwable -> L4b
            j$.util.concurrent.l r3 = m21314p(r3)     // Catch: java.lang.Throwable -> L4b
            m21307h(r2, r6, r3)     // Catch: java.lang.Throwable -> L4b
        L9b:
            r3 = r9
        L9c:
            r4 = 2
            goto Lab
        L9e:
            boolean r6 = r7 instanceof p256j$.util.concurrent.C4980m     // Catch: java.lang.Throwable -> L4b
            if (r6 != 0) goto La3
            goto Lab
        La3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L4b
            java.lang.String r15 = "Recursive update"
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L4b
            throw r14     // Catch: java.lang.Throwable -> L4b
        Lab:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            if (r4 == 0) goto L12
        Lae:
            if (r3 == 0) goto Lb4
            long r14 = (long) r3
            r13.m21303a(r14, r4)
        Lb4:
            return r5
        Lb5:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4b
            throw r14
        Lb7:
            j$.util.concurrent.l[] r2 = r13.m21306e()
            goto L12
        Lbd:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x010e, code lost:
    
        if (r4 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0110, code lost:
    
        m21303a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0114, code lost:
    
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object compute(java.lang.Object r14, java.util.function.BiFunction r15) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.compute(java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00dd, code lost:
    
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p256j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r18, java.lang.Object r19, java.util.function.BiFunction r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.merge(java.lang.Object, java.lang.Object, java.util.function.BiFunction):java.lang.Object");
    }

    public static <K> KeySetView<K, Boolean> newKeySet(int i7) {
        return new KeySetView<>(new ConcurrentHashMap(i7), Boolean.TRUE);
    }

    /* renamed from: e */
    private final C4979l[] m21306e() {
        while (true) {
            C4979l[] c4979lArr = this.f18187a;
            if (c4979lArr != null && c4979lArr.length != 0) {
                return c4979lArr;
            }
            int i7 = this.sizeCtl;
            if (i7 < 0) {
                Thread.yield();
            } else if (f18179h.m20880c(this, f18180i, i7, -1)) {
                try {
                    C4979l[] c4979lArr2 = this.f18187a;
                    if (c4979lArr2 != null) {
                        if (c4979lArr2.length == 0) {
                        }
                        this.sizeCtl = i7;
                        return c4979lArr2;
                    }
                    int i8 = i7 > 0 ? i7 : 16;
                    C4979l[] c4979lArr3 = new C4979l[i8];
                    this.f18187a = c4979lArr3;
                    i7 = i8 - (i8 >>> 2);
                    c4979lArr2 = c4979lArr3;
                    this.sizeCtl = i7;
                    return c4979lArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i7;
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:155:0x013f, code lost:
    
        if (r25.f18189c != r7) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0141, code lost:
    
        r25.f18189c = (p256j$.util.concurrent.C4970c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r1.m20881d(r25, r3, r5, r14) == false) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00ba A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void m21303a(long r26, int r28) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p256j$.util.concurrent.ConcurrentHashMap.m21303a(long, int):void");
    }

    /* renamed from: d */
    final C4979l[] m21315d(C4979l[] c4979lArr, C4979l c4979l) {
        int i7;
        if (c4979l instanceof C4975h) {
            C4979l[] c4979lArr2 = ((C4975h) c4979l).f18216e;
            int numberOfLeadingZeros = Integer.numberOfLeadingZeros(c4979lArr.length) | 32768;
            while (true) {
                if (c4979lArr2 != this.f18188b || this.f18187a != c4979lArr || (i7 = this.sizeCtl) >= 0 || (i7 >>> 16) != numberOfLeadingZeros || i7 == numberOfLeadingZeros + 1 || i7 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                    break;
                }
                if (f18179h.m20880c(this, f18180i, i7, i7 + 1)) {
                    m21311m(c4979lArr, c4979lArr2);
                    break;
                }
            }
            return c4979lArr2;
        }
        return this.f18187a;
    }

    /* renamed from: o */
    private final void m21313o(int i7) {
        int length;
        int m21310l = i7 >= 536870912 ? 1073741824 : m21310l(i7 + (i7 >>> 1) + 1);
        while (true) {
            int i8 = this.sizeCtl;
            if (i8 < 0) {
                return;
            }
            C4979l[] c4979lArr = this.f18187a;
            if (c4979lArr == null || (length = c4979lArr.length) == 0) {
                int i9 = i8 > m21310l ? i8 : m21310l;
                if (f18179h.m20880c(this, f18180i, i8, -1)) {
                    try {
                        if (this.f18187a == c4979lArr) {
                            this.f18187a = new C4979l[i9];
                            i8 = i9 - (i9 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i8;
                    }
                } else {
                    continue;
                }
            } else {
                if (m21310l <= i8 || length >= 1073741824) {
                    return;
                }
                if (c4979lArr == this.f18187a) {
                    if (f18179h.m20880c(this, f18180i, i8, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m21311m(c4979lArr, null);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r4v0, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    /* renamed from: m */
    private final void m21311m(C4979l[] c4979lArr, C4979l[] c4979lArr2) {
        C4979l[] c4979lArr3;
        int i7;
        int i8;
        C4975h c4975h;
        ConcurrentHashMap<K, V> concurrentHashMap;
        boolean z6;
        char c7;
        int i9;
        C4979l c4984q;
        C4979l c4984q2;
        C4985r c4985r;
        int i10;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        C4979l[] c4979lArr4 = c4979lArr;
        int length = c4979lArr4.length;
        int i11 = f18178g;
        boolean z7 = true;
        int i12 = i11 > 1 ? (length >>> 3) / i11 : length;
        char c8 = 16;
        int i13 = i12 < 16 ? 16 : i12;
        if (c4979lArr2 == null) {
            try {
                C4979l[] c4979lArr5 = new C4979l[length << 1];
                concurrentHashMap2.f18188b = c4979lArr5;
                concurrentHashMap2.transferIndex = length;
                c4979lArr3 = c4979lArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = C3643a.e.API_PRIORITY_OTHER;
                return;
            }
        } else {
            c4979lArr3 = c4979lArr2;
        }
        int length2 = c4979lArr3.length;
        C4975h c4975h2 = new C4975h(c4979lArr3);
        boolean z8 = true;
        int i14 = 0;
        int i15 = 0;
        boolean z9 = false;
        while (true) {
            if (z8) {
                int i16 = i15 - 1;
                if (i16 >= i14 || z9) {
                    i14 = i14;
                    i15 = i16;
                } else {
                    int i17 = concurrentHashMap2.transferIndex;
                    if (i17 <= 0) {
                        i15 = -1;
                    } else {
                        C4817a c4817a = f18179h;
                        long j7 = f18181j;
                        int i18 = i17 > i13 ? i17 - i13 : 0;
                        int i19 = i14;
                        if (c4817a.m20880c(this, j7, i17, i18)) {
                            i15 = i17 - 1;
                            i14 = i18;
                        } else {
                            i14 = i19;
                            i15 = i16;
                        }
                    }
                }
                z8 = false;
            } else {
                int i20 = i14;
                C4985r c4985r2 = null;
                if (i15 < 0 || i15 >= length || (i9 = i15 + length) >= length2) {
                    i7 = i13;
                    i8 = length2;
                    c4975h = c4975h2;
                    if (z9) {
                        this.f18188b = null;
                        this.f18187a = c4979lArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap = this;
                    z6 = true;
                    C4817a c4817a2 = f18179h;
                    long j8 = f18180i;
                    int i21 = concurrentHashMap.sizeCtl;
                    int i22 = i15;
                    if (c4817a2.m20880c(this, j8, i21, i21 - 1)) {
                        c7 = 16;
                        if (i21 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i15 = length;
                        z8 = true;
                        z9 = true;
                    } else {
                        c7 = 16;
                        i15 = i22;
                    }
                } else {
                    ?? m21309k = m21309k(c4979lArr4, i15);
                    if (m21309k == 0) {
                        z8 = m21304b(c4979lArr4, i15, c4975h2);
                        c7 = c8;
                        i7 = i13;
                        i8 = length2;
                        z6 = z7;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        int i23 = m21309k.f18223a;
                        if (i23 == -1) {
                            z8 = z7;
                            c7 = c8;
                            i7 = i13;
                            i8 = length2;
                            concurrentHashMap = concurrentHashMap2;
                            z6 = z8;
                        } else {
                            synchronized (m21309k) {
                                try {
                                    if (m21309k(c4979lArr4, i15) == m21309k) {
                                        if (i23 >= 0) {
                                            int i24 = i23 & length;
                                            C4985r c4985r3 = m21309k;
                                            for (C4985r c4985r4 = m21309k.f18226d; c4985r4 != null; c4985r4 = c4985r4.f18226d) {
                                                int i25 = c4985r4.f18223a & length;
                                                if (i25 != i24) {
                                                    c4985r3 = c4985r4;
                                                    i24 = i25;
                                                }
                                            }
                                            if (i24 == 0) {
                                                c4985r = null;
                                                c4985r2 = c4985r3;
                                            } else {
                                                c4985r = c4985r3;
                                            }
                                            C4979l c4979l = m21309k;
                                            while (c4979l != c4985r3) {
                                                int i26 = c4979l.f18223a;
                                                Object obj = c4979l.f18224b;
                                                int i27 = i13;
                                                Object obj2 = c4979l.f18225c;
                                                if ((i26 & length) == 0) {
                                                    i10 = length2;
                                                    c4985r2 = new C4979l(i26, obj, obj2, c4985r2);
                                                } else {
                                                    i10 = length2;
                                                    c4985r = new C4979l(i26, obj, obj2, c4985r);
                                                }
                                                c4979l = c4979l.f18226d;
                                                i13 = i27;
                                                length2 = i10;
                                            }
                                            i7 = i13;
                                            i8 = length2;
                                            m21307h(c4979lArr3, i15, c4985r2);
                                            m21307h(c4979lArr3, i9, c4985r);
                                            m21307h(c4979lArr4, i15, c4975h2);
                                            c4975h = c4975h2;
                                        } else {
                                            i7 = i13;
                                            i8 = length2;
                                            if (m21309k instanceof C4984q) {
                                                C4984q c4984q3 = (C4984q) m21309k;
                                                C4985r c4985r5 = null;
                                                C4985r c4985r6 = null;
                                                C4979l c4979l2 = c4984q3.f18242f;
                                                int i28 = 0;
                                                int i29 = 0;
                                                C4985r c4985r7 = null;
                                                while (c4979l2 != null) {
                                                    C4984q c4984q4 = c4984q3;
                                                    int i30 = c4979l2.f18223a;
                                                    C4975h c4975h3 = c4975h2;
                                                    C4985r c4985r8 = new C4985r(i30, c4979l2.f18224b, c4979l2.f18225c, null, null);
                                                    if ((i30 & length) == 0) {
                                                        c4985r8.f18247h = c4985r6;
                                                        if (c4985r6 == null) {
                                                            c4985r2 = c4985r8;
                                                        } else {
                                                            c4985r6.f18226d = c4985r8;
                                                        }
                                                        i28++;
                                                        c4985r6 = c4985r8;
                                                    } else {
                                                        c4985r8.f18247h = c4985r5;
                                                        if (c4985r5 == null) {
                                                            c4985r7 = c4985r8;
                                                        } else {
                                                            c4985r5.f18226d = c4985r8;
                                                        }
                                                        i29++;
                                                        c4985r5 = c4985r8;
                                                    }
                                                    c4979l2 = c4979l2.f18226d;
                                                    c4984q3 = c4984q4;
                                                    c4975h2 = c4975h3;
                                                }
                                                C4984q c4984q5 = c4984q3;
                                                C4975h c4975h4 = c4975h2;
                                                if (i28 <= 6) {
                                                    c4984q = m21314p(c4985r2);
                                                } else {
                                                    c4984q = i29 != 0 ? new C4984q(c4985r2) : c4984q5;
                                                }
                                                if (i29 <= 6) {
                                                    c4984q2 = m21314p(c4985r7);
                                                } else {
                                                    c4984q2 = i28 != 0 ? new C4984q(c4985r7) : c4984q5;
                                                }
                                                m21307h(c4979lArr3, i15, c4984q);
                                                m21307h(c4979lArr3, i9, c4984q2);
                                                c4979lArr4 = c4979lArr;
                                                c4975h = c4975h4;
                                                m21307h(c4979lArr4, i15, c4975h);
                                            }
                                        }
                                        z8 = true;
                                    } else {
                                        i7 = i13;
                                        i8 = length2;
                                    }
                                    c4975h = c4975h2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                            c7 = 16;
                            z6 = true;
                        }
                    }
                    c4975h = c4975h2;
                }
                c4975h2 = c4975h;
                concurrentHashMap2 = concurrentHashMap;
                z7 = z6;
                i14 = i20;
                i13 = i7;
                length2 = i8;
                c8 = c7;
            }
        }
    }

    /* renamed from: j */
    final long m21318j() {
        C4970c[] c4970cArr = this.f18189c;
        long j7 = this.baseCount;
        if (c4970cArr != null) {
            for (C4970c c4970c : c4970cArr) {
                if (c4970c != null) {
                    j7 += c4970c.value;
                }
            }
        }
        return j7;
    }

    /* renamed from: n */
    private final void m21312n(C4979l[] c4979lArr, int i7) {
        int length = c4979lArr.length;
        if (length < 64) {
            m21313o(length << 1);
            return;
        }
        C4979l m21309k = m21309k(c4979lArr, i7);
        if (m21309k == null || m21309k.f18223a < 0) {
            return;
        }
        synchronized (m21309k) {
            try {
                if (m21309k(c4979lArr, i7) == m21309k) {
                    C4985r c4985r = null;
                    C4979l c4979l = m21309k;
                    C4985r c4985r2 = null;
                    while (c4979l != null) {
                        C4985r c4985r3 = new C4985r(c4979l.f18223a, c4979l.f18224b, c4979l.f18225c, null, null);
                        c4985r3.f18247h = c4985r2;
                        if (c4985r2 == null) {
                            c4985r = c4985r3;
                        } else {
                            c4985r2.f18226d = c4985r3;
                        }
                        c4979l = c4979l.f18226d;
                        c4985r2 = c4985r3;
                    }
                    m21307h(c4979lArr, i7, new C4984q(c4985r));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    /* renamed from: p */
    static C4979l m21314p(C4985r c4985r) {
        C4979l c4979l = null;
        C4979l c4979l2 = null;
        for (C4985r c4985r2 = c4985r; c4985r2 != null; c4985r2 = c4985r2.f18226d) {
            C4979l c4979l3 = new C4979l(c4985r2.f18223a, c4985r2.f18224b, c4985r2.f18225c);
            if (c4979l2 == null) {
                c4979l = c4979l3;
            } else {
                c4979l2.f18226d = c4979l3;
            }
            c4979l2 = c4979l3;
        }
        return c4979l;
    }

    public void forEachValue(long j7, Consumer<? super V> consumer) {
        int i7;
        consumer.getClass();
        if (j7 != Long.MAX_VALUE) {
            long m21318j = m21318j();
            if (m21318j > 1 && m21318j >= j7) {
                i7 = ForkJoinPool.getCommonPoolParallelism() << 2;
                if (j7 > 0) {
                    long j8 = m21318j / j7;
                    if (j8 < i7) {
                        i7 = (int) j8;
                    }
                }
                new C4974g(null, i7, 0, 0, this.f18187a, consumer).invoke();
            }
        }
        i7 = 0;
        new C4974g(null, i7, 0, 0, this.f18187a, consumer).invoke();
    }

    public static class KeySetView<K, V> extends AbstractC4969b implements Set<K>, Serializable, p256j$.util.Set<K> {
        private static final long serialVersionUID = 7249069246763182397L;

        /* renamed from: b */
        private final Boolean f18193b;

        @Override // java.util.Collection, p256j$.util.Collection
        public final /* synthetic */ Stream parallelStream() {
            return Collection.CC.$default$parallelStream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream parallelStream() {
            return Stream.Wrapper.convert(Collection.CC.$default$parallelStream(this));
        }

        @Override // java.util.Collection, p256j$.util.Collection
        public final /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public final /* synthetic */ Spliterator spliterator() {
            return Spliterator.Wrapper.convert(spliterator());
        }

        @Override // java.util.Collection, p256j$.util.Collection
        public final /* synthetic */ Stream stream() {
            return Collection.CC.$default$stream(this);
        }

        @Override // java.util.Collection
        public final /* synthetic */ java.util.stream.Stream stream() {
            return Stream.Wrapper.convert(Collection.CC.$default$stream(this));
        }

        @Override // java.util.Collection, p256j$.util.Collection
        public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
            Object[] array;
            array = toArray((Object[]) intFunction.apply(0));
            return array;
        }

        KeySetView(ConcurrentHashMap concurrentHashMap, Boolean bool) {
            super(concurrentHashMap);
            this.f18193b = bool;
        }

        @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.f18203a.containsKey(obj);
        }

        @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            return this.f18203a.remove(obj) != null;
        }

        @Override // p256j$.util.concurrent.AbstractC4969b, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.f18203a;
            C4979l[] c4979lArr = concurrentHashMap.f18187a;
            int length = c4979lArr == null ? 0 : c4979lArr.length;
            return new C4976i(c4979lArr, length, length, concurrentHashMap, 0);
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            Boolean bool = this.f18193b;
            if (bool != null) {
                return this.f18203a.m21316f(obj, bool, true) == null;
            }
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean addAll(java.util.Collection collection) {
            Boolean bool = this.f18193b;
            if (bool == null) {
                throw new UnsupportedOperationException();
            }
            Iterator it = collection.iterator();
            boolean z6 = false;
            while (it.hasNext()) {
                if (this.f18203a.m21316f(it.next(), bool, true) == null) {
                    z6 = true;
                }
            }
            return z6;
        }

        @Override // java.util.Collection, java.util.Set
        public final int hashCode() {
            Object it = iterator();
            int i7 = 0;
            while (((AbstractC4968a) it).hasNext()) {
                i7 += ((C4976i) it).next().hashCode();
            }
            return i7;
        }

        @Override // java.util.Collection, java.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, p256j$.util.Collection
        public final p256j$.util.Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.f18203a;
            long m21318j = concurrentHashMap.m21318j();
            C4979l[] c4979lArr = concurrentHashMap.f18187a;
            int length = c4979lArr == null ? 0 : c4979lArr.length;
            return new C4977j(c4979lArr, length, 0, length, m21318j < 0 ? 0L : m21318j, 0);
        }

        @Override // java.lang.Iterable, p256j$.util.Collection
        public final void forEach(Consumer consumer) {
            consumer.getClass();
            C4979l[] c4979lArr = this.f18203a.f18187a;
            if (c4979lArr == null) {
                return;
            }
            C4983p c4983p = new C4983p(c4979lArr, c4979lArr.length, 0, c4979lArr.length);
            while (true) {
                C4979l m21329a = c4983p.m21329a();
                if (m21329a == null) {
                    return;
                } else {
                    consumer.accept(m21329a.f18224b);
                }
            }
        }
    }
}
