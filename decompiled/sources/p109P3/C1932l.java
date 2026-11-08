package p109P3;

import p109P3.C1916Z;

/* renamed from: P3.l */
/* loaded from: classes.dex */
public final class C1932l extends C1916Z.a {

    /* renamed from: a */
    public final C1934n f5819a;

    /* renamed from: b */
    public final boolean f5820b;

    /* renamed from: c */
    public final int f5821c;

    /* renamed from: d */
    public final int f5822d;

    /* renamed from: e */
    public final int f5823e;

    public C1932l(C1934n c1934n, boolean z6, int i7, int i8, int i9) {
        this.f5819a = c1934n;
        this.f5820b = z6;
        this.f5821c = i7;
        this.f5822d = i8;
        this.f5823e = i9;
    }

    @Override // p109P3.C1916Z.a
    /* renamed from: a */
    public boolean mo6776a() {
        return this.f5820b;
    }

    @Override // p109P3.C1916Z.a
    /* renamed from: b */
    public int mo6777b() {
        return this.f5822d;
    }

    @Override // p109P3.C1916Z.a
    /* renamed from: c */
    public C1934n mo6778c() {
        return this.f5819a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1916Z.a)) {
            return false;
        }
        C1916Z.a aVar = (C1916Z.a) obj;
        C1934n c1934n = this.f5819a;
        if (c1934n != null ? c1934n.equals(aVar.mo6778c()) : aVar.mo6778c() == null) {
            if (this.f5820b == aVar.mo6776a() && this.f5821c == aVar.mo6779f() && this.f5822d == aVar.mo6777b() && this.f5823e == aVar.mo6780g()) {
                return true;
            }
        }
        return false;
    }

    @Override // p109P3.C1916Z.a
    /* renamed from: f */
    public int mo6779f() {
        return this.f5821c;
    }

    @Override // p109P3.C1916Z.a
    /* renamed from: g */
    public int mo6780g() {
        return this.f5823e;
    }

    public int hashCode() {
        C1934n c1934n = this.f5819a;
        return (((((((((c1934n == null ? 0 : c1934n.hashCode()) ^ 1000003) * 1000003) ^ (this.f5820b ? 1231 : 1237)) * 1000003) ^ this.f5821c) * 1000003) ^ this.f5822d) * 1000003) ^ this.f5823e;
    }

    public String toString() {
        return "ExistenceFilterBloomFilterInfo{bloomFilter=" + this.f5819a + ", applied=" + this.f5820b + ", hashCount=" + this.f5821c + ", bitmapLength=" + this.f5822d + ", padding=" + this.f5823e + "}";
    }
}
