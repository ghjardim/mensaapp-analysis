package p178Z2;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import org.apache.tika.fork.ForkServer;
import p171Y2.AbstractC2932o;
import p178Z2.AbstractC3035x;
import p256j$.util.Objects;

/* renamed from: Z2.P */
/* loaded from: classes.dex */
public final class C3002P extends AbstractC3035x {

    /* renamed from: o */
    public static final AbstractC3035x f9186o = new C3002P(null, new Object[0], 0);

    /* renamed from: e */
    public final transient Object f9187e;

    /* renamed from: f */
    public final transient Object[] f9188f;

    /* renamed from: n */
    public final transient int f9189n;

    /* renamed from: Z2.P$a */
    public static class a extends AbstractC3037z {

        /* renamed from: c */
        public final transient AbstractC3035x f9190c;

        /* renamed from: d */
        public final transient Object[] f9191d;

        /* renamed from: e */
        public final transient int f9192e;

        /* renamed from: f */
        public final transient int f9193f;

        /* renamed from: Z2.P$a$a, reason: collision with other inner class name */
        public class C7194a extends AbstractC3033v {
            public C7194a() {
            }

            @Override // java.util.List
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Map.Entry get(int i7) {
                AbstractC2932o.m10570m(i7, a.this.f9193f);
                int i8 = i7 * 2;
                Object obj = a.this.f9191d[a.this.f9192e + i8];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f9191d[i8 + (a.this.f9192e ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // p178Z2.AbstractC3031t
            /* renamed from: h */
            public boolean mo10856h() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f9193f;
            }
        }

        public a(AbstractC3035x abstractC3035x, Object[] objArr, int i7, int i8) {
            this.f9190c = abstractC3035x;
            this.f9191d = objArr;
            this.f9192e = i7;
            this.f9193f = i8;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: b */
        public int mo10852b(Object[] objArr, int i7) {
            return mo10871a().mo10852b(objArr, i7);
        }

        @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f9190c.get(key));
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: h */
        public boolean mo10856h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public AbstractC3010Y iterator() {
            return mo10871a().iterator();
        }

        @Override // p178Z2.AbstractC3037z
        /* renamed from: q */
        public AbstractC3033v mo10869q() {
            return new C7194a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9193f;
        }
    }

    /* renamed from: Z2.P$b */
    public static final class b extends AbstractC3037z {

        /* renamed from: c */
        public final transient AbstractC3035x f9195c;

        /* renamed from: d */
        public final transient AbstractC3033v f9196d;

        public b(AbstractC3035x abstractC3035x, AbstractC3033v abstractC3033v) {
            this.f9195c = abstractC3035x;
            this.f9196d = abstractC3033v;
        }

        @Override // p178Z2.AbstractC3037z, p178Z2.AbstractC3031t
        /* renamed from: a */
        public AbstractC3033v mo10871a() {
            return this.f9196d;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: b */
        public int mo10852b(Object[] objArr, int i7) {
            return mo10871a().mo10852b(objArr, i7);
        }

        @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f9195c.get(obj) != null;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: h */
        public boolean mo10856h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: i */
        public AbstractC3010Y iterator() {
            return mo10871a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f9195c.size();
        }
    }

    /* renamed from: Z2.P$c */
    public static final class c extends AbstractC3033v {

        /* renamed from: c */
        public final transient Object[] f9197c;

        /* renamed from: d */
        public final transient int f9198d;

        /* renamed from: e */
        public final transient int f9199e;

        public c(Object[] objArr, int i7, int i8) {
            this.f9197c = objArr;
            this.f9198d = i7;
            this.f9199e = i8;
        }

        @Override // java.util.List
        public Object get(int i7) {
            AbstractC2932o.m10570m(i7, this.f9199e);
            Object obj = this.f9197c[(i7 * 2) + this.f9198d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // p178Z2.AbstractC3031t
        /* renamed from: h */
        public boolean mo10856h() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f9199e;
        }
    }

