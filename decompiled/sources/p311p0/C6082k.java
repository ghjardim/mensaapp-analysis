package p311p0;

/* renamed from: p0.k */
/* loaded from: classes.dex */
public final class C6082k {

    /* renamed from: d */
    public static final C6082k f21741d = new b().m25397d();

    /* renamed from: a */
    public final boolean f21742a;

    /* renamed from: b */
    public final boolean f21743b;

    /* renamed from: c */
    public final boolean f21744c;

    /* renamed from: p0.k$b */
    public static final class b {

        /* renamed from: a */
        public boolean f21745a;

        /* renamed from: b */
        public boolean f21746b;

        /* renamed from: c */
        public boolean f21747c;

        /* renamed from: d */
        public C6082k m25397d() {
            if (this.f21745a || !(this.f21746b || this.f21747c)) {
                return new C6082k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        /* renamed from: e */
        public b m25398e(boolean z6) {
            this.f21745a = z6;
            return this;
        }

        /* renamed from: f */
        public b m25399f(boolean z6) {
            this.f21746b = z6;
            return this;
        }

        /* renamed from: g */
        public b m25400g(boolean z6) {
            this.f21747c = z6;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6082k.class != obj.getClass()) {
            return false;
        }
        C6082k c6082k = (C6082k) obj;
        return this.f21742a == c6082k.f21742a && this.f21743b == c6082k.f21743b && this.f21744c == c6082k.f21744c;
    }

    public int hashCode() {
        return ((this.f21742a ? 1 : 0) << 2) + ((this.f21743b ? 1 : 0) << 1) + (this.f21744c ? 1 : 0);
    }

    public C6082k(b bVar) {
        this.f21742a = bVar.f21745a;
        this.f21743b = bVar.f21746b;
        this.f21744c = bVar.f21747c;
    }
}
