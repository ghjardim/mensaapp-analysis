package p163X1;

import p163X1.AbstractC2809k;

/* renamed from: X1.e */
/* loaded from: classes.dex */
public final class C2803e extends AbstractC2809k {

    /* renamed from: a */
    public final AbstractC2809k.b f8598a;

    /* renamed from: b */
    public final AbstractC2799a f8599b;

    /* renamed from: X1.e$b */
    public static final class b extends AbstractC2809k.a {

        /* renamed from: a */
        public AbstractC2809k.b f8600a;

        /* renamed from: b */
        public AbstractC2799a f8601b;

        @Override // p163X1.AbstractC2809k.a
        /* renamed from: a */
        public AbstractC2809k mo10014a() {
            return new C2803e(this.f8600a, this.f8601b);
        }

        @Override // p163X1.AbstractC2809k.a
        /* renamed from: b */
        public AbstractC2809k.a mo10015b(AbstractC2799a abstractC2799a) {
            this.f8601b = abstractC2799a;
            return this;
        }

        @Override // p163X1.AbstractC2809k.a
        /* renamed from: c */
        public AbstractC2809k.a mo10016c(AbstractC2809k.b bVar) {
            this.f8600a = bVar;
            return this;
        }
    }

    @Override // p163X1.AbstractC2809k
    /* renamed from: b */
    public AbstractC2799a mo10012b() {
        return this.f8599b;
    }

    @Override // p163X1.AbstractC2809k
    /* renamed from: c */
    public AbstractC2809k.b mo10013c() {
        return this.f8598a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2809k)) {
            return false;
        }
        AbstractC2809k abstractC2809k = (AbstractC2809k) obj;
        AbstractC2809k.b bVar = this.f8598a;
        if (bVar != null ? bVar.equals(abstractC2809k.mo10013c()) : abstractC2809k.mo10013c() == null) {
            AbstractC2799a abstractC2799a = this.f8599b;
            if (abstractC2799a == null) {
                if (abstractC2809k.mo10012b() == null) {
                    return true;
                }
            } else if (abstractC2799a.equals(abstractC2809k.mo10012b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        AbstractC2809k.b bVar = this.f8598a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        AbstractC2799a abstractC2799a = this.f8599b;
        return hashCode ^ (abstractC2799a != null ? abstractC2799a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f8598a + ", androidClientInfo=" + this.f8599b + "}";
    }

    public C2803e(AbstractC2809k.b bVar, AbstractC2799a abstractC2799a) {
        this.f8598a = bVar;
        this.f8599b = abstractC2799a;
    }
}