    public C3002P(Object obj, Object[] objArr, int i7) {
        this.f9187e = obj;
        this.f9188f = objArr;
        this.f9189n = i7;
    }

    /* renamed from: p */
    public static C3002P m10857p(int i7, Object[] objArr) {
        return m10858q(i7, objArr, null);
    }

    /* renamed from: q */
    public static C3002P m10858q(int i7, Object[] objArr, AbstractC3035x.a aVar) {
        if (i7 == 0) {
            return (C3002P) f9186o;
        }
        if (i7 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            AbstractC3020i.m10942a(obj, obj2);
            return new C3002P(null, objArr, 1);
        }
        AbstractC2932o.m10575r(i7, objArr.length >> 1);
        Object m10859r = m10859r(objArr, i7, AbstractC3037z.m11104m(i7), 0);
        if (m10859r instanceof Object[]) {
            Object[] objArr2 = (Object[]) m10859r;
            AbstractC3035x.a.C7196a c7196a = (AbstractC3035x.a.C7196a) objArr2[2];
            if (aVar == null) {
                throw c7196a.m11090a();
            }
            aVar.f9321e = c7196a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            m10859r = obj3;
            i7 = intValue;
        }
        return new C3002P(m10859r, objArr, i7);
    }

    /* renamed from: r */
    public static Object m10859r(Object[] objArr, int i7, int i8, int i9) {
        AbstractC3035x.a.C7196a c7196a = null;
        if (i7 == 1) {
            Object obj = objArr[i9];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i9 ^ 1];
            Objects.requireNonNull(obj2);
            AbstractC3020i.m10942a(obj, obj2);
            return null;
        }
        int i10 = i8 - 1;
        int i11 = -1;
        if (i8 <= 128) {
            byte[] bArr = new byte[i8];
            Arrays.fill(bArr, (byte) -1);
            int i12 = 0;
            for (int i13 = 0; i13 < i7; i13++) {
                int i14 = (i13 * 2) + i9;
                int i15 = (i12 * 2) + i9;
                Object obj3 = objArr[i14];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i14 ^ 1];
                Objects.requireNonNull(obj4);
                AbstractC3020i.m10942a(obj3, obj4);
                int m11032b = AbstractC3030s.m11032b(obj3.hashCode());
                while (true) {
                    int i16 = m11032b & i10;
                    int i17 = bArr[i16] & ForkServer.ERROR;
                    if (i17 == 255) {
                        bArr[i16] = (byte) i15;
                        if (i12 < i13) {
                            objArr[i15] = obj3;
                            objArr[i15 ^ 1] = obj4;
                        }
                        i12++;
                    } else {
                        if (obj3.equals(objArr[i17])) {
                            int i18 = i17 ^ 1;
                            Object obj5 = objArr[i18];
                            Objects.requireNonNull(obj5);
                            c7196a = new AbstractC3035x.a.C7196a(obj3, obj4, obj5);
                            objArr[i18] = obj4;
                            break;
                        }
                        m11032b = i16 + 1;
                    }
                }
            }
            return i12 == i7 ? bArr : new Object[]{bArr, Integer.valueOf(i12), c7196a};
        }
        if (i8 <= 32768) {
            short[] sArr = new short[i8];
            Arrays.fill(sArr, (short) -1);
            int i19 = 0;
            for (int i20 = 0; i20 < i7; i20++) {
                int i21 = (i20 * 2) + i9;
                int i22 = (i19 * 2) + i9;
                Object obj6 = objArr[i21];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i21 ^ 1];
                Objects.requireNonNull(obj7);
                AbstractC3020i.m10942a(obj6, obj7);
                int m11032b2 = AbstractC3030s.m11032b(obj6.hashCode());
                while (true) {
                    int i23 = m11032b2 & i10;
                    int i24 = sArr[i23] & 65535;
                    if (i24 == 65535) {
                        sArr[i23] = (short) i22;
                        if (i19 < i20) {
                            objArr[i22] = obj6;
                            objArr[i22 ^ 1] = obj7;
                        }
                        i19++;
                    } else {
                        if (obj6.equals(objArr[i24])) {
                            int i25 = i24 ^ 1;
                            Object obj8 = objArr[i25];
                            Objects.requireNonNull(obj8);
                            c7196a = new AbstractC3035x.a.C7196a(obj6, obj7, obj8);
                            objArr[i25] = obj7;
                            break;
                        }
                        m11032b2 = i23 + 1;
                    }
                }
            }
            return i19 == i7 ? sArr : new Object[]{sArr, Integer.valueOf(i19), c7196a};
        }
        int[] iArr = new int[i8];
        Arrays.fill(iArr, -1);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i7) {
            int i28 = (i26 * 2) + i9;
            int i29 = (i27 * 2) + i9;
            Object obj9 = objArr[i28];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i28 ^ 1];
            Objects.requireNonNull(obj10);
            AbstractC3020i.m10942a(obj9, obj10);
            int m11032b3 = AbstractC3030s.m11032b(obj9.hashCode());
            while (true) {
                int i30 = m11032b3 & i10;
                int i31 = iArr[i30];
                if (i31 == i11) {
                    iArr[i30] = i29;
                    if (i27 < i26) {
                        objArr[i29] = obj9;
                        objArr[i29 ^ 1] = obj10;
                    }
                    i27++;
                } else {
                    if (obj9.equals(objArr[i31])) {
                        int i32 = i31 ^ 1;
                        Object obj11 = objArr[i32];
                        Objects.requireNonNull(obj11);
                        c7196a = new AbstractC3035x.a.C7196a(obj9, obj10, obj11);
                        objArr[i32] = obj10;
                        break;
                    }
                    m11032b3 = i30 + 1;
                    i11 = -1;
                }
            }
            i26++;
            i11 = -1;
        }
        return i27 == i7 ? iArr : new Object[]{iArr, Integer.valueOf(i27), c7196a};
    }

    /* renamed from: s */
    public static Object m10860s(Object obj, Object[] objArr, int i7, int i8, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i7 == 1) {
            Object obj3 = objArr[i8];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i8 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int m11032b = AbstractC3030s.m11032b(obj2.hashCode());
            while (true) {
                int i9 = m11032b & length;
                int i10 = bArr[i9] & ForkServer.ERROR;
                if (i10 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i10])) {
                    return objArr[i10 ^ 1];
                }
                m11032b = i9 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int m11032b2 = AbstractC3030s.m11032b(obj2.hashCode());
            while (true) {
                int i11 = m11032b2 & length2;
                int i12 = sArr[i11] & 65535;
                if (i12 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i12])) {
                    return objArr[i12 ^ 1];
                }
                m11032b2 = i11 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int m11032b3 = AbstractC3030s.m11032b(obj2.hashCode());
            while (true) {
                int i13 = m11032b3 & length3;
                int i14 = iArr[i13];
                if (i14 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i14])) {
                    return objArr[i14 ^ 1];
                }
                m11032b3 = i13 + 1;
            }
        }
    }

    @Override // p178Z2.AbstractC3035x
    /* renamed from: d */
    public AbstractC3037z mo10861d() {
        return new a(this, this.f9188f, 0, this.f9189n);
    }

    @Override // p178Z2.AbstractC3035x
    /* renamed from: e */
    public AbstractC3037z mo10862e() {
        return new b(this, new c(this.f9188f, 0, this.f9189n));
    }

    @Override // p178Z2.AbstractC3035x
    /* renamed from: f */
    public AbstractC3031t mo10863f() {
        return new c(this.f9188f, 1, this.f9189n);
    }

    @Override // p178Z2.AbstractC3035x, java.util.Map
    public Object get(Object obj) {
        Object m10860s = m10860s(this.f9187e, this.f9188f, this.f9189n, 0, obj);
        if (m10860s == null) {
            return null;
        }
        return m10860s;
    }

    @Override // p178Z2.AbstractC3035x
    /* renamed from: h */
    public boolean mo10864h() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f9189n;
    }
}
