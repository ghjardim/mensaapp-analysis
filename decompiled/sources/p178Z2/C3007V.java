package p178Z2;

import p171Y2.AbstractC2932o;

/* renamed from: Z2.V */
/* loaded from: classes.dex */
public final class C3007V extends AbstractC3037z {

    /* renamed from: c */
    public final transient Object f9218c;

    public C3007V(Object obj) {
        this.f9218c = AbstractC2932o.m10572o(obj);
    }

    @Override // p178Z2.AbstractC3037z, p178Z2.AbstractC3031t
    /* renamed from: a */
    public AbstractC3033v mo10871a() {
        return AbstractC3033v.m11051u(this.f9218c);
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: b */
    public int mo10852b(Object[] objArr, int i7) {
        objArr[i7] = this.f9218c;
        return i7 + 1;
    }

    @Override // p178Z2.AbstractC3031t, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9218c.equals(obj);
    }

    @Override // p178Z2.AbstractC3031t
    /* renamed from: h */
    public boolean mo10856h() {
        return false;
    }

    @Override // p178Z2.AbstractC3037z, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9218c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: i */
    public AbstractC3010Y iterator() {
        return AbstractC2988B.m10777s(this.f9218c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f9218c.toString() + ']';
    }
}
