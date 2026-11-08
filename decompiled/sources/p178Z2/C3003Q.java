package p178Z2;

/* renamed from: Z2.Q */
/* loaded from: classes.dex */
public final class C3003Q extends AbstractC3037z {

    /* renamed from: o */
    public static final Object[] f9200o;

    /* renamed from: p */
    public static final C3003Q f9201p;

    /* renamed from: c */
    public final transient Object[] f9202c;

    /* renamed from: d */
    public final transient int f9203d;

    /* renamed from: e */
    public final transient Object[] f9204e;

    /* renamed from: f */
    public final transient int f9205f;

    /* renamed from: n */
    public final transient int f9206n;

    static {
        Object[] objArr = new Object[0];
        f9200o = objArr;
        f9201p = new C3003Q(objArr, 0, objArr, 0, 0);
    }

    public C3003Q(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f9202c = objArr;
        this.f9203d = i7;
        this.f9204e = objArr2;
        this.f9205f = i8;
        this.f9206n = i9;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: b */
    public int mo10852b(Object[] objArr, int i7) {
        System.arraycopy(this.f9202c, 0, objArr, i7, this.f9206n);
        return i7 + this.f9206n;
    }

    @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f9204e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m11033c = AbstractC3030s.m11033c(obj);
        while (true) {
            int i7 = m11033c & this.f9205f;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m11033c = i7 + 1;
        }
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: e */
    public Object[] mo10853e() {
        return this.f9202c;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: f */
    public int mo10854f() {
        return this.f9206n;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: g */
    public int mo10855g() {
        return 0;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: h */
    public boolean mo10856h() {
        return false;
    }

    @Override // p178Z2.AbstractC3037z, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f9203d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public AbstractC3010Y iterator() {
        return mo10871a().iterator();
    }

    @Override // p178Z2.AbstractC3037z
    /* renamed from: q */
    public AbstractC3033v mo10869q() {
        return AbstractC3033v.m11044l(this.f9202c, this.f9206n);
    }

    @Override // p178Z2.AbstractC3037z
    /* renamed from: r */
    public boolean mo10872r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f9206n;
    }
}
