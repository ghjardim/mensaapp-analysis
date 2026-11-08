package p163X1;

import java.util.Arrays;
import org.apache.tika.utils.StringUtils;
import p163X1.AbstractC2810l;

/* renamed from: X1.f */
/* loaded from: classes.dex */
public final class C2804f extends AbstractC2810l {

    /* renamed from: a */
    public final long f8602a;

    /* renamed from: b */
    public final Integer f8603b;

    /* renamed from: c */
    public final long f8604c;

    /* renamed from: d */
    public final byte[] f8605d;

    /* renamed from: e */
    public final String f8606e;

    /* renamed from: f */
    public final long f8607f;

    /* renamed from: g */
    public final AbstractC2813o f8608g;

    /* renamed from: X1.f$b */
    public static final class b extends AbstractC2810l.a {

        /* renamed from: a */
        public Long f8609a;

        /* renamed from: b */
        public Integer f8610b;

        /* renamed from: c */
        public Long f8611c;

        /* renamed from: d */
        public byte[] f8612d;

        /* renamed from: e */
        public String f8613e;

        /* renamed from: f */
        public Long f8614f;

        /* renamed from: g */
        public AbstractC2813o f8615g;

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: a */
        public AbstractC2810l mo10024a() {
            Long l7 = this.f8609a;
            String str = StringUtils.EMPTY;
            if (l7 == null) {
                str = StringUtils.EMPTY + " eventTimeMs";
            }
            if (this.f8611c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f8614f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C2804f(this.f8609a.longValue(), this.f8610b, this.f8611c.longValue(), this.f8612d, this.f8613e, this.f8614f.longValue(), this.f8615g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: b */
        public AbstractC2810l.a mo10025b(Integer num) {
            this.f8610b = num;
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: c */
        public AbstractC2810l.a mo10026c(long j7) {
            this.f8609a = Long.valueOf(j7);
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: d */
        public AbstractC2810l.a mo10027d(long j7) {
            this.f8611c = Long.valueOf(j7);
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: e */
        public AbstractC2810l.a mo10028e(AbstractC2813o abstractC2813o) {
            this.f8615g = abstractC2813o;
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: f */
        public AbstractC2810l.a mo10029f(byte[] bArr) {
            this.f8612d = bArr;
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: g */
        public AbstractC2810l.a mo10030g(String str) {
            this.f8613e = str;
            return this;
        }

        @Override // p163X1.AbstractC2810l.a
        /* renamed from: h */
        public AbstractC2810l.a mo10031h(long j7) {
            this.f8614f = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: b */
    public Integer mo10017b() {
        return this.f8603b;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: c */
    public long mo10018c() {
        return this.f8602a;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: d */
    public long mo10019d() {
        return this.f8604c;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: e */
    public AbstractC2813o mo10020e() {
        return this.f8608g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC2810l)) {
            return false;
        }
        AbstractC2810l abstractC2810l = (AbstractC2810l) obj;
        if (this.f8602a == abstractC2810l.mo10018c() && ((num = this.f8603b) != null ? num.equals(abstractC2810l.mo10017b()) : abstractC2810l.mo10017b() == null) && this.f8604c == abstractC2810l.mo10019d()) {
            if (Arrays.equals(this.f8605d, abstractC2810l instanceof C2804f ? ((C2804f) abstractC2810l).f8605d : abstractC2810l.mo10021f()) && ((str = this.f8606e) != null ? str.equals(abstractC2810l.mo10022g()) : abstractC2810l.mo10022g() == null) && this.f8607f == abstractC2810l.mo10023h()) {
                AbstractC2813o abstractC2813o = this.f8608g;
                if (abstractC2813o == null) {
                    if (abstractC2810l.mo10020e() == null) {
                        return true;
                    }
                } else if (abstractC2813o.equals(abstractC2810l.mo10020e())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: f */
    public byte[] mo10021f() {
        return this.f8605d;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: g */
    public String mo10022g() {
        return this.f8606e;
    }

    @Override // p163X1.AbstractC2810l
    /* renamed from: h */
    public long mo10023h() {
        return this.f8607f;
    }

    public int hashCode() {
        long j7 = this.f8602a;
        int i7 = (((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f8603b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j8 = this.f8604c;
        int hashCode2 = (((((i7 ^ hashCode) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f8605d)) * 1000003;
        String str = this.f8606e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j9 = this.f8607f;
        int i8 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003;
        AbstractC2813o abstractC2813o = this.f8608g;
        return i8 ^ (abstractC2813o != null ? abstractC2813o.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f8602a + ", eventCode=" + this.f8603b + ", eventUptimeMs=" + this.f8604c + ", sourceExtension=" + Arrays.toString(this.f8605d) + ", sourceExtensionJsonProto3=" + this.f8606e + ", timezoneOffsetSeconds=" + this.f8607f + ", networkConnectionInfo=" + this.f8608g + "}";
    }

    public C2804f(long j7, Integer num, long j8, byte[] bArr, String str, long j9, AbstractC2813o abstractC2813o) {
        this.f8602a = j7;
        this.f8603b = num;
        this.f8604c = j8;
        this.f8605d = bArr;
        this.f8606e = str;
        this.f8607f = j9;
        this.f8608g = abstractC2813o;
    }
}
