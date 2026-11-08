package p158W3;

import org.apache.tika.utils.StringUtils;
import p158W3.AbstractC2706f;

/* renamed from: W3.b */
/* loaded from: classes.dex */
public final class C2702b extends AbstractC2706f {

    /* renamed from: a */
    public final String f7952a;

    /* renamed from: b */
    public final long f7953b;

    /* renamed from: c */
    public final AbstractC2706f.b f7954c;

    /* renamed from: W3.b$b */
    public static final class b extends AbstractC2706f.a {

        /* renamed from: a */
        public String f7955a;

        /* renamed from: b */
        public Long f7956b;

        /* renamed from: c */
        public AbstractC2706f.b f7957c;

        @Override // p158W3.AbstractC2706f.a
        /* renamed from: a */
        public AbstractC2706f mo9215a() {
            Long l7 = this.f7956b;
            String str = StringUtils.EMPTY;
            if (l7 == null) {
                str = StringUtils.EMPTY + " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new C2702b(this.f7955a, this.f7956b.longValue(), this.f7957c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p158W3.AbstractC2706f.a
        /* renamed from: b */
        public AbstractC2706f.a mo9216b(AbstractC2706f.b bVar) {
            this.f7957c = bVar;
            return this;
        }

        @Override // p158W3.AbstractC2706f.a
        /* renamed from: c */
        public AbstractC2706f.a mo9217c(String str) {
            this.f7955a = str;
            return this;
        }

        @Override // p158W3.AbstractC2706f.a
        /* renamed from: d */
        public AbstractC2706f.a mo9218d(long j7) {
            this.f7956b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p158W3.AbstractC2706f
    /* renamed from: b */
    public AbstractC2706f.b mo9212b() {
        return this.f7954c;
    }

    @Override // p158W3.AbstractC2706f
    /* renamed from: c */
    public String mo9213c() {
        return this.f7952a;
    }

    @Override // p158W3.AbstractC2706f
    /* renamed from: d */
    public long mo9214d() {
        return this.f7953b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2706f)) {
            return false;
        }
        AbstractC2706f abstractC2706f = (AbstractC2706f) obj;
        String str = this.f7952a;
        if (str != null ? str.equals(abstractC2706f.mo9213c()) : abstractC2706f.mo9213c() == null) {
            if (this.f7953b == abstractC2706f.mo9214d()) {
                AbstractC2706f.b bVar = this.f7954c;
                if (bVar == null) {
                    if (abstractC2706f.mo9212b() == null) {
                        return true;
                    }
                } else if (bVar.equals(abstractC2706f.mo9212b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f7952a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j7 = this.f7953b;
        int i7 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        AbstractC2706f.b bVar = this.f7954c;
        return i7 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f7952a + ", tokenExpirationTimestamp=" + this.f7953b + ", responseCode=" + this.f7954c + "}";
    }

    public C2702b(String str, long j7, AbstractC2706f.b bVar) {
        this.f7952a = str;
        this.f7953b = j7;
        this.f7954c = bVar;
    }
}
