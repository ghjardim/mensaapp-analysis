package p178Z2;

import p171Y2.AbstractC2932o;
import p256j$.util.Objects;

/* renamed from: Z2.O */
/* loaded from: classes.dex */
public class C3001O extends AbstractC3033v {

    /* renamed from: e */
    public static final AbstractC3033v f9183e = new C3001O(new Object[0], 0);

    /* renamed from: c */
    public final transient Object[] f9184c;

    /* renamed from: d */
    public final transient int f9185d;

    public C3001O(Object[] objArr, int i7) {
        this.f9184c = objArr;
        this.f9185d = i7;
    }

    @Override // p178Z2.AbstractC3033v, p178Z2.AbstractC3031t
    /* renamed from: b */
    public int mo10852b(Object[] objArr, int i7) {
        System.arraycopy(this.f9184c, 0, objArr, i7, this.f9185d);
        return i7 + this.f9185d;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: e */
    public Object[] mo10853e() {
        return this.f9184c;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: f */
    public int mo10854f() {
        return this.f9185d;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: g */
    public int mo10855g() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i7) {
        AbstractC2932o.m10570m(i7, this.f9185d);
        Object obj = this.f9184c[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: h */
    public boolean mo10856h() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f9185d;
    }
}
