package p226f2;

import java.util.Set;
import org.apache.tika.utils.StringUtils;
import p226f2.AbstractC4254f;

/* renamed from: f2.c */
/* loaded from: classes.dex */
public final class C4251c extends AbstractC4254f.b {

    /* renamed from: a */
    public final long f14641a;

    /* renamed from: b */
    public final long f14642b;

    /* renamed from: c */
    public final Set f14643c;

    /* renamed from: f2.c$b */
    public static final class b extends AbstractC4254f.b.a {

        /* renamed from: a */
        public Long f14644a;

        /* renamed from: b */
        public Long f14645b;

        /* renamed from: c */
        public Set f14646c;

        @Override // p226f2.AbstractC4254f.b.a
        /* renamed from: a */
        public AbstractC4254f.b mo17841a() {
            Long l7 = this.f14644a;
            String str = StringUtils.EMPTY;
            if (l7 == null) {
                str = StringUtils.EMPTY + " delta";
            }
            if (this.f14645b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f14646c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C4251c(this.f14644a.longValue(), this.f14645b.longValue(), this.f14646c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p226f2.AbstractC4254f.b.a
        /* renamed from: b */
        public AbstractC4254f.b.a mo17842b(long j7) {
            this.f14644a = Long.valueOf(j7);
            return this;
        }

        @Override // p226f2.AbstractC4254f.b.a
        /* renamed from: c */
        public AbstractC4254f.b.a mo17843c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f14646c = set;
            return this;
        }

        @Override // p226f2.AbstractC4254f.b.a
        /* renamed from: d */
        public AbstractC4254f.b.a mo17844d(long j7) {
            this.f14645b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p226f2.AbstractC4254f.b
    /* renamed from: b */
    public long mo17838b() {
        return this.f14641a;
    }

    @Override // p226f2.AbstractC4254f.b
    /* renamed from: c */
    public Set mo17839c() {
        return this.f14643c;
    }

    @Override // p226f2.AbstractC4254f.b
    /* renamed from: d */
    public long mo17840d() {
        return this.f14642b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4254f.b)) {
            return false;
        }
        AbstractC4254f.b bVar = (AbstractC4254f.b) obj;
        return this.f14641a == bVar.mo17838b() && this.f14642b == bVar.mo17840d() && this.f14643c.equals(bVar.mo17839c());
    }

    public int hashCode() {
        long j7 = this.f14641a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        long j8 = this.f14642b;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f14643c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f14641a + ", maxAllowedDelay=" + this.f14642b + ", flags=" + this.f14643c + "}";
    }

    public C4251c(long j7, long j8, Set set) {
        this.f14641a = j7;
        this.f14642b = j8;
        this.f14643c = set;
    }
}
