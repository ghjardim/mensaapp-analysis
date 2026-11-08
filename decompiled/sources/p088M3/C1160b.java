package p088M3;

import p088M3.AbstractC1175q;

/* renamed from: M3.b */
/* loaded from: classes.dex */
public final class C1160b extends AbstractC1175q.a {

    /* renamed from: c */
    public final C1181w f3746c;

    /* renamed from: d */
    public final C1170l f3747d;

    /* renamed from: e */
    public final int f3748e;

    public C1160b(C1181w c1181w, C1170l c1170l, int i7) {
        if (c1181w == null) {
            throw new NullPointerException("Null readTime");
        }
        this.f3746c = c1181w;
        if (c1170l == null) {
            throw new NullPointerException("Null documentKey");
        }
        this.f3747d = c1170l;
        this.f3748e = i7;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1175q.a)) {
            return false;
        }
        AbstractC1175q.a aVar = (AbstractC1175q.a) obj;
        return this.f3746c.equals(aVar.mo4454l()) && this.f3747d.equals(aVar.mo4452j()) && this.f3748e == aVar.mo4453k();
    }

    public int hashCode() {
        return ((((this.f3746c.hashCode() ^ 1000003) * 1000003) ^ this.f3747d.hashCode()) * 1000003) ^ this.f3748e;
    }

    @Override // p088M3.AbstractC1175q.a
    /* renamed from: j */
    public C1170l mo4452j() {
        return this.f3747d;
    }

    @Override // p088M3.AbstractC1175q.a
    /* renamed from: k */
    public int mo4453k() {
        return this.f3748e;
    }

    @Override // p088M3.AbstractC1175q.a
    /* renamed from: l */
    public C1181w mo4454l() {
        return this.f3746c;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f3746c + ", documentKey=" + this.f3747d + ", largestBatchId=" + this.f3748e + "}";
    }
}
