package p088M3;

import java.util.List;
import p088M3.AbstractC1175q;

/* renamed from: M3.a */
/* loaded from: classes.dex */
public final class C1159a extends AbstractC1175q {

    /* renamed from: c */
    public final int f3742c;

    /* renamed from: d */
    public final String f3743d;

    /* renamed from: e */
    public final List f3744e;

    /* renamed from: f */
    public final AbstractC1175q.b f3745f;

    public C1159a(int i7, String str, List list, AbstractC1175q.b bVar) {
        this.f3742c = i7;
        if (str == null) {
            throw new NullPointerException("Null collectionGroup");
        }
        this.f3743d = str;
        if (list == null) {
            throw new NullPointerException("Null segments");
        }
        this.f3744e = list;
        if (bVar == null) {
            throw new NullPointerException("Null indexState");
        }
        this.f3745f = bVar;
    }

    @Override // p088M3.AbstractC1175q
    /* renamed from: d */
    public String mo4448d() {
        return this.f3743d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1175q)) {
            return false;
        }
        AbstractC1175q abstractC1175q = (AbstractC1175q) obj;
        return this.f3742c == abstractC1175q.mo4449f() && this.f3743d.equals(abstractC1175q.mo4448d()) && this.f3744e.equals(abstractC1175q.mo4451h()) && this.f3745f.equals(abstractC1175q.mo4450g());
    }

    @Override // p088M3.AbstractC1175q
    /* renamed from: f */
    public int mo4449f() {
        return this.f3742c;
    }

    @Override // p088M3.AbstractC1175q
    /* renamed from: g */
    public AbstractC1175q.b mo4450g() {
        return this.f3745f;
    }

    @Override // p088M3.AbstractC1175q
    /* renamed from: h */
    public List mo4451h() {
        return this.f3744e;
    }

    public int hashCode() {
        return ((((((this.f3742c ^ 1000003) * 1000003) ^ this.f3743d.hashCode()) * 1000003) ^ this.f3744e.hashCode()) * 1000003) ^ this.f3745f.hashCode();
    }

    public String toString() {
        return "FieldIndex{indexId=" + this.f3742c + ", collectionGroup=" + this.f3743d + ", segments=" + this.f3744e + ", indexState=" + this.f3745f + "}";
    }
}
