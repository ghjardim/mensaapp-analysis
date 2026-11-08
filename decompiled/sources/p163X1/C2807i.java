package p163X1;

import p163X1.AbstractC2813o;

/* renamed from: X1.i */
/* loaded from: classes.dex */
public final class C2807i extends AbstractC2813o {

    /* renamed from: a */
    public final AbstractC2813o.c f8631a;

    /* renamed from: b */
    public final AbstractC2813o.b f8632b;

    /* renamed from: X1.i$b */
    public static final class b extends AbstractC2813o.a {

        /* renamed from: a */
        public AbstractC2813o.c f8633a;

        /* renamed from: b */
        public AbstractC2813o.b f8634b;

        @Override // p163X1.AbstractC2813o.a
        /* renamed from: a */
        public AbstractC2813o mo10050a() {
            return new C2807i(this.f8633a, this.f8634b);
        }

        @Override // p163X1.AbstractC2813o.a
        /* renamed from: b */
        public AbstractC2813o.a mo10051b(AbstractC2813o.b bVar) {
            this.f8634b = bVar;
            return this;
        }

        @Override // p163X1.AbstractC2813o.a
        /* renamed from: c */
        public AbstractC2813o.a mo10052c(AbstractC2813o.c cVar) {
            this.f8633a = cVar;
            return this;
        }
    }

    @Override // p163X1.AbstractC2813o
    /* renamed from: b */
    public AbstractC2813o.b mo10048b() {
        return this.f8632b;
    }

    @Override // p163X1.AbstractC2813o
    /* renamed from: c */
    public AbstractC2813o.c mo10049c() {
        return this.f8631a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2813o)) {
            return false;
        }
        AbstractC2813o abstractC2813o = (AbstractC2813o) obj;
        AbstractC2813o.c cVar = this.f8631a;
        if (cVar != null ? cVar.equals(abstractC2813o.mo10049c()) : abstractC2813o.mo10049c() == null) {
            AbstractC2813o.b bVar = this.f8632b;
            if (bVar == null) {
                if (abstractC2813o.mo10048b() == null) {
                    return true;
                }
            } else if (bVar.equals(abstractC2813o.mo10048b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2813o.c cVar = this.f8631a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2813o.b bVar = this.f8632b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f8631a + ", mobileSubtype=" + this.f8632b + "}";
    }

    public C2807i(AbstractC2813o.c cVar, AbstractC2813o.b bVar) {
        this.f8631a = cVar;
        this.f8632b = bVar;
    }
}
