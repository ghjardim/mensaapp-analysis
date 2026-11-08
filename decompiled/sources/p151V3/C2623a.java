package p151V3;

import org.apache.tika.utils.StringUtils;
import p151V3.AbstractC2626d;
import p151V3.C2625c;

/* renamed from: V3.a */
/* loaded from: classes.dex */
public final class C2623a extends AbstractC2626d {

    /* renamed from: b */
    public final String f7751b;

    /* renamed from: c */
    public final C2625c.a f7752c;

    /* renamed from: d */
    public final String f7753d;

    /* renamed from: e */
    public final String f7754e;

    /* renamed from: f */
    public final long f7755f;

    /* renamed from: g */
    public final long f7756g;

    /* renamed from: h */
    public final String f7757h;

    /* renamed from: V3.a$b */
    public static final class b extends AbstractC2626d.a {

        /* renamed from: a */
        public String f7758a;

        /* renamed from: b */
        public C2625c.a f7759b;

        /* renamed from: c */
        public String f7760c;

        /* renamed from: d */
        public String f7761d;

        /* renamed from: e */
        public Long f7762e;

        /* renamed from: f */
        public Long f7763f;

        /* renamed from: g */
        public String f7764g;

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: a */
        public AbstractC2626d mo9014a() {
            C2625c.a aVar = this.f7759b;
            String str = StringUtils.EMPTY;
            if (aVar == null) {
                str = StringUtils.EMPTY + " registrationStatus";
            }
            if (this.f7762e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f7763f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C2623a(this.f7758a, this.f7759b, this.f7760c, this.f7761d, this.f7762e.longValue(), this.f7763f.longValue(), this.f7764g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: b */
        public AbstractC2626d.a mo9015b(String str) {
            this.f7760c = str;
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: c */
        public AbstractC2626d.a mo9016c(long j7) {
            this.f7762e = Long.valueOf(j7);
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: d */
        public AbstractC2626d.a mo9017d(String str) {
            this.f7758a = str;
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: e */
        public AbstractC2626d.a mo9018e(String str) {
            this.f7764g = str;
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: f */
        public AbstractC2626d.a mo9019f(String str) {
            this.f7761d = str;
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: g */
        public AbstractC2626d.a mo9020g(C2625c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f7759b = aVar;
            return this;
        }

        @Override // p151V3.AbstractC2626d.a
        /* renamed from: h */
        public AbstractC2626d.a mo9021h(long j7) {
            this.f7763f = Long.valueOf(j7);
            return this;
        }

        public b() {
        }

        public b(AbstractC2626d abstractC2626d) {
            this.f7758a = abstractC2626d.mo9008d();
            this.f7759b = abstractC2626d.mo9011g();
            this.f7760c = abstractC2626d.mo9006b();
            this.f7761d = abstractC2626d.mo9010f();
            this.f7762e = Long.valueOf(abstractC2626d.mo9007c());
            this.f7763f = Long.valueOf(abstractC2626d.mo9012h());
            this.f7764g = abstractC2626d.mo9009e();
        }
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: b */
    public String mo9006b() {
        return this.f7753d;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: c */
    public long mo9007c() {
        return this.f7755f;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: d */
    public String mo9008d() {
        return this.f7751b;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: e */
    public String mo9009e() {
        return this.f7757h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2626d)) {
            return false;
        }
        AbstractC2626d abstractC2626d = (AbstractC2626d) obj;
        String str3 = this.f7751b;
        if (str3 != null ? str3.equals(abstractC2626d.mo9008d()) : abstractC2626d.mo9008d() == null) {
            if (this.f7752c.equals(abstractC2626d.mo9011g()) && ((str = this.f7753d) != null ? str.equals(abstractC2626d.mo9006b()) : abstractC2626d.mo9006b() == null) && ((str2 = this.f7754e) != null ? str2.equals(abstractC2626d.mo9010f()) : abstractC2626d.mo9010f() == null) && this.f7755f == abstractC2626d.mo9007c() && this.f7756g == abstractC2626d.mo9012h()) {
                String str4 = this.f7757h;
                if (str4 == null) {
                    if (abstractC2626d.mo9009e() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC2626d.mo9009e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: f */
    public String mo9010f() {
        return this.f7754e;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: g */
    public C2625c.a mo9011g() {
        return this.f7752c;
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: h */
    public long mo9012h() {
        return this.f7756g;
    }

    public int hashCode() {
        String str = this.f7751b;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f7752c.hashCode()) * 1000003;
        String str2 = this.f7753d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f7754e;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j7 = this.f7755f;
        int i7 = (hashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f7756g;
        int i8 = (i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003;
        String str4 = this.f7757h;
        return i8 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // p151V3.AbstractC2626d
    /* renamed from: n */
    public AbstractC2626d.a mo9013n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f7751b + ", registrationStatus=" + this.f7752c + ", authToken=" + this.f7753d + ", refreshToken=" + this.f7754e + ", expiresInSecs=" + this.f7755f + ", tokenCreationEpochInSecs=" + this.f7756g + ", fisError=" + this.f7757h + "}";
    }

    public C2623a(String str, C2625c.a aVar, String str2, String str3, long j7, long j8, String str4) {
        this.f7751b = str;
        this.f7752c = aVar;
        this.f7753d = str2;
        this.f7754e = str3;
        this.f7755f = j7;
        this.f7756g = j8;
        this.f7757h = str4;
    }
}
