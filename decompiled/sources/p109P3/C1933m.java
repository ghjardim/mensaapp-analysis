package p109P3;

import p109P3.C1916Z;

/* renamed from: P3.m */
/* loaded from: classes.dex */
public final class C1933m extends C1916Z.b {

    /* renamed from: a */
    public final int f5824a;

    /* renamed from: b */
    public final int f5825b;

    /* renamed from: c */
    public final String f5826c;

    /* renamed from: d */
    public final String f5827d;

    /* renamed from: e */
    public final C1916Z.a f5828e;

    public C1933m(int i7, int i8, String str, String str2, C1916Z.a aVar) {
        this.f5824a = i7;
        this.f5825b = i8;
        if (str == null) {
            throw new NullPointerException("Null projectId");
        }
        this.f5826c = str;
        if (str2 == null) {
            throw new NullPointerException("Null databaseId");
        }
        this.f5827d = str2;
        this.f5828e = aVar;
    }

    @Override // p109P3.C1916Z.b
    /* renamed from: a */
    public C1916Z.a mo6783a() {
        return this.f5828e;
    }

    @Override // p109P3.C1916Z.b
    /* renamed from: c */
    public String mo6784c() {
        return this.f5827d;
    }

    @Override // p109P3.C1916Z.b
    /* renamed from: d */
    public int mo6785d() {
        return this.f5825b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1916Z.b)) {
            return false;
        }
        C1916Z.b bVar = (C1916Z.b) obj;
        if (this.f5824a == bVar.mo6786f() && this.f5825b == bVar.mo6785d() && this.f5826c.equals(bVar.mo6787g()) && this.f5827d.equals(bVar.mo6784c())) {
            C1916Z.a aVar = this.f5828e;
            if (aVar == null) {
                if (bVar.mo6783a() == null) {
                    return true;
                }
            } else if (aVar.equals(bVar.mo6783a())) {
                return true;
            }
        }
        return false;
    }

    @Override // p109P3.C1916Z.b
    /* renamed from: f */
    public int mo6786f() {
        return this.f5824a;
    }

    @Override // p109P3.C1916Z.b
    /* renamed from: g */
    public String mo6787g() {
        return this.f5826c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f5824a ^ 1000003) * 1000003) ^ this.f5825b) * 1000003) ^ this.f5826c.hashCode()) * 1000003) ^ this.f5827d.hashCode()) * 1000003;
        C1916Z.a aVar = this.f5828e;
        return hashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "ExistenceFilterMismatchInfo{localCacheCount=" + this.f5824a + ", existenceFilterCount=" + this.f5825b + ", projectId=" + this.f5826c + ", databaseId=" + this.f5827d + ", bloomFilter=" + this.f5828e + "}";
    }
}
