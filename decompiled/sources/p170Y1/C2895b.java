package p170Y1;

import java.util.Map;
import org.apache.tika.utils.StringUtils;
import p170Y1.AbstractC2902i;

/* renamed from: Y1.b */
/* loaded from: classes.dex */
public final class C2895b extends AbstractC2902i {

    /* renamed from: a */
    public final String f8928a;

    /* renamed from: b */
    public final Integer f8929b;

    /* renamed from: c */
    public final C2901h f8930c;

    /* renamed from: d */
    public final long f8931d;

    /* renamed from: e */
    public final long f8932e;

    /* renamed from: f */
    public final Map f8933f;

    /* renamed from: Y1.b$b */
    public static final class b extends AbstractC2902i.a {

        /* renamed from: a */
        public String f8934a;

        /* renamed from: b */
        public Integer f8935b;

        /* renamed from: c */
        public C2901h f8936c;

        /* renamed from: d */
        public Long f8937d;

        /* renamed from: e */
        public Long f8938e;

        /* renamed from: f */
        public Map f8939f;

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: d */
        public AbstractC2902i mo10436d() {
            String str = this.f8934a;
            String str2 = StringUtils.EMPTY;
            if (str == null) {
                str2 = StringUtils.EMPTY + " transportName";
            }
            if (this.f8936c == null) {
                str2 = str2 + " encodedPayload";
            }
            if (this.f8937d == null) {
                str2 = str2 + " eventMillis";
            }
            if (this.f8938e == null) {
                str2 = str2 + " uptimeMillis";
            }
            if (this.f8939f == null) {
                str2 = str2 + " autoMetadata";
            }
            if (str2.isEmpty()) {
                return new C2895b(this.f8934a, this.f8935b, this.f8936c, this.f8937d.longValue(), this.f8938e.longValue(), this.f8939f);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: e */
        public Map mo10437e() {
            Map map = this.f8939f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: f */
        public AbstractC2902i.a mo10438f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f8939f = map;
            return this;
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: g */
        public AbstractC2902i.a mo10439g(Integer num) {
            this.f8935b = num;
            return this;
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: h */
        public AbstractC2902i.a mo10440h(C2901h c2901h) {
            if (c2901h == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f8936c = c2901h;
            return this;
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: i */
        public AbstractC2902i.a mo10441i(long j7) {
            this.f8937d = Long.valueOf(j7);
            return this;
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: j */
        public AbstractC2902i.a mo10442j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f8934a = str;
            return this;
        }

        @Override // p170Y1.AbstractC2902i.a
        /* renamed from: k */
        public AbstractC2902i.a mo10443k(long j7) {
            this.f8938e = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: c */
    public Map mo10430c() {
        return this.f8933f;
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: d */
    public Integer mo10431d() {
        return this.f8929b;
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: e */
    public C2901h mo10432e() {
        return this.f8930c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2902i)) {
            return false;
        }
        AbstractC2902i abstractC2902i = (AbstractC2902i) obj;
        return this.f8928a.equals(abstractC2902i.mo10434j()) && ((num = this.f8929b) != null ? num.equals(abstractC2902i.mo10431d()) : abstractC2902i.mo10431d() == null) && this.f8930c.equals(abstractC2902i.mo10432e()) && this.f8931d == abstractC2902i.mo10433f() && this.f8932e == abstractC2902i.mo10435k() && this.f8933f.equals(abstractC2902i.mo10430c());
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: f */
    public long mo10433f() {
        return this.f8931d;
    }

    public int hashCode() {
        int hashCode = (this.f8928a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f8929b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f8930c.hashCode()) * 1000003;
        long j7 = this.f8931d;
        int i7 = (hashCode2 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        long j8 = this.f8932e;
        return ((i7 ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ this.f8933f.hashCode();
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: j */
    public String mo10434j() {
        return this.f8928a;
    }

    @Override // p170Y1.AbstractC2902i
    /* renamed from: k */
    public long mo10435k() {
        return this.f8932e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f8928a + ", code=" + this.f8929b + ", encodedPayload=" + this.f8930c + ", eventMillis=" + this.f8931d + ", uptimeMillis=" + this.f8932e + ", autoMetadata=" + this.f8933f + "}";
    }

    public C2895b(String str, Integer num, C2901h c2901h, long j7, long j8, Map map) {
        this.f8928a = str;
        this.f8929b = num;
        this.f8930c = c2901h;
        this.f8931d = j7;
        this.f8932e = j8;
        this.f8933f = map;
    }
}
