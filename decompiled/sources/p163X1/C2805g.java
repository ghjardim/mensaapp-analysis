package p163X1;

import java.util.List;
import org.apache.tika.utils.StringUtils;
import p163X1.AbstractC2811m;

/* renamed from: X1.g */
/* loaded from: classes.dex */
public final class C2805g extends AbstractC2811m {

    /* renamed from: a */
    public final long f8616a;

    /* renamed from: b */
    public final long f8617b;

    /* renamed from: c */
    public final AbstractC2809k f8618c;

    /* renamed from: d */
    public final Integer f8619d;

    /* renamed from: e */
    public final String f8620e;

    /* renamed from: f */
    public final List f8621f;

    /* renamed from: g */
    public final EnumC2814p f8622g;

    /* renamed from: X1.g$b */
    public static final class b extends AbstractC2811m.a {

        /* renamed from: a */
        public Long f8623a;

        /* renamed from: b */
        public Long f8624b;

        /* renamed from: c */
        public AbstractC2809k f8625c;

        /* renamed from: d */
        public Integer f8626d;

        /* renamed from: e */
        public String f8627e;

        /* renamed from: f */
        public List f8628f;

        /* renamed from: g */
        public EnumC2814p f8629g;

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: a */
        public AbstractC2811m mo10039a() {
            Long l7 = this.f8623a;
            String str = StringUtils.EMPTY;
            if (l7 == null) {
                str = StringUtils.EMPTY + " requestTimeMs";
            }
            if (this.f8624b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C2805g(this.f8623a.longValue(), this.f8624b.longValue(), this.f8625c, this.f8626d, this.f8627e, this.f8628f, this.f8629g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: b */
        public AbstractC2811m.a mo10040b(AbstractC2809k abstractC2809k) {
            this.f8625c = abstractC2809k;
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: c */
        public AbstractC2811m.a mo10041c(List list) {
            this.f8628f = list;
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: d */
        public AbstractC2811m.a mo10042d(Integer num) {
            this.f8626d = num;
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: e */
        public AbstractC2811m.a mo10043e(String str) {
            this.f8627e = str;
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: f */
        public AbstractC2811m.a mo10044f(EnumC2814p enumC2814p) {
            this.f8629g = enumC2814p;
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: g */
        public AbstractC2811m.a mo10045g(long j7) {
            this.f8623a = Long.valueOf(j7);
            return this;
        }

        @Override // p163X1.AbstractC2811m.a
        /* renamed from: h */
        public AbstractC2811m.a mo10046h(long j7) {
            this.f8624b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: b */
    public AbstractC2809k mo10032b() {
        return this.f8618c;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: c */
    public List mo10033c() {
        return this.f8621f;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: d */
    public Integer mo10034d() {
        return this.f8619d;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: e */
    public String mo10035e() {
        return this.f8620e;
    }

    public boolean equals(Object obj) {
        AbstractC2809k abstractC2809k;
        Integer num;
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2811m)) {
            return false;
        }
        AbstractC2811m abstractC2811m = (AbstractC2811m) obj;
        if (this.f8616a == abstractC2811m.mo10037g() && this.f8617b == abstractC2811m.mo10038h() && ((abstractC2809k = this.f8618c) != null ? abstractC2809k.equals(abstractC2811m.mo10032b()) : abstractC2811m.mo10032b() == null) && ((num = this.f8619d) != null ? num.equals(abstractC2811m.mo10034d()) : abstractC2811m.mo10034d() == null) && ((str = this.f8620e) != null ? str.equals(abstractC2811m.mo10035e()) : abstractC2811m.mo10035e() == null) && ((list = this.f8621f) != null ? list.equals(abstractC2811m.mo10033c()) : abstractC2811m.mo10033c() == null)) {
            EnumC2814p enumC2814p = this.f8622g;
            if (enumC2814p == null) {
                if (abstractC2811m.mo10036f() == null) {
                    return true;
                }
            } else if (enumC2814p.equals(abstractC2811m.mo10036f())) {
                return true;
            }
        }
        return false;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: f */
    public EnumC2814p mo10036f() {
        return this.f8622g;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: g */
    public long mo10037g() {
        return this.f8616a;
    }

    @Override // p163X1.AbstractC2811m
    /* renamed from: h */
    public long mo10038h() {
        return this.f8617b;
    }

    public int hashCode() {
        long j7 = this.f8616a;
        long j8 = this.f8617b;
        int i7 = (((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003;
        AbstractC2809k abstractC2809k = this.f8618c;
        int hashCode = (i7 ^ (abstractC2809k == null ? 0 : abstractC2809k.hashCode())) * 1000003;
        Integer num = this.f8619d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f8620e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f8621f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        EnumC2814p enumC2814p = this.f8622g;
        return hashCode4 ^ (enumC2814p != null ? enumC2814p.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f8616a + ", requestUptimeMs=" + this.f8617b + ", clientInfo=" + this.f8618c + ", logSource=" + this.f8619d + ", logSourceName=" + this.f8620e + ", logEvents=" + this.f8621f + ", qosTier=" + this.f8622g + "}";
    }

    public C2805g(long j7, long j8, AbstractC2809k abstractC2809k, Integer num, String str, List list, EnumC2814p enumC2814p) {
        this.f8616a = j7;
        this.f8617b = j8;
        this.f8618c = abstractC2809k;
        this.f8619d = num;
        this.f8620e = str;
        this.f8621f = list;
        this.f8622g = enumC2814p;
    }
}
