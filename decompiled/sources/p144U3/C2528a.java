package p144U3;

import org.apache.tika.utils.StringUtils;
import p144U3.AbstractC2540m;

/* renamed from: U3.a */
/* loaded from: classes.dex */
public final class C2528a extends AbstractC2540m {

    /* renamed from: a */
    public final String f7373a;

    /* renamed from: b */
    public final long f7374b;

    /* renamed from: c */
    public final long f7375c;

    /* renamed from: U3.a$b */
    public static final class b extends AbstractC2540m.a {

        /* renamed from: a */
        public String f7376a;

        /* renamed from: b */
        public Long f7377b;

        /* renamed from: c */
        public Long f7378c;

        @Override // p144U3.AbstractC2540m.a
        /* renamed from: a */
        public AbstractC2540m mo8478a() {
            String str = this.f7376a;
            String str2 = StringUtils.EMPTY;
            if (str == null) {
                str2 = StringUtils.EMPTY + " token";
            }
            if (this.f7377b == null) {
                str2 = str2 + " tokenExpirationTimestamp";
            }
            if (this.f7378c == null) {
                str2 = str2 + " tokenCreationTimestamp";
            }
            if (str2.isEmpty()) {
                return new C2528a(this.f7376a, this.f7377b.longValue(), this.f7378c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override // p144U3.AbstractC2540m.a
        /* renamed from: b */
        public AbstractC2540m.a mo8479b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f7376a = str;
            return this;
        }

        @Override // p144U3.AbstractC2540m.a
        /* renamed from: c */
        public AbstractC2540m.a mo8480c(long j7) {
            this.f7378c = Long.valueOf(j7);
            return this;
        }

        @Override // p144U3.AbstractC2540m.a
        /* renamed from: d */
        public AbstractC2540m.a mo8481d(long j7) {
            this.f7377b = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p144U3.AbstractC2540m
    /* renamed from: b */
    public String mo8475b() {
        return this.f7373a;
    }

    @Override // p144U3.AbstractC2540m
    /* renamed from: c */
    public long mo8476c() {
        return this.f7375c;
    }

    @Override // p144U3.AbstractC2540m
    /* renamed from: d */
    public long mo8477d() {
        return this.f7374b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2540m)) {
            return false;
        }
        AbstractC2540m abstractC2540m = (AbstractC2540m) obj;
        return this.f7373a.equals(abstractC2540m.mo8475b()) && this.f7374b == abstractC2540m.mo8477d() && this.f7375c == abstractC2540m.mo8476c();
    }

    public int hashCode() {
        int hashCode = (this.f7373a.hashCode() ^ 1000003) * 1000003;
        long j7 = this.f7374b;
        long j8 = this.f7375c;
        return ((hashCode ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f7373a + ", tokenExpirationTimestamp=" + this.f7374b + ", tokenCreationTimestamp=" + this.f7375c + "}";
    }

    public C2528a(String str, long j7, long j8) {
        this.f7373a = str;
        this.f7374b = j7;
        this.f7375c = j8;
    }
}
