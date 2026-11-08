package p158W3;

import p158W3.AbstractC2704d;

/* renamed from: W3.a */
/* loaded from: classes.dex */
public final class C2701a extends AbstractC2704d {

    /* renamed from: a */
    public final String f7942a;

    /* renamed from: b */
    public final String f7943b;

    /* renamed from: c */
    public final String f7944c;

    /* renamed from: d */
    public final AbstractC2706f f7945d;

    /* renamed from: e */
    public final AbstractC2704d.b f7946e;

    /* renamed from: W3.a$b */
    public static final class b extends AbstractC2704d.a {

        /* renamed from: a */
        public String f7947a;

        /* renamed from: b */
        public String f7948b;

        /* renamed from: c */
        public String f7949c;

        /* renamed from: d */
        public AbstractC2706f f7950d;

        /* renamed from: e */
        public AbstractC2704d.b f7951e;

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: a */
        public AbstractC2704d mo9206a() {
            return new C2701a(this.f7947a, this.f7948b, this.f7949c, this.f7950d, this.f7951e);
        }

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: b */
        public AbstractC2704d.a mo9207b(AbstractC2706f abstractC2706f) {
            this.f7950d = abstractC2706f;
            return this;
        }

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: c */
        public AbstractC2704d.a mo9208c(String str) {
            this.f7948b = str;
            return this;
        }

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: d */
        public AbstractC2704d.a mo9209d(String str) {
            this.f7949c = str;
            return this;
        }

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: e */
        public AbstractC2704d.a mo9210e(AbstractC2704d.b bVar) {
            this.f7951e = bVar;
            return this;
        }

        @Override // p158W3.AbstractC2704d.a
        /* renamed from: f */
        public AbstractC2704d.a mo9211f(String str) {
            this.f7947a = str;
            return this;
        }
    }

    @Override // p158W3.AbstractC2704d
    /* renamed from: b */
    public AbstractC2706f mo9201b() {
        return this.f7945d;
    }

    @Override // p158W3.AbstractC2704d
    /* renamed from: c */
    public String mo9202c() {
        return this.f7943b;
    }

    @Override // p158W3.AbstractC2704d
    /* renamed from: d */
    public String mo9203d() {
        return this.f7944c;
    }

    @Override // p158W3.AbstractC2704d
    /* renamed from: e */
    public AbstractC2704d.b mo9204e() {
        return this.f7946e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2704d)) {
            return false;
        }
        AbstractC2704d abstractC2704d = (AbstractC2704d) obj;
        String str = this.f7942a;
        if (str != null ? str.equals(abstractC2704d.mo9205f()) : abstractC2704d.mo9205f() == null) {
            String str2 = this.f7943b;
            if (str2 != null ? str2.equals(abstractC2704d.mo9202c()) : abstractC2704d.mo9202c() == null) {
                String str3 = this.f7944c;
                if (str3 != null ? str3.equals(abstractC2704d.mo9203d()) : abstractC2704d.mo9203d() == null) {
                    AbstractC2706f abstractC2706f = this.f7945d;
                    if (abstractC2706f != null ? abstractC2706f.equals(abstractC2704d.mo9201b()) : abstractC2704d.mo9201b() == null) {
                        AbstractC2704d.b bVar = this.f7946e;
                        if (bVar == null) {
                            if (abstractC2704d.mo9204e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(abstractC2704d.mo9204e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p158W3.AbstractC2704d
    /* renamed from: f */
    public String mo9205f() {
        return this.f7942a;
    }

    public int hashCode() {
        String str = this.f7942a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f7943b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7944c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        AbstractC2706f abstractC2706f = this.f7945d;
        int hashCode4 = (hashCode3 ^ (abstractC2706f == null ? 0 : abstractC2706f.hashCode())) * 1000003;
        AbstractC2704d.b bVar = this.f7946e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f7942a + ", fid=" + this.f7943b + ", refreshToken=" + this.f7944c + ", authToken=" + this.f7945d + ", responseCode=" + this.f7946e + "}";
    }

    public C2701a(String str, String str2, String str3, AbstractC2706f abstractC2706f, AbstractC2704d.b bVar) {
        this.f7942a = str;
        this.f7943b = str2;
        this.f7944c = str3;
        this.f7945d = abstractC2706f;
        this.f7946e = bVar;
    }
}
