package p234g2;

import org.apache.tika.utils.StringUtils;
import p234g2.AbstractC4372e;

/* renamed from: g2.a */
/* loaded from: classes.dex */
public final class C4368a extends AbstractC4372e {

    /* renamed from: b */
    public final long f15544b;

    /* renamed from: c */
    public final int f15545c;

    /* renamed from: d */
    public final int f15546d;

    /* renamed from: e */
    public final long f15547e;

    /* renamed from: f */
    public final int f15548f;

    /* renamed from: g2.a$b */
    public static final class b extends AbstractC4372e.a {

        /* renamed from: a */
        public Long f15549a;

        /* renamed from: b */
        public Integer f15550b;

        /* renamed from: c */
        public Integer f15551c;

        /* renamed from: d */
        public Long f15552d;

        /* renamed from: e */
        public Integer f15553e;

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: a */
        public AbstractC4372e mo18589a() {
            Long l7 = this.f15549a;
            String str = StringUtils.EMPTY;
            if (l7 == null) {
                str = StringUtils.EMPTY + " maxStorageSizeInBytes";
            }
            if (this.f15550b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f15551c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f15552d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f15553e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C4368a(this.f15549a.longValue(), this.f15550b.intValue(), this.f15551c.intValue(), this.f15552d.longValue(), this.f15553e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: b */
        public AbstractC4372e.a mo18590b(int i7) {
            this.f15551c = Integer.valueOf(i7);
            return this;
        }

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: c */
        public AbstractC4372e.a mo18591c(long j7) {
            this.f15552d = Long.valueOf(j7);
            return this;
        }

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: d */
        public AbstractC4372e.a mo18592d(int i7) {
            this.f15550b = Integer.valueOf(i7);
            return this;
        }

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: e */
        public AbstractC4372e.a mo18593e(int i7) {
            this.f15553e = Integer.valueOf(i7);
            return this;
        }

        @Override // p234g2.AbstractC4372e.a
        /* renamed from: f */
        public AbstractC4372e.a mo18594f(long j7) {
            this.f15549a = Long.valueOf(j7);
            return this;
        }
    }

    @Override // p234g2.AbstractC4372e
    /* renamed from: b */
    public int mo18584b() {
        return this.f15546d;
    }

    @Override // p234g2.AbstractC4372e
    /* renamed from: c */
    public long mo18585c() {
        return this.f15547e;
    }

    @Override // p234g2.AbstractC4372e
    /* renamed from: d */
    public int mo18586d() {
        return this.f15545c;
    }

    @Override // p234g2.AbstractC4372e
    /* renamed from: e */
    public int mo18587e() {
        return this.f15548f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4372e)) {
            return false;
        }
        AbstractC4372e abstractC4372e = (AbstractC4372e) obj;
        return this.f15544b == abstractC4372e.mo18588f() && this.f15545c == abstractC4372e.mo18586d() && this.f15546d == abstractC4372e.mo18584b() && this.f15547e == abstractC4372e.mo18585c() && this.f15548f == abstractC4372e.mo18587e();
    }

    @Override // p234g2.AbstractC4372e
    /* renamed from: f */
    public long mo18588f() {
        return this.f15544b;
    }

    public int hashCode() {
        long j7 = this.f15544b;
        int i7 = (((((((int) (j7 ^ (j7 >>> 32))) ^ 1000003) * 1000003) ^ this.f15545c) * 1000003) ^ this.f15546d) * 1000003;
        long j8 = this.f15547e;
        return ((i7 ^ ((int) ((j8 >>> 32) ^ j8))) * 1000003) ^ this.f15548f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f15544b + ", loadBatchSize=" + this.f15545c + ", criticalSectionEnterTimeoutMs=" + this.f15546d + ", eventCleanUpAge=" + this.f15547e + ", maxBlobByteSizePerRow=" + this.f15548f + "}";
    }

    public C4368a(long j7, int i7, int i8, long j8, int i9) {
        this.f15544b = j7;
        this.f15545c = i7;
        this.f15546d = i8;
        this.f15547e = j8;
        this.f15548f = i9;
    }
}
