package p088M3;

import p088M3.AbstractC1175q;

/* renamed from: M3.d */
/* loaded from: classes.dex */
public final class C1162d extends AbstractC1175q.c {

    /* renamed from: a */
    public final C1176r f3751a;

    /* renamed from: b */
    public final AbstractC1175q.c.a f3752b;

    public C1162d(C1176r c1176r, AbstractC1175q.c.a aVar) {
        if (c1176r == null) {
            throw new NullPointerException("Null fieldPath");
        }
        this.f3751a = c1176r;
        if (aVar == null) {
            throw new NullPointerException("Null kind");
        }
        this.f3752b = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1175q.c)) {
            return false;
        }
        AbstractC1175q.c cVar = (AbstractC1175q.c) obj;
        return this.f3751a.equals(cVar.mo4457g()) && this.f3752b.equals(cVar.mo4458h());
    }

    @Override // p088M3.AbstractC1175q.c
    /* renamed from: g */
    public C1176r mo4457g() {
        return this.f3751a;
    }

    @Override // p088M3.AbstractC1175q.c
    /* renamed from: h */
    public AbstractC1175q.c.a mo4458h() {
        return this.f3752b;
    }

    public int hashCode() {
        return ((this.f3751a.hashCode() ^ 1000003) * 1000003) ^ this.f3752b.hashCode();
    }

    public String toString() {
        return "Segment{fieldPath=" + this.f3751a + ", kind=" + this.f3752b + "}";
    }
}
