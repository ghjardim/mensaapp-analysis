package p253i5;

import java.util.Set;
import p171Y2.AbstractC2926i;
import p171Y2.AbstractC2928k;
import p178Z2.AbstractC3037z;

/* renamed from: i5.E0 */
/* loaded from: classes2.dex */
public final class C4554E0 {

    /* renamed from: a */
    public final int f16503a;

    /* renamed from: b */
    public final long f16504b;

    /* renamed from: c */
    public final long f16505c;

    /* renamed from: d */
    public final double f16506d;

    /* renamed from: e */
    public final Long f16507e;

    /* renamed from: f */
    public final Set f16508f;

    public C4554E0(int i7, long j7, long j8, double d7, Long l7, Set set) {
        this.f16503a = i7;
        this.f16504b = j7;
        this.f16505c = j8;
        this.f16506d = d7;
        this.f16507e = l7;
        this.f16508f = AbstractC3037z.m11106o(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4554E0)) {
            return false;
        }
        C4554E0 c4554e0 = (C4554E0) obj;
        return this.f16503a == c4554e0.f16503a && this.f16504b == c4554e0.f16504b && this.f16505c == c4554e0.f16505c && Double.compare(this.f16506d, c4554e0.f16506d) == 0 && AbstractC2928k.m10550a(this.f16507e, c4554e0.f16507e) && AbstractC2928k.m10550a(this.f16508f, c4554e0.f16508f);
    }

    public int hashCode() {
        return AbstractC2928k.m10551b(Integer.valueOf(this.f16503a), Long.valueOf(this.f16504b), Long.valueOf(this.f16505c), Double.valueOf(this.f16506d), this.f16507e, this.f16508f);
    }

    public String toString() {
        return AbstractC2926i.m10535c(this).m10538b("maxAttempts", this.f16503a).m10539c("initialBackoffNanos", this.f16504b).m10539c("maxBackoffNanos", this.f16505c).m10537a("backoffMultiplier", this.f16506d).m10540d("perAttemptRecvTimeoutNanos", this.f16507e).m10540d("retryableStatusCodes", this.f16508f).toString();
    }
}
